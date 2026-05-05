package com.google.ai.edge.gallery.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getTaskId", "()Ljava/lang/String;", "getModelName", "getWorkId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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

    
    public final String getTaskId() {
        return this.taskId;
    }

    
    public final String getModelName() {
        return this.modelName;
    }

    
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
