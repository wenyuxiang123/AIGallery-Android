package com.google.ai.edge.gallery.proto;

import com.google.ai.edge.gallery.proto.BenchmarkResult;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes5.dex */
public interface BenchmarkResultOrBuilder extends MessageLiteOrBuilder {
    LlmBenchmarkResult getLlmResult();

    BenchmarkResult.ResultCase getResultCase();

    boolean hasLlmResult();
}
