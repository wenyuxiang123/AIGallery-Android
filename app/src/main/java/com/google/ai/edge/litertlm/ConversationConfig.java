package com.google.ai.edge.litertlm;

import java.util.List;

/**
 * Stub class for LiteRT LM ConversationConfig API.
 * Configuration for creating a conversation.
 */
public final class ConversationConfig {
    private final Contents systemInstruction;
    private final List<Message> history;
    private final List<ToolProvider> tools;
    private final SamplerConfig samplerConfig;
    private final boolean enableImage;
    private final String responseMimeType;
    private final int maxTokens;
    private final String languageCode;

    public ConversationConfig(
            Contents systemInstruction,
            List<Message> history,
            List<ToolProvider> tools,
            SamplerConfig samplerConfig,
            boolean enableImage,
            String responseMimeType,
            int maxTokens,
            String languageCode) {
        this.systemInstruction = systemInstruction;
        this.history = history;
        this.tools = tools;
        this.samplerConfig = samplerConfig;
        this.enableImage = enableImage;
        this.responseMimeType = responseMimeType;
        this.maxTokens = maxTokens;
        this.languageCode = languageCode;
    }

    public Contents getSystemInstruction() {
        return systemInstruction;
    }

    public List<Message> getHistory() {
        return history;
    }

    public List<ToolProvider> getTools() {
        return tools;
    }

    public SamplerConfig getSamplerConfig() {
        return samplerConfig;
    }

    public boolean isEnableImage() {
        return enableImage;
    }

    public String getResponseMimeType() {
        return responseMimeType;
    }

    public int getMaxTokens() {
        return maxTokens;
    }

    public String getLanguageCode() {
        return languageCode;
    }
}
