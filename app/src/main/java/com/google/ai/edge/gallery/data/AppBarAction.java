package com.google.ai.edge.gallery.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;



V", "getActionType", "()Lcom/google/ai/edge/gallery/data/AppBarActionType;", "getActionFn", "()Lkotlin/jvm/functions/Function0;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class AppBarAction {
    public static final int $stable = 0;
    private final Function0<Unit> actionFn;
    private final AppBarActionType actionType;

    public AppBarAction(AppBarActionType actionType, Function0<Unit> actionFn) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(actionFn, "actionFn");
        this.actionType = actionType;
        this.actionFn = actionFn;
    }

    public final Function0<Unit> getActionFn() {
        return this.actionFn;
    }

    public final AppBarActionType getActionType() {
        return this.actionType;
    }
}
