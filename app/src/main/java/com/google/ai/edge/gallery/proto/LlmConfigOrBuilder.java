package com.google.ai.edge.gallery.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;


public interface LlmConfigOrBuilder extends MessageLiteOrBuilder {
    String getCompatibleAccelerators(int i);

    ByteString getCompatibleAcceleratorsBytes(int i);

    int getCompatibleAcceleratorsCount();

    List<String> getCompatibleAcceleratorsList();

    int getDefaultMaxTokens();

    float getDefaultTemperature();

    int getDefaultTopk();

    float getDefaultTopp();

    boolean getSupportAudio();

    boolean getSupportImage();

    boolean getSupportMobileActions();

    boolean getSupportThinking();

    boolean getSupportTinyGarden();
}
