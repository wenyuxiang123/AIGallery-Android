package com.google.ai.edge.litertlm;

/**
 * Stub class for LiteRT LM SamplerConfig API.
 * Configuration for the LLM sampler.
 */
public final class SamplerConfig {
    private final int topK;
    private final float topP;
    private final float temperature;
    private final int seed;
    private final int maxTokens;

    public SamplerConfig(int topK, float topP, float temperature, int seed, int maxTokens) {
        this(topK, topP, temperature, seed, maxTokens, null);
    }

    public SamplerConfig(int topK, float topP, float temperature, int seed, int maxTokens, String stopSequences) {
        this.topK = topK;
        this.topP = topP;
        this.temperature = temperature;
        this.seed = seed;
        this.maxTokens = maxTokens;
    }

    public int getTopK() {
        return topK;
    }

    public float getTopP() {
        return topP;
    }

    public float getTemperature() {
        return temperature;
    }

    public int getSeed() {
        return seed;
    }

    public int getMaxTokens() {
        return maxTokens;
    }
}
