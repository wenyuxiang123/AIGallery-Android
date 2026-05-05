package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Types.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/SkillProgressAgentAction;", "Lcom/google/ai/edge/gallery/common/AgentAction;", Constants.ScionAnalytics.PARAM_LABEL, "", "inProgress", "", "addItemTitle", "addItemDescription", "customData", "", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getLabel", "()Ljava/lang/String;", "getInProgress", "()Z", "getAddItemTitle", "getAddItemDescription", "getCustomData", "()Ljava/lang/Object;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
