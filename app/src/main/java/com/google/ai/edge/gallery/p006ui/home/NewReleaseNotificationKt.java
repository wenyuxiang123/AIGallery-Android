package com.google.ai.edge.gallery.p006ui.home;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.rounded.OpenInNewKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.google.ai.edge.gallery.p006ui.common.ClickableLinkKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: NewReleaseNotification.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\u0001X\u008a\u008e\u0002"}, m922d2 = {"TAG", "", "REPO", "NewReleaseNotification", "", "(Landroidx/compose/runtime/Composer;I)V", "isNewerRelease", "", "currentRelease", "newRelease", "app_debug", "newReleaseVersion", "newReleaseUrl"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class NewReleaseNotificationKt {
    private static final String REPO = "google-ai-edge/gallery";
    private static final String TAG = "AGNewReleaseNotifi";

    /* JADX INFO: compiled from: NewReleaseNotification.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewReleaseNotification$lambda$13(int i, Composer composer, int i2) {
        NewReleaseNotification(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void NewReleaseNotification(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-978847794);
        ComposerKt.sourceInformation($composer2, "C(NewReleaseNotification)61@2429L31,62@2484L31,63@2575L7,64@2606L24,66@2667L1224,66@2634L1257,103@4008L817,100@3895L930:NewReleaseNotification.kt#lrhf9m");
        if ($composer2.shouldExecute($changed != 0, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-978847794, $changed, -1, "com.google.ai.edge.gallery.ui.home.NewReleaseNotification (NewReleaseNotification.kt:60)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -74889939, "CC(remember):NewReleaseNotification.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableState newReleaseVersion$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -74888179, "CC(remember):NewReleaseNotification.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableState newReleaseUrl$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object it$iv$iv = $composer2.rememberedValue();
            if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
                $composer2.updateRememberedValue(value$iv$iv);
                it$iv$iv = value$iv$iv;
            }
            final CoroutineScope coroutineScope = (CoroutineScope) it$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -74881130, "CC(remember):NewReleaseNotification.kt#9igjgp");
            boolean invalid$iv = $composer2.changedInstance(coroutineScope) | $composer2.changedInstance(lifecycleOwner);
            Object it$iv3 = $composer2.rememberedValue();
            if (invalid$iv || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.ui.home.NewReleaseNotificationKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NewReleaseNotificationKt.NewReleaseNotification$lambda$9$lambda$8(lifecycleOwner, coroutineScope, newReleaseVersion$delegate, newReleaseUrl$delegate, (DisposableEffectScope) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) it$iv3, $composer2, 0);
            AnimatedVisibilityKt.AnimatedVisibility(NewReleaseNotification$lambda$1(newReleaseVersion$delegate).length() > 0, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-2144683530, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.home.NewReleaseNotificationKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return NewReleaseNotificationKt.NewReleaseNotification$lambda$12(newReleaseVersion$delegate, newReleaseUrl$delegate, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 196992, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.home.NewReleaseNotificationKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewReleaseNotificationKt.NewReleaseNotification$lambda$13($changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String NewReleaseNotification$lambda$1(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String NewReleaseNotification$lambda$4(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult NewReleaseNotification$lambda$9$lambda$8(final LifecycleOwner $lifecycleOwner, final CoroutineScope $coroutineScope, final MutableState $newReleaseVersion$delegate, final MutableState $newReleaseUrl$delegate, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver observer = new LifecycleEventObserver() { // from class: com.google.ai.edge.gallery.ui.home.NewReleaseNotificationKt$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                NewReleaseNotificationKt.NewReleaseNotification$lambda$9$lambda$8$lambda$6($coroutineScope, $newReleaseVersion$delegate, $newReleaseUrl$delegate, lifecycleOwner, event);
            }
        };
        $lifecycleOwner.getLifecycle().addObserver(observer);
        return new DisposableEffectResult() { // from class: com.google.ai.edge.gallery.ui.home.NewReleaseNotificationKt$NewReleaseNotification$lambda$9$lambda$8$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                $lifecycleOwner.getLifecycle().removeObserver(observer);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewReleaseNotification$lambda$9$lambda$8$lambda$6(CoroutineScope $coroutineScope, MutableState $newReleaseVersion$delegate, MutableState $newReleaseUrl$delegate, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new NewReleaseNotificationKt$NewReleaseNotification$1$1$observer$1$1($newReleaseVersion$delegate, $newReleaseUrl$delegate, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewReleaseNotification$lambda$12(MutableState $newReleaseVersion$delegate, MutableState $newReleaseUrl$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C111@4291L11,104@4014L807:NewReleaseNotification.kt#lrhf9m");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2144683530, $changed, -1, "com.google.ai.edge.gallery.ui.home.NewReleaseNotification.<anonymous> (NewReleaseNotification.kt:104)");
        }
        Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
        Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        Modifier modifier$iv = PaddingKt.m1988padding3ABfNKs(BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(12), 7, null), RoundedCornerShapeKt.getCircleShape()), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getTertiaryContainer(), null, 2, null), C1654Dp.m9788constructorimpl(4));
        Arrangement.Horizontal horizontalArrangement$iv = spaceBetween;
        ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
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
        ComposerKt.sourceInformationMarkerStart($composer, -2108884340, "C116@4450L10,114@4362L170,119@4539L276:NewReleaseNotification.kt#lrhf9m");
        TextKt.m4781TextNvy7gAk("New release " + NewReleaseNotification$lambda$1($newReleaseVersion$delegate) + " available", PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 48, 0, 131068);
        Modifier modifier$iv2 = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(12), 0.0f, 11, null);
        Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.getStart();
        MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
        int $changed$iv$iv2 = (390 << 3) & 112;
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
        ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        int i4 = ((390 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, 1710782378, "C123@4668L139:NewReleaseNotification.kt#lrhf9m");
        ClickableLinkKt.m10826ClickableLink6ERogkM(NewReleaseNotification$lambda$4($newReleaseUrl$delegate), "View", null, OpenInNewKt.getOpenInNew(Icons.AutoMirrored.Rounded.INSTANCE), 0, $composer, 48, 20);
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
    public static final boolean isNewerRelease(String currentRelease, String newRelease) {
        Iterable $this$map$iv = StringsKt.split$default((CharSequence) currentRelease, new char[]{'.'}, false, 0, 6, (Object) null);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            Integer intOrNull = StringsKt.toIntOrNull(it);
            destination$iv$iv.add(Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0));
        }
        List currentComponents = (List) destination$iv$iv;
        Iterable $this$map$iv2 = StringsKt.split$default((CharSequence) newRelease, new char[]{'.'}, false, 0, 6, (Object) null);
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
        for (Object item$iv$iv2 : $this$map$iv2) {
            String it2 = (String) item$iv$iv2;
            Integer intOrNull2 = StringsKt.toIntOrNull(it2);
            destination$iv$iv2.add(Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0));
        }
        List newComponents = (List) destination$iv$iv2;
        int maxComponents = Math.max(currentComponents.size(), newComponents.size());
        int i = 0;
        while (i < maxComponents) {
            int currentComponent = ((Number) (i >= 0 && i < currentComponents.size() ? currentComponents.get(i) : 0)).intValue();
            int newComponent = ((Number) (i >= 0 && i < newComponents.size() ? newComponents.get(i) : 0)).intValue();
            if (newComponent > currentComponent) {
                return true;
            }
            if (newComponent < currentComponent) {
                return false;
            }
            i++;
        }
        return false;
    }
}
