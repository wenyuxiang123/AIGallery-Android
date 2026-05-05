package com.google.ai.edge.gallery.ui.llmsingleturn;

import android.content.ClipData;
import androidx.compose.p000ui.platform.ClipEntry;
import androidx.compose.p000ui.platform.Clipboard;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ResponsePanel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.llmsingleturn.ResponsePanelKt$ResponsePanel$4$4$1$2$1$1", m932f = "ResponsePanel.kt", m933i = {0, 0}, m934l = {172}, m935m = "invokeSuspend", m936n = {"clipData", "clipEntry"}, m938s = {"L$0", "L$1"})
final class ResponsePanelKt$ResponsePanel$4$4$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Clipboard $clipboard;
    final /* synthetic */ String $response;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResponsePanelKt$ResponsePanel$4$4$1$2$1$1(String str, Clipboard clipboard, Continuation<? super ResponsePanelKt$ResponsePanel$4$4$1$2$1$1> continuation) {
        super(2, continuation);
        this.$response = str;
        this.$clipboard = clipboard;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResponsePanelKt$ResponsePanel$4$4$1$2$1$1(this.$response, this.$clipboard, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResponsePanelKt$ResponsePanel$4$4$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                ClipData clipData = ClipData.newPlainText("response", this.$response);
                Intrinsics.checkNotNull(clipData);
                ClipEntry clipEntry = new ClipEntry(clipData);
                this.L$0 = SpillingKt.nullOutSpilledVariable(clipData);
                this.L$1 = SpillingKt.nullOutSpilledVariable(clipEntry);
                this.label = 1;
                if (this.$clipboard.setClipEntry(clipEntry, this) == coroutine_suspended) {
                    return coroutine_suspended;
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
}
