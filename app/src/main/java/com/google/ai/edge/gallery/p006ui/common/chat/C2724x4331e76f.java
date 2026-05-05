package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.chat.MessageBodyPromptTemplatesKt$MessageBodyPromptTemplates$lambda$8$lambda$7$lambda$6$$inlined$items$default$2 */
/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class C2724x4331e76f implements Function1<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $key;

    public C2724x4331e76f(Function1 function1, List list) {
        this.$key = function1;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int index) {
        return this.$key.invoke(this.$items.get(index));
    }
}
