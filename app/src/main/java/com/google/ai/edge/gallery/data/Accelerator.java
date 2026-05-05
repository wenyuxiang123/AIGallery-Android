package com.google.ai.edge.gallery.data;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;



V", "getLabel", "()Ljava/lang/String;", "CPU", "GPU", "NPU", "TPU", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public enum Accelerator {
    CPU("CPU"),
    GPU("GPU"),
    NPU("NPU"),
    TPU("TPU");

    private final String label;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<Accelerator> getEntries() {
        return $ENTRIES;
    }

    Accelerator(String label) {
        this.label = label;
    }

    public final String getLabel() {
        return this.label;
    }
}
