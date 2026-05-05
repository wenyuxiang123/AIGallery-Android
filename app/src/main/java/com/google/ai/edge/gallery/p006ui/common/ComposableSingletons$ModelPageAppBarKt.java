package com.google.ai.edge.gallery.p006ui.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.rounded.ArrowBackKt;
import androidx.compose.material.icons.rounded.MapsUgcKt;
import androidx.compose.material.icons.rounded.TuneKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.C2421R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ModelPageAppBar.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$ModelPageAppBarKt {
    public static final ComposableSingletons$ModelPageAppBarKt INSTANCE = new ComposableSingletons$ModelPageAppBarKt();

    /* JADX INFO: renamed from: lambda$-1767215881, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f854lambda$1767215881 = ComposableLambdaKt.composableLambdaInstance(-1767215881, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$ModelPageAppBarKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ModelPageAppBarKt.lambda__1767215881$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1635306174, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f853lambda$1635306174 = ComposableLambdaKt.composableLambdaInstance(-1635306174, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$ModelPageAppBarKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ModelPageAppBarKt.lambda__1635306174$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-806051225, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f855lambda$806051225 = ComposableLambdaKt.composableLambdaInstance(-806051225, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$ModelPageAppBarKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ModelPageAppBarKt.lambda__806051225$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1635306174$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10837getLambda$1635306174$app_debug() {
        return f853lambda$1635306174;
    }

    /* JADX INFO: renamed from: getLambda$-1767215881$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10838getLambda$1767215881$app_debug() {
        return f854lambda$1767215881;
    }

    /* JADX INFO: renamed from: getLambda$-806051225$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10839getLambda$806051225$app_debug() {
        return f855lambda$806051225;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1767215881$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C139@5685L46,137@5586L156:ModelPageAppBar.kt#t7sjiu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1767215881, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$ModelPageAppBarKt.lambda$-1767215881.<anonymous> (ModelPageAppBar.kt:137)");
            }
            IconKt.m4075Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_navigate_back_icon, $composer, 0), (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1635306174$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C163@6788L47,164@6872L11,161@6699L256:ModelPageAppBar.kt#t7sjiu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1635306174, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$ModelPageAppBarKt.lambda$-1635306174.<anonymous> (ModelPageAppBar.kt:161)");
            }
            IconKt.m4075Iconww6aTOc(TuneKt.getTune(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_model_settings_icon, $composer, 0), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), $composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__806051225$lambda$3(Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        ComposerKt.sourceInformation($composer, "C188@7791L11,184@7635L568:ModelPageAppBar.kt#t7sjiu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-806051225, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$ModelPageAppBarKt.lambda$-806051225.<anonymous> (ModelPageAppBar.kt:184)");
            }
            Modifier modifier$iv = BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(32)), RoundedCornerShapeKt.getCircleShape()), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceContainer(), null, 2, null);
            Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (48 << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i2 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -392649632, "C193@8009L46,194@8096L11,191@7909L278:ModelPageAppBar.kt#t7sjiu");
            IconKt.m4075Iconww6aTOc(MapsUgcKt.getMapsUgc(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_reset_session_icon, $composer, 0), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), $composer, 384, 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
