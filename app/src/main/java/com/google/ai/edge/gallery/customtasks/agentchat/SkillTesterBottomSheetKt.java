package com.google.ai.edge.gallery.customtasks.agentchat;

import android.graphics.Bitmap;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.ContentScale;
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
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.common.CallJsSkillResultWebview;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageWebView;
import com.google.ai.edge.gallery.ui.common.chat.MessageBodyWebviewKt;
import com.google.ai.edge.gallery.proto.Skill;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;



V", "app_debug", "inputData", "", "customData", "result", "error", "logs", "selectedTabIndex", "", "running", "", "resultImage", "Landroid/graphics/Bitmap;", "resultWebview", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class SkillTesterBottomSheetKt {
    
    public static final Unit SkillTesterBottomSheet$lambda$46(AgentTools agentTools, Skill skill, Function0 function0, int i, Composer composer, int i2) {
        SkillTesterBottomSheet(agentTools, skill, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SkillTesterBottomSheet(final AgentTools agentTools, final Skill skill, Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        Composer $composer2;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(agentTools, "agentTools");
        Intrinsics.checkNotNullParameter(skill, "skill");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(-1890306988);
        ComposerKt.sourceInformation($composer3, "C(SkillTesterBottomSheet)P(!1,2)66@2916L24,67@2960L59,69@3103L31,70@3155L31,71@3203L31,72@3250L31,73@3296L31,74@3354L33,75@3405L34,76@3461L42,77@3527L60,79@3663L5387,79@3591L5459:SkillTesterBottomSheet.kt#41d64j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(agentTools) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(skill) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1890306988, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheet (SkillTesterBottomSheet.kt:65)");
            }
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
            SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer3, 6, 2);
            ComposerKt.sourceInformationMarkerStart($composer3, 186161747, "CC(remember):SkillTesterBottomSheet.kt#9igjgp");
            Object it$iv = $composer3.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(mutableStateMutableStateOf$default);
                it$iv = mutableStateMutableStateOf$default;
            }
            final MutableState inputData$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 186163411, "CC(remember):SkillTesterBottomSheet.kt#9igjgp");
            Object it$iv2 = $composer3.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(mutableStateMutableStateOf$default2);
                it$iv2 = mutableStateMutableStateOf$default2;
            }
            final MutableState customData$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 186164947, "CC(remember):SkillTesterBottomSheet.kt#9igjgp");
            Object it$iv3 = $composer3.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(mutableStateMutableStateOf$default3);
                it$iv3 = mutableStateMutableStateOf$default3;
            }
            final MutableState result$delegate = (MutableState) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 186166451, "CC(remember):SkillTesterBottomSheet.kt#9igjgp");
            Object it$iv4 = $composer3.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(mutableStateMutableStateOf$default4);
                it$iv4 = mutableStateMutableStateOf$default4;
            }
            final MutableState error$delegate = (MutableState) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 186167923, "CC(remember):SkillTesterBottomSheet.kt#9igjgp");
            Object it$iv5 = $composer3.rememberedValue();
            if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(mutableStateMutableStateOf$default5);
                it$iv5 = mutableStateMutableStateOf$default5;
            }
            final MutableState logs$delegate = (MutableState) it$iv5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 186169781, "CC(remember):SkillTesterBottomSheet.kt#9igjgp");
            Object it$iv6 = $composer3.rememberedValue();
            if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer3.updateRememberedValue(value$iv);
                it$iv6 = value$iv;
            }
            final MutableIntState selectedTabIndex$delegate = (MutableIntState) it$iv6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 186171414, "CC(remember):SkillTesterBottomSheet.kt#9igjgp");
            Object it$iv7 = $composer3.rememberedValue();
            if (it$iv7 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(mutableStateMutableStateOf$default6);
                it$iv7 = mutableStateMutableStateOf$default6;
            }
            final MutableState running$delegate = (MutableState) it$iv7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 186173214, "CC(remember):SkillTesterBottomSheet.kt#9igjgp");
            Object it$iv8 = $composer3.rememberedValue();
            if (it$iv8 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(value$iv2);
                it$iv8 = value$iv2;
            }
            final MutableState resultImage$delegate = (MutableState) it$iv8;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 186175344, "CC(remember):SkillTesterBottomSheet.kt#9igjgp");
            Object it$iv9 = $composer3.rememberedValue();
            if (it$iv9 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(value$iv3);
                it$iv9 = value$iv3;
            }
            final MutableState resultWebview$delegate = (MutableState) it$iv9;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            function0 = onDismiss;
            ModalBottomSheetKt.m4185ModalBottomSheetYbuCTN8(onDismiss, null, sheetState, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(886167734, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SkillTesterBottomSheetKt.SkillTesterBottomSheet$lambda$45(skill, scope, agentTools, inputData$delegate, customData$delegate, selectedTabIndex$delegate, error$delegate, result$delegate, resultImage$delegate, resultWebview$delegate, logs$delegate, running$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ($dirty2 >> 6) & 14, 3072, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            function0 = onDismiss;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SkillTesterBottomSheetKt.SkillTesterBottomSheet$lambda$46(agentTools, skill, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    
    public static final String SkillTesterBottomSheet$lambda$1(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String SkillTesterBottomSheet$lambda$4(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String SkillTesterBottomSheet$lambda$7(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String SkillTesterBottomSheet$lambda$10(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String SkillTesterBottomSheet$lambda$13(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final int SkillTesterBottomSheet$lambda$16(MutableIntState $selectedTabIndex$delegate) {
        MutableIntState $this$getValue$iv = $selectedTabIndex$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private static final boolean SkillTesterBottomSheet$lambda$19(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    
    public static final void SkillTesterBottomSheet$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Bitmap SkillTesterBottomSheet$lambda$22(MutableState<Bitmap> mutableState) {
        MutableState<Bitmap> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final CallJsSkillResultWebview SkillTesterBottomSheet$lambda$25(MutableState<CallJsSkillResultWebview> mutableState) {
        MutableState<CallJsSkillResultWebview> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    
    public static final Unit SkillTesterBottomSheet$lambda$45(final Skill $skill, final CoroutineScope $scope, final AgentTools $agentTools, final MutableState $inputData$delegate, final MutableState $customData$delegate, final MutableIntState $selectedTabIndex$delegate, final MutableState $error$delegate, final MutableState $result$delegate, final MutableState $resultImage$delegate, final MutableState $resultWebview$delegate, MutableState $logs$delegate, final MutableState $running$delegate, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        long onSurface;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C80@3669L5377:SkillTesterBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(886167734, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheet.<anonymous> (SkillTesterBottomSheet.kt:80)");
            }
            Modifier modifier$iv = PaddingKt.m1988padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1654Dp.m9788constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
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
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int i2 = ((6 >> 6) & 112) | 6;
            ColumnScope $this$SkillTesterBottomSheet_u24lambda_u2445_u24lambda_u2444 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 607660955, "C84@3827L10,82@3764L145,91@4019L18,89@3949L204,99@4265L19,97@4194L208,106@4558L230,106@4471L317,122@4990L11,117@4817L2013,180@6897L1953,232@8953L87,179@6871L2169:SkillTesterBottomSheet.kt#41d64j");
            String name = $skill.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            TextKt.m4781TextNvy7gAk(name, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 7, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 48, 0, 131068);
            String strSkillTesterBottomSheet$lambda$1 = SkillTesterBottomSheet$lambda$1($inputData$delegate);
            Modifier modifierM1992paddingqDBjuR0$default = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 7, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1959267518, "CC(remember):SkillTesterBottomSheet.kt#9igjgp");
            Object value$iv = $composer.rememberedValue();
            if (value$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SkillTesterBottomSheetKt.SkillTesterBottomSheet$lambda$45$lambda$44$lambda$28$lambda$27($inputData$delegate, (String) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strSkillTesterBottomSheet$lambda$1, (Function1<? super String, Unit>) value$iv, modifierM1992paddingqDBjuR0$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SkillTesterBottomSheetKt.INSTANCE.m10468getLambda$1825637562$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 1573296, 0, 0, 8388536);
            String strSkillTesterBottomSheet$lambda$4 = SkillTesterBottomSheet$lambda$4($customData$delegate);
            Modifier modifierM1992paddingqDBjuR0$default2 = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 7, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1959275391, "CC(remember):SkillTesterBottomSheet.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SkillTesterBottomSheetKt.SkillTesterBottomSheet$lambda$45$lambda$44$lambda$30$lambda$29($customData$delegate, (String) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strSkillTesterBottomSheet$lambda$4, (Function1<? super String, Unit>) it$iv, modifierM1992paddingqDBjuR0$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SkillTesterBottomSheetKt.INSTANCE.getLambda$45234813$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 1573296, 0, 0, 8388536);
            final List tabs = CollectionsKt.listOf((Object[]) new String[]{"Result", "Logs"});
            TabRowKt.m4670PrimaryTabRowpAZo6Ak(SkillTesterBottomSheet$lambda$16($selectedTabIndex$delegate), null, Color.INSTANCE.m6950getTransparent0d7_KjU(), 0L, null, null, ComposableLambdaKt.rememberComposableLambda(-1315707806, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SkillTesterBottomSheetKt.SkillTesterBottomSheet$lambda$45$lambda$44$lambda$35(tabs, $selectedTabIndex$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 1573248, 58);
            Modifier modifier$iv2 = PaddingKt.m1988padding3ABfNKs(BorderKt.m1374borderxT4_qwU(PaddingKt.m1990paddingVpY3zN4$default($this$SkillTesterBottomSheet_u24lambda_u2445_u24lambda_u2444.weight(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, true), 0.0f, C1654Dp.m9788constructorimpl(8), 1, null), C1654Dp.m9788constructorimpl(1), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutlineVariant(), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(4))), C1654Dp.m9788constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv2 = (0 << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i4 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -995602132, "C125@5131L21,125@5089L1733:SkillTesterBottomSheet.kt#41d64j");
            Modifier modifier$iv3 = ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, $composer, 0, 1), false, null, false, 14, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv3 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv3 = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer, modifier$iv3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function03 = constructor3;
                $composer.createNode(function03);
            } else {
                function03 = constructor3;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1922742898, "C:SkillTesterBottomSheet.kt#41d64j");
            switch (SkillTesterBottomSheet$lambda$16($selectedTabIndex$delegate)) {
                case 0:
                    $composer.startReplaceGroup(1600546120);
                    ComposerKt.sourceInformation($composer, "");
                    String strSkillTesterBottomSheet$lambda$10 = SkillTesterBottomSheet$lambda$10($error$delegate);
                    if (strSkillTesterBottomSheet$lambda$10.length() == 0) {
                        strSkillTesterBottomSheet$lambda$10 = SkillTesterBottomSheet$lambda$7($result$delegate);
                    }
                    String text = strSkillTesterBottomSheet$lambda$10;
                    if (text.length() > 0) {
                        $composer.startReplaceGroup(-1922622278);
                        ComposerKt.sourceInformation($composer, "133@5421L10,131@5344L414");
                        TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall();
                        Modifier modifierM1992paddingqDBjuR0$default3 = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 7, null);
                        if (SkillTesterBottomSheet$lambda$10($error$delegate).length() > 0) {
                            $composer.startReplaceGroup(-1922386771);
                            ComposerKt.sourceInformation($composer, "137@5613L11");
                            onSurface = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError();
                            $composer.endReplaceGroup();
                        } else {
                            $composer.startReplaceGroup(-1922304311);
                            ComposerKt.sourceInformation($composer, "139@5696L11");
                            onSurface = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface();
                            $composer.endReplaceGroup();
                        }
                        TextKt.m4781TextNvy7gAk(text, modifierM1992paddingqDBjuR0$default3, onSurface, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, $composer, 48, 0, 131064);
                    } else {
                        $composer.startReplaceGroup(-1927920550);
                    }
                    $composer.endReplaceGroup();
                    Bitmap bitmap = SkillTesterBottomSheet$lambda$22($resultImage$delegate);
                    if (bitmap == null) {
                        $composer.startReplaceGroup(-1922154799);
                        $composer.endReplaceGroup();
                    } else {
                        $composer.startReplaceGroup(-1922154798);
                        ComposerKt.sourceInformation($composer, "*145@5835L216");
                        ImageKt.m1426Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), null, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, $composer, 25008, 232);
                        Unit unit = Unit.INSTANCE;
                        $composer.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                    }
                    CallJsSkillResultWebview webview = SkillTesterBottomSheet$lambda$25($resultWebview$delegate);
                    if (webview == null) {
                        $composer.startReplaceGroup(-1921850844);
                        $composer.endReplaceGroup();
                    } else {
                        $composer.startReplaceGroup(-1921850843);
                        ComposerKt.sourceInformation($composer, "");
                        String url = webview.getUrl();
                        if (url != null) {
                            $composer.startReplaceGroup(550652827);
                            ComposerKt.sourceInformation($composer, "161@6415L278");
                            SkillManagerViewModel skillManagerViewModel = $agentTools.getSkillManagerViewModel();
                            String name2 = $skill.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            String finalUrl = skillManagerViewModel.getJsSkillWebviewUrl(name2, url);
                            MessageBodyWebviewKt.MessageBodyWebview(new ChatMessageWebView(finalUrl, Intrinsics.areEqual((Object) webview.getIframe(), (Object) true), 1.333f, null, false, 24, null), null, $composer, 0, 2);
                        } else {
                            $composer.startReplaceGroup(544499048);
                        }
                        $composer.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                        $composer.endReplaceGroup();
                        Unit unit4 = Unit.INSTANCE;
                    }
                    $composer.endReplaceGroup();
                    Unit unit5 = Unit.INSTANCE;
                    break;
                case 1:
                    $composer.startReplaceGroup(1600594105);
                    ComposerKt.sourceInformation($composer, "173@6783L17");
                    TextKt.m4781TextNvy7gAk(SkillTesterBottomSheet$lambda$13($logs$delegate), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
                    $composer.endReplaceGroup();
                    Unit unit6 = Unit.INSTANCE;
                    break;
                default:
                    $composer.startReplaceGroup(-1927920550);
                    $composer.endReplaceGroup();
                    Unit unit7 = Unit.INSTANCE;
                    break;
            }
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
            ComposerKt.sourceInformationMarkerStart($composer, 1959361549, "CC(remember):SkillTesterBottomSheet.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($scope) | $composer.changedInstance($agentTools) | $composer.changed($skill);
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SkillTesterBottomSheetKt.SkillTesterBottomSheet$lambda$45$lambda$44$lambda$42$lambda$41($scope, $running$delegate, $agentTools, $skill, $result$delegate, $error$delegate, $resultImage$delegate, $resultWebview$delegate, $inputData$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv3);
                it$iv2 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) it$iv2, PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1654Dp.m9788constructorimpl(16), 0.0f, 0.0f, 13, null), !SkillTesterBottomSheet$lambda$19($running$delegate), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1684986652, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SkillTesterBottomSheetKt.SkillTesterBottomSheet$lambda$45$lambda$44$lambda$43($running$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 805306416, 504);
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

    
    public static final Unit SkillTesterBottomSheet$lambda$45$lambda$44$lambda$28$lambda$27(MutableState $inputData$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $inputData$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    
    public static final Unit SkillTesterBottomSheet$lambda$45$lambda$44$lambda$30$lambda$29(MutableState $customData$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $customData$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    
    public static final Unit SkillTesterBottomSheet$lambda$45$lambda$44$lambda$35(List $tabs, final MutableIntState $selectedTabIndex$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C*110@4693L28,111@4742L15,108@4616L154:SkillTesterBottomSheet.kt#41d64j");
        boolean z = true;
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1315707806, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheet.<anonymous>.<anonymous>.<anonymous> (SkillTesterBottomSheet.kt:107)");
            }
            List $this$forEachIndexed$iv = $tabs;
            int index$iv = 0;
            for (Object item$iv : $this$forEachIndexed$iv) {
                int index$iv2 = index$iv + 1;
                if (index$iv < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final String title = (String) item$iv;
                final int index = index$iv;
                boolean z2 = SkillTesterBottomSheet$lambda$16($selectedTabIndex$delegate) == index ? z : false;
                ComposerKt.sourceInformationMarkerStart($composer, 244663928, "CC(remember):SkillTesterBottomSheet.kt#9igjgp");
                boolean invalid$iv = $composer.changed(index);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheetKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SkillTesterBottomSheetKt.m451x585bf85b(index, $selectedTabIndex$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                TabKt.m4650TabwqdebIU(z2, (Function0) it$iv, null, false, ComposableLambdaKt.rememberComposableLambda(616743318, z, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SkillTesterBottomSheetKt.m452x56dfbca5(title, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer, 54), null, 0L, 0L, null, $composer, 24576, 492);
                index$iv = index$iv2;
                z = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m451x585bf85b(int $index, MutableIntState $selectedTabIndex$delegate) {
        $selectedTabIndex$delegate.setIntValue($index);
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m452x56dfbca5(String $title, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C111@4744L11:SkillTesterBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(616743318, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SkillTesterBottomSheet.kt:111)");
            }
            TextKt.m4781TextNvy7gAk($title, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit SkillTesterBottomSheet$lambda$45$lambda$44$lambda$42$lambda$41(CoroutineScope $scope, MutableState $running$delegate, AgentTools $agentTools, Skill $skill, MutableState $result$delegate, MutableState $error$delegate, MutableState $resultImage$delegate, MutableState $resultWebview$delegate, MutableState $inputData$delegate) {
        SkillTesterBottomSheet$lambda$20($running$delegate, true);
        BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getDefault(), null, new SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1($agentTools, $skill, $result$delegate, $error$delegate, $resultImage$delegate, $resultWebview$delegate, $inputData$delegate, $running$delegate, null), 2, null);
        return Unit.INSTANCE;
    }

    
    public static final Unit SkillTesterBottomSheet$lambda$45$lambda$44$lambda$43(MutableState $running$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C233@8968L63,233@8963L69:SkillTesterBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1684986652, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheet.<anonymous>.<anonymous>.<anonymous> (SkillTesterBottomSheet.kt:233)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(SkillTesterBottomSheet$lambda$19($running$delegate) ? C2421R.string.running : C2421R.string.run, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
