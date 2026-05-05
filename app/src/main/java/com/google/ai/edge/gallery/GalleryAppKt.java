package com.google.ai.edge.gallery;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavHostController;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: GalleryApp.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m922d2 = {"GalleryApp", "", "navController", "Landroidx/navigation/NavHostController;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "(Landroidx/navigation/NavHostController;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GalleryAppKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryApp$lambda$0(NavHostController navHostController, ModelManagerViewModel modelManagerViewModel, int i, int i2, Composer composer, int i3) {
        GalleryApp(navHostController, modelManagerViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /*
        // Code decompiled incorrectly - placeholder implementation
        return null;
    public static final void GalleryApp(final androidx.navigation.NavHostController r8, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        // Code decompiled incorrectly - placeholder implementation
        return null;
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.GalleryAppKt.GalleryApp(androidx.navigation.NavHostController, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, androidx.compose.runtime.Composer, int, int):void");
    }
}
