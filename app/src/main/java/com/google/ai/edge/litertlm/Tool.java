package com.google.ai.edge.litertlm;

import java.util.List;
import java.util.Map;

/**
 * Stub class for LiteRT LM Tool API.
 * This class represents a tool that can be called by the LLM.
 */
public abstract class Tool {
    public abstract String getName();

    public abstract String getDescription();

    public abstract List<ToolParam> getParams();

    public abstract ToolResult execute(Map<String, Object> params);

    /**
     * Stub class for Tool parameters.
     */
    public static abstract class ToolParam {
        public abstract String getName();

        public abstract String getType();

        public abstract String getDescription();

        public abstract boolean isRequired();

        public static ToolParam create(String name, String type, String description, boolean required) {
            return new ToolParam_Stub(name, type, description, required);
        }

        private static class ToolParam_Stub extends ToolParam {
            private final String name;
            private final String type;
            private final String description;
            private final boolean required;

            public ToolParam_Stub(String name, String type, String description, boolean required) {
                this.name = name;
                this.type = type;
                this.description = description;
                this.required = required;
            }

            @Override
            public String getName() {
                return name;
            }

            @Override
            public String getType() {
                return type;
            }

            @Override
            public String getDescription() {
                return description;
            }

            @Override
            public boolean isRequired() {
                return required;
            }
        }
    }

    /**
     * Stub class for Tool execution result.
     */
    public static class ToolResult {
        private final String text;
        private final boolean isError;

        public ToolResult(String text) {
            this(text, false);
        }

        public ToolResult(String text, boolean isError) {
            this.text = text;
            this.isError = isError;
        }

        public String getText() {
            return text;
        }

        public boolean isError() {
            return isError;
        }
    }
}
