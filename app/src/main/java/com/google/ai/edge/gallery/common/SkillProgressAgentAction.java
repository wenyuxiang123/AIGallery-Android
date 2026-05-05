package com.google.ai.edge.gallery.common;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getLabel", "()Ljava/lang/String;", "getInProgress", "()Z", "getAddItemTitle", "getAddItemDescription", "getCustomData", "()Ljava/lang/Object;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class SkillProgressAgentAction extends AgentAction {
    public static final int $stable = 8;
    private final String addItemDescription;
    private final String addItemTitle;
    private final Object customData;
    private final boolean inProgress;
    private final String label;

    public /* synthetic */ SkillProgressAgentAction(String str, boolean z, String str2, String str3, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : obj);
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getInProgress() {
        return this.inProgress;
    }

    public final String getAddItemTitle() {
        return this.addItemTitle;
    }

    public final String getAddItemDescription() {
        return this.addItemDescription;
    }

    public final Object getCustomData() {
        return this.customData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillProgressAgentAction(String label, boolean inProgress, String addItemTitle, String addItemDescription, Object customData) {
        super(AgentActionName.SKILL_PROGRESS);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(addItemTitle, "addItemTitle");
        Intrinsics.checkNotNullParameter(addItemDescription, "addItemDescription");
        this.label = label;
        this.inProgress = inProgress;
        this.addItemTitle = addItemTitle;
        this.addItemDescription = addItemDescription;
        this.customData = customData;
    }
}
