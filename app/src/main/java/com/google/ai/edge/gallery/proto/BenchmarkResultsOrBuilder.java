package com.google.ai.edge.gallery.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;


public interface BenchmarkResultsOrBuilder extends MessageLiteOrBuilder {
    BenchmarkResult getResult(int i);

    int getResultCount();

    List<BenchmarkResult> getResultList();
}
