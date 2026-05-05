package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.text.Regex;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m922d2 = {"IMPORTS_DIR", "", "NORMALIZE_NAME_REGEX", "Lkotlin/text/Regex;", "EMPTY_MODEL", "Lcom/google/ai/edge/gallery/data/Model;", "getEMPTY_MODEL", "()Lcom/google/ai/edge/gallery/data/Model;", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ModelKt {
    public static final String IMPORTS_DIR = "__imports";
    private static final Regex NORMALIZE_NAME_REGEX = new Regex("[^a-zA-Z0-9]");
    private static final Model EMPTY_MODEL = new Model("empty", null, null, null, null, null, null, "", 0, "empty.tflite", null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, false, null, 0, null, null, false, null, null, null, false, false, null, null, 0, null, false, null, -898, 32767, null);

    public static final Model getEMPTY_MODEL() {
        return EMPTY_MODEL;
    }
}
