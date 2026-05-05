package com.google.ai.edge.litertlm;

import java.util.List;

/**
 * Interface for LiteRT LM ToolProvider API.
 * A ToolProvider provides a list of tools for LLM function calling.
 */
public interface ToolProvider {
    /**
     * Returns the list of tools provided by this provider.
     */
    List<Tool> getTools();
}
