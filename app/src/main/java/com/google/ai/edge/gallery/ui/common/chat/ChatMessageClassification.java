package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import com.google.ai.edge.gallery.common.Classification;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageClassification;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "classifications", "", "Lcom/google/ai/edge/gallery/common/Classification;", "latencyMs", "", "maxBarWidth", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Ljava/util/List;FLandroidx/compose/ui/unit/Dp;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getClassifications", "()Ljava/util/List;", "getLatencyMs", "()F", "getMaxBarWidth-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatMessageClassification extends ChatMessage {
    public static final int $stable = 8;
    private final List<Classification> classifications;
    private final float latencyMs;
    private final C1654Dp maxBarWidth;

    public /* synthetic */ ChatMessageClassification(List list, float f, C1654Dp c1654Dp, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, f, c1654Dp);
    }

    public /* synthetic */ ChatMessageClassification(List list, float f, C1654Dp c1654Dp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? null : c1654Dp, null);
    }

    public final List<Classification> getClassifications() {
        return this.classifications;
    }

    @Override // com.google.ai.edge.gallery.ui.common.chat.ChatMessage
    public float getLatencyMs() {
        return this.latencyMs;
    }

    /* JADX INFO: renamed from: getMaxBarWidth-lTKBWiU, reason: not valid java name and from getter */
    public final C1654Dp getMaxBarWidth() {
        return this.maxBarWidth;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ChatMessageClassification(List<Classification> classifications, float latencyMs, C1654Dp maxBarWidth) {
        super(ChatMessageType.CLASSIFICATION, ChatSide.AGENT, latencyMs, null, false, false, 56, null);
        Intrinsics.checkNotNullParameter(classifications, "classifications");
        this.classifications = classifications;
        this.latencyMs = latencyMs;
        this.maxBarWidth = maxBarWidth;
    }
}
