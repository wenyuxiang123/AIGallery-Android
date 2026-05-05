package com.google.ai.edge.litertlm;

import java.util.List;

/**
 * Stub class for LiteRT LM Contents API.
 * This class is used to hold content for LLM requests.
 */
public abstract class Contents {
    public static final Contents INSTANCE = new Contents_Stub();

    public abstract List<Content> getParts();

    public static Contents of(List<? extends Content> parts) {
        return new Contents_Stub(parts);
    }

    private static class Contents_Stub extends Contents {
        private final List<Content> parts;

        public Contents_Stub() {
            this.parts = java.util.Collections.emptyList();
        }

        public Contents_Stub(List<? extends Content> parts) {
            this.parts = parts != null ? (List<Content>) parts : java.util.Collections.emptyList();
        }

        @Override
        public List<Content> getParts() {
            return parts;
        }
    }

    public static final class Companion {
        public final Contents of(List<? extends Content> parts) {
            return Contents.of(parts);
        }
    }
}
