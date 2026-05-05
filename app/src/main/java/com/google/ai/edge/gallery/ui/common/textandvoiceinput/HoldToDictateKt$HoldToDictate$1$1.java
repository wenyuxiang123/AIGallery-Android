package com.google.ai.edge.gallery.ui.common.textandvoiceinput;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: HoldToDictate.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateKt$HoldToDictate$1$1", m932f = "HoldToDictate.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class HoldToDictateKt$HoldToDictate$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Boolean> $recordAudioPermissionGranted$delegate;
    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $recordAudioPermissionLauncher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HoldToDictateKt$HoldToDictate$1$1(Context context, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher, MutableState<Boolean> mutableState, Continuation<? super HoldToDictateKt$HoldToDictate$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$recordAudioPermissionLauncher = managedActivityResultLauncher;
        this.$recordAudioPermissionGranted$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HoldToDictateKt$HoldToDictate$1$1(this.$context, this.$recordAudioPermissionLauncher, this.$recordAudioPermissionGranted$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HoldToDictateKt$HoldToDictate$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (ContextCompat.checkSelfPermission(this.$context, "android.permission.RECORD_AUDIO") == 0) {
                    HoldToDictateKt.HoldToDictate$lambda$3(this.$recordAudioPermissionGranted$delegate, true);
                } else {
                    this.$recordAudioPermissionLauncher.launch("android.permission.RECORD_AUDIO");
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
