package com.google.ai.edge.gallery.p006ui.common;

import android.util.Log;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$authResultLauncher$1$1$1$1 */
/* JADX INFO: compiled from: DownloadAndTryButton.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$authResultLauncher$1$1$1$1", m932f = "DownloadAndTryButton.kt", m933i = {}, m934l = {220}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class C2668x8ef9ac22 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Model $model;
    final /* synthetic */ ModelManagerViewModel $modelManagerViewModel;
    final /* synthetic */ MutableState<Boolean> $showAgreementAckSheet$delegate;
    final /* synthetic */ Function1<String, Unit> $startDownload;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C2668x8ef9ac22(ModelManagerViewModel modelManagerViewModel, Model model, MutableState<Boolean> mutableState, Function1<? super String, Unit> function1, Continuation<? super C2668x8ef9ac22> continuation) {
        super(2, continuation);
        this.$modelManagerViewModel = modelManagerViewModel;
        this.$model = model;
        this.$showAgreementAckSheet$delegate = mutableState;
        this.$startDownload = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C2668x8ef9ac22(this.$modelManagerViewModel, this.$model, this.$showAgreementAckSheet$delegate, this.$startDownload, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C2668x8ef9ac22) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$modelManagerViewModel.getModelUrlResponse(this.$model, this.$modelManagerViewModel.getCurAccessToken()) == 403) {
                    Log.d("AGDownloadAndTryButton", "Model '" + this.$model.getName() + "' needs user agreement ack.");
                    DownloadAndTryButtonKt.DownloadAndTryButton_cTzpE40$lambda$5(this.$showAgreementAckSheet$delegate, true);
                } else {
                    Log.d("AGDownloadAndTryButton", "Model '" + this.$model.getName() + "' does NOT need user agreement ack. Start downloading...");
                    this.label = 1;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$startDownload, this.$modelManagerViewModel, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$authResultLauncher$1$1$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: DownloadAndTryButton.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$authResultLauncher$1$1$1$1$1", m932f = "DownloadAndTryButton.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ModelManagerViewModel $modelManagerViewModel;
        final /* synthetic */ Function1<String, Unit> $startDownload;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super String, Unit> function1, ModelManagerViewModel modelManagerViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$startDownload = function1;
            this.$modelManagerViewModel = modelManagerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$startDownload, this.$modelManagerViewModel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.$startDownload.invoke(this.$modelManagerViewModel.getCurAccessToken());
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
