package com.google.ai.edge.gallery.ui.common.chat;

import android.content.Context;
import android.net.Uri;
import com.google.ai.edge.gallery.common.AudioClip;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$MessageInputText$pickWav$1$1$1$1", m932f = "MessageInputText.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class MessageInputTextKt$MessageInputText$pickWav$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<List<AudioClip>, Unit> $updatePickedAudioClips;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MessageInputTextKt$MessageInputText$pickWav$1$1$1$1(Context context, Uri uri, Function1<? super List<AudioClip>, Unit> function1, Continuation<? super MessageInputTextKt$MessageInputText$pickWav$1$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$uri = uri;
        this.$updatePickedAudioClips = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageInputTextKt$MessageInputText$pickWav$1$1$1$1(this.$context, this.$uri, this.$updatePickedAudioClips, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageInputTextKt$MessageInputText$pickWav$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Context context = this.$context;
                Uri uri = this.$uri;
                final Function1<List<AudioClip>, Unit> function1 = this.$updatePickedAudioClips;
                MessageInputTextKt.handleAudioWavSelected(context, uri, new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$MessageInputText$pickWav$1$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageInputTextKt$MessageInputText$pickWav$1$1$1$1.invokeSuspend$lambda$0(function1, (AudioClip) obj);
                    }
                });
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    
    public static final Unit invokeSuspend$lambda$0(Function1 $updatePickedAudioClips, AudioClip audioClip) {
        $updatePickedAudioClips.invoke(CollectionsKt.listOf(new AudioClip(audioClip.getAudioData(), audioClip.getSampleRate())));
        return Unit.INSTANCE;
    }
}
