package com.google.ai.edge.gallery.runtime.aicore;

import com.google.mlkit.genai.common.DownloadStatus;
import com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper$initialize$1$1", m932f = "AICoreModelHelper.kt", m933i = {0, 1}, m934l = {105, 106}, m935m = "emit", m936n = {"downloadStatus", "downloadStatus"}, m938s = {"L$0", "L$0"})
final class AICoreModelHelper$initialize$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AICoreModelHelper.C26141.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AICoreModelHelper$initialize$1$1$emit$1(AICoreModelHelper.C26141.AnonymousClass1<? super T> anonymousClass1, Continuation<? super AICoreModelHelper$initialize$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((DownloadStatus) null, (Continuation<? super Unit>) this);
    }
}
