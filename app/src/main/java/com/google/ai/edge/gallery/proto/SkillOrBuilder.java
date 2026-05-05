package com.google.ai.edge.gallery.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes5.dex */
public interface SkillOrBuilder extends MessageLiteOrBuilder {
    boolean getBuiltIn();

    String getDescription();

    ByteString getDescriptionBytes();

    String getHomepage();

    ByteString getHomepageBytes();

    String getImportDirName();

    ByteString getImportDirNameBytes();

    String getInstructions();

    ByteString getInstructionsBytes();

    String getName();

    ByteString getNameBytes();

    boolean getRequireSecret();

    String getRequireSecretDescription();

    ByteString getRequireSecretDescriptionBytes();

    boolean getSelected();

    String getSkillUrl();

    ByteString getSkillUrlBytes();
}
