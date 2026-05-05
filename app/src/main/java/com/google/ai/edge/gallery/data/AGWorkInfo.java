package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DownloadRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/AGWorkInfo;", "", "taskId", "", "modelName", "workId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTaskId", "()Ljava/lang/String;", "getModelName", "getWorkId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class AGWorkInfo {
    public static final int $stable = 0;
    private final String modelName;
    private final String taskId;
    private final String workId;

    public static /* synthetic */ AGWorkInfo copy$default(AGWorkInfo aGWorkInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aGWorkInfo.taskId;
        }
        if ((i & 2) != 0) {
            str2 = aGWorkInfo.modelName;
        }
        if ((i & 4) != 0) {
            str3 = aGWorkInfo.workId;
        }
        return aGWorkInfo.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModelName() {
        return this.modelName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWorkId() {
        return this.workId;
    }

    public final AGWorkInfo copy(String taskId, String modelName, String workId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(modelName, "modelName");
        Intrinsics.checkNotNullParameter(workId, "workId");
        return new AGWorkInfo(taskId, modelName, workId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AGWorkInfo)) {
            return false;
        }
        AGWorkInfo aGWorkInfo = (AGWorkInfo) other;
        return Intrinsics.areEqual(this.taskId, aGWorkInfo.taskId) && Intrinsics.areEqual(this.modelName, aGWorkInfo.modelName) && Intrinsics.areEqual(this.workId, aGWorkInfo.workId);
    }

    public int hashCode() {
        return (((this.taskId.hashCode() * 31) + this.modelName.hashCode()) * 31) + this.workId.hashCode();
    }

    public String toString() {
        return "AGWorkInfo(taskId=" + this.taskId + ", modelName=" + this.modelName + ", workId=" + this.workId + ")";
    }

    public AGWorkInfo(String taskId, String modelName, String workId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(modelName, "modelName");
        Intrinsics.checkNotNullParameter(workId, "workId");
        this.taskId = taskId;
        this.modelName = modelName;
        this.workId = workId;
    }

    public final String getModelName() {
        return this.modelName;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String getWorkId() {
        return this.workId;
    }
}
