package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Actions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/Action;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/google/ai/edge/gallery/customtasks/mobileactions/ActionType;", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "functionCallDetails", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/FunctionCallDetails;", "<init>", "(Lcom/google/ai/edge/gallery/customtasks/mobileactions/ActionType;Landroidx/compose/ui/graphics/vector/ImageVector;Lcom/google/ai/edge/gallery/customtasks/mobileactions/FunctionCallDetails;)V", "getType", "()Lcom/google/ai/edge/gallery/customtasks/mobileactions/ActionType;", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getFunctionCallDetails", "()Lcom/google/ai/edge/gallery/customtasks/mobileactions/FunctionCallDetails;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
