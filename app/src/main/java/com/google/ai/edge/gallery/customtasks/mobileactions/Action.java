package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getType", "()Lcom/google/ai/edge/gallery/customtasks/mobileactions/ActionType;", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getFunctionCallDetails", "()Lcom/google/ai/edge/gallery/customtasks/mobileactions/FunctionCallDetails;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public abstract class Action {
    public static final int $stable = 8;
    private final FunctionCallDetails functionCallDetails;
    private final ImageVector icon;
    private final ActionType type;

    public Action(ActionType type, ImageVector icon, FunctionCallDetails functionCallDetails) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(functionCallDetails, "functionCallDetails");
        this.type = type;
        this.icon = icon;
        this.functionCallDetails = functionCallDetails;
    }

    public final ActionType getType() {
        return this.type;
    }

    public final ImageVector getIcon() {
        return this.icon;
    }

    public final FunctionCallDetails getFunctionCallDetails() {
        return this.functionCallDetails;
    }
}
