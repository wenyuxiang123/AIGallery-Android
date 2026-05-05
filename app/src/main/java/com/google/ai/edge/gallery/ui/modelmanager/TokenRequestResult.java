package com.google.ai.edge.gallery.ui.modelmanager;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelManagerViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/modelmanager/TokenRequestResult;", "", NotificationCompat.CATEGORY_STATUS, "Lcom/google/ai/edge/gallery/ui/modelmanager/TokenRequestResultType;", "errorMessage", "", "<init>", "(Lcom/google/ai/edge/gallery/ui/modelmanager/TokenRequestResultType;Ljava/lang/String;)V", "getStatus", "()Lcom/google/ai/edge/gallery/ui/modelmanager/TokenRequestResultType;", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TokenRequestResultType getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
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
