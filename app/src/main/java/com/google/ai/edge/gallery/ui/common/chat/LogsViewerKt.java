package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ErrorKt;
import androidx.compose.material.icons.filled.InfoKt;
import androidx.compose.material.icons.filled.WarningKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.MultiChoiceSegmentedButtonRowScope;
import androidx.compose.material3.SegmentedButtonColors;
import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.PointerIconCompat;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.common.UtilsKt;
import com.google.ai.edge.gallery.ui.theme.ThemeKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;



\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002²\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u008a\u008e\u0002"}, m922d2 = {"LogsViewer", "", "logs", "", "Lcom/google/ai/edge/gallery/ui/common/chat/LogMessage;", "onDismissRequest", "Lkotlin/Function0;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LogItem", "log", "(Lcom/google/ai/edge/gallery/ui/common/chat/LogMessage;Landroidx/compose/runtime/Composer;I)V", "app_debug", "filterText", "", "selectedLevels", "", "Lcom/google/ai/edge/gallery/ui/common/chat/LogMessageLevel;"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class LogsViewerKt {

    
    
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogMessageLevel.values().length];
            try {
                iArr[LogMessageLevel.Info.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[LogMessageLevel.Warning.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[LogMessageLevel.Error.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    
    public static final Unit LogItem$lambda$29(LogMessage logMessage, int i, Composer composer, int i2) {
        LogItem(logMessage, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    
    public static final Unit LogsViewer$lambda$26(List list, Function0 function0, int i, Composer composer, int i2) {
        LogsViewer(list, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LogsViewer(final List<LogMessage> logs, final Function0<Unit> onDismissRequest, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(logs, "logs");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer $composer3 = $composer.startRestartGroup(2146018570);
        ComposerKt.sourceInformation($composer3, "C(LogsViewer)73@3190L59,74@3264L24,76@3371L3550,76@3292L3629:LogsViewer.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(logs) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismissRequest) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2146018570, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.LogsViewer (LogsViewer.kt:72)");
            }
            final SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer3, 6, 2);
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object it$iv$iv = $composer3.rememberedValue();
            if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(value$iv$iv);
                it$iv$iv = value$iv$iv;
            }
            final CoroutineScope scope = (CoroutineScope) it$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            ModalBottomSheetKt.m4185ModalBottomSheetYbuCTN8(onDismissRequest, null, sheetState, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1188961816, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LogsViewerKt.LogsViewer$lambda$25(logs, scope, sheetState, onDismissRequest, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, ($dirty2 >> 3) & 14, 3072, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LogsViewerKt.LogsViewer$lambda$26(logs, onDismissRequest, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    
    public static final Unit LogsViewer$lambda$25(List $logs, final CoroutineScope $scope, final SheetState $sheetState, final Function0 $onDismissRequest, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C77@3377L3540:LogsViewer.kt#ouynps");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1188961816, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.LogsViewer.<anonymous> (LogsViewer.kt:77)");
            }
            Modifier modifier$iv$iv = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            int $changed$iv$iv = (6 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv$iv);
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
            int i2 = ((6 >> 6) & 112) | 6;
            ColumnScope $this$LogsViewer_u24lambda_u2425_u24lambda_u2424 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1379970111, "C79@3469L618,101@4135L31,122@4952L187,104@4236L19,114@4692L213,102@4173L975,130@5200L118,135@5459L569,133@5325L703,156@6092L220,166@6482L380,163@6320L542,180@6870L41:LogsViewer.kt#ouynps");
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 7, null);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            int $changed$iv$iv2 = (438 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, modifier$iv);
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
            int i4 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 531524219, "C85@3717L42,86@3793L10,84@3701L124,89@3866L119,88@3834L245:LogsViewer.kt#ouynps");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.logs_viewer_title, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 0, 0, 131070);
            ComposerKt.sourceInformationMarkerStart($composer, 1679718949, "CC(remember):LogsViewer.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($scope) | $composer.changed($sheetState) | $composer.changed($onDismissRequest);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LogsViewerKt.LogsViewer$lambda$25$lambda$24$lambda$2$lambda$1$lambda$0($scope, $sheetState, $onDismissRequest);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) it$iv, null, false, null, null, null, ComposableSingletons$LogsViewerKt.INSTANCE.m10941getLambda$1475180432$app_debug(), $composer, 1572864, 62);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -786750927, "CC(remember):LogsViewer.kt#9igjgp");
            Object it$iv2 = $composer.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableState filterText$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            String strLogsViewer$lambda$25$lambda$24$lambda$4 = LogsViewer$lambda$25$lambda$24$lambda$4(filterText$delegate);
            Modifier modifierClearFocusOnKeyboardDismiss = UtilsKt.clearFocusOnKeyboardDismiss(PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 7, null));
            RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
            TextFieldColors textFieldColorsM4752colors0hiis_0 = TextFieldDefaults.INSTANCE.m4752colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, Color.INSTANCE.m6950getTransparent0d7_KjU(), Color.INSTANCE.m6950getTransparent0d7_KjU(), Color.INSTANCE.m6950getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer, 0, 3504, 0, 0, 3072, 2147469311, 4095);
            ComposerKt.sourceInformationMarkerStart($composer, -786747707, "CC(remember):LogsViewer.kt#9igjgp");
            Object it$iv3 = $composer.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LogsViewerKt.LogsViewer$lambda$25$lambda$24$lambda$7$lambda$6(filterText$delegate, (String) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TextFieldKt.TextField(strLogsViewer$lambda$25$lambda$24$lambda$4, (Function1<? super String, Unit>) it$iv3, modifierClearFocusOnKeyboardDismiss, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$LogsViewerKt.INSTANCE.getLambda$2025475607$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$LogsViewerKt.INSTANCE.m10940getLambda$106189480$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(2057112729, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LogsViewerKt.LogsViewer$lambda$25$lambda$24$lambda$10(filterText$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) circleShape, textFieldColorsM4752colors0hiis_0, $composer, 918552624, 12582912, 0, 1965176);
            ComposerKt.sourceInformationMarkerStart($composer, -786716760, "CC(remember):LogsViewer.kt#9igjgp");
            Object it$iv4 = $composer.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SetsKt.setOf((Object[]) new LogMessageLevel[]{LogMessageLevel.Info, LogMessageLevel.Warning, LogMessageLevel.Error}), null, 2, null);
                $composer.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            }
            final MutableState selectedLevels$delegate = (MutableState) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer);
            SegmentedButtonKt.m4477MultiChoiceSegmentedButtonRowuFdPcIQ(PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 7, null), 0.0f, ComposableLambdaKt.rememberComposableLambda(-835775455, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LogsViewerKt.LogsViewer$lambda$25$lambda$24$lambda$18(selectedLevels$delegate, (MultiChoiceSegmentedButtonRowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 390, 2);
            Object objLogsViewer$lambda$25$lambda$24$lambda$4 = LogsViewer$lambda$25$lambda$24$lambda$4(filterText$delegate);
            Object objLogsViewer$lambda$25$lambda$24$lambda$12 = LogsViewer$lambda$25$lambda$24$lambda$12(selectedLevels$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -786688114, "CC(remember):LogsViewer.kt#9igjgp");
            boolean invalid$iv2 = $composer.changed(objLogsViewer$lambda$25$lambda$24$lambda$4) | $composer.changed($logs) | $composer.changed(objLogsViewer$lambda$25$lambda$24$lambda$12);
            Object it$iv5 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv5 == Composer.INSTANCE.getEmpty()) {
                List $this$filter$iv = $logs;
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv : $this$filter$iv) {
                    LogMessage log = (LogMessage) element$iv$iv;
                    MutableState filterText$delegate2 = filterText$delegate;
                    boolean invalid$iv3 = invalid$iv2;
                    if (StringsKt.contains((CharSequence) log.getMessage(), (CharSequence) StringsKt.trim((CharSequence) LogsViewer$lambda$25$lambda$24$lambda$4(filterText$delegate)).toString(), true) && LogsViewer$lambda$25$lambda$24$lambda$12(selectedLevels$delegate).contains(log.getLevel())) {
                        destination$iv$iv.add(element$iv$iv);
                    }
                    invalid$iv2 = invalid$iv3;
                    filterText$delegate = filterText$delegate2;
                }
                Object value$iv5 = (List) destination$iv$iv;
                $composer.updateRememberedValue(value$iv5);
                it$iv5 = value$iv5;
            }
            final List filteredLogs = (List) it$iv5;
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifierWeight$default = ColumnScope.weight$default($this$LogsViewer_u24lambda_u2425_u24lambda_u2424, PaddingKt.m1990paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 1.0f, false, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, -786675474, "CC(remember):LogsViewer.kt#9igjgp");
            boolean invalid$iv4 = $composer.changedInstance(filteredLogs);
            Object it$iv6 = $composer.rememberedValue();
            if (invalid$iv4 || it$iv6 == Composer.INSTANCE.getEmpty()) {
                Object value$iv6 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LogsViewerKt.LogsViewer$lambda$25$lambda$24$lambda$23$lambda$22(filteredLogs, (LazyListScope) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv6);
                it$iv6 = value$iv6;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, horizontalOrVerticalM1843spacedBy0680j_4, null, null, false, null, (Function1) it$iv6, $composer, 24576, 494);
            SpacerKt.Spacer(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), $composer, 6);
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

    
    public static final Unit LogsViewer$lambda$25$lambda$24$lambda$2$lambda$1$lambda$0(CoroutineScope $scope, SheetState $sheetState, Function0 $onDismissRequest) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new LogsViewerKt$LogsViewer$1$1$1$1$1$1($sheetState, $onDismissRequest, null), 3, null);
        return Unit.INSTANCE;
    }

    private static final String LogsViewer$lambda$25$lambda$24$lambda$4(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    
    public static final Unit LogsViewer$lambda$25$lambda$24$lambda$7$lambda$6(MutableState $filterText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $filterText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    
    public static final Unit LogsViewer$lambda$25$lambda$24$lambda$10(final MutableState $filterText$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:LogsViewer.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2057112729, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.LogsViewer.<anonymous>.<anonymous>.<anonymous> (LogsViewer.kt:115)");
            }
            if (LogsViewer$lambda$25$lambda$24$lambda$4($filterText$delegate).length() > 0) {
                $composer.startReplaceGroup(-1442991289);
                ComposerKt.sourceInformation($composer, "116@4768L19,116@4747L136");
                ComposerKt.sourceInformationMarkerStart($composer, 1200378860, "CC(remember):LogsViewer.kt#9igjgp");
                Object it$iv = $composer.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LogsViewerKt.LogsViewer$lambda$25$lambda$24$lambda$10$lambda$9$lambda$8($filterText$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) it$iv, null, false, null, null, null, ComposableSingletons$LogsViewerKt.INSTANCE.getLambda$314480914$app_debug(), $composer, 1572870, 62);
            } else {
                $composer.startReplaceGroup(-1447692439);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit LogsViewer$lambda$25$lambda$24$lambda$10$lambda$9$lambda$8(MutableState $filterText$delegate) {
        $filterText$delegate.setValue("");
        return Unit.INSTANCE;
    }

    private static final Set<LogMessageLevel> LogsViewer$lambda$25$lambda$24$lambda$12(MutableState<Set<LogMessageLevel>> mutableState) {
        MutableState<Set<LogMessageLevel>> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    
    public static final Unit LogsViewer$lambda$25$lambda$24$lambda$18(final MutableState $selectedLevels$delegate, MultiChoiceSegmentedButtonRowScope MultiChoiceSegmentedButtonRow, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(MultiChoiceSegmentedButtonRow, "$this$MultiChoiceSegmentedButtonRow");
        ComposerKt.sourceInformation(composer, "C*138@5597L46,139@5675L225,148@5968L42,137@5536L474:LogsViewer.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= composer.changed(MultiChoiceSegmentedButtonRow) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        boolean z = true;
        if (composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-835775455, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.LogsViewer.<anonymous>.<anonymous>.<anonymous> (LogsViewer.kt:136)");
            }
            Iterable $this$forEachIndexed$iv = LogMessageLevel.getEntries();
            int index$iv = 0;
            for (Object item$iv : $this$forEachIndexed$iv) {
                int index$iv2 = index$iv + 1;
                if (index$iv < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final LogMessageLevel level = (LogMessageLevel) item$iv;
                Shape shapeItemShape = SegmentedButtonDefaults.INSTANCE.itemShape(index$iv, LogMessageLevel.getEntries().size(), null, $composer, 3072, 4);
                boolean zContains = LogsViewer$lambda$25$lambda$24$lambda$12($selectedLevels$delegate).contains(level);
                ComposerKt.sourceInformationMarkerStart(composer, 780163612, "CC(remember):LogsViewer.kt#9igjgp");
                boolean invalid$iv = composer.changed(level.ordinal());
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LogsViewerKt.m495x3930b0(level, $selectedLevels$delegate, ((Boolean) obj).booleanValue());
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                SegmentedButtonKt.SegmentedButton(MultiChoiceSegmentedButtonRow, zContains, (Function1<? super Boolean, Unit>) it$iv, shapeItemShape, (Modifier) null, false, (SegmentedButtonColors) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(2066136541, z, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LogsViewerKt.LogsViewer$lambda$25$lambda$24$lambda$18$lambda$17$lambda$16(level, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), $composer, $dirty2 & 14, 48, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
                composer = $composer;
                z = z;
                $dirty2 = $dirty2;
                index$iv = index$iv2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m495x3930b0(LogMessageLevel $level, MutableState $selectedLevels$delegate, boolean it) {
        Set setPlus;
        if (LogsViewer$lambda$25$lambda$24$lambda$12($selectedLevels$delegate).contains($level)) {
            setPlus = SetsKt.minus(LogsViewer$lambda$25$lambda$24$lambda$12($selectedLevels$delegate), $level);
        } else {
            setPlus = SetsKt.plus(LogsViewer$lambda$25$lambda$24$lambda$12($selectedLevels$delegate), $level);
        }
        $selectedLevels$delegate.setValue(setPlus);
        return Unit.INSTANCE;
    }

    
    public static final Unit LogsViewer$lambda$25$lambda$24$lambda$18$lambda$17$lambda$16(LogMessageLevel $level, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C149@5982L16:LogsViewer.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2066136541, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.LogsViewer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LogsViewer.kt:149)");
            }
            TextKt.m4781TextNvy7gAk($level.name(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit LogsViewer$lambda$25$lambda$24$lambda$23$lambda$22(final List $filteredLogs, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if ($filteredLogs.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$LogsViewerKt.INSTANCE.m10942getLambda$2000940542$app_debug(), 3, null);
        } else {
            final Function1 contentType$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$LogsViewer$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke((LogMessage) p1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(LogMessage logMessage) {
                    return null;
                }
            };
            LazyColumn.items($filteredLogs.size(), null, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$LogsViewer$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return contentType$iv.invoke($filteredLogs.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$LogsViewer$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$4
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                    ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                    int $dirty = $changed;
                    if (($changed & 6) == 0) {
                        $dirty |= $composer.changed($this$items) ? 4 : 2;
                    }
                    if (($changed & 48) == 0) {
                        $dirty |= $composer.changed(it) ? 32 : 16;
                    }
                    if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                        $composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    LogMessage log = (LogMessage) $filteredLogs.get(it);
                    $composer.startReplaceGroup(-596640627);
                    ComposerKt.sourceInformation($composer, "C*176@6824L18:LogsViewer.kt#ouynps");
                    LogsViewerKt.LogItem(log, $composer, (($dirty & 14) >> 3) & 14);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return Unit.INSTANCE;
    }

    
    public static final void LogItem(final LogMessage log, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0<ComposeUiNode> function0;
        ImageVector icon;
        long tint;
        Function0<ComposeUiNode> function02;
        Composer $composer3 = $composer.startRestartGroup(-1149500855);
        ComposerKt.sourceInformation($composer3, "C(LogItem)192@7080L1535:LogsViewer.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(log) ? 4 : 2;
        }
        if (!$composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1149500855, $dirty, -1, "com.google.ai.edge.gallery.ui.common.chat.LogItem (LogsViewer.kt:191)");
            }
            Modifier modifier$iv = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getTop();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            int $changed$iv$iv = (438 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor;
                $composer3.createNode(function0);
            } else {
                function0 = constructor;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i2 = ((438 >> 6) & 112) | 6;
            RowScope $this$LogItem_u24lambda_u2428 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -1280170034, "C210@7732L138,218@7922L689:LogsViewer.kt#ouynps");
            switch (WhenMappings.$EnumSwitchMapping$0[log.getLevel().ordinal()]) {
                case 1:
                    icon = InfoKt.getInfo(Icons.Filled.INSTANCE);
                    break;
                case 2:
                    icon = WarningKt.getWarning(Icons.Filled.INSTANCE);
                    break;
                case 3:
                    icon = ErrorKt.getError(Icons.Filled.INSTANCE);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            switch (WhenMappings.$EnumSwitchMapping$0[log.getLevel().ordinal()]) {
                case 1:
                    $composer3.startReplaceGroup(651449107);
                    ComposerKt.sourceInformation($composer3, "206@7539L11");
                    long outlineVariant = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOutlineVariant();
                    $composer3.endReplaceGroup();
                    tint = outlineVariant;
                    break;
                case 2:
                    $composer3.startReplaceGroup(651451573);
                    ComposerKt.sourceInformation($composer3, "207@7615L12");
                    long jM11243getWarningTextColor0d7_KjU = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer3, MaterialTheme.$stable).m11243getWarningTextColor0d7_KjU();
                    $composer3.endReplaceGroup();
                    tint = jM11243getWarningTextColor0d7_KjU;
                    break;
                case 3:
                    $composer3.startReplaceGroup(651454035);
                    ComposerKt.sourceInformation($composer3, "208@7692L12");
                    long jM11231getErrorTextColor0d7_KjU = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer3, MaterialTheme.$stable).m11231getErrorTextColor0d7_KjU();
                    $composer3.endReplaceGroup();
                    tint = jM11231getErrorTextColor0d7_KjU;
                    break;
                default:
                    $composer3.startReplaceGroup(651446882);
                    $composer3.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
            }
            IconKt.m4075Iconww6aTOc(icon, log.getLevel().name(), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(20)), tint, $composer3, 384, 0);
            Modifier modifier$iv2 = RowScope.weight$default($this$LogItem_u24lambda_u2428, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv2 = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function02 = constructor2;
                $composer3.createNode(function02);
            } else {
                function02 = constructor2;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer3);
            $composer2 = $composer3;
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -802529032, "C234@8526L10,232@8469L136:LogsViewer.kt#ouynps");
            if (!(log.getSource().length() > 0) || log.getLineNumber() == -1) {
                if (log.getSource().length() > 0) {
                    $composer3.startReplaceGroup(-802243244);
                    ComposerKt.sourceInformation($composer3, "228@8341L10,229@8396L11,226@8281L173");
                    String source = log.getSource();
                    TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelSmall();
                    long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant();
                    TextKt.m4781TextNvy7gAk(source, null, Color.m6913copywmQWz5c(onSurfaceVariant, (14 & 1) != 0 ? Color.m6917getAlphaimpl(onSurfaceVariant) : 0.7f, (14 & 2) != 0 ? Color.m6921getRedimpl(onSurfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(onSurfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(onSurfaceVariant) : 0.0f), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelSmall, $composer3, 0, 0, 131066);
                } else {
                    $composer3.startReplaceGroup(-810454989);
                }
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(-802489539);
                ComposerKt.sourceInformation($composer3, "222@8115L10,223@8170L11,220@8032L196");
                String str = log.getSource() + ":" + log.getLineNumber();
                TextStyle labelSmall2 = MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelSmall();
                long onSurfaceVariant2 = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant();
                TextKt.m4781TextNvy7gAk(str, null, Color.m6913copywmQWz5c(onSurfaceVariant2, (14 & 1) != 0 ? Color.m6917getAlphaimpl(onSurfaceVariant2) : 0.7f, (14 & 2) != 0 ? Color.m6921getRedimpl(onSurfaceVariant2) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(onSurfaceVariant2) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(onSurfaceVariant2) : 0.0f), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelSmall2, $composer3, 0, 0, 131066);
                $composer3.endReplaceGroup();
            }
            TextKt.m4781TextNvy7gAk(log.getMessage(), PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(4), 0.0f, 0.0f, 13, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium(), $composer3, 48, 0, 131068);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.LogsViewerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LogsViewerKt.LogItem$lambda$29(log, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
