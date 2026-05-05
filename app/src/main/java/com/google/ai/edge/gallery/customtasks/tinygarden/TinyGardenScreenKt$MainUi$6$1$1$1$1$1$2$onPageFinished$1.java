package com.google.ai.edge.gallery.customtasks.tinygarden;

import android.util.Log;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$MainUi$6$1$1$1$1$1$2$onPageFinished$1", m932f = "TinyGardenScreen.kt", m933i = {}, m934l = {540}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class TinyGardenScreenKt$MainUi$6$1$1$1$1$1$2$onPageFinished$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<WebView> $webViewRef$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TinyGardenScreenKt$MainUi$6$1$1$1$1$1$2$onPageFinished$1(MutableState<WebView> mutableState, Continuation<? super TinyGardenScreenKt$MainUi$6$1$1$1$1$1$2$onPageFinished$1> continuation) {
        super(2, continuation);
        this.$webViewRef$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TinyGardenScreenKt$MainUi$6$1$1$1$1$1$2$onPageFinished$1(this.$webViewRef$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TinyGardenScreenKt$MainUi$6$1$1$1$1$1$2$onPageFinished$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM11361constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        WebView $this$invokeSuspend_u24lambda_u240 = TinyGardenScreenKt.MainUi___WMjBM$lambda$14(this.$webViewRef$delegate);
        if ($this$invokeSuspend_u24lambda_u240 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                $this$invokeSuspend_u24lambda_u240.evaluateJavascript("tinyGarden.showHelp()", null);
                objM11361constructorimpl = Result.m11361constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM11361constructorimpl = Result.m11361constructorimpl(ResultKt.createFailure(th));
            }
            Throwable e = Result.m11364exceptionOrNullimpl(objM11361constructorimpl);
            if (e != null) {
                Log.e("AGTinyGarden", String.valueOf(e));
            }
            Result.m11360boximpl(objM11361constructorimpl);
        }
        return Unit.INSTANCE;
    }
}
