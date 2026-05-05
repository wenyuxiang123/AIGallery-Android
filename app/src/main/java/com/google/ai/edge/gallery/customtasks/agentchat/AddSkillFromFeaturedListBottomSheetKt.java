package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.OpenInNewKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.UriHandler;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.text.style.TextDecoration;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.AllowedSkill;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AddSkillFromFeaturedListBottomSheet.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001aQ\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\nX\u008a\u008e\u0002²\u0006\u0016\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001aX\u008a\u008e\u0002²\u0006\u0010\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, m922d2 = {"AddSkillFromFeatureListBottomSheet", "", "skillManagerViewModel", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;", "onDismiss", "Lkotlin/Function0;", "onSkillAdded", "(Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FeaturedSkillItem", "skill", "Lcom/google/ai/edge/gallery/data/AllowedSkill;", "uriHandler", "Landroidx/compose/ui/platform/UriHandler;", "onAddClick", "Lkotlin/Function1;", "validationError", "", "isAdding", "", "isSkillAdded", "(Lcom/google/ai/edge/gallery/data/AllowedSkill;Landroidx/compose/ui/platform/UriHandler;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;II)V", "app_debug", "searchQuery", "showDisclaimerDialog", "skillToAdd", "skillValidationErrors", "", "validatingSkills", "", "uiState", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class AddSkillFromFeaturedListBottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromFeatureListBottomSheet$lambda$47(SkillManagerViewModel skillManagerViewModel, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AddSkillFromFeatureListBottomSheet(skillManagerViewModel, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeaturedSkillItem$lambda$61(AllowedSkill allowedSkill, UriHandler uriHandler, Function1 function1, String str, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        FeaturedSkillItem(allowedSkill, uriHandler, function1, str, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0357  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AddSkillFromFeatureListBottomSheet(final com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel r53, final kotlin.jvm.functions.Function0<kotlin.Unit> r54, final kotlin.jvm.functions.Function0<kotlin.Unit> r55, androidx.compose.runtime.Composer r56, int r57) {
        /*
            Method dump skipped, instruction units count: 1375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt.AddSkillFromFeatureListBottomSheet(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    private static final String AddSkillFromFeatureListBottomSheet$lambda$1(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean AddSkillFromFeatureListBottomSheet$lambda$4(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void AddSkillFromFeatureListBottomSheet$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final AllowedSkill AddSkillFromFeatureListBottomSheet$lambda$7(MutableState<AllowedSkill> mutableState) {
        MutableState<AllowedSkill> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, String> AddSkillFromFeatureListBottomSheet$lambda$10(MutableState<Map<String, String>> mutableState) {
        MutableState<Map<String, String>> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<String> AddSkillFromFeatureListBottomSheet$lambda$13(MutableState<Set<String>> mutableState) {
        MutableState<Set<String>> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final SkillManagerUiState AddSkillFromFeatureListBottomSheet$lambda$15(State<SkillManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (SkillManagerUiState) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromFeatureListBottomSheet$lambda$23$lambda$22(SkillManagerViewModel $skillManagerViewModel, final MutableState $validatingSkills$delegate, final Function0 $onDismiss, final Function0 $onSkillAdded, final MutableState $skillValidationErrors$delegate, MutableState $skillToAdd$delegate, MutableState $showDisclaimerDialog$delegate, AllowedSkill skill) {
        Intrinsics.checkNotNullParameter(skill, "skill");
        final String url = skill.getSkillUrl();
        if (!AddSkillFromUrlDialogKt.isHostApproved(url)) {
            $skillToAdd$delegate.setValue(skill);
            AddSkillFromFeatureListBottomSheet$lambda$5($showDisclaimerDialog$delegate, true);
        } else {
            $validatingSkills$delegate.setValue(SetsKt.plus(AddSkillFromFeatureListBottomSheet$lambda$13($validatingSkills$delegate), url));
            $skillManagerViewModel.validateAndAddSkillFromUrl(url, new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AddSkillFromFeaturedListBottomSheetKt.AddSkillFromFeatureListBottomSheet$lambda$23$lambda$22$lambda$20(url, $onDismiss, $onSkillAdded, $validatingSkills$delegate);
                }
            }, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AddSkillFromFeaturedListBottomSheetKt.AddSkillFromFeatureListBottomSheet$lambda$23$lambda$22$lambda$21(url, $validatingSkills$delegate, $skillValidationErrors$delegate, (String) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromFeatureListBottomSheet$lambda$23$lambda$22$lambda$20(String $url, Function0 $onDismiss, Function0 $onSkillAdded, MutableState $validatingSkills$delegate) {
        $validatingSkills$delegate.setValue(SetsKt.minus(AddSkillFromFeatureListBottomSheet$lambda$13($validatingSkills$delegate), $url));
        $onDismiss.invoke();
        $onSkillAdded.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromFeatureListBottomSheet$lambda$23$lambda$22$lambda$21(String $url, MutableState $validatingSkills$delegate, MutableState $skillValidationErrors$delegate, String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        $validatingSkills$delegate.setValue(SetsKt.minus(AddSkillFromFeatureListBottomSheet$lambda$13($validatingSkills$delegate), $url));
        $skillValidationErrors$delegate.setValue(MapsKt.plus(AddSkillFromFeatureListBottomSheet$lambda$10($skillValidationErrors$delegate), TuplesKt.m929to($url, error)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromFeatureListBottomSheet$lambda$39(final List $filteredSkills, final UriHandler $uriHandler, final Function1 $handleAddSkill, final Set $addedSkillNames, final CoroutineScope $scope, final SheetState $sheetState, final Function0 $onDismiss, State $uiState$delegate, MutableState $searchQuery$delegate, final MutableState $skillValidationErrors$delegate, final MutableState $validatingSkills$delegate, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        Composer $composer2;
        final MutableState mutableState;
        Function0<ComposeUiNode> function04;
        Function0<ComposeUiNode> function05;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C138@5668L3799:AddSkillFromFeaturedListBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(632110285, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeatureListBottomSheet.<anonymous> (AddSkillFromFeaturedListBottomSheet.kt:138)");
            }
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 7, null);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i2 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1878095626, "C140@5823L895:AddSkillFromFeaturedListBottomSheet.kt#41d64j");
            Modifier modifier$iv2 = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 7, null);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            int $changed$iv$iv2 = (390 << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i4 = ((390 >> 6) & 112) | 6;
            RowScope $this$AddSkillFromFeatureListBottomSheet_u24lambda_u2439_u24lambda_u2438_u24lambda_u2427 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 261828983, "C144@5969L417,157@6478L112,155@6395L315:AddSkillFromFeaturedListBottomSheet.kt#41d64j");
            Modifier modifier$iv3 = RowScope.weight$default($this$AddSkillFromFeatureListBottomSheet_u24lambda_u2439_u24lambda_u2438_u24lambda_u2427, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
            int $changed$iv$iv$iv3 = ((0 >> 3) & 14) | ((0 >> 3) & 112);
            MeasurePolicy measurePolicy$iv3 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer, $changed$iv$iv$iv3);
            int $changed$iv$iv3 = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer, modifier$iv3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv4 = (($changed$iv$iv3 << 6) & 896) | 6;
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
            int i5 = ($changed$iv$iv$iv4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1675530270, "C146@6045L46,147@6127L10,145@6020L141,150@6190L52,151@6278L10,152@6335L11,149@6172L204:AddSkillFromFeaturedListBottomSheet.kt#41d64j");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.featured_skills_title, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 0, 0, 131070);
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.featured_skills_description, $composer, 0), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 131066);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifierM1992paddingqDBjuR0$default = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(3), 0.0f, 11, null);
            ComposerKt.sourceInformationMarkerStart($composer, -130085577, "CC(remember):AddSkillFromFeaturedListBottomSheet.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($scope) | $composer.changed($sheetState) | $composer.changed($onDismiss);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddSkillFromFeaturedListBottomSheetKt.m411xe76f7d6e($scope, $sheetState, $onDismiss);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) it$iv, modifierM1992paddingqDBjuR0$default, false, null, null, null, ComposableSingletons$AddSkillFromFeaturedListBottomSheetKt.INSTANCE.m10449getLambda$946276027$app_debug(), $composer, 1572912, 60);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (AddSkillFromFeatureListBottomSheet$lambda$15($uiState$delegate).getLoadingSkillAllowlist()) {
                $composer.startReplaceGroup(1879060779);
                ComposerKt.sourceInformation($composer, "172@6902L546");
                Modifier modifier$iv4 = PaddingKt.m1990paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1654Dp.m9788constructorimpl(16), 1, null);
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
                MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
                int $changed$iv$iv4 = (6 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap localMap$iv$iv4 = $composer.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer, modifier$iv4);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int $i$f$Box = $changed$iv$iv4 << 6;
                int $changed$iv$iv$iv5 = ($i$f$Box & 896) | 6;
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
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
                int i7 = ($changed$iv$iv$iv5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                int i8 = ((6 >> 6) & 112) | 6;
                BoxScope $this$AddSkillFromFeatureListBottomSheet_u24lambda_u2439_u24lambda_u2438_u24lambda_u2429 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 688308181, "C173@6980L458:AddSkillFromFeaturedListBottomSheet.kt#41d64j");
                Modifier modifier$iv5 = $this$AddSkillFromFeatureListBottomSheet_u24lambda_u2439_u24lambda_u2438_u24lambda_u2429.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
                Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv5 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                int $changed$iv$iv5 = (432 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap localMap$iv$iv5 = $composer.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier($composer, modifier$iv5);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv6 = (($changed$iv$iv5 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function05 = constructor5;
                    $composer.createNode(function05);
                } else {
                    function05 = constructor5;
                    $composer.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv5 = Updater.m6165constructorimpl($composer);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, measurePolicy$iv5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, localMap$iv$iv5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv5, Integer.valueOf(compositeKeyHash$iv$iv5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, materialized$iv$iv5, ComposeUiNode.INSTANCE.getSetModifier());
                int i9 = ($changed$iv$iv$iv6 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i10 = ((432 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 362855825, "C178@7192L78,180@7303L49,181@7390L10,179@7283L143:AddSkillFromFeaturedListBottomSheet.kt#41d64j");
                ProgressIndicatorKt.m4356CircularProgressIndicator4lLiAd8(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(20)), 0L, C1654Dp.m9788constructorimpl(2), 0L, 0, 0.0f, $composer, 390, 58);
                TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.loading_skills_allowlist, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 131070);
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
                $composer.endReplaceGroup();
                $composer2 = $composer;
            } else if (AddSkillFromFeatureListBottomSheet$lambda$15($uiState$delegate).getSkillAllowlistError() != null) {
                $composer2 = $composer;
                $composer2.startReplaceGroup(1879727403);
                ComposerKt.sourceInformation($composer2, "190@7670L10,191@7725L11,188@7584L226");
                String skillAllowlistError = AddSkillFromFeatureListBottomSheet$lambda$15($uiState$delegate).getSkillAllowlistError();
                Intrinsics.checkNotNull(skillAllowlistError);
                TextKt.m4781TextNvy7gAk(skillAllowlistError, PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(16), 1, null), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer2, 48, 0, 131064);
                $composer2.endReplaceGroup();
            } else {
                $composer2 = $composer;
                $composer2.startReplaceGroup(1880018586);
                ComposerKt.sourceInformation($composer2, "213@8635L195,198@7946L20,203@8262L293,196@7878L963,221@8975L478,221@8913L540");
                String strAddSkillFromFeatureListBottomSheet$lambda$1 = AddSkillFromFeatureListBottomSheet$lambda$1($searchQuery$delegate);
                Modifier modifierM1992paddingqDBjuR0$default2 = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, C1654Dp.m9788constructorimpl(16), 5, null);
                RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
                TextFieldColors textFieldColorsM4752colors0hiis_0 = TextFieldDefaults.INSTANCE.m4752colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, Color.INSTANCE.m6950getTransparent0d7_KjU(), Color.INSTANCE.m6950getTransparent0d7_KjU(), Color.INSTANCE.m6950getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer2, 0, 3504, 0, 0, 3072, 2147469311, 4095);
                ComposerKt.sourceInformationMarkerStart($composer2, -770635945, "CC(remember):AddSkillFromFeaturedListBottomSheet.kt#9igjgp");
                Object it$iv2 = $composer2.rememberedValue();
                if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                    mutableState = $searchQuery$delegate;
                    Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AddSkillFromFeaturedListBottomSheetKt.m412xb886b844(mutableState, (String) obj);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv2);
                    it$iv2 = value$iv2;
                } else {
                    mutableState = $searchQuery$delegate;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                TextFieldKt.TextField(strAddSkillFromFeatureListBottomSheet$lambda$1, (Function1<? super String, Unit>) it$iv2, modifierM1992paddingqDBjuR0$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$AddSkillFromFeaturedListBottomSheetKt.INSTANCE.m10447getLambda$1741954078$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$AddSkillFromFeaturedListBottomSheetKt.INSTANCE.getLambda$681151489$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1190710240, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddSkillFromFeaturedListBottomSheetKt.AddSkillFromFeatureListBottomSheet$lambda$39$lambda$38$lambda$34(mutableState, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) circleShape, textFieldColorsM4752colors0hiis_0, $composer2, 918552624, 12582912, 0, 1965176);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart($composer2, -770602559, "CC(remember):AddSkillFromFeaturedListBottomSheet.kt#9igjgp");
                boolean invalid$iv2 = $composer2.changedInstance($filteredSkills) | $composer2.changedInstance($uriHandler) | $composer2.changed($handleAddSkill) | $composer2.changedInstance($addedSkillNames);
                Object value$iv3 = $composer2.rememberedValue();
                if (invalid$iv2 || value$iv3 == Composer.INSTANCE.getEmpty()) {
                    value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AddSkillFromFeaturedListBottomSheetKt.m414x35e2e8d0($filteredSkills, $uriHandler, $handleAddSkill, $addedSkillNames, $skillValidationErrors$delegate, $validatingSkills$delegate, (LazyListScope) obj);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv3);
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                LazyDslKt.LazyColumn(null, null, null, false, horizontalOrVerticalM1843spacedBy0680j_4, null, null, false, null, (Function1) value$iv3, $composer2, 24576, 495);
                $composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddSkillFromFeatureListBottomSheet$lambda$39$lambda$38$lambda$27$lambda$26$lambda$25 */
    public static final Unit m411xe76f7d6e(CoroutineScope $scope, SheetState $sheetState, Function0 $onDismiss) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new C2425x66e9efb6($sheetState, $onDismiss, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddSkillFromFeatureListBottomSheet$lambda$39$lambda$38$lambda$31$lambda$30 */
    public static final Unit m412xb886b844(MutableState $searchQuery$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchQuery$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromFeatureListBottomSheet$lambda$39$lambda$38$lambda$34(final MutableState $searchQuery$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:AddSkillFromFeaturedListBottomSheet.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1190710240, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeatureListBottomSheet.<anonymous>.<anonymous>.<anonymous> (AddSkillFromFeaturedListBottomSheet.kt:205)");
            }
            if (StringsKt.trim((CharSequence) AddSkillFromFeatureListBottomSheet$lambda$1($searchQuery$delegate)).toString().length() > 0) {
                $composer.startReplaceGroup(-313738143);
                ComposerKt.sourceInformation($composer, "206@8419L20,206@8398L131");
                ComposerKt.sourceInformationMarkerStart($composer, -1811234860, "CC(remember):AddSkillFromFeaturedListBottomSheet.kt#9igjgp");
                Object it$iv = $composer.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddSkillFromFeaturedListBottomSheetKt.m413x912de4c2($searchQuery$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) it$iv, null, false, null, null, null, ComposableSingletons$AddSkillFromFeaturedListBottomSheetKt.INSTANCE.getLambda$1273490439$app_debug(), $composer, 1572870, 62);
            } else {
                $composer.startReplaceGroup(-322059070);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddSkillFromFeatureListBottomSheet$lambda$39$lambda$38$lambda$34$lambda$33$lambda$32 */
    public static final Unit m413x912de4c2(MutableState $searchQuery$delegate) {
        $searchQuery$delegate.setValue("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddSkillFromFeatureListBottomSheet$lambda$39$lambda$38$lambda$37$lambda$36 */
    public static final Unit m414x35e2e8d0(final List $filteredSkills, final UriHandler $uriHandler, final Function1 $handleAddSkill, final Set $addedSkillNames, final MutableState $skillValidationErrors$delegate, final MutableState $validatingSkills$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 contentType$iv = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$AddSkillFromFeatureListBottomSheet$lambda$39$lambda$38$lambda$37$lambda$36$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((AllowedSkill) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(AllowedSkill allowedSkill) {
                return null;
            }
        };
        LazyColumn.items($filteredSkills.size(), null, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$AddSkillFromFeatureListBottomSheet$lambda$39$lambda$38$lambda$37$lambda$36$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return contentType$iv.invoke($filteredSkills.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$AddSkillFromFeatureListBottomSheet$lambda$39$lambda$38$lambda$37$lambda$36$$inlined$items$default$4
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
                AllowedSkill skill = (AllowedSkill) $filteredSkills.get(it);
                $composer.startReplaceGroup(-81083139);
                ComposerKt.sourceInformation($composer, "C*224@9104L327:AddSkillFromFeaturedListBottomSheet.kt#41d64j");
                String validationError = (String) AddSkillFromFeaturedListBottomSheetKt.AddSkillFromFeatureListBottomSheet$lambda$10($skillValidationErrors$delegate).get(skill.getSkillUrl());
                AddSkillFromFeaturedListBottomSheetKt.FeaturedSkillItem(skill, $uriHandler, $handleAddSkill, validationError, AddSkillFromFeaturedListBottomSheetKt.AddSkillFromFeatureListBottomSheet$lambda$13($validatingSkills$delegate).contains(skill.getSkillUrl()), $addedSkillNames.contains(skill.getName()), $composer, (($dirty & 14) >> 3) & 14, 0);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromFeatureListBottomSheet$lambda$41$lambda$40(MutableState $showDisclaimerDialog$delegate, MutableState $skillToAdd$delegate) {
        AddSkillFromFeatureListBottomSheet$lambda$5($showDisclaimerDialog$delegate, false);
        $skillToAdd$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromFeatureListBottomSheet$lambda$46$lambda$45(MutableState $skillToAdd$delegate, SkillManagerViewModel $skillManagerViewModel, final MutableState $validatingSkills$delegate, final Function0 $onDismiss, final Function0 $onSkillAdded, final MutableState $skillValidationErrors$delegate, MutableState $showDisclaimerDialog$delegate) {
        AllowedSkill skill = AddSkillFromFeatureListBottomSheet$lambda$7($skillToAdd$delegate);
        if (skill != null) {
            final String url = skill.getSkillUrl();
            $validatingSkills$delegate.setValue(SetsKt.plus(AddSkillFromFeatureListBottomSheet$lambda$13($validatingSkills$delegate), url));
            $skillManagerViewModel.validateAndAddSkillFromUrl(url, new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AddSkillFromFeaturedListBottomSheetKt.m415x2917373f(url, $onDismiss, $onSkillAdded, $validatingSkills$delegate);
                }
            }, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AddSkillFromFeaturedListBottomSheetKt.m416x29173740(url, $validatingSkills$delegate, $skillValidationErrors$delegate, (String) obj);
                }
            });
        }
        AddSkillFromFeatureListBottomSheet$lambda$5($showDisclaimerDialog$delegate, false);
        $skillToAdd$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddSkillFromFeatureListBottomSheet$lambda$46$lambda$45$lambda$44$lambda$42 */
    public static final Unit m415x2917373f(String $url, Function0 $onDismiss, Function0 $onSkillAdded, MutableState $validatingSkills$delegate) {
        $validatingSkills$delegate.setValue(SetsKt.minus(AddSkillFromFeatureListBottomSheet$lambda$13($validatingSkills$delegate), $url));
        $onDismiss.invoke();
        $onSkillAdded.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddSkillFromFeatureListBottomSheet$lambda$46$lambda$45$lambda$44$lambda$43 */
    public static final Unit m416x29173740(String $url, MutableState $validatingSkills$delegate, MutableState $skillValidationErrors$delegate, String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        $validatingSkills$delegate.setValue(SetsKt.minus(AddSkillFromFeatureListBottomSheet$lambda$13($validatingSkills$delegate), $url));
        $skillValidationErrors$delegate.setValue(MapsKt.plus(AddSkillFromFeatureListBottomSheet$lambda$10($skillValidationErrors$delegate), TuplesKt.m929to($url, error)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FeaturedSkillItem(final AllowedSkill skill, final UriHandler uriHandler, final Function1<? super AllowedSkill, Unit> function1, String validationError, boolean isAdding, boolean isSkillAdded, Composer $composer, final int $changed, final int i) {
        String str;
        boolean isAdding2;
        boolean isSkillAdded2;
        String validationError2;
        boolean isAdding3;
        boolean isSkillAdded3;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        boolean z;
        Composer $composer$iv$iv$iv;
        String str2;
        Composer $composer$iv;
        Function0<ComposeUiNode> function03;
        String str3;
        Composer $composer2;
        Function0<ComposeUiNode> function04;
        Composer $composer3 = $composer.startRestartGroup(-1069722734);
        ComposerKt.sourceInformation($composer3, "C(FeaturedSkillItem)P(3,4,2,5)284@10915L11,280@10782L3505:AddSkillFromFeaturedListBottomSheet.kt#41d64j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(skill) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(uriHandler) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            str = validationError;
        } else if (($changed & 3072) == 0) {
            str = validationError;
            $dirty |= $composer3.changed(str) ? 2048 : 1024;
        } else {
            str = validationError;
        }
        int i3 = i & 16;
        if (i3 != 0) {
            $dirty |= 24576;
            isAdding2 = isAdding;
        } else if (($changed & 24576) == 0) {
            isAdding2 = isAdding;
            $dirty |= $composer3.changed(isAdding2) ? 16384 : 8192;
        } else {
            isAdding2 = isAdding;
        }
        int i4 = i & 32;
        if (i4 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f249xf2722a21;
            isSkillAdded2 = isSkillAdded;
        } else if ((196608 & $changed) == 0) {
            isSkillAdded2 = isSkillAdded;
            $dirty |= $composer3.changed(isSkillAdded2) ? 131072 : 65536;
        } else {
            isSkillAdded2 = isSkillAdded;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            String validationError3 = i2 != 0 ? null : str;
            if (i3 != 0) {
                isAdding2 = false;
            }
            if (i4 != 0) {
                isSkillAdded2 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1069722734, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.FeaturedSkillItem (AddSkillFromFeaturedListBottomSheet.kt:279)");
            }
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default(BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(20))), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceContainerLowest(), null, 2, null), 0.0f, C1654Dp.m9788constructorimpl(12), 1, null), C1654Dp.m9788constructorimpl(16), 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 10, null);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getTop();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            int $changed$iv$iv = (384 << 3) & 112;
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
            isSkillAdded3 = isSkillAdded2;
            isAdding3 = isAdding2;
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i6 = ((384 >> 6) & 112) | 6;
            RowScope $this$FeaturedSkillItem_u24lambda_u2460 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -470882382, "C289@11080L1843,347@12947L1336:AddSkillFromFeaturedListBottomSheet.kt#41d64j");
            Modifier modifier$iv2 = RowScope.weight$default($this$FeaturedSkillItem_u24lambda_u2460, Modifier.INSTANCE, 1.0f, false, 2, null);
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
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i8 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1606295899, "C291@11180L10,291@11141L92,330@12501L10,331@12553L11,328@12438L202:AddSkillFromFeaturedListBottomSheet.kt#41d64j");
            TextKt.m4781TextNvy7gAk(skill.getName(), null, 0L, null, 0L, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyLarge(), $composer3, 1572864, 0, 131006);
            String label = skill.getAttributionLabel();
            if (label == null) {
                $composer3.startReplaceGroup(1606419494);
                $composer3.endReplaceGroup();
                validationError2 = validationError3;
                str2 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
                str3 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                $composer$iv = $composer3;
                $composer$iv$iv$iv = $composer3;
                $composer2 = $composer3;
                z = true;
            } else {
                $composer3.startReplaceGroup(1606419495);
                ComposerKt.sourceInformation($composer3, "*296@11368L1033");
                String attributionUrl = skill.getAttributionUrl();
                z = true;
                boolean hasUrl = !(attributionUrl == null || StringsKt.isBlank(attributionUrl));
                Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal horizontalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(2));
                Modifier modifier$iv3 = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(2), 0.0f, 0.0f, 13, null);
                Arrangement.Horizontal horizontalArrangement$iv2 = horizontalM1843spacedBy0680j_4;
                $composer$iv$iv$iv = $composer3;
                ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                int $changed$iv$iv3 = (438 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
                str2 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
                Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
                validationError2 = validationError3;
                $composer$iv = $composer3;
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
                str3 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                $composer2 = $composer3;
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
                int i9 = ($changed$iv$iv$iv3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i10 = ((438 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -28719984, "C:AddSkillFromFeaturedListBottomSheet.kt#41d64j");
                if (hasUrl) {
                    $composer3.startReplaceGroup(-28714529);
                    ComposerKt.sourceInformation($composer3, "305@11671L10,306@11738L11,309@11883L56,302@11592L362,315@12149L11,311@11967L216");
                    TextStyle textStyleM9205copyp1EtxEg$default = TextStyle.m9205copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodySmall(), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.getUnderline(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16773118, null);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer3, -1940579726, "CC(remember):AddSkillFromFeaturedListBottomSheet.kt#9igjgp");
                    boolean invalid$iv = (($dirty2 & 14) == 4) | $composer3.changedInstance(uriHandler);
                    Object it$iv = $composer3.rememberedValue();
                    if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                        Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AddSkillFromFeaturedListBottomSheetKt.m417x21f1165e(skill, uriHandler);
                            }
                        };
                        $composer3.updateRememberedValue(value$iv);
                        it$iv = value$iv;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    TextKt.m4781TextNvy7gAk(label, ClickableKt.m1401clickableoSLSa3U(companion, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleM9205copyp1EtxEg$default, $composer3, 0, 0, 131068);
                    IconKt.m4075Iconww6aTOc(OpenInNewKt.getOpenInNew(Icons.AutoMirrored.Outlined.INSTANCE), (String) null, SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(14)), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary(), $composer3, 432, 0);
                    $composer3.endReplaceGroup();
                } else {
                    $composer3.startReplaceGroup(-28109750);
                    ComposerKt.sourceInformation($composer3, "320@12278L10,321@12336L11,318@12215L164");
                    TextKt.m4781TextNvy7gAk(label, null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodySmall(), $composer3, 0, 0, 131066);
                    $composer3.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                Unit unit = Unit.INSTANCE;
                $composer2.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            Composer $composer4 = $composer2;
            TextKt.m4781TextNvy7gAk(skill.getDescription(), PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(12), 0.0f, 0.0f, 13, null), MaterialTheme.INSTANCE.getColorScheme($composer4, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer4, MaterialTheme.$stable).getBodySmall(), $composer4, 48, 0, 131064);
            if (validationError2 == null) {
                $composer4.startReplaceGroup(1607785447);
                $composer4.endReplaceGroup();
            } else {
                $composer4.startReplaceGroup(1607785448);
                ComposerKt.sourceInformation($composer4, "*339@12776L10,340@12830L11,337@12714L195");
                String error = validationError2;
                TextKt.m4781TextNvy7gAk(error, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 0.0f, 13, null), MaterialTheme.INSTANCE.getColorScheme($composer4, MaterialTheme.$stable).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer4, MaterialTheme.$stable).getBodySmall(), $composer4, 48, 0, 131064);
                Unit unit3 = Unit.INSTANCE;
                $composer4.endReplaceGroup();
                Unit unit4 = Unit.INSTANCE;
            }
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            $composer$iv$iv$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifier$iv4 = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.m2022height3ABfNKs(PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(4), 0.0f, 0.0f, 13, null), C1654Dp.m9788constructorimpl(32)), 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 11, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv4 = (6 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, str2);
            int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv4 = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer3, modifier$iv4);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv4 = (($changed$iv$iv4 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, str3);
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
            int i11 = ($changed$iv$iv$iv4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            int i12 = ((6 >> 6) & 112) | 6;
            BoxScope $this$FeaturedSkillItem_u24lambda_u2460_u24lambda_u2459 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 180667936, "C:AddSkillFromFeaturedListBottomSheet.kt#41d64j");
            if (isAdding3) {
                $composer3.startReplaceGroup(180649614);
                ComposerKt.sourceInformation($composer3, "352@13214L11,349@13058L186");
                ProgressIndicatorKt.m4356CircularProgressIndicator4lLiAd8($this$FeaturedSkillItem_u24lambda_u2460_u24lambda_u2459.align(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(24)), Alignment.INSTANCE.getCenter()), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary(), C1654Dp.m9788constructorimpl(2), 0L, 0, 0.0f, $composer3, 384, 56);
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(180883199);
                ComposerKt.sourceInformation($composer3, "");
                if (isSkillAdded3) {
                    $composer3.startReplaceGroup(180891817);
                    ComposerKt.sourceInformation($composer3, "357@13339L20,356@13298L379");
                    PaddingValues button_content_padding = SkillManagerBottomSheetKt.getBUTTON_CONTENT_PADDING();
                    ComposerKt.sourceInformationMarkerStart($composer3, 1252762524, "CC(remember):AddSkillFromFeaturedListBottomSheet.kt#9igjgp");
                    Object it$iv2 = $composer3.rememberedValue();
                    if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        $composer3.updateRememberedValue(value$iv2);
                        it$iv2 = value$iv2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ButtonKt.FilledTonalButton((Function0) it$iv2, null, false, null, null, null, null, button_content_padding, null, ComposableSingletons$AddSkillFromFeaturedListBottomSheetKt.INSTANCE.getLambda$300743671$app_debug(), $composer3, 817889670, 378);
                    $composer3.endReplaceGroup();
                } else {
                    $composer3.startReplaceGroup(181300986);
                    ComposerKt.sourceInformation($composer3, "369@13746L21,368@13705L554");
                    ComposerKt.sourceInformationMarkerStart($composer3, 1252775549, "CC(remember):AddSkillFromFeaturedListBottomSheet.kt#9igjgp");
                    boolean invalid$iv2 = (($dirty2 & 896) == 256 ? z : false) | (($dirty2 & 14) == 4 ? z : false);
                    Object it$iv3 = $composer3.rememberedValue();
                    if (invalid$iv2 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AddSkillFromFeaturedListBottomSheetKt.FeaturedSkillItem$lambda$60$lambda$59$lambda$58$lambda$57(function1, skill);
                            }
                        };
                        $composer3.updateRememberedValue(value$iv3);
                        it$iv3 = value$iv3;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ButtonKt.FilledTonalButton((Function0) it$iv3, null, false, null, null, null, null, SkillManagerBottomSheetKt.getBUTTON_CONTENT_PADDING(), null, ComposableSingletons$AddSkillFromFeaturedListBottomSheetKt.INSTANCE.m10448getLambda$319508850$app_debug(), $composer3, 817889280, 382);
                    $composer3.endReplaceGroup();
                }
                $composer3.endReplaceGroup();
            }
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
        } else {
            $composer3.skipToGroupEnd();
            validationError2 = str;
            isAdding3 = isAdding2;
            isSkillAdded3 = isSkillAdded2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str4 = validationError2;
            final boolean z2 = isAdding3;
            final boolean z3 = isSkillAdded3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromFeaturedListBottomSheetKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddSkillFromFeaturedListBottomSheetKt.FeaturedSkillItem$lambda$61(skill, uriHandler, function1, str4, z2, z3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: FeaturedSkillItem$lambda$60$lambda$54$lambda$52$lambda$51$lambda$50$lambda$49 */
    public static final Unit m417x21f1165e(AllowedSkill $skill, UriHandler $uriHandler) {
        String it = $skill.getAttributionUrl();
        if (it != null) {
            $uriHandler.openUri(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeaturedSkillItem$lambda$60$lambda$59$lambda$58$lambda$57(Function1 $onAddClick, AllowedSkill $skill) {
        $onAddClick.invoke($skill);
        return Unit.INSTANCE;
    }
}
