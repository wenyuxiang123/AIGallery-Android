package com.google.ai.edge.gallery.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes5.dex */
public interface LlmBenchmarkBasicInfoOrBuilder extends MessageLiteOrBuilder {
    String getAccelerator();

    ByteString getAcceleratorBytes();

    String getAppVersion();

    ByteString getAppVersionBytes();

    int getDecodeTokens();

    long getEndMs();

    String getModelName();

    ByteString getModelNameBytes();

    int getNumberOfRuns();

    int getPrefillTokens();

    long getStartMs();
}
