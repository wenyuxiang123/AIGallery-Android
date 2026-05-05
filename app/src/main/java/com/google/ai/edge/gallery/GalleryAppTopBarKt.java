package com.google.ai.edge.gallery;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorProducer;
import androidx.compose.p000ui.graphics.painter.Painter;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.PainterResources_androidKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.ai.edge.gallery.data.AppBarAction;
import com.google.ai.edge.gallery.data.AppBarActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GalleryAppTopBar.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m922d2 = {"GalleryTopAppBar", "", "title", "", "modifier", "Landroidx/compose/ui/Modifier;", "leftAction", "Lcom/google/ai/edge/gallery/data/AppBarAction;", "rightAction", "scrollBehavior", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "subtitle", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/google/ai/edge/gallery/data/AppBarAction;Lcom/google/ai/edge/gallery/data/AppBarAction;Landroidx/compose/material3/TopAppBarScrollBehavior;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GalleryAppTopBarKt {

    /* JADX INFO: compiled from: GalleryAppTopBar.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppBarActionType.values().length];
            try {
                iArr[AppBarActionType.NAVIGATE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[AppBarActionType.MENU.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[AppBarActionType.APP_SETTING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryTopAppBar$lambda$6(String str, Modifier modifier, AppBarAction appBarAction, AppBarAction appBarAction2, TopAppBarScrollBehavior topAppBarScrollBehavior, String str2, int i, int i2, Composer composer, int i3) {
        GalleryTopAppBar(str, modifier, appBarAction, appBarAction2, topAppBarScrollBehavior, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void GalleryTopAppBar(final String title, Modifier modifier, AppBarAction leftAction, AppBarAction rightAction, TopAppBarScrollBehavior scrollBehavior, String subtitle, Composer $composer, final int $changed, final int i) {
        AppBarAction appBarAction;
        final AppBarAction rightAction2;
        TopAppBarScrollBehavior topAppBarScrollBehavior;
        String str;
        Modifier modifier2;
        AppBarAction rightAction3;
        String subtitle2;
        TopAppBarScrollBehavior scrollBehavior2;
        AppBarAction leftAction2;
        Modifier.Companion modifier3;
        final AppBarAction leftAction3;
        TopAppBarScrollBehavior scrollBehavior3;
        final String subtitle3;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer $composer2 = $composer.startRestartGroup(666547344);
        ComposerKt.sourceInformation($composer2, "C(GalleryTopAppBar)P(5,1)60@2353L11,62@2413L1028,97@3557L632,120@4249L630,61@2377L2507:GalleryAppTopBar.kt#9ty9oh");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(title) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
        } else if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(modifier) ? 32 : 16;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
            appBarAction = leftAction;
        } else if (($changed & 384) == 0) {
            appBarAction = leftAction;
            $dirty |= $composer2.changed(appBarAction) ? 256 : 128;
        } else {
            appBarAction = leftAction;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            rightAction2 = rightAction;
        } else if (($changed & 3072) == 0) {
            rightAction2 = rightAction;
            $dirty |= $composer2.changed(rightAction2) ? 2048 : 1024;
        } else {
            rightAction2 = rightAction;
        }
        int i5 = i & 16;
        if (i5 != 0) {
            $dirty |= 24576;
            topAppBarScrollBehavior = scrollBehavior;
        } else if (($changed & 24576) == 0) {
            topAppBarScrollBehavior = scrollBehavior;
            $dirty |= $composer2.changed(topAppBarScrollBehavior) ? 16384 : 8192;
        } else {
            topAppBarScrollBehavior = scrollBehavior;
        }
        int i6 = i & 32;
        if (i6 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f249xf2722a21;
            str = subtitle;
        } else if ((196608 & $changed) == 0) {
            str = subtitle;
            $dirty |= $composer2.changed(str) ? 131072 : 65536;
        } else {
            str = subtitle;
        }
        if (!$composer2.shouldExecute((74899 & $dirty) != 74898, $dirty & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            rightAction3 = rightAction2;
            subtitle2 = str;
            scrollBehavior2 = topAppBarScrollBehavior;
            leftAction2 = appBarAction;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier;
            }
            if (i3 == 0) {
                leftAction3 = appBarAction;
            } else {
                leftAction3 = null;
            }
            if (i4 != 0) {
                rightAction2 = null;
            }
            if (i5 == 0) {
                scrollBehavior3 = topAppBarScrollBehavior;
            } else {
                scrollBehavior3 = null;
            }
            if (i6 == 0) {
                subtitle3 = str;
            } else {
                subtitle3 = "";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(666547344, $dirty, -1, "com.google.ai.edge.gallery.GalleryTopAppBar (GalleryAppTopBar.kt:59)");
            }
            final long titleColor = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface();
            AppBarAction leftAction4 = leftAction3;
            AppBarKt.m3537CenterAlignedTopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-1477960053, true, new Function2() { // from class: com.google.ai.edge.gallery.GalleryAppTopBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GalleryAppTopBarKt.GalleryTopAppBar$lambda$3(subtitle3, title, titleColor, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), modifier3, ComposableLambdaKt.rememberComposableLambda(45802569, true, new Function2() { // from class: com.google.ai.edge.gallery.GalleryAppTopBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GalleryAppTopBarKt.GalleryTopAppBar$lambda$4(leftAction3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1762226560, true, new Function3() { // from class: com.google.ai.edge.gallery.GalleryAppTopBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GalleryAppTopBarKt.GalleryTopAppBar$lambda$5(rightAction2, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), 0.0f, null, null, scrollBehavior3, $composer2, ($dirty & 112) | 3462 | (($dirty << 9) & 29360128), 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            leftAction2 = leftAction4;
            modifier2 = modifier3;
            scrollBehavior2 = scrollBehavior3;
            subtitle2 = subtitle3;
            rightAction3 = rightAction2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final AppBarAction appBarAction2 = leftAction2;
            final AppBarAction appBarAction3 = rightAction3;
            final TopAppBarScrollBehavior topAppBarScrollBehavior2 = scrollBehavior2;
            final String str2 = subtitle2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.GalleryAppTopBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GalleryAppTopBarKt.GalleryTopAppBar$lambda$6(title, modifier4, appBarAction2, appBarAction3, topAppBarScrollBehavior2, str2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryTopAppBar$lambda$3(String $subtitle, String $title, final long $titleColor, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        ComposerKt.sourceInformation($composer, "C63@2421L1014:GalleryAppTopBar.kt#9ty9oh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1477960053, $changed, -1, "com.google.ai.edge.gallery.GalleryTopAppBar.<anonymous> (GalleryAppTopBar.kt:63)");
            }
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            int $changed$iv$iv = (384 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i2 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1012515259, "C64@2490L726:GalleryAppTopBar.kt#9ty9oh");
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier$iv$iv = Modifier.INSTANCE;
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv2 = (432 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, modifier$iv$iv);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor2;
                $composer.createNode(function02);
            } else {
                function02 = constructor2;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1457124934, "C68@2651L33,79@3001L14,80@3051L10,76@2918L288:GalleryAppTopBar.kt#9ty9oh");
            if (Intrinsics.areEqual($title, StringResources_androidKt.stringResource(C2421R.string.app_name, $composer, 0))) {
                $composer.startReplaceGroup(-1457088076);
                ComposerKt.sourceInformation($composer, "70@2720L32,69@2700L195");
                IconKt.m4074Iconww6aTOc(PainterResources_androidKt.painterResource(C2421R.drawable.logo, $composer, 0), (String) null, SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(20)), Color.INSTANCE.m6951getUnspecified0d7_KjU(), $composer, Painter.$stable | 3504, 0);
            } else {
                $composer.startReplaceGroup(-1459760431);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart($composer, -878276961, "CC(remember):GalleryAppTopBar.kt#9igjgp");
            boolean invalid$iv = $composer.changed($titleColor);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = (ColorProducer) new ColorProducer() { // from class: com.google.ai.edge.gallery.GalleryAppTopBarKt$GalleryTopAppBar$1$1$1$1$1
                    @Override // androidx.compose.p000ui.graphics.ColorProducer
                    public final long mo3149invoke0d7_KjU() {
                        return $titleColor;
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BasicTextKt.m2380BasicTextRWo7tUw($title, (Modifier) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 1, 0, (ColorProducer) it$iv, TextAutoSize.INSTANCE.m2476StepBasedvU0ePk(TextUnitKt.getSp(14), TextUnitKt.getSp(16), TextUnitKt.getSp(1)), $composer, 1572864, 186);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if ($subtitle.length() > 0) {
                $composer.startReplaceGroup(-1011782978);
                ComposerKt.sourceInformation($composer, "88@3326L10,89@3383L11,86@3264L153");
                TextKt.m4781TextNvy7gAk($subtitle, null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSecondary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 0, 0, 131066);
            } else {
                $composer.startReplaceGroup(-1015015379);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryTopAppBar$lambda$4(AppBarAction $leftAction, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:GalleryAppTopBar.kt#9ty9oh");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(45802569, $changed, -1, "com.google.ai.edge.gallery.GalleryTopAppBar.<anonymous> (GalleryAppTopBar.kt:98)");
            }
            AppBarActionType actionType = $leftAction != null ? $leftAction.getActionType() : null;
            switch (actionType != null ? WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()] : -1) {
                case 1:
                    $composer.startReplaceGroup(-1295179689);
                    ComposerKt.sourceInformation($composer, "100@3649L236");
                    IconButtonKt.IconButton($leftAction.getActionFn(), null, false, null, null, null, ComposableSingletons$GalleryAppTopBarKt.INSTANCE.m10359getLambda$1788622221$app_debug(), $composer, 1572864, 62);
                    $composer.endReplaceGroup();
                    break;
                case 2:
                    $composer.startReplaceGroup(-1294891017);
                    ComposerKt.sourceInformation($composer, "108@3941L204");
                    IconButtonKt.IconButton($leftAction.getActionFn(), null, false, null, null, null, ComposableSingletons$GalleryAppTopBarKt.INSTANCE.getLambda$1301296042$app_debug(), $composer, 1572864, 62);
                    $composer.endReplaceGroup();
                    break;
                default:
                    $composer.startReplaceGroup(-1294655913);
                    $composer.endReplaceGroup();
                    break;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryTopAppBar$lambda$5(AppBarAction $rightAction, RowScope CenterAlignedTopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(CenterAlignedTopAppBar, "$this$CenterAlignedTopAppBar");
        ComposerKt.sourceInformation($composer, "C:GalleryAppTopBar.kt#9ty9oh");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1762226560, $changed, -1, "com.google.ai.edge.gallery.GalleryTopAppBar.<anonymous> (GalleryAppTopBar.kt:121)");
            }
            AppBarActionType actionType = $rightAction != null ? $rightAction.getActionType() : null;
            switch (actionType != null ? WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()] : -1) {
                case 1:
                    $composer.startReplaceGroup(-1105676559);
                    ComposerKt.sourceInformation($composer, "135@4776L59");
                    ButtonKt.TextButton($rightAction.getActionFn(), null, false, null, null, null, null, null, null, ComposableSingletons$GalleryAppTopBarKt.INSTANCE.getLambda$878060766$app_debug(), $composer, 805306368, 510);
                    $composer.endReplaceGroup();
                    break;
                case 2:
                default:
                    $composer.startReplaceGroup(-1105580800);
                    $composer.endReplaceGroup();
                    break;
                case 3:
                    $composer.startReplaceGroup(-1106052620);
                    ComposerKt.sourceInformation($composer, "124@4390L280");
                    IconButtonKt.IconButton($rightAction.getActionFn(), null, false, null, null, null, ComposableSingletons$GalleryAppTopBarKt.INSTANCE.m10360getLambda$1862469738$app_debug(), $composer, 1572864, 62);
                    $composer.endReplaceGroup();
                    break;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
