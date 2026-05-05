package com.google.ai.edge.litertlm;

import java.util.List;
import java.util.Map;

/**
 * Interface for LiteRT LM ToolSet API.
 * A ToolSet represents a collection of tools that can be called by the LLM.
 */
public interface ToolSet {
    /**
     * Returns the name of this tool set.
     */
    String getName();

    /**
     * Returns the description of this tool set.
     */
    String getDescription();

    /**
     * Returns the list of parameters for this tool set.
     */
    List<ToolParam> getParams();

    /**
     * Executes the tool with the given parameters.
     */
    Tool.ToolResult execute(Map<String, Object> params);
}
