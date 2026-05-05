package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Actions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/FunctionCallDetails;", "", "functionName", "", "parameters", "", "Lkotlin/Pair;", "ts", "", "<init>", "(Ljava/lang/String;Ljava/util/List;J)V", "getFunctionName", "()Ljava/lang/String;", "getParameters", "()Ljava/util/List;", "getTs", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFunctionName() {
        return this.functionName;
    }

    public final List<Pair<String, String>> component2() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
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
