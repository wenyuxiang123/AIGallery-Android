package com.google.ai.edge.gallery.ui.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.tos.TosViewModel;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.ui.modelmanager.TokenRequestResult;
import com.google.ai.edge.gallery.ui.modelmanager.TokenRequestResultType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import net.openid.appauth.AuthorizationRequest;

/* JADX INFO: compiled from: DownloadAndTryButton.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u008d\u0001\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 \"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\"\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\rX\u008a\u008e\u0002"}, m922d2 = {"TAG", "", "SYSTEM_RESERVED_MEMORY_IN_BYTES", "", "MODEL_NAMES_TO_SHOW_GEMMA_LICENSES", "", "DownloadAndTryButton", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "enabled", "", "downloadStatus", "Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;", "downloadProgress", "", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "onClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "tosViewModel", "Lcom/google/ai/edge/gallery/ui/common/tos/TosViewModel;", "modifierWhenExpanded", "compact", "canShowTryIt", "downloadButtonBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "DownloadAndTryButton-cTzpE40", "(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/data/Model;ZLcom/google/ai/edge/gallery/data/ModelDownloadStatusType;FLcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/google/ai/edge/gallery/ui/common/tos/TosViewModel;Landroidx/compose/ui/Modifier;ZZJLandroidx/compose/runtime/Composer;III)V", "app_debug", "checkingToken", "showAgreementAckSheet", "showErrorDialog", "showMemoryWarning", "showGemmaTermsOfUseDialog", "downloadStarted"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class DownloadAndTryButtonKt {
    private static final Set<String> MODEL_NAMES_TO_SHOW_GEMMA_LICENSES = SetsKt.setOf((Object[]) new String[]{"Gemma-3n-E2B-it", "Gemma-3n-E4B-it", "Gemma3-1B-IT", "Gemma3-1B-IT NPU"});
    private static final long SYSTEM_RESERVED_MEMORY_IN_BYTES = 3221225472L;
    private static final String TAG = "AGDownloadAndTryButton";

    /* JADX INFO: compiled from: DownloadAndTryButton.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TokenRequestResultType.values().length];
            try {
                iArr[TokenRequestResultType.SUCCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[TokenRequestResultType.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[TokenRequestResultType.USER_CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$65(Task task, Model model, boolean z, ModelDownloadStatusType modelDownloadStatusType, float f, ModelManagerViewModel modelManagerViewModel, Function0 function0, Modifier modifier, TosViewModel tosViewModel, Modifier modifier2, boolean z2, boolean z3, long j, int i, int i2, int i3, Composer composer, int i4) {
        m10870DownloadAndTryButtoncTzpE40(task, model, z, modelDownloadStatusType, f, modelManagerViewModel, function0, modifier, tosViewModel, modifier2, z2, z3, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07f0  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: DownloadAndTryButton-cTzpE40, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10870DownloadAndTryButtoncTzpE40(final com.google.ai.edge.gallery.data.Task r130, final com.google.ai.edge.gallery.data.Model r131, final boolean r132, final com.google.ai.edge.gallery.data.ModelDownloadStatusType r133, final float r134, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r135, final kotlin.jvm.functions.Function0<kotlin.Unit> r136, androidx.compose.p000ui.Modifier r137, com.google.ai.edge.gallery.ui.common.tos.TosViewModel r138, androidx.compose.p000ui.Modifier r139, boolean r140, boolean r141, long r142, androidx.compose.runtime.Composer r144, final int r145, final int r146, final int r147) {
        /*
    public static final void m10870DownloadAndTryButtoncTzpE40(final com.google.ai.edge.gallery.data.Task r130, final com.google.ai.edge.gallery.data.Model r131, final boolean r132, final com.google.ai.edge.gallery.data.ModelDownloadStatusType r133, final float r134, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r135, final kotlin.jvm.functions.Function0<kotlin.Unit> r136, androidx.compose.p000ui.Modifier r137, com.google.ai.edge.gallery.ui.common.tos.TosViewModel r138, androidx.compose.p000ui.Modifier r139, boolean r140, boolean r141, long r142, androidx.compose.runtime.Composer r144, final int r145, final int r146, final int r147) {
            // Method dump skipped - placeholder implementation
        }

    private static final boolean DownloadAndTryButton_cTzpE40$lambda$1(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DownloadAndTryButton_cTzpE40$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DownloadAndTryButton_cTzpE40$lambda$4(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DownloadAndTryButton_cTzpE40$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DownloadAndTryButton_cTzpE40$lambda$7(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DownloadAndTryButton_cTzpE40$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DownloadAndTryButton_cTzpE40$lambda$10(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void DownloadAndTryButton_cTzpE40$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DownloadAndTryButton_cTzpE40$lambda$13(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void DownloadAndTryButton_cTzpE40$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DownloadAndTryButton_cTzpE40$lambda$16(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DownloadAndTryButton_cTzpE40$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$19$lambda$18(ModelManagerViewModel $modelManagerViewModel, Task $task, Model $model, boolean it) {
        $modelManagerViewModel.downloadModel($task, $model);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$21$lambda$20(Model $model, Context $context, ManagedActivityResultLauncher $permissionLauncher, ModelManagerViewModel $modelManagerViewModel, Task $task, MutableState $checkingToken$delegate, String accessToken) {
        $model.setAccessToken(accessToken);
        UtilsKt.checkNotificationPermissionAndStartDownload($context, $permissionLauncher, $modelManagerViewModel, $task, $model);
        DownloadAndTryButton_cTzpE40$lambda$2($checkingToken$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$23$lambda$22(Function1 $startDownload, ModelManagerViewModel $modelManagerViewModel, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Log.d(TAG, "User closes the browser tab. Try to start downloading.");
        $startDownload.invoke($modelManagerViewModel.getCurAccessToken());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$26$lambda$25(final ModelManagerViewModel $modelManagerViewModel, final CoroutineScope $scope, final Model $model, final MutableState $showAgreementAckSheet$delegate, final Function1 $startDownload, final MutableState $checkingToken$delegate, final MutableState $downloadStarted$delegate, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        $modelManagerViewModel.handleAuthResult(result, new Function1() { // from class: com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DownloadAndTryButtonKt.DownloadAndTryButton_cTzpE40$lambda$26$lambda$25$lambda$24($scope, $modelManagerViewModel, $model, $showAgreementAckSheet$delegate, $startDownload, $checkingToken$delegate, $downloadStarted$delegate, (TokenRequestResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$26$lambda$25$lambda$24(CoroutineScope $scope, ModelManagerViewModel $modelManagerViewModel, Model $model, MutableState $showAgreementAckSheet$delegate, Function1 $startDownload, MutableState $checkingToken$delegate, MutableState $downloadStarted$delegate, TokenRequestResult tokenRequestResult) {
        Intrinsics.checkNotNullParameter(tokenRequestResult, "tokenRequestResult");
        switch (WhenMappings.$EnumSwitchMapping$0[tokenRequestResult.getStatus().ordinal()]) {
            case 1:
                Log.d(TAG, "Token request succeeded. Checking if we need user to ack user agreement");
                BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getIO(), null, new C2668x8ef9ac22($modelManagerViewModel, $model, $showAgreementAckSheet$delegate, $startDownload, null), 2, null);
                break;
            case 2:
                String errorMessage = tokenRequestResult.getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = "";
                }
                Log.d(TAG, "Token request done. Error message: " + errorMessage);
                DownloadAndTryButton_cTzpE40$lambda$2($checkingToken$delegate, false);
                DownloadAndTryButton_cTzpE40$lambda$17($downloadStarted$delegate, false);
                break;
            case 3:
                Log.d(TAG, "User cancelled. Do nothing");
                DownloadAndTryButton_cTzpE40$lambda$2($checkingToken$delegate, false);
                DownloadAndTryButton_cTzpE40$lambda$17($downloadStarted$delegate, false);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$28$lambda$27(ModelManagerViewModel $modelManagerViewModel, ManagedActivityResultLauncher $authResultLauncher) {
        AuthorizationRequest authRequest = $modelManagerViewModel.getAuthorizationRequest();
        Intent authIntent = $modelManagerViewModel.getAuthService().getAuthorizationRequestIntent(authRequest);
        Intrinsics.checkNotNull(authIntent);
        $authResultLauncher.launch(authIntent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job DownloadAndTryButton_cTzpE40$lambda$30$lambda$29(CoroutineScope $scope, boolean $needToDownloadFirst, Model $model, ModelManagerViewModel $modelManagerViewModel, MutableState $downloadStarted$delegate, MutableState $checkingToken$delegate, Function1 $startDownload, MutableState $showErrorDialog$delegate, Function0 $startTokenExchange, Function0 $onClicked) {
        return BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getIO(), null, new C2669x548ac2d0($needToDownloadFirst, $model, $modelManagerViewModel, $downloadStarted$delegate, $checkingToken$delegate, $startDownload, $showErrorDialog$delegate, $startTokenExchange, $onClicked, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object DownloadAndTryButton_cTzpE40$lambda$32$lambda$31(Context $context, Model $model, Function0 $handleClickButton, MutableState $showMemoryWarning$delegate) {
        if (MemoryWarningKt.isMemoryLow($context, $model)) {
            DownloadAndTryButton_cTzpE40$lambda$11($showMemoryWarning$delegate, true);
            return Unit.INSTANCE;
        }
        return $handleClickButton.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$34$lambda$33(boolean $enabled, Model $model, TosViewModel $tosViewModel, Function0 $checkMemoryAndClickDownloadButton, MutableState $checkingToken$delegate, MutableState $showGemmaTermsOfUseDialog$delegate) {
        if (!$enabled || DownloadAndTryButton_cTzpE40$lambda$1($checkingToken$delegate)) {
            return Unit.INSTANCE;
        }
        if (StringsKt.startsWith$default($model.getUrl(), "https://dl.google.com/google-ai-edge-gallery/", false, 2, (Object) null) && MODEL_NAMES_TO_SHOW_GEMMA_LICENSES.contains($model.getName()) && !$tosViewModel.getIsGemmaTermsOfUseAccepted()) {
            DownloadAndTryButton_cTzpE40$lambda$14($showGemmaTermsOfUseDialog$delegate, true);
        } else {
            $checkMemoryAndClickDownloadButton.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit DownloadAndTryButton_cTzpE40$lambda$36(boolean r61, boolean r62, com.google.ai.edge.gallery.data.Model r63, com.google.ai.edge.gallery.data.Task r64, boolean r65, boolean r66, boolean r67, androidx.compose.foundation.layout.RowScope r68, androidx.compose.runtime.Composer r69, int r70) {
        /*
    public static final kotlin.Unit DownloadAndTryButton_cTzpE40$lambda$36(boolean r61, boolean r62, com.google.ai.edge.gallery.data.Model r63, com.google.ai.edge.gallery.data.Task r64, boolean r65, boolean r66, boolean r67, androidx.compose.foundation.layout.RowScope r68, androidx.compose.runtime.Composer r69, int r70) {
            // Method dump skipped - placeholder implementation
            return false;
        }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DownloadAndTryButton_cTzpE40$lambda$44$lambda$39$lambda$38(Animatable $animatedProgress) {
        return ((Number) $animatedProgress.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$44$lambda$43$lambda$42(ModelManagerViewModel $modelManagerViewModel, Model $model, MutableState $downloadStarted$delegate) {
        DownloadAndTryButton_cTzpE40$lambda$17($downloadStarted$delegate, false);
        $modelManagerViewModel.cancelDownloadModel($model);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$44$lambda$41$lambda$40(String $cbStop, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, $cbStop);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$47$lambda$46(MutableState $showAgreementAckSheet$delegate, MutableState $checkingToken$delegate) {
        DownloadAndTryButton_cTzpE40$lambda$5($showAgreementAckSheet$delegate, false);
        DownloadAndTryButton_cTzpE40$lambda$2($checkingToken$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$51(final Model $model, final ActivityResultLauncher $agreementAckLauncher, final MutableState $showAgreementAckSheet$delegate, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C515@20706L1186:DownloadAndTryButton.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-963516980, $changed, -1, "com.google.ai.edge.gallery.ui.common.DownloadAndTryButton.<anonymous> (DownloadAndTryButton.kt:515)");
            }
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getCenterHorizontally();
            Modifier modifier$iv = PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            int $changed$iv$iv = (390 << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i2 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 340877762, "C519@20906L10,519@20849L79,522@21157L10,520@20937L309,526@21283L541,525@21255L629:DownloadAndTryButton.kt#t7sjiu");
            TextKt.m4781TextNvy7gAk("Acknowledge user agreement", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 6, 0, 131070);
            TextKt.m4781TextNvy7gAk("This is a gated model. Please click the button below to view and agree to the user agreement. After accepting, simply close that tab to proceed with the model download.", PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(16), 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 54, 0, 131068);
            ComposerKt.sourceInformationMarkerStart($composer, 288104115, "CC(remember):DownloadAndTryButton.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($model) | $composer.changedInstance($agreementAckLauncher);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DownloadAndTryButtonKt.m488xe3d8137d($model, $agreementAckLauncher, $showAgreementAckSheet$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$DownloadAndTryButtonKt.INSTANCE.getLambda$645975206$app_debug(), $composer, 805306368, 510);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: DownloadAndTryButton_cTzpE40$lambda$51$lambda$50$lambda$49$lambda$48 */
    public static final Unit m488xe3d8137d(Model $model, ActivityResultLauncher $agreementAckLauncher, MutableState $showAgreementAckSheet$delegate) {
        int index = StringsKt.indexOf$default((CharSequence) $model.getUrl(), "/resolve/", 0, false, 6, (Object) null);
        if (index >= 0) {
            String agreementUrl = $model.getUrl().substring(0, index);
            Intrinsics.checkNotNullExpressionValue(agreementUrl, "substring(...)");
            CustomTabsIntent customTabsIntent = new CustomTabsIntent.Builder().build();
            Intrinsics.checkNotNullExpressionValue(customTabsIntent, "build(...)");
            customTabsIntent.intent.setData(Uri.parse(agreementUrl));
            Intent intent = customTabsIntent.intent;
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            $agreementAckLauncher.launch(intent);
        }
        DownloadAndTryButton_cTzpE40$lambda$5($showAgreementAckSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$53$lambda$52(MutableState $showErrorDialog$delegate) {
        DownloadAndTryButton_cTzpE40$lambda$8($showErrorDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$56(final MutableState $showErrorDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C559@22354L27,559@22333L67:DownloadAndTryButton.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1315812377, $changed, -1, "com.google.ai.edge.gallery.ui.common.DownloadAndTryButton.<anonymous> (DownloadAndTryButton.kt:559)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1775308510, "CC(remember):DownloadAndTryButton.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DownloadAndTryButtonKt.DownloadAndTryButton_cTzpE40$lambda$56$lambda$55$lambda$54($showErrorDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$DownloadAndTryButtonKt.INSTANCE.getLambda$1990123978$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$56$lambda$55$lambda$54(MutableState $showErrorDialog$delegate) {
        DownloadAndTryButton_cTzpE40$lambda$8($showErrorDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$58$lambda$57(Function0 $handleClickButton, MutableState $showMemoryWarning$delegate) {
        $handleClickButton.invoke();
        DownloadAndTryButton_cTzpE40$lambda$11($showMemoryWarning$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$60$lambda$59(MutableState $showMemoryWarning$delegate) {
        DownloadAndTryButton_cTzpE40$lambda$11($showMemoryWarning$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$62$lambda$61(TosViewModel $tosViewModel, Function0 $checkMemoryAndClickDownloadButton, MutableState $showGemmaTermsOfUseDialog$delegate) {
        DownloadAndTryButton_cTzpE40$lambda$14($showGemmaTermsOfUseDialog$delegate, false);
        $tosViewModel.acceptGemmaTermsOfUse();
        $checkMemoryAndClickDownloadButton.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadAndTryButton_cTzpE40$lambda$64$lambda$63(MutableState $showGemmaTermsOfUseDialog$delegate) {
        DownloadAndTryButton_cTzpE40$lambda$14($showGemmaTermsOfUseDialog$delegate, false);
        return Unit.INSTANCE;
    }
}
