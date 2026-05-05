package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
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
import com.google.ai.edge.gallery.p006ui.theme.ThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: TextInputHistorySheet.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001a_\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u000b\u001a_\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u000b¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, m922d2 = {"TextInputHistorySheet", "", "history", "", "", "onHistoryItemClicked", "Lkotlin/Function1;", "onHistoryItemDeleted", "onHistoryItemsDeleteAll", "Lkotlin/Function0;", "onDismissed", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SheetContent", "app_debug", "showConfirmDeleteDialog", ""}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class TextInputHistorySheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetContent$lambda$30(List list, Function1 function1, Function1 function12, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        SheetContent(list, function1, function12, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputHistorySheet$lambda$7(List list, Function1 function1, Function1 function12, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        TextInputHistorySheet(list, function1, function12, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TextInputHistorySheet(final List<String> history, final Function1<? super String, Unit> onHistoryItemClicked, final Function1<? super String, Unit> onHistoryItemDeleted, final Function0<Unit> onHistoryItemsDeleteAll, final Function0<Unit> onDismissed, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(history, "history");
        Intrinsics.checkNotNullParameter(onHistoryItemClicked, "onHistoryItemClicked");
        Intrinsics.checkNotNullParameter(onHistoryItemDeleted, "onHistoryItemDeleted");
        Intrinsics.checkNotNullParameter(onHistoryItemsDeleteAll, "onHistoryItemsDeleteAll");
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        Composer $composer3 = $composer.startRestartGroup(-945672704);
        ComposerKt.sourceInformation($composer3, "C(TextInputHistorySheet)P(!1,2,3,4)72@2995L31,73@3041L24,79@3201L576,75@3069L708:TextInputHistorySheet.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(history) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onHistoryItemClicked) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onHistoryItemDeleted) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onHistoryItemsDeleteAll) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(onDismissed) ? 16384 : 8192;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-945672704, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheet (TextInputHistorySheet.kt:71)");
            }
            final SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, $composer3, 0, 3);
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
            int i = (($dirty2 >> 12) & 14) | 48;
            $composer2 = $composer3;
            ModalBottomSheetKt.m4185ModalBottomSheetYbuCTN8(onDismissed, SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), sheetState, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1889904674, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TextInputHistorySheetKt.TextInputHistorySheet$lambda$6(history, scope, sheetState, onHistoryItemClicked, onDismissed, onHistoryItemDeleted, onHistoryItemsDeleteAll, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, i, 3072, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextInputHistorySheetKt.TextInputHistorySheet$lambda$7(history, onHistoryItemClicked, onHistoryItemDeleted, onHistoryItemsDeleteAll, onDismissed, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputHistorySheet$lambda$6(List $history, final CoroutineScope $scope, final SheetState $sheetState, final Function1 $onHistoryItemClicked, final Function0 $onDismissed, Function1 $onHistoryItemDeleted, final Function0 $onHistoryItemsDeleteAll, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C82@3275L160,91@3520L130,98@3672L94,80@3207L566:TextInputHistorySheet.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1889904674, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheet.<anonymous> (TextInputHistorySheet.kt:80)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 572777022, "CC(remember):TextInputHistorySheet.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($scope) | $composer.changed($sheetState) | $composer.changed($onHistoryItemClicked) | $composer.changed($onDismissed);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextInputHistorySheetKt.TextInputHistorySheet$lambda$6$lambda$1$lambda$0($scope, $sheetState, $onHistoryItemClicked, $onDismissed, (String) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            Function1 function1 = (Function1) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 572784832, "CC(remember):TextInputHistorySheet.kt#9igjgp");
            boolean invalid$iv2 = $composer.changedInstance($scope) | $composer.changed($sheetState) | $composer.changed($onDismissed) | $composer.changed($onHistoryItemsDeleteAll);
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TextInputHistorySheetKt.TextInputHistorySheet$lambda$6$lambda$3$lambda$2($scope, $sheetState, $onDismissed, $onHistoryItemsDeleteAll);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            Function0 function0 = (Function0) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 572789660, "CC(remember):TextInputHistorySheet.kt#9igjgp");
            boolean invalid$iv3 = $composer.changedInstance($scope) | $composer.changed($sheetState) | $composer.changed($onDismissed);
            Object it$iv3 = $composer.rememberedValue();
            if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TextInputHistorySheetKt.TextInputHistorySheet$lambda$6$lambda$5$lambda$4($scope, $sheetState, $onDismissed);
                    }
                };
                $composer.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SheetContent($history, function1, $onHistoryItemDeleted, function0, (Function0) it$iv3, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputHistorySheet$lambda$6$lambda$1$lambda$0(CoroutineScope $scope, SheetState $sheetState, Function1 $onHistoryItemClicked, Function0 $onDismissed, String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new TextInputHistorySheetKt$TextInputHistorySheet$1$1$1$1($sheetState, $onHistoryItemClicked, item, $onDismissed, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputHistorySheet$lambda$6$lambda$3$lambda$2(CoroutineScope $scope, SheetState $sheetState, Function0 $onDismissed, Function0 $onHistoryItemsDeleteAll) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new TextInputHistorySheetKt$TextInputHistorySheet$1$2$1$1($sheetState, $onDismissed, $onHistoryItemsDeleteAll, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputHistorySheet$lambda$6$lambda$5$lambda$4(CoroutineScope $scope, SheetState $sheetState, Function0 $onDismissed) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new TextInputHistorySheetKt$TextInputHistorySheet$1$3$1$1($sheetState, $onDismissed, null), 3, null);
        return Unit.INSTANCE;
    }

    private static final void SheetContent(final List<String> list, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final Function0<Unit> function0, final Function0<Unit> function02, Composer $composer, final int $changed) {
        int $dirty;
        Function0<ComposeUiNode> function03;
        Function0<ComposeUiNode> function04;
        Composer $composer$iv$iv$iv;
        Composer $composer2 = $composer.startRestartGroup(-251661618);
        ComposerKt.sourceInformation($composer2, "C(SheetContent)P(!1,2,3,4)116@4012L24,117@4070L34,119@4108L1796:TextInputHistorySheet.kt#ouynps");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changedInstance(list) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer2.changedInstance(function1) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer2.changedInstance(function12) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer2.changedInstance(function0) ? 2048 : 1024;
        }
        int $dirty3 = $dirty2;
        if ($composer2.shouldExecute(($dirty3 & 1171) != 1170, $dirty3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-251661618, $dirty3, -1, "com.google.ai.edge.gallery.ui.common.chat.SheetContent (TextInputHistorySheet.kt:115)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object it$iv$iv = $composer2.rememberedValue();
            if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
                $composer2.updateRememberedValue(value$iv$iv);
                it$iv$iv = value$iv$iv;
            }
            final CoroutineScope scope = (CoroutineScope) it$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1328637040, "CC(remember):TextInputHistorySheet.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableState showConfirmDeleteDialog$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function03 = constructor;
                $composer2.createNode(function03);
            } else {
                function03 = constructor;
                $composer2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer2);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int i2 = ((0 >> 6) & 112) | 6;
            ColumnScope $this$SheetContent_u24lambda_u2421 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -1879306088, "C120@4121L536,137@4705L1195,137@4662L1238:TextInputHistorySheet.kt#ouynps");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getCenterEnd();
            ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier modifier$iv2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv2 = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function04 = constructor2;
                $composer2.createNode(function04);
            } else {
                function04 = constructor2;
                $composer2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer2);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i4 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 473159379, "C123@4239L10,121@4173L192,129@4452L34,127@4372L279:TextInputHistorySheet.kt#ouynps");
            TextKt.m4781TextNvy7gAk("Text input history", PaddingKt.m1988padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1654Dp.m9788constructorimpl(8)), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m9620boximpl(TextAlign.INSTANCE.m9627getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getTitleLarge(), $composer2, 54, 0, 130044);
            Modifier modifierM1992paddingqDBjuR0$default = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(12), 0.0f, 11, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -1785843628, "CC(remember):TextInputHistorySheet.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TextInputHistorySheetKt.SheetContent$lambda$21$lambda$13$lambda$12$lambda$11(showConfirmDeleteDialog$delegate);
                    }
                };
                $composer2.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            IconButtonKt.IconButton((Function0) it$iv2, modifierM1992paddingqDBjuR0$default, false, null, null, null, ComposableSingletons$TextInputHistorySheetKt.INSTANCE.getLambda$1787619060$app_debug(), $composer2, 1572918, 60);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierWeight$default = ColumnScope.weight$default($this$SheetContent_u24lambda_u2421, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 77942659, "CC(remember):TextInputHistorySheet.kt#9igjgp");
            $dirty = $dirty3;
            boolean invalid$iv = $composer2.changedInstance(list) | (($dirty3 & 112) == 32) | $composer2.changedInstance(scope) | (($dirty & 896) == 256);
            Object it$iv3 = $composer2.rememberedValue();
            if (invalid$iv || it$iv3 == Composer.INSTANCE.getEmpty()) {
                $composer$iv$iv$iv = $composer2;
                Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextInputHistorySheetKt.SheetContent$lambda$21$lambda$20$lambda$19(list, function1, scope, function12, (LazyListScope) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            } else {
                $composer$iv$iv$iv = $composer2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, null, null, null, false, null, (Function1) it$iv3, $composer2, 0, 510);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer$iv$iv$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (SheetContent$lambda$9(showConfirmDeleteDialog$delegate)) {
                $composer2.startReplaceGroup(1763795014);
                ComposerKt.sourceInformation($composer2, "177@5981L35,180@6182L207,190@6413L135,176@5943L612");
                ComposerKt.sourceInformationMarkerStart($composer2, -1328575887, "CC(remember):TextInputHistorySheet.kt#9igjgp");
                Object it$iv4 = $composer2.rememberedValue();
                if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv4 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TextInputHistorySheetKt.SheetContent$lambda$23$lambda$22(showConfirmDeleteDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv4);
                    it$iv4 = value$iv4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0((Function0) it$iv4, ComposableLambdaKt.rememberComposableLambda(1480995611, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TextInputHistorySheetKt.SheetContent$lambda$26(function0, showConfirmDeleteDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(2129588381, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TextInputHistorySheetKt.SheetContent$lambda$29(showConfirmDeleteDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, ComposableSingletons$TextInputHistorySheetKt.INSTANCE.m10963getLambda$1516786145$app_debug(), ComposableSingletons$TextInputHistorySheetKt.INSTANCE.getLambda$954993888$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772598, 0, 16276);
            } else {
                $composer2.startReplaceGroup(1757885236);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $dirty = $dirty3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextInputHistorySheetKt.SheetContent$lambda$30(list, function1, function12, function0, function02, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SheetContent$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SheetContent$lambda$9(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetContent$lambda$21$lambda$13$lambda$12$lambda$11(MutableState $showConfirmDeleteDialog$delegate) {
        SheetContent$lambda$10($showConfirmDeleteDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetContent$lambda$21$lambda$20$lambda$19(final List $history, final Function1 $onHistoryItemClicked, final CoroutineScope $scope, final Function1 $onHistoryItemDeleted, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 key$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextInputHistorySheetKt.SheetContent$lambda$21$lambda$20$lambda$19$lambda$14((String) obj);
            }
        };
        final Function1 contentType$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$SheetContent$lambda$21$lambda$20$lambda$19$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((String) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(String str) {
                return null;
            }
        };
        LazyColumn.items($history.size(), new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$SheetContent$lambda$21$lambda$20$lambda$19$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return key$iv.invoke($history.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$SheetContent$lambda$21$lambda$20$lambda$19$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return contentType$iv.invoke($history.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$SheetContent$lambda$21$lambda$20$lambda$19$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Function0<ComposeUiNode> function0;
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
                int $changed2 = $dirty & 14;
                final String item = (String) $history.get(it);
                $composer.startReplaceGroup(-655650115);
                ComposerKt.sourceInformation($composer, "C*144@4968L12,145@5026L30,139@4760L1126:TextInputHistorySheet.kt#ouynps");
                Modifier modifierM1359backgroundbw27NRU$default = BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m1989paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1654Dp.m9788constructorimpl(8), C1654Dp.m9788constructorimpl(2)), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(24))), ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11228getAgentBubbleBgColor0d7_KjU(), null, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer, 1918520062, "CC(remember):TextInputHistorySheet.kt#9igjgp");
                boolean invalid$iv = $composer.changed($onHistoryItemClicked) | (((($changed2 & 112) ^ 48) > 32 && $composer.changed(item)) || ($changed2 & 48) == 32);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    final Function1 function1 = $onHistoryItemClicked;
                    Object value$iv = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$SheetContent$1$2$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function1.invoke(item);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier modifier$iv = ClickableKt.m1401clickableoSLSa3U(modifierM1359backgroundbw27NRU$default, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv);
                Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
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
                int i2 = ((432 >> 6) & 112) | 6;
                RowScope $this$SheetContent_u24lambda_u2421_u24lambda_u2420_u24lambda_u2419_u24lambda_u2418_u24lambda_u2417 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 1867397403, "C151@5258L10,149@5200L257,158@5555L130,156@5468L408:TextInputHistorySheet.kt#ouynps");
                boolean z = true;
                TextKt.m4781TextNvy7gAk(item, RowScope.weight$default($this$SheetContent_u24lambda_u2421_u24lambda_u2420_u24lambda_u2419_u24lambda_u2418_u24lambda_u2417, PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(16), 1, null), C1654Dp.m9788constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9685getEllipsisgIe3tQ8(), false, 3, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, ($changed2 >> 3) & 14, 24960, 110588);
                Modifier modifierM1992paddingqDBjuR0$default = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 11, null);
                ComposerKt.sourceInformationMarkerStart($composer, -1879413210, "CC(remember):TextInputHistorySheet.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($scope) | $composer.changed($onHistoryItemDeleted);
                if (((($changed2 & 112) ^ 48) <= 32 || !$composer.changed(item)) && ($changed2 & 48) != 32) {
                    z = false;
                }
                boolean invalid$iv2 = zChangedInstance | z;
                Object it$iv2 = $composer.rememberedValue();
                if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                    final CoroutineScope coroutineScope = $scope;
                    final Function1 function12 = $onHistoryItemDeleted;
                    Object value$iv2 = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$SheetContent$1$2$1$2$2$1$1

                        /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$SheetContent$1$2$1$2$2$1$1$1 */
                        /* JADX INFO: compiled from: TextInputHistorySheet.kt */
                        @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                        @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$SheetContent$1$2$1$2$2$1$1$1", m932f = "TextInputHistorySheet.kt", m933i = {}, m934l = {161}, m935m = "invokeSuspend", m936n = {}, m938s = {})
                        static final class C27331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ String $item;
                            final /* synthetic */ Function1<String, Unit> $onHistoryItemDeleted;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C27331(Function1<? super String, Unit> function1, String str, Continuation<? super C27331> continuation) {
                                super(2, continuation);
                                this.$onHistoryItemDeleted = function1;
                                this.$item = str;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C27331(this.$onHistoryItemDeleted, this.$item, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C27331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object $result) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                switch (this.label) {
                                    case 0:
                                        ResultKt.throwOnFailure($result);
                                        this.label = 1;
                                        if (DelayKt.delay(400L, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        break;
                                    case 1:
                                        ResultKt.throwOnFailure($result);
                                        break;
                                    default:
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                this.$onHistoryItemDeleted.invoke(this.$item);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C27331(function12, item, null), 3, null);
                        }
                    };
                    $composer.updateRememberedValue(value$iv2);
                    it$iv2 = value$iv2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) it$iv2, modifierM1992paddingqDBjuR0$default, false, null, null, null, ComposableSingletons$TextInputHistorySheetKt.INSTANCE.getLambda$2093159394$app_debug(), $composer, 1572912, 60);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object SheetContent$lambda$21$lambda$20$lambda$19$lambda$14(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetContent$lambda$23$lambda$22(MutableState $showConfirmDeleteDialog$delegate) {
        SheetContent$lambda$10($showConfirmDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetContent$lambda$26(final Function0 $onHistoryItemsDeleteAll, final MutableState $showConfirmDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C182@6220L95,181@6192L189:TextInputHistorySheet.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1480995611, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.SheetContent.<anonymous> (TextInputHistorySheet.kt:181)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1602608506, "CC(remember):TextInputHistorySheet.kt#9igjgp");
            boolean invalid$iv = $composer.changed($onHistoryItemsDeleteAll);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TextInputHistorySheetKt.SheetContent$lambda$26$lambda$25$lambda$24($onHistoryItemsDeleteAll, $showConfirmDeleteDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$TextInputHistorySheetKt.INSTANCE.m10962getLambda$1243409653$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetContent$lambda$26$lambda$25$lambda$24(Function0 $onHistoryItemsDeleteAll, MutableState $showConfirmDeleteDialog$delegate) {
        SheetContent$lambda$10($showConfirmDeleteDialog$delegate, false);
        $onHistoryItemsDeleteAll.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetContent$lambda$29(final MutableState $showConfirmDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C191@6444L35,191@6423L117:TextInputHistorySheet.kt#ouynps");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2129588381, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.SheetContent.<anonymous> (TextInputHistorySheet.kt:191)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 2130002272, "CC(remember):TextInputHistorySheet.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TextInputHistorySheetKt.SheetContent$lambda$29$lambda$28$lambda$27($showConfirmDeleteDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$TextInputHistorySheetKt.INSTANCE.m10964getLambda$500037670$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetContent$lambda$29$lambda$28$lambda$27(MutableState $showConfirmDeleteDialog$delegate) {
        SheetContent$lambda$10($showConfirmDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }
}
