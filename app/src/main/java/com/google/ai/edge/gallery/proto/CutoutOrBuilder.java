package com.google.ai.edge.gallery.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface CutoutOrBuilder extends MessageLiteOrBuilder {
    int getBorderColor();

    int getBorderWidth();

    StrokePath getDoodleStroke(int i);

    int getDoodleStrokeCount();

    List<StrokePath> getDoodleStrokeList();

    int getFillColor();

    FillMode getFillMode();

    int getFillModeValue();

    String getId();

    ByteString getIdBytes();

    int getRotationDegree();
}
