package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.ExposedDropdownMenuAnchorType;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.Clipboard;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.p006ui.theme.ThemeKt;
import com.google.ai.edge.gallery.proto.Skill;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AddOrEditSkillBottomSheet.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000p\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a9\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001aÃ\u0002\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\t0\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u000f26\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\t0\u001c2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\t0\u00192!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\t0\u00192\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00192\u0006\u0010&\u001a\u00020\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00192\u0006\u0010(\u001a\u00020\u00012\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00192\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-H\u0003¢\u0006\u0002\u0010.\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/²\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002²\u0006\n\u00102\u001a\u000203X\u008a\u008e\u0002²\u0006\f\u00104\u001a\u0004\u0018\u000105X\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u00107\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u00108\u001a\u000203X\u008a\u008e\u0002²\u0006\n\u00109\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u000203X\u008a\u008e\u0002²\u0006\n\u0010;\u001a\u000203X\u008a\u008e\u0002²\u0006\n\u0010<\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010=\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010>\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u000203X\u008a\u008e\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0001X\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u000203X\u008a\u008e\u0002²\u0006\n\u0010C\u001a\u000203X\u008a\u008e\u0002²\u0006\n\u0010D\u001a\u000203X\u008a\u008e\u0002²\u0006\n\u0010E\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010F\u001a\u000203X\u008a\u008e\u0002"}, m922d2 = {"TAG", "", "DEFAULT_SCRIPT_NAME", "TABS", "", "CALL_JS_INSTRUCTIONS_TEMPLATE", "INPUT_DATA_PLACEHOLDER", "OUTPUT_DATA_PLACEHOLDER", "AddOrEditSkillBottomSheet", "", "skillManagerViewModel", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;", "skillIndex", "", "onDismiss", "Lkotlin/Function0;", "onSuccess", "(Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ScriptsTabContent", "scope", "Lkotlinx/coroutines/CoroutineScope;", "scriptContents", "", "selectedScript", "onScriptSelected", "Lkotlin/Function1;", "onAddDefaultScript", "onScriptChanged", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.CONTENT, "onScriptAdded", "scriptName", "onScriptDeleted", "curDescription", "requirements", "onRequirementsChange", "inputData", "onInputDataChange", "outputData", "onOutputDataChange", "snackbarHostState", "Landroidx/compose/material3/SnackbarHostState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/coroutines/CoroutineScope;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "app_debug", "uiState", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;", "cancelClicked", "", "skill", "Lcom/google/ai/edge/gallery/proto/Skill;", "description", "instructions", "showErrorDialog", "errorMessage", "edited", "showDiscardDialog", "llmPromptGeneratorRequirements", "llmPromptGeneratorInputData", "llmPromptGeneratorOutputData", "scriptsLoading", "selectedTabIndex", "scriptContent", "showAddScriptDialog", "showDeleteConfirmation", "showGenerateLlmPromptBottomSheet", "newScriptName", "expanded"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class AddOrEditSkillBottomSheetKt {
    private static final String DEFAULT_SCRIPT_NAME = "index.html";
    private static final String TAG = "AGAddOrEditSkill";
    private static final List<String> TABS = CollectionsKt.listOf((Object[]) new String[]{"Info", "Scripts"});
    private static final String CALL_JS_INSTRUCTIONS_TEMPLATE = "# Instructions\n\nCall the `run_js` tool with the following exact parameters:\n\n- data: A JSON string with the following fields:\n  - [fieldName]: [Data type, e.g. String, Number, Array] - [short description].\n  - ...";
    private static final String INPUT_DATA_PLACEHOLDER = "- [fieldName]: [Data type (String, Number, Array)] - [short description]";
    private static final String OUTPUT_DATA_PLACEHOLDER = "- [fieldName]: [Data type (String, Number, Array)] - [short description]";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddOrEditSkillBottomSheet$lambda$109(SkillManagerViewModel skillManagerViewModel, int i, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        AddOrEditSkillBottomSheet(skillManagerViewModel, i, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$182(CoroutineScope coroutineScope, Map map, String str, Function1 function1, Function0 function0, Function2 function2, Function1 function12, Function1 function13, String str2, String str3, Function1 function14, String str4, Function1 function15, String str5, Function1 function16, SnackbarHostState snackbarHostState, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        ScriptsTabContent(coroutineScope, map, str, function1, function0, function2, function12, function13, str2, str3, function14, str4, function15, str5, function16, snackbarHostState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static final void AddOrEditSkillBottomSheet(final SkillManagerViewModel skillManagerViewModel, final int skillIndex, final Function0<Unit> onDismiss, final Function0<Unit> onSuccess, Composer $composer, final int $changed) {
        Composer $composer2;
        String str;
        int i;
        Skill skill;
        MutableState showDiscardDialog$delegate;
        String str2;
        MutableState errorMessage$delegate;
        MutableState showErrorDialog$delegate;
        int i2;
        String str3;
        final MutableState showDiscardDialog$delegate2;
        String description;
        String instructions;
        String description2;
        String name;
        Intrinsics.checkNotNullParameter(skillManagerViewModel, "skillManagerViewModel");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Composer $composer3 = $composer.startRestartGroup(-1336894938);
        ComposerKt.sourceInformation($composer3, "C(AddOrEditSkillBottomSheet)P(3,2)126@5135L16,127@5175L34,128@5229L59,129@5304L72,130@5391L46,131@5459L53,132@5535L54,133@5615L34,134@5672L31,135@5720L34,136@5782L34,137@5831L24,138@5882L32,143@6005L53,144@6096L51,145@6186L52,147@6264L34,148@6322L48,149@6395L42,151@6463L552,151@6441L574,168@7110L9545,168@7019L9636:AddOrEditSkillBottomSheet.kt#41d64j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(skillManagerViewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(skillIndex) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onSuccess) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1336894938, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheet (AddOrEditSkillBottomSheet.kt:125)");
            }
            final State uiState$delegate = SnapshotStateKt.collectAsState(skillManagerViewModel.getUiState(), null, $composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer3, -560804568, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv = $composer3.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableState cancelClicked$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer3, 6, 2);
            ComposerKt.sourceInformationMarkerStart($composer3, -560800402, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv2 = $composer3.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                SkillState skillState = (SkillState) CollectionsKt.getOrNull(AddOrEditSkillBottomSheet$lambda$0(uiState$delegate).getSkills(), skillIndex);
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(skillState != null ? skillState.getSkill() : null, null, 2, null);
                $composer3.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableState skill$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -560797644, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv3 = $composer3.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Skill skillAddOrEditSkillBottomSheet$lambda$5 = AddOrEditSkillBottomSheet$lambda$5(skill$delegate);
                Object value$iv3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((skillAddOrEditSkillBottomSheet$lambda$5 == null || (name = skillAddOrEditSkillBottomSheet$lambda$5.getName()) == null) ? "" : name, null, 2, null);
                $composer3.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            final MutableState name$delegate = (MutableState) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -560795461, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv4 = $composer3.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                Skill skillAddOrEditSkillBottomSheet$lambda$52 = AddOrEditSkillBottomSheet$lambda$5(skill$delegate);
                Object value$iv4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((skillAddOrEditSkillBottomSheet$lambda$52 == null || (description2 = skillAddOrEditSkillBottomSheet$lambda$52.getDescription()) == null) ? "" : description2, null, 2, null);
                $composer3.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            }
            final MutableState description$delegate = (MutableState) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -560793028, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv5 = $composer3.rememberedValue();
            if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                Skill skillAddOrEditSkillBottomSheet$lambda$53 = AddOrEditSkillBottomSheet$lambda$5(skill$delegate);
                Object value$iv5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((skillAddOrEditSkillBottomSheet$lambda$53 == null || (instructions = skillAddOrEditSkillBottomSheet$lambda$53.getInstructions()) == null) ? "" : instructions, null, 2, null);
                $composer3.updateRememberedValue(value$iv5);
                it$iv5 = value$iv5;
            }
            final MutableState instructions$delegate = (MutableState) it$iv5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -560790488, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv6 = $composer3.rememberedValue();
            if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                Object value$iv6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv6);
                it$iv6 = value$iv6;
            }
            MutableState showErrorDialog$delegate2 = (MutableState) it$iv6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -560788667, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv7 = $composer3.rememberedValue();
            if (it$iv7 == Composer.INSTANCE.getEmpty()) {
                Object value$iv7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(value$iv7);
                it$iv7 = value$iv7;
            }
            MutableState errorMessage$delegate2 = (MutableState) it$iv7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -560787128, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv8 = $composer3.rememberedValue();
            if (it$iv8 == Composer.INSTANCE.getEmpty()) {
                str = "";
                Object value$iv8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv8);
                it$iv8 = value$iv8;
            } else {
                str = "";
            }
            final MutableState edited$delegate = (MutableState) it$iv8;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -560785144, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv9 = $composer3.rememberedValue();
            if (it$iv9 == Composer.INSTANCE.getEmpty()) {
                Object value$iv9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv9);
                it$iv9 = value$iv9;
            }
            MutableState showDiscardDialog$delegate3 = (MutableState) it$iv9;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object value$iv$iv = $composer3.rememberedValue();
            if (value$iv$iv == Composer.INSTANCE.getEmpty()) {
                value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(value$iv$iv);
            }
            final CoroutineScope scope = (CoroutineScope) value$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -560781946, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv10 = $composer3.rememberedValue();
            if (it$iv10 == Composer.INSTANCE.getEmpty()) {
                Object value$iv10 = new SnackbarHostState();
                $composer3.updateRememberedValue(value$iv10);
                it$iv10 = value$iv10;
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) it$iv10;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Skill curSkill = AddOrEditSkillBottomSheet$lambda$5(skill$delegate);
            final boolean viewingMode = true;
            ComposerKt.sourceInformationMarkerStart($composer3, -560777989, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv11 = $composer3.rememberedValue();
            if (it$iv11 == Composer.INSTANCE.getEmpty()) {
                Skill skillAddOrEditSkillBottomSheet$lambda$54 = AddOrEditSkillBottomSheet$lambda$5(skill$delegate);
                Object value$iv11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((skillAddOrEditSkillBottomSheet$lambda$54 == null || (description = skillAddOrEditSkillBottomSheet$lambda$54.getDescription()) == null) ? str : description, null, 2, null);
                $composer3.updateRememberedValue(value$iv11);
                it$iv11 = value$iv11;
            }
            final MutableState llmPromptGeneratorRequirements$delegate = (MutableState) it$iv11;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -560775079, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv12 = $composer3.rememberedValue();
            if (it$iv12 == Composer.INSTANCE.getEmpty()) {
                Object value$iv12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(INPUT_DATA_PLACEHOLDER, null, 2, null);
                $composer3.updateRememberedValue(value$iv12);
                it$iv12 = value$iv12;
            }
            final MutableState llmPromptGeneratorInputData$delegate = (MutableState) it$iv12;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -560772198, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv13 = $composer3.rememberedValue();
            if (it$iv13 == Composer.INSTANCE.getEmpty()) {
                Object value$iv13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OUTPUT_DATA_PLACEHOLDER, null, 2, null);
                $composer3.updateRememberedValue(value$iv13);
                it$iv13 = value$iv13;
            }
            final MutableState llmPromptGeneratorOutputData$delegate = (MutableState) it$iv13;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -560769720, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv14 = $composer3.rememberedValue();
            if (it$iv14 == Composer.INSTANCE.getEmpty()) {
                i = 0;
                Object value$iv14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv14);
                it$iv14 = value$iv14;
            } else {
                i = 0;
            }
            final MutableState scriptsLoading$delegate = (MutableState) it$iv14;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -560767850, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv15 = $composer3.rememberedValue();
            if (it$iv15 == Composer.INSTANCE.getEmpty()) {
                Object value$iv15 = SnapshotStateKt.mutableStateMapOf();
                $composer3.updateRememberedValue(value$iv15);
                it$iv15 = value$iv15;
            }
            final SnapshotStateMap scriptContents = (SnapshotStateMap) it$iv15;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -560765520, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv16 = $composer3.rememberedValue();
            if (it$iv16 == Composer.INSTANCE.getEmpty()) {
                Object value$iv16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(value$iv16);
                it$iv16 = value$iv16;
            }
            final MutableState selectedScript$delegate = (MutableState) it$iv16;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Skill skillAddOrEditSkillBottomSheet$lambda$55 = AddOrEditSkillBottomSheet$lambda$5(skill$delegate);
            ComposerKt.sourceInformationMarkerStart($composer3, -560762834, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            boolean invalid$iv = $composer3.changedInstance(skillManagerViewModel);
            Object value$iv17 = $composer3.rememberedValue();
            if (invalid$iv || value$iv17 == Composer.INSTANCE.getEmpty()) {
                skill = skillAddOrEditSkillBottomSheet$lambda$55;
                showDiscardDialog$delegate = showDiscardDialog$delegate3;
                str2 = "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp";
                errorMessage$delegate = errorMessage$delegate2;
                int i3 = i;
                showErrorDialog$delegate = showErrorDialog$delegate2;
                i2 = i3;
                value$iv17 = new AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$1$1(skillManagerViewModel, skill$delegate, scriptsLoading$delegate, scriptContents, selectedScript$delegate, null);
                $composer3.updateRememberedValue(value$iv17);
            } else {
                skill = skillAddOrEditSkillBottomSheet$lambda$55;
                showDiscardDialog$delegate = showDiscardDialog$delegate3;
                str2 = "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp";
                errorMessage$delegate = errorMessage$delegate2;
                int i4 = i;
                showErrorDialog$delegate = showErrorDialog$delegate2;
                i2 = i4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(skill, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) value$iv17, $composer3, i2);
            final MutableState showErrorDialog$delegate3 = showErrorDialog$delegate;
            final MutableState mutableState = showDiscardDialog$delegate;
            final MutableState mutableState2 = errorMessage$delegate;
            ModalBottomSheetKt.m4185ModalBottomSheetYbuCTN8(onDismiss, null, sheetState, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(803555332, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$94(snackbarHostState, viewingMode, curSkill, skillIndex, uiState$delegate, scope, scriptContents, skillManagerViewModel, name$delegate, edited$delegate, description$delegate, instructions$delegate, scriptsLoading$delegate, selectedScript$delegate, llmPromptGeneratorRequirements$delegate, llmPromptGeneratorInputData$delegate, llmPromptGeneratorOutputData$delegate, skill$delegate, sheetState, onDismiss, onSuccess, cancelClicked$delegate, mutableState, mutableState2, showErrorDialog$delegate3, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, ($dirty2 >> 6) & 14, 3078, 7162);
            if (AddOrEditSkillBottomSheet$lambda$17(showErrorDialog$delegate3)) {
                $composer3.startReplaceGroup(-193650937);
                ComposerKt.sourceInformation($composer3, "426@16724L27,429@16877L101,428@16831L22,425@16686L299");
                str3 = str2;
                ComposerKt.sourceInformationMarkerStart($composer3, -560435007, str3);
                Object it$iv17 = $composer3.rememberedValue();
                if (it$iv17 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv18 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$96$lambda$95(showErrorDialog$delegate3);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv18);
                    it$iv17 = value$iv18;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                final MutableState errorMessage$delegate3 = errorMessage$delegate;
                AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0((Function0) it$iv17, ComposableLambdaKt.rememberComposableLambda(-957326727, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$99(showErrorDialog$delegate3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer3, 54), null, null, null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.m10439getLambda$652964875$app_debug(), ComposableLambdaKt.rememberComposableLambda(496867412, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$100(errorMessage$delegate3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer3, 1769526, 0, 16284);
            } else {
                str3 = str2;
                $composer3.startReplaceGroup(-210208068);
            }
            $composer3.endReplaceGroup();
            if (AddOrEditSkillBottomSheet$lambda$26(showDiscardDialog$delegate)) {
                $composer3.startReplaceGroup(-193298932);
                ComposerKt.sourceInformation($composer3, "437@17060L29,440@17272L492,459@17788L129,436@17022L902");
                ComposerKt.sourceInformationMarkerStart($composer3, -560424253, str3);
                Object it$iv18 = $composer3.rememberedValue();
                if (it$iv18 == Composer.INSTANCE.getEmpty()) {
                    showDiscardDialog$delegate2 = showDiscardDialog$delegate;
                    Object value$iv19 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$102$lambda$101(showDiscardDialog$delegate2);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv19);
                    it$iv18 = value$iv19;
                } else {
                    showDiscardDialog$delegate2 = showDiscardDialog$delegate;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer2 = $composer3;
                final MutableState mutableState3 = showDiscardDialog$delegate2;
                AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0((Function0) it$iv18, ComposableLambdaKt.rememberComposableLambda(-293347792, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$105(scope, sheetState, onDismiss, cancelClicked$delegate, mutableState3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(2071117678, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$108(showDiscardDialog$delegate2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.getLambda$140615852$app_debug(), ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.getLambda$1322848587$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772598, 0, 16276);
            } else {
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-210208068);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$109(skillManagerViewModel, skillIndex, onDismiss, onSuccess, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final SkillManagerUiState AddOrEditSkillBottomSheet$lambda$0(State<SkillManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (SkillManagerUiState) thisObj$iv;
    }

    private static final boolean AddOrEditSkillBottomSheet$lambda$2(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void AddOrEditSkillBottomSheet$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Skill AddOrEditSkillBottomSheet$lambda$5(MutableState<Skill> mutableState) {
        MutableState<Skill> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String AddOrEditSkillBottomSheet$lambda$8(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String AddOrEditSkillBottomSheet$lambda$11(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String AddOrEditSkillBottomSheet$lambda$14(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean AddOrEditSkillBottomSheet$lambda$17(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void AddOrEditSkillBottomSheet$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String AddOrEditSkillBottomSheet$lambda$20(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean AddOrEditSkillBottomSheet$lambda$23(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void AddOrEditSkillBottomSheet$lambda$24(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean AddOrEditSkillBottomSheet$lambda$26(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void AddOrEditSkillBottomSheet$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String AddOrEditSkillBottomSheet$lambda$30(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String AddOrEditSkillBottomSheet$lambda$33(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String AddOrEditSkillBottomSheet$lambda$36(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean AddOrEditSkillBottomSheet$lambda$39(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AddOrEditSkillBottomSheet$lambda$40(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String AddOrEditSkillBottomSheet$lambda$43(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:99:0x07bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AddOrEditSkillBottomSheet$lambda$94(final androidx.compose.material3.SnackbarHostState r112, final boolean r113, com.google.ai.edge.gallery.proto.Skill r114, final int r115, androidx.compose.runtime.State r116, final kotlinx.coroutines.CoroutineScope r117, final androidx.compose.runtime.snapshots.SnapshotStateMap r118, final com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel r119, final androidx.compose.runtime.MutableState r120, final androidx.compose.runtime.MutableState r121, final androidx.compose.runtime.MutableState r122, final androidx.compose.runtime.MutableState r123, final androidx.compose.runtime.MutableState r124, final androidx.compose.runtime.MutableState r125, final androidx.compose.runtime.MutableState r126, final androidx.compose.runtime.MutableState r127, final androidx.compose.runtime.MutableState r128, final androidx.compose.runtime.MutableState r129, final androidx.compose.material3.SheetState r130, final kotlin.jvm.functions.Function0 r131, final kotlin.jvm.functions.Function0 r132, final androidx.compose.runtime.MutableState r133, final androidx.compose.runtime.MutableState r134, final androidx.compose.runtime.MutableState r135, final androidx.compose.runtime.MutableState r136, androidx.compose.foundation.layout.ColumnScope r137, androidx.compose.runtime.Composer r138, int r139) {
        /*
            Method dump skipped, instruction units count: 2157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$94(androidx.compose.material3.SnackbarHostState, boolean, com.google.ai.edge.gallery.proto.Skill, int, androidx.compose.runtime.State, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.snapshots.SnapshotStateMap, com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.material3.SheetState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$47 */
    private static final int m384x15f61ca6(MutableIntState $selectedTabIndex$delegate) {
        MutableIntState $this$getValue$iv = $selectedTabIndex$delegate;
        return $this$getValue$iv.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$52 */
    public static final Unit m386x15f61cc0(final MutableIntState $selectedTabIndex$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C*203@8391L28,204@8444L15,201@8306L170:AddOrEditSkillBottomSheet.kt#41d64j");
        boolean z = true;
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1259878103, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddOrEditSkillBottomSheet.kt:199)");
            }
            int size = TABS.size();
            final int index = 0;
            while (index < size) {
                final String title = TABS.get(index);
                boolean z2 = m384x15f61ca6($selectedTabIndex$delegate) == index ? z : false;
                ComposerKt.sourceInformationMarkerStart($composer, -437914669, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                boolean invalid$iv = $composer.changed(index);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddOrEditSkillBottomSheetKt.m387x62e60d92(index, $selectedTabIndex$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                TabKt.m4650TabwqdebIU(z2, (Function0) it$iv, null, false, ComposableLambdaKt.rememberComposableLambda(997335327, z, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddOrEditSkillBottomSheetKt.m388xbffde5b5(title, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer, 54), null, 0L, 0L, null, $composer, 24576, 492);
                index++;
                size = size;
                z = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$52$lambda$50$lambda$49 */
    public static final Unit m387x62e60d92(int $index, MutableIntState $selectedTabIndex$delegate) {
        $selectedTabIndex$delegate.setIntValue($index);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$52$lambda$51 */
    public static final Unit m388xbffde5b5(String $title, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C204@8446L11:AddOrEditSkillBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(997335327, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddOrEditSkillBottomSheet.kt:204)");
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
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$82 */
    public static final Unit m389x15f61d1d(ColumnScope $this_Column, CoroutineScope $scope, final SnapshotStateMap $scriptContents, final SkillManagerViewModel $skillManagerViewModel, SnackbarHostState $snackbarHostState, MutableIntState $selectedTabIndex$delegate, boolean $viewingMode, final MutableState $name$delegate, final MutableState $edited$delegate, final MutableState $description$delegate, final MutableState $instructions$delegate, MutableState $scriptsLoading$delegate, final MutableState $selectedScript$delegate, final MutableState $llmPromptGeneratorRequirements$delegate, final MutableState $llmPromptGeneratorInputData$delegate, final MutableState $llmPromptGeneratorOutputData$delegate, final MutableState $skill$delegate, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Composer $composer$iv$iv$iv;
        Composer $composer$iv;
        Composer $composer$iv2;
        Function0<ComposeUiNode> function02;
        Composer $composer$iv$iv;
        Composer $composer$iv$iv$iv2;
        Composer $composer2;
        Function0<ComposeUiNode> function03;
        String str;
        Function0<ComposeUiNode> function04;
        ComposerKt.sourceInformation($composer, "C218@8856L21,216@8748L5785:AddOrEditSkillBottomSheet.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1205464264, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddOrEditSkillBottomSheet.kt:216)");
            }
            Modifier modifier$iv = ScrollKt.verticalScroll$default(PaddingKt.m1990paddingVpY3zN4$default(ColumnScope.weight$default($this_Column, Modifier.INSTANCE, 1.0f, false, 2, null), C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), ScrollKt.rememberScrollState(0, $composer, 0, 1), false, null, false, 14, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv = (0 << 3) & 112;
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
            int i2 = ((0 >> 6) & 112) | 6;
            ColumnScope $this$AddOrEditSkillBottomSheet_u24lambda_u2494_u24lambda_u2493_u24lambda_u2492_u24lambda_u2482_u24lambda_u2481 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 584011009, "C:AddOrEditSkillBottomSheet.kt#41d64j");
            switch (m384x15f61ca6($selectedTabIndex$delegate)) {
                case 0:
                    $composer$iv$iv$iv = $composer;
                    $composer$iv = $composer;
                    $composer$iv2 = $composer;
                    $composer.startReplaceGroup(584002111);
                    ComposerKt.sourceInformation($composer, "223@8995L2991");
                    Modifier modifier$iv2 = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1654Dp.m9788constructorimpl(16), 0.0f, 0.0f, 13, null);
                    ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
                    Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
                    MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
                    int $changed$iv$iv2 = (6 << 3) & 112;
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
                    int i4 = ((6 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -489307342, "C228@9253L160,225@9107L456,238@9583L41,247@10017L174,241@9678L534,255@10232L41,287@11689L197,281@11356L551,295@11927L41:AddOrEditSkillBottomSheet.kt#41d64j");
                    String strAddOrEditSkillBottomSheet$lambda$8 = AddOrEditSkillBottomSheet$lambda$8($name$delegate);
                    boolean z = !$viewingMode;
                    int i5 = C2421R.string.name;
                    int i6 = C2421R.string.skill_name_input_description;
                    Integer numValueOf = Integer.valueOf(i5);
                    Integer numValueOf2 = Integer.valueOf(i6);
                    ComposerKt.sourceInformationMarkerStart($composer, 954049188, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                    Object value$iv = $composer.rememberedValue();
                    if (value$iv == Composer.INSTANCE.getEmpty()) {
                        value$iv = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AddOrEditSkillBottomSheetKt.m390x6a101273($edited$delegate, $name$delegate, (String) obj);
                            }
                        };
                        $composer.updateRememberedValue(value$iv);
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    CursorTrackingTextFieldKt.m10471CursorTrackingTextFieldf8ukHw(numValueOf, numValueOf2, strAddOrEditSkillBottomSheet$lambda$8, (Function1) value$iv, null, z, 0, 0.0f, false, null, $composer, 3072, 976);
                    SpacerKt.Spacer(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(28)), $composer, 6);
                    int i7 = C2421R.string.description_required;
                    int i8 = C2421R.string.skill_description_input_description;
                    boolean z2 = !$viewingMode;
                    String strAddOrEditSkillBottomSheet$lambda$11 = AddOrEditSkillBottomSheet$lambda$11($description$delegate);
                    Integer numValueOf3 = Integer.valueOf(i7);
                    Integer numValueOf4 = Integer.valueOf(i8);
                    ComposerKt.sourceInformationMarkerStart($composer, 954073650, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                    Object value$iv2 = $composer.rememberedValue();
                    if (value$iv2 == Composer.INSTANCE.getEmpty()) {
                        value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AddOrEditSkillBottomSheetKt.m391x93d977f7($edited$delegate, $description$delegate, (String) obj);
                            }
                        };
                        $composer.updateRememberedValue(value$iv2);
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    CursorTrackingTextFieldKt.m10471CursorTrackingTextFieldf8ukHw(numValueOf3, numValueOf4, strAddOrEditSkillBottomSheet$lambda$11, (Function1) value$iv2, null, z2, 3, 0.0f, false, null, $composer, 1575936, 912);
                    SpacerKt.Spacer(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(28)), $composer, 6);
                    if (!$viewingMode) {
                        $composer.startReplaceGroup(-488136225);
                        ComposerKt.sourceInformation($composer, "259@10368L949");
                        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getEnd();
                        Modifier modifier$iv3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                        Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getTop();
                        MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                        int $changed$iv$iv3 = (54 << 3) & 112;
                        ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                        int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                        CompositionLocalMap localMap$iv$iv3 = $composer.getCurrentCompositionLocalMap();
                        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer, modifier$iv3);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
                        $composer$iv$iv = $composer;
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
                        $composer$iv$iv$iv2 = $composer;
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
                        int i9 = ($changed$iv$iv$iv3 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i10 = ((54 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 1027260102, "C265@10645L138,264@10599L696:AddOrEditSkillBottomSheet.kt#41d64j");
                        ComposerKt.sourceInformationMarkerStart($composer, -1629429649, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                        Object value$iv3 = $composer.rememberedValue();
                        if (value$iv3 == Composer.INSTANCE.getEmpty()) {
                            value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AddOrEditSkillBottomSheetKt.m392xab46e0f8($edited$delegate, $instructions$delegate);
                                }
                            };
                            $composer.updateRememberedValue(value$iv3);
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ChipKt.AssistChip((Function0<Unit>) value$iv3, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.m10441getLambda$937806398$app_debug(), (Modifier) null, false, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.getLambda$1927414111$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Shape) null, (ChipColors) null, (ChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, $composer, 24630, 0, 2028);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                    } else {
                        $composer$iv$iv = $composer;
                        $composer$iv$iv$iv2 = $composer;
                        $composer.startReplaceGroup(-498431170);
                    }
                    $composer.endReplaceGroup();
                    int i11 = C2421R.string.instructions;
                    int i12 = C2421R.string.skill_instructions_input_description;
                    boolean z3 = !$viewingMode;
                    String strAddOrEditSkillBottomSheet$lambda$14 = AddOrEditSkillBottomSheet$lambda$14($instructions$delegate);
                    Integer numValueOf5 = Integer.valueOf(i11);
                    Integer numValueOf6 = Integer.valueOf(i12);
                    ComposerKt.sourceInformationMarkerStart($composer, 954127177, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                    Object it$iv = $composer.rememberedValue();
                    if (it$iv == Composer.INSTANCE.getEmpty()) {
                        Object value$iv4 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AddOrEditSkillBottomSheetKt.m393xb3139fab($edited$delegate, $instructions$delegate, (String) obj);
                            }
                        };
                        $composer.updateRememberedValue(value$iv4);
                        it$iv = value$iv4;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    CursorTrackingTextFieldKt.m10471CursorTrackingTextFieldf8ukHw(numValueOf5, numValueOf6, strAddOrEditSkillBottomSheet$lambda$14, (Function1) it$iv, null, z3, 6, 0.0f, false, null, $composer, 1575936, 912);
                    SpacerKt.Spacer(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), $composer, 6);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer$iv$iv$iv2.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv2);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv$iv);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                    $composer2 = $composer;
                    break;
                case 1:
                    $composer.startReplaceGroup(587033880);
                    ComposerKt.sourceInformation($composer, "");
                    if (AddOrEditSkillBottomSheet$lambda$39($scriptsLoading$delegate)) {
                        $composer.startReplaceGroup(587002694);
                        ComposerKt.sourceInformation($composer, "301@12109L196");
                        Modifier modifier$iv4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
                        int $changed$iv$iv4 = (54 << 3) & 112;
                        ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                        int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                        CompositionLocalMap localMap$iv$iv4 = $composer.getCurrentCompositionLocalMap();
                        Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer, modifier$iv4);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        int $changed$iv$iv$iv4 = (($changed$iv$iv4 << 6) & 896) | 6;
                        $composer$iv = $composer;
                        ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer.startReusableNode();
                        if ($composer.getInserting()) {
                            function04 = constructor4;
                            $composer.createNode(function04);
                        } else {
                            function04 = constructor4;
                            $composer.useNode();
                        }
                        Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer);
                        $composer$iv$iv$iv = $composer;
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
                        int i13 = ($changed$iv$iv$iv4 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        int i14 = ((54 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -370775579, "C302@12207L78:AddOrEditSkillBottomSheet.kt#41d64j");
                        ProgressIndicatorKt.m4356CircularProgressIndicator4lLiAd8(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(24)), 0L, C1654Dp.m9788constructorimpl(2), 0L, 0, 0.0f, $composer, 390, 58);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endReplaceGroup();
                        $composer$iv2 = $composer;
                    } else {
                        $composer$iv$iv$iv = $composer;
                        $composer$iv = $composer;
                        $composer.startReplaceGroup(587300542);
                        ComposerKt.sourceInformation($composer, "309@12548L23,310@12614L181,315@12835L219,321@13092L177,326@13309L549,342@14072L39,344@14214L36,346@14356L37,305@12349L2124");
                        String strAddOrEditSkillBottomSheet$lambda$43 = AddOrEditSkillBottomSheet$lambda$43($selectedScript$delegate);
                        Modifier modifierWeight$default = ColumnScope.weight$default($this$AddOrEditSkillBottomSheet_u24lambda_u2494_u24lambda_u2493_u24lambda_u2492_u24lambda_u2482_u24lambda_u2481, Modifier.INSTANCE, 1.0f, false, 2, null);
                        String strAddOrEditSkillBottomSheet$lambda$112 = AddOrEditSkillBottomSheet$lambda$11($description$delegate);
                        String strAddOrEditSkillBottomSheet$lambda$30 = AddOrEditSkillBottomSheet$lambda$30($llmPromptGeneratorRequirements$delegate);
                        String strAddOrEditSkillBottomSheet$lambda$33 = AddOrEditSkillBottomSheet$lambda$33($llmPromptGeneratorInputData$delegate);
                        String strAddOrEditSkillBottomSheet$lambda$36 = AddOrEditSkillBottomSheet$lambda$36($llmPromptGeneratorOutputData$delegate);
                        SnapshotStateMap snapshotStateMap = $scriptContents;
                        ComposerKt.sourceInformationMarkerStart($composer, 1404423369, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                        Object it$iv2 = $composer.rememberedValue();
                        if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                            Object value$iv5 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AddOrEditSkillBottomSheetKt.m394x6de7dcde($selectedScript$delegate, (String) obj);
                                }
                            };
                            $composer.updateRememberedValue(value$iv5);
                            it$iv2 = value$iv5;
                        }
                        Function1 function1 = (Function1) it$iv2;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerStart($composer, 1404425639, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                        Object it$iv3 = $composer.rememberedValue();
                        if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                            Object value$iv6 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AddOrEditSkillBottomSheetKt.m395x97b14262($scriptContents, $selectedScript$delegate, $edited$delegate);
                                }
                            };
                            $composer.updateRememberedValue(value$iv6);
                            it$iv3 = value$iv6;
                        }
                        Function0 function05 = (Function0) it$iv3;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerStart($composer, 1404432749, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                        Object it$iv4 = $composer.rememberedValue();
                        if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                            Object value$iv7 = new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AddOrEditSkillBottomSheetKt.m396xc17aa7e6($scriptContents, $edited$delegate, (String) obj, (String) obj2);
                                }
                            };
                            $composer.updateRememberedValue(value$iv7);
                            it$iv4 = value$iv7;
                        }
                        Function2 function2 = (Function2) it$iv4;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerStart($composer, 1404440931, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                        Object it$iv5 = $composer.rememberedValue();
                        if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                            Object value$iv8 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AddOrEditSkillBottomSheetKt.m397x2206b754($scriptContents, $selectedScript$delegate, $edited$delegate, (String) obj);
                                }
                            };
                            $composer.updateRememberedValue(value$iv8);
                            it$iv5 = value$iv8;
                        }
                        Function1 function12 = (Function1) it$iv5;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerStart($composer, 1404448247, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                        boolean invalid$iv = $composer.changedInstance($skillManagerViewModel);
                        Object value$iv9 = $composer.rememberedValue();
                        if (invalid$iv || value$iv9 == Composer.INSTANCE.getEmpty()) {
                            $composer$iv2 = $composer;
                            str = "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp";
                            value$iv9 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AddOrEditSkillBottomSheetKt.m398xe0b4cf9a($scriptContents, $selectedScript$delegate, $skill$delegate, $skillManagerViewModel, $edited$delegate, (String) obj);
                                }
                            };
                            $composer.updateRememberedValue(value$iv9);
                        } else {
                            str = "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp";
                            $composer$iv2 = $composer;
                        }
                        Function1 function13 = (Function1) value$iv9;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerStart($composer, 1404472153, str);
                        Object it$iv6 = $composer.rememberedValue();
                        if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                            Object value$iv10 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AddOrEditSkillBottomSheetKt.m399xa7e351e($llmPromptGeneratorRequirements$delegate, (String) obj);
                                }
                            };
                            $composer.updateRememberedValue(value$iv10);
                            it$iv6 = value$iv10;
                        }
                        Function1 function14 = (Function1) it$iv6;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerStart($composer, 1404476694, str);
                        Object it$iv7 = $composer.rememberedValue();
                        if (it$iv7 == Composer.INSTANCE.getEmpty()) {
                            Object value$iv11 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AddOrEditSkillBottomSheetKt.m400x34479aa2($llmPromptGeneratorInputData$delegate, (String) obj);
                                }
                            };
                            $composer.updateRememberedValue(value$iv11);
                            it$iv7 = value$iv11;
                        }
                        Function1 function15 = (Function1) it$iv7;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerStart($composer, 1404481239, str);
                        Object it$iv8 = $composer.rememberedValue();
                        if (it$iv8 == Composer.INSTANCE.getEmpty()) {
                            Object value$iv12 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AddOrEditSkillBottomSheetKt.m401x94d3a9fb($llmPromptGeneratorOutputData$delegate, (String) obj);
                                }
                            };
                            $composer.updateRememberedValue(value$iv12);
                            it$iv8 = value$iv12;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ScriptsTabContent($scope, snapshotStateMap, strAddOrEditSkillBottomSheet$lambda$43, function1, function05, function2, function12, function13, strAddOrEditSkillBottomSheet$lambda$112, strAddOrEditSkillBottomSheet$lambda$30, function14, strAddOrEditSkillBottomSheet$lambda$33, function15, strAddOrEditSkillBottomSheet$lambda$36, (Function1) it$iv8, $snackbarHostState, modifierWeight$default, $composer, 1797168, 221574, 0);
                        $composer.endReplaceGroup();
                    }
                    $composer.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                    $composer2 = $composer;
                    break;
                default:
                    $composer$iv$iv$iv = $composer;
                    $composer$iv = $composer;
                    $composer$iv2 = $composer;
                    $composer2 = $composer;
                    $composer2.startReplaceGroup(575002160);
                    $composer2.endReplaceGroup();
                    Unit unit3 = Unit.INSTANCE;
                    break;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
            $composer$iv$iv$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$82$lambda$81$lambda$62$lambda$54$lambda$53 */
    public static final Unit m390x6a101273(MutableState $edited$delegate, MutableState $name$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!AddOrEditSkillBottomSheet$lambda$23($edited$delegate)) {
            AddOrEditSkillBottomSheet$lambda$24($edited$delegate, !Intrinsics.areEqual(AddOrEditSkillBottomSheet$lambda$8($name$delegate), it));
        }
        $name$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$82$lambda$81$lambda$62$lambda$56$lambda$55 */
    public static final Unit m391x93d977f7(MutableState $edited$delegate, MutableState $description$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!AddOrEditSkillBottomSheet$lambda$23($edited$delegate)) {
            AddOrEditSkillBottomSheet$lambda$24($edited$delegate, !Intrinsics.areEqual(AddOrEditSkillBottomSheet$lambda$11($description$delegate), it));
        }
        $description$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$82$lambda$81$lambda$62$lambda$59$lambda$58$lambda$57 */
    public static final Unit m392xab46e0f8(MutableState $edited$delegate, MutableState $instructions$delegate) {
        AddOrEditSkillBottomSheet$lambda$24($edited$delegate, true);
        $instructions$delegate.setValue(CALL_JS_INSTRUCTIONS_TEMPLATE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$82$lambda$81$lambda$62$lambda$61$lambda$60 */
    public static final Unit m393xb3139fab(MutableState $edited$delegate, MutableState $instructions$delegate, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        if (!AddOrEditSkillBottomSheet$lambda$23($edited$delegate)) {
            AddOrEditSkillBottomSheet$lambda$24($edited$delegate, !Intrinsics.areEqual(AddOrEditSkillBottomSheet$lambda$14($instructions$delegate), newText));
        }
        $instructions$delegate.setValue(newText);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$82$lambda$81$lambda$65$lambda$64 */
    public static final Unit m394x6de7dcde(MutableState $selectedScript$delegate, String it) {
        $selectedScript$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$82$lambda$81$lambda$67$lambda$66 */
    public static final Unit m395x97b14262(SnapshotStateMap $scriptContents, MutableState $selectedScript$delegate, MutableState $edited$delegate) {
        $scriptContents.put(DEFAULT_SCRIPT_NAME, "");
        $selectedScript$delegate.setValue(DEFAULT_SCRIPT_NAME);
        AddOrEditSkillBottomSheet$lambda$24($edited$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$82$lambda$81$lambda$69$lambda$68 */
    public static final Unit m396xc17aa7e6(SnapshotStateMap $scriptContents, MutableState $edited$delegate, String name, String content) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        if (!AddOrEditSkillBottomSheet$lambda$23($edited$delegate)) {
            AddOrEditSkillBottomSheet$lambda$24($edited$delegate, !Intrinsics.areEqual($scriptContents.get(name), content));
        }
        $scriptContents.put(name, content);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$82$lambda$81$lambda$71$lambda$70 */
    public static final Unit m397x2206b754(SnapshotStateMap $scriptContents, MutableState $selectedScript$delegate, MutableState $edited$delegate, String scriptName) {
        Intrinsics.checkNotNullParameter(scriptName, "scriptName");
        $scriptContents.put(scriptName, "");
        $selectedScript$delegate.setValue(scriptName);
        AddOrEditSkillBottomSheet$lambda$24($edited$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$82$lambda$81$lambda$74$lambda$73 */
    public static final Unit m398xe0b4cf9a(SnapshotStateMap $scriptContents, MutableState $selectedScript$delegate, MutableState $skill$delegate, SkillManagerViewModel $skillManagerViewModel, MutableState $edited$delegate, String scriptName) {
        Intrinsics.checkNotNullParameter(scriptName, "scriptName");
        $scriptContents.remove(scriptName);
        if (Intrinsics.areEqual(AddOrEditSkillBottomSheet$lambda$43($selectedScript$delegate), scriptName)) {
            $selectedScript$delegate.setValue((String) CollectionsKt.firstOrNull($scriptContents.keySet()));
        }
        Skill curSkill = AddOrEditSkillBottomSheet$lambda$5($skill$delegate);
        if (curSkill != null) {
            $skillManagerViewModel.deleteSkillScript(curSkill, scriptName);
        }
        AddOrEditSkillBottomSheet$lambda$24($edited$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$82$lambda$81$lambda$76$lambda$75 */
    public static final Unit m399xa7e351e(MutableState $llmPromptGeneratorRequirements$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $llmPromptGeneratorRequirements$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$82$lambda$81$lambda$78$lambda$77 */
    public static final Unit m400x34479aa2(MutableState $llmPromptGeneratorInputData$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $llmPromptGeneratorInputData$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$82$lambda$81$lambda$80$lambda$79 */
    public static final Unit m401x94d3a9fb(MutableState $llmPromptGeneratorOutputData$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $llmPromptGeneratorOutputData$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$91$lambda$84$lambda$83 */
    public static final Unit m402xdb0bbe24(CoroutineScope $scope, MutableState $cancelClicked$delegate, SheetState $sheetState, Function0 $onDismiss) {
        AddOrEditSkillBottomSheet$lambda$3($cancelClicked$delegate, true);
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new C2423x2ce95c65($sheetState, $onDismiss, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$91$lambda$86$lambda$85 */
    public static final Unit m403x4d523a8(CoroutineScope $scope, MutableState $edited$delegate, MutableState $showDiscardDialog$delegate, MutableState $cancelClicked$delegate, SheetState $sheetState, Function0 $onDismiss) {
        if (AddOrEditSkillBottomSheet$lambda$23($edited$delegate)) {
            AddOrEditSkillBottomSheet$lambda$27($showDiscardDialog$delegate, true);
        } else {
            AddOrEditSkillBottomSheet$lambda$3($cancelClicked$delegate, true);
            BuildersKt__Builders_commonKt.launch$default($scope, null, null, new C2424x2cf773e6($sheetState, $onDismiss, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$91$lambda$90$lambda$89 */
    public static final Unit m404x8f2a9885(SkillManagerViewModel $skillManagerViewModel, int $skillIndex, SnapshotStateMap $scriptContents, MutableState $name$delegate, MutableState $description$delegate, MutableState $instructions$delegate, final Function0 $onDismiss, final Function0 $onSuccess, final MutableState $errorMessage$delegate, final MutableState $showErrorDialog$delegate) {
        $skillManagerViewModel.saveSkillEdit($skillIndex, AddOrEditSkillBottomSheet$lambda$8($name$delegate), AddOrEditSkillBottomSheet$lambda$11($description$delegate), AddOrEditSkillBottomSheet$lambda$14($instructions$delegate), $scriptContents, new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddOrEditSkillBottomSheetKt.m405xbe122f9d($onDismiss, $onSuccess);
            }
        }, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda57
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddOrEditSkillBottomSheetKt.m406xbe122f9e($errorMessage$delegate, $showErrorDialog$delegate, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$91$lambda$90$lambda$89$lambda$88 */
    public static final Unit m406xbe122f9e(MutableState $errorMessage$delegate, MutableState $showErrorDialog$delegate, String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        $errorMessage$delegate.setValue(error);
        AddOrEditSkillBottomSheet$lambda$18($showErrorDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddOrEditSkillBottomSheet$lambda$94$lambda$93$lambda$92$lambda$91$lambda$90$lambda$89$lambda$87 */
    public static final Unit m405xbe122f9d(Function0 $onDismiss, Function0 $onSuccess) {
        $onDismiss.invoke();
        $onSuccess.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddOrEditSkillBottomSheet$lambda$96$lambda$95(MutableState $showErrorDialog$delegate) {
        AddOrEditSkillBottomSheet$lambda$18($showErrorDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddOrEditSkillBottomSheet$lambda$100(MutableState $errorMessage$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C428@16833L18:AddOrEditSkillBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(496867412, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheet.<anonymous> (AddOrEditSkillBottomSheet.kt:428)");
            }
            TextKt.m4781TextNvy7gAk(AddOrEditSkillBottomSheet$lambda$20($errorMessage$delegate), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddOrEditSkillBottomSheet$lambda$99(final MutableState $showErrorDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C430@16904L27,430@16887L83:AddOrEditSkillBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-957326727, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheet.<anonymous> (AddOrEditSkillBottomSheet.kt:430)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -867982412, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$99$lambda$98$lambda$97($showErrorDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.m10431getLambda$1141225335$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddOrEditSkillBottomSheet$lambda$99$lambda$98$lambda$97(MutableState $showErrorDialog$delegate) {
        AddOrEditSkillBottomSheet$lambda$18($showErrorDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddOrEditSkillBottomSheet$lambda$102$lambda$101(MutableState $showDiscardDialog$delegate) {
        AddOrEditSkillBottomSheet$lambda$27($showDiscardDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddOrEditSkillBottomSheet$lambda$105(final CoroutineScope $scope, final SheetState $sheetState, final Function0 $onDismiss, final MutableState $cancelClicked$delegate, final MutableState $showDiscardDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C442@17310L183,452@17600L12,451@17541L143,441@17282L474:AddOrEditSkillBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-293347792, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheet.<anonymous> (AddOrEditSkillBottomSheet.kt:441)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1560614823, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($scope) | $composer.changed($sheetState) | $composer.changed($onDismiss);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda52
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$105$lambda$104$lambda$103($scope, $cancelClicked$delegate, $sheetState, $onDismiss, $showDiscardDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) it$iv, null, false, null, ButtonDefaults.INSTANCE.m3587buttonColorsro_MJ88(ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11231getErrorTextColor0d7_KjU(), Color.INSTANCE.m6952getWhite0d7_KjU(), 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 48, 12), null, null, null, null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.m10440getLambda$926250944$app_debug(), $composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddOrEditSkillBottomSheet$lambda$105$lambda$104$lambda$103(CoroutineScope $scope, MutableState $cancelClicked$delegate, SheetState $sheetState, Function0 $onDismiss, MutableState $showDiscardDialog$delegate) {
        AddOrEditSkillBottomSheet$lambda$3($cancelClicked$delegate, true);
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$7$1$1$1($sheetState, $onDismiss, null), 3, null);
        AddOrEditSkillBottomSheet$lambda$27($showDiscardDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddOrEditSkillBottomSheet$lambda$108(final MutableState $showDiscardDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C460@17819L29,460@17798L111:AddOrEditSkillBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2071117678, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheet.<anonymous> (AddOrEditSkillBottomSheet.kt:460)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1774231531, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$108$lambda$107$lambda$106($showDiscardDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.getLambda$1338509841$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddOrEditSkillBottomSheet$lambda$108$lambda$107$lambda$106(MutableState $showDiscardDialog$delegate) {
        AddOrEditSkillBottomSheet$lambda$27($showDiscardDialog$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void ScriptsTabContent(final CoroutineScope scope, final Map<String, String> map, final String selectedScript, final Function1<? super String, Unit> function1, final Function0<Unit> function0, final Function2<? super String, ? super String, Unit> function2, final Function1<? super String, Unit> function12, final Function1<? super String, Unit> function13, final String curDescription, final String requirements, final Function1<? super String, Unit> function14, final String inputData, final Function1<? super String, Unit> function15, final String outputData, final Function1<? super String, Unit> function16, final SnackbarHostState snackbarHostState, Modifier modifier, Composer $composer, final int $changed, final int $changed1, final int i) {
        int $dirty1;
        Composer $composer2;
        int $dirty;
        Modifier modifier2;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        final MutableState showAddScriptDialog$delegate;
        final MutableState showDeleteConfirmation$delegate;
        Function0<ComposeUiNode> function04;
        final MutableState showGenerateLlmPromptBottomSheet$delegate;
        final CoroutineScope coroutineScope;
        MutableState showGenerateLlmPromptBottomSheet$delegate2;
        MutableState showDeleteConfirmation$delegate2;
        Object value$iv;
        final Function2<? super String, ? super String, Unit> function22;
        final MutableState newScriptName$delegate;
        final MutableState showDeleteConfirmation$delegate3;
        Function0<ComposeUiNode> function05;
        Composer $composer3 = $composer.startRestartGroup(528299486);
        ComposerKt.sourceInformation($composer3, "C(ScriptsTabContent)P(13,14,15,10,3,8,7,9!1,12,6!1,4,11,5,16)491@18743L65,492@18838L34,493@18905L34,494@18982L34,495@19040L31,496@19105L7,498@19171L62,498@19116L117:AddOrEditSkillBottomSheet.kt#41d64j");
        int $dirty2 = $changed;
        int $dirty12 = $changed1;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changedInstance(scope) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(map) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changed(selectedScript) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer3.changedInstance(function1) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty2 |= $composer3.changedInstance(function0) ? 16384 : 8192;
        }
        if (($changed & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty2 |= $composer3.changedInstance(function2) ? 131072 : 65536;
        }
        if (($changed & 1572864) == 0) {
            $dirty2 |= $composer3.changedInstance(function12) ? 1048576 : 524288;
        }
        if (($changed & 12582912) == 0) {
            $dirty2 |= $composer3.changedInstance(function13) ? 8388608 : 4194304;
        }
        if (($changed & 100663296) == 0) {
            $dirty2 |= $composer3.changed(curDescription) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (($changed & 805306368) == 0) {
            $dirty2 |= $composer3.changed(requirements) ? 536870912 : 268435456;
        }
        if (($changed1 & 6) == 0) {
            $dirty12 |= $composer3.changedInstance(function14) ? 4 : 2;
        }
        if (($changed1 & 48) == 0) {
            $dirty12 |= $composer3.changed(inputData) ? 32 : 16;
        }
        if (($changed1 & 384) == 0) {
            $dirty12 |= $composer3.changedInstance(function15) ? 256 : 128;
        }
        if (($changed1 & 3072) == 0) {
            $dirty12 |= $composer3.changed(outputData) ? 2048 : 1024;
        }
        if (($changed1 & 24576) == 0) {
            $dirty12 |= $composer3.changedInstance(function16) ? 16384 : 8192;
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty12 |= $composer3.changed(snackbarHostState) ? 131072 : 65536;
        }
        int i2 = i & 65536;
        if (i2 != 0) {
            $dirty12 |= 1572864;
        } else if (($changed1 & 1572864) == 0) {
            $dirty12 |= $composer3.changed(modifier) ? 1048576 : 524288;
        }
        if ($composer3.shouldExecute((($dirty2 & 306783379) == 306783378 && (599187 & $dirty12) == 599186) ? false : true, $dirty2 & 1)) {
            Modifier.Companion modifier3 = i2 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(528299486, $dirty2, $dirty12, "com.google.ai.edge.gallery.customtasks.agentchat.ScriptsTabContent (AddOrEditSkillBottomSheet.kt:489)");
            }
            final List scripts = CollectionsKt.toList(map.keySet());
            ComposerKt.sourceInformationMarkerStart($composer3, 889689567, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object value$iv2 = $composer3.rememberedValue();
            if (value$iv2 == Composer.INSTANCE.getEmpty()) {
                Object it$iv = (String) map.get(selectedScript);
                if (it$iv == null) {
                    it$iv = "";
                }
                value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(it$iv, null, 2, null);
                $composer3.updateRememberedValue(value$iv2);
            }
            MutableState scriptContent$delegate = (MutableState) value$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 889692576, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv2 = $composer3.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                $dirty1 = $dirty12;
                Object value$iv3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv3);
                it$iv2 = value$iv3;
            } else {
                $dirty1 = $dirty12;
            }
            MutableState showAddScriptDialog$delegate2 = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 889694720, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object value$iv4 = $composer3.rememberedValue();
            if (value$iv4 == Composer.INSTANCE.getEmpty()) {
                value$iv4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv4);
            }
            MutableState showDeleteConfirmation$delegate4 = (MutableState) value$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 889697184, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object value$iv5 = $composer3.rememberedValue();
            if (value$iv5 == Composer.INSTANCE.getEmpty()) {
                value$iv5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv5);
            }
            MutableState showGenerateLlmPromptBottomSheet$delegate3 = (MutableState) value$iv5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 889699037, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object value$iv6 = $composer3.rememberedValue();
            if (value$iv6 == Composer.INSTANCE.getEmpty()) {
                value$iv6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(value$iv6);
            }
            MutableState newScriptName$delegate2 = (MutableState) value$iv6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ProvidableCompositionLocal<Clipboard> localClipboard = CompositionLocalsKt.getLocalClipboard();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localClipboard);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Clipboard clipboard = (Clipboard) objConsume;
            Map map2 = MapsKt.toMap(map);
            ComposerKt.sourceInformationMarkerStart($composer3, 889703260, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            boolean invalid$iv = (($dirty2 & 896) == 256) | $composer3.changedInstance(map);
            Object it$iv3 = $composer3.rememberedValue();
            if (invalid$iv || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv7 = (Function2) new AddOrEditSkillBottomSheetKt$ScriptsTabContent$1$1(map, selectedScript, scriptContent$delegate, null);
                $composer3.updateRememberedValue(value$iv7);
                it$iv3 = value$iv7;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(selectedScript, map2, (Function2) it$iv3, $composer3, ($dirty2 >> 6) & 14);
            if (map.isEmpty()) {
                $composer3.startReplaceGroup(1811187533);
                ComposerKt.sourceInformation($composer3, "506@19364L205");
                Modifier modifier$iv$iv = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
                modifier2 = modifier3;
                ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
                int $changed$iv$iv = (48 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv$iv);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function05 = constructor;
                    $composer3.createNode(function05);
                } else {
                    function05 = constructor;
                    $composer3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer3);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = ($changed$iv$iv$iv >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i4 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -972548301, "C507@19448L115:AddOrEditSkillBottomSheet.kt#41d64j");
                ButtonKt.FilledTonalButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.m10436getLambda$594487925$app_debug(), $composer3, (($dirty2 >> 12) & 14) | 805306368, 510);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
                coroutineScope = scope;
                $dirty = $dirty2;
                $composer2 = $composer3;
                showGenerateLlmPromptBottomSheet$delegate2 = showGenerateLlmPromptBottomSheet$delegate3;
                showDeleteConfirmation$delegate2 = showDeleteConfirmation$delegate4;
                showAddScriptDialog$delegate = showAddScriptDialog$delegate2;
            } else {
                modifier2 = modifier3;
                $composer3.startReplaceGroup(1811591804);
                ComposerKt.sourceInformation($composer3, "514@19652L4030");
                Modifier modifier$iv = PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(16), 1, null);
                ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
                MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, ((6 >> 3) & 14) | ((6 >> 3) & 112));
                int $changed$iv$iv2 = (6 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
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
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = ($changed$iv$iv$iv2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i6 = ((6 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -1113065501, "C516@19744L1686,563@21438L41,565@21487L1816,618@23311L40,624@23493L149,621@23383L293:AddOrEditSkillBottomSheet.kt#41d64j");
                Modifier modifier$iv2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getSpaceBetween();
                ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                int $changed$iv$iv3 = (438 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
                int $dirty3 = $dirty2;
                ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function03 = constructor3;
                    $composer3.createNode(function03);
                } else {
                    function03 = constructor3;
                    $composer3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer3);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
                int i7 = ($changed$iv$iv$iv3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                int i8 = ((438 >> 6) & 112) | 6;
                RowScope $this$ScriptsTabContent_u24lambda_u24155_u24lambda_u24146 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer3, 626823402, "C521@19941L34,524@20068L24,526@20146L835,522@19984L997,550@20991L39,553@21083L30,553@21062L158,558@21276L33,558@21255L167:AddOrEditSkillBottomSheet.kt#41d64j");
                ComposerKt.sourceInformationMarkerStart($composer3, -672517502, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                Object value$iv8 = $composer3.rememberedValue();
                if (value$iv8 == Composer.INSTANCE.getEmpty()) {
                    value$iv8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    $composer3.updateRememberedValue(value$iv8);
                }
                final MutableState expanded$delegate = (MutableState) value$iv8;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                boolean zScriptsTabContent$lambda$155$lambda$146$lambda$128 = ScriptsTabContent$lambda$155$lambda$146$lambda$128(expanded$delegate);
                ComposerKt.sourceInformationMarkerStart($composer3, -672513448, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                Object value$iv9 = $composer3.rememberedValue();
                if (value$iv9 == Composer.INSTANCE.getEmpty()) {
                    value$iv9 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda32
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$155$lambda$146$lambda$131$lambda$130(expanded$delegate, ((Boolean) obj).booleanValue());
                        }
                    };
                    $composer3.updateRememberedValue(value$iv9);
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ExposedDropdownMenuKt.ExposedDropdownMenuBox(zScriptsTabContent$lambda$155$lambda$146$lambda$128, (Function1) value$iv9, RowScope.weight$default($this$ScriptsTabContent_u24lambda_u24155_u24lambda_u24146, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(-85959606, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$155$lambda$146$lambda$141(selectedScript, expanded$delegate, scripts, function1, (ExposedDropdownMenuBoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer3, 54), $composer3, 3120, 0);
                SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(8)), $composer3, 6);
                ComposerKt.sourceInformationMarkerStart($composer3, -672480962, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                Object it$iv4 = $composer3.rememberedValue();
                if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                    showAddScriptDialog$delegate = showAddScriptDialog$delegate2;
                    Object value$iv10 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda43
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$155$lambda$146$lambda$143$lambda$142(showAddScriptDialog$delegate);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv10);
                    it$iv4 = value$iv10;
                } else {
                    showAddScriptDialog$delegate = showAddScriptDialog$delegate2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                IconButtonKt.IconButton((Function0) it$iv4, null, false, null, null, null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.m10437getLambda$601021886$app_debug(), $composer3, 1572870, 62);
                ComposerKt.sourceInformationMarkerStart($composer3, -672474783, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                Object it$iv5 = $composer3.rememberedValue();
                if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                    showDeleteConfirmation$delegate = showDeleteConfirmation$delegate4;
                    Object value$iv11 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda45
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$155$lambda$146$lambda$145$lambda$144(showDeleteConfirmation$delegate);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv11);
                    it$iv5 = value$iv11;
                } else {
                    showDeleteConfirmation$delegate = showDeleteConfirmation$delegate4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                IconButtonKt.IconButton((Function0) it$iv5, null, false, null, null, null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.m10435getLambda$2147320405$app_debug(), $composer3, 1572870, 62);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                SpacerKt.Spacer(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(24)), $composer3, 6);
                Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier modifier$iv3 = Modifier.INSTANCE;
                Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.getStart();
                MeasurePolicy measurePolicy$iv4 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                int $changed$iv$iv4 = (384 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                CompositionLocalMap localMap$iv$iv4 = $composer3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv4 = (($changed$iv$iv4 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function04 = constructor4;
                    $composer3.createNode(function04);
                } else {
                    function04 = constructor4;
                    $composer3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer3);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
                int i9 = ($changed$iv$iv$iv4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i10 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, 115293499, "C568@21639L43,567@21600L628,585@22238L39,589@22369L391,588@22330L965:AddOrEditSkillBottomSheet.kt#41d64j");
                ComposerKt.sourceInformationMarkerStart($composer3, -1104659916, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                Object value$iv12 = $composer3.rememberedValue();
                if (value$iv12 == Composer.INSTANCE.getEmpty()) {
                    showGenerateLlmPromptBottomSheet$delegate = showGenerateLlmPromptBottomSheet$delegate3;
                    value$iv12 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda46
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$155$lambda$151$lambda$148$lambda$147(showGenerateLlmPromptBottomSheet$delegate);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv12);
                } else {
                    showGenerateLlmPromptBottomSheet$delegate = showGenerateLlmPromptBottomSheet$delegate3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ButtonKt.FilledTonalButton((Function0) value$iv12, SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(32)), false, null, null, null, null, SkillManagerBottomSheetKt.getBUTTON_CONTENT_PADDING(), null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.getLambda$1329521079$app_debug(), $composer3, 817889334, 380);
                SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(8)), $composer3, 6);
                ComposerKt.sourceInformationMarkerStart($composer3, -1104636208, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                coroutineScope = scope;
                $composer2 = $composer3;
                $dirty = $dirty3;
                showGenerateLlmPromptBottomSheet$delegate2 = showGenerateLlmPromptBottomSheet$delegate;
                showDeleteConfirmation$delegate2 = showDeleteConfirmation$delegate;
                boolean invalid$iv2 = $composer2.changedInstance(coroutineScope) | $composer2.changedInstance(clipboard) | (($dirty & 896) == 256) | (($dirty & 458752) == 131072);
                Object it$iv6 = $composer3.rememberedValue();
                if (invalid$iv2 || it$iv6 == Composer.INSTANCE.getEmpty()) {
                    function22 = function2;
                    value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda47
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$155$lambda$151$lambda$150$lambda$149(coroutineScope, clipboard, selectedScript, function22);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv);
                } else {
                    value$iv = it$iv6;
                    function22 = function2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ButtonKt.FilledTonalButton((Function0) value$iv, SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(32)), false, null, null, null, null, SkillManagerBottomSheetKt.getBUTTON_CONTENT_PADDING(), null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.getLambda$3761120$app_debug(), $composer3, 817889328, 380);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                SpacerKt.Spacer(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(8)), $composer3, 6);
                String strScriptsTabContent$lambda$111 = ScriptsTabContent$lambda$111(scriptContent$delegate);
                ComposerKt.sourceInformationMarkerStart($composer3, -1282715143, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                boolean invalid$iv3 = (($dirty & 896) == 256) | (($dirty & 458752) == 131072);
                Object it$iv7 = $composer3.rememberedValue();
                if (invalid$iv3 || it$iv7 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv13 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda48
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$155$lambda$154$lambda$153(selectedScript, function22, (String) obj);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv13);
                    it$iv7 = value$iv13;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                CursorTrackingTextFieldKt.m10471CursorTrackingTextFieldf8ukHw(null, null, strScriptsTabContent$lambda$111, (Function1) it$iv7, null, false, 16, 0.0f, true, null, $composer3, 102236160, 691);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer2.endReplaceGroup();
            }
            if (ScriptsTabContent$lambda$114(showAddScriptDialog$delegate)) {
                $composer2.startReplaceGroup(1815564764);
                ComposerKt.sourceInformation($composer2, "637@23782L31,655@24446L382,668@24852L131,639@23889L533,636@23744L1246");
                ComposerKt.sourceInformationMarkerStart($composer2, 889850781, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                Composer $this$cache$iv = $composer2;
                Object it$iv8 = $this$cache$iv.rememberedValue();
                if (it$iv8 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv14 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda49
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$157$lambda$156(showAddScriptDialog$delegate);
                        }
                    };
                    $this$cache$iv.updateRememberedValue(value$iv14);
                    it$iv8 = value$iv14;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                newScriptName$delegate = newScriptName$delegate2;
                AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0((Function0) it$iv8, ComposableLambdaKt.rememberComposableLambda(796581780, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$160(function12, map, newScriptName$delegate, showAddScriptDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(822727574, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$163(showAddScriptDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.getLambda$848873368$app_debug(), ComposableLambdaKt.rememberComposableLambda(-1285537383, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$167(map, newScriptName$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772598, 0, 16276);
            } else {
                newScriptName$delegate = newScriptName$delegate2;
                $composer2.startReplaceGroup(1791976740);
            }
            $composer2.endReplaceGroup();
            if (ScriptsTabContent$lambda$117(showDeleteConfirmation$delegate2)) {
                $composer2.startReplaceGroup(1816862579);
                ComposerKt.sourceInformation($composer2, "679@25102L34,682@25314L456,697@25794L134,681@25228L62,678@25064L871");
                ComposerKt.sourceInformationMarkerStart($composer2, 889893024, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                Composer $this$cache$iv2 = $composer2;
                Object it$iv9 = $this$cache$iv2.rememberedValue();
                if (it$iv9 == Composer.INSTANCE.getEmpty()) {
                    showDeleteConfirmation$delegate3 = showDeleteConfirmation$delegate2;
                    Object value$iv15 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda35
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$169$lambda$168(showDeleteConfirmation$delegate3);
                        }
                    };
                    $this$cache$iv2.updateRememberedValue(value$iv15);
                    it$iv9 = value$iv15;
                } else {
                    showDeleteConfirmation$delegate3 = showDeleteConfirmation$delegate2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0((Function0) it$iv9, ComposableLambdaKt.rememberComposableLambda(1997723123, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$173(selectedScript, function13, showDeleteConfirmation$delegate3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(2023868917, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$176(showDeleteConfirmation$delegate3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.getLambda$2050014711$app_debug(), ComposableLambdaKt.rememberComposableLambda(-84396040, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$177(selectedScript, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772598, 0, 16276);
            } else {
                showDeleteConfirmation$delegate3 = showDeleteConfirmation$delegate2;
                $composer2.startReplaceGroup(1791976740);
            }
            $composer2.endReplaceGroup();
            if (ScriptsTabContent$lambda$120(showGenerateLlmPromptBottomSheet$delegate2)) {
                $composer2.startReplaceGroup(1817810807);
                ComposerKt.sourceInformation($composer2, "707@26051L46,716@26427L44,717@26502L223,708@26102L630");
                final String promptCopiedMessage = StringResources_androidKt.stringResource(C2421R.string.prompt_copied_message, $composer2, 0);
                ComposerKt.sourceInformationMarkerStart($composer2, 889935434, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                Composer $this$cache$iv3 = $composer2;
                Object it$iv10 = $this$cache$iv3.rememberedValue();
                if (it$iv10 == Composer.INSTANCE.getEmpty()) {
                    final MutableState newScriptName$delegate3 = showGenerateLlmPromptBottomSheet$delegate2;
                    Object value$iv16 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda39
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$179$lambda$178(newScriptName$delegate3);
                        }
                    };
                    $this$cache$iv3.updateRememberedValue(value$iv16);
                    it$iv10 = value$iv16;
                }
                Function0 function06 = (Function0) it$iv10;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 889938013, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                boolean invalid$iv4 = $composer2.changedInstance(coroutineScope) | (($dirty1 & 458752) == 131072) | $composer2.changed(promptCopiedMessage);
                Composer $this$cache$iv4 = $composer2;
                Object it$iv11 = $this$cache$iv4.rememberedValue();
                if (invalid$iv4 || it$iv11 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv17 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda40
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$181$lambda$180(coroutineScope, snackbarHostState, promptCopiedMessage, (String) obj);
                        }
                    };
                    $this$cache$iv4.updateRememberedValue(value$iv17);
                    it$iv11 = value$iv17;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                GenerateLlmPromptBottomSheetKt.GenerateLlmPromptBottomSheet(curDescription, requirements, function14, inputData, function15, outputData, function16, function06, (Function1) it$iv11, $composer2, (($dirty >> 24) & 14) | 12582912 | (($dirty >> 24) & 112) | (($dirty1 << 6) & 896) | (($dirty1 << 6) & 7168) | (($dirty1 << 6) & 57344) | (($dirty1 << 6) & 458752) | (($dirty1 << 6) & 3670016));
            } else {
                $composer2.startReplaceGroup(1791976740);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $dirty1 = $dirty12;
            $composer2 = $composer3;
            $dirty = $dirty2;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$182(scope, map, selectedScript, function1, function0, function2, function12, function13, curDescription, requirements, function14, inputData, function15, outputData, function16, snackbarHostState, modifier4, $changed, $changed1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String ScriptsTabContent$lambda$111(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean ScriptsTabContent$lambda$114(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ScriptsTabContent$lambda$115(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ScriptsTabContent$lambda$117(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ScriptsTabContent$lambda$118(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ScriptsTabContent$lambda$120(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ScriptsTabContent$lambda$121(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String ScriptsTabContent$lambda$123(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean ScriptsTabContent$lambda$155$lambda$146$lambda$128(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ScriptsTabContent$lambda$155$lambda$146$lambda$129(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$155$lambda$146$lambda$131$lambda$130(MutableState $expanded$delegate, boolean it) {
        ScriptsTabContent$lambda$155$lambda$146$lambda$129($expanded$delegate, !ScriptsTabContent$lambda$155$lambda$146$lambda$128($expanded$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$155$lambda$146$lambda$141(String $selectedScript, final MutableState $expanded$delegate, final List $scripts, final Function1 $onScriptSelected, ExposedDropdownMenuBoxScope ExposedDropdownMenuBox, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(ExposedDropdownMenuBox, "$this$ExposedDropdownMenuBox");
        ComposerKt.sourceInformation($composer, "C529@20247L2,532@20377L65,527@20158L441,537@20670L20,537@20692L279,537@20610L361:AddOrEditSkillBottomSheet.kt#41d64j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer.changed(ExposedDropdownMenuBox) : $composer.changedInstance(ExposedDropdownMenuBox) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-85959606, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ScriptsTabContent.<anonymous>.<anonymous>.<anonymous> (AddOrEditSkillBottomSheet.kt:527)");
            }
            String str = $selectedScript == null ? "" : $selectedScript;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ExposedDropdownMenuBoxScope.m3962menuAnchor2Hz36ac$default(ExposedDropdownMenuBox, Modifier.INSTANCE, ExposedDropdownMenuAnchorType.INSTANCE.m3957getPrimaryEditableoYjWRB4(), false, 2, null), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, -1002799508, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AddOrEditSkillBottomSheetKt.m407x21531626((String) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) it$iv, modifierFillMaxWidth$default, false, true, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.m10433getLambda$1771676432$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(84129267, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$155$lambda$146$lambda$141$lambda$134($expanded$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 806903856, 0, 0, 8388008);
            boolean zScriptsTabContent$lambda$155$lambda$146$lambda$128 = ScriptsTabContent$lambda$155$lambda$146$lambda$128($expanded$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1002785954, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv2 = $composer.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddOrEditSkillBottomSheetKt.m408x38680646($expanded$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ExposedDropdownMenuBox.m3964ExposedDropdownMenuvNxi1II(zScriptsTabContent$lambda$155$lambda$146$lambda$128, (Function0) it$iv2, null, null, false, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1328556084, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$155$lambda$146$lambda$141$lambda$140($scripts, $onScriptSelected, $expanded$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 48, (ExposedDropdownMenuBoxScope.$stable << 3) | 6 | (($dirty2 << 3) & 112), PointerIconCompat.TYPE_GRAB);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ScriptsTabContent$lambda$155$lambda$146$lambda$141$lambda$133$lambda$132 */
    public static final Unit m407x21531626(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$155$lambda$146$lambda$141$lambda$134(MutableState $expanded$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C532@20407L33:AddOrEditSkillBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(84129267, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ScriptsTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddOrEditSkillBottomSheet.kt:532)");
            }
            ExposedDropdownMenuDefaults.INSTANCE.TrailingIcon(ScriptsTabContent$lambda$155$lambda$146$lambda$128($expanded$delegate), null, $composer, ExposedDropdownMenuDefaults.$stable << 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ScriptsTabContent$lambda$155$lambda$146$lambda$141$lambda$136$lambda$135 */
    public static final Unit m408x38680646(MutableState $expanded$delegate) {
        ScriptsTabContent$lambda$155$lambda$146$lambda$129($expanded$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$155$lambda$146$lambda$141$lambda$140(List $scripts, final Function1 $onScriptSelected, final MutableState $expanded$delegate, ColumnScope ExposedDropdownMenu, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(ExposedDropdownMenu, "$this$ExposedDropdownMenu");
        ComposerKt.sourceInformation($composer, "C*540@20787L16,541@20831L97,539@20746L199:AddOrEditSkillBottomSheet.kt#41d64j");
        boolean z = true;
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1328556084, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ScriptsTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddOrEditSkillBottomSheet.kt:538)");
            }
            Iterator it = $scripts.iterator();
            while (it.hasNext()) {
                final String script = (String) it.next();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1981499942, z, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddOrEditSkillBottomSheetKt.m409xf8c12c8f(script, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer, 54);
                ComposerKt.sourceInformationMarkerStart($composer, -1137105267, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
                boolean invalid$iv = $composer.changed($onScriptSelected) | $composer.changed(script);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddOrEditSkillBottomSheetKt.m410xf0cc55ec($onScriptSelected, script, $expanded$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) it$iv, null, null, null, false, null, null, null, $composer, 6, 508);
                z = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ScriptsTabContent$lambda$155$lambda$146$lambda$141$lambda$140$lambda$137 */
    public static final Unit m409xf8c12c8f(String $script, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C540@20789L12:AddOrEditSkillBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1981499942, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ScriptsTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddOrEditSkillBottomSheet.kt:540)");
            }
            TextKt.m4781TextNvy7gAk($script, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ScriptsTabContent$lambda$155$lambda$146$lambda$141$lambda$140$lambda$139$lambda$138 */
    public static final Unit m410xf0cc55ec(Function1 $onScriptSelected, String $script, MutableState $expanded$delegate) {
        $onScriptSelected.invoke($script);
        ScriptsTabContent$lambda$155$lambda$146$lambda$129($expanded$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$155$lambda$146$lambda$143$lambda$142(MutableState $showAddScriptDialog$delegate) {
        ScriptsTabContent$lambda$115($showAddScriptDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$155$lambda$146$lambda$145$lambda$144(MutableState $showDeleteConfirmation$delegate) {
        ScriptsTabContent$lambda$118($showDeleteConfirmation$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$155$lambda$151$lambda$148$lambda$147(MutableState $showGenerateLlmPromptBottomSheet$delegate) {
        ScriptsTabContent$lambda$121($showGenerateLlmPromptBottomSheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$155$lambda$151$lambda$150$lambda$149(CoroutineScope $scope, Clipboard $clipboard, String $selectedScript, Function2 $onScriptChanged) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new AddOrEditSkillBottomSheetKt$ScriptsTabContent$3$2$2$1$1($clipboard, $selectedScript, $onScriptChanged, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$155$lambda$154$lambda$153(String $selectedScript, Function2 $onScriptChanged, String newContent) {
        Intrinsics.checkNotNullParameter(newContent, "newContent");
        if ($selectedScript != null) {
            $onScriptChanged.invoke($selectedScript, newContent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$157$lambda$156(MutableState $showAddScriptDialog$delegate) {
        ScriptsTabContent$lambda$115($showAddScriptDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$167(final Map $scriptContents, final MutableState $newScriptName$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C642@23977L22,645@24157L246,640@23899L515:AddOrEditSkillBottomSheet.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1285537383, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ScriptsTabContent.<anonymous> (AddOrEditSkillBottomSheet.kt:640)");
            }
            String strScriptsTabContent$lambda$123 = ScriptsTabContent$lambda$123($newScriptName$delegate);
            boolean zContainsKey = $scriptContents.containsKey(ScriptsTabContent$lambda$123($newScriptName$delegate));
            ComposerKt.sourceInformationMarkerStart($composer, 1549159023, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda60
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$167$lambda$165$lambda$164($newScriptName$delegate, (String) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strScriptsTabContent$lambda$123, (Function1<? super String, Unit>) it$iv, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.getLambda$359502131$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1163087872, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda61
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$167$lambda$166($scriptContents, $newScriptName$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), zContainsKey, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 1572912, 384, 0, 8376252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$167$lambda$165$lambda$164(MutableState $newScriptName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $newScriptName$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$167$lambda$166(Map $scriptContents, MutableState $newScriptName$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:AddOrEditSkillBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1163087872, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ScriptsTabContent.<anonymous>.<anonymous> (AddOrEditSkillBottomSheet.kt:646)");
            }
            if ($scriptContents.containsKey(ScriptsTabContent$lambda$123($newScriptName$delegate))) {
                $composer.startReplaceGroup(2049683797);
                ComposerKt.sourceInformation($composer, "648@24256L47,649@24343L11,647@24234L143");
                TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.duplicated_script_name, $composer, 0), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262138);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(2025653186);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$160(final Function1 $onScriptAdded, Map $scriptContents, final MutableState $newScriptName$delegate, final MutableState $showAddScriptDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C657@24484L174,656@24456L364:AddOrEditSkillBottomSheet.kt#41d64j");
        boolean z = false;
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(796581780, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ScriptsTabContent.<anonymous> (AddOrEditSkillBottomSheet.kt:656)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1010913282, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            boolean invalid$iv = $composer.changed($onScriptAdded);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda53
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$160$lambda$159$lambda$158($onScriptAdded, $newScriptName$delegate, $showAddScriptDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            Function0 function0 = (Function0) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (!$scriptContents.containsKey(ScriptsTabContent$lambda$123($newScriptName$delegate)) && !StringsKt.isBlank(ScriptsTabContent$lambda$123($newScriptName$delegate))) {
                z = true;
            }
            ButtonKt.Button(function0, null, z, null, null, null, null, null, null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.m10434getLambda$1831007356$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$160$lambda$159$lambda$158(Function1 $onScriptAdded, MutableState $newScriptName$delegate, MutableState $showAddScriptDialog$delegate) {
        String trimmedName = StringsKt.trim((CharSequence) ScriptsTabContent$lambda$123($newScriptName$delegate)).toString();
        $onScriptAdded.invoke(trimmedName);
        $newScriptName$delegate.setValue("");
        ScriptsTabContent$lambda$115($showAddScriptDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$163(final MutableState $showAddScriptDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C669@24883L31,669@24862L113:AddOrEditSkillBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(822727574, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ScriptsTabContent.<anonymous> (AddOrEditSkillBottomSheet.kt:669)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 367217173, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda54
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$163$lambda$162$lambda$161($showAddScriptDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.getLambda$2554131$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$163$lambda$162$lambda$161(MutableState $showAddScriptDialog$delegate) {
        ScriptsTabContent$lambda$115($showAddScriptDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$169$lambda$168(MutableState $showDeleteConfirmation$delegate) {
        ScriptsTabContent$lambda$118($showDeleteConfirmation$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$177(String $selectedScript, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C681@25230L58:AddOrEditSkillBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-84396040, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ScriptsTabContent.<anonymous> (AddOrEditSkillBottomSheet.kt:681)");
            }
            TextKt.m4781TextNvy7gAk("Are you sure you want to delete '" + $selectedScript + "'?", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$173(final String $selectedScript, final Function1 $onScriptDeleted, final MutableState $showDeleteConfirmation$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C684@25352L148,690@25607L12,689@25548L143,683@25324L438:AddOrEditSkillBottomSheet.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1997723123, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ScriptsTabContent.<anonymous> (AddOrEditSkillBottomSheet.kt:683)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -38458745, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            boolean invalid$iv = $composer.changed($selectedScript) | $composer.changed($onScriptDeleted);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$173$lambda$172$lambda$171($selectedScript, $onScriptDeleted, $showDeleteConfirmation$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) it$iv, null, false, null, ButtonDefaults.INSTANCE.m3587buttonColorsro_MJ88(ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11231getErrorTextColor0d7_KjU(), Color.INSTANCE.m6952getWhite0d7_KjU(), 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 48, 12), null, null, null, null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.m10438getLambda$629866013$app_debug(), $composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$173$lambda$172$lambda$171(String $selectedScript, Function1 $onScriptDeleted, MutableState $showDeleteConfirmation$delegate) {
        if ($selectedScript != null) {
            $onScriptDeleted.invoke($selectedScript);
        }
        ScriptsTabContent$lambda$118($showDeleteConfirmation$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$176(final MutableState $showDeleteConfirmation$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C698@25825L34,698@25804L116:AddOrEditSkillBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2023868917, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ScriptsTabContent.<anonymous> (AddOrEditSkillBottomSheet.kt:698)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -682154825, "CC(remember):AddOrEditSkillBottomSheet.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$$ExternalSyntheticLambda59
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddOrEditSkillBottomSheetKt.ScriptsTabContent$lambda$176$lambda$175$lambda$174($showDeleteConfirmation$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$AddOrEditSkillBottomSheetKt.INSTANCE.getLambda$1203695474$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$176$lambda$175$lambda$174(MutableState $showDeleteConfirmation$delegate) {
        ScriptsTabContent$lambda$118($showDeleteConfirmation$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$179$lambda$178(MutableState $showGenerateLlmPromptBottomSheet$delegate) {
        ScriptsTabContent$lambda$121($showGenerateLlmPromptBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScriptsTabContent$lambda$181$lambda$180(CoroutineScope $scope, SnackbarHostState $snackbarHostState, String $promptCopiedMessage, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new AddOrEditSkillBottomSheetKt$ScriptsTabContent$13$1$1($snackbarHostState, $promptCopiedMessage, null), 3, null);
        return Unit.INSTANCE;
    }
}
