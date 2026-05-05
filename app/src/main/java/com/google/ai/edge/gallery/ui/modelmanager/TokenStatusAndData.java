package com.google.ai.edge.gallery.ui.modelmanager;

import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import com.google.ai.edge.gallery.proto.AccessTokenData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getStatus", "()Lcom/google/ai/edge/gallery/ui/modelmanager/TokenStatus;", "getData", "()Lcom/google/ai/edge/gallery/proto/AccessTokenData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class TokenStatusAndData {
    public static final int $stable = 0;
    private final AccessTokenData data;
    private final TokenStatus status;

    public static /* synthetic */ TokenStatusAndData copy$default(TokenStatusAndData tokenStatusAndData, TokenStatus tokenStatus, AccessTokenData accessTokenData, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenStatus = tokenStatusAndData.status;
        }
        if ((i & 2) != 0) {
            accessTokenData = tokenStatusAndData.data;
        }
        return tokenStatusAndData.copy(tokenStatus, accessTokenData);
    }

    
    public final TokenStatus getStatus() {
        return this.status;
    }

    
    public final AccessTokenData getData() {
        return this.data;
    }

    public final TokenStatusAndData copy(TokenStatus status, AccessTokenData data) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new TokenStatusAndData(status, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenStatusAndData)) {
            return false;
        }
        TokenStatusAndData tokenStatusAndData = (TokenStatusAndData) other;
        return this.status == tokenStatusAndData.status && Intrinsics.areEqual(this.data, tokenStatusAndData.data);
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + (this.data == null ? 0 : this.data.hashCode());
    }

    public String toString() {
        return "TokenStatusAndData(status=" + this.status + ", data=" + this.data + ")";
    }

    public TokenStatusAndData(TokenStatus status, AccessTokenData data) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.data = data;
    }

    public final AccessTokenData getData() {
        return this.data;
    }

    public final TokenStatus getStatus() {
        return this.status;
    }
}
