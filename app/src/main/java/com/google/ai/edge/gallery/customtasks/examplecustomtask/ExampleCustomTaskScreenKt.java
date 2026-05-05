package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.google.ai.edge.gallery.data.ConfigKey;
import com.google.ai.edge.gallery.data.NumberSliderConfig;
import com.google.ai.edge.gallery.data.ValueType;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: ExampleCustomTaskScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002"}, m922d2 = {"EXAMPLE_CUSTOM_TASK_CONFIG_KEY_FONT_SIZE", "Lcom/google/ai/edge/gallery/data/ConfigKey;", "getEXAMPLE_CUSTOM_TASK_CONFIG_KEY_FONT_SIZE", "()Lcom/google/ai/edge/gallery/data/ConfigKey;", "EXAMPLE_CUSTOM_TASK_CONFIG_KEY_MAX_CHAR_COUNT", "getEXAMPLE_CUSTOM_TASK_CONFIG_KEY_MAX_CHAR_COUNT", "EXAMPLE_CUSTOM_TASK_CONFIGS", "", "Lcom/google/ai/edge/gallery/data/NumberSliderConfig;", "getEXAMPLE_CUSTOM_TASK_CONFIGS", "()Ljava/util/List;", "ExampleCustomTaskScreen", "", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "viewModel", "Lcom/google/ai/edge/gallery/customtasks/examplecustomtask/ExampleCustomTaskViewModel;", "(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lcom/google/ai/edge/gallery/customtasks/examplecustomtask/ExampleCustomTaskViewModel;Landroidx/compose/runtime/Composer;II)V", "app_debug", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "uiState", "Lcom/google/ai/edge/gallery/customtasks/examplecustomtask/ExampleCustomTaskUiState;", "fontSize", ""}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ExampleCustomTaskScreenKt {
    private static final ConfigKey EXAMPLE_CUSTOM_TASK_CONFIG_KEY_FONT_SIZE = new ConfigKey("font_size", "Font size");
    private static final ConfigKey EXAMPLE_CUSTOM_TASK_CONFIG_KEY_MAX_CHAR_COUNT = new ConfigKey("max_char_count", "Max character count");
    private static final List<NumberSliderConfig> EXAMPLE_CUSTOM_TASK_CONFIGS = CollectionsKt.listOf((Object[]) new NumberSliderConfig[]{new NumberSliderConfig(EXAMPLE_CUSTOM_TASK_CONFIG_KEY_FONT_SIZE, 8.0f, 24.0f, 14.0f, ValueType.INT, false), new NumberSliderConfig(EXAMPLE_CUSTOM_TASK_CONFIG_KEY_MAX_CHAR_COUNT, 100.0f, 2000.0f, 2000.0f, ValueType.INT, true)});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExampleCustomTaskScreen$lambda$13(ModelManagerViewModel modelManagerViewModel, ExampleCustomTaskViewModel exampleCustomTaskViewModel, int i, int i2, Composer composer, int i3) {
        ExampleCustomTaskScreen(modelManagerViewModel, exampleCustomTaskViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final ConfigKey getEXAMPLE_CUSTOM_TASK_CONFIG_KEY_FONT_SIZE() {
        return EXAMPLE_CUSTOM_TASK_CONFIG_KEY_FONT_SIZE;
    }

    public static final ConfigKey getEXAMPLE_CUSTOM_TASK_CONFIG_KEY_MAX_CHAR_COUNT() {
        return EXAMPLE_CUSTOM_TASK_CONFIG_KEY_MAX_CHAR_COUNT;
    }

    public static final List<NumberSliderConfig> getEXAMPLE_CUSTOM_TASK_CONFIGS() {
        return EXAMPLE_CUSTOM_TASK_CONFIGS;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ExampleCustomTaskScreen(final com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel r126, com.google.ai.edge.gallery.customtasks.examplecustomtask.ExampleCustomTaskViewModel r127, androidx.compose.runtime.Composer r128, final int r129, final int r130) {
        /*
            Method dump skipped, instruction units count: 2758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.examplecustomtask.ExampleCustomTaskScreenKt.ExampleCustomTaskScreen(com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, com.google.ai.edge.gallery.customtasks.examplecustomtask.ExampleCustomTaskViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final ModelManagerUiState ExampleCustomTaskScreen$lambda$0(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    private static final ExampleCustomTaskUiState ExampleCustomTaskScreen$lambda$1(State<ExampleCustomTaskUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ExampleCustomTaskUiState) thisObj$iv;
    }

    private static final int ExampleCustomTaskScreen$lambda$3(MutableIntState $fontSize$delegate) {
        MutableIntState $this$getValue$iv = $fontSize$delegate;
        return $this$getValue$iv.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExampleCustomTaskScreen$lambda$11$lambda$9$lambda$7$lambda$6(ExampleCustomTaskViewModel $viewModel, long $color) {
        $viewModel.m10505updateTextColor8_81llA($color);
        return Unit.INSTANCE;
    }
}
