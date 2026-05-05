package com.google.ai.edge.gallery.customtasks.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CustomTaskData.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\u001d\u0010\u001d\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003Jn\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R%\u0010\u000b\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006'"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/common/CustomTaskData;", "", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "bottomPadding", "Landroidx/compose/ui/unit/Dp;", "setAppBarControlsDisabled", "Lkotlin/Function1;", "", "", "setTopBarVisible", "setCustomNavigateUpCallback", "Lkotlin/Function0;", "<init>", "(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getModelManagerViewModel", "()Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "getBottomPadding-D9Ej5fM", "()F", "F", "getSetAppBarControlsDisabled", "()Lkotlin/jvm/functions/Function1;", "getSetTopBarVisible", "getSetCustomNavigateUpCallback", "component1", "component2", "component2-D9Ej5fM", "component3", "component4", "component5", "copy", "copy-rAjV9yQ", "(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/google/ai/edge/gallery/customtasks/common/CustomTaskData;", "equals", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class CustomTaskData {
    public static final int $stable = 8;
    private final float bottomPadding;
    private final ModelManagerViewModel modelManagerViewModel;
    private final Function1<Boolean, Unit> setAppBarControlsDisabled;
    private final Function1<Function0<Unit>, Unit> setCustomNavigateUpCallback;
    private final Function1<Boolean, Unit> setTopBarVisible;

    public /* synthetic */ CustomTaskData(ModelManagerViewModel modelManagerViewModel, float f, Function1 function1, Function1 function12, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(modelManagerViewModel, f, function1, function12, function13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ CustomTaskData m10496copyrAjV9yQ$default(CustomTaskData customTaskData, ModelManagerViewModel modelManagerViewModel, float f, Function1 function1, Function1 function12, Function1 function13, int i, Object obj) {
        if ((i & 1) != 0) {
            modelManagerViewModel = customTaskData.modelManagerViewModel;
        }
        if ((i & 2) != 0) {
            f = customTaskData.bottomPadding;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            function1 = customTaskData.setAppBarControlsDisabled;
        }
        Function1 function14 = function1;
        if ((i & 8) != 0) {
            function12 = customTaskData.setTopBarVisible;
        }
        Function1 function15 = function12;
        if ((i & 16) != 0) {
            function13 = customTaskData.setCustomNavigateUpCallback;
        }
        return customTaskData.m10498copyrAjV9yQ(modelManagerViewModel, f2, function14, function15, function13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ModelManagerViewModel getModelManagerViewModel() {
        return this.modelManagerViewModel;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomPadding() {
        return this.bottomPadding;
    }

    public final Function1<Boolean, Unit> component3() {
        return this.setAppBarControlsDisabled;
    }

    public final Function1<Boolean, Unit> component4() {
        return this.setTopBarVisible;
    }

    public final Function1<Function0<Unit>, Unit> component5() {
        return this.setCustomNavigateUpCallback;
    }

    /* JADX INFO: renamed from: copy-rAjV9yQ, reason: not valid java name */
    public final CustomTaskData m10498copyrAjV9yQ(ModelManagerViewModel modelManagerViewModel, float bottomPadding, Function1<? super Boolean, Unit> setAppBarControlsDisabled, Function1<? super Boolean, Unit> setTopBarVisible, Function1<? super Function0<Unit>, Unit> setCustomNavigateUpCallback) {
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(setAppBarControlsDisabled, "setAppBarControlsDisabled");
        Intrinsics.checkNotNullParameter(setTopBarVisible, "setTopBarVisible");
        Intrinsics.checkNotNullParameter(setCustomNavigateUpCallback, "setCustomNavigateUpCallback");
        return new CustomTaskData(modelManagerViewModel, bottomPadding, setAppBarControlsDisabled, setTopBarVisible, setCustomNavigateUpCallback, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomTaskData)) {
            return false;
        }
        CustomTaskData customTaskData = (CustomTaskData) other;
        return Intrinsics.areEqual(this.modelManagerViewModel, customTaskData.modelManagerViewModel) && C1654Dp.m9793equalsimpl0(this.bottomPadding, customTaskData.bottomPadding) && Intrinsics.areEqual(this.setAppBarControlsDisabled, customTaskData.setAppBarControlsDisabled) && Intrinsics.areEqual(this.setTopBarVisible, customTaskData.setTopBarVisible) && Intrinsics.areEqual(this.setCustomNavigateUpCallback, customTaskData.setCustomNavigateUpCallback);
    }

    public int hashCode() {
        return (((((((this.modelManagerViewModel.hashCode() * 31) + C1654Dp.m9794hashCodeimpl(this.bottomPadding)) * 31) + this.setAppBarControlsDisabled.hashCode()) * 31) + this.setTopBarVisible.hashCode()) * 31) + this.setCustomNavigateUpCallback.hashCode();
    }

    public String toString() {
        return "CustomTaskData(modelManagerViewModel=" + this.modelManagerViewModel + ", bottomPadding=" + C1654Dp.m9799toStringimpl(this.bottomPadding) + ", setAppBarControlsDisabled=" + this.setAppBarControlsDisabled + ", setTopBarVisible=" + this.setTopBarVisible + ", setCustomNavigateUpCallback=" + this.setCustomNavigateUpCallback + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CustomTaskData(ModelManagerViewModel modelManagerViewModel, float bottomPadding, Function1<? super Boolean, Unit> setAppBarControlsDisabled, Function1<? super Boolean, Unit> setTopBarVisible, Function1<? super Function0<Unit>, Unit> setCustomNavigateUpCallback) {
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(setAppBarControlsDisabled, "setAppBarControlsDisabled");
        Intrinsics.checkNotNullParameter(setTopBarVisible, "setTopBarVisible");
        Intrinsics.checkNotNullParameter(setCustomNavigateUpCallback, "setCustomNavigateUpCallback");
        this.modelManagerViewModel = modelManagerViewModel;
        this.bottomPadding = bottomPadding;
        this.setAppBarControlsDisabled = setAppBarControlsDisabled;
        this.setTopBarVisible = setTopBarVisible;
        this.setCustomNavigateUpCallback = setCustomNavigateUpCallback;
    }

    public /* synthetic */ CustomTaskData(ModelManagerViewModel modelManagerViewModel, float f, Function1 function1, Function1 function12, Function1 function13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modelManagerViewModel, (i & 2) != 0 ? C1654Dp.m9788constructorimpl(0) : f, (i & 4) != 0 ? new Function1() { // from class: com.google.ai.edge.gallery.customtasks.common.CustomTaskData$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTaskData._init_$lambda$0(((Boolean) obj).booleanValue());
            }
        } : function1, (i & 8) != 0 ? new Function1() { // from class: com.google.ai.edge.gallery.customtasks.common.CustomTaskData$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTaskData._init_$lambda$1(((Boolean) obj).booleanValue());
            }
        } : function12, (i & 16) != 0 ? new Function1() { // from class: com.google.ai.edge.gallery.customtasks.common.CustomTaskData$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTaskData._init_$lambda$2((Function0) obj);
            }
        } : function13, null);
    }

    public final ModelManagerViewModel getModelManagerViewModel() {
        return this.modelManagerViewModel;
    }

    /* JADX INFO: renamed from: getBottomPadding-D9Ej5fM, reason: not valid java name */
    public final float m10499getBottomPaddingD9Ej5fM() {
        return this.bottomPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(boolean it) {
        return Unit.INSTANCE;
    }

    public final Function1<Boolean, Unit> getSetAppBarControlsDisabled() {
        return this.setAppBarControlsDisabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(boolean it) {
        return Unit.INSTANCE;
    }

    public final Function1<Boolean, Unit> getSetTopBarVisible() {
        return this.setTopBarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(Function0 it) {
        return Unit.INSTANCE;
    }

    public final Function1<Function0<Unit>, Unit> getSetCustomNavigateUpCallback() {
        return this.setCustomNavigateUpCallback;
    }
}
