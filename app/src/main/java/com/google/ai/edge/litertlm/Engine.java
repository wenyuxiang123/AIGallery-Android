package com.google.ai.edge.litertlm;

/**
 * Stub class for LiteRT LM Engine API.
 * This class represents the LLM inference engine.
 */
public abstract class Engine {
    /**
     * Closes and releases resources for this engine.
     */
    public abstract void close();

    /**
     * Creates a new conversation with the given configuration.
     */
    public abstract Conversation createConversation(ConversationConfig config);

    /**
     * Stub implementation of Engine.
     */
    public static class Stub extends Engine {
        @Override
        public void close() {
            // No-op stub
        }

        @Override
        public Conversation createConversation(ConversationConfig config) {
            return new Conversation.Stub();
        }
    }
}
