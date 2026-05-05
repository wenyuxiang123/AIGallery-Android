package com.google.ai.edge.gallery.ui.common.textandvoiceinput;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.rounded.SendKt;
import androidx.compose.material.icons.outlined.KeyboardAltKt;
import androidx.compose.material.icons.outlined.MicKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.graphics.SolidColor;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.text.TextLayoutResult;
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
import androidx.profileinstaller.ProfileVerifier;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.ColorUtilsKt;
import com.google.ai.edge.gallery.ui.theme.TypeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;



V", "app_debug", "textInputMode", "curTextInput"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class TextAndVoiceInputKt {
    
    public static final Unit TextAndVoiceInput$lambda$31(Task task, boolean z, HoldToDictateViewModel holdToDictateViewModel, Function1 function1, Function1 function12, Modifier modifier, long j, boolean z2, int i, int i2, Composer composer, int i3) {
        TextAndVoiceInput(task, z, holdToDictateViewModel, function1, function12, modifier, j, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void TextAndVoiceInput(final Task task, final boolean processing, final HoldToDictateViewModel holdToDictateViewModel, final Function1<? super String, Unit> onDone, final Function1<? super Integer, Unit> onAmplitudeChanged, Modifier modifier, long clearTextTrigger, boolean defaultTextInputMode, Composer $composer, final int $changed, final int i) {
        long j;
        Modifier modifier2;
        boolean defaultTextInputMode2;
        long clearTextTrigger2;
        Function0<ComposeUiNode> function0;
        Object it$iv;
        Modifier.Companion companionM1401clickableoSLSa3U;
        Function0<ComposeUiNode> function02;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(holdToDictateViewModel, "holdToDictateViewModel");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Intrinsics.checkNotNullParameter(onAmplitudeChanged, "onAmplitudeChanged");
        Composer $composer2 = $composer.startRestartGroup(2064262808);
        ComposerKt.sourceInformation($composer2, "C(TextAndVoiceInput)P(7,6,2,5,4,3)71@2947L4553:TextAndVoiceInput.kt#yuot9y");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(task) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(processing) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(holdToDictateViewModel) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(onDone) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(onAmplitudeChanged) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f249xf2722a21;
        } else if ((196608 & $changed) == 0) {
            $dirty |= $composer2.changed(modifier) ? 131072 : 65536;
        }
        int i3 = i & 64;
        if (i3 != 0) {
            $dirty |= 1572864;
            j = clearTextTrigger;
        } else if ((1572864 & $changed) == 0) {
            j = clearTextTrigger;
            $dirty |= $composer2.changed(j) ? 1048576 : 524288;
        } else {
            j = clearTextTrigger;
        }
        int i4 = i & 128;
        if (i4 != 0) {
            $dirty |= 12582912;
        } else if (($changed & 12582912) == 0) {
            $dirty |= $composer2.changed(defaultTextInputMode) ? 8388608 : 4194304;
        }
        if ($composer2.shouldExecute(($dirty & 4793491) != 4793490, $dirty & 1)) {
            modifier2 = i2 != 0 ? Modifier.INSTANCE : modifier;
            clearTextTrigger2 = i3 != 0 ? 0L : j;
            defaultTextInputMode2 = i4 != 0 ? false : defaultTextInputMode;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2064262808, $dirty, -1, "com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInput (TextAndVoiceInput.kt:70)");
            }
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            int $changed$iv = (($dirty >> 15) & 14) | 432;
            Modifier modifier$iv = modifier2;
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
            int $changed$iv$iv = ($changed$iv << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $dirty2 = $dirty;
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
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
            int i5 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i6 = (($changed$iv >> 6) & 112) | 6;
            final RowScope $this$TextAndVoiceInput_u24lambda_u2430 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -908358218, "C76@3116L49,77@3190L31,79@3260L21,79@3227L54,95@3681L41,96@3759L11,99@3871L11,82@3349L978,115@4378L3118,115@4333L3163:TextAndVoiceInput.kt#yuot9y");
            ComposerKt.sourceInformationMarkerStart($composer2, -999136883, "CC(remember):TextAndVoiceInput.kt#9igjgp");
            Object value$iv = $composer2.rememberedValue();
            if (value$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(defaultTextInputMode2), null, 2, null);
                $composer2.updateRememberedValue(value$iv);
            }
            final MutableState textInputMode$delegate = (MutableState) value$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -999134533, "CC(remember):TextAndVoiceInput.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(value$iv2);
                it$iv = value$iv2;
            } else {
                it$iv = it$iv2;
            }
            final MutableState curTextInput$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Long lValueOf = Long.valueOf(clearTextTrigger2);
            ComposerKt.sourceInformationMarkerStart($composer2, -999132303, "CC(remember):TextAndVoiceInput.kt#9igjgp");
            TextAndVoiceInputKt$TextAndVoiceInput$1$1$1 value$iv3 = $composer2.rememberedValue();
            if (value$iv3 == Composer.INSTANCE.getEmpty()) {
                value$iv3 = new TextAndVoiceInputKt$TextAndVoiceInput$1$1$1(curTextInput$delegate, null);
                $composer2.updateRememberedValue(value$iv3);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(lValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) value$iv3, $composer2, ($dirty2 >> 18) & 14);
            Modifier modifierClip = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.getCircleShape());
            if (processing) {
                $composer2.startReplaceGroup(-907987552);
                $composer2.endReplaceGroup();
                companionM1401clickableoSLSa3U = Modifier.INSTANCE;
            } else {
                $composer2.startReplaceGroup(-908135949);
                ComposerKt.sourceInformation($composer2, "87@3487L98");
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer2, -999124962, "CC(remember):TextAndVoiceInput.kt#9igjgp");
                Object value$iv4 = $composer2.rememberedValue();
                if (value$iv4 == Composer.INSTANCE.getEmpty()) {
                    value$iv4 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInputKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TextAndVoiceInputKt.TextAndVoiceInput$lambda$30$lambda$8$lambda$7(curTextInput$delegate, textInputMode$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv4);
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                companionM1401clickableoSLSa3U = ClickableKt.m1401clickableoSLSa3U(companion, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) value$iv4);
                $composer2.endReplaceGroup();
            }
            Modifier modifierThen = modifierClip.then(companionM1401clickableoSLSa3U);
            ComposerKt.sourceInformationMarkerStart($composer2, -999118811, "CC(remember):TextAndVoiceInput.kt#9igjgp");
            boolean invalid$iv = ($dirty2 & 112) == 32;
            Object it$iv3 = $composer2.rememberedValue();
            if (invalid$iv || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv5 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInputKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextAndVoiceInputKt.TextAndVoiceInput$lambda$30$lambda$10$lambda$9(processing, (GraphicsLayerScope) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv5);
                it$iv3 = value$iv5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifier$iv2 = SizeKt.m2036size3ABfNKs(BorderKt.m1374borderxT4_qwU(BackgroundKt.m1359backgroundbw27NRU$default(GraphicsLayerModifierKt.graphicsLayer(modifierThen, (Function1) it$iv3), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurfaceContainerLow(), null, 2, null), C1654Dp.m9788constructorimpl(1), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutlineVariant(), RoundedCornerShapeKt.getCircleShape()), C1654Dp.m9788constructorimpl(48));
            Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
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
                function02 = constructor2;
                $composer2.createNode(function02);
            } else {
                function02 = constructor2;
                $composer2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer2);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i8 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -401078503, "C108@4149L122,105@4025L296:TextAndVoiceInput.kt#yuot9y");
            IconKt.m4075Iconww6aTOc(TextAndVoiceInput$lambda$30$lambda$1(textInputMode$delegate) ? MicKt.getMic(Icons.Outlined.INSTANCE) : KeyboardAltKt.getKeyboardAlt(Icons.Outlined.INSTANCE), StringResources_androidKt.stringResource(TextAndVoiceInput$lambda$30$lambda$1(textInputMode$delegate) ? C2421R.string.cd_switch_to_voice : C2421R.string.cd_switch_to_keyboard, $composer2, 0), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(24)), 0L, $composer2, 384, 8);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            AnimatedContentKt.AnimatedContent(Boolean.valueOf(TextAndVoiceInput$lambda$30$lambda$1(textInputMode$delegate)), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1586295679, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInputKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return TextAndVoiceInputKt.TextAndVoiceInput$lambda$30$lambda$29($this$TextAndVoiceInput_u24lambda_u2430, task, holdToDictateViewModel, onDone, onAmplitudeChanged, processing, curTextInput$delegate, (AnimatedContentScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 1572864, 62);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            defaultTextInputMode2 = defaultTextInputMode;
            clearTextTrigger2 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final long j2 = clearTextTrigger2;
            final boolean z = defaultTextInputMode2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInputKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextAndVoiceInputKt.TextAndVoiceInput$lambda$31(task, processing, holdToDictateViewModel, onDone, onAmplitudeChanged, modifier3, j2, z, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean TextAndVoiceInput$lambda$30$lambda$1(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void TextAndVoiceInput$lambda$30$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String TextAndVoiceInput$lambda$30$lambda$4(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    
    public static final Unit TextAndVoiceInput$lambda$30$lambda$8$lambda$7(MutableState $curTextInput$delegate, MutableState $textInputMode$delegate) {
        $curTextInput$delegate.setValue("");
        TextAndVoiceInput$lambda$30$lambda$2($textInputMode$delegate, !TextAndVoiceInput$lambda$30$lambda$1($textInputMode$delegate));
        return Unit.INSTANCE;
    }

    
    public static final Unit TextAndVoiceInput$lambda$30$lambda$10$lambda$9(boolean $processing, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(!$processing ? 1.0f : 0.5f);
        return Unit.INSTANCE;
    }

    
    public static final Unit TextAndVoiceInput$lambda$30$lambda$29(RowScope $this_Row, final Task $task, HoldToDictateViewModel $holdToDictateViewModel, final Function1 $onDone, final Function1 $onAmplitudeChanged, final boolean $processing, final MutableState $curTextInput$delegate, AnimatedContentScope AnimatedContent, boolean showTextInput, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        ComposerKt.sourceInformation($composer, "C:TextAndVoiceInput.kt#yuot9y");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1586295679, $changed, -1, "com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInput.<anonymous>.<anonymous> (TextAndVoiceInput.kt:117)");
        }
        if (showTextInput) {
            $composer.startReplaceGroup(-190436059);
            ComposerKt.sourceInformation($composer, "118@4473L51,123@4678L11,126@4790L11,119@4533L2620");
            final String cdPromptInput = StringResources_androidKt.stringResource(C2421R.string.cd_prompt_input_text_field, $composer, 0);
            Modifier modifier$iv = SizeKt.m2024heightInVpY3zN4$default(BorderKt.m1374borderxT4_qwU(BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(RowScope.weight$default($this_Row, Modifier.INSTANCE, 1.0f, false, 2, null), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(28))), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface(), null, 2, null), C1654Dp.m9788constructorimpl(1), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutlineVariant(), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(28))), C1654Dp.m9788constructorimpl(48), 0.0f, 2, null);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
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
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i2 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1941937081, "C136@5206L11,137@5281L11,139@5419L68,135@5116L21,144@5569L1561,132@5003L2140:TextAndVoiceInput.kt#yuot9y");
            String strTextAndVoiceInput$lambda$30$lambda$4 = TextAndVoiceInput$lambda$30$lambda$4($curTextInput$delegate);
            boolean z = !$processing;
            TextStyle textStyleM9205copyp1EtxEg$default = TextStyle.m9205copyp1EtxEg$default(TypeKt.getBodyLargeNarrow(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int $changed$iv$iv$iv2 = MaterialTheme.$stable;
            SolidColor solidColor = new SolidColor(materialTheme.getColorScheme($composer, $changed$iv$iv$iv2).getPrimary(), null);
            Modifier modifierM1990paddingVpY3zN4$default = PaddingKt.m1990paddingVpY3zN4$default(PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 10, null), 0.0f, C1654Dp.m9788constructorimpl(2), 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, -339726556, "CC(remember):TextAndVoiceInput.kt#9igjgp");
            boolean invalid$iv = $composer.changed(cdPromptInput);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInputKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextAndVoiceInputKt.m522x3fa995c8(cdPromptInput, (SemanticsPropertyReceiver) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM1990paddingVpY3zN4$default, false, (Function1) it$iv, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, -339736299, "CC(remember):TextAndVoiceInput.kt#9igjgp");
            Object it$iv2 = $composer.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInputKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextAndVoiceInputKt.m523x6972fb4c($curTextInput$delegate, (String) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BasicTextFieldKt.BasicTextField(strTextAndVoiceInput$lambda$30$lambda$4, (Function1<? super String, Unit>) it$iv2, modifierSemantics$default, z, false, textStyleM9205copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, false, 3, 1, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1155310403, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInputKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TextAndVoiceInputKt.TextAndVoiceInput$lambda$30$lambda$29$lambda$24$lambda$23($processing, $onDone, $task, $curTextInput$delegate, (Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 805306416, 196614, 14800);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endReplaceGroup();
        } else {
            $composer.startReplaceGroup(-187780227);
            ComposerKt.sourceInformation($composer, "192@7309L24,193@7366L26,189@7206L276");
            ComposerKt.sourceInformationMarkerStart($composer, -283148745, "CC(remember):TextAndVoiceInput.kt#9igjgp");
            boolean invalid$iv2 = $composer.changed($onDone);
            Object it$iv3 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInputKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextAndVoiceInputKt.TextAndVoiceInput$lambda$30$lambda$29$lambda$26$lambda$25($onDone, (String) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            Function1 function1 = (Function1) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -283146919, "CC(remember):TextAndVoiceInput.kt#9igjgp");
            boolean invalid$iv3 = $composer.changed($onAmplitudeChanged);
            Object it$iv4 = $composer.rememberedValue();
            if (invalid$iv3 || it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInputKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextAndVoiceInputKt.TextAndVoiceInput$lambda$30$lambda$29$lambda$28$lambda$27($onAmplitudeChanged, ((Integer) obj).intValue());
                    }
                };
                $composer.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            HoldToDictateKt.HoldToDictate($task, $holdToDictateViewModel, function1, (Function1) it$iv4, !$processing, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), $composer, ProfileVerifier.CompilationStatus.f249xf2722a21, 0);
            $composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m523x6972fb4c(MutableState $curTextInput$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $curTextInput$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m522x3fa995c8(String $cdPromptInput, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, $cdPromptInput);
        return Unit.INSTANCE;
    }

    
    public static final Unit TextAndVoiceInput$lambda$30$lambda$29$lambda$24$lambda$23(final boolean $processing, final Function1 $onDone, Task $task, final MutableState $curTextInput$delegate, Function2 innerTextField, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Modifier.Companion companionM1401clickableoSLSa3U;
        Function0<ComposeUiNode> function03;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        ComposerKt.sourceInformation($composer, "C145@5603L1513:TextAndVoiceInput.kt#yuot9y");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changedInstance(innerTextField) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1155310403, $dirty, -1, "com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInput.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextAndVoiceInput.kt:145)");
            }
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(4));
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
            int i2 = ((432 >> 6) & 112) | 6;
            RowScope $this$TextAndVoiceInput_u24lambda_u2430_u24lambda_u2429_u24lambda_u2424_u24lambda_u2423_u24lambda_u2422 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1238074986, "C149@5774L381,170@6583L41,171@6659L29,160@6205L895:TextAndVoiceInput.kt#yuot9y");
            Modifier modifier$iv2 = PaddingKt.m1990paddingVpY3zN4$default(RowScope.weight$default($this$TextAndVoiceInput_u24lambda_u2430_u24lambda_u2429_u24lambda_u2424_u24lambda_u2423_u24lambda_u2422, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, C1654Dp.m9788constructorimpl(8), 1, null);
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
            ComposerKt.sourceInformationMarkerStart($composer, -276953019, "C156@6121L16:TextAndVoiceInput.kt#yuot9y");
            if (TextAndVoiceInput$lambda$30$lambda$4($curTextInput$delegate).length() == 0) {
                $composer.startReplaceGroup(-276927197);
                ComposerKt.sourceInformation($composer, "152@5929L56,153@6031L11,151@5894L188");
                TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.text_input_placeholder_llm_chat, $composer, 0), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262138);
            } else {
                $composer.startReplaceGroup(-282760343);
            }
            $composer.endReplaceGroup();
            innerTextField.invoke($composer, Integer.valueOf($dirty & 14));
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifierClip = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.getCircleShape());
            if (!$processing) {
                $composer.startReplaceGroup(-1237535742);
                ComposerKt.sourceInformation($composer, "165@6403L24");
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, -178466409, "CC(remember):TextAndVoiceInput.kt#9igjgp");
                boolean invalid$iv = $composer.changed($onDone);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInputKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TextAndVoiceInputKt.m524xfcffad45($onDone, $curTextInput$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                companionM1401clickableoSLSa3U = ClickableKt.m1401clickableoSLSa3U(companion, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1237434651);
                $composer.endReplaceGroup();
                companionM1401clickableoSLSa3U = Modifier.INSTANCE;
            }
            Modifier modifierThen = modifierClip.then(companionM1401clickableoSLSa3U);
            ComposerKt.sourceInformationMarkerStart($composer, -178460632, "CC(remember):TextAndVoiceInput.kt#9igjgp");
            boolean invalid$iv2 = $composer.changed($processing);
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.textandvoiceinput.TextAndVoiceInputKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextAndVoiceInputKt.m525x5d8bbc9e($processing, (GraphicsLayerScope) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifier$iv3 = SizeKt.m2036size3ABfNKs(BackgroundKt.m1359backgroundbw27NRU$default(GraphicsLayerModifierKt.graphicsLayer(modifierThen, (Function1) it$iv2), ColorUtilsKt.getTaskIconColor($task, $composer, 0), null, 2, null), C1654Dp.m9788constructorimpl(36));
            Alignment contentAlignment$iv2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
            int $changed$iv$iv3 = (48 << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i6 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -11271846, "C177@6919L44,175@6819L263:TextAndVoiceInput.kt#yuot9y");
            IconKt.m4075Iconww6aTOc(SendKt.getSend(Icons.AutoMirrored.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_send_prompt_icon, $composer, 0), OffsetKt.m1945offsetVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(2), 0.0f, 2, null), Color.INSTANCE.m6952getWhite0d7_KjU(), $composer, 3456, 0);
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
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m524xfcffad45(Function1 $onDone, MutableState $curTextInput$delegate) {
        $onDone.invoke(TextAndVoiceInput$lambda$30$lambda$4($curTextInput$delegate));
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m525x5d8bbc9e(boolean $processing, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(!$processing ? 1.0f : 0.5f);
        return Unit.INSTANCE;
    }

    
    public static final Unit TextAndVoiceInput$lambda$30$lambda$29$lambda$26$lambda$25(Function1 $onDone, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        $onDone.invoke(text);
        return Unit.INSTANCE;
    }

    
    public static final Unit TextAndVoiceInput$lambda$30$lambda$29$lambda$28$lambda$27(Function1 $onAmplitudeChanged, int it) {
        $onAmplitudeChanged.invoke(Integer.valueOf(it));
        return Unit.INSTANCE;
    }
}
