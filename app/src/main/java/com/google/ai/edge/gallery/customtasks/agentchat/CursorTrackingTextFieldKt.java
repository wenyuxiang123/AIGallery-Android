package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.SolidColor;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextRange;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.input.TextFieldValue;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: CursorTrackingTextField.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u008a\u0001\u0010\u0000\u001a\u00020\u00012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002"}, m922d2 = {"CursorTrackingTextField", "", "labelResId", "", "supportingTextResId", "initialValue", "", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "minLines", "extraOffset", "Landroidx/compose/ui/unit/Dp;", "monoFont", "extraBottomComposable", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "CursorTrackingTextField-f8-ukHw", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZIFZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_debug", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class CursorTrackingTextFieldKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CursorTrackingTextField_f8_ukHw$lambda$19(Integer num, Integer num2, String str, Function1 function1, Modifier modifier, boolean z, int i, float f, boolean z2, Function2 function2, int i2, int i3, Composer composer, int i4) {
        m10471CursorTrackingTextFieldf8ukHw(num, num2, str, function1, modifier, z, i, f, z2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: CursorTrackingTextField-f8-ukHw, reason: not valid java name */
    public static final void m10471CursorTrackingTextFieldf8ukHw(Integer labelResId, Integer supportingTextResId, final String initialValue, final Function1<? super String, Unit> onValueChange, Modifier modifier, boolean enabled, int minLines, float extraOffset, boolean monoFont, Function2<? super Composer, ? super Integer, Unit> function2, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        final Integer labelResId2;
        Integer supportingTextResId2;
        boolean enabled2;
        int minLines2;
        float extraOffset2;
        boolean monoFont2;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Modifier modifier3;
        TextStyle textStyle;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer $composer2 = $composer.startRestartGroup(1756999512);
        ComposerKt.sourceInformation($composer2, "C(CursorTrackingTextField)P(4,9,3,8,6!1,5,2:c#ui.unit.Dp,7)61@2459L39,62@2523L57,63@2607L52,64@2691L37,65@2758L7,66@2780L24,68@2837L352,68@2808L381,81@3336L538,81@3277L597,110@4479L11,112@4595L11,96@3964L86,100@4071L25,115@4705L1077,93@3877L1910:CursorTrackingTextField.kt#41d64j");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
        } else if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(labelResId) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
        } else if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(supportingTextResId) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(initialValue) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(onValueChange) ? 2048 : 1024;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        int i5 = i & 32;
        if (i5 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f249xf2722a21;
        } else if (($changed & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty |= $composer2.changed(enabled) ? 131072 : 65536;
        }
        int i6 = i & 64;
        if (i6 != 0) {
            $dirty |= 1572864;
        } else if (($changed & 1572864) == 0) {
            $dirty |= $composer2.changed(minLines) ? 1048576 : 524288;
        }
        int i7 = i & 128;
        if (i7 != 0) {
            $dirty |= 12582912;
        } else if (($changed & 12582912) == 0) {
            $dirty |= $composer2.changed(extraOffset) ? 8388608 : 4194304;
        }
        int i8 = i & 256;
        if (i8 != 0) {
            $dirty |= 100663296;
        } else if (($changed & 100663296) == 0) {
            $dirty |= $composer2.changed(monoFont) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i9 = i & 512;
        if (i9 != 0) {
            $dirty |= 805306368;
        } else if (($changed & 805306368) == 0) {
            $dirty |= $composer2.changedInstance(function2) ? 536870912 : 268435456;
        }
        if ($composer2.shouldExecute(($dirty & 306783379) != 306783378, $dirty & 1)) {
            Integer labelResId3 = i2 != 0 ? null : labelResId;
            Integer supportingTextResId3 = i3 != 0 ? null : supportingTextResId;
            Modifier.Companion modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            boolean enabled3 = i5 != 0 ? true : enabled;
            int minLines3 = i6 != 0 ? 1 : minLines;
            float extraOffset3 = i7 != 0 ? C1654Dp.m9788constructorimpl(56) : extraOffset;
            boolean monoFont3 = i8 != 0 ? false : monoFont;
            Function2<? super Composer, ? super Integer, Unit> lambda$1863007836$app_debug = i9 != 0 ? ComposableSingletons$CursorTrackingTextFieldKt.INSTANCE.getLambda$1863007836$app_debug() : function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1756999512, $dirty, -1, "com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextField (CursorTrackingTextField.kt:60)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 554396735, "CC(remember):CursorTrackingTextField.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = InteractionSourceKt.MutableInteractionSource();
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableInteractionSource interactionSource = (MutableInteractionSource) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 554398801, "CC(remember):CursorTrackingTextField.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            int minLines4 = minLines3;
            function22 = lambda$1863007836$app_debug;
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(initialValue, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                $composer2.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableState textFieldValue$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 554401484, "CC(remember):CursorTrackingTextField.kt#9igjgp");
            Object value$iv3 = $composer2.rememberedValue();
            if (value$iv3 == Composer.INSTANCE.getEmpty()) {
                value$iv3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(value$iv3);
            }
            final MutableState textLayoutResult$delegate = (MutableState) value$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 554404157, "CC(remember):CursorTrackingTextField.kt#9igjgp");
            Object it$iv3 = $composer2.rememberedValue();
            final Integer supportingTextResId4 = supportingTextResId3;
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = BringIntoViewRequesterKt.BringIntoViewRequester();
                $composer2.updateRememberedValue(value$iv4);
                it$iv3 = value$iv4;
            }
            BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            labelResId2 = labelResId3;
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Density density = (Density) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object it$iv$iv = $composer2.rememberedValue();
            enabled2 = enabled3;
            if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
                $composer2.updateRememberedValue(value$iv$iv);
                it$iv$iv = value$iv$iv;
            }
            CoroutineScope scope = (CoroutineScope) it$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 554409144, "CC(remember):CursorTrackingTextField.kt#9igjgp");
            boolean invalid$iv = ($dirty & 896) == 256;
            Object it$iv4 = $composer2.rememberedValue();
            if (invalid$iv || it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv5 = (Function2) new CursorTrackingTextFieldKt$CursorTrackingTextField$1$1(initialValue, textFieldValue$delegate, null);
                $composer2.updateRememberedValue(value$iv5);
                it$iv4 = value$iv5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(initialValue, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv4, $composer2, ($dirty >> 6) & 14);
            TextRange textRangeM9180boximpl = TextRange.m9180boximpl(CursorTrackingTextField_f8_ukHw$lambda$2(textFieldValue$delegate).getSelection());
            TextLayoutResult textLayoutResultCursorTrackingTextField_f8_ukHw$lambda$5 = CursorTrackingTextField_f8_ukHw$lambda$5(textLayoutResult$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 554425298, "CC(remember):CursorTrackingTextField.kt#9igjgp");
            boolean invalid$iv2 = ((29360128 & $dirty) == 8388608) | $composer2.changed(density) | $composer2.changedInstance(scope) | $composer2.changedInstance(bringIntoViewRequester);
            Object it$iv5 = $composer2.rememberedValue();
            if (invalid$iv2 || it$iv5 == Composer.INSTANCE.getEmpty()) {
                Object value$iv6 = (Function2) new CursorTrackingTextFieldKt$CursorTrackingTextField$2$1(density, scope, textLayoutResult$delegate, textFieldValue$delegate, extraOffset3, bringIntoViewRequester, null);
                $composer2.updateRememberedValue(value$iv6);
                it$iv5 = value$iv6;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(textRangeM9180boximpl, textLayoutResultCursorTrackingTextField_f8_ukHw$lambda$5, (Function2) it$iv5, $composer2, TextLayoutResult.$stable << 3);
            TextFieldValue textFieldValueCursorTrackingTextField_f8_ukHw$lambda$2 = CursorTrackingTextField_f8_ukHw$lambda$2(textFieldValue$delegate);
            Modifier modifierBringIntoViewRequester = BringIntoViewRequesterKt.bringIntoViewRequester(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), bringIntoViewRequester);
            if (monoFont3) {
                $composer2.startReplaceGroup(8180266);
                ComposerKt.sourceInformation($composer2, "104@4248L10");
                TextStyle textStyleM9205copyp1EtxEg$default = TextStyle.m9205copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall(), 0L, 0L, null, null, null, FontFamily.INSTANCE.getMonospace(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null);
                $composer2.endReplaceGroup();
                textStyle = textStyleM9205copyp1EtxEg$default;
            } else {
                $composer2.startReplaceGroup(8280241);
                ComposerKt.sourceInformation($composer2, "106@4350L10");
                TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium();
                $composer2.endReplaceGroup();
                textStyle = bodyMedium;
            }
            long onSurface = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface();
            TextStyle textStyleM9205copyp1EtxEg$default2 = TextStyle.m9205copyp1EtxEg$default(textStyle, Color.m6913copywmQWz5c(onSurface, (14 & 1) != 0 ? Color.m6917getAlphaimpl(onSurface) : enabled2 ? 1.0f : 0.7f, (14 & 2) != 0 ? Color.m6921getRedimpl(onSurface) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(onSurface) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(onSurface) : 0.0f), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            SolidColor solidColor = new SolidColor(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary(), null);
            ComposerKt.sourceInformationMarkerStart($composer2, 554444942, "CC(remember):CursorTrackingTextField.kt#9igjgp");
            boolean invalid$iv3 = ($dirty & 7168) == 2048;
            boolean monoFont4 = monoFont3;
            Object value$iv7 = $composer2.rememberedValue();
            if (invalid$iv3 || value$iv7 == Composer.INSTANCE.getEmpty()) {
                value$iv7 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextFieldKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CursorTrackingTextFieldKt.CursorTrackingTextField_f8_ukHw$lambda$11$lambda$10(onValueChange, textFieldValue$delegate, (TextFieldValue) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv7);
            }
            Function1 function1 = (Function1) value$iv7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 554448305, "CC(remember):CursorTrackingTextField.kt#9igjgp");
            Object it$iv6 = $composer2.rememberedValue();
            if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                Object value$iv8 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextFieldKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CursorTrackingTextFieldKt.CursorTrackingTextField_f8_ukHw$lambda$13$lambda$12(textLayoutResult$delegate, (TextLayoutResult) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv8);
                it$iv6 = value$iv8;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            BasicTextFieldKt.BasicTextField(textFieldValueCursorTrackingTextField_f8_ukHw$lambda$2, (Function1<? super TextFieldValue, Unit>) function1, modifierBringIntoViewRequester, enabled2, false, textStyleM9205copyp1EtxEg$default2, (KeyboardOptions) null, (KeyboardActions) null, false, 0, minLines4, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) it$iv6, interactionSource, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-43403653, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextFieldKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CursorTrackingTextFieldKt.CursorTrackingTextField_f8_ukHw$lambda$18(interactionSource, textFieldValue$delegate, labelResId2, supportingTextResId4, function22, (Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ($dirty >> 6) & 7168, (($dirty >> 18) & 14) | 200064, 3024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            monoFont2 = monoFont4;
            minLines2 = minLines4;
            supportingTextResId2 = supportingTextResId4;
            extraOffset2 = extraOffset3;
            modifier3 = modifier4;
        } else {
            $composer2.skipToGroupEnd();
            labelResId2 = labelResId;
            supportingTextResId2 = supportingTextResId;
            enabled2 = enabled;
            minLines2 = minLines;
            extraOffset2 = extraOffset;
            monoFont2 = monoFont;
            function22 = function2;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Integer num = labelResId2;
            final Integer num2 = supportingTextResId2;
            final Modifier modifier5 = modifier3;
            final boolean z = enabled2;
            final int i10 = minLines2;
            final float f = extraOffset2;
            final boolean z2 = monoFont2;
            final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextFieldKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CursorTrackingTextFieldKt.CursorTrackingTextField_f8_ukHw$lambda$19(num, num2, initialValue, onValueChange, modifier5, z, i10, f, z2, function23, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue CursorTrackingTextField_f8_ukHw$lambda$2(MutableState<TextFieldValue> mutableState) {
        MutableState<TextFieldValue> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLayoutResult CursorTrackingTextField_f8_ukHw$lambda$5(MutableState<TextLayoutResult> mutableState) {
        MutableState<TextLayoutResult> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CursorTrackingTextField_f8_ukHw$lambda$11$lambda$10(Function1 $onValueChange, MutableState $textFieldValue$delegate, TextFieldValue newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        $textFieldValue$delegate.setValue(newValue);
        $onValueChange.invoke(newValue.getText());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CursorTrackingTextField_f8_ukHw$lambda$13$lambda$12(MutableState $textLayoutResult$delegate, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $textLayoutResult$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CursorTrackingTextField_f8_ukHw$lambda$18(final MutableInteractionSource $interactionSource, MutableState $textFieldValue$delegate, final Integer $labelResId, final Integer $supportingTextResId, final Function2 $extraBottomComposable, Function2 innerTextField, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        ComposerKt.sourceInformation($composer, "C123@5023L60,124@5110L199,133@5391L376,116@4757L1019:CursorTrackingTextField.kt#41d64j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changedInstance(innerTextField) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-43403653, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextField.<anonymous> (CursorTrackingTextField.kt:116)");
            }
            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(CursorTrackingTextField_f8_ukHw$lambda$2($textFieldValue$delegate).getText(), innerTextField, true, false, VisualTransformation.INSTANCE.getNone(), $interactionSource, false, ComposableLambdaKt.rememberComposableLambda(606261490, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextFieldKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CursorTrackingTextFieldKt.CursorTrackingTextField_f8_ukHw$lambda$18$lambda$14($labelResId, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-656679035, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextFieldKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CursorTrackingTextFieldKt.CursorTrackingTextField_f8_ukHw$lambda$18$lambda$16($supportingTextResId, $extraBottomComposable, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, null, ComposableLambdaKt.rememberComposableLambda(-1820282424, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextFieldKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CursorTrackingTextFieldKt.CursorTrackingTextField_f8_ukHw$lambda$18$lambda$17($interactionSource, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, (($dirty2 << 3) & 112) | 12807552, 14158848, 57152);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CursorTrackingTextField_f8_ukHw$lambda$18$lambda$14(Integer $labelResId, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:CursorTrackingTextField.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(606261490, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextField.<anonymous>.<anonymous> (CursorTrackingTextField.kt:123)");
            }
            if ($labelResId != null) {
                $composer.startReplaceGroup(-1498259502);
                ComposerKt.sourceInformation($composer, "123@5054L26,123@5049L32");
                TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource($labelResId.intValue(), $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(793585104);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CursorTrackingTextField_f8_ukHw$lambda$18$lambda$16(Integer $supportingTextResId, Function2 $extraBottomComposable, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        ComposerKt.sourceInformation($composer, "C:CursorTrackingTextField.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-656679035, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextField.<anonymous>.<anonymous> (CursorTrackingTextField.kt:125)");
            }
            if ($supportingTextResId != null) {
                $composer.startReplaceGroup(450950701);
                ComposerKt.sourceInformation($composer, "126@5169L118");
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier modifier$iv = Modifier.INSTANCE;
                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
                MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                int $changed$iv$iv = (0 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int $i$f$Column = $changed$iv$iv << 6;
                int $changed$iv$iv$iv = ($i$f$Column & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function0 = constructor;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor;
                    $composer.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                int i = ($changed$iv$iv$iv >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i2 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1679968576, "C127@5199L35,127@5194L41,128@5250L23:CursorTrackingTextField.kt#41d64j");
                TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource($supportingTextResId.intValue(), $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
                $extraBottomComposable.invoke($composer, 0);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
            } else {
                $composer.startReplaceGroup(445831485);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CursorTrackingTextField_f8_ukHw$lambda$18$lambda$17(MutableInteractionSource $interactionSource, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C138@5595L8,139@5651L5,134@5429L328:CursorTrackingTextField.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1820282424, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextField.<anonymous>.<anonymous> (CursorTrackingTextField.kt:134)");
            }
            OutlinedTextFieldDefaults.INSTANCE.m4318Container4EFweAY(true, false, $interactionSource, null, OutlinedTextFieldDefaults.INSTANCE.colors($composer, 6), OutlinedTextFieldDefaults.INSTANCE.getShape($composer, 6), C1654Dp.m9788constructorimpl(2), C1654Dp.m9788constructorimpl(1), $composer, 114819510, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
