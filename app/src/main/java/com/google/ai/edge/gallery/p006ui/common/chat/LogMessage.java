package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001c"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/LogMessage;", "", FirebaseAnalytics.Param.LEVEL, "Lcom/google/ai/edge/gallery/ui/common/chat/LogMessageLevel;", "source", "", "lineNumber", "", "message", "<init>", "(Lcom/google/ai/edge/gallery/ui/common/chat/LogMessageLevel;Ljava/lang/String;ILjava/lang/String;)V", "getLevel", "()Lcom/google/ai/edge/gallery/ui/common/chat/LogMessageLevel;", "getSource", "()Ljava/lang/String;", "getLineNumber", "()I", "getMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class LogMessage {
    public static final int $stable = 0;
    private final LogMessageLevel level;
    private final int lineNumber;
    private final String message;
    private final String source;

    public LogMessage() {
        this(null, null, 0, null, 15, null);
    }

    public static /* synthetic */ LogMessage copy$default(LogMessage logMessage, LogMessageLevel logMessageLevel, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            logMessageLevel = logMessage.level;
        }
        if ((i2 & 2) != 0) {
            str = logMessage.source;
        }
        if ((i2 & 4) != 0) {
            i = logMessage.lineNumber;
        }
        if ((i2 & 8) != 0) {
            str2 = logMessage.message;
        }
        return logMessage.copy(logMessageLevel, str, i, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LogMessageLevel getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLineNumber() {
        return this.lineNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final LogMessage copy(LogMessageLevel level, String source, int lineNumber, String message) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(message, "message");
        return new LogMessage(level, source, lineNumber, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogMessage)) {
            return false;
        }
        LogMessage logMessage = (LogMessage) other;
        return this.level == logMessage.level && Intrinsics.areEqual(this.source, logMessage.source) && this.lineNumber == logMessage.lineNumber && Intrinsics.areEqual(this.message, logMessage.message);
    }

    public int hashCode() {
        return (((((this.level.hashCode() * 31) + this.source.hashCode()) * 31) + Integer.hashCode(this.lineNumber)) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "LogMessage(level=" + this.level + ", source=" + this.source + ", lineNumber=" + this.lineNumber + ", message=" + this.message + ")";
    }

    public LogMessage(LogMessageLevel level, String source, int lineNumber, String message) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(message, "message");
        this.level = level;
        this.source = source;
        this.lineNumber = lineNumber;
        this.message = message;
    }

    public /* synthetic */ LogMessage(LogMessageLevel logMessageLevel, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? LogMessageLevel.Info : logMessageLevel, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? "" : str2);
    }

    public final LogMessageLevel getLevel() {
        return this.level;
    }

    public final String getSource() {
        return this.source;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final String getMessage() {
        return this.message;
    }
}
