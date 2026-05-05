package com.google.ai.edge.gallery.p006ui.common.chat;

import android.content.Context;
import android.media.AudioRecord;
import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.ArrowUpwardKt;
import androidx.compose.material.icons.rounded.MicKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonDefaults;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.semantics.LiveRegionMode;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
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
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.work.WorkRequest;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.common.UtilsKt;
import com.google.ai.edge.gallery.data.ConstsKt;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.p006ui.common.ColorUtilsKt;
import com.google.ai.edge.gallery.p006ui.theme.ThemeKt;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: AudioRecorderPanel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000`\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u001aU\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001aX\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0083@¢\u0006\u0002\u0010\u001f\u001a \u0010 \u001a\u00020\u000e2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\"\u001a\u00020#X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\u0001X\u008a\u0084\u0002"}, m922d2 = {"TAG", "", "CHANNEL_CONFIG", "", "AUDIO_FORMAT", "PANEL_ALPHA", "", "AudioRecorderPanel", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "onAmplitudeChanged", "Lkotlin/Function1;", "onSendAudioClip", "", "onClose", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/google/ai/edge/gallery/data/Task;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "startRecording", "context", "Landroid/content/Context;", "audioRecordState", "Landroidx/compose/runtime/MutableState;", "Landroid/media/AudioRecord;", "audioStream", "Ljava/io/ByteArrayOutputStream;", "elapsedMs", "Landroidx/compose/runtime/MutableLongState;", "onMaxDurationReached", "(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Ljava/io/ByteArrayOutputStream;Landroidx/compose/runtime/MutableLongState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopRecording", "app_debug", "isRecording", "", "elapsedSeconds"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class AudioRecorderPanelKt {
    private static final int AUDIO_FORMAT = 2;
    private static final int CHANNEL_CONFIG = 16;
    private static final float PANEL_ALPHA = 0.7f;
    private static final String TAG = "AGAudioRecorderPanel";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioRecorderPanel$lambda$22(Task task, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AudioRecorderPanel(task, function1, function12, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AudioRecorderPanel(final Task task, final Function1<? super Integer, Unit> onAmplitudeChanged, final Function1<? super byte[], Unit> onSendAudioClip, final Function0<Unit> onClose, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        int $dirty;
        Function0<ComposeUiNode> function0;
        CompositionLocalMap localMap$iv$iv;
        Composer $composer$iv;
        Composer $composer$iv$iv$iv;
        Modifier materialized$iv$iv;
        Function0<ComposeUiNode> function02;
        MutableState isRecording$delegate;
        Composer $composer$iv2;
        Composer $composer$iv3;
        Composer $composer$iv4;
        boolean z;
        Composer $composer$iv5;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(onAmplitudeChanged, "onAmplitudeChanged");
        Intrinsics.checkNotNullParameter(onSendAudioClip, "onSendAudioClip");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Composer $composer2 = $composer.startRestartGroup(-471654266);
        ComposerKt.sourceInformation($composer2, "C(AudioRecorderPanel)P(4,1,3,2)104@4394L7,105@4425L24,107@4472L34,108@4525L35,109@4586L47,110@4654L36,112@4716L90,117@4870L51,117@4847L74,119@4925L3388:AudioRecorderPanel.kt#ouynps");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changedInstance(task) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer2.changedInstance(onAmplitudeChanged) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer2.changedInstance(onSendAudioClip) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer2.changedInstance(onClose) ? 2048 : 1024;
        }
        int i2 = i & 16;
        if (i2 != 0) {
            $dirty2 |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer2.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        if ($composer2.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            Modifier.Companion modifier3 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-471654266, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanel (AudioRecorderPanel.kt:103)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
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
            ComposerKt.sourceInformationMarkerStart($composer2, 2006793640, "CC(remember):AudioRecorderPanel.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableState isRecording$delegate2 = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 2006795337, "CC(remember):AudioRecorderPanel.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotLongStateKt.mutableLongStateOf(0L);
                $composer2.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableLongState elapsedMs = (MutableLongState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 2006797301, "CC(remember):AudioRecorderPanel.kt#9igjgp");
            Object it$iv3 = $composer2.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(mutableStateMutableStateOf$default);
                it$iv3 = mutableStateMutableStateOf$default;
            }
            final MutableState audioRecordState = (MutableState) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 2006799466, "CC(remember):AudioRecorderPanel.kt#9igjgp");
            Object it$iv4 = $composer2.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new ByteArrayOutputStream();
                $composer2.updateRememberedValue(value$iv3);
                it$iv4 = value$iv3;
            }
            final ByteArrayOutputStream audioStream = (ByteArrayOutputStream) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 2006801504, "CC(remember):AudioRecorderPanel.kt#9igjgp");
            Object it$iv5 = $composer2.rememberedValue();
            if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AudioRecorderPanelKt.AudioRecorderPanel$lambda$7$lambda$6(elapsedMs);
                    }
                });
                $composer2.updateRememberedValue(value$iv4);
                it$iv5 = value$iv4;
            }
            State elapsedSeconds$delegate = (State) it$iv5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 2006806393, "CC(remember):AudioRecorderPanel.kt#9igjgp");
            Object value$iv5 = $composer2.rememberedValue();
            if (value$iv5 == Composer.INSTANCE.getEmpty()) {
                value$iv5 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AudioRecorderPanelKt.AudioRecorderPanel$lambda$11$lambda$10(audioRecordState, (DisposableEffectScope) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv5);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) value$iv5, $composer2, 54);
            Modifier modifier4 = modifier3;
            Modifier modifier$iv = PaddingKt.m1990paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), C1654Dp.m9788constructorimpl(8), 0.0f, 2, null);
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(4));
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv = (432 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(constructor);
            } else {
                $composer2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer2);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i4 = ((432 >> 6) & 112) | 6;
            RowScope $this$AudioRecorderPanel_u24lambda_u2421 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 1816901116, "C126@5164L195,135@5462L11,134@5403L123,125@5136L567,150@5841L11,146@5726L2583:AudioRecorderPanel.kt#ouynps");
            ComposerKt.sourceInformationMarkerStart($composer2, 1859722949, "CC(remember):AudioRecorderPanel.kt#9igjgp");
            boolean invalid$iv = $composer2.changedInstance(audioStream) | (($dirty2 & 7168) == 2048);
            Object it$iv6 = $composer2.rememberedValue();
            if (invalid$iv || it$iv6 == Composer.INSTANCE.getEmpty()) {
                Object value$iv6 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AudioRecorderPanelKt.AudioRecorderPanel$lambda$21$lambda$13$lambda$12(audioRecordState, audioStream, onClose, isRecording$delegate2);
                    }
                };
                $composer2.updateRememberedValue(value$iv6);
                it$iv6 = value$iv6;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            IconButtonDefaults iconButtonDefaults = IconButtonDefaults.INSTANCE;
            long surfaceContainer = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurfaceContainer();
            IconButtonKt.IconButton((Function0) it$iv6, null, false, iconButtonDefaults.m4047iconButtonColorsro_MJ88(Color.m6913copywmQWz5c(surfaceContainer, (14 & 1) != 0 ? Color.m6917getAlphaimpl(surfaceContainer) : PANEL_ALPHA, (14 & 2) != 0 ? Color.m6921getRedimpl(surfaceContainer) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(surfaceContainer) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(surfaceContainer) : 0.0f), 0L, 0L, 0L, $composer2, IconButtonDefaults.$stable << 12, 14), null, null, ComposableSingletons$AudioRecorderPanelKt.INSTANCE.getLambda$722342468$app_debug(), $composer2, 1572864, 54);
            Modifier modifierWeight$default = RowScope.weight$default($this$AudioRecorderPanel_u24lambda_u2421, ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.getCircleShape()), 1.0f, false, 2, null);
            long surfaceContainer2 = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurfaceContainer();
            Modifier modifier$iv2 = PaddingKt.m1992paddingqDBjuR0$default(BackgroundKt.m1359backgroundbw27NRU$default(modifierWeight$default, Color.m6913copywmQWz5c(surfaceContainer2, (14 & 1) != 0 ? Color.m6917getAlphaimpl(surfaceContainer2) : PANEL_ALPHA, (14 & 2) != 0 ? Color.m6921getRedimpl(surfaceContainer2) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(surfaceContainer2) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(surfaceContainer2) : 0.0f), null, 2, null), C1654Dp.m9788constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv2 = (432 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer2, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor2;
                $composer2.createNode(function0);
            } else {
                function0 = constructor2;
                $composer2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer2);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -675673606, "C180@6887L41,206@7952L29,206@7918L64,181@6948L932,207@7992L311,179@6837L1466:AudioRecorderPanel.kt#ouynps");
            if (AudioRecorderPanel$lambda$1(isRecording$delegate2)) {
                $composer2.startReplaceGroup(-675453042);
                ComposerKt.sourceInformation($composer2, "165@6436L356");
                localMap$iv$iv = localMap$iv$iv3;
                Arrangement.Horizontal horizontalArrangement$iv3 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(12));
                Alignment.Vertical verticalAlignment$iv3 = Alignment.INSTANCE.getCenterVertically();
                $composer$iv = $composer2;
                ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier modifier$iv3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv3, verticalAlignment$iv3, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                int $changed$iv$iv3 = (432 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap localMap$iv$iv4 = $composer2.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer2, modifier$iv3);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
                $composer$iv$iv$iv = $composer2;
                materialized$iv$iv = materialized$iv$iv3;
                ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer2.startReusableNode();
                if ($composer2.getInserting()) {
                    function02 = constructor3;
                    $composer2.createNode(function02);
                } else {
                    function02 = constructor3;
                    $composer2.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer2);
                isRecording$delegate = isRecording$delegate2;
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
                int i7 = ($changed$iv$iv$iv3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i8 = ((432 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -72169209, "C172@6688L12,169@6584L162,174@6757L25:AudioRecorderPanel.kt#ouynps");
                BoxKt.Box(BackgroundKt.m1358backgroundbw27NRU(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(8)), ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer2, MaterialTheme.$stable).m11236getRecordButtonBgColor0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), $composer2, 0);
                TextKt.m4781TextNvy7gAk(AudioRecorderPanel$lambda$8(elapsedSeconds$delegate) + " s", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer2, 0, 0, 262142);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(-675716511);
                ComposerKt.sourceInformation($composer2, "159@6258L10,160@6314L11,157@6176L177");
                TextKt.m4781TextNvy7gAk("Tap the record button to start", null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getLabelMedium(), $composer2, 6, 0, 131066);
                $composer2.endReplaceGroup();
                $composer$iv$iv$iv = $composer2;
                isRecording$delegate = isRecording$delegate2;
                localMap$iv$iv = localMap$iv$iv3;
                $composer$iv = $composer2;
                materialized$iv$iv = materialized$iv$iv3;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -160321721, "CC(remember):AudioRecorderPanel.kt#9igjgp");
            Object it$iv7 = $composer2.rememberedValue();
            if (it$iv7 == Composer.INSTANCE.getEmpty()) {
                Object value$iv7 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AudioRecorderPanelKt.AudioRecorderPanel$lambda$21$lambda$20$lambda$16$lambda$15((SemanticsPropertyReceiver) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv7);
                it$iv7 = value$iv7;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) it$iv7, 1, null);
            IconButtonColors iconButtonColorsM4047iconButtonColorsro_MJ88 = IconButtonDefaults.INSTANCE.m4047iconButtonColorsro_MJ88(ColorUtilsKt.getTaskIconColor(task, $composer2, $dirty2 & 14), 0L, 0L, 0L, $composer2, IconButtonDefaults.$stable << 12, 14);
            ComposerKt.sourceInformationMarkerStart($composer2, -160318878, "CC(remember):AudioRecorderPanel.kt#9igjgp");
            boolean invalid$iv2 = (($dirty2 & 896) == 256) | $composer2.changedInstance(coroutineScope) | $composer2.changedInstance(context) | $composer2.changedInstance(audioStream) | (($dirty2 & 112) == 32);
            Object value$iv8 = $composer2.rememberedValue();
            if (invalid$iv2 || value$iv8 == Composer.INSTANCE.getEmpty()) {
                $composer$iv2 = $composer2;
                $composer$iv3 = $composer$iv;
                $dirty = $dirty2;
                $composer$iv4 = $composer2;
                z = true;
                $composer$iv5 = $composer2;
                final MutableState mutableState = isRecording$delegate;
                value$iv8 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AudioRecorderPanelKt.AudioRecorderPanel$lambda$21$lambda$20$lambda$18$lambda$17(coroutineScope, context, audioRecordState, audioStream, elapsedMs, onAmplitudeChanged, onSendAudioClip, mutableState);
                    }
                };
                $composer2.updateRememberedValue(value$iv8);
            } else {
                $composer$iv2 = $composer2;
                $composer$iv4 = $composer2;
                $composer$iv3 = $composer$iv;
                $dirty = $dirty2;
                z = true;
                $composer$iv5 = $composer2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final MutableState isRecording$delegate3 = isRecording$delegate;
            IconButtonKt.IconButton((Function0) value$iv8, modifierSemantics$default, false, iconButtonColorsM4047iconButtonColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(1332612320, z, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AudioRecorderPanelKt.AudioRecorderPanel$lambda$21$lambda$20$lambda$19(isRecording$delegate3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 1572864, 52);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            $composer$iv$iv$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer$iv5);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            $dirty = $dirty2;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AudioRecorderPanelKt.AudioRecorderPanel$lambda$22(task, onAmplitudeChanged, onSendAudioClip, onClose, modifier5, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioRecorderPanel$lambda$1(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioRecorderPanel$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String AudioRecorderPanel$lambda$8(State<String> state) {
        Object thisObj$iv = state.getValue();
        return (String) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AudioRecorderPanel$lambda$7$lambda$6(MutableLongState $elapsedMs) {
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf($elapsedMs.getLongValue() / 1000.0f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult AudioRecorderPanel$lambda$11$lambda$10(final MutableState $audioRecordState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$AudioRecorderPanel$lambda$11$lambda$10$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                AudioRecord audioRecord = (AudioRecord) $audioRecordState.getValue();
                if (audioRecord != null) {
                    audioRecord.release();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioRecorderPanel$lambda$21$lambda$13$lambda$12(MutableState $audioRecordState, ByteArrayOutputStream $audioStream, Function0 $onClose, MutableState $isRecording$delegate) {
        if (AudioRecorderPanel$lambda$1($isRecording$delegate)) {
            stopRecording($audioRecordState, $audioStream);
            AudioRecorderPanel$lambda$2($isRecording$delegate, false);
        }
        $onClose.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioRecorderPanel$lambda$21$lambda$20$lambda$16$lambda$15(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.m8951setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m8924getAssertive0phEisY());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioRecorderPanel$lambda$21$lambda$20$lambda$18$lambda$17(CoroutineScope $coroutineScope, Context $context, MutableState $audioRecordState, ByteArrayOutputStream $audioStream, MutableLongState $elapsedMs, Function1 $onAmplitudeChanged, Function1 $onSendAudioClip, MutableState $isRecording$delegate) {
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new AudioRecorderPanelKt$AudioRecorderPanel$2$2$3$1$1($context, $audioRecordState, $audioStream, $elapsedMs, $onAmplitudeChanged, $onSendAudioClip, $isRecording$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioRecorderPanel$lambda$21$lambda$20$lambda$19(MutableState $isRecording$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C211@8128L126,208@8002L293:AudioRecorderPanel.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1332612320, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanel.<anonymous>.<anonymous>.<anonymous> (AudioRecorderPanel.kt:208)");
            }
            IconKt.m4075Iconww6aTOc(AudioRecorderPanel$lambda$1($isRecording$delegate) ? ArrowUpwardKt.getArrowUpward(Icons.Rounded.INSTANCE) : MicKt.getMic(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(AudioRecorderPanel$lambda$1($isRecording$delegate) ? C2421R.string.cd_send_audio_clip_icon : C2421R.string.cd_start_recording, $composer, 0), (Modifier) null, Color.INSTANCE.m6952getWhite0d7_KjU(), $composer, 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object startRecording(Context context, MutableState<AudioRecord> mutableState, ByteArrayOutputStream audioStream, MutableLongState elapsedMs, Function1<? super Integer, Unit> function1, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        Log.d(TAG, "Start recording...");
        int minBufferSize = AudioRecord.getMinBufferSize(ConstsKt.SAMPLE_RATE, 16, 2);
        AudioRecord value = mutableState.getValue();
        if (value != null) {
            value.release();
        }
        AudioRecord recorder = new AudioRecord(1, ConstsKt.SAMPLE_RATE, 16, 2, minBufferSize);
        mutableState.setValue(recorder);
        byte[] buffer = new byte[minBufferSize];
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C26852(recorder, elapsedMs, mutableState, buffer, function1, audioStream, function0, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$startRecording$2 */
    /* JADX INFO: compiled from: AudioRecorderPanel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$startRecording$2", m932f = "AudioRecorderPanel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C26852 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ MutableState<AudioRecord> $audioRecordState;
        final /* synthetic */ ByteArrayOutputStream $audioStream;
        final /* synthetic */ byte[] $buffer;
        final /* synthetic */ MutableLongState $elapsedMs;
        final /* synthetic */ Function1<Integer, Unit> $onAmplitudeChanged;
        final /* synthetic */ Function0<Unit> $onMaxDurationReached;
        final /* synthetic */ AudioRecord $recorder;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C26852(AudioRecord audioRecord, MutableLongState mutableLongState, MutableState<AudioRecord> mutableState, byte[] bArr, Function1<? super Integer, Unit> function1, ByteArrayOutputStream byteArrayOutputStream, Function0<Unit> function0, Continuation<? super C26852> continuation) {
            super(2, continuation);
            this.$recorder = audioRecord;
            this.$elapsedMs = mutableLongState;
            this.$audioRecordState = mutableState;
            this.$buffer = bArr;
            this.$onAmplitudeChanged = function1;
            this.$audioStream = byteArrayOutputStream;
            this.$onMaxDurationReached = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26852 c26852 = new C26852(this.$recorder, this.$elapsedMs, this.$audioRecordState, this.$buffer, this.$onAmplitudeChanged, this.$audioStream, this.$onMaxDurationReached, continuation);
            c26852.L$0 = obj;
            return c26852;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C26852) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$startRecording$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: AudioRecorderPanel.kt */
        @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$startRecording$2$1", m932f = "AudioRecorderPanel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ MutableState<AudioRecord> $audioRecordState;
            final /* synthetic */ ByteArrayOutputStream $audioStream;
            final /* synthetic */ byte[] $buffer;
            final /* synthetic */ MutableLongState $elapsedMs;
            final /* synthetic */ Function1<Integer, Unit> $onAmplitudeChanged;
            final /* synthetic */ Function0<Unit> $onMaxDurationReached;
            final /* synthetic */ AudioRecord $recorder;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(AudioRecord audioRecord, MutableLongState mutableLongState, MutableState<AudioRecord> mutableState, byte[] bArr, Function1<? super Integer, Unit> function1, ByteArrayOutputStream byteArrayOutputStream, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$recorder = audioRecord;
                this.$elapsedMs = mutableLongState;
                this.$audioRecordState = mutableState;
                this.$buffer = bArr;
                this.$onAmplitudeChanged = function1;
                this.$audioStream = byteArrayOutputStream;
                this.$onMaxDurationReached = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$recorder, this.$elapsedMs, this.$audioRecordState, this.$buffer, this.$onAmplitudeChanged, this.$audioStream, this.$onMaxDurationReached, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.$recorder.startRecording();
                        long startMs = System.currentTimeMillis();
                        this.$elapsedMs.setLongValue(0L);
                        while (true) {
                            AudioRecord value = this.$audioRecordState.getValue();
                            if (value != null && value.getRecordingState() == 3) {
                                int bytesRead = this.$recorder.read(this.$buffer, 0, this.$buffer.length);
                                if (bytesRead > 0) {
                                    int currentAmplitude = UtilsKt.calculatePeakAmplitude(this.$buffer, bytesRead);
                                    this.$onAmplitudeChanged.invoke(Boxing.boxInt(currentAmplitude));
                                    this.$audioStream.write(this.$buffer, 0, bytesRead);
                                }
                                this.$elapsedMs.setLongValue(System.currentTimeMillis() - startMs);
                                if (this.$elapsedMs.getLongValue() >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                                    this.$onMaxDurationReached.invoke();
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return BuildersKt__Builders_commonKt.launch$default($this$coroutineScope, Dispatchers.getIO(), null, new AnonymousClass1(this.$recorder, this.$elapsedMs, this.$audioRecordState, this.$buffer, this.$onAmplitudeChanged, this.$audioStream, this.$onMaxDurationReached, null), 2, null);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] stopRecording(MutableState<AudioRecord> mutableState, ByteArrayOutputStream audioStream) {
        Log.d(TAG, "Stopping recording...");
        AudioRecord recorder = mutableState.getValue();
        boolean z = false;
        if (recorder != null && recorder.getRecordingState() == 3) {
            z = true;
        }
        if (z) {
            recorder.stop();
        }
        if (recorder != null) {
            recorder.release();
        }
        mutableState.setValue(null);
        byte[] recordedBytes = audioStream.toByteArray();
        audioStream.reset();
        Log.d(TAG, "Stopped. Recorded " + recordedBytes.length + " bytes.");
        Intrinsics.checkNotNull(recordedBytes);
        return recordedBytes;
    }
}
