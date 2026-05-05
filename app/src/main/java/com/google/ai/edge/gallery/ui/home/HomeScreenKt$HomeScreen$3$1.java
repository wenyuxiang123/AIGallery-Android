package com.google.ai.edge.gallery.ui.home;

import android.content.Context;
import android.os.Build;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
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
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.home.HomeScreenKt$HomeScreen$3$1", m932f = "HomeScreen.kt", m933i = {}, m934l = {267}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class HomeScreenKt$HomeScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $requestPermissionLauncher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeScreenKt$HomeScreen$3$1(Context context, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher, Continuation<? super HomeScreenKt$HomeScreen$3$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$requestPermissionLauncher = managedActivityResultLauncher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeScreenKt$HomeScreen$3$1(this.$context, this.$requestPermissionLauncher, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeScreenKt$HomeScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (Build.VERSION.SDK_INT >= 33 && ContextCompat.checkSelfPermission(this.$context, "android.permission.POST_NOTIFICATIONS") != 0) {
            this.$requestPermissionLauncher.launch("android.permission.POST_NOTIFICATIONS");
        }
        return Unit.INSTANCE;
    }
}
