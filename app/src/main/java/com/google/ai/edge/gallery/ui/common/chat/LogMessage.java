package com.google.ai.edge.gallery.ui.common.chat;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getLevel", "()Lcom/google/ai/edge/gallery/ui/common/chat/LogMessageLevel;", "getSource", "()Ljava/lang/String;", "getLineNumber", "()I", "getMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
