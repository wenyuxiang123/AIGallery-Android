package com.google.ai.edge.gallery.customtasks.agentchat;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;




public final class AgentToolsKt {
    private static final String TAG = "AGAgentTools";

    public static final String getSkillSecretKey(String skillName) {
        Intrinsics.checkNotNullParameter(skillName, "skillName");
        return "skill___" + skillName;
    }
}
