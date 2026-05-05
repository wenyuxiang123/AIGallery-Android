package com.google.ai.edge.litertlm;

/**
 * Stub class for LiteRT LM ExperimentalFlags API.
 * This class provides access to experimental feature flags.
 */
public final class ExperimentalFlags {
    public static final ExperimentalFlags INSTANCE = new ExperimentalFlags();

    private boolean enableConversationConstrainedDecoding = false;

    private ExperimentalFlags() {
    }

    public boolean isEnableConversationConstrainedDecoding() {
        return enableConversationConstrainedDecoding;
    }

    public void setEnableConversationConstrainedDecoding(boolean enable) {
        this.enableConversationConstrainedDecoding = enable;
    }
}
