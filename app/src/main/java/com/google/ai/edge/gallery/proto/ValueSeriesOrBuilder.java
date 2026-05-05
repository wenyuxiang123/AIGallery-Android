package com.google.ai.edge.gallery.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;


public interface ValueSeriesOrBuilder extends MessageLiteOrBuilder {
    double getAvg();

    double getMax();

    double getMedium();

    double getMin();

    double getPct25();

    double getPct75();

    double getValue(int i);

    int getValueCount();

    List<Double> getValueList();
}
