package com.google.ai.edge.gallery.p006ui.common.chat;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: MessageInputText.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$MessageInputText$pickMedia$1$1$1", m932f = "MessageInputText.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class MessageInputTextKt$MessageInputText$pickMedia$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<List<Bitmap>, Unit> $updatePickedImages;
    final /* synthetic */ List<Uri> $uris;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MessageInputTextKt$MessageInputText$pickMedia$1$1$1(Context context, List<Uri> list, Function1<? super List<Bitmap>, Unit> function1, Continuation<? super MessageInputTextKt$MessageInputText$pickMedia$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$uris = list;
        this.$updatePickedImages = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageInputTextKt$MessageInputText$pickMedia$1$1$1(this.$context, this.$uris, this.$updatePickedImages, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageInputTextKt$MessageInputText$pickMedia$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Context context = this.$context;
                List<Uri> list = this.$uris;
                final Function1<List<Bitmap>, Unit> function1 = this.$updatePickedImages;
                MessageInputTextKt.handleImagesSelected(context, list, new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$MessageInputText$pickMedia$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageInputTextKt$MessageInputText$pickMedia$1$1$1.invokeSuspend$lambda$0(function1, (List) obj);
                    }
                });
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Function1 $updatePickedImages, List bitmaps) {
        $updatePickedImages.invoke(bitmaps);
        return Unit.INSTANCE;
    }
}
