package com.google.ai.edge.gallery.ui.modelmanager;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getStatus", "()Lcom/google/ai/edge/gallery/ui/modelmanager/TokenRequestResultType;", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class TokenRequestResult {
    public static final int $stable = 0;
    private final String errorMessage;
    private final TokenRequestResultType status;

    public static /* synthetic */ TokenRequestResult copy$default(TokenRequestResult tokenRequestResult, TokenRequestResultType tokenRequestResultType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenRequestResultType = tokenRequestResult.status;
        }
        if ((i & 2) != 0) {
            str = tokenRequestResult.errorMessage;
        }
        return tokenRequestResult.copy(tokenRequestResultType, str);
    }

    
    public final TokenRequestResultType getStatus() {
        return this.status;
    }

    
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final TokenRequestResult copy(TokenRequestResultType status, String errorMessage) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new TokenRequestResult(status, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenRequestResult)) {
            return false;
        }
        TokenRequestResult tokenRequestResult = (TokenRequestResult) other;
        return this.status == tokenRequestResult.status && Intrinsics.areEqual(this.errorMessage, tokenRequestResult.errorMessage);
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + (this.errorMessage == null ? 0 : this.errorMessage.hashCode());
    }

    public String toString() {
        return "TokenRequestResult(status=" + this.status + ", errorMessage=" + this.errorMessage + ")";
    }

    public TokenRequestResult(TokenRequestResultType status, String errorMessage) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.errorMessage = errorMessage;
    }

    public /* synthetic */ TokenRequestResult(TokenRequestResultType tokenRequestResultType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenRequestResultType, (i & 2) != 0 ? null : str);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final TokenRequestResultType getStatus() {
        return this.status;
    }
}
