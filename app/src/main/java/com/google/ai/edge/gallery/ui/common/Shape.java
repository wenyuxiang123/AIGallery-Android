package com.google.ai.edge.gallery.ui.common;

import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.unit.C1654Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;



2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\t\u001a\u00020\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u000b\u001a\u00020\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006."}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/Shape;", "", "id", "", "shape", "", "relativeX", "", "relativeY", "size", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "addedTs", "<init>", "(JIFFFJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId", "()J", "getShape", "()I", "getRelativeX", "()F", "getRelativeY", "getSize-D9Ej5fM", "F", "getColor-0d7_KjU", "J", "getAddedTs", "component1", "component2", "component3", "component4", "component5", "component5-D9Ej5fM", "component6", "component6-0d7_KjU", "component7", "copy", "copy-RX54eSg", "(JIFFFJJ)Lcom/google/ai/edge/gallery/ui/common/Shape;", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class Shape {
    public static final int $stable = 0;
    private final long addedTs;
    private final long color;
    private final long id;
    private final float relativeX;
    private final float relativeY;
    private final int shape;
    private final float size;

    public /* synthetic */ Shape(long j, int i, float f, float f2, float f3, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, f, f2, f3, j2, j3);
    }

    
    public final long getId() {
        return this.id;
    }

    
    public final int getShape() {
        return this.shape;
    }

    
    public final float getRelativeX() {
        return this.relativeX;
    }

    
    public final float getRelativeY() {
        return this.relativeY;
    }

    
    public final float getSize() {
        return this.size;
    }

    
    public final long getColor() {
        return this.color;
    }

    
    public final long getAddedTs() {
        return this.addedTs;
    }

    
    public final Shape m10894copyRX54eSg(long id, int shape, float relativeX, float relativeY, float size, long color, long addedTs) {
        return new Shape(id, shape, relativeX, relativeY, size, color, addedTs, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shape)) {
            return false;
        }
        Shape shape = (Shape) other;
        return this.id == shape.id && this.shape == shape.shape && Float.compare(this.relativeX, shape.relativeX) == 0 && Float.compare(this.relativeY, shape.relativeY) == 0 && C1654Dp.m9793equalsimpl0(this.size, shape.size) && Color.m6916equalsimpl0(this.color, shape.color) && this.addedTs == shape.addedTs;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.shape)) * 31) + Float.hashCode(this.relativeX)) * 31) + Float.hashCode(this.relativeY)) * 31) + C1654Dp.m9794hashCodeimpl(this.size)) * 31) + Color.m6922hashCodeimpl(this.color)) * 31) + Long.hashCode(this.addedTs);
    }

    public String toString() {
        return "Shape(id=" + this.id + ", shape=" + this.shape + ", relativeX=" + this.relativeX + ", relativeY=" + this.relativeY + ", size=" + C1654Dp.m9799toStringimpl(this.size) + ", color=" + Color.m6923toStringimpl(this.color) + ", addedTs=" + this.addedTs + ")";
    }

    private Shape(long id, int shape, float relativeX, float relativeY, float size, long color, long addedTs) {
        this.id = id;
        this.shape = shape;
        this.relativeX = relativeX;
        this.relativeY = relativeY;
        this.size = size;
        this.color = color;
        this.addedTs = addedTs;
    }

    public final long getId() {
        return this.id;
    }

    public final int getShape() {
        return this.shape;
    }

    public final float getRelativeX() {
        return this.relativeX;
    }

    public final float getRelativeY() {
        return this.relativeY;
    }

    
    public final float m10896getSizeD9Ej5fM() {
        return this.size;
    }

    
    public final long m10895getColor0d7_KjU() {
        return this.color;
    }

    public final long getAddedTs() {
        return this.addedTs;
    }
}
