package com.google.ai.edge.litertlm;

/**
 * Stub class for LiteRT LM Content API.
 * This class represents a piece of content (text, image, etc.) for LLM requests.
 */
public abstract class Content {
    public abstract String getText();

    public abstract ContentType getType();

    public enum ContentType {
        TEXT,
        IMAGE
    }

    public static final class Text extends Content {
        private final String text;

        public Text(String text) {
            this.text = text;
        }

        @Override
        public String getText() {
            return text;
        }

        @Override
        public ContentType getType() {
            return ContentType.TEXT;
        }
    }

    public static final class Image extends Content {
        private final byte[] imageData;

        public Image(byte[] imageData) {
            this.imageData = imageData;
        }

        @Override
        public String getText() {
            return null;
        }

        @Override
        public ContentType getType() {
            return ContentType.IMAGE;
        }

        public byte[] getImageData() {
            return imageData;
        }
    }
}
