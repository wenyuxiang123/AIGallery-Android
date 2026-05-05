package com.google.ai.edge.gallery.p006ui.common;

import android.graphics.RuntimeShader;
import android.os.Build;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.BrushKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ShaderBrush;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableDoubleState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotDoubleStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.p013ws.WebSocketProtocol;

/* JADX INFO: compiled from: AudioAnimation.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\u001a)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u000eX\u008a\u008e\u0002"}, m922d2 = {"SHADER", "", "AudioAnimation", "", "bgColor", "Landroidx/compose/ui/graphics/Color;", "amplitude", "", "modifier", "Landroidx/compose/ui/Modifier;", "AudioAnimation-KTwxG1Y", "(JILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "iTime", "", "curPOffset", "prevNormalizedAmplitude", "", "animatedAmplitude"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class AudioAnimationKt {
    private static final String SHADER = "\n// The size of the render area.\nuniform float2 iResolution;\n// The color of the background to render the wave on.\nuniform vec4 bgColor;\n// Current timestamp in seconds.\nuniform float iTime;\n// The amplitude of the sound to be visualized.\n// From 0 to 1.\nuniform float amplitude;\n// The extra offset for 1d perlin noise.\nuniform float pOffset;\n\n// Creates a gradient that blends four different colors based on a uv coordinate and animated\n// over time.\nvec3 mix4(vec3 color1, vec3 color2, vec3 color3, vec3 color4, vec2 uv){\n  float sinTime1 = sin(iTime / 1.6);\n  float sinTime2 = sin(iTime / 1.8);\n  return mix(\n    mix(color1, color2, smoothstep(0.0 + sinTime1 * 0.1, 0.24 + sinTime1 * 0.1, uv.y)),\n    mix(color3, color4, smoothstep(-0.16 - sinTime2 * 0.1, 0.24 - sinTime2 * 0.1, uv.y)),\n    smoothstep(0.0, 0.7 + sinTime1 * 0.1, uv.x));\n}\n\nfloat hash(float i) {\n\tfloat h = i * 127.1;\n\tfloat p = -1. + 2. * fract(sin(h) * 43758.1453123);\n  return p;\n}\n\nfloat perlin_noise_1d(float d) {\n  float i = floor(d);\n  float f = d - i;\n\n  float y = f*f*f* (6. * f*f - 15. * f + 10.);\n\n  float slope1 = hash(i);\n  float slope2 = hash(i + 1.0);\n  float v1 = f;\n  float v2 = f - 1.0;\n\n  float r = mix(slope1 * v1, slope2 * v2, y);\n  r = r * 0.5 + 0.5;\n  return r;\n}\n\nhalf4 main(float2 fragCoord) {\n  float2 uv = fragCoord/iResolution.xy;\n  uv.y = 1.0 - uv.y;\n\n  // Add a wavy distortion to the y-coordinate of the uv.\n  //\n  // Control the amplitude of the wave\n  float wave_strength = 0.036;\n  // Control the speed of the wave\n  float wave_speed = 1.2;\n  // Control the frequency of the wave\n  float wave_frequency = 4.0;\n\n  // Idle.\n  if (amplitude == 0.) {\n    uv.y += sin(uv.x * wave_frequency + -iTime * wave_speed) * wave_strength;\n  }\n  // Visualizing amplitude by sampling the 1d perlin noise at the given offset.\n  else {\n    uv.y -= perlin_noise_1d(pOffset + uv.x * 3.) * amplitude / 2.0;\n  }\n\n  vec3 col = mix4(\n    vec3(0.992, 0.875, 0.522),  // yellow\n    vec3(0.627, 0.816, 0.686),  // green\n    vec3(0.886, 0.372, 0.341),  // red\n    vec3(0.522, 0.694, 0.973),  // blue\n    uv);\n\n  // Define the fade parameters\n  float fade_start = 0.24;\n  float fade_end = 0.34;\n\n  // Calculate the blend factor using smoothstep for a smooth transition\n  float fade_factor = smoothstep(fade_start, fade_end, uv.y);\n\n  // Blend the base color with background color using the fade factor\n  vec4 final_color = mix(vec4(col, 1.0), bgColor, fade_factor);\n\n  return vec4(half3(final_color.xyz) * (1 + amplitude * 0.2), final_color.a);\n}\n";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioAnimation_KTwxG1Y$lambda$18(long j, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        m10823AudioAnimationKTwxG1Y(j, i, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: AudioAnimation-KTwxG1Y, reason: not valid java name */
    public static final void m10823AudioAnimationKTwxG1Y(final long bgColor, final int amplitude, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Modifier modifier3;
        int i2;
        Composer $composer2 = $composer.startRestartGroup(1053441125);
        ComposerKt.sourceInformation($composer2, "C(AudioAnimation)P(1:c#ui.graphics.Color):AudioAnimation.kt#t7sjiu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(bgColor) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(amplitude) ? 32 : 16;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if (!$composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier.Companion modifier4 = i3 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1053441125, $dirty, -1, "com.google.ai.edge.gallery.ui.common.AudioAnimation (AudioAnimation.kt:137)");
            }
            if (Build.VERSION.SDK_INT >= 33) {
                $composer2.startReplaceGroup(-261254756);
                ComposerKt.sourceInformation($composer2, "139@4581L34,140@4638L32,141@4688L36,142@4747L36,143@4819L38,146@5018L63,150@5261L266,150@5235L292,161@5603L107,161@5582L128,168@5781L922,168@5739L964");
                ComposerKt.sourceInformationMarkerStart($composer2, -1255355065, "CC(remember):AudioAnimation.kt#9igjgp");
                Object it$iv = $composer2.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new RuntimeShader(SHADER);
                    $composer2.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                final RuntimeShader shader = (RuntimeShader) it$iv;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -1255353243, "CC(remember):AudioAnimation.kt#9igjgp");
                Object it$iv2 = $composer2.rememberedValue();
                if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv2 = BrushKt.ShaderBrush(shader);
                    $composer2.updateRememberedValue(value$iv2);
                    it$iv2 = value$iv2;
                }
                final ShaderBrush shaderBrush = (ShaderBrush) it$iv2;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -1255351639, "CC(remember):AudioAnimation.kt#9igjgp");
                Object it$iv3 = $composer2.rememberedValue();
                if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    $composer2.updateRememberedValue(value$iv3);
                    it$iv3 = value$iv3;
                }
                final MutableFloatState iTime$delegate = (MutableFloatState) it$iv3;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -1255349751, "CC(remember):AudioAnimation.kt#9igjgp");
                Object it$iv4 = $composer2.rememberedValue();
                if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    $composer2.updateRememberedValue(value$iv4);
                    it$iv4 = value$iv4;
                }
                final MutableFloatState curPOffset$delegate = (MutableFloatState) it$iv4;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -1255347445, "CC(remember):AudioAnimation.kt#9igjgp");
                Object it$iv5 = $composer2.rememberedValue();
                if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv5 = SnapshotDoubleStateKt.mutableDoubleStateOf(AudioStats.AUDIO_AMPLITUDE_NONE);
                    $composer2.updateRememberedValue(value$iv5);
                    it$iv5 = value$iv5;
                }
                final MutableDoubleState prevNormalizedAmplitude$delegate = (MutableDoubleState) it$iv5;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                final double normalizedAmplitude = Math.pow(((double) amplitude) / 32767.0d, 0.5d);
                ComposerKt.sourceInformationMarkerStart($composer2, -1255341052, "CC(remember):AudioAnimation.kt#9igjgp");
                Object it$iv6 = $composer2.rememberedValue();
                if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv6 = PrimitiveSnapshotStateKt.mutableFloatStateOf((float) normalizedAmplitude);
                    $composer2.updateRememberedValue(value$iv6);
                    it$iv6 = value$iv6;
                }
                final MutableFloatState animatedAmplitude$delegate = (MutableFloatState) it$iv6;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                Integer numValueOf = Integer.valueOf(amplitude);
                ComposerKt.sourceInformationMarkerStart($composer2, -1255333073, "CC(remember):AudioAnimation.kt#9igjgp");
                boolean invalid$iv = $composer2.changed(normalizedAmplitude);
                AudioAnimationKt$AudioAnimation$1$1 value$iv7 = $composer2.rememberedValue();
                if (invalid$iv || value$iv7 == Composer.INSTANCE.getEmpty()) {
                    value$iv7 = new AudioAnimationKt$AudioAnimation$1$1(normalizedAmplitude, animatedAmplitude$delegate, null);
                    $composer2.updateRememberedValue(value$iv7);
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) value$iv7, $composer2, ($dirty >> 3) & 14);
                Unit unit = Unit.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer2, -1255322288, "CC(remember):AudioAnimation.kt#9igjgp");
                Object it$iv7 = $composer2.rememberedValue();
                if (it$iv7 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv8 = (Function2) new AudioAnimationKt$AudioAnimation$2$1(iTime$delegate, null);
                    $composer2.updateRememberedValue(value$iv8);
                    it$iv7 = value$iv8;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv7, $composer2, 6);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer2, -1255315777, "CC(remember):AudioAnimation.kt#9igjgp");
                boolean invalid$iv2 = $composer2.changed(normalizedAmplitude) | $composer2.changedInstance(shader) | (($dirty & 14) == 4);
                Object value$iv9 = $composer2.rememberedValue();
                if (invalid$iv2 || value$iv9 == Composer.INSTANCE.getEmpty()) {
                    i2 = 0;
                    value$iv9 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.AudioAnimationKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AudioAnimationKt.AudioAnimation_KTwxG1Y$lambda$17$lambda$16(normalizedAmplitude, shader, bgColor, shaderBrush, prevNormalizedAmplitude$delegate, curPOffset$delegate, iTime$delegate, animatedAmplitude$delegate, (DrawScope) obj);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv9);
                } else {
                    i2 = 0;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) value$iv9, $composer2, i2);
            } else {
                $composer2.startReplaceGroup(-265847747);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.AudioAnimationKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AudioAnimationKt.AudioAnimation_KTwxG1Y$lambda$18(bgColor, amplitude, modifier5, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float AudioAnimation_KTwxG1Y$lambda$3(MutableFloatState $iTime$delegate) {
        MutableFloatState $this$getValue$iv = $iTime$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private static final float AudioAnimation_KTwxG1Y$lambda$6(MutableFloatState $curPOffset$delegate) {
        MutableFloatState $this$getValue$iv = $curPOffset$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private static final double AudioAnimation_KTwxG1Y$lambda$9(MutableDoubleState $prevNormalizedAmplitude$delegate) {
        MutableDoubleState $this$getValue$iv = $prevNormalizedAmplitude$delegate;
        return $this$getValue$iv.getDoubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AudioAnimation_KTwxG1Y$lambda$12(MutableFloatState $animatedAmplitude$delegate) {
        MutableFloatState $this$getValue$iv = $animatedAmplitude$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioAnimation_KTwxG1Y$lambda$17$lambda$16(double $normalizedAmplitude, RuntimeShader $shader, long $bgColor, ShaderBrush $shaderBrush, MutableDoubleState $prevNormalizedAmplitude$delegate, MutableFloatState $curPOffset$delegate, MutableFloatState $iTime$delegate, MutableFloatState $animatedAmplitude$delegate, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        if ($normalizedAmplitude < 0.2d && AudioAnimation_KTwxG1Y$lambda$9($prevNormalizedAmplitude$delegate) >= 0.2d) {
            $curPOffset$delegate.setFloatValue(Random.INSTANCE.nextFloat() * 1000.0f);
        }
        $prevNormalizedAmplitude$delegate.setDoubleValue($normalizedAmplitude);
        $shader.setFloatUniform("iTime", AudioAnimation_KTwxG1Y$lambda$3($iTime$delegate));
        int bits$iv$iv$iv = (int) (Canvas.mo7496getSizeNHjbRc() >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (4294967295L & Canvas.mo7496getSizeNHjbRc());
        $shader.setFloatUniform("iResolution", fIntBitsToFloat, Float.intBitsToFloat(bits$iv$iv$iv2));
        $shader.setFloatUniform("bgColor", Color.m6921getRedimpl($bgColor), Color.m6920getGreenimpl($bgColor), Color.m6918getBlueimpl($bgColor), Color.m6917getAlphaimpl($bgColor));
        $shader.setFloatUniform("amplitude", AudioAnimation_KTwxG1Y$lambda$12($animatedAmplitude$delegate));
        $shader.setFloatUniform("pOffset", AudioAnimation_KTwxG1Y$lambda$6($curPOffset$delegate));
        DrawScope.m7489drawRectAsUm42w$default(Canvas, $shaderBrush, 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
        return Unit.INSTANCE;
    }
}
