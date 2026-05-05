package com.google.ai.edge.gallery;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Analytics.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m922d2 = {"Lcom/google/ai/edge/gallery/GalleryEvent;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "CAPABILITY_SELECT", "MODEL_DOWNLOAD", "GENERATE_ACTION", "BUTTON_CLICKED", "SKILL_MANAGEMENT", "SKILL_EXECUTION", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public enum GalleryEvent {
    CAPABILITY_SELECT("capability_select"),
    MODEL_DOWNLOAD("model_download"),
    GENERATE_ACTION("generate_action"),
    BUTTON_CLICKED("button_clicked"),
    SKILL_MANAGEMENT("skill_management"),
    SKILL_EXECUTION("skill_execution");

    private final String id;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<GalleryEvent> getEntries() {
        return $ENTRIES;
    }

    GalleryEvent(String id) {
        this.id = id;
    }

    public final String getId() {
        return this.id;
    }
}
