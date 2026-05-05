package com.google.ai.edge.gallery.p006ui.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.ConfigDialogKt$BottomSheetSelectorRow$lambda$108$lambda$107$lambda$106$lambda$105$$inlined$items$default$2 */
/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class C2665x258ddcbc implements Function1<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $key;

    public C2665x258ddcbc(Function1 function1, List list) {
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
