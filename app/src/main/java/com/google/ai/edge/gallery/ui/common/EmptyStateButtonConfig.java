package com.google.ai.edge.gallery.ui.common;

import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getButtonLabelResId", "()I", "getButtonIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getOnButtonClick", "()Lkotlin/jvm/functions/Function0;", "getExtraContent", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "component1", "component2", "component3", "component4", "copy", "(ILandroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lcom/google/ai/edge/gallery/ui/common/EmptyStateButtonConfig;", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class EmptyStateButtonConfig {
    public static final int $stable = 0;
    private final ImageVector buttonIcon;
    private final int buttonLabelResId;
    private final Function2<Composer, Integer, Unit> extraContent;
    private final Function0<Unit> onButtonClick;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmptyStateButtonConfig copy$default(EmptyStateButtonConfig emptyStateButtonConfig, int i, ImageVector imageVector, Function0 function0, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = emptyStateButtonConfig.buttonLabelResId;
        }
        if ((i2 & 2) != 0) {
            imageVector = emptyStateButtonConfig.buttonIcon;
        }
        if ((i2 & 4) != 0) {
            function0 = emptyStateButtonConfig.onButtonClick;
        }
        if ((i2 & 8) != 0) {
            function2 = emptyStateButtonConfig.extraContent;
        }
        return emptyStateButtonConfig.copy(i, imageVector, function0, function2);
    }

    
    public final int getButtonLabelResId() {
        return this.buttonLabelResId;
    }

    
    public final ImageVector getButtonIcon() {
        return this.buttonIcon;
    }

    public final Function0<Unit> component3() {
        return this.onButtonClick;
    }

    public final Function2<Composer, Integer, Unit> component4() {
        return this.extraContent;
    }

    public final EmptyStateButtonConfig copy(int buttonLabelResId, ImageVector buttonIcon, Function0<Unit> onButtonClick, Function2<? super Composer, ? super Integer, Unit> extraContent) {
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Intrinsics.checkNotNullParameter(extraContent, "extraContent");
        return new EmptyStateButtonConfig(buttonLabelResId, buttonIcon, onButtonClick, extraContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateButtonConfig)) {
            return false;
        }
        EmptyStateButtonConfig emptyStateButtonConfig = (EmptyStateButtonConfig) other;
        return this.buttonLabelResId == emptyStateButtonConfig.buttonLabelResId && Intrinsics.areEqual(this.buttonIcon, emptyStateButtonConfig.buttonIcon) && Intrinsics.areEqual(this.onButtonClick, emptyStateButtonConfig.onButtonClick) && Intrinsics.areEqual(this.extraContent, emptyStateButtonConfig.extraContent);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.buttonLabelResId) * 31) + (this.buttonIcon == null ? 0 : this.buttonIcon.hashCode())) * 31) + this.onButtonClick.hashCode()) * 31) + this.extraContent.hashCode();
    }

    public String toString() {
        return "EmptyStateButtonConfig(buttonLabelResId=" + this.buttonLabelResId + ", buttonIcon=" + this.buttonIcon + ", onButtonClick=" + this.onButtonClick + ", extraContent=" + this.extraContent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmptyStateButtonConfig(int buttonLabelResId, ImageVector buttonIcon, Function0<Unit> onButtonClick, Function2<? super Composer, ? super Integer, Unit> extraContent) {
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Intrinsics.checkNotNullParameter(extraContent, "extraContent");
        this.buttonLabelResId = buttonLabelResId;
        this.buttonIcon = buttonIcon;
        this.onButtonClick = onButtonClick;
        this.extraContent = extraContent;
    }

    public /* synthetic */ EmptyStateButtonConfig(int i, ImageVector imageVector, Function0 function0, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : imageVector, (i2 & 4) != 0 ? new Function0() { // from class: com.google.ai.edge.gallery.ui.common.EmptyStateButtonConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function0, (i2 & 8) != 0 ? ComposableSingletons$EmptyStateKt.INSTANCE.getLambda$1137270977$app_debug() : function2);
    }

    public final int getButtonLabelResId() {
        return this.buttonLabelResId;
    }

    public final ImageVector getButtonIcon() {
        return this.buttonIcon;
    }

    public final Function0<Unit> getOnButtonClick() {
        return this.onButtonClick;
    }

    public final Function2<Composer, Integer, Unit> getExtraContent() {
        return this.extraContent;
    }
}
