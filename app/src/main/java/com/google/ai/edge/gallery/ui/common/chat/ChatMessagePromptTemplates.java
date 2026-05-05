package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.data.PromptTemplate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessagePromptTemplates;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "templates", "", "Lcom/google/ai/edge/gallery/data/PromptTemplate;", "showMakeYourOwn", "", "<init>", "(Ljava/util/List;Z)V", "getTemplates", "()Ljava/util/List;", "getShowMakeYourOwn", "()Z", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatMessagePromptTemplates extends ChatMessage {
    public static final int $stable = 8;
    private final boolean showMakeYourOwn;
    private final List<PromptTemplate> templates;

    public /* synthetic */ ChatMessagePromptTemplates(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? true : z);
    }

    public final List<PromptTemplate> getTemplates() {
        return this.templates;
    }

    public final boolean getShowMakeYourOwn() {
        return this.showMakeYourOwn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessagePromptTemplates(List<PromptTemplate> templates, boolean showMakeYourOwn) {
        super(ChatMessageType.PROMPT_TEMPLATES, ChatSide.SYSTEM, 0.0f, null, false, false, 60, null);
        Intrinsics.checkNotNullParameter(templates, "templates");
        this.templates = templates;
        this.showMakeYourOwn = showMakeYourOwn;
    }
}
