package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class ExampleCustomTaskModelInstance {
    public static final int $stable = 0;
    private final String content;

    public static /* synthetic */ ExampleCustomTaskModelInstance copy$default(ExampleCustomTaskModelInstance exampleCustomTaskModelInstance, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exampleCustomTaskModelInstance.content;
        }
        return exampleCustomTaskModelInstance.copy(str);
    }

    
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
