package com.google.ai.edge.gallery.proto;

import com.google.protobuf.MessageLiteOrBuilder;


public interface LlmBenchmarkResultOrBuilder extends MessageLiteOrBuilder {
    LlmBenchmarkBasicInfo getBaiscInfo();

    LlmBenchmarkStats getStats();

    boolean hasBaiscInfo();

    boolean hasStats();
}
