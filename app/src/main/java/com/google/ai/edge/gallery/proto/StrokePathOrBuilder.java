package com.google.ai.edge.gallery.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface StrokePathOrBuilder extends MessageLiteOrBuilder {
    int getBlurType();

    int getBrushColor();

    float getBrushSize();

    float getBrushSoftness();

    Point getPoint(int i);

    int getPointCount();

    List<Point> getPointList();
}
