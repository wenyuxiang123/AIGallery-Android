package com.google.ai.edge.gallery.ui.modelmanager;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.MutableState;
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




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$GlobalModelManager$10$1$1$1", m932f = "GlobalModelManager.kt", m933i = {}, m934l = {412}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class GlobalModelManagerKt$GlobalModelManager$10$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityResultLauncher<Intent> $filePickerLauncher;
    final /* synthetic */ MutableState<Boolean> $showImportModelSheet$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlobalModelManagerKt$GlobalModelManager$10$1$1$1(ActivityResultLauncher<Intent> activityResultLauncher, MutableState<Boolean> mutableState, Continuation<? super GlobalModelManagerKt$GlobalModelManager$10$1$1$1> continuation) {
        super(2, continuation);
        this.$filePickerLauncher = activityResultLauncher;
        this.$showImportModelSheet$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GlobalModelManagerKt$GlobalModelManager$10$1$1$1(this.$filePickerLauncher, this.$showImportModelSheet$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GlobalModelManagerKt$GlobalModelManager$10$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (DelayKt.delay(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        GlobalModelManagerKt.GlobalModelManager$lambda$12(this.$showImportModelSheet$delegate, false);
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        this.$filePickerLauncher.launch(intent);
        return Unit.INSTANCE;
    }
}
