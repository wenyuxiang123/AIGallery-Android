package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageSender.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/MessageLayoutConfig;", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "modifier", "Landroidx/compose/ui/Modifier;", "userLabel", "", "rightSideLabel", "<init>", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;)V", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getModifier", "()Landroidx/compose/ui/Modifier;", "getUserLabel", "()Ljava/lang/String;", "getRightSideLabel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class MessageLayoutConfig {
    public static final int $stable = 0;
    private final Arrangement.Horizontal horizontalArrangement;
    private final Modifier modifier;
    private final String rightSideLabel;
    private final String userLabel;

    public static /* synthetic */ MessageLayoutConfig copy$default(MessageLayoutConfig messageLayoutConfig, Arrangement.Horizontal horizontal, Modifier modifier, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            horizontal = messageLayoutConfig.horizontalArrangement;
        }
        if ((i & 2) != 0) {
            modifier = messageLayoutConfig.modifier;
        }
        if ((i & 4) != 0) {
            str = messageLayoutConfig.userLabel;
        }
        if ((i & 8) != 0) {
            str2 = messageLayoutConfig.rightSideLabel;
        }
        return messageLayoutConfig.copy(horizontal, modifier, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserLabel() {
        return this.userLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRightSideLabel() {
        return this.rightSideLabel;
    }

    public final MessageLayoutConfig copy(Arrangement.Horizontal horizontalArrangement, Modifier modifier, String userLabel, String rightSideLabel) {
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(userLabel, "userLabel");
        Intrinsics.checkNotNullParameter(rightSideLabel, "rightSideLabel");
        return new MessageLayoutConfig(horizontalArrangement, modifier, userLabel, rightSideLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageLayoutConfig)) {
            return false;
        }
        MessageLayoutConfig messageLayoutConfig = (MessageLayoutConfig) other;
        return Intrinsics.areEqual(this.horizontalArrangement, messageLayoutConfig.horizontalArrangement) && Intrinsics.areEqual(this.modifier, messageLayoutConfig.modifier) && Intrinsics.areEqual(this.userLabel, messageLayoutConfig.userLabel) && Intrinsics.areEqual(this.rightSideLabel, messageLayoutConfig.rightSideLabel);
    }

    public int hashCode() {
        return (((((this.horizontalArrangement.hashCode() * 31) + this.modifier.hashCode()) * 31) + this.userLabel.hashCode()) * 31) + this.rightSideLabel.hashCode();
    }

    public String toString() {
        return "MessageLayoutConfig(horizontalArrangement=" + this.horizontalArrangement + ", modifier=" + this.modifier + ", userLabel=" + this.userLabel + ", rightSideLabel=" + this.rightSideLabel + ")";
    }

    public MessageLayoutConfig(Arrangement.Horizontal horizontalArrangement, Modifier modifier, String userLabel, String rightSideLabel) {
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(userLabel, "userLabel");
        Intrinsics.checkNotNullParameter(rightSideLabel, "rightSideLabel");
        this.horizontalArrangement = horizontalArrangement;
        this.modifier = modifier;
        this.userLabel = userLabel;
        this.rightSideLabel = rightSideLabel;
    }

    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final String getUserLabel() {
        return this.userLabel;
    }

    public final String getRightSideLabel() {
        return this.rightSideLabel;
    }
}
