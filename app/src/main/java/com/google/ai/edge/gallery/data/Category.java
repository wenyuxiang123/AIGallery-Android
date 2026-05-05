package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.C2421R;
import kotlin.Metadata;

/* JADX INFO: compiled from: Categories.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/Category;", "", "<init>", "()V", "LLM", "Lcom/google/ai/edge/gallery/data/CategoryInfo;", "getLLM", "()Lcom/google/ai/edge/gallery/data/CategoryInfo;", "CLASSICAL_ML", "getCLASSICAL_ML", "EXPERIMENTAL", "getEXPERIMENTAL", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class Category {
    public static final int $stable = 0;
    public static final Category INSTANCE = new Category();
    private static final CategoryInfo LLM = new CategoryInfo("llm", Integer.valueOf(C2421R.string.category_llm), null, 4, null);
    private static final CategoryInfo CLASSICAL_ML = new CategoryInfo("classical_ml", Integer.valueOf(C2421R.string.category_llm), null, 4, null);
    private static final CategoryInfo EXPERIMENTAL = new CategoryInfo("experimental", Integer.valueOf(C2421R.string.category_experimental), null, 4, null);

    private Category() {
    }

    public final CategoryInfo getLLM() {
        return LLM;
    }

    public final CategoryInfo getCLASSICAL_ML() {
        return CLASSICAL_ML;
    }

    public final CategoryInfo getEXPERIMENTAL() {
        return EXPERIMENTAL;
    }
}
