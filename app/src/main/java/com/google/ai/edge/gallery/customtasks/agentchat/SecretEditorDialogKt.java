package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.VisibilityKt;
import androidx.compose.material.icons.filled.VisibilityOffKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.input.PasswordVisualTransformation;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.ui.common.MarkdownTextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SecretEditorDialog.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002"}, m922d2 = {"SecretEditorDialog", "", "title", "", "fieldLabel", "value", "onValueChange", "Lkotlin/Function1;", "onDone", "Lkotlin/Function0;", "onDismiss", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "passwordVisible", ""}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class SecretEditorDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecretEditorDialog$lambda$12(String str, String str2, String str3, Function1 function1, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        SecretEditorDialog(str, str2, str3, function1, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SecretEditorDialog(final String title, final String fieldLabel, final String value, final Function1<? super String, Unit> onValueChange, final Function0<Unit> onDone, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fieldLabel, "fieldLabel");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(1944280101);
        ComposerKt.sourceInformation($composer2, "C(SecretEditorDialog)P(4!1,5,3,2)74@2882L68,75@2972L77,53@1978L15,54@2006L854,51@1919L1135:SecretEditorDialog.kt#41d64j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(title) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(fieldLabel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(value) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(onValueChange) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(onDone) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 131072 : 65536;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1944280101, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialog (SecretEditorDialog.kt:50)");
            }
            AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(-1339860371, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecretEditorDialogKt.SecretEditorDialog$lambda$0(onDone, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(259288687, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecretEditorDialogKt.SecretEditorDialog$lambda$1(onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(1858437745, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecretEditorDialogKt.SecretEditorDialog$lambda$2(title, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1636955022, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialogKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecretEditorDialogKt.SecretEditorDialog$lambda$11(fieldLabel, value, onValueChange, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty2 >> 15) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialogKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecretEditorDialogKt.SecretEditorDialog$lambda$12(title, fieldLabel, value, onValueChange, onDone, onDismiss, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecretEditorDialog$lambda$2(String $title, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C53@1980L11:SecretEditorDialog.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1858437745, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialog.<anonymous> (SecretEditorDialog.kt:53)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecretEditorDialog$lambda$11(String $fieldLabel, String $value, Function1 $onValueChange, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        boolean z;
        VisualTransformation passwordVisualTransformation;
        ComposerKt.sourceInformation($composer, "C55@2014L840:SecretEditorDialog.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1636955022, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialog.<anonymous> (SecretEditorDialog.kt:55)");
            }
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
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
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i2 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1188425214, "C56@2081L24,57@2137L34,63@2418L417,58@2180L666:SecretEditorDialog.kt#41d64j");
            MarkdownTextKt.m10879MarkdownTextjA1GFJw($fieldLabel, null, false, 0L, 0L, $composer, 0, 30);
            ComposerKt.sourceInformationMarkerStart($composer, -100209974, "CC(remember):SecretEditorDialog.kt#9igjgp");
            Object value$iv = $composer.rememberedValue();
            if (value$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer.updateRememberedValue(value$iv);
            }
            final MutableState passwordVisible$delegate = (MutableState) value$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (SecretEditorDialog$lambda$11$lambda$10$lambda$4(passwordVisible$delegate)) {
                passwordVisualTransformation = VisualTransformation.INSTANCE.getNone();
                z = true;
            } else {
                z = true;
                passwordVisualTransformation = new PasswordVisualTransformation((char) 0, 1, null);
            }
            OutlinedTextFieldKt.OutlinedTextField($value, (Function1<? super String, Unit>) $onValueChange, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(732033216, z, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialogKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecretEditorDialogKt.SecretEditorDialog$lambda$11$lambda$10$lambda$9(passwordVisible$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, passwordVisualTransformation, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 100663296, 0, 0, 8371964);
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

    private static final boolean SecretEditorDialog$lambda$11$lambda$10$lambda$4(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void SecretEditorDialog$lambda$11$lambda$10$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecretEditorDialog$lambda$11$lambda$10$lambda$9(final MutableState $passwordVisible$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C67@2694L38,67@2734L89,67@2673L150:SecretEditorDialog.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(732033216, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialog.<anonymous>.<anonymous>.<anonymous> (SecretEditorDialog.kt:64)");
            }
            final ImageVector image = SecretEditorDialog$lambda$11$lambda$10$lambda$4($passwordVisible$delegate) ? VisibilityKt.getVisibility(Icons.Filled.INSTANCE) : VisibilityOffKt.getVisibilityOff(Icons.Filled.INSTANCE);
            final String description = SecretEditorDialog$lambda$11$lambda$10$lambda$4($passwordVisible$delegate) ? "Hide password" : "Show password";
            ComposerKt.sourceInformationMarkerStart($composer, -890707098, "CC(remember):SecretEditorDialog.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecretEditorDialogKt.m430x9400fd89($passwordVisible$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) it$iv, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(105172578, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecretEditorDialogKt.SecretEditorDialog$lambda$11$lambda$10$lambda$9$lambda$8(image, description, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 1572870, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SecretEditorDialog$lambda$11$lambda$10$lambda$9$lambda$7$lambda$6 */
    public static final Unit m430x9400fd89(MutableState $passwordVisible$delegate) {
        SecretEditorDialog$lambda$11$lambda$10$lambda$5($passwordVisible$delegate, !SecretEditorDialog$lambda$11$lambda$10$lambda$4($passwordVisible$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecretEditorDialog$lambda$11$lambda$10$lambda$9$lambda$8(ImageVector $image, String $description, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C68@2750L59:SecretEditorDialog.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(105172578, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SecretEditorDialog.kt:68)");
            }
            IconKt.m4075Iconww6aTOc($image, $description, (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecretEditorDialog$lambda$0(Function0 $onDone, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C74@2884L64:SecretEditorDialog.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1339860371, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialog.<anonymous> (SecretEditorDialog.kt:74)");
            }
            ButtonKt.Button($onDone, null, false, null, null, null, null, null, null, ComposableSingletons$SecretEditorDialogKt.INSTANCE.m10458getLambda$1909160355$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecretEditorDialog$lambda$1(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C75@2974L73:SecretEditorDialog.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(259288687, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SecretEditorDialog.<anonymous> (SecretEditorDialog.kt:75)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$SecretEditorDialogKt.INSTANCE.m10459getLambda$22649876$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
