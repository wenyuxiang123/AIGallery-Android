package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bs\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020&R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0014\u0010\u0011\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006("}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageBenchmarkResult;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "orderedStats", "", "Lcom/google/ai/edge/gallery/ui/common/chat/Stat;", "statValues", "", "", "", "values", "histogram", "Lcom/google/ai/edge/gallery/ui/common/chat/Histogram;", "warmupCurrent", "", "warmupTotal", "iterationCurrent", "iterationTotal", "latencyMs", "highlightStat", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/google/ai/edge/gallery/ui/common/chat/Histogram;IIIIFLjava/lang/String;)V", "getOrderedStats", "()Ljava/util/List;", "getStatValues", "()Ljava/util/Map;", "getValues", "getHistogram", "()Lcom/google/ai/edge/gallery/ui/common/chat/Histogram;", "getWarmupCurrent", "()I", "getWarmupTotal", "getIterationCurrent", "getIterationTotal", "getLatencyMs", "()F", "getHighlightStat", "()Ljava/lang/String;", "isWarmingUp", "", "isRunning", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatMessageBenchmarkResult extends ChatMessage {
    public static final int $stable = 8;
    private final String highlightStat;
    private final Histogram histogram;
    private final int iterationCurrent;
    private final int iterationTotal;
    private final float latencyMs;
    private final List<Stat> orderedStats;
    private final Map<String, Float> statValues;
    private final List<Float> values;
    private final int warmupCurrent;
    private final int warmupTotal;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChatMessageBenchmarkResult(List list, Map map, List list2, Histogram histogram, int i, int i2, int i3, int i4, float f, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        float f2;
        String str2;
        if ((i5 & 256) == 0) {
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        if ((i5 & 512) == 0) {
            str2 = str;
        } else {
            str2 = "";
        }
        this(list, map, list2, histogram, i, i2, i3, i4, f2, str2);
    }

    public final List<Stat> getOrderedStats() {
        return this.orderedStats;
    }

    public final Map<String, Float> getStatValues() {
        return this.statValues;
    }

    public final List<Float> getValues() {
        return this.values;
    }

    public final Histogram getHistogram() {
        return this.histogram;
    }

    public final int getWarmupCurrent() {
        return this.warmupCurrent;
    }

    public final int getWarmupTotal() {
        return this.warmupTotal;
    }

    public final int getIterationCurrent() {
        return this.iterationCurrent;
    }

    public final int getIterationTotal() {
        return this.iterationTotal;
    }

    @Override // com.google.ai.edge.gallery.ui.common.chat.ChatMessage
    public float getLatencyMs() {
        return this.latencyMs;
    }

    public final String getHighlightStat() {
        return this.highlightStat;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageBenchmarkResult(List<Stat> orderedStats, Map<String, Float> statValues, List<Float> values, Histogram histogram, int warmupCurrent, int warmupTotal, int iterationCurrent, int iterationTotal, float latencyMs, String highlightStat) {
        super(ChatMessageType.BENCHMARK_RESULT, ChatSide.AGENT, latencyMs, null, false, false, 56, null);
        Intrinsics.checkNotNullParameter(orderedStats, "orderedStats");
        Intrinsics.checkNotNullParameter(statValues, "statValues");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(histogram, "histogram");
        Intrinsics.checkNotNullParameter(highlightStat, "highlightStat");
        this.orderedStats = orderedStats;
        this.statValues = statValues;
        this.values = values;
        this.histogram = histogram;
        this.warmupCurrent = warmupCurrent;
        this.warmupTotal = warmupTotal;
        this.iterationCurrent = iterationCurrent;
        this.iterationTotal = iterationTotal;
        this.latencyMs = latencyMs;
        this.highlightStat = highlightStat;
    }

    public final boolean isWarmingUp() {
        return this.warmupCurrent < this.warmupTotal;
    }

    public final boolean isRunning() {
        return this.iterationCurrent < this.iterationTotal;
    }
}
