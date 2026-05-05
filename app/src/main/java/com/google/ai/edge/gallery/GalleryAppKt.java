package com.google.ai.edge.gallery;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavHostController;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import kotlin.Metadata;
import kotlin.Unit;



V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class GalleryAppKt {
    
    public static final Unit GalleryApp$lambda$0(NavHostController navHostController, ModelManagerViewModel modelManagerViewModel, int i, int i2, Composer composer, int i3) {
        GalleryApp(navHostController, modelManagerViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GalleryApp(final androidx.navigation.NavHostController r8, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            java.lang.String r0 = "modelManagerViewModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 619396692(0x24eb3e54, float:1.0202059E-16)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            java.lang.String r1 = "C(GalleryApp)P(1)30@1133L92:GalleryApp.kt#9ty9oh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r11
            r2 = r11 & 6
            if (r2 != 0) goto L24
            r2 = r12 & 1
            if (r2 != 0) goto L22
            boolean r2 = r10.changedInstance(r8)
            if (r2 == 0) goto L22
            r2 = 4
            goto L23
        L22:
            r2 = 2
        L23:
            r1 = r1 | r2
        L24:
            r2 = r11 & 48
            if (r2 != 0) goto L34
            boolean r2 = r10.changedInstance(r9)
            if (r2 == 0) goto L31
            r2 = 32
            goto L33
        L31:
            r2 = 16
        L33:
            r1 = r1 | r2
        L34:
            r2 = r1 & 19
            r3 = 18
            r4 = 0
            if (r2 == r3) goto L3d
            r2 = 1
            goto L3e
        L3d:
            r2 = r4
        L3e:
            r3 = r1 & 1
            boolean r2 = r10.shouldExecute(r2, r3)
            if (r2 == 0) goto L9c
            r10.startDefaults()
            java.lang.String r2 = "27@1054L23"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r2)
            r2 = r11 & 1
            if (r2 == 0) goto L63
            boolean r2 = r10.getDefaultsInvalid()
            if (r2 == 0) goto L59
            goto L63
        L59:
            r10.skipToGroupEnd()
            r2 = r12 & 1
            if (r2 == 0) goto L71
            r1 = r1 & (-15)
            goto L71
        L63:
            r2 = r12 & 1
            if (r2 == 0) goto L71
            androidx.navigation.Navigator[] r2 = new androidx.navigation.Navigator[r4]
            androidx.navigation.NavHostController r8 = androidx.navigation.compose.NavHostControllerKt.rememberNavController(r2, r10, r4)
            r1 = r1 & (-15)
            r7 = r1
            goto L72
        L71:
            r7 = r1
        L72:
            r10.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L81
            r1 = -1
            java.lang.String r2 = "com.google.ai.edge.gallery.GalleryApp (GalleryApp.kt:29)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r7, r1, r2)
        L81:
            r0 = r7 & 14
            int r1 = r7 << 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r0 | r1
            r6 = 2
            r2 = 0
            r1 = r8
            r3 = r9
            r4 = r10
            com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt.GalleryNavHost(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L9a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L9a:
            r1 = r7
            goto L9f
        L9c:
            r10.skipToGroupEnd()
        L9f:
            androidx.compose.runtime.ScopeUpdateScope r0 = r10.endRestartGroup()
            if (r0 == 0) goto Lad
            com.google.ai.edge.gallery.GalleryAppKt$$ExternalSyntheticLambda0 r2 = new com.google.ai.edge.gallery.GalleryAppKt$$ExternalSyntheticLambda0
            r2.<init>()
            r0.updateScope(r2)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.GalleryAppKt.GalleryApp(androidx.navigation.NavHostController, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, androidx.compose.runtime.Composer, int, int):void");
    }
}
