package com.google.ai.edge.gallery.p006ui.home;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MultiChoiceSegmentedButtonRowScope;
import androidx.compose.material3.SegmentedButtonColors;
import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.focus.FocusManager;
import androidx.compose.p000ui.focus.FocusRequester;
import androidx.compose.p000ui.focus.FocusState;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.PointerIconCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity;
import com.google.ai.edge.gallery.p006ui.common.tos.AppTosDialogKt;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.p006ui.theme.ThemeSettings;
import com.google.ai.edge.gallery.proto.AccessTokenData;
import com.google.ai.edge.gallery.proto.Theme;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SettingsDialog.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u00008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0002\u0010\n\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0002X\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0014X\u008a\u008e\u0002"}, m922d2 = {"THEME_OPTIONS", "", "Lcom/google/ai/edge/gallery/proto/Theme;", "SettingsDialog", "", "curThemeOverride", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "onDismissed", "Lkotlin/Function0;", "(Lcom/google/ai/edge/gallery/proto/Theme;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "themeLabel", "", "theme", "app_debug", "selectedTheme", "hfToken", "Lcom/google/ai/edge/gallery/proto/AccessTokenData;", "customHfToken", "isFocused", "", "showTos"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class SettingsDialogKt {
    private static final List<Theme> THEME_OPTIONS = CollectionsKt.listOf((Object[]) new Theme[]{Theme.THEME_AUTO, Theme.THEME_LIGHT, Theme.THEME_DARK});

    /* JADX INFO: compiled from: SettingsDialog.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Theme.values().length];
            try {
                iArr[Theme.THEME_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Theme.THEME_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Theme.THEME_DARK.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsDialog$lambda$66(Theme theme, ModelManagerViewModel modelManagerViewModel, Function0 function0, int i, Composer composer, int i2) {
        SettingsDialog(theme, modelManagerViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SettingsDialog(final Theme curThemeOverride, final ModelManagerViewModel modelManagerViewModel, final Function0<Unit> onDismissed, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(curThemeOverride, "curThemeOverride");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        Composer $composer2 = $composer.startRestartGroup(-643478013);
        ComposerKt.sourceInformation($composer2, "C(SettingsDialog)96@4131L45,97@4194L79,98@4296L148,103@4468L31,104@4519L34,105@4577L29,106@4633L39,107@4690L34,109@4767L9732,109@4728L9771:SettingsDialog.kt#lrhf9m");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(curThemeOverride.ordinal()) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(modelManagerViewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onDismissed) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-643478013, $dirty2, -1, "com.google.ai.edge.gallery.ui.home.SettingsDialog (SettingsDialog.kt:95)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 92926608, "CC(remember):SettingsDialog.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(curThemeOverride, null, 2, null);
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableState selectedTheme$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 92928658, "CC(remember):SettingsDialog.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(modelManagerViewModel.getTokenStatusAndData().getData(), null, 2, null);
                $composer2.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableState hfToken$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 92931991, "CC(remember):SettingsDialog.kt#9igjgp");
            Object it$iv3 = $composer2.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault()).withLocale(Locale.getDefault());
                $composer2.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            final DateTimeFormatter dateFormatter = (DateTimeFormatter) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 92937378, "CC(remember):SettingsDialog.kt#9igjgp");
            Object it$iv4 = $composer2.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            }
            final MutableState customHfToken$delegate = (MutableState) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 92939013, "CC(remember):SettingsDialog.kt#9igjgp");
            Object it$iv5 = $composer2.rememberedValue();
            if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                Object value$iv5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(value$iv5);
                it$iv5 = value$iv5;
            }
            final MutableState isFocused$delegate = (MutableState) it$iv5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 92940864, "CC(remember):SettingsDialog.kt#9igjgp");
            Object it$iv6 = $composer2.rememberedValue();
            if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                Object value$iv6 = new FocusRequester();
                $composer2.updateRememberedValue(value$iv6);
                it$iv6 = value$iv6;
            }
            final FocusRequester focusRequester = (FocusRequester) it$iv6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 92942666, "CC(remember):SettingsDialog.kt#9igjgp");
            Object it$iv7 = $composer2.rememberedValue();
            if (it$iv7 == Composer.INSTANCE.getEmpty()) {
                Object value$iv7 = InteractionSourceKt.MutableInteractionSource();
                $composer2.updateRememberedValue(value$iv7);
                it$iv7 = value$iv7;
            }
            final MutableInteractionSource interactionSource = (MutableInteractionSource) it$iv7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 92944485, "CC(remember):SettingsDialog.kt#9igjgp");
            Object it$iv8 = $composer2.rememberedValue();
            if (it$iv8 == Composer.INSTANCE.getEmpty()) {
                Object value$iv8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(value$iv8);
                it$iv8 = value$iv8;
            }
            final MutableState showTos$delegate = (MutableState) it$iv8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            AndroidDialog_androidKt.Dialog(onDismissed, null, ComposableLambdaKt.rememberComposableLambda(1131126362, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.home.SettingsDialogKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsDialogKt.SettingsDialog$lambda$63(interactionSource, modelManagerViewModel, selectedTheme$delegate, dateFormatter, hfToken$delegate, focusRequester, customHfToken$delegate, isFocused$delegate, showTos$delegate, onDismissed, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 6) & 14) | 384, 2);
            if (SettingsDialog$lambda$16(showTos$delegate)) {
                $composer2.startReplaceGroup(-1403939472);
                ComposerKt.sourceInformation($composer2, "346@14551L19,346@14522L69");
                ComposerKt.sourceInformationMarkerStart($composer2, 93260022, "CC(remember):SettingsDialog.kt#9igjgp");
                Object it$iv9 = $composer2.rememberedValue();
                if (it$iv9 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv9 = new Function0() { // from class: com.google.ai.edge.gallery.ui.home.SettingsDialogKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SettingsDialogKt.SettingsDialog$lambda$65$lambda$64(showTos$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv9);
                    it$iv9 = value$iv9;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                AppTosDialogKt.AppTosDialog((Function0) it$iv9, true, $composer2, 54, 0);
            } else {
                $composer2.startReplaceGroup(-1418342785);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.home.SettingsDialogKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsDialogKt.SettingsDialog$lambda$66(curThemeOverride, modelManagerViewModel, onDismissed, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Theme SettingsDialog$lambda$1(MutableState<Theme> mutableState) {
        MutableState<Theme> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final AccessTokenData SettingsDialog$lambda$4(MutableState<AccessTokenData> mutableState) {
        MutableState<AccessTokenData> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String SettingsDialog$lambda$8(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean SettingsDialog$lambda$11(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void SettingsDialog$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SettingsDialog$lambda$16(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void SettingsDialog$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsDialog$lambda$63(MutableInteractionSource $interactionSource, final ModelManagerViewModel $modelManagerViewModel, final MutableState $selectedTheme$delegate, final DateTimeFormatter $dateFormatter, final MutableState $hfToken$delegate, final FocusRequester $focusRequester, final MutableState $customHfToken$delegate, final MutableState $isFocused$delegate, final MutableState $showTos$delegate, final Function0 $onDismissed, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C110@4810L7,116@5005L47,120@5101L9394,111@4822L9673:SettingsDialog.kt#lrhf9m");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1131126362, $changed, -1, "com.google.ai.edge.gallery.ui.home.SettingsDialog.<anonymous> (SettingsDialog.kt:110)");
            }
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd($composer);
            final FocusManager focusManager = (FocusManager) objConsume;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 385715657, "CC(remember):SettingsDialog.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance(focusManager);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.home.SettingsDialogKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsDialogKt.SettingsDialog$lambda$63$lambda$19$lambda$18(focusManager);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            CardKt.Card(ClickableKt.m1397clickableO2vRcR0(modifierFillMaxWidth$default, $interactionSource, null, (24 & 4) != 0, (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null, (Function0) it$iv), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(16)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-355779764, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.home.SettingsDialogKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsDialogKt.SettingsDialog$lambda$63$lambda$62($modelManagerViewModel, $selectedTheme$delegate, $dateFormatter, $hfToken$delegate, focusManager, $focusRequester, $customHfToken$delegate, $isFocused$delegate, $showTos$delegate, $onDismissed, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f249xf2722a21, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsDialog$lambda$63$lambda$19$lambda$18(FocusManager $focusManager) {
        FocusManager.clearFocus$default($focusManager, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0c32  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0cc9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0d6e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0dfe  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0e0a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0e10  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0f98  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x1022  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x102e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x1034  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x113c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x114e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x129f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x12ab  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x12b1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x13b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0b0d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsDialog$lambda$63$lambda$62(final com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel r180, final androidx.compose.runtime.MutableState r181, java.time.format.DateTimeFormatter r182, androidx.compose.runtime.MutableState r183, final androidx.compose.p000ui.focus.FocusManager r184, androidx.compose.p000ui.focus.FocusRequester r185, androidx.compose.runtime.MutableState r186, androidx.compose.runtime.MutableState r187, final androidx.compose.runtime.MutableState r188, final kotlin.jvm.functions.Function0 r189, androidx.compose.foundation.layout.ColumnScope r190, androidx.compose.runtime.Composer r191, int r192) {
        /*
            Method dump skipped, instruction units count: 5053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.p006ui.home.SettingsDialogKt.SettingsDialog$lambda$63$lambda$62(com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, androidx.compose.runtime.MutableState, java.time.format.DateTimeFormatter, androidx.compose.runtime.MutableState, androidx.compose.ui.focus.FocusManager, androidx.compose.ui.focus.FocusRequester, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$22$lambda$21 */
    public static final Unit m536x21f7ba16(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$28$lambda$27 */
    public static final Unit m537x9f53eaa2(final ModelManagerViewModel $modelManagerViewModel, final Context $context, final MutableState $selectedTheme$delegate, MultiChoiceSegmentedButtonRowScope MultiChoiceSegmentedButtonRow, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(MultiChoiceSegmentedButtonRow, "$this$MultiChoiceSegmentedButtonRow");
        ComposerKt.sourceInformation(composer, "C*156@6462L52,157@6552L1149,183@7781L27,154@6375L1452:SettingsDialog.kt#lrhf9m");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= composer.changed(MultiChoiceSegmentedButtonRow) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        boolean z = true;
        if (composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(796277462, $dirty2, -1, "com.google.ai.edge.gallery.ui.home.SettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsDialog.kt:153)");
            }
            Iterable $this$forEachIndexed$iv = THEME_OPTIONS;
            int index$iv = 0;
            for (Object item$iv : $this$forEachIndexed$iv) {
                int index$iv2 = index$iv + 1;
                if (index$iv < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final Theme theme = (Theme) item$iv;
                Shape shapeItemShape = SegmentedButtonDefaults.INSTANCE.itemShape(index$iv, THEME_OPTIONS.size(), null, $composer, 3072, 4);
                boolean z2 = theme == SettingsDialog$lambda$1($selectedTheme$delegate) ? z : false;
                ComposerKt.sourceInformationMarkerStart(composer, 600153681, "CC(remember):SettingsDialog.kt#9igjgp");
                boolean invalid$iv = composer.changed(theme.ordinal()) | composer.changedInstance($modelManagerViewModel) | composer.changedInstance($context);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.home.SettingsDialogKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SettingsDialogKt.m538xa00016b4(theme, $modelManagerViewModel, $context, $selectedTheme$delegate, ((Boolean) obj).booleanValue());
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                composer = $composer;
                SegmentedButtonKt.SegmentedButton(MultiChoiceSegmentedButtonRow, z2, (Function1<? super Boolean, Unit>) it$iv, shapeItemShape, (Modifier) null, false, (SegmentedButtonColors) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-619609486, z, new Function2() { // from class: com.google.ai.edge.gallery.ui.home.SettingsDialogKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SettingsDialogKt.m539x9dab569b(theme, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, $dirty2 & 14, 48, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
                z = z;
                $dirty2 = $dirty2;
                index$iv = index$iv2;
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
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$28$lambda$27$lambda$26$lambda$24$lambda$23 */
    public static final Unit m538xa00016b4(Theme $theme, ModelManagerViewModel $modelManagerViewModel, Context $context, MutableState $selectedTheme$delegate, boolean it) {
        $selectedTheme$delegate.setValue($theme);
        ThemeSettings.INSTANCE.getThemeOverride().setValue($theme);
        $modelManagerViewModel.saveThemeOverride($theme);
        Object systemService = $context.getApplicationContext().getSystemService("uimode");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        UiModeManager uiModeManager = (UiModeManager) systemService;
        if ($theme == Theme.THEME_AUTO) {
            uiModeManager.setApplicationNightMode(0);
        } else if ($theme == Theme.THEME_LIGHT) {
            uiModeManager.setApplicationNightMode(1);
        } else {
            uiModeManager.setApplicationNightMode(2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$28$lambda$27$lambda$26$lambda$25 */
    public static final Unit m539x9dab569b(Theme $theme, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C183@7783L23:SettingsDialog.kt#lrhf9m");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-619609486, $changed, -1, "com.google.ai.edge.gallery.ui.home.SettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsDialog.kt:183)");
            }
            TextKt.m4781TextNvy7gAk(themeLabel($theme), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$30$lambda$29 */
    public static final Unit m540xffdff9fb(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$46$lambda$45$lambda$32$lambda$31 */
    public static final Unit m541x2c32aa89(ModelManagerViewModel $modelManagerViewModel, MutableState $hfToken$delegate) {
        $modelManagerViewModel.clearAccessToken();
        $hfToken$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$46$lambda$45$lambda$34$lambda$33 */
    public static final Unit m542x55fc100d(ModelManagerViewModel $modelManagerViewModel, FocusManager $focusManager, MutableState $customHfToken$delegate, MutableState $hfToken$delegate) {
        $modelManagerViewModel.saveAccessToken(SettingsDialog$lambda$8($customHfToken$delegate), "", System.currentTimeMillis() + 315360000000L);
        $hfToken$delegate.setValue($modelManagerViewModel.getTokenStatusAndData().getData());
        FocusManager.clearFocus$default($focusManager, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$46$lambda$45$lambda$36$lambda$35 */
    public static final Unit m543x7fc57591(Function0 $handleSaveToken, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        $handleSaveToken.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$46$lambda$45$lambda$38$lambda$37 */
    public static final Unit m544xa98edb15(MutableState $isFocused$delegate, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SettingsDialog$lambda$12($isFocused$delegate, it.isFocused());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$46$lambda$45$lambda$40$lambda$39 */
    public static final Unit m545xa1aea6e(MutableState $customHfToken$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $customHfToken$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$46$lambda$45$lambda$44 */
    public static final Unit m546x6798b073(MutableState $isFocused$delegate, Function0 $handleSaveToken, MutableState $customHfToken$delegate, Function2 innerTextField, Composer $composer, int $changed) {
        long outline;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        ComposerKt.sourceInformation($composer, "C256@10972L1471:SettingsDialog.kt#lrhf9m");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changedInstance(innerTextField) ? 4 : 2;
        }
        if (!$composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1746430723, $dirty, -1, "com.google.ai.edge.gallery.ui.home.SettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsDialog.kt:256)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float fM9788constructorimpl = SettingsDialog$lambda$11($isFocused$delegate) ? C1654Dp.m9788constructorimpl(2) : C1654Dp.m9788constructorimpl(1);
            if (SettingsDialog$lambda$11($isFocused$delegate)) {
                $composer.startReplaceGroup(1012296548);
                ComposerKt.sourceInformation($composer, "261@11193L11");
                outline = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1012298628);
                ComposerKt.sourceInformation($composer, "262@11258L11");
                outline = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutline();
                $composer.endReplaceGroup();
            }
            Modifier modifier$iv = SizeKt.m2022height3ABfNKs(BorderKt.m1374borderxT4_qwU(companion, fM9788constructorimpl, outline, RoundedCornerShapeKt.getCircleShape()), C1654Dp.m9788constructorimpl(40));
            Alignment contentAlignment$iv = Alignment.INSTANCE.getCenterStart();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
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
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i2 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 822689043, "C268@11484L941:SettingsDialog.kt#lrhf9m");
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier$iv2 = Modifier.INSTANCE;
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            int $changed$iv$iv2 = (384 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor2;
                $composer.createNode(function02);
            } else {
                function02 = constructor2;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i4 = ((384 >> 6) & 112) | 6;
            RowScope $this$SettingsDialog_u24lambda_u2463_u24lambda_u2462_u24lambda_u2461_u24lambda_u2457_u24lambda_u2446_u24lambda_u2445_u24lambda_u2444_u24lambda_u2443_u24lambda_u2442 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 2064282765, "C269@11558L452:SettingsDialog.kt#lrhf9m");
            Modifier modifier$iv3 = RowScope.weight$default($this$SettingsDialog_u24lambda_u2463_u24lambda_u2462_u24lambda_u2461_u24lambda_u2457_u24lambda_u2446_u24lambda_u2445_u24lambda_u2444_u24lambda_u2443_u24lambda_u2442, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv2 = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
            int $changed$iv$iv3 = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer, modifier$iv3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function03 = constructor3;
                $composer.createNode(function03);
            } else {
                function03 = constructor3;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -884177797, "C277@11972L16:SettingsDialog.kt#lrhf9m");
            if (SettingsDialog$lambda$8($customHfToken$delegate).length() == 0) {
                $composer.startReplaceGroup(-884151138);
                ComposerKt.sourceInformation($composer, "273@11800L11,274@11878L10,271@11696L229");
                TextKt.m4781TextNvy7gAk("Enter token manually", null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 131066);
            } else {
                $composer.startReplaceGroup(-895737419);
            }
            $composer.endReplaceGroup();
            innerTextField.invoke($composer, Integer.valueOf($dirty & 14));
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (SettingsDialog$lambda$8($customHfToken$delegate).length() > 0) {
                $composer.startReplaceGroup(2064768069);
                ComposerKt.sourceInformation($composer, "280@12087L296");
                IconButtonKt.IconButton($handleSaveToken, OffsetKt.m1945offsetVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(1), 0.0f, 2, null), false, null, null, null, ComposableSingletons$SettingsDialogKt.INSTANCE.m11061getLambda$38038496$app_debug(), $composer, 1572912, 60);
            } else {
                $composer.startReplaceGroup(2052789979);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$48$lambda$47 */
    public static final Unit m547xaeb7359e(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$51$lambda$50$lambda$49 */
    public static final Unit m548xce5bc72c(Context $context) {
        Intent intent = new Intent($context, (Class<?>) OssLicensesMenuActivity.class);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$53$lambda$52 */
    public static final Unit m549xcdf15d52(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$57$lambda$56$lambda$55$lambda$54 */
    public static final Unit m550xf5d01090(MutableState $showTos$delegate) {
        SettingsDialog$lambda$17($showTos$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingsDialog$lambda$63$lambda$62$lambda$61$lambda$60$lambda$59$lambda$58 */
    public static final Unit m551x79a491f6(Function0 $onDismissed) {
        $onDismissed.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsDialog$lambda$65$lambda$64(MutableState $showTos$delegate) {
        SettingsDialog$lambda$17($showTos$delegate, false);
        return Unit.INSTANCE;
    }

    private static final String themeLabel(Theme theme) {
        switch (WhenMappings.$EnumSwitchMapping$0[theme.ordinal()]) {
            case 1:
                return "Auto";
            case 2:
                return "Light";
            case 3:
                return "Dark";
            default:
                return "Unknown";
        }
    }
}
