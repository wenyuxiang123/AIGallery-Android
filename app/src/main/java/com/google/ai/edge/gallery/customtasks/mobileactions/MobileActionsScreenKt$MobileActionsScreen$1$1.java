package com.google.ai.edge.gallery.customtasks.mobileactions;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
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




@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$MobileActionsScreen$1$1", m932f = "MobileActionsScreen.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class MobileActionsScreenKt$MobileActionsScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $recordAudioClipsPermissionLauncher;
    final /* synthetic */ MutableState<Boolean> $recordAudioPermissionGranted$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobileActionsScreenKt$MobileActionsScreen$1$1(Context context, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher, MutableState<Boolean> mutableState, Continuation<? super MobileActionsScreenKt$MobileActionsScreen$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$recordAudioClipsPermissionLauncher = managedActivityResultLauncher;
        this.$recordAudioPermissionGranted$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MobileActionsScreenKt$MobileActionsScreen$1$1(this.$context, this.$recordAudioClipsPermissionLauncher, this.$recordAudioPermissionGranted$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MobileActionsScreenKt$MobileActionsScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (ContextCompat.checkSelfPermission(this.$context, "android.permission.RECORD_AUDIO") == 0) {
                    MobileActionsScreenKt.MobileActionsScreen_aA_HZ9I$lambda$2(this.$recordAudioPermissionGranted$delegate, true);
                } else {
                    this.$recordAudioClipsPermissionLauncher.launch("android.permission.RECORD_AUDIO");
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
