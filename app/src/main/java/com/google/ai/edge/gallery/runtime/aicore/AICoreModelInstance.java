package com.google.ai.edge.gallery.runtime.aicore;

import com.google.mlkit.genai.prompt.GenerativeModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;



V", "getGenerativeModel", "()Lcom/google/mlkit/genai/prompt/GenerativeModel;", "getChatHistory", "()Ljava/util/List;", "getInferenceJob", "()Lkotlinx/coroutines/Job;", "setInferenceJob", "(Lkotlinx/coroutines/Job;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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

    
    public final GenerativeModel getGenerativeModel() {
        return this.generativeModel;
    }

    public final List<AICoreChatMessage> component2() {
        return this.chatHistory;
    }

    
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
