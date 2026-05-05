package com.google.ai.edge.litertlm;

/**
 * Stub class for LiteRT LM ToolKt extension functions.
 * This provides Kotlin extension-style creation of Tool instances.
 */
public class ToolKt {
    /**
     * Creates a Tool from a ToolSet.
     * This is a stub implementation.
     */
    public static Tool tool(ToolSet toolSet) {
        return new Tool_FromToolSet(toolSet);
    }

    private static class Tool_FromToolSet extends Tool {
        private final ToolSet toolSet;

        public Tool_FromToolSet(ToolSet toolSet) {
            this.toolSet = toolSet;
        }

        @Override
        public String getName() {
            return toolSet.getName();
        }

        @Override
        public String getDescription() {
            return toolSet.getDescription();
        }

        @Override
        public java.util.List<ToolParam> getParams() {
            return toolSet.getParams();
        }

        @Override
        public ToolResult execute(java.util.Map<String, Object> params) {
            return toolSet.execute(params);
        }
    }
}
