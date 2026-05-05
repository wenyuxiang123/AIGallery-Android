package com.google.ai.edge.gallery.proto;

import com.google.ai.edge.gallery.proto.BenchmarkResult;
import com.google.protobuf.MessageLiteOrBuilder;


public interface BenchmarkResultOrBuilder extends MessageLiteOrBuilder {
    LlmBenchmarkResult getLlmResult();

    BenchmarkResult.ResultCase getResultCase();

    boolean hasLlmResult();
}
