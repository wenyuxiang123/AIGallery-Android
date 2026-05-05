package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006#"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;", "", NotificationCompat.CATEGORY_STATUS, "Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;", "totalBytes", "", "receivedBytes", "errorMessage", "", "bytesPerSecond", "remainingMs", "<init>", "(Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;JJLjava/lang/String;JJ)V", "getStatus", "()Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;", "getTotalBytes", "()J", "getReceivedBytes", "getErrorMessage", "()Ljava/lang/String;", "getBytesPerSecond", "getRemainingMs", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class ModelDownloadStatus {
    public static final int $stable = 0;
    private final long bytesPerSecond;
    private final String errorMessage;
    private final long receivedBytes;
    private final long remainingMs;
    private final ModelDownloadStatusType status;
    private final long totalBytes;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ModelDownloadStatusType getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTotalBytes() {
        return this.totalBytes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getReceivedBytes() {
        return this.receivedBytes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getBytesPerSecond() {
        return this.bytesPerSecond;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
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
