package com.google.ai.edge.gallery.customtasks.mobileactions;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getFunctionName", "()Ljava/lang/String;", "getParameters", "()Ljava/util/List;", "getTs", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class FunctionCallDetails {
    public static final int $stable = 8;
    private final String functionName;
    private final List<Pair<String, String>> parameters;
    private final long ts;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FunctionCallDetails copy$default(FunctionCallDetails functionCallDetails, String str, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = functionCallDetails.functionName;
        }
        if ((i & 2) != 0) {
            list = functionCallDetails.parameters;
        }
        if ((i & 4) != 0) {
            j = functionCallDetails.ts;
        }
        return functionCallDetails.copy(str, list, j);
    }

    
    public final String getFunctionName() {
        return this.functionName;
    }

    public final List<Pair<String, String>> component2() {
        return this.parameters;
    }

    
    public final long getTs() {
        return this.ts;
    }

    public final FunctionCallDetails copy(String functionName, List<Pair<String, String>> parameters, long ts) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new FunctionCallDetails(functionName, parameters, ts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FunctionCallDetails)) {
            return false;
        }
        FunctionCallDetails functionCallDetails = (FunctionCallDetails) other;
        return Intrinsics.areEqual(this.functionName, functionCallDetails.functionName) && Intrinsics.areEqual(this.parameters, functionCallDetails.parameters) && this.ts == functionCallDetails.ts;
    }

    public int hashCode() {
        return (((this.functionName.hashCode() * 31) + this.parameters.hashCode()) * 31) + Long.hashCode(this.ts);
    }

    public String toString() {
        return "FunctionCallDetails(functionName=" + this.functionName + ", parameters=" + this.parameters + ", ts=" + this.ts + ")";
    }

    public FunctionCallDetails(String functionName, List<Pair<String, String>> parameters, long ts) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.functionName = functionName;
        this.parameters = parameters;
        this.ts = ts;
    }

    public /* synthetic */ FunctionCallDetails(String str, List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? System.currentTimeMillis() : j);
    }

    public final String getFunctionName() {
        return this.functionName;
    }

    public final List<Pair<String, String>> getParameters() {
        return this.parameters;
    }

    public final long getTs() {
        return this.ts;
    }
}
