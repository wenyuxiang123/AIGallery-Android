package com.google.ai.edge.gallery.proto;

import com.google.ai.edge.gallery.proto.ImportedModel;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;


public interface ImportedModelOrBuilder extends MessageLiteOrBuilder {
    ImportedModel.ConfigCase getConfigCase();

    String getFileName();

    ByteString getFileNameBytes();

    long getFileSize();

    LlmConfig getLlmConfig();

    boolean hasLlmConfig();
}
