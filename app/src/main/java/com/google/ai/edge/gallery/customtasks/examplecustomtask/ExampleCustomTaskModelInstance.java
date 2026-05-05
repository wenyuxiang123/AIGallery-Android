package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExampleCustomTaskScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/examplecustomtask/ExampleCustomTaskModelInstance;", "", FirebaseAnalytics.Param.CONTENT, "", "<init>", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class ExampleCustomTaskModelInstance {
    public static final int $stable = 0;
    private final String content;

    public static /* synthetic */ ExampleCustomTaskModelInstance copy$default(ExampleCustomTaskModelInstance exampleCustomTaskModelInstance, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exampleCustomTaskModelInstance.content;
        }
        return exampleCustomTaskModelInstance.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final ExampleCustomTaskModelInstance copy(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new ExampleCustomTaskModelInstance(content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExampleCustomTaskModelInstance) && Intrinsics.areEqual(this.content, ((ExampleCustomTaskModelInstance) other).content);
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        return "ExampleCustomTaskModelInstance(content=" + this.content + ")";
    }

    public ExampleCustomTaskModelInstance(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
    }

    public final String getContent() {
        return this.content;
    }
}
