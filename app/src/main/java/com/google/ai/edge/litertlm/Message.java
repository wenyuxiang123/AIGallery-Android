package com.google.ai.edge.litertlm;

import java.util.List;

/**
 * Stub class for LiteRT LM Message API.
 * This class represents a message in a conversation.
 */
public abstract class Message {
    public abstract String getText();

    public abstract Role getRole();

    public abstract List<Content> getContent();

    public enum Role {
        USER,
        MODEL
    }

    public static final class Builder {
        private String text;
        private Role role;
        private List<Content> content;

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setRole(Role role) {
            this.role = role;
            return this;
        }

        public Builder setContent(List<Content> content) {
            this.content = content;
            return this;
        }

        public Message build() {
            return new Message_Stub(text, role, content);
        }
    }

    private static class Message_Stub extends Message {
        private final String text;
        private final Role role;
        private final List<Content> content;

        public Message_Stub(String text, Role role, List<Content> content) {
            this.text = text;
            this.role = role;
            this.content = content;
        }

        @Override
        public String getText() {
            return text;
        }

        @Override
        public Role getRole() {
            return role;
        }

        @Override
        public List<Content> getContent() {
            return content;
        }
    }
}
