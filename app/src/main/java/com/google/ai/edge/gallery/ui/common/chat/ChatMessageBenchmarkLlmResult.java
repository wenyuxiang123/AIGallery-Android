package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageBenchmarkLlmResult;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "orderedStats", "", "Lcom/google/ai/edge/gallery/ui/common/chat/Stat;", "statValues", "", "", "", "running", "", "latencyMs", "accelerator", "<init>", "(Ljava/util/List;Ljava/util/Map;ZFLjava/lang/String;)V", "getOrderedStats", "()Ljava/util/List;", "getStatValues", "()Ljava/util/Map;", "getRunning", "()Z", "getLatencyMs", "()F", "getAccelerator", "()Ljava/lang/String;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatMessageBenchmarkLlmResult extends ChatMessage {
    public static final int $stable = 8;
    private final String accelerator;
    private final float latencyMs;
    private final List<Stat> orderedStats;
    private final boolean running;
    private final Map<String, Float> statValues;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChatMessageBenchmarkLlmResult(List list, Map map, boolean z, float f, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        float f2;
        String str2;
        if ((i & 8) == 0) {
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        if ((i & 16) == 0) {
            str2 = str;
        } else {
            str2 = "";
        }
        this(list, map, z, f2, str2);
    }

    public final List<Stat> getOrderedStats() {
        return this.orderedStats;
    }

    public final Map<String, Float> getStatValues() {
        return this.statValues;
    }

    public final boolean getRunning() {
        return this.running;
    }

    @Override // com.google.ai.edge.gallery.ui.common.chat.ChatMessage
    public float getLatencyMs() {
        return this.latencyMs;
    }

    @Override // com.google.ai.edge.gallery.ui.common.chat.ChatMessage
    public String getAccelerator() {
        return this.accelerator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageBenchmarkLlmResult(List<Stat> orderedStats, Map<String, Float> statValues, boolean running, float latencyMs, String accelerator) {
        super(ChatMessageType.BENCHMARK_LLM_RESULT, ChatSide.AGENT, latencyMs, accelerator, false, false, 48, null);
        Intrinsics.checkNotNullParameter(orderedStats, "orderedStats");
        Intrinsics.checkNotNullParameter(statValues, "statValues");
        Intrinsics.checkNotNullParameter(accelerator, "accelerator");
        this.orderedStats = orderedStats;
        this.statValues = statValues;
        this.running = running;
        this.latencyMs = latencyMs;
        this.accelerator = accelerator;
    }
}
