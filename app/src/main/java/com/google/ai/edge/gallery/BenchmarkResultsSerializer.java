package com.google.ai.edge.gallery;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.BenchmarkResults;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;



V", "defaultValue", "getDefaultValue", "()Lcom/google/ai/edge/gallery/proto/BenchmarkResults;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", "output", "Ljava/io/OutputStream;", "(Lcom/google/ai/edge/gallery/proto/BenchmarkResults;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class BenchmarkResultsSerializer implements Serializer<BenchmarkResults> {
    public static final int $stable = 0;
    public static final BenchmarkResultsSerializer INSTANCE = new BenchmarkResultsSerializer();
    private static final BenchmarkResults defaultValue;

    private BenchmarkResultsSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(BenchmarkResults benchmarkResults, OutputStream output, Continuation $completion) {
        return writeTo2(benchmarkResults, output, (Continuation<? super Unit>) $completion);
    }

    static {
        BenchmarkResults defaultInstance = BenchmarkResults.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance(...)");
        defaultValue = defaultInstance;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public BenchmarkResults getDefaultValue() {
        return defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream input, Continuation<? super BenchmarkResults> continuation) throws IOException {
        try {
            BenchmarkResults from = BenchmarkResults.parseFrom(input);
            Intrinsics.checkNotNullExpressionValue(from, "parseFrom(...)");
            return from;
        } catch (InvalidProtocolBufferException exception) {
            throw new CorruptionException("Cannot read proto.", exception);
        }
    }

    
    public Object writeTo2(BenchmarkResults t, OutputStream output, Continuation<? super Unit> continuation) {
        t.writeTo(output);
        return Unit.INSTANCE;
    }
}
