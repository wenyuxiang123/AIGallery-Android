package com.google.ai.edge.gallery.p006ui.modelmanager;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import com.google.ai.edge.gallery.proto.AccessTokenData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelManagerViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/modelmanager/TokenStatusAndData;", "", NotificationCompat.CATEGORY_STATUS, "Lcom/google/ai/edge/gallery/ui/modelmanager/TokenStatus;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/google/ai/edge/gallery/proto/AccessTokenData;", "<init>", "(Lcom/google/ai/edge/gallery/ui/modelmanager/TokenStatus;Lcom/google/ai/edge/gallery/proto/AccessTokenData;)V", "getStatus", "()Lcom/google/ai/edge/gallery/ui/modelmanager/TokenStatus;", "getData", "()Lcom/google/ai/edge/gallery/proto/AccessTokenData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TokenStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
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
