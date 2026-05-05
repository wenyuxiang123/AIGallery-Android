package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.rounded.SendKt;
import androidx.compose.material.icons.outlined.AddKt;
import androidx.compose.material.icons.rounded.AudioFileKt;
import androidx.compose.material.icons.rounded.CloseKt;
import androidx.compose.material.icons.rounded.FlipCameraAndroidKt;
import androidx.compose.material.icons.rounded.HistoryKt;
import androidx.compose.material.icons.rounded.MicKt;
import androidx.compose.material.icons.rounded.PhotoCameraKt;
import androidx.compose.material.icons.rounded.PhotoKt;
import androidx.compose.material.icons.rounded.StopKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageInputText.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$MessageInputTextKt {
    public static final ComposableSingletons$MessageInputTextKt INSTANCE = new ComposableSingletons$MessageInputTextKt();

    /* JADX INFO: renamed from: lambda$-608594390, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f873lambda$608594390 = ComposableLambdaKt.composableLambdaInstance(-608594390, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageInputTextKt.lambda__608594390$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-54225693, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f872lambda$54225693 = ComposableLambdaKt.composableLambdaInstance(-54225693, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageInputTextKt.lambda__54225693$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1035442956 = ComposableLambdaKt.composableLambdaInstance(1035442956, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageInputTextKt.lambda_1035442956$lambda$4((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2088637172, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f871lambda$2088637172 = ComposableLambdaKt.composableLambdaInstance(-2088637172, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageInputTextKt.lambda__2088637172$lambda$6((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1405881589 = ComposableLambdaKt.composableLambdaInstance(1405881589, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageInputTextKt.lambda_1405881589$lambda$8((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1440992798 = ComposableLambdaKt.composableLambdaInstance(1440992798, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageInputTextKt.lambda_1440992798$lambda$10((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1470496560, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f868lambda$1470496560 = ComposableLambdaKt.composableLambdaInstance(-1470496560, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$MessageInputTextKt.lambda__1470496560$lambda$11((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1671926669, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f869lambda$1671926669 = ComposableLambdaKt.composableLambdaInstance(-1671926669, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageInputTextKt.lambda__1671926669$lambda$12((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$500302881 = ComposableLambdaKt.composableLambdaInstance(500302881, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageInputTextKt.lambda_500302881$lambda$13((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1297702935, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f867lambda$1297702935 = ComposableLambdaKt.composableLambdaInstance(-1297702935, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageInputTextKt.lambda__1297702935$lambda$14((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1911480928 = ComposableLambdaKt.composableLambdaInstance(1911480928, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageInputTextKt.lambda_1911480928$lambda$15((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1692355196, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f870lambda$1692355196 = ComposableLambdaKt.composableLambdaInstance(-1692355196, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageInputTextKt.lambda__1692355196$lambda$16((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1297702935$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10953getLambda$1297702935$app_debug() {
        return f867lambda$1297702935;
    }

    /* JADX INFO: renamed from: getLambda$-1470496560$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10954getLambda$1470496560$app_debug() {
        return f868lambda$1470496560;
    }

    /* JADX INFO: renamed from: getLambda$-1671926669$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10955getLambda$1671926669$app_debug() {
        return f869lambda$1671926669;
    }

    /* JADX INFO: renamed from: getLambda$-1692355196$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10956getLambda$1692355196$app_debug() {
        return f870lambda$1692355196;
    }

    /* JADX INFO: renamed from: getLambda$-2088637172$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10957getLambda$2088637172$app_debug() {
        return f871lambda$2088637172;
    }

    /* JADX INFO: renamed from: getLambda$-54225693$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10958getLambda$54225693$app_debug() {
        return f872lambda$54225693;
    }

    /* JADX INFO: renamed from: getLambda$-608594390$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10959getLambda$608594390$app_debug() {
        return f873lambda$608594390;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1035442956$app_debug() {
        return lambda$1035442956;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1405881589$app_debug() {
        return lambda$1405881589;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1440992798$app_debug() {
        return lambda$1440992798;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1911480928$app_debug() {
        return lambda$1911480928;
    }

    public final Function2<Composer, Integer, Unit> getLambda$500302881$app_debug() {
        return lambda$500302881;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__608594390$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C431@17999L44,429@17904L221:MessageInputText.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-608594390, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt.lambda$-608594390.<anonymous> (MessageInputText.kt:429)");
            }
            IconKt.m4075Iconww6aTOc(AddKt.getAdd(Icons.Outlined.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_add_content_icon, $composer, 0), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(24)), 0L, $composer, 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__54225693$lambda$2(Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        ComposerKt.sourceInformation($composer, "C449@18902L368:MessageInputText.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-54225693, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt.lambda$-54225693.<anonymous> (MessageInputText.kt:449)");
            }
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv = (432 << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i2 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 401484565, "C453@19129L58,454@19218L22:MessageInputText.kt#ouynps");
            IconKt.m4075Iconww6aTOc(PhotoCameraKt.getPhotoCamera(Icons.Rounded.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            TextKt.m4781TextNvy7gAk("Take a picture", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1035442956$lambda$4(Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        ComposerKt.sourceInformation($composer, "C486@20690L363:MessageInputText.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035442956, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt.lambda$1035442956.<anonymous> (MessageInputText.kt:486)");
            }
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv = (432 << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i2 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 2115780273, "C490@20917L52,491@21000L23:MessageInputText.kt#ouynps");
            IconKt.m4075Iconww6aTOc(PhotoKt.getPhoto(Icons.Rounded.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            TextKt.m4781TextNvy7gAk("Pick from album", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__2088637172$lambda$6(Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        ComposerKt.sourceInformation($composer, "C518@22271L363:MessageInputText.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2088637172, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt.lambda$-2088637172.<anonymous> (MessageInputText.kt:518)");
            }
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv = (432 << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i2 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 291024049, "C522@22498L50,523@22579L25:MessageInputText.kt#ouynps");
            IconKt.m4075Iconww6aTOc(MicKt.getMic(Icons.Rounded.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            TextKt.m4781TextNvy7gAk("Record audio clip", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1405881589$lambda$8(Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        ComposerKt.sourceInformation($composer, "C550@23768L365:MessageInputText.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1405881589, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt.lambda$1405881589.<anonymous> (MessageInputText.kt:550)");
            }
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv = (432 << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i2 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1538093210, "C554@23995L56,555@24082L21:MessageInputText.kt#ouynps");
            IconKt.m4075Iconww6aTOc(AudioFileKt.getAudioFile(Icons.Rounded.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            TextKt.m4781TextNvy7gAk("Pick wav file", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1440992798$lambda$10(Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        ComposerKt.sourceInformation($composer, "C585@25465L351:MessageInputText.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1440992798, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt.lambda$1440992798.<anonymous> (MessageInputText.kt:585)");
            }
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv = (432 << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i2 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 20170849, "C589@25684L54,590@25767L21:MessageInputText.kt#ouynps");
            IconKt.m4075Iconww6aTOc(HistoryKt.getHistory(Icons.Rounded.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            TextKt.m4781TextNvy7gAk("Input history", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1470496560$lambda$11(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C607@26383L31,607@26378L37:MessageInputText.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1470496560, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt.lambda$-1470496560.<anonymous> (MessageInputText.kt:607)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.skills, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1671926669$lambda$12(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C624@27071L37,625@27155L11,622@26976L223:MessageInputText.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1671926669, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt.lambda$-1671926669.<anonymous> (MessageInputText.kt:622)");
            }
            IconKt.m4075Iconww6aTOc(StopKt.getStop(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_stop_icon, $composer, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_500302881$lambda$13(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C657@28465L44,655@28361L273:MessageInputText.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(500302881, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt.lambda$500302881.<anonymous> (MessageInputText.kt:655)");
            }
            IconKt.m4075Iconww6aTOc(SendKt.getSend(Icons.AutoMirrored.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_send_prompt_icon, $composer, 0), OffsetKt.m1945offsetVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(2), 0.0f, 2, null), Color.INSTANCE.m6952getWhite0d7_KjU(), $composer, 3456, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1297702935$lambda$14(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C805@33653L38,806@33726L11,803@33581L177:MessageInputText.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1297702935, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt.lambda$-1297702935.<anonymous> (MessageInputText.kt:803)");
            }
            IconKt.m4075Iconww6aTOc(CloseKt.getClose(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_close_icon, $composer, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1911480928$lambda$15(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C849@35548L47,850@35630L11,847@35470L239:MessageInputText.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1911480928, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt.lambda$1911480928.<anonymous> (MessageInputText.kt:847)");
            }
            IconKt.m4075Iconww6aTOc(PhotoCameraKt.getPhotoCamera(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_camera_shutter_icon, $composer, 0), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(36)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), $composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1692355196$lambda$16(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C874@36499L57,875@36593L11,872@36411L276:MessageInputText.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1692355196, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageInputTextKt.lambda$-1692355196.<anonymous> (MessageInputText.kt:872)");
            }
            IconKt.m4075Iconww6aTOc(FlipCameraAndroidKt.getFlipCameraAndroid(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_toggle_front_back_camera_icon, $composer, 0), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSecondaryContainer(), $composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
