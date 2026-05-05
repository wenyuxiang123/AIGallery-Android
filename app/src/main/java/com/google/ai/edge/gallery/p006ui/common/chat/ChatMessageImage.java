package com.google.ai.edge.gallery.p006ui.common.chat;

import android.graphics.Bitmap;
import androidx.compose.p000ui.graphics.ImageBitmap;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010 \u001a\u00020\u0000H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageImage;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "bitmaps", "", "Landroid/graphics/Bitmap;", "imageBitMaps", "Landroidx/compose/ui/graphics/ImageBitmap;", "maxSize", "", "side", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "latencyMs", "", "accelerator", "", "hideSenderLabel", "", "<init>", "(Ljava/util/List;Ljava/util/List;ILcom/google/ai/edge/gallery/ui/common/chat/ChatSide;FLjava/lang/String;Z)V", "getBitmaps", "()Ljava/util/List;", "getImageBitMaps", "getMaxSize", "()I", "getSide", "()Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "getLatencyMs", "()F", "getAccelerator", "()Ljava/lang/String;", "getHideSenderLabel", "()Z", "clone", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatMessageImage extends ChatMessage {
    public static final int $stable = 8;
    private final String accelerator;
    private final List<Bitmap> bitmaps;
    private final boolean hideSenderLabel;
    private final List<ImageBitmap> imageBitMaps;
    private final float latencyMs;
    private final int maxSize;
    private final ChatSide side;

    public /* synthetic */ ChatMessageImage(List list, List list2, int i, ChatSide chatSide, float f, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i2 & 4) != 0 ? 200 : i, chatSide, (i2 & 16) != 0 ? 0.0f : f, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? false : z);
    }

    public final List<Bitmap> getBitmaps() {
        return this.bitmaps;
    }

    public final List<ImageBitmap> getImageBitMaps() {
        return this.imageBitMaps;
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public ChatSide getSide() {
        return this.side;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public float getLatencyMs() {
        return this.latencyMs;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public String getAccelerator() {
        return this.accelerator;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public boolean getHideSenderLabel() {
        return this.hideSenderLabel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatMessageImage(List<Bitmap> bitmaps, List<? extends ImageBitmap> imageBitMaps, int maxSize, ChatSide side, float latencyMs, String accelerator, boolean hideSenderLabel) {
        super(ChatMessageType.IMAGE, side, latencyMs, accelerator, hideSenderLabel, false, 32, null);
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        Intrinsics.checkNotNullParameter(imageBitMaps, "imageBitMaps");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(accelerator, "accelerator");
        this.bitmaps = bitmaps;
        this.imageBitMaps = imageBitMaps;
        this.maxSize = maxSize;
        this.side = side;
        this.latencyMs = latencyMs;
        this.accelerator = accelerator;
        this.hideSenderLabel = hideSenderLabel;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public ChatMessageImage clone() {
        return new ChatMessageImage(CollectionsKt.toList(this.bitmaps), CollectionsKt.toList(this.imageBitMaps), 0, getSide(), getLatencyMs(), getAccelerator(), getHideSenderLabel(), 4, null);
    }
}
