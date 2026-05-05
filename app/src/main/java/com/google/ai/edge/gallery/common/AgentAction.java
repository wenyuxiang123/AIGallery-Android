package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Types.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/AgentAction;", "", "name", "Lcom/google/ai/edge/gallery/common/AgentActionName;", "<init>", "(Lcom/google/ai/edge/gallery/common/AgentActionName;)V", "getName", "()Lcom/google/ai/edge/gallery/common/AgentActionName;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public class AgentAction {
    public static final int $stable = 0;
    private final AgentActionName name;

    public AgentAction(AgentActionName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
    }

    public final AgentActionName getName() {
        return this.name;
    }
}
