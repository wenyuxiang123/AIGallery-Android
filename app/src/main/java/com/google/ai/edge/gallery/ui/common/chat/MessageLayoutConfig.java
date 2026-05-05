package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p000ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getModifier", "()Landroidx/compose/ui/Modifier;", "getUserLabel", "()Ljava/lang/String;", "getRightSideLabel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
