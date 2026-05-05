package com.google.ai.edge.gallery.ui.common;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.res.VectorResources_androidKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.RuntimeType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.modelitem.StatusIconKt;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.ui.theme.TypeKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelPicker.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\bX\u008a\u008e\u0002"}, m922d2 = {"ModelPicker", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "onModelSelected", "Lkotlin/Function1;", "Lcom/google/ai/edge/gallery/data/Model;", "(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_debug", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "showMemoryWarning", "", "modelToPick"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ModelPickerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelPicker$lambda$19(Task task, ModelManagerViewModel modelManagerViewModel, Function1 function1, int i, Composer composer, int i2) {
        ModelPicker(task, modelManagerViewModel, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ModelPicker(final Task task, final ModelManagerViewModel modelManagerViewModel, final Function1<? super Model, Unit> function1, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        final MutableState showMemoryWarning$delegate;
        Composer $composer3;
        Composer $composer4;
        Composer $composer$iv;
        Object obj;
        Iterator<Model> it;
        String str;
        Composer $composer5;
        long jM6950getTransparent0d7_KjU;
        Function0<ComposeUiNode> function03;
        Function0<ComposeUiNode> function04;
        String str2;
        String str3;
        String str4;
        Composer $composer6;
        Composer $composer$iv$iv$iv;
        Composer $composer$iv$iv;
        Composer $composer$iv$iv$iv2;
        Composer $composer$iv$iv2;
        Composer $composer$iv2;
        Composer $composer$iv3;
        Composer $composer7;
        Composer $composer8;
        final Function1<? super Model, Unit> onModelSelected = function1;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(onModelSelected, "onModelSelected");
        Composer $composer9 = $composer.startRestartGroup(584427712);
        ComposerKt.sourceInformation($composer9, "C(ModelPicker)P(2)67@2814L16,68@2858L34,69@2914L41,70@2985L7,72@2996L2869:ModelPicker.kt#t7sjiu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer9.changedInstance(task) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer9.changedInstance(modelManagerViewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer9.changedInstance(onModelSelected) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if ($composer9.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(584427712, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.ModelPicker (ModelPicker.kt:66)");
            }
            State modelManagerUiState$delegate = SnapshotStateKt.collectAsState(modelManagerViewModel.getUiState(), null, $composer9, 0, 1);
            String str5 = "CC(remember):ModelPicker.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart($composer9, -1005677022, "CC(remember):ModelPicker.kt#9igjgp");
            Object it$iv = $composer9.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer9.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableState showMemoryWarning$delegate2 = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer9);
            ComposerKt.sourceInformationMarkerStart($composer9, -1005675223, "CC(remember):ModelPicker.kt#9igjgp");
            Object it$iv2 = $composer9.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer9.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableState modelToPick$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer9);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer9, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer9.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer9);
            Context context = (Context) objConsume;
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 7, null);
            ComposerKt.sourceInformationMarkerStart($composer9, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer9, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            int $changed$iv$iv = (6 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer9, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer9, 0));
            CompositionLocalMap localMap$iv$iv = $composer9.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer9, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer9, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer9.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer9.startReusableNode();
            if ($composer9.getInserting()) {
                function0 = constructor;
                $composer9.createNode(function0);
            } else {
                function0 = constructor;
                $composer9.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer9);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer9, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i2 = ((6 >> 6) & 112) | 6;
            Composer $composer10 = $composer9;
            ComposerKt.sourceInformationMarkerStart($composer10, -2051248946, "C74@3066L637:ModelPicker.kt#t7sjiu");
            Composer $composer$iv4 = $composer9;
            Modifier modifier$iv2 = PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 0.0f, C1654Dp.m9788constructorimpl(4), 0.0f, C1654Dp.m9788constructorimpl(4), 5, null);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer10, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer10, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            int $changed$iv$iv2 = (438 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer10, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer10, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer10.getCurrentCompositionLocalMap();
            String str6 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer10, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            String str7 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart($composer10, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer10.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer10.startReusableNode();
            if ($composer10.getInserting()) {
                function02 = constructor2;
                $composer10.createNode(function02);
            } else {
                function02 = constructor2;
                $composer10.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer10);
            String str8 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            Composer $composer11 = $composer9;
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer10, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer10, 1071378371, "C81@3386L29,79@3287L213,88@3619L10,89@3659L29,85@3507L190:ModelPicker.kt#t7sjiu");
            ImageVector icon = task.getIcon();
            if (icon == null) {
                $composer10.startReplaceGroup(-519627855);
                ComposerKt.sourceInformation($composer10, "80@3326L43");
                ImageVector.Companion companion = ImageVector.INSTANCE;
                Integer iconVectorResourceId = task.getIconVectorResourceId();
                Intrinsics.checkNotNull(iconVectorResourceId);
                icon = VectorResources_androidKt.vectorResource(companion, iconVectorResourceId.intValue(), $composer10, 6);
            } else {
                $composer10.startReplaceGroup(-519628630);
            }
            $composer10.endReplaceGroup();
            IconKt.m4075Iconww6aTOc(icon, (String) null, SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), ColorUtilsKt.getTaskIconColor(task, $composer10, $dirty2 & 14), $composer10, 432, 0);
            TextKt.m4781TextNvy7gAk(task.getLabel() + " models", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ColorUtilsKt.getTaskIconColor(task, $composer10, $dirty2 & 14), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer10, MaterialTheme.$stable).getTitleMedium(), $composer10, 48, 0, 131064);
            ComposerKt.sourceInformationMarkerEnd($composer10);
            ComposerKt.sourceInformationMarkerEnd($composer10);
            $composer10.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer10);
            ComposerKt.sourceInformationMarkerEnd($composer10);
            ComposerKt.sourceInformationMarkerEnd($composer10);
            $composer10.startReplaceGroup(2012061183);
            ComposerKt.sourceInformation($composer10, "*101@4032L293,96@3837L2018");
            Iterator<Model> it2 = task.getModels().iterator();
            while (it2.hasNext()) {
                final Model model = it2.next();
                boolean selected = Intrinsics.areEqual(model.getName(), ModelPicker$lambda$0(modelManagerUiState$delegate).getSelectedModel().getName());
                Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer10, 2012069071, str5);
                Composer $composer12 = $composer11;
                boolean invalid$iv = $composer12.changedInstance(context) | $composer12.changedInstance(model) | (($dirty2 & 896) == 256);
                Composer $this$cache$iv = $composer10;
                Object value$iv3 = $this$cache$iv.rememberedValue();
                if (invalid$iv || value$iv3 == Composer.INSTANCE.getEmpty()) {
                    $composer3 = $composer10;
                    final Context context2 = context;
                    $composer4 = $composer12;
                    $composer$iv = $composer$iv4;
                    obj = null;
                    it = it2;
                    str = str5;
                    value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.ModelPickerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ModelPickerKt.ModelPicker$lambda$14$lambda$9$lambda$8(context2, model, function1, modelToPick$delegate, showMemoryWarning$delegate2);
                        }
                    };
                    $this$cache$iv.updateRememberedValue(value$iv3);
                } else {
                    $composer3 = $composer10;
                    $composer4 = $composer12;
                    it = it2;
                    $composer$iv = $composer$iv4;
                    obj = null;
                    str = str5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                Modifier modifierM1401clickableoSLSa3U = ClickableKt.m1401clickableoSLSa3U(modifierFillMaxWidth$default, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) value$iv3);
                if (selected) {
                    $composer5 = $composer3;
                    $composer5.startReplaceGroup(2012080730);
                    ComposerKt.sourceInformation($composer5, "111@4393L11");
                    jM6950getTransparent0d7_KjU = MaterialTheme.INSTANCE.getColorScheme($composer5, MaterialTheme.$stable).getSurfaceContainer();
                    $composer5.endReplaceGroup();
                } else {
                    $composer5 = $composer3;
                    $composer5.startReplaceGroup(2012081621);
                    $composer5.endReplaceGroup();
                    jM6950getTransparent0d7_KjU = Color.INSTANCE.m6950getTransparent0d7_KjU();
                }
                Modifier modifier$iv3 = PaddingKt.m1989paddingVpY3zN4(BackgroundKt.m1359backgroundbw27NRU$default(modifierM1401clickableoSLSa3U, jM6950getTransparent0d7_KjU, null, 2, null), C1654Dp.m9788constructorimpl(16), C1654Dp.m9788constructorimpl(8));
                Arrangement.Horizontal horizontalArrangement$iv2 = spaceBetween;
                Composer $composer$iv5 = $composer5;
                String str9 = str7;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, 844473419, str9);
                MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer$iv5, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                int $changed$iv$iv3 = (432 << 3) & 112;
                String str10 = str6;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, -1159599143, str10);
                int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv5, 0));
                CompositionLocalMap localMap$iv$iv3 = $composer$iv5.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer$iv5, modifier$iv3);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
                Context context3 = context;
                String str11 = str8;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, -553112988, str11);
                if (!($composer$iv5.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv5.startReusableNode();
                if ($composer$iv5.getInserting()) {
                    function03 = constructor3;
                    $composer$iv5.createNode(function03);
                } else {
                    function03 = constructor3;
                    $composer$iv5.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer$iv5);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = ($changed$iv$iv$iv3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                int i6 = ((432 >> 6) & 112) | 6;
                RowScope $this$ModelPicker_u24lambda_u2414_u24lambda_u2413 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, 878292224, "C115@4536L40,116@4585L1041:ModelPicker.kt#t7sjiu");
                SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(24)), $composer$iv5, 6);
                Modifier modifier$iv4 = RowScope.weight$default($this$ModelPicker_u24lambda_u2414_u24lambda_u2413, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer$iv5, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
                Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
                MeasurePolicy measurePolicy$iv4 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer$iv5, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                int $changed$iv$iv4 = (0 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, -1159599143, str10);
                int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv5, 0));
                CompositionLocalMap localMap$iv$iv4 = $composer$iv5.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer$iv5, modifier$iv4);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv4 = (($changed$iv$iv4 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, -553112988, str11);
                if (!($composer$iv5.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv5.startReusableNode();
                if ($composer$iv5.getInserting()) {
                    function04 = constructor4;
                    $composer$iv5.createNode(function04);
                } else {
                    function04 = constructor4;
                    $composer$iv5.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer$iv5);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
                int i7 = ($changed$iv$iv$iv4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int i8 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, -1339476703, "C119@4730L10,117@4636L128:ModelPicker.kt#t7sjiu");
                String displayName = model.getDisplayName();
                if (displayName.length() == 0) {
                    displayName = model.getName();
                }
                TextKt.m4781TextNvy7gAk(displayName, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer$iv5, MaterialTheme.$stable).getBodyMedium(), $composer$iv5, 0, 0, 131070);
                if (model.getRuntimeType() != RuntimeType.AICORE) {
                    $composer$iv5.startReplaceGroup(-1339299880);
                    ComposerKt.sourceInformation($composer$iv5, "122@4834L770");
                    Arrangement.Horizontal horizontalArrangement$iv3 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(4));
                    Alignment.Vertical verticalAlignment$iv3 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart($composer$iv5, 844473419, str9);
                    Modifier modifier$iv5 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicy$iv5 = RowKt.rowMeasurePolicy(horizontalArrangement$iv3, verticalAlignment$iv3, $composer$iv5, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                    int $changed$iv$iv5 = (432 << 3) & 112;
                    ComposerKt.sourceInformationMarkerStart($composer$iv5, -1159599143, str10);
                    int compositeKeyHash$iv$iv5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv5, 0));
                    CompositionLocalMap localMap$iv$iv5 = $composer$iv5.getCurrentCompositionLocalMap();
                    Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier($composer$iv5, modifier$iv5);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    int $changed$iv$iv$iv5 = (($changed$iv$iv5 << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer$iv5, -553112988, str11);
                    if (!($composer$iv5.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer$iv5.startReusableNode();
                    if ($composer$iv5.getInserting()) {
                        $composer$iv5.createNode(constructor5);
                    } else {
                        $composer$iv5.useNode();
                    }
                    Composer $this$Layout_u24lambda_u240$iv$iv5 = Updater.m6165constructorimpl($composer$iv5);
                    str4 = str11;
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, measurePolicy$iv5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, localMap$iv$iv5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv5, Integer.valueOf(compositeKeyHash$iv$iv5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, materialized$iv$iv5, ComposeUiNode.INSTANCE.getSetModifier());
                    int i9 = ($changed$iv$iv$iv5 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer$iv5, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    int i10 = ((432 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer$iv5, -275533821, "C126@4997L173,137@5478L11,131@5185L405:ModelPicker.kt#t7sjiu");
                    $composer6 = $composer$iv5;
                    $composer$iv2 = $composer$iv5;
                    $composer$iv$iv$iv = $composer$iv5;
                    $composer$iv$iv$iv2 = $composer$iv5;
                    str3 = str9;
                    $composer$iv3 = $composer$iv5;
                    $composer$iv$iv = $composer$iv5;
                    $composer$iv$iv2 = $composer$iv5;
                    str2 = str10;
                    StatusIconKt.StatusIcon(task, model, ModelPicker$lambda$0(modelManagerUiState$delegate).getModelDownloadStatus().get(model.getName()), null, $composer$iv5, $dirty2 & 14, 8);
                    TextKt.m4781TextNvy7gAk(model.getLocalFileRelativeDirPathOverride().length() == 0 ? UtilsKt.humanReadableSize$default(model.getSizeInBytes(), false, false, 3, null) : "{ext_file_dir}/" + model.getLocalFileRelativeDirPathOverride(), null, MaterialTheme.INSTANCE.getColorScheme($composer$iv5, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m9205copyp1EtxEg$default(TypeKt.getLabelSmallNarrow(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(10), null, null, null, 0, 0, null, 16646143, null), $composer$iv5, 0, 0, 131066);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                    $composer$iv5.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                    $composer$iv5.endReplaceGroup();
                    $composer7 = $composer$iv5;
                } else {
                    str2 = str10;
                    str3 = str9;
                    str4 = str11;
                    $composer6 = $composer$iv5;
                    $composer$iv$iv$iv = $composer$iv5;
                    $composer$iv$iv = $composer$iv5;
                    $composer$iv$iv$iv2 = $composer$iv5;
                    $composer$iv$iv2 = $composer$iv5;
                    $composer$iv2 = $composer$iv5;
                    $composer$iv3 = $composer$iv5;
                    $composer7 = $composer$iv5;
                    $composer7.startReplaceGroup(-1344106988);
                    $composer7.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd($composer7);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv2);
                $composer$iv$iv$iv2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                if (selected) {
                    $composer8 = $composer6;
                    $composer8.startReplaceGroup(879361816);
                    ComposerKt.sourceInformation($composer8, "147@5783L41,144@5661L176");
                    IconKt.m4075Iconww6aTOc(CheckCircleKt.getCheckCircle(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_selected_icon, $composer8, 0), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), 0L, $composer8, 384, 8);
                } else {
                    $composer8 = $composer6;
                    $composer8.startReplaceGroup(873750878);
                }
                $composer8.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd($composer8);
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                $composer$iv$iv$iv.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                str5 = str;
                $composer10 = $composer5;
                $composer$iv4 = $composer$iv;
                it2 = it;
                context = context3;
                $composer11 = $composer4;
                str8 = str4;
                str7 = str3;
                str6 = str2;
            }
            Composer $composer13 = $composer10;
            String str12 = str5;
            Composer $composer14 = $composer11;
            $composer13.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer13);
            ComposerKt.sourceInformationMarkerEnd($composer9);
            $composer9.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer9);
            ComposerKt.sourceInformationMarkerEnd($composer9);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            if (ModelPicker$lambda$2(showMemoryWarning$delegate2)) {
                $composer2 = $composer14;
                $composer2.startReplaceGroup(-1108199192);
                ComposerKt.sourceInformation($composer2, "156@5938L174,163@6134L29,155@5898L272");
                ComposerKt.sourceInformationMarkerStart($composer2, -1005578322, str12);
                boolean invalid$iv2 = ($dirty2 & 896) == 256;
                Object it$iv3 = $composer2.rememberedValue();
                if (invalid$iv2 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                    onModelSelected = function1;
                    showMemoryWarning$delegate = showMemoryWarning$delegate2;
                    Object value$iv4 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.ModelPickerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ModelPickerKt.ModelPicker$lambda$16$lambda$15(onModelSelected, modelToPick$delegate, showMemoryWarning$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv4);
                    it$iv3 = value$iv4;
                } else {
                    onModelSelected = function1;
                    showMemoryWarning$delegate = showMemoryWarning$delegate2;
                }
                Function0 function05 = (Function0) it$iv3;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -1005572195, str12);
                Object it$iv4 = $composer2.rememberedValue();
                if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv5 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.ModelPickerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ModelPickerKt.ModelPicker$lambda$18$lambda$17(showMemoryWarning$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv5);
                    it$iv4 = value$iv5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                MemoryWarningKt.MemoryWarningAlert(function05, (Function0) it$iv4, $composer2, 48);
            } else {
                onModelSelected = function1;
                $composer2 = $composer14;
                $composer2.startReplaceGroup(-1114053790);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer9;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ModelPickerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ModelPickerKt.ModelPicker$lambda$19(task, modelManagerViewModel, onModelSelected, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final ModelManagerUiState ModelPicker$lambda$0(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    private static final boolean ModelPicker$lambda$2(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ModelPicker$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Model ModelPicker$lambda$5(MutableState<Model> mutableState) {
        MutableState<Model> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelPicker$lambda$14$lambda$9$lambda$8(Context $context, Model $model, Function1 $onModelSelected, MutableState $modelToPick$delegate, MutableState $showMemoryWarning$delegate) {
        if (!MemoryWarningKt.isMemoryLow($context, $model)) {
            $onModelSelected.invoke($model);
        } else {
            $modelToPick$delegate.setValue($model);
            ModelPicker$lambda$3($showMemoryWarning$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelPicker$lambda$16$lambda$15(Function1 $onModelSelected, MutableState $modelToPick$delegate, MutableState $showMemoryWarning$delegate) {
        Model curModelToPick = ModelPicker$lambda$5($modelToPick$delegate);
        if (curModelToPick != null) {
            $onModelSelected.invoke(curModelToPick);
        }
        ModelPicker$lambda$3($showMemoryWarning$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelPicker$lambda$18$lambda$17(MutableState $showMemoryWarning$delegate) {
        ModelPicker$lambda$3($showMemoryWarning$delegate, false);
        return Unit.INSTANCE;
    }
}
