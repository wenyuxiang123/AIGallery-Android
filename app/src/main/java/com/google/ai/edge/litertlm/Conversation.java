package com.google.ai.edge.litertlm;

import java.util.List;

/**
 * Stub class for LiteRT LM Conversation API.
 * This class represents a conversation context for LLM interactions.
 */
public abstract class Conversation {
    /**
     * Closes and releases resources for this conversation.
     */
    public abstract void close();

    /**
     * Cancels any ongoing process in this conversation.
     */
    public abstract void cancelProcess();

    /**
     * Stub implementation of Conversation.
     */
    public static class Stub extends Conversation {
        @Override
        public void close() {
            // No-op stub
        }

        @Override
        public void cancelProcess() {
            // No-op stub
        }
    }
}
