package com.google.ai.edge.gallery.p006ui.llmchat;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.style.TextAlign;
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
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.RuntimeType;
import com.google.ai.edge.gallery.p006ui.theme.TypeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LlmChatScreen.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$LlmChatScreenKt {
    public static final ComposableSingletons$LlmChatScreenKt INSTANCE = new ComposableSingletons$LlmChatScreenKt();
    private static Function3<Model, Composer, Integer, Unit> lambda$830606768 = ComposableLambdaKt.composableLambdaInstance(830606768, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.llmchat.ComposableSingletons$LlmChatScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$LlmChatScreenKt.lambda_830606768$lambda$0((Model) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1219269216, reason: not valid java name */
    private static Function3<Model, Composer, Integer, Unit> f892lambda$1219269216 = ComposableLambdaKt.composableLambdaInstance(-1219269216, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.llmchat.ComposableSingletons$LlmChatScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$LlmChatScreenKt.lambda__1219269216$lambda$1((Model) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-159269329, reason: not valid java name */
    private static Function3<Model, Composer, Integer, Unit> f893lambda$159269329 = ComposableLambdaKt.composableLambdaInstance(-159269329, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.llmchat.ComposableSingletons$LlmChatScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$LlmChatScreenKt.lambda__159269329$lambda$4((Model) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-295879345, reason: not valid java name */
    private static Function3<Model, Composer, Integer, Unit> f895lambda$295879345 = ComposableLambdaKt.composableLambdaInstance(-295879345, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.llmchat.ComposableSingletons$LlmChatScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$LlmChatScreenKt.lambda__295879345$lambda$7((Model) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<Model, Composer, Integer, Unit> lambda$1511550292 = ComposableLambdaKt.composableLambdaInstance(1511550292, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.llmchat.ComposableSingletons$LlmChatScreenKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$LlmChatScreenKt.lambda_1511550292$lambda$8((Model) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2030167740, reason: not valid java name */
    private static Function3<Model, Composer, Integer, Unit> f894lambda$2030167740 = ComposableLambdaKt.composableLambdaInstance(-2030167740, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.llmchat.ComposableSingletons$LlmChatScreenKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$LlmChatScreenKt.lambda__2030167740$lambda$9((Model) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1219269216$app_debug, reason: not valid java name */
    public final Function3<Model, Composer, Integer, Unit> m11095getLambda$1219269216$app_debug() {
        return f892lambda$1219269216;
    }

    /* JADX INFO: renamed from: getLambda$-159269329$app_debug, reason: not valid java name */
    public final Function3<Model, Composer, Integer, Unit> m11096getLambda$159269329$app_debug() {
        return f893lambda$159269329;
    }

    /* JADX INFO: renamed from: getLambda$-2030167740$app_debug, reason: not valid java name */
    public final Function3<Model, Composer, Integer, Unit> m11097getLambda$2030167740$app_debug() {
        return f894lambda$2030167740;
    }

    /* JADX INFO: renamed from: getLambda$-295879345$app_debug, reason: not valid java name */
    public final Function3<Model, Composer, Integer, Unit> m11098getLambda$295879345$app_debug() {
        return f895lambda$295879345;
    }

    public final Function3<Model, Composer, Integer, Unit> getLambda$1511550292$app_debug() {
        return lambda$1511550292;
    }

    public final Function3<Model, Composer, Integer, Unit> getLambda$830606768$app_debug() {
        return lambda$830606768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_830606768$lambda$0(Model it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C:LlmChatScreen.kt#t2uuva");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(830606768, $changed, -1, "com.google.ai.edge.gallery.ui.llmchat.ComposableSingletons$LlmChatScreenKt.lambda$830606768.<anonymous> (LlmChatScreen.kt:66)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1219269216$lambda$1(Model it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C:LlmChatScreen.kt#t2uuva");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1219269216, $changed, -1, "com.google.ai.edge.gallery.ui.llmchat.ComposableSingletons$LlmChatScreenKt.lambda$-1219269216.<anonymous> (LlmChatScreen.kt:71)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__159269329$lambda$4(Model model, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Intrinsics.checkNotNullParameter(model, "model");
        ComposerKt.sourceInformation($composer, "C115@4485L815:LlmChatScreen.kt#t2uuva");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-159269329, $changed, -1, "com.google.ai.edge.gallery.ui.llmchat.ComposableSingletons$LlmChatScreenKt.lambda$-159269329.<anonymous> (LlmChatScreen.kt:115)");
        }
        Modifier modifier$iv = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (6 << 3) & 112;
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
        int i2 = ((6 >> 6) & 112) | 6;
        BoxScope $this$lambda__159269329_u24lambda_u244_u24lambda_u243 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, 1388527544, "C116@4534L758:LlmChatScreen.kt#t2uuva");
        Modifier modifier$iv2 = PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default($this$lambda__159269329_u24lambda_u244_u24lambda_u243.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), C1654Dp.m9788constructorimpl(48), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(48), 7, null);
        Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(12));
        ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
        int $changed$iv$iv2 = (432 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
        CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, modifier$iv2);
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
        ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        int i4 = ((432 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, 449045276, "C122@4811L50,122@4806L81,127@5098L26,129@5199L11,126@5080L202:LlmChatScreen.kt#t2uuva");
        TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.askimage_emptystate_title, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getEmptyStateTitle(), $composer, 0, 12582912, 131070);
        int contentRes = model.getRuntimeType() == RuntimeType.AICORE ? C2421R.string.askimage_emptystate_content_aicore : C2421R.string.askimage_emptystate_content;
        String strStringResource = StringResources_androidKt.stringResource(contentRes, $composer, 0);
        TextStyle emptyStateContent = TypeKt.getEmptyStateContent();
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int contentRes2 = MaterialTheme.$stable;
        TextKt.m4781TextNvy7gAk(strStringResource, null, materialTheme.getColorScheme($composer, contentRes2).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, TextAlign.m9620boximpl(TextAlign.INSTANCE.m9627getCentere0LSkKk()), 0L, 0, false, 0, 0, null, emptyStateContent, $composer, 0, 12582912, 130042);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__295879345$lambda$7(Model it, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C154@5799L659:LlmChatScreen.kt#t2uuva");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-295879345, $changed, -1, "com.google.ai.edge.gallery.ui.llmchat.ComposableSingletons$LlmChatScreenKt.lambda$-295879345.<anonymous> (LlmChatScreen.kt:154)");
        }
        Modifier modifier$iv = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (6 << 3) & 112;
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
        int i2 = ((6 >> 6) & 112) | 6;
        BoxScope $this$lambda__295879345_u24lambda_u247_u24lambda_u246 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, -1026434636, "C155@5848L602:LlmChatScreen.kt#t2uuva");
        Modifier modifier$iv2 = PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default($this$lambda__295879345_u24lambda_u247_u24lambda_u246.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), C1654Dp.m9788constructorimpl(48), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(48), 7, null);
        Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(12));
        ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
        int $changed$iv$iv2 = (432 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
        CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, modifier$iv2);
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
        ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        int i4 = ((432 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -1965916904, "C161@6125L50,161@6120L81,163@6230L52,165@6357L11,162@6212L228:LlmChatScreen.kt#t2uuva");
        TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.askaudio_emptystate_title, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getEmptyStateTitle(), $composer, 0, 12582912, 131070);
        TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.askaudio_emptystate_content, $composer, 0), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, TextAlign.m9620boximpl(TextAlign.INSTANCE.m9627getCentere0LSkKk()), 0L, 0, false, 0, 0, null, TypeKt.getEmptyStateContent(), $composer, 0, 12582912, 130042);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1511550292$lambda$8(Model it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C:LlmChatScreen.kt#t2uuva");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1511550292, $changed, -1, "com.google.ai.edge.gallery.ui.llmchat.ComposableSingletons$LlmChatScreenKt.lambda$1511550292.<anonymous> (LlmChatScreen.kt:185)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__2030167740$lambda$9(Model it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C:LlmChatScreen.kt#t2uuva");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2030167740, $changed, -1, "com.google.ai.edge.gallery.ui.llmchat.ComposableSingletons$LlmChatScreenKt.lambda$-2030167740.<anonymous> (LlmChatScreen.kt:186)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
