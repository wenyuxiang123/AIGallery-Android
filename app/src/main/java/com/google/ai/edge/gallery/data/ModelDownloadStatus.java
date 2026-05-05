package com.google.ai.edge.gallery.data;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getStatus", "()Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;", "getTotalBytes", "()J", "getReceivedBytes", "getErrorMessage", "()Ljava/lang/String;", "getBytesPerSecond", "getRemainingMs", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class ModelDownloadStatus {
    public static final int $stable = 0;
    private final long bytesPerSecond;
    private final String errorMessage;
    private final long receivedBytes;
    private final long remainingMs;
    private final ModelDownloadStatusType status;
    private final long totalBytes;

    
    public final ModelDownloadStatusType getStatus() {
        return this.status;
    }

    
    public final long getTotalBytes() {
        return this.totalBytes;
    }

    
    public final long getReceivedBytes() {
        return this.receivedBytes;
    }

    
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    
    public final long getBytesPerSecond() {
        return this.bytesPerSecond;
    }

    
    public final long getRemainingMs() {
        return this.remainingMs;
    }

    public final ModelDownloadStatus copy(ModelDownloadStatusType status, long totalBytes, long receivedBytes, String errorMessage, long bytesPerSecond, long remainingMs) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new ModelDownloadStatus(status, totalBytes, receivedBytes, errorMessage, bytesPerSecond, remainingMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelDownloadStatus)) {
            return false;
        }
        ModelDownloadStatus modelDownloadStatus = (ModelDownloadStatus) other;
        return this.status == modelDownloadStatus.status && this.totalBytes == modelDownloadStatus.totalBytes && this.receivedBytes == modelDownloadStatus.receivedBytes && Intrinsics.areEqual(this.errorMessage, modelDownloadStatus.errorMessage) && this.bytesPerSecond == modelDownloadStatus.bytesPerSecond && this.remainingMs == modelDownloadStatus.remainingMs;
    }

    public int hashCode() {
        return (((((((((this.status.hashCode() * 31) + Long.hashCode(this.totalBytes)) * 31) + Long.hashCode(this.receivedBytes)) * 31) + this.errorMessage.hashCode()) * 31) + Long.hashCode(this.bytesPerSecond)) * 31) + Long.hashCode(this.remainingMs);
    }

    public String toString() {
        return "ModelDownloadStatus(status=" + this.status + ", totalBytes=" + this.totalBytes + ", receivedBytes=" + this.receivedBytes + ", errorMessage=" + this.errorMessage + ", bytesPerSecond=" + this.bytesPerSecond + ", remainingMs=" + this.remainingMs + ")";
    }

    public ModelDownloadStatus(ModelDownloadStatusType status, long totalBytes, long receivedBytes, String errorMessage, long bytesPerSecond, long remainingMs) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.status = status;
        this.totalBytes = totalBytes;
        this.receivedBytes = receivedBytes;
        this.errorMessage = errorMessage;
        this.bytesPerSecond = bytesPerSecond;
        this.remainingMs = remainingMs;
    }

    public /* synthetic */ ModelDownloadStatus(ModelDownloadStatusType modelDownloadStatusType, long j, long j2, String str, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modelDownloadStatusType, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? 0L : j3, (i & 32) == 0 ? j4 : 0L);
    }

    public final ModelDownloadStatusType getStatus() {
        return this.status;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public final long getReceivedBytes() {
        return this.receivedBytes;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final long getBytesPerSecond() {
        return this.bytesPerSecond;
    }

    public final long getRemainingMs() {
        return this.remainingMs;
    }
}
