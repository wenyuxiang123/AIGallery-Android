package com.google.ai.edge.gallery.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getName", "()Lcom/google/ai/edge/gallery/common/AgentActionName;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
