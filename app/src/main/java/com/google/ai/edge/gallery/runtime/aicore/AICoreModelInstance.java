package com.google.ai.edge.gallery.runtime.aicore;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.mlkit.genai.prompt.GenerativeModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: AICoreModelHelper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m921d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m922d2 = {"Lcom/google/ai/edge/gallery/runtime/aicore/AICoreModelInstance;", "", "generativeModel", "Lcom/google/mlkit/genai/prompt/GenerativeModel;", "chatHistory", "", "Lcom/google/ai/edge/gallery/runtime/aicore/AICoreChatMessage;", "inferenceJob", "Lkotlinx/coroutines/Job;", "<init>", "(Lcom/google/mlkit/genai/prompt/GenerativeModel;Ljava/util/List;Lkotlinx/coroutines/Job;)V", "getGenerativeModel", "()Lcom/google/mlkit/genai/prompt/GenerativeModel;", "getChatHistory", "()Ljava/util/List;", "getInferenceJob", "()Lkotlinx/coroutines/Job;", "setInferenceJob", "(Lkotlinx/coroutines/Job;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class AICoreModelInstance {
    public static final int $stable = 8;
    private final List<AICoreChatMessage> chatHistory;
    private final GenerativeModel generativeModel;
    private Job inferenceJob;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AICoreModelInstance copy$default(AICoreModelInstance aICoreModelInstance, GenerativeModel generativeModel, List list, Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            generativeModel = aICoreModelInstance.generativeModel;
        }
        if ((i & 2) != 0) {
            list = aICoreModelInstance.chatHistory;
        }
        if ((i & 4) != 0) {
            job = aICoreModelInstance.inferenceJob;
        }
        return aICoreModelInstance.copy(generativeModel, list, job);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GenerativeModel getGenerativeModel() {
        return this.generativeModel;
    }

    public final List<AICoreChatMessage> component2() {
        return this.chatHistory;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Job getInferenceJob() {
        return this.inferenceJob;
    }

    public final AICoreModelInstance copy(GenerativeModel generativeModel, List<AICoreChatMessage> chatHistory, Job inferenceJob) {
        Intrinsics.checkNotNullParameter(generativeModel, "generativeModel");
        Intrinsics.checkNotNullParameter(chatHistory, "chatHistory");
        return new AICoreModelInstance(generativeModel, chatHistory, inferenceJob);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AICoreModelInstance)) {
            return false;
        }
        AICoreModelInstance aICoreModelInstance = (AICoreModelInstance) other;
        return Intrinsics.areEqual(this.generativeModel, aICoreModelInstance.generativeModel) && Intrinsics.areEqual(this.chatHistory, aICoreModelInstance.chatHistory) && Intrinsics.areEqual(this.inferenceJob, aICoreModelInstance.inferenceJob);
    }

    public int hashCode() {
        return (((this.generativeModel.hashCode() * 31) + this.chatHistory.hashCode()) * 31) + (this.inferenceJob == null ? 0 : this.inferenceJob.hashCode());
    }

    public String toString() {
        return "AICoreModelInstance(generativeModel=" + this.generativeModel + ", chatHistory=" + this.chatHistory + ", inferenceJob=" + this.inferenceJob + ")";
    }

    public AICoreModelInstance(GenerativeModel generativeModel, List<AICoreChatMessage> chatHistory, Job inferenceJob) {
        Intrinsics.checkNotNullParameter(generativeModel, "generativeModel");
        Intrinsics.checkNotNullParameter(chatHistory, "chatHistory");
        this.generativeModel = generativeModel;
        this.chatHistory = chatHistory;
        this.inferenceJob = inferenceJob;
    }

    public /* synthetic */ AICoreModelInstance(GenerativeModel generativeModel, ArrayList arrayList, Job job, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(generativeModel, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : job);
    }

    public final GenerativeModel getGenerativeModel() {
        return this.generativeModel;
    }

    public final List<AICoreChatMessage> getChatHistory() {
        return this.chatHistory;
    }

    public final Job getInferenceJob() {
        return this.inferenceJob;
    }

    public final void setInferenceJob(Job job) {
        this.inferenceJob = job;
    }
}
