package com.google.ai.edge.gallery.ui.common.textandvoiceinput;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.ProfileVerifier;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.ColorUtilsKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: HoldToDictate.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aW\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\rX\u008a\u008e\u0002"}, m922d2 = {"TAG", "", "HoldToDictate", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "viewModel", "Lcom/google/ai/edge/gallery/ui/common/textandvoiceinput/HoldToDictateViewModel;", "onDone", "Lkotlin/Function1;", "onAmplitudeChanged", "", "enabled", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/common/textandvoiceinput/HoldToDictateViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "uiState", "Lcom/google/ai/edge/gallery/ui/common/textandvoiceinput/HoldToDictateUiState;", "recordAudioPermissionGranted"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class HoldToDictateKt {
    private static final String TAG = "AGHoldToDictate";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HoldToDictate$lambda$11(Task task, HoldToDictateViewModel holdToDictateViewModel, Function1 function1, Function1 function12, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HoldToDictate(task, holdToDictateViewModel, function1, function12, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void HoldToDictate(final Task task, final HoldToDictateViewModel viewModel, final Function1<? super String, Unit> onDone, final Function1<? super Integer, Unit> onAmplitudeChanged, final boolean enabled, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        int $dirty;
        Modifier modifier$iv$iv;
        Modifier.Companion companionPointerInput;
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Intrinsics.checkNotNullParameter(onAmplitudeChanged, "onAmplitudeChanged");
        Composer $composer2 = $composer.startRestartGroup(39827100);
        ComposerKt.sourceInformation($composer2, "C(HoldToDictate)P(4,5,3,2)67@2737L16,68@2792L34,69@2856L7,72@2986L117,72@2907L196,79@3128L398,79@3107L419:HoldToDictate.kt#yuot9y");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changedInstance(task) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer2.changedInstance(viewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer2.changedInstance(onDone) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer2.changedInstance(onAmplitudeChanged) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty2 |= $composer2.changed(enabled) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.f249xf2722a21;
            modifier2 = modifier;
        } else if ((196608 & $changed) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer2.changed(modifier2) ? 131072 : 65536;
        } else {
            modifier2 = modifier;
        }
        int $dirty3 = $dirty2;
        if (!$composer2.shouldExecute((74899 & $dirty3) != 74898, $dirty3 & 1)) {
            $dirty = $dirty3;
            $composer2.skipToGroupEnd();
            modifier$iv$iv = modifier2;
        } else {
            if (i2 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(39827100, $dirty3, -1, "com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictate (HoldToDictate.kt:66)");
            }
            State uiState$delegate = SnapshotStateKt.collectAsState(viewModel.getUiState(), null, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, -380853122, "CC(remember):HoldToDictate.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableState recordAudioPermissionGranted$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Context context = (Context) objConsume;
            ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
            ComposerKt.sourceInformationMarkerStart($composer2, -380846831, "CC(remember):HoldToDictate.kt#9igjgp");
            Object value$iv2 = $composer2.rememberedValue();
            if (value$iv2 == Composer.INSTANCE.getEmpty()) {
                value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HoldToDictateKt.HoldToDictate$lambda$5$lambda$4(recordAudioPermissionGranted$delegate, ((Boolean) obj).booleanValue());
                    }
                };
                $composer2.updateRememberedValue(value$iv2);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ManagedActivityResultLauncher recordAudioPermissionLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) value$iv2, $composer2, 48);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -380842006, "CC(remember):HoldToDictate.kt#9igjgp");
            boolean invalid$iv = $composer2.changedInstance(context) | $composer2.changedInstance(recordAudioPermissionLauncher);
            HoldToDictateKt$HoldToDictate$1$1 value$iv3 = $composer2.rememberedValue();
            if (invalid$iv || value$iv3 == Composer.INSTANCE.getEmpty()) {
                value$iv3 = new HoldToDictateKt$HoldToDictate$1$1(context, recordAudioPermissionLauncher, recordAudioPermissionGranted$delegate, null);
                $composer2.updateRememberedValue(value$iv3);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) value$iv3, $composer2, 6);
            if (HoldToDictate$lambda$2(recordAudioPermissionGranted$delegate)) {
                $composer2.startReplaceGroup(1079260395);
                ComposerKt.sourceInformation($composer2, "125@4534L37,126@4594L36,95@3570L1297");
                if (enabled) {
                    $composer2.startReplaceGroup(1079330114);
                    ComposerKt.sourceInformation($composer2, "100@3695L714");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer2, -380823546, "CC(remember):HoldToDictate.kt#9igjgp");
                    boolean invalid$iv2 = (($dirty3 & 896) == 256) | $composer2.changedInstance(viewModel) | (($dirty3 & 7168) == 2048);
                    Object it$iv2 = $composer2.rememberedValue();
                    if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv4 = (PointerInputEventHandler) new PointerInputEventHandler() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateKt$HoldToDictate$2$1

                            /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateKt$HoldToDictate$2$1$1 */
                            /* JADX INFO: compiled from: HoldToDictate.kt */
                            @Metadata(m921d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m922d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                            @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateKt$HoldToDictate$2$1$1", m932f = "HoldToDictate.kt", m933i = {0}, m934l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m935m = "invokeSuspend", m936n = {"$this$detectTapGestures"}, m938s = {"L$0"})
                            static final class C27471 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Function1<Integer, Unit> $onAmplitudeChanged;
                                final /* synthetic */ Function1<String, Unit> $onDone;
                                final /* synthetic */ HoldToDictateViewModel $viewModel;
                                private /* synthetic */ Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                C27471(HoldToDictateViewModel holdToDictateViewModel, Function1<? super String, Unit> function1, Function1<? super Integer, Unit> function12, Continuation<? super C27471> continuation) {
                                    super(3, continuation);
                                    this.$viewModel = holdToDictateViewModel;
                                    this.$onDone = function1;
                                    this.$onAmplitudeChanged = function12;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                                    return m11039invoked4ec7I(pressGestureScope, offset.m6680unboximpl(), continuation);
                                }
                                public final Object m11039invoked4ec7I(PressGestureScope pressGestureScope, long j, Continuation<? super Unit> continuation) {
                                    C27471 c27471 = new C27471(this.$viewModel, this.$onDone, this.$onAmplitudeChanged, continuation);
                                    c27471.L$0 = pressGestureScope;
                                    return c27471.invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object $result) {
                                    PressGestureScope $this$detectTapGestures = (PressGestureScope) this.L$0;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    try {
                                        switch (this.label) {
                                            case 0:
                                                ResultKt.throwOnFailure($result);
                                                this.$viewModel.startSpeechRecognition(this.$onDone, this.$onAmplitudeChanged);
                                                this.L$0 = SpillingKt.nullOutSpilledVariable($this$detectTapGestures);
                                                this.label = 1;
                                                if ($this$detectTapGestures.awaitRelease(this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                break;
                                            case 1:
                                                ResultKt.throwOnFailure($result);
                                                break;
                                            default:
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        this.$viewModel.stopSpeechRecognition();
                                        return Unit.INSTANCE;
                                    } catch (CancellationException e) {
                                        this.$viewModel.cancelSpeechRecognition();
                                        return Unit.INSTANCE;
                                    }
                                }
                            }

                            @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
                            public final Object invoke(PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
                                Object objDetectTapGestures = TapGestureDetectorKt.detectTapGestures($this$pointerInput, (13 & 1) != 0 ? null : null, (13 & 2) != 0 ? null : null, (13 & 4) != 0 ? TapGestureDetectorKt.NoPressGesture : new C27471(viewModel, onDone, onAmplitudeChanged, null), (13 & 8) != 0 ? null : null, continuation);
                                return objDetectTapGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures : Unit.INSTANCE;
                            }
                        };
                        $composer2.updateRememberedValue(value$iv4);
                        it$iv2 = value$iv4;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    companionPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, unit2, (PointerInputEventHandler) it$iv2);
                    $composer2.endReplaceGroup();
                } else {
                    $composer2.startReplaceGroup(1080079136);
                    $composer2.endReplaceGroup();
                    companionPointerInput = Modifier.INSTANCE;
                }
                Modifier modifierClip = ClipKt.clip(modifier2.then(companionPointerInput), RoundedCornerShapeKt.getCircleShape());
                ComposerKt.sourceInformationMarkerStart($composer2, -380797375, "CC(remember):HoldToDictate.kt#9igjgp");
                boolean invalid$iv3 = (57344 & $dirty3) == 16384;
                Object it$iv3 = $composer2.rememberedValue();
                if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv5 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HoldToDictateKt.HoldToDictate$lambda$9$lambda$8(enabled, (GraphicsLayerScope) obj);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv5);
                    it$iv3 = value$iv5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                Modifier modifier$iv = SizeKt.m2022height3ABfNKs(BackgroundKt.m1359backgroundbw27NRU$default(GraphicsLayerModifierKt.graphicsLayer(modifierClip, (Function1) it$iv3), ColorUtilsKt.getTaskBgGradientColors(task, $composer2, $dirty3 & 14).get(1).m6925unboximpl(), null, 2, null), C1654Dp.m9788constructorimpl(48));
                Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
                int $changed$iv$iv = (48 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
                modifier$iv$iv = modifier2;
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
                $dirty = $dirty3;
                ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer2.startReusableNode();
                if ($composer2.getInserting()) {
                    function0 = constructor;
                    $composer2.createNode(function0);
                } else {
                    function0 = constructor;
                    $composer2.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer2);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = ($changed$iv$iv$iv >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i4 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -2079344039, "C131@4732L91,130@4718L143:HoldToDictate.kt#yuot9y");
                TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(HoldToDictate$lambda$0(uiState$delegate).getRecognizing() ? C2421R.string.listening : C2421R.string.hold_down_to_talk, $composer2, 0), null, Color.INSTANCE.m6952getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer2, 384, 0, 262138);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
            } else {
                modifier$iv$iv = modifier2;
                $dirty = $dirty3;
                $composer2.startReplaceGroup(1075683398);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier$iv$iv;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HoldToDictateKt.HoldToDictate$lambda$11(task, viewModel, onDone, onAmplitudeChanged, enabled, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final HoldToDictateUiState HoldToDictate$lambda$0(State<HoldToDictateUiState> state) {
        Object thisObj$iv = state.getValue();
        return (HoldToDictateUiState) thisObj$iv;
    }

    private static final boolean HoldToDictate$lambda$2(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HoldToDictate$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HoldToDictate$lambda$5$lambda$4(MutableState $recordAudioPermissionGranted$delegate, boolean permissionGranted) {
        if (permissionGranted) {
            HoldToDictate$lambda$3($recordAudioPermissionGranted$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HoldToDictate$lambda$9$lambda$8(boolean $enabled, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha($enabled ? 1.0f : 0.5f);
        return Unit.INSTANCE;
    }
}
