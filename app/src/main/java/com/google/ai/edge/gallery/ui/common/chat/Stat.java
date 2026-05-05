package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/Stat;", "", "id", "", Constants.ScionAnalytics.PARAM_LABEL, "unit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLabel", "getUnit", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class Stat {
    public static final int $stable = 0;
    private final String id;
    private final String label;
    private final String unit;

    public static /* synthetic */ Stat copy$default(Stat stat, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stat.id;
        }
        if ((i & 2) != 0) {
            str2 = stat.label;
        }
        if ((i & 4) != 0) {
            str3 = stat.unit;
        }
        return stat.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public final Stat copy(String id, String label, String unit) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new Stat(id, label, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stat)) {
            return false;
        }
        Stat stat = (Stat) other;
        return Intrinsics.areEqual(this.id, stat.id) && Intrinsics.areEqual(this.label, stat.label) && Intrinsics.areEqual(this.unit, stat.unit);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.label.hashCode()) * 31) + this.unit.hashCode();
    }

    public String toString() {
        return "Stat(id=" + this.id + ", label=" + this.label + ", unit=" + this.unit + ")";
    }

    public Stat(String id, String label, String unit) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.id = id;
        this.label = label;
        this.unit = unit;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUnit() {
        return this.unit;
    }
}
