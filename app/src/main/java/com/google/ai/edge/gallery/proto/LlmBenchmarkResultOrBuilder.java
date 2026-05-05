package com.google.ai.edge.gallery.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes5.dex */
public interface LlmBenchmarkResultOrBuilder extends MessageLiteOrBuilder {
    LlmBenchmarkBasicInfo getBaiscInfo();

    LlmBenchmarkStats getStats();

    boolean hasBaiscInfo();

    boolean hasStats();
}
