package com.google.ai.edge.litertlm;

/**
 * Stub class for LiteRT LM MessageCallback API.
 * Callback interface for receiving messages during inference.
 */
public interface MessageCallback {
    /**
     * Called when a new message is received.
     */
    void onMessage(Message message);

    /**
     * Called when there is a partial result.
     */
    void onPartialResult(String partialResult);

    /**
     * Called when inference is done.
     */
    void onDone();

    /**
     * Called when there is an error.
     */
    void onError(Throwable throwable);

    /**
     * Stub implementation of MessageCallback.
     */
    public static final class Stub implements MessageCallback {
        @Override
        public void onMessage(Message message) {
            // No-op stub
        }

        @Override
        public void onPartialResult(String partialResult) {
            // No-op stub
        }

        @Override
        public void onDone() {
            // No-op stub
        }

        @Override
        public void onError(Throwable throwable) {
            // No-op stub
        }
    }
}
