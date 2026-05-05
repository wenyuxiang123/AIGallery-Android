package com.google.ai.edge.gallery.p006ui.common.chat;

import android.graphics.Bitmap;
import androidx.compose.p000ui.graphics.ImageBitmap;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001c\u001a\u00020\u001dR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageImageWithHistory;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "bitmaps", "", "Landroid/graphics/Bitmap;", "imageBitMaps", "Landroidx/compose/ui/graphics/ImageBitmap;", "totalIterations", "", "side", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "latencyMs", "", "curIteration", "<init>", "(Ljava/util/List;Ljava/util/List;ILcom/google/ai/edge/gallery/ui/common/chat/ChatSide;FI)V", "getBitmaps", "()Ljava/util/List;", "getImageBitMaps", "getTotalIterations", "()I", "getSide", "()Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "getLatencyMs", "()F", "getCurIteration", "setCurIteration", "(I)V", "isRunning", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatMessageImageWithHistory extends ChatMessage {
    public static final int $stable = 8;
    private final List<Bitmap> bitmaps;
    private int curIteration;
    private final List<ImageBitmap> imageBitMaps;
    private final float latencyMs;
    private final ChatSide side;
    private final int totalIterations;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChatMessageImageWithHistory(List list, List list2, int i, ChatSide chatSide, float f, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        float f2;
        int i4;
        if ((i3 & 16) == 0) {
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        if ((i3 & 32) == 0) {
            i4 = i2;
        } else {
            i4 = 0;
        }
        this(list, list2, i, chatSide, f2, i4);
    }

    public final List<Bitmap> getBitmaps() {
        return this.bitmaps;
    }

    public final List<ImageBitmap> getImageBitMaps() {
        return this.imageBitMaps;
    }

    public final int getTotalIterations() {
        return this.totalIterations;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public ChatSide getSide() {
        return this.side;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public float getLatencyMs() {
        return this.latencyMs;
    }

    public final int getCurIteration() {
        return this.curIteration;
    }

    public final void setCurIteration(int i) {
        this.curIteration = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatMessageImageWithHistory(List<Bitmap> bitmaps, List<? extends ImageBitmap> imageBitMaps, int totalIterations, ChatSide side, float latencyMs, int curIteration) {
        super(ChatMessageType.IMAGE_WITH_HISTORY, side, latencyMs, null, false, false, 56, null);
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        Intrinsics.checkNotNullParameter(imageBitMaps, "imageBitMaps");
        Intrinsics.checkNotNullParameter(side, "side");
        this.bitmaps = bitmaps;
        this.imageBitMaps = imageBitMaps;
        this.totalIterations = totalIterations;
        this.side = side;
        this.latencyMs = latencyMs;
        this.curIteration = curIteration;
    }

    public final boolean isRunning() {
        return this.curIteration < this.totalIterations - 1;
    }
}
