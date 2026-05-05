package com.google.ai.edge.gallery.proto;

import com.google.protobuf.MessageLiteOrBuilder;


public interface LlmBenchmarkStatsOrBuilder extends MessageLiteOrBuilder {
    ValueSeries getDecodeSpeed();

    double getFirstInitTimeMs();

    ValueSeries getNonFirstInitTimeMs();

    ValueSeries getPrefillSpeed();

    ValueSeries getTimeToFirstToken();

    boolean hasDecodeSpeed();

    boolean hasNonFirstInitTimeMs();

    boolean hasPrefillSpeed();

    boolean hasTimeToFirstToken();
}
