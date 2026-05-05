package com.google.ai.edge.gallery.data;

import kotlin.Metadata;
import kotlin.text.Regex;



Lcom/google/ai/edge/gallery/data/Model;", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class ModelKt {
    public static final String IMPORTS_DIR = "__imports";
    private static final Regex NORMALIZE_NAME_REGEX = new Regex("[^a-zA-Z0-9]");
    private static final Model EMPTY_MODEL = new Model("empty", null, null, null, null, null, null, "", 0, "empty.tflite", null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, false, null, 0, null, null, false, null, null, null, false, false, null, null, 0, null, false, null, -898, 32767, null);

    public static final Model getEMPTY_MODEL() {
        return EMPTY_MODEL;
    }
}
