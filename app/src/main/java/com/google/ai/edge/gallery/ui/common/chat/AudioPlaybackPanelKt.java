package com.google.ai.edge.gallery.ui.common.chat;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.util.Log;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.PlayArrowKt;
import androidx.compose.material.icons.rounded.StopKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.geometry.CornerRadius;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.geometry.Size;
import androidx.compose.p000ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p000ui.graphics.BlendMode;
import androidx.compose.p000ui.graphics.Canvas;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.app.NotificationCompat;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.ui.theme.ThemeKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: AudioPlaybackPanel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a9\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0017\u001aP\u0010\u0018\u001a\u00020\b2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001fH\u0082@¢\u0006\u0002\u0010 \u001a\u0018\u0010!\u001a\u00020\b2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aH\u0002\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006$²\u0006\n\u0010%\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u0015X\u008a\u008e\u0002"}, m922d2 = {"TAG", "", "BAR_SPACE", "", "BAR_WIDTH", "MIN_BAR_COUNT", "MAX_BAR_COUNT", "AudioPlaybackPanel", "", "audioData", "", "sampleRate", "isRecording", "", "modifier", "Landroidx/compose/ui/Modifier;", "onDarkBg", "([BIZLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "AmplitudeBarGraph", "amplitudeLevels", "", "", NotificationCompat.CATEGORY_PROGRESS, "(Ljava/util/List;FLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "playAudio", "audioTrackState", "Landroidx/compose/runtime/MutableState;", "Landroid/media/AudioTrack;", "onProgress", "Lkotlin/Function1;", "onCompletion", "Lkotlin/Function0;", "(Landroidx/compose/runtime/MutableState;[BILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopPlayAudio", "generateAmplitudeLevels", "barCount", "app_debug", "isPlaying", "playbackProgress"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 48)
public final class AudioPlaybackPanelKt {
    private static final int BAR_SPACE = 2;
    private static final int BAR_WIDTH = 2;
    private static final int MAX_BAR_COUNT = 48;
    private static final int MIN_BAR_COUNT = 16;
    private static final String TAG = "AGAudioPlaybackPanel";

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$playAudio$1 */
    /* JADX INFO: compiled from: AudioPlaybackPanel.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = 48)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt", m932f = "AudioPlaybackPanel.kt", m933i = {0, 0, 0, 0, 0}, m934l = {236}, m935m = "playAudio", m936n = {"audioTrackState", "audioData", "onProgress", "onCompletion", "sampleRate"}, m938s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
    static final class C26811 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C26811(Continuation<? super C26811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AudioPlaybackPanelKt.playAudio(null, null, 0, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AmplitudeBarGraph$lambda$23(List list, float f, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        AmplitudeBarGraph(list, f, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioPlaybackPanel$lambda$18(byte[] bArr, int i, boolean z, Modifier modifier, boolean z2, int i2, int i3, Composer composer, int i4) {
        AudioPlaybackPanel(bArr, i, z, modifier, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void AudioPlaybackPanel(final byte[] audioData, final int sampleRate, final boolean isRecording, Modifier modifier, boolean onDarkBg, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean z;
        final boolean onDarkBg2;
        boolean onDarkBg3;
        double durationInSeconds;
        Function0<ComposeUiNode> function0;
        int $dirty;
        Composer $composer2;
        Composer $composer$iv$iv$iv;
        final MutableState isPlaying$delegate;
        Composer $composer$iv;
        Composer $composer$iv2;
        long onSurfaceVariant;
        Intrinsics.checkNotNullParameter(audioData, "audioData");
        Composer $composer3 = $composer.startRestartGroup(612494923);
        ComposerKt.sourceInformation($composer3, "C(AudioPlaybackPanel)P(!1,4)83@3165L24,84@3209L34,85@3268L46,87@3345L226,95@3593L165,100@3787L91,101@3905L36,104@4017L156,104@3989L184,114@4237L125,114@4214L148,122@4366L1628:AudioPlaybackPanel.kt#ouynps");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changedInstance(audioData) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changed(sampleRate) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changed(isRecording) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty2 |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 16;
        if (i3 != 0) {
            $dirty2 |= 24576;
            z = onDarkBg;
        } else if (($changed & 24576) == 0) {
            z = onDarkBg;
            $dirty2 |= $composer3.changed(z) ? 16384 : 8192;
        } else {
            z = onDarkBg;
        }
        if ($composer3.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            Modifier modifier3 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            boolean onDarkBg4 = i3 != 0 ? false : z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(612494923, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanel (AudioPlaybackPanel.kt:82)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object it$iv$iv = $composer3.rememberedValue();
            if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(value$iv$iv);
                it$iv$iv = value$iv$iv;
            }
            final CoroutineScope coroutineScope = (CoroutineScope) it$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 197109037, "CC(remember):AudioPlaybackPanel.kt#9igjgp");
            Object it$iv = $composer3.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            MutableState isPlaying$delegate2 = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 197110937, "CC(remember):AudioPlaybackPanel.kt#9igjgp");
            Object it$iv2 = $composer3.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                onDarkBg3 = onDarkBg4;
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            } else {
                onDarkBg3 = onDarkBg4;
            }
            final MutableState audioTrackState = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 197113581, "CC(remember):AudioPlaybackPanel.kt#9igjgp");
            boolean invalid$iv = $composer3.changed(audioData);
            Object it$iv3 = $composer3.rememberedValue();
            if (invalid$iv || it$iv3 == Composer.INSTANCE.getEmpty()) {
                int bytesPerFrame = 2 * 1;
                double totalFrames = ((double) audioData.length) / ((double) bytesPerFrame);
                Object value$iv3 = Double.valueOf(totalFrames / ((double) sampleRate));
                $composer3.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            double durationInSeconds2 = ((Number) it$iv3).doubleValue();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 197121456, "CC(remember):AudioPlaybackPanel.kt#9igjgp");
            boolean invalid$iv2 = $composer3.changed(durationInSeconds2);
            Object it$iv4 = $composer3.rememberedValue();
            if (invalid$iv2 || it$iv4 == Composer.INSTANCE.getEmpty()) {
                double f = durationInSeconds2 / ((double) 30);
                double d = ((double) 32) * f;
                double f2 = 16;
                Object value$iv4 = Integer.valueOf((int) (d + f2));
                $composer3.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            }
            int barCount = ((Number) it$iv4).intValue();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 197127590, "CC(remember):AudioPlaybackPanel.kt#9igjgp");
            boolean invalid$iv3 = $composer3.changed(audioData);
            Object it$iv5 = $composer3.rememberedValue();
            if (invalid$iv3 || it$iv5 == Composer.INSTANCE.getEmpty()) {
                Object value$iv5 = generateAmplitudeLevels(audioData, barCount);
                $composer3.updateRememberedValue(value$iv5);
                it$iv5 = value$iv5;
            }
            List amplitudeLevels = (List) it$iv5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 197131311, "CC(remember):AudioPlaybackPanel.kt#9igjgp");
            Object it$iv6 = $composer3.rememberedValue();
            if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                Object value$iv6 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                $composer3.updateRememberedValue(value$iv6);
                it$iv6 = value$iv6;
            }
            final MutableFloatState playbackProgress$delegate = (MutableFloatState) it$iv6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Boolean boolValueOf = Boolean.valueOf(isRecording);
            ComposerKt.sourceInformationMarkerStart($composer3, 197135015, "CC(remember):AudioPlaybackPanel.kt#9igjgp");
            boolean invalid$iv4 = ($dirty2 & 896) == 256;
            Object value$iv7 = $composer3.rememberedValue();
            if (invalid$iv4 || value$iv7 == Composer.INSTANCE.getEmpty()) {
                durationInSeconds = durationInSeconds2;
                value$iv7 = new AudioPlaybackPanelKt$AudioPlaybackPanel$1$1(isRecording, audioTrackState, isPlaying$delegate2, playbackProgress$delegate, null);
                $composer3.updateRememberedValue(value$iv7);
            } else {
                durationInSeconds = durationInSeconds2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) value$iv7, $composer3, ($dirty2 >> 6) & 14);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 197142024, "CC(remember):AudioPlaybackPanel.kt#9igjgp");
            Object it$iv7 = $composer3.rememberedValue();
            if (it$iv7 == Composer.INSTANCE.getEmpty()) {
                Object value$iv8 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AudioPlaybackPanelKt.AudioPlaybackPanel$lambda$13$lambda$12(audioTrackState, (DisposableEffectScope) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv8);
                it$iv7 = value$iv8;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) it$iv7, $composer3, 54);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            int $changed$iv = (($dirty2 >> 9) & 14) | 384;
            Modifier modifier$iv = modifier3;
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
            int $changed$iv$iv = ($changed$iv << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor;
                $composer3.createNode(function0);
            } else {
                function0 = constructor;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i5 = (($changed$iv >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -540330704, "C125@4510L600,146@5117L339,124@4482L974,158@5483L238,169@5823L10,167@5743L247:AudioPlaybackPanel.kt#ouynps");
            ComposerKt.sourceInformationMarkerStart($composer3, 1922232615, "CC(remember):AudioPlaybackPanel.kt#9igjgp");
            boolean invalid$iv5 = $composer3.changedInstance(coroutineScope) | $composer3.changedInstance(audioData) | (($dirty2 & 112) == 32);
            Object value$iv9 = $composer3.rememberedValue();
            if (invalid$iv5 || value$iv9 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                $composer2 = $composer3;
                $composer$iv$iv$iv = $composer3;
                isPlaying$delegate = isPlaying$delegate2;
                $composer$iv = $composer3;
                onDarkBg2 = onDarkBg3;
                $composer$iv2 = $composer3;
                value$iv9 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AudioPlaybackPanelKt.AudioPlaybackPanel$lambda$17$lambda$15$lambda$14(coroutineScope, audioTrackState, audioData, sampleRate, isPlaying$delegate, playbackProgress$delegate);
                    }
                };
                $composer3.updateRememberedValue(value$iv9);
            } else {
                onDarkBg2 = onDarkBg3;
                $composer$iv2 = $composer3;
                $dirty = $dirty2;
                $composer2 = $composer3;
                isPlaying$delegate = isPlaying$delegate2;
                $composer$iv$iv$iv = $composer3;
                $composer$iv = $composer3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final MutableState isPlaying$delegate3 = isPlaying$delegate;
            Composer $composer4 = $composer2;
            IconButtonKt.IconButton((Function0) value$iv9, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(605707725, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AudioPlaybackPanelKt.AudioPlaybackPanel$lambda$17$lambda$16(onDarkBg2, isPlaying$delegate3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer4, 54), $composer4, 1572864, 62);
            int $this$dp$iv = (barCount * 2) + ((barCount - 1) * 2);
            AmplitudeBarGraph(amplitudeLevels, AudioPlaybackPanel$lambda$8(playbackProgress$delegate), SizeKt.m2022height3ABfNKs(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl($this$dp$iv)), C1654Dp.m9788constructorimpl(24)), onDarkBg2, $composer4, ($dirty >> 3) & 7168, 0);
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(durationInSeconds)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            String str2 = str + "s";
            TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography($composer4, MaterialTheme.$stable).getLabelLarge();
            if (onDarkBg2) {
                $composer4.startReplaceGroup(1922275860);
                $composer4.endReplaceGroup();
                onSurfaceVariant = Color.INSTANCE.m6952getWhite0d7_KjU();
            } else {
                $composer4.startReplaceGroup(1922277055);
                ComposerKt.sourceInformation($composer4, "170@5905L11");
                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer4, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer4.endReplaceGroup();
            }
            TextKt.m4781TextNvy7gAk(str2, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), onSurfaceVariant, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelLarge, $composer4, 48, 0, 131064);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            $composer$iv$iv$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            $composer3.skipToGroupEnd();
            onDarkBg2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final boolean z2 = onDarkBg2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AudioPlaybackPanelKt.AudioPlaybackPanel$lambda$18(audioData, sampleRate, isRecording, modifier4, z2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioPlaybackPanel$lambda$1(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioPlaybackPanel$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final float AudioPlaybackPanel$lambda$8(MutableFloatState $playbackProgress$delegate) {
        MutableFloatState $this$getValue$iv = $playbackProgress$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult AudioPlaybackPanel$lambda$13$lambda$12(final MutableState $audioTrackState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$AudioPlaybackPanel$lambda$13$lambda$12$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                AudioTrack audioTrack = (AudioTrack) $audioTrackState.getValue();
                if (audioTrack != null) {
                    audioTrack.stop();
                }
                if (audioTrack != null) {
                    audioTrack.release();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioPlaybackPanel$lambda$17$lambda$15$lambda$14(CoroutineScope $coroutineScope, MutableState $audioTrackState, byte[] $audioData, int $sampleRate, MutableState $isPlaying$delegate, MutableFloatState $playbackProgress$delegate) {
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new AudioPlaybackPanelKt$AudioPlaybackPanel$3$1$1$1($audioTrackState, $audioData, $sampleRate, $isPlaying$delegate, $playbackProgress$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioPlaybackPanel$lambda$17$lambda$16(boolean $onDarkBg, MutableState $isPlaying$delegate, Composer $composer, int $changed) {
        long primary;
        ComposerKt.sourceInformation($composer, "C150@5242L118,147@5125L325:AudioPlaybackPanel.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605707725, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanel.<anonymous>.<anonymous> (AudioPlaybackPanel.kt:147)");
            }
            ImageVector stop = AudioPlaybackPanel$lambda$1($isPlaying$delegate) ? StopKt.getStop(Icons.Rounded.INSTANCE) : PlayArrowKt.getPlayArrow(Icons.Rounded.INSTANCE);
            String strStringResource = StringResources_androidKt.stringResource(AudioPlaybackPanel$lambda$1($isPlaying$delegate) ? C2421R.string.cd_stop_playback_icon : C2421R.string.cd_play_audio_icon, $composer, 0);
            if ($onDarkBg) {
                $composer.startReplaceGroup(-2030419566);
                $composer.endReplaceGroup();
                primary = Color.INSTANCE.m6952getWhite0d7_KjU();
            } else {
                $composer.startReplaceGroup(-2030418380);
                ComposerKt.sourceInformation($composer, "153@5422L11");
                primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                $composer.endReplaceGroup();
            }
            IconKt.m4075Iconww6aTOc(stop, strStringResource, (Modifier) null, primary, $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void AmplitudeBarGraph(final List<Float> list, final float progress, Modifier modifier, boolean onDarkBg, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean z;
        Modifier modifier3;
        boolean onDarkBg2;
        long primary;
        Composer $composer2 = $composer.startRestartGroup(2079413806);
        ComposerKt.sourceInformation($composer2, "C(AmplitudeBarGraph)P(!1,3)183@6189L12,186@6336L1317,186@6308L1345:AudioPlaybackPanel.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(list) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(progress) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            z = onDarkBg;
        } else if (($changed & 3072) == 0) {
            z = onDarkBg;
            $dirty |= $composer2.changed(z) ? 2048 : 1024;
        } else {
            z = onDarkBg;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            onDarkBg2 = z;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i3 == 0) {
                onDarkBg2 = z;
            } else {
                onDarkBg2 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2079413806, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.AmplitudeBarGraph (AudioPlaybackPanel.kt:182)");
            }
            final long barColor = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer2, MaterialTheme.$stable).m11244getWaveFormBgColor0d7_KjU();
            if (onDarkBg2) {
                $composer2.startReplaceGroup(1156883315);
                $composer2.endReplaceGroup();
                primary = Color.INSTANCE.m6952getWhite0d7_KjU();
            } else {
                $composer2.startReplaceGroup(1156884501);
                ComposerKt.sourceInformation($composer2, "184@6285L11");
                primary = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary();
                $composer2.endReplaceGroup();
            }
            final long progressColor = primary;
            ComposerKt.sourceInformationMarkerStart($composer2, 1156887059, "CC(remember):AudioPlaybackPanel.kt#9igjgp");
            boolean invalid$iv = $composer2.changedInstance(list) | $composer2.changed(barColor) | (($dirty2 & 112) == 32) | $composer2.changed(progressColor);
            Object value$iv = $composer2.rememberedValue();
            if (invalid$iv || value$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AudioPlaybackPanelKt.AmplitudeBarGraph$lambda$22$lambda$21(list, progress, progressColor, barColor, (DrawScope) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            CanvasKt.Canvas(modifier3, (Function1) value$iv, $composer2, ($dirty2 >> 6) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            final boolean z2 = onDarkBg2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AudioPlaybackPanelKt.AmplitudeBarGraph$lambda$23(list, progress, modifier4, z2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AmplitudeBarGraph$lambda$22$lambda$21(List $amplitudeLevels, float $progress, long $progressColor, long $barColor, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        int barCount = $amplitudeLevels.size();
        int bits$iv$iv$iv = (int) (Canvas.mo7496getSizeNHjbRc() >> 32);
        float barWidth = (Float.intBitsToFloat(bits$iv$iv$iv) - (Canvas.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(2)) * (barCount - 1))) / barCount;
        long v1$iv$iv = Float.floatToRawIntBits(barWidth);
        long v2$iv$iv = Float.floatToRawIntBits(barWidth);
        long cornerRadius = CornerRadius.m6624constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        Canvas canvas = Canvas.getDrawContext().getCanvas();
        canvas.saveLayer(androidx.compose.p000ui.geometry.SizeKt.m6760toRectuvyYCjk(Canvas.mo7496getSizeNHjbRc()), AndroidPaint_androidKt.Paint());
        List $this$forEachIndexed$iv = $amplitudeLevels;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index$iv2 = index$iv + 1;
            if (index$iv < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float level = ((Number) item$iv).floatValue();
            int index = index$iv;
            int bits$iv$iv$iv2 = (int) (Canvas.mo7496getSizeNHjbRc() & 4294967295L);
            float barHeight = RangesKt.coerceAtLeast(Float.intBitsToFloat(bits$iv$iv$iv2) * level, 1.5f);
            float left = index * (barWidth + Canvas.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(2)));
            int bits$iv$iv$iv3 = (int) (Canvas.mo7496getSizeNHjbRc() & 4294967295L);
            float f = 2;
            float y$iv = (Float.intBitsToFloat(bits$iv$iv$iv3) / f) - (barHeight / f);
            long v1$iv$iv2 = Float.floatToRawIntBits(left);
            long v2$iv$iv2 = Float.floatToRawIntBits(y$iv);
            long jM6662constructorimpl = Offset.m6662constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L));
            long v1$iv$iv3 = Float.floatToRawIntBits(barWidth);
            long v2$iv$iv3 = Float.floatToRawIntBits(barHeight);
            DrawScope.m7492drawRoundRectuAw5IA$default(Canvas, $barColor, jM6662constructorimpl, Size.m6730constructorimpl((v1$iv$iv3 << 32) | (v2$iv$iv3 & 4294967295L)), cornerRadius, null, 0.0f, null, 0, 240, null);
            index$iv = index$iv2;
            barCount = barCount;
            canvas = canvas;
        }
        int bits$iv$iv$iv4 = (int) (Canvas.mo7496getSizeNHjbRc() >> 32);
        float progressWidth = Float.intBitsToFloat(bits$iv$iv$iv4) * $progress;
        long jM6686getZeroF1C5BW0 = Offset.INSTANCE.m6686getZeroF1C5BW0();
        int bits$iv$iv$iv5 = (int) (Canvas.mo7496getSizeNHjbRc() & 4294967295L);
        float height$iv = Float.intBitsToFloat(bits$iv$iv$iv5);
        long v1$iv$iv4 = Float.floatToRawIntBits(progressWidth);
        long v2$iv$iv4 = Float.floatToRawIntBits(height$iv);
        DrawScope.m7490drawRectnJ9OG0$default(Canvas, $progressColor, jM6686getZeroF1C5BW0, Size.m6730constructorimpl((v1$iv$iv4 << 32) | (v2$iv$iv4 & 4294967295L)), 0.0f, null, null, BlendMode.INSTANCE.m6853getSrcIn0nO6VwU(), 56, null);
        canvas.restore();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        // Code decompiled incorrectly - placeholder implementation
        return null;
    public static final java.lang.Object playAudio(androidx.compose.runtime.MutableState<android.media.AudioTrack> r14, byte[] r15, int r16, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r17, kotlin.jvm.functions.Function0<kotlin.Unit> r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) throws java.lang.Throwable {
        /*
    public static final java.lang.Object playAudio(androidx.compose.runtime.MutableState<android.media.AudioTrack> r14, byte[] r15, int r16, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r17, kotlin.jvm.functions.Function0<kotlin.Unit> r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) throws java.lang.Throwable {
            // Method dump skipped - placeholder implementation
            return 0;
        }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$playAudio$2 */
    /* JADX INFO: compiled from: AudioPlaybackPanel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = 48)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$playAudio$2", m932f = "AudioPlaybackPanel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C26822 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $audioData;
        final /* synthetic */ MutableState<AudioTrack> $audioTrackState;
        final /* synthetic */ Function1<Float, Unit> $onProgress;
        final /* synthetic */ int $sampleRate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C26822(MutableState<AudioTrack> mutableState, int i, byte[] bArr, Function1<? super Float, Unit> function1, Continuation<? super C26822> continuation) {
            super(2, continuation);
            this.$audioTrackState = mutableState;
            this.$sampleRate = i;
            this.$audioData = bArr;
            this.$onProgress = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26822 c26822 = new C26822(this.$audioTrackState, this.$sampleRate, this.$audioData, this.$onProgress, continuation);
            c26822.L$0 = obj;
            return c26822;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26822) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            AudioTrack value;
            int currentFrames;
            CoroutineScope $this$withContext = (CoroutineScope) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    long lastProgressUpdateMs = 0;
                    AudioTrack value2 = this.$audioTrackState.getValue();
                    if (value2 != null) {
                        value2.release();
                    }
                    AudioTrack audioTrack = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(1).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(this.$sampleRate).setChannelMask(4).build()).setTransferMode(0).setBufferSizeInBytes(this.$audioData.length).build();
                    Intrinsics.checkNotNullExpressionValue(audioTrack, "build(...)");
                    int totalFrames = this.$audioData.length / 2;
                    this.$audioTrackState.setValue(audioTrack);
                    audioTrack.write(this.$audioData, 0, this.$audioData.length);
                    audioTrack.play();
                    while (CoroutineScopeKt.isActive($this$withContext) && audioTrack.getPlayState() == 3 && (currentFrames = audioTrack.getPlaybackHeadPosition()) < totalFrames) {
                        float progress = currentFrames / totalFrames;
                        long curMs = System.currentTimeMillis();
                        if (curMs - lastProgressUpdateMs > 30) {
                            this.$onProgress.invoke(Boxing.boxFloat(progress));
                            lastProgressUpdateMs = curMs;
                        }
                    }
                    if (CoroutineScopeKt.isActive($this$withContext) && (value = this.$audioTrackState.getValue()) != null) {
                        value.stop();
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopPlayAudio(MutableState<AudioTrack> mutableState) {
        Log.d(TAG, "Stopping playing audio...");
        AudioTrack audioTrack = mutableState.getValue();
        if (audioTrack != null) {
            audioTrack.stop();
        }
        if (audioTrack != null) {
            audioTrack.release();
        }
        mutableState.setValue(null);
    }

    private static final List<Float> generateAmplitudeLevels(byte[] audioData, int barCount) {
        if (audioData.length == 0) {
            ArrayList arrayList = new ArrayList(barCount);
            for (int i = 0; i < barCount; i++) {
                arrayList.add(Float.valueOf(0.0f));
            }
            return arrayList;
        }
        ShortBuffer shortBuffer = ByteBuffer.wrap(audioData).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
        short[] samples = new short[shortBuffer.remaining()];
        shortBuffer.get(samples);
        if (samples.length == 0) {
            ArrayList arrayList2 = new ArrayList(barCount);
            for (int i2 = 0; i2 < barCount; i2++) {
                arrayList2.add(Float.valueOf(0.0f));
            }
            return arrayList2;
        }
        int chunkSize = samples.length / barCount;
        List amplitudeLevels = new ArrayList();
        for (int i3 = 0; i3 < barCount; i3++) {
            int chunkStart = i3 * chunkSize;
            int chunkEnd = RangesKt.coerceAtMost(chunkStart + chunkSize, samples.length);
            double maxAmplitudeInChunk = AudioStats.AUDIO_AMPLITUDE_NONE;
            for (int j = chunkStart; j < chunkEnd; j++) {
                double sampleAbs = Math.abs(samples[j]);
                if (sampleAbs > maxAmplitudeInChunk) {
                    maxAmplitudeInChunk = sampleAbs;
                }
            }
            float normalizedRms = RangesKt.coerceIn((float) (maxAmplitudeInChunk / ((double) 32767)), 0.0f, 1.0f);
            amplitudeLevels.add(Float.valueOf(normalizedRms));
        }
        float maxVal = CollectionsKt.maxOrThrow((Iterable<Double>) amplitudeLevels);
        if (maxVal == 0.0f) {
            return amplitudeLevels;
        }
        float scaleFactor = 0.9f / maxVal;
        List $this$map$iv = amplitudeLevels;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            float it = ((Number) item$iv$iv).floatValue();
            destination$iv$iv.add(Float.valueOf(it * scaleFactor));
        }
        return (List) destination$iv$iv;
    }
}
}
