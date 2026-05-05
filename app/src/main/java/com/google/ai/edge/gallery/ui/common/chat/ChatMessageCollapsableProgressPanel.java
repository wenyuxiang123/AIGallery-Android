package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.CheckKt;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001e\u001a\u00020\u0000H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageCollapsableProgressPanel;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "title", "", "inProgress", "", "accelerator", "doneIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/google/ai/edge/gallery/ui/common/chat/ProgressPanelItem;", "logMessages", "Lcom/google/ai/edge/gallery/ui/common/chat/LogMessage;", "customData", "", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;)V", "getTitle", "()Ljava/lang/String;", "getInProgress", "()Z", "getAccelerator", "getDoneIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getItems", "()Ljava/util/List;", "getLogMessages", "getCustomData", "()Ljava/lang/Object;", "clone", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatMessageCollapsableProgressPanel extends ChatMessage {
    public static final int $stable = 8;
    private final String accelerator;
    private final Object customData;
    private final ImageVector doneIcon;
    private final boolean inProgress;
    private final List<ProgressPanelItem> items;
    private final List<LogMessage> logMessages;
    private final String title;

    public /* synthetic */ ChatMessageCollapsableProgressPanel(String str, boolean z, String str2, ImageVector imageVector, List list, List list2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, (i & 8) != 0 ? CheckKt.getCheck(Icons.Rounded.INSTANCE) : imageVector, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? null : obj);
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getInProgress() {
        return this.inProgress;
    }

    @Override // com.google.ai.edge.gallery.ui.common.chat.ChatMessage
    public String getAccelerator() {
        return this.accelerator;
    }

    public final ImageVector getDoneIcon() {
        return this.doneIcon;
    }

    public final List<ProgressPanelItem> getItems() {
        return this.items;
    }

    public final List<LogMessage> getLogMessages() {
        return this.logMessages;
    }

    public final Object getCustomData() {
        return this.customData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageCollapsableProgressPanel(String title, boolean inProgress, String accelerator, ImageVector doneIcon, List<ProgressPanelItem> items, List<LogMessage> logMessages, Object customData) {
        super(ChatMessageType.COLLAPSABLE_PROGRESS_PANEL, ChatSide.AGENT, 0.0f, accelerator, false, false, 52, null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accelerator, "accelerator");
        Intrinsics.checkNotNullParameter(doneIcon, "doneIcon");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(logMessages, "logMessages");
        this.title = title;
        this.inProgress = inProgress;
        this.accelerator = accelerator;
        this.doneIcon = doneIcon;
        this.items = items;
        this.logMessages = logMessages;
        this.customData = customData;
    }

    @Override // com.google.ai.edge.gallery.ui.common.chat.ChatMessage
    public ChatMessageCollapsableProgressPanel clone() {
        return new ChatMessageCollapsableProgressPanel(this.title, this.inProgress, getAccelerator(), this.doneIcon, CollectionsKt.toList(this.items), CollectionsKt.toList(this.logMessages), this.customData);
    }
}
