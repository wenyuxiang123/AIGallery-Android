package com.google.ai.edge.gallery.customtasks.agentchat;

import android.os.Bundle;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.OpenInNewKt;
import androidx.compose.material.icons.outlined.DriveFolderUploadKt;
import androidx.compose.material.icons.rounded.AddKt;
import androidx.compose.material.icons.rounded.ExpandLessKt;
import androidx.compose.material.icons.rounded.ExpandMoreKt;
import androidx.compose.material.icons.rounded.LinkKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.AlphaKt;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.focus.FocusManager;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
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
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.AnalyticsKt;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.GalleryEvent;
import com.google.ai.edge.gallery.common.UtilsKt;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import com.google.ai.edge.gallery.ui.common.FloatingBannerKt;
import com.google.ai.edge.gallery.ui.theme.ThemeKt;
import com.google.ai.edge.gallery.proto.Skill;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SkillManagerBottomSheet.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000~\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u001a@\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001a\u008d\u0001\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u001d2\u0006\u0010\"\u001a\u00020#H\u0003¢\u0006\u0002\u0010$\u001a\u0018\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002\u001a/\u0010*\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u001d2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0010H\u0003¢\u0006\u0002\u0010,\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006-²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002²\u0006\n\u00100\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u00103\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u00104\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u00105\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u00107\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u00108\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u00109\u001a\u00020\bX\u008a\u008e\u0002²\u0006\f\u0010:\u001a\u0004\u0018\u00010;X\u008a\u008e\u0002²\u0006\f\u0010<\u001a\u0004\u0018\u00010=X\u008a\u008e\u0002²\u0006\n\u0010>\u001a\u00020?X\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u00020\bX\u008a\u008e\u0002²\u0006\u0010\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010C\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010D\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010E\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010F\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010G\u001a\u00020?X\u008a\u0084\u0002²\u0006\n\u0010H\u001a\u00020\bX\u008a\u008e\u0002"}, m922d2 = {"ADD_SKILL_OPTIONS", "", "Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;", "BUTTON_CONTENT_PADDING", "Landroidx/compose/foundation/layout/PaddingValues;", "getBUTTON_CONTENT_PADDING", "()Landroidx/compose/foundation/layout/PaddingValues;", "TAG", "", "SkillManagerBottomSheet", "", "agentTools", "Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;", "skillManagerViewModel", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;", "onDismiss", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "selectedSkillsChanged", "(Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SkillItemRow", "skillState", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;", "inMultiSelectMode", "isSelectedForDeletion", "onSelectionCheckedChange", "onLongClick", "Lkotlin/Function0;", "onSkillEnabledChange", "onViewClick", "onSecretClick", "onDeleteClick", "uriHandler", "Landroidx/compose/ui/platform/UriHandler;", "(Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/platform/UriHandler;Landroidx/compose/runtime/Composer;I)V", "scrollToBottomOfList", "scope", "Lkotlinx/coroutines/CoroutineScope;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "AddSkillOptionsBottomSheet", "onOptionSelected", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;", "showAddSkillFromUrlDialog", "showAddSkillFromLocalImportDialog", "showAddSkillFromFeaturedListBottomSheet", "showAddOrEditSkillBottomSheet", "showAddSkillOptionsSheet", "showDeleteSkillDialog", "showJsSkillTesterBottomSheet", "showSecretEditorDialog", "showDisclaimerDialog", "skillToDeleteName", "skillToTest", "Lcom/google/ai/edge/gallery/proto/Skill;", "addSkillOptionTypeToConfirm", "Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOptionType;", "skillToEditIndex", "", "searchQuery", "filteredSkills", "hasDeterminedExpansionStates", "isBuiltInExpanded", "isCustomExpanded", "previousSearchQuery", "showSkillLimitBanner", "selectedSkillsCount", "curSecret"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class SkillManagerBottomSheetKt {
    private static final List<AddSkillOption> ADD_SKILL_OPTIONS = CollectionsKt.listOf((Object[]) new AddSkillOption[]{new AddSkillOption(AddSkillOptionType.RemoteUrl, C2421R.string.add_skill_option_url_title, C2421R.string.add_skill_option_url_description, LinkKt.getLink(Icons.Rounded.INSTANCE)), new AddSkillOption(AddSkillOptionType.LocalImport, C2421R.string.add_skill_option_local_title, C2421R.string.add_skill_option_local_description, DriveFolderUploadKt.getDriveFolderUpload(Icons.Outlined.INSTANCE))});
    private static final PaddingValues BUTTON_CONTENT_PADDING = PaddingKt.m1984PaddingValuesa9UjIt4(C1654Dp.m9788constructorimpl(12), C1654Dp.m9788constructorimpl(2), C1654Dp.m9788constructorimpl(12), C1654Dp.m9788constructorimpl(2));
    private static final String TAG = "AGSkillManagerBottomSheet";

    /* JADX INFO: compiled from: SkillManagerBottomSheet.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddSkillOptionType.values().length];
            try {
                iArr[AddSkillOptionType.FeaturedList.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[AddSkillOptionType.RemoteUrl.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[AddSkillOptionType.LocalImport.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillOptionsBottomSheet$lambda$207(Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        AddSkillOptionsBottomSheet(function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillItemRow$lambda$196(SkillState skillState, boolean z, boolean z2, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Function0 function03, Function0 function04, UriHandler uriHandler, int i, Composer composer, int i2) {
        SkillItemRow(skillState, z, z2, function1, function0, function12, function02, function03, function04, uriHandler, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$183(AgentTools agentTools, SkillManagerViewModel skillManagerViewModel, Function1 function1, int i, Composer composer, int i2) {
        SkillManagerBottomSheet(agentTools, skillManagerViewModel, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final PaddingValues getBUTTON_CONTENT_PADDING() {
        return BUTTON_CONTENT_PADDING;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0a99  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0b87  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0c3e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0cb1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0cc9  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0e2d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0e42  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0eac  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0ebf  */
    /* JADX WARN: Type inference failed for: r2v68, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SkillManagerBottomSheet(com.google.ai.edge.gallery.customtasks.agentchat.AgentTools r77, final com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel r78, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r79, androidx.compose.runtime.Composer r80, final int r81) {
        /*
    public static final void SkillManagerBottomSheet(com.google.ai.edge.gallery.customtasks.agentchat.AgentTools r77, final com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel r78, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r79, androidx.compose.runtime.Composer r80, final int r81) {
            // Method dump skipped - placeholder implementation
        }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SkillManagerUiState SkillManagerBottomSheet$lambda$0(State<SkillManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (SkillManagerUiState) thisObj$iv;
    }

    private static final boolean SkillManagerBottomSheet$lambda$2(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void SkillManagerBottomSheet$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SkillManagerBottomSheet$lambda$5(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void SkillManagerBottomSheet$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SkillManagerBottomSheet$lambda$8(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void SkillManagerBottomSheet$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SkillManagerBottomSheet$lambda$11(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SkillManagerBottomSheet$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SkillManagerBottomSheet$lambda$14(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void SkillManagerBottomSheet$lambda$15(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SkillManagerBottomSheet$lambda$17(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SkillManagerBottomSheet$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SkillManagerBottomSheet$lambda$20(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void SkillManagerBottomSheet$lambda$21(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SkillManagerBottomSheet$lambda$23(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SkillManagerBottomSheet$lambda$24(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SkillManagerBottomSheet$lambda$26(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void SkillManagerBottomSheet$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String SkillManagerBottomSheet$lambda$29(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final Skill SkillManagerBottomSheet$lambda$32(MutableState<Skill> mutableState) {
        MutableState<Skill> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final AddSkillOptionType SkillManagerBottomSheet$lambda$35(MutableState<AddSkillOptionType> mutableState) {
        MutableState<AddSkillOptionType> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final int SkillManagerBottomSheet$lambda$38(MutableIntState $skillToEditIndex$delegate) {
        MutableIntState $this$getValue$iv = $skillToEditIndex$delegate;
        return $this$getValue$iv.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SkillManagerBottomSheet$lambda$41(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SkillState> SkillManagerBottomSheet$lambda$45(MutableState<List<SkillState>> mutableState) {
        MutableState<List<SkillState>> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SkillManagerBottomSheet$lambda$48(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SkillManagerBottomSheet$lambda$49(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SkillManagerBottomSheet$lambda$51(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SkillManagerBottomSheet$lambda$52(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SkillManagerBottomSheet$lambda$54(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SkillManagerBottomSheet$lambda$55(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SkillManagerBottomSheet$lambda$57(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SkillManagerBottomSheet$lambda$58(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SkillManagerBottomSheet$lambda$61(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SkillManagerBottomSheet$lambda$64(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SkillManagerBottomSheet$lambda$65(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SkillManagerBottomSheet$lambda$69(State<Integer> state) {
        Object thisObj$iv = state.getValue();
        return ((Number) thisObj$iv).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SkillManagerBottomSheet$lambda$68$lambda$67(State $uiState$delegate) {
        Iterable $this$count$iv = SkillManagerBottomSheet$lambda$0($uiState$delegate).getSkills();
        if (($this$count$iv instanceof Collection) && ((Collection) $this$count$iv).isEmpty()) {
            return 0;
        }
        int count$iv = 0;
        for (Object element$iv : $this$count$iv) {
            SkillState it = (SkillState) element$iv;
            if (it.getSkill().getSelected() && (count$iv = count$iv + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return count$iv;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$4 */
    /* JADX INFO: compiled from: SkillManagerBottomSheet.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$4", m932f = "SkillManagerBottomSheet.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25014 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<String> $savedSelectedSkillsNamesAndDescriptions;
        final /* synthetic */ SkillManagerViewModel $skillManagerViewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25014(Ref.ObjectRef<String> objectRef, SkillManagerViewModel skillManagerViewModel, Continuation<? super C25014> continuation) {
            super(2, continuation);
            this.$savedSelectedSkillsNamesAndDescriptions = objectRef;
            this.$skillManagerViewModel = skillManagerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25014(this.$savedSelectedSkillsNamesAndDescriptions, this.$skillManagerViewModel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25014) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.$savedSelectedSkillsNamesAndDescriptions.element = this.$skillManagerViewModel.getSelectedSkillsNamesAndDescriptions();
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$73(Function1 $onDismiss, Ref.ObjectRef $savedSelectedSkillsNamesAndDescriptions, SkillManagerViewModel $skillManagerViewModel) {
        $onDismiss.invoke(Boolean.valueOf(!Intrinsics.areEqual($savedSelectedSkillsNamesAndDescriptions.element, $skillManagerViewModel.getSelectedSkillsNamesAndDescriptions())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$134(final State $uiState$delegate, final MutableState $inMultiSelectMode$delegate, final SnapshotStateList $selectedCustomSkillNames, final MutableState $showDeleteSkillDialog$delegate, final CoroutineScope $scope, final SheetState $sheetState, final Function1 $onDismiss, final Ref.ObjectRef $savedSelectedSkillsNamesAndDescriptions, final SkillManagerViewModel $skillManagerViewModel, MutableState $searchQuery$delegate, final MutableState $showAddSkillOptionsSheet$delegate, final MutableState $filteredSkills$delegate, final LazyListState $listState, final UriHandler $uriHandler, final MutableState $isBuiltInExpanded$delegate, final MutableIntState $skillToEditIndex$delegate, final MutableState $showAddOrEditSkillBottomSheet$delegate, final MutableState $showSecretEditorDialog$delegate, final MutableState $skillToDeleteName$delegate, final MutableState $isCustomExpanded$delegate, final MutableState $showSkillLimitBanner$delegate, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Composer $composer$iv$iv$iv;
        Composer $composer2;
        Function0<ComposeUiNode> function02;
        String str;
        String str2;
        Composer $composer$iv;
        FocusManager focusManager;
        MeasurePolicy measurePolicy$iv$iv;
        Modifier materialized$iv$iv;
        Function0<ComposeUiNode> function03;
        String str3;
        String str4;
        String str5;
        String str6;
        Function0<ComposeUiNode> function04;
        String str7;
        Composer $composer3;
        Function0<ComposeUiNode> function05;
        final MutableState mutableState;
        Function0<ComposeUiNode> function06;
        Composer $composer$iv2;
        Composer $composer$iv$iv;
        Function0<ComposeUiNode> function07;
        Function0<ComposeUiNode> function08;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C252@10486L14168:SkillManagerBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-189839040, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheet.<anonymous> (SkillManagerBottomSheet.kt:252)");
            }
            Modifier modifier$iv = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (6 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, modifier$iv);
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
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i2 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -893019879, "C:SkillManagerBottomSheet.kt#41d64j");
            if (SkillManagerBottomSheet$lambda$0($uiState$delegate).getLoading()) {
                $composer.startReplaceGroup(-893425794);
                ComposerKt.sourceInformation($composer, "255@10595L300");
                Modifier modifier$iv2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment contentAlignment$iv2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
                int $changed$iv$iv2 = (54 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer, modifier$iv2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
                $composer$iv$iv$iv = $composer;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function08 = constructor2;
                    $composer.createNode(function08);
                } else {
                    function08 = constructor2;
                    $composer.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i4 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -2118450702, "C257@10749L11,256@10683L202:SkillManagerBottomSheet.kt#41d64j");
                ProgressIndicatorKt.m4356CircularProgressIndicator4lLiAd8(SizeKt.m2036size3ABfNKs(PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 11, null), C1654Dp.m9788constructorimpl(24)), 0L, C1654Dp.m9788constructorimpl(3), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant(), 0, 0.0f, $composer, 390, 50);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
                $composer2 = $composer;
                $composer$iv2 = $composer;
                $composer$iv$iv = $composer;
            } else {
                $composer$iv$iv$iv = $composer;
                $composer.startReplaceGroup(-892658544);
                ComposerKt.sourceInformation($composer, "265@10987L7,271@11167L86,267@11004L13636");
                ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = $composer.consume(localFocusManager);
                ComposerKt.sourceInformationMarkerEnd($composer);
                FocusManager focusManager2 = (FocusManager) objConsume;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 7, null), 0.0f, 1, null);
                Unit unit = Unit.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, -1137180452, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                boolean invalid$iv = $composer.changedInstance(focusManager2);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = (PointerInputEventHandler) new SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$2$1(focusManager2);
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier modifier$iv3 = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default, unit, (PointerInputEventHandler) it$iv);
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
                MeasurePolicy measurePolicy$iv3 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                int $changed$iv$iv3 = (0 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap localMap$iv$iv3 = $composer.getCurrentCompositionLocalMap();
                $composer2 = $composer;
                Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer, modifier$iv3);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function02 = constructor3;
                    $composer.createNode(function02);
                } else {
                    function02 = constructor3;
                    $composer.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = ($changed$iv$iv$iv3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                int $changed2 = ((0 >> 6) & 112) | 6;
                final ColumnScope $this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, -1337552663, "C348@13981L2011,400@16056L1132,400@16004L1184,435@17349L7281,435@17286L7344:SkillManagerBottomSheet.kt#41d64j");
                if (SkillManagerBottomSheet$lambda$57($inMultiSelectMode$delegate)) {
                    $composer.startReplaceGroup(-1337901135);
                    ComposerKt.sourceInformation($composer, "277@11361L1303");
                    $composer$iv = $composer;
                    focusManager = focusManager2;
                    Modifier modifier$iv4 = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 7, null);
                    Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
                    measurePolicy$iv$iv = measurePolicy$iv;
                    ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
                    materialized$iv$iv = materialized$iv$iv4;
                    MeasurePolicy measurePolicy$iv4 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                    int $changed$iv$iv4 = (390 << 3) & 112;
                    ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                    CompositionLocalMap localMap$iv$iv4 = $composer.getCurrentCompositionLocalMap();
                    str = "C72@3469L9:Box.kt#2w3rfo";
                    Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier($composer, modifier$iv4);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    int $changed$iv$iv$iv4 = (($changed$iv$iv4 << 6) & 896) | 6;
                    str2 = "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo";
                    ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                        function07 = constructor4;
                        $composer.createNode(function07);
                    } else {
                        function07 = constructor4;
                        $composer.useNode();
                    }
                    Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer);
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv5, ComposeUiNode.INSTANCE.getSetModifier());
                    int i6 = ($changed$iv$iv$iv4 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    int i7 = ((390 >> 6) & 112) | 6;
                    RowScope $this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132_u24lambda_u2480 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, -1849604603, "C282@11569L114,281@11531L344,293@11912L195,298@12147L10,292@11890L366,303@12366L151,301@12271L379:SkillManagerBottomSheet.kt#41d64j");
                    ComposerKt.sourceInformationMarkerStart($composer, -1445137775, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                    Object value$iv2 = $composer.rememberedValue();
                    if (value$iv2 == Composer.INSTANCE.getEmpty()) {
                        value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SkillManagerBottomSheetKt.m441xb4b44c42($selectedCustomSkillNames, $inMultiSelectMode$delegate);
                            }
                        };
                        $composer.updateRememberedValue(value$iv2);
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    IconButtonKt.IconButton((Function0) value$iv2, null, false, null, null, null, ComposableSingletons$SkillManagerBottomSheetKt.INSTANCE.m10465getLambda$2069614275$app_debug(), $composer, 1572870, 62);
                    TextKt.m4781TextNvy7gAk(StringResources_androidKt.pluralStringResource(C2421R.plurals.selected_custom_skills_count, $selectedCustomSkillNames.size(), new Object[]{Integer.valueOf($selectedCustomSkillNames.size())}, $composer, 0), PaddingKt.m1992paddingqDBjuR0$default(RowScope.weight$default($this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132_u24lambda_u2480, Modifier.INSTANCE, 1.0f, false, 2, null), C1654Dp.m9788constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 131068);
                    Modifier modifierM1992paddingqDBjuR0$default = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(3), 0.0f, 11, null);
                    ComposerKt.sourceInformationMarkerStart($composer, -1445112234, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                    Object it$iv2 = $composer.rememberedValue();
                    if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SkillManagerBottomSheetKt.m442xde7db1c6($selectedCustomSkillNames, $showDeleteSkillDialog$delegate);
                            }
                        };
                        $composer.updateRememberedValue(value$iv3);
                        it$iv2 = value$iv3;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    IconButtonKt.IconButton((Function0) it$iv2, modifierM1992paddingqDBjuR0$default, false, null, null, null, ComposableSingletons$SkillManagerBottomSheetKt.INSTANCE.m10467getLambda$98791564$app_debug(), $composer, 1572918, 60);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                    $composer3 = $composer;
                    str4 = "C101@5233L9:Row.kt#2w3rfo";
                    str6 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
                    str5 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
                    str7 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                    str3 = "CC(remember):SkillManagerBottomSheet.kt#9igjgp";
                } else {
                    str = "C72@3469L9:Box.kt#2w3rfo";
                    str2 = "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo";
                    $composer$iv = $composer;
                    focusManager = focusManager2;
                    measurePolicy$iv$iv = measurePolicy$iv;
                    materialized$iv$iv = materialized$iv$iv4;
                    $composer.startReplaceGroup(-1336578117);
                    ComposerKt.sourceInformation($composer, "313@12696L1261");
                    Modifier modifier$iv5 = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 7, null);
                    Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.getStart();
                    MeasurePolicy measurePolicy$iv5 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                    int $changed$iv$iv5 = (390 << 3) & 112;
                    ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int compositeKeyHash$iv$iv5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                    CompositionLocalMap localMap$iv$iv5 = $composer.getCurrentCompositionLocalMap();
                    Modifier materialized$iv$iv6 = ComposedModifierKt.materializeModifier($composer, modifier$iv5);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    int $changed$iv$iv$iv5 = (($changed$iv$iv5 << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                        function03 = constructor5;
                        $composer.createNode(function03);
                    } else {
                        function03 = constructor5;
                        $composer.useNode();
                    }
                    Composer $this$Layout_u24lambda_u240$iv$iv5 = Updater.m6165constructorimpl($composer);
                    str3 = "CC(remember):SkillManagerBottomSheet.kt#9igjgp";
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, measurePolicy$iv5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, localMap$iv$iv5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv5, Integer.valueOf(compositeKeyHash$iv$iv5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, materialized$iv$iv6, ComposeUiNode.INSTANCE.getSetModifier());
                    int i8 = ($changed$iv$iv$iv5 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    int i9 = ((390 >> 6) & 112) | 6;
                    RowScope $this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132_u24lambda_u2483 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, 1213880710, "C317@12866L460,328@13341L602:SkillManagerBottomSheet.kt#41d64j");
                    Modifier modifier$iv6 = RowScope.weight$default($this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132_u24lambda_u2483, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
                    Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
                    MeasurePolicy measurePolicy$iv6 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    int $changed$iv$iv6 = (0 << 3) & 112;
                    ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int compositeKeyHash$iv$iv6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                    CompositionLocalMap localMap$iv$iv6 = $composer.getCurrentCompositionLocalMap();
                    str4 = "C101@5233L9:Row.kt#2w3rfo";
                    Modifier materialized$iv$iv7 = ComposedModifierKt.materializeModifier($composer, modifier$iv6);
                    Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                    int $changed$iv$iv$iv6 = (($changed$iv$iv6 << 6) & 896) | 6;
                    str5 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
                    str6 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
                    ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                        function04 = constructor6;
                        $composer.createNode(function04);
                    } else {
                        function04 = constructor6;
                        $composer.useNode();
                    }
                    Composer $this$Layout_u24lambda_u240$iv$iv6 = Updater.m6165constructorimpl($composer);
                    str7 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                    $composer3 = $composer;
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, measurePolicy$iv6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, localMap$iv$iv6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv6, Integer.valueOf(compositeKeyHash$iv$iv6), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv6, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, materialized$iv$iv7, ComposeUiNode.INSTANCE.getSetModifier());
                    int i10 = ($changed$iv$iv$iv6 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i11 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 774103298, "C319@12947L38,320@13027L10,318@12923L144,323@13108L50,324@13200L10,325@13263L11,322@13084L226:SkillManagerBottomSheet.kt#41d64j");
                    TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.manage_skills, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 0, 0, 131070);
                    TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.manage_skills_description, $composer, 0), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 131066);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    IconButtonKt.IconButton(new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SkillManagerBottomSheetKt.m443x53ee0fe7($scope, $sheetState, $onDismiss, $savedSelectedSkillsNamesAndDescriptions, $skillManagerViewModel);
                        }
                    }, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(3), 0.0f, 11, null), false, null, null, null, ComposableSingletons$SkillManagerBottomSheetKt.INSTANCE.m10463getLambda$1096505466$app_debug(), $composer, 1572912, 60);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer3.endReplaceGroup();
                }
                Alignment.Vertical verticalAlignment$iv3 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal horizontalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(12));
                Modifier modifier$iv7 = IntrinsicKt.height(PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, SkillManagerBottomSheet$lambda$41($searchQuery$delegate).length() == 0 ? C1654Dp.m9788constructorimpl(8) : C1654Dp.m9788constructorimpl(18), 5, null), IntrinsicSize.Min);
                Arrangement.Horizontal horizontalArrangement$iv3 = horizontalM1843spacedBy0680j_4;
                Composer $composer$iv3 = $composer3;
                ComposerKt.sourceInformationMarkerStart($composer$iv3, 844473419, str6);
                MeasurePolicy measurePolicy$iv7 = RowKt.rowMeasurePolicy(horizontalArrangement$iv3, verticalAlignment$iv3, $composer$iv3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                int $changed$iv$iv7 = (432 << 3) & 112;
                String str8 = str5;
                ComposerKt.sourceInformationMarkerStart($composer$iv3, -1159599143, str8);
                int compositeKeyHash$iv$iv7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv3, 0));
                CompositionLocalMap localMap$iv$iv7 = $composer$iv3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv8 = ComposedModifierKt.materializeModifier($composer$iv3, modifier$iv7);
                Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv7 = (($changed$iv$iv7 << 6) & 896) | 6;
                String str9 = str7;
                ComposerKt.sourceInformationMarkerStart($composer$iv3, -553112988, str9);
                if (!($composer$iv3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv3.startReusableNode();
                if ($composer$iv3.getInserting()) {
                    function05 = constructor7;
                    $composer$iv3.createNode(function05);
                } else {
                    function05 = constructor7;
                    $composer$iv3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv7 = Updater.m6165constructorimpl($composer$iv3);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv7, measurePolicy$iv7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv7, localMap$iv$iv7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv7, Integer.valueOf(compositeKeyHash$iv$iv7), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv7, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv7, materialized$iv$iv8, ComposeUiNode.INSTANCE.getSetModifier());
                int i12 = ($changed$iv$iv$iv7 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer$iv3, 1456264949, str4);
                int i13 = ((432 >> 6) & 112) | 6;
                RowScope $this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132_u24lambda_u2492 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer$iv3, 368142666, "C372@15069L211,358@14403L20,363@14729L248,356@14327L968,385@15517L110,389@15672L11,380@15345L635:SkillManagerBottomSheet.kt#41d64j");
                String strSkillManagerBottomSheet$lambda$41 = SkillManagerBottomSheet$lambda$41($searchQuery$delegate);
                Modifier modifierClearFocusOnKeyboardDismiss = UtilsKt.clearFocusOnKeyboardDismiss(RowScope.weight$default($this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132_u24lambda_u2492, Modifier.INSTANCE, 1.0f, false, 2, null));
                RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
                TextFieldColors textFieldColorsM4752colors0hiis_0 = TextFieldDefaults.INSTANCE.m4752colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, Color.INSTANCE.m6950getTransparent0d7_KjU(), Color.INSTANCE.m6950getTransparent0d7_KjU(), Color.INSTANCE.m6950getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer$iv3, 0, 3504, 0, 0, 3072, 2147469311, 4095);
                String str10 = str3;
                ComposerKt.sourceInformationMarkerStart($composer$iv3, -819407624, str10);
                Object value$iv4 = $composer$iv3.rememberedValue();
                if (value$iv4 == Composer.INSTANCE.getEmpty()) {
                    mutableState = $searchQuery$delegate;
                    value$iv4 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SkillManagerBottomSheetKt.m444x325431dd(mutableState, (String) obj);
                        }
                    };
                    $composer$iv3.updateRememberedValue(value$iv4);
                } else {
                    mutableState = $searchQuery$delegate;
                }
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                TextFieldKt.TextField(strSkillManagerBottomSheet$lambda$41, (Function1<? super String, Unit>) value$iv4, modifierClearFocusOnKeyboardDismiss, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SkillManagerBottomSheetKt.INSTANCE.getLambda$234899199$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SkillManagerBottomSheetKt.INSTANCE.getLambda$547005406$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(859111613, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SkillManagerBottomSheetKt.m445xc6bb028b(mutableState, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer$iv3, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) circleShape, textFieldColorsM4752colors0hiis_0, $composer$iv3, 918552624, 12582912, 0, 1965176);
                Modifier modifierClip = ClipKt.clip(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), RoundedCornerShapeKt.getCircleShape());
                ComposerKt.sourceInformationMarkerStart($composer$iv3, -819371886, str10);
                Object it$iv3 = $composer$iv3.rememberedValue();
                if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv5 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SkillManagerBottomSheetKt.m447x518e597c(mutableState, $showAddSkillOptionsSheet$delegate);
                        }
                    };
                    $composer$iv3.updateRememberedValue(value$iv5);
                    it$iv3 = value$iv5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                Modifier modifier$iv8 = BackgroundKt.m1359backgroundbw27NRU$default(ClickableKt.m1401clickableoSLSa3U(modifierClip, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv3), MaterialTheme.INSTANCE.getColorScheme($composer$iv3, MaterialTheme.$stable).getPrimary(), null, 2, null);
                Alignment contentAlignment$iv3 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer$iv3, 1042775818, str2);
                MeasurePolicy measurePolicy$iv8 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, false);
                int $changed$iv$iv8 = (48 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer$iv3, -1159599143, str8);
                int compositeKeyHash$iv$iv8 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv3, 0));
                CompositionLocalMap localMap$iv$iv8 = $composer$iv3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv9 = ComposedModifierKt.materializeModifier($composer$iv3, modifier$iv8);
                Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv8 = (($changed$iv$iv8 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer$iv3, -553112988, str9);
                if (!($composer$iv3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv3.startReusableNode();
                if ($composer$iv3.getInserting()) {
                    function06 = constructor8;
                    $composer$iv3.createNode(function06);
                } else {
                    function06 = constructor8;
                    $composer$iv3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv8 = Updater.m6165constructorimpl($composer$iv3);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv8, measurePolicy$iv8, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv8, localMap$iv$iv8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv8, Integer.valueOf(compositeKeyHash$iv$iv8), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv8, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv8, materialized$iv$iv9, ComposeUiNode.INSTANCE.getSetModifier());
                int i14 = ($changed$iv$iv$iv8 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer$iv3, 1833054614, str);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                int i15 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer$iv3, -152513766, "C394@15853L36,395@15928L11,392@15775L191:SkillManagerBottomSheet.kt#41d64j");
                IconKt.m4075Iconww6aTOc(AddKt.getAdd(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_add_icon, $composer$iv3, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer$iv3, MaterialTheme.$stable).getOnPrimary(), $composer$iv3, 0, 4);
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                $composer$iv3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                $composer$iv3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                Composer $composer4 = $composer3;
                AnimatedVisibilityKt.AnimatedVisibility($this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132, SkillManagerBottomSheet$lambda$41($searchQuery$delegate).length() == 0, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-100580424, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return SkillManagerBottomSheetKt.m448xf4e4bfb9($uiState$delegate, $skillManagerViewModel, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer4, 54), $composer4, ($changed2 & 14) | 1572864, 30);
                $composer$iv2 = $composer;
                $composer$iv$iv = $composer;
                CompositionLocalKt.CompositionLocalProvider(OverscrollKt.getLocalOverscrollFactory().provides(null), ComposableLambdaKt.rememberComposableLambda(-373281888, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SkillManagerBottomSheetKt.m433xa7b318d6($this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132, $filteredSkills$delegate, $listState, $skillManagerViewModel, $uiState$delegate, $uriHandler, $isBuiltInExpanded$delegate, $inMultiSelectMode$delegate, $skillToEditIndex$delegate, $showAddOrEditSkillBottomSheet$delegate, $showSecretEditorDialog$delegate, $skillToDeleteName$delegate, $showDeleteSkillDialog$delegate, $isCustomExpanded$delegate, $selectedCustomSkillNames, $showSkillLimitBanner$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer4, 54), $composer4, ProvidedValue.$stable | 48);
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer$iv);
                $composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$80$lambda$77$lambda$76 */
    public static final Unit m441xb4b44c42(SnapshotStateList $selectedCustomSkillNames, MutableState $inMultiSelectMode$delegate) {
        SkillManagerBottomSheet$lambda$58($inMultiSelectMode$delegate, false);
        $selectedCustomSkillNames.clear();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$80$lambda$79$lambda$78 */
    public static final Unit m442xde7db1c6(SnapshotStateList $selectedCustomSkillNames, MutableState $showDeleteSkillDialog$delegate) {
        if (!$selectedCustomSkillNames.isEmpty()) {
            SkillManagerBottomSheet$lambda$18($showDeleteSkillDialog$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$83$lambda$82 */
    public static final Unit m443x53ee0fe7(CoroutineScope $scope, SheetState $sheetState, Function1 $onDismiss, Ref.ObjectRef $savedSelectedSkillsNamesAndDescriptions, SkillManagerViewModel $skillManagerViewModel) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$2$2$1($sheetState, $onDismiss, $savedSelectedSkillsNamesAndDescriptions, $skillManagerViewModel, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$92$lambda$85$lambda$84 */
    public static final Unit m444x325431dd(MutableState $searchQuery$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchQuery$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$92$lambda$88 */
    public static final Unit m445xc6bb028b(final MutableState $searchQuery$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:SkillManagerBottomSheet.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(859111613, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SkillManagerBottomSheet.kt:364)");
            }
            if (StringsKt.trim((CharSequence) SkillManagerBottomSheet$lambda$41($searchQuery$delegate)).toString().length() > 0) {
                $composer.startReplaceGroup(84006068);
                ComposerKt.sourceInformation($composer, "365@14825L20,365@14804L139");
                ComposerKt.sourceInformationMarkerStart($composer, 972542353, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                Object it$iv = $composer.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda50
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SkillManagerBottomSheetKt.m446x3e6f3ba($searchQuery$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) it$iv, null, false, null, null, null, ComposableSingletons$SkillManagerBottomSheetKt.INSTANCE.getLambda$1470576484$app_debug(), $composer, 1572870, 62);
            } else {
                $composer.startReplaceGroup(69333861);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$92$lambda$88$lambda$87$lambda$86 */
    public static final Unit m446x3e6f3ba(MutableState $searchQuery$delegate) {
        $searchQuery$delegate.setValue("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$92$lambda$90$lambda$89 */
    public static final Unit m447x518e597c(MutableState $searchQuery$delegate, MutableState $showAddSkillOptionsSheet$delegate) {
        $searchQuery$delegate.setValue("");
        SkillManagerBottomSheet$lambda$15($showAddSkillOptionsSheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$99 */
    public static final Unit m448xf4e4bfb9(State $uiState$delegate, final SkillManagerViewModel $skillManagerViewModel, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Object value$iv;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C401@16070L1106:SkillManagerBottomSheet.kt#41d64j");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-100580424, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SkillManagerBottomSheet.kt:401)");
        }
        Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
        Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 7, null);
        Arrangement.Horizontal horizontalArrangement$iv = spaceBetween;
        ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
        int $changed$iv$iv = (438 << 3) & 112;
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
        int i2 = ((438 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, 1693946603, "C408@16356L159,413@16555L10,407@16334L259,417@16653L509:SkillManagerBottomSheet.kt#41d64j");
        TextKt.m4781TextNvy7gAk(StringResources_androidKt.pluralStringResource(C2421R.plurals.skills_count, SkillManagerBottomSheet$lambda$0($uiState$delegate).getSkills().size(), new Object[]{Integer.valueOf(SkillManagerBottomSheet$lambda$0($uiState$delegate).getSkills().size())}, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelLarge(), $composer, 0, 0, 131070);
        Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        Modifier modifier$iv2 = Modifier.INSTANCE;
        Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.getStart();
        MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        int $changed$iv$iv2 = (384 << 3) & 112;
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
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        int i4 = ((384 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -1792876676, "C419@16763L63,418@16723L202,424@16982L64,423@16942L204:SkillManagerBottomSheet.kt#41d64j");
        ComposerKt.sourceInformationMarkerStart($composer, -1581854465, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance($skillManagerViewModel);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
            value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SkillManagerBottomSheetKt.m449x5bb1340f($skillManagerViewModel);
                }
            };
            $composer.updateRememberedValue(value$iv);
        } else {
            value$iv = it$iv;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        ButtonKt.TextButton((Function0) value$iv, null, false, null, null, null, null, null, null, ComposableSingletons$SkillManagerBottomSheetKt.INSTANCE.getLambda$695499069$app_debug(), $composer, 805306368, 510);
        ComposerKt.sourceInformationMarkerStart($composer, -1581847456, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
        boolean invalid$iv2 = $composer.changedInstance($skillManagerViewModel);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
            Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SkillManagerBottomSheetKt.m450x857a9993($skillManagerViewModel);
                }
            };
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        ButtonKt.TextButton((Function0) it$iv2, null, false, null, null, null, null, null, null, ComposableSingletons$SkillManagerBottomSheetKt.INSTANCE.getLambda$530827700$app_debug(), $composer, 805306368, 510);
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
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$99$lambda$98$lambda$97$lambda$94$lambda$93 */
    public static final Unit m449x5bb1340f(SkillManagerViewModel $skillManagerViewModel) {
        $skillManagerViewModel.setAllSkillsSelected(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$99$lambda$98$lambda$97$lambda$96$lambda$95 */
    public static final Unit m450x857a9993(SkillManagerViewModel $skillManagerViewModel) {
        $skillManagerViewModel.setAllSkillsSelected(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131 */
    public static final Unit m433xa7b318d6(ColumnScope $this_Column, MutableState $filteredSkills$delegate, LazyListState $listState, final SkillManagerViewModel $skillManagerViewModel, final State $uiState$delegate, final UriHandler $uriHandler, final MutableState $isBuiltInExpanded$delegate, final MutableState $inMultiSelectMode$delegate, final MutableIntState $skillToEditIndex$delegate, final MutableState $showAddOrEditSkillBottomSheet$delegate, final MutableState $showSecretEditorDialog$delegate, final MutableState $skillToDeleteName$delegate, final MutableState $showDeleteSkillDialog$delegate, final MutableState $isCustomExpanded$delegate, final SnapshotStateList $selectedCustomSkillNames, MutableState $showSkillLimitBanner$delegate, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        ComposerKt.sourceInformation($composer, "C437@17397L71,439@17514L72,441@17600L7018:SkillManagerBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-373281888, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SkillManagerBottomSheet.kt:436)");
            }
            Object objSkillManagerBottomSheet$lambda$45 = SkillManagerBottomSheet$lambda$45($filteredSkills$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 2053360103, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
            boolean invalid$iv = $composer.changed(objSkillManagerBottomSheet$lambda$45);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Iterable $this$filter$iv = SkillManagerBottomSheet$lambda$45($filteredSkills$delegate);
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv : $this$filter$iv) {
                    SkillState it = (SkillState) element$iv$iv;
                    if (it.getSkill().getBuiltIn()) {
                        destination$iv$iv.add(element$iv$iv);
                    }
                }
                Object value$iv = (List) destination$iv$iv;
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final List builtInSkills = (List) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            Object objSkillManagerBottomSheet$lambda$452 = SkillManagerBottomSheet$lambda$45($filteredSkills$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 2053363848, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
            boolean invalid$iv2 = $composer.changed(objSkillManagerBottomSheet$lambda$452);
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Iterable $this$filter$iv2 = SkillManagerBottomSheet$lambda$45($filteredSkills$delegate);
                Collection destination$iv$iv2 = new ArrayList();
                for (Object element$iv$iv2 : $this$filter$iv2) {
                    SkillState it2 = (SkillState) element$iv$iv2;
                    if (!it2.getSkill().getBuiltIn()) {
                        destination$iv$iv2.add(element$iv$iv2);
                    }
                }
                Object value$iv2 = (List) destination$iv$iv2;
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final List customSkills = (List) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifier$iv = ColumnScope.weight$default($this_Column, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $i$f$Box = $changed$iv$iv << 6;
            int $changed$iv$iv$iv = ($i$f$Box & 896) | 6;
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
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            int i2 = ((0 >> 6) & 112) | 6;
            BoxScope $this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132_u24lambda_u24131_u24lambda_u24130 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1046670581, "C446@17833L6271,442@17652L6452,586@24311L191,584@24225L298,581@24120L484:SkillManagerBottomSheet.kt#41d64j");
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer, -1074609979, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
            boolean invalid$iv3 = $composer.changedInstance(builtInSkills) | $composer.changedInstance($skillManagerViewModel) | $composer.changed($uiState$delegate) | $composer.changedInstance($uriHandler) | $composer.changedInstance(customSkills);
            Object it$iv3 = $composer.rememberedValue();
            if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SkillManagerBottomSheetKt.m434x5fa87dde(builtInSkills, customSkills, $isBuiltInExpanded$delegate, $skillManagerViewModel, $uiState$delegate, $uriHandler, $inMultiSelectMode$delegate, $skillToEditIndex$delegate, $showAddOrEditSkillBottomSheet$delegate, $showSecretEditorDialog$delegate, $skillToDeleteName$delegate, $showDeleteSkillDialog$delegate, $isCustomExpanded$delegate, $selectedCustomSkillNames, (LazyListScope) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, $listState, null, false, horizontalOrVerticalM1843spacedBy0680j_4, null, null, false, null, (Function1) it$iv3, $composer, 24582, 492);
            FloatingBannerKt.FloatingBanner(SkillManagerBottomSheet$lambda$64($showSkillLimitBanner$delegate), StringResources_androidKt.stringResource(C2421R.string.skill_limit_warning, new Object[]{StringResources_androidKt.pluralStringResource(C2421R.plurals.skills_count, 15, new Object[]{15}, $composer, 48)}, $composer, 0), $this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132_u24lambda_u24131_u24lambda_u24130.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), $composer, 0, 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128 */
    public static final Unit m434x5fa87dde(final List $builtInSkills, final List $customSkills, final MutableState $isBuiltInExpanded$delegate, final SkillManagerViewModel $skillManagerViewModel, final State $uiState$delegate, final UriHandler $uriHandler, final MutableState $inMultiSelectMode$delegate, final MutableIntState $skillToEditIndex$delegate, final MutableState $showAddOrEditSkillBottomSheet$delegate, final MutableState $showSecretEditorDialog$delegate, final MutableState $skillToDeleteName$delegate, final MutableState $showDeleteSkillDialog$delegate, final MutableState $isCustomExpanded$delegate, final SnapshotStateList $selectedCustomSkillNames, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (!$builtInSkills.isEmpty()) {
            LazyListScope.item$default(LazyColumn, "built_in_header", null, ComposableLambdaKt.composableLambdaInstance(51542614, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SkillManagerBottomSheetKt.m435x89472221($isBuiltInExpanded$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 2, null);
            if (SkillManagerBottomSheet$lambda$51($isBuiltInExpanded$delegate)) {
                final Function1 key$iv = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SkillManagerBottomSheetKt.m437x89472222((SkillState) obj);
                    }
                };
                final Function1 contentType$iv = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        return invoke((SkillState) p1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(SkillState skillState) {
                        return null;
                    }
                };
                LazyColumn.items($builtInSkills.size(), new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$$inlined$items$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int index) {
                        return key$iv.invoke($builtInSkills.get(index));
                    }
                }, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int index) {
                        return contentType$iv.invoke($builtInSkills.get(index));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$$inlined$items$default$4
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
                        if ($composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            int $changed2 = $dirty & 14;
                            final SkillState skillState = (SkillState) $builtInSkills.get(it);
                            $composer.startReplaceGroup(515939686);
                            ComposerKt.sourceInformation($composer, "C*484@19636L2,485@19678L2,486@19729L140,489@19909L170,493@20121L163,497@20326L150,480@19404L1146:SkillManagerBottomSheet.kt#41d64j");
                            boolean zSkillManagerBottomSheet$lambda$57 = SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$57($inMultiSelectMode$delegate);
                            ComposerKt.sourceInformationMarkerStart($composer, 1540670149, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                            Object it$iv = $composer.rememberedValue();
                            if (it$iv == Composer.INSTANCE.getEmpty()) {
                                Object value$iv = (Function1) new Function1<Boolean, Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$5$1$1$1$3$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean it2) {
                                    }
                                };
                                $composer.updateRememberedValue(value$iv);
                                it$iv = value$iv;
                            }
                            Function1 function1 = (Function1) it$iv;
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerStart($composer, 1540671493, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                            Object it$iv2 = $composer.rememberedValue();
                            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                                Object value$iv2 = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$5$1$1$1$3$2$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }
                                };
                                $composer.updateRememberedValue(value$iv2);
                                it$iv2 = value$iv2;
                            }
                            Function0 function0 = (Function0) it$iv2;
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerStart($composer, 1540673263, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                            boolean invalid$iv = $composer.changedInstance($skillManagerViewModel) | (((($changed2 & 112) ^ 48) > 32 && $composer.changed(skillState)) || ($changed2 & 48) == 32);
                            Object it$iv3 = $composer.rememberedValue();
                            if (invalid$iv || it$iv3 == Composer.INSTANCE.getEmpty()) {
                                final SkillManagerViewModel skillManagerViewModel = $skillManagerViewModel;
                                Object value$iv3 = (Function1) new Function1<Boolean, Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$5$1$1$1$3$3$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean newCheckedState) {
                                        skillManagerViewModel.setSkillSelected(skillState, newCheckedState);
                                    }
                                };
                                $composer.updateRememberedValue(value$iv3);
                                it$iv3 = value$iv3;
                            }
                            Function1 function12 = (Function1) it$iv3;
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerStart($composer, 1540679053, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                            boolean invalid$iv2 = $composer.changed($uiState$delegate) | (((($changed2 & 112) ^ 48) > 32 && $composer.changed(skillState)) || ($changed2 & 48) == 32);
                            Object it$iv4 = $composer.rememberedValue();
                            if (invalid$iv2 || it$iv4 == Composer.INSTANCE.getEmpty()) {
                                final State state = $uiState$delegate;
                                final MutableIntState mutableIntState = $skillToEditIndex$delegate;
                                final MutableState mutableState = $showAddOrEditSkillBottomSheet$delegate;
                                Object value$iv4 = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$5$1$1$1$3$4$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        mutableIntState.setIntValue(SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$0(state).getSkills().indexOf(skillState));
                                        SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$12(mutableState, true);
                                    }
                                };
                                $composer.updateRememberedValue(value$iv4);
                                it$iv4 = value$iv4;
                            }
                            Function0 function02 = (Function0) it$iv4;
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerStart($composer, 1540685830, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                            boolean invalid$iv3 = $composer.changed($uiState$delegate) | (((($changed2 & 112) ^ 48) > 32 && $composer.changed(skillState)) || ($changed2 & 48) == 32);
                            Object it$iv5 = $composer.rememberedValue();
                            if (invalid$iv3 || it$iv5 == Composer.INSTANCE.getEmpty()) {
                                final State state2 = $uiState$delegate;
                                final MutableIntState mutableIntState2 = $skillToEditIndex$delegate;
                                final MutableState mutableState2 = $showSecretEditorDialog$delegate;
                                Object value$iv5 = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$5$1$1$1$3$5$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        mutableIntState2.setIntValue(SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$0(state2).getSkills().indexOf(skillState));
                                        SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$24(mutableState2, true);
                                    }
                                };
                                $composer.updateRememberedValue(value$iv5);
                                it$iv5 = value$iv5;
                            }
                            Function0 function03 = (Function0) it$iv5;
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerStart($composer, 1540692377, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                            boolean invalid$iv4 = ((($changed2 & 112) ^ 48) > 32 && $composer.changed(skillState)) || ($changed2 & 48) == 32;
                            Object it$iv6 = $composer.rememberedValue();
                            if (invalid$iv4 || it$iv6 == Composer.INSTANCE.getEmpty()) {
                                final MutableState mutableState3 = $skillToDeleteName$delegate;
                                final MutableState mutableState4 = $showDeleteSkillDialog$delegate;
                                Object value$iv6 = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$5$1$1$1$3$6$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        MutableState<String> mutableState5 = mutableState3;
                                        String name = skillState.getSkill().getName();
                                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                        mutableState5.setValue(name);
                                        SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$18(mutableState4, true);
                                    }
                                };
                                $composer.updateRememberedValue(value$iv6);
                                it$iv6 = value$iv6;
                            }
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            SkillManagerBottomSheetKt.SkillItemRow(skillState, zSkillManagerBottomSheet$lambda$57, false, function1, function0, function12, function02, function03, (Function0) it$iv6, $uriHandler, $composer, (($changed2 >> 3) & 14) | 28032);
                            $composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        $composer.skipToGroupEnd();
                    }
                }));
            }
        }
        if (!$customSkills.isEmpty()) {
            LazyListScope.item$default(LazyColumn, "custom_header", null, ComposableLambdaKt.composableLambdaInstance(-558166963, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SkillManagerBottomSheetKt.m438x89472242($isCustomExpanded$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 2, null);
            if (SkillManagerBottomSheet$lambda$54($isCustomExpanded$delegate)) {
                final Function1 key$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda47
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SkillManagerBottomSheetKt.m440x89472258((SkillState) obj);
                    }
                };
                final Function1 contentType$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$$inlined$items$default$5
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        return invoke((SkillState) p1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(SkillState skillState) {
                        return null;
                    }
                };
                LazyColumn.items($customSkills.size(), new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$$inlined$items$default$6
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int index) {
                        return key$iv2.invoke($customSkills.get(index));
                    }
                }, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$$inlined$items$default$7
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int index) {
                        return contentType$iv2.invoke($customSkills.get(index));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$$inlined$items$default$8
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
                        if ($composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            int $changed2 = $dirty & 14;
                            final SkillState skillState = (SkillState) $customSkills.get(it);
                            $composer.startReplaceGroup(-72320633);
                            ComposerKt.sourceInformation($composer, "C*545@22479L399,553@22918L240,559@23207L140,562@23387L170,566@23599L163,570@23804L150,540@22170L1858:SkillManagerBottomSheet.kt#41d64j");
                            boolean zSkillManagerBottomSheet$lambda$57 = SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$57($inMultiSelectMode$delegate);
                            boolean zContains = $selectedCustomSkillNames.contains(skillState.getSkill().getName());
                            ComposerKt.sourceInformationMarkerStart($composer, -279419159, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                            boolean invalid$iv = ((($changed2 & 112) ^ 48) > 32 && $composer.changed(skillState)) || ($changed2 & 48) == 32;
                            Object it$iv = $composer.rememberedValue();
                            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                                final SnapshotStateList snapshotStateList = $selectedCustomSkillNames;
                                final MutableState mutableState = $inMultiSelectMode$delegate;
                                Object value$iv = (Function1) new Function1<Boolean, Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$5$1$1$1$6$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean checked) {
                                        if (checked) {
                                            SnapshotStateList<String> snapshotStateList2 = snapshotStateList;
                                            String name = skillState.getSkill().getName();
                                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                            snapshotStateList2.add(name);
                                            return;
                                        }
                                        snapshotStateList.remove(skillState.getSkill().getName());
                                        if (snapshotStateList.isEmpty()) {
                                            SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$58(mutableState, false);
                                        }
                                    }
                                };
                                $composer.updateRememberedValue(value$iv);
                                it$iv = value$iv;
                            }
                            Function1 function1 = (Function1) it$iv;
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerStart($composer, -279405270, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                            boolean invalid$iv2 = ((($changed2 & 112) ^ 48) > 32 && $composer.changed(skillState)) || ($changed2 & 48) == 32;
                            Object it$iv2 = $composer.rememberedValue();
                            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                                final SnapshotStateList snapshotStateList2 = $selectedCustomSkillNames;
                                final MutableState mutableState2 = $inMultiSelectMode$delegate;
                                Object value$iv2 = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$5$1$1$1$6$2$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (!SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$57(mutableState2)) {
                                            SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$58(mutableState2, true);
                                            SnapshotStateList<String> snapshotStateList3 = snapshotStateList2;
                                            String name = skillState.getSkill().getName();
                                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                            snapshotStateList3.add(name);
                                        }
                                    }
                                };
                                $composer.updateRememberedValue(value$iv2);
                                it$iv2 = value$iv2;
                            }
                            Function0 function0 = (Function0) it$iv2;
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerStart($composer, -279396122, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                            boolean invalid$iv3 = $composer.changedInstance($skillManagerViewModel) | (((($changed2 & 112) ^ 48) > 32 && $composer.changed(skillState)) || ($changed2 & 48) == 32);
                            Object it$iv3 = $composer.rememberedValue();
                            if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                                final SkillManagerViewModel skillManagerViewModel = $skillManagerViewModel;
                                Object value$iv3 = (Function1) new Function1<Boolean, Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$5$1$1$1$6$3$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean newCheckedState) {
                                        skillManagerViewModel.setSkillSelected(skillState, newCheckedState);
                                    }
                                };
                                $composer.updateRememberedValue(value$iv3);
                                it$iv3 = value$iv3;
                            }
                            Function1 function12 = (Function1) it$iv3;
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerStart($composer, -279390332, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                            boolean invalid$iv4 = $composer.changed($uiState$delegate) | (((($changed2 & 112) ^ 48) > 32 && $composer.changed(skillState)) || ($changed2 & 48) == 32);
                            Object it$iv4 = $composer.rememberedValue();
                            if (invalid$iv4 || it$iv4 == Composer.INSTANCE.getEmpty()) {
                                final State state = $uiState$delegate;
                                final MutableIntState mutableIntState = $skillToEditIndex$delegate;
                                final MutableState mutableState3 = $showAddOrEditSkillBottomSheet$delegate;
                                Object value$iv4 = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$5$1$1$1$6$4$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        mutableIntState.setIntValue(SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$0(state).getSkills().indexOf(skillState));
                                        SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$12(mutableState3, true);
                                    }
                                };
                                $composer.updateRememberedValue(value$iv4);
                                it$iv4 = value$iv4;
                            }
                            Function0 function02 = (Function0) it$iv4;
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerStart($composer, -279383555, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                            boolean invalid$iv5 = $composer.changed($uiState$delegate) | (((($changed2 & 112) ^ 48) > 32 && $composer.changed(skillState)) || ($changed2 & 48) == 32);
                            Object it$iv5 = $composer.rememberedValue();
                            if (invalid$iv5 || it$iv5 == Composer.INSTANCE.getEmpty()) {
                                final State state2 = $uiState$delegate;
                                final MutableIntState mutableIntState2 = $skillToEditIndex$delegate;
                                final MutableState mutableState4 = $showSecretEditorDialog$delegate;
                                Object value$iv5 = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$5$1$1$1$6$5$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        mutableIntState2.setIntValue(SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$0(state2).getSkills().indexOf(skillState));
                                        SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$24(mutableState4, true);
                                    }
                                };
                                $composer.updateRememberedValue(value$iv5);
                                it$iv5 = value$iv5;
                            }
                            Function0 function03 = (Function0) it$iv5;
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerStart($composer, -279377008, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                            boolean invalid$iv6 = ((($changed2 & 112) ^ 48) > 32 && $composer.changed(skillState)) || ($changed2 & 48) == 32;
                            Object it$iv6 = $composer.rememberedValue();
                            if (invalid$iv6 || it$iv6 == Composer.INSTANCE.getEmpty()) {
                                final MutableState mutableState5 = $skillToDeleteName$delegate;
                                final MutableState mutableState6 = $showDeleteSkillDialog$delegate;
                                Object value$iv6 = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$5$1$1$1$6$6$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        MutableState<String> mutableState7 = mutableState5;
                                        String name = skillState.getSkill().getName();
                                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                        mutableState7.setValue(name);
                                        SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$18(mutableState6, true);
                                    }
                                };
                                $composer.updateRememberedValue(value$iv6);
                                it$iv6 = value$iv6;
                            }
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            SkillManagerBottomSheetKt.SkillItemRow(skillState, zSkillManagerBottomSheet$lambda$57, zContains, function1, function0, function12, function02, function03, (Function0) it$iv6, $uriHandler, $composer, ($changed2 >> 3) & 14);
                            $composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        $composer.skipToGroupEnd();
                    }
                }));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$lambda$107 */
    public static final Unit m435x89472221(final MutableState $isBuiltInExpanded$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        String str;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C453@18145L42,449@17955L1281:SkillManagerBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(51542614, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SkillManagerBottomSheet.kt:449)");
            }
            Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(20)));
            ComposerKt.sourceInformationMarkerStart($composer, -2007148672, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SkillManagerBottomSheetKt.m436xc33bbb40($isBuiltInExpanded$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifier$iv = PaddingKt.m1989paddingVpY3zN4(ClickableKt.m1401clickableoSLSa3U(modifierClip, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv), C1654Dp.m9788constructorimpl(16), C1654Dp.m9788constructorimpl(12));
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
            int i2 = ((384 >> 6) & 112) | 6;
            RowScope $this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132_u24lambda_u24131_u24lambda_u24130_u24lambda_u24129_u24lambda_u24128_u24lambda_u24107_u24lambda_u24106 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1679537477, "C458@18408L46,459@18502L10,457@18378L227,462@18628L586:SkillManagerBottomSheet.kt#41d64j");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.built_in_skills_title, $composer, 0), RowScope.weight$default($this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132_u24lambda_u24131_u24lambda_u24130_u24lambda_u24129_u24lambda_u24128_u24lambda_u24107_u24lambda_u24106, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 131068);
            ImageVector expandLess = SkillManagerBottomSheet$lambda$51($isBuiltInExpanded$delegate) ? ExpandLessKt.getExpandLess(Icons.Rounded.INSTANCE) : ExpandMoreKt.getExpandMore(Icons.Rounded.INSTANCE);
            if (SkillManagerBottomSheet$lambda$51($isBuiltInExpanded$delegate)) {
                $composer.startReplaceGroup(1680118757);
                ComposerKt.sourceInformation($composer, "471@19017L41");
                String strStringResource = StringResources_androidKt.stringResource(C2421R.string.cd_collapse_icon, $composer, 0);
                $composer.endReplaceGroup();
                str = strStringResource;
            } else {
                $composer.startReplaceGroup(1680222855);
                ComposerKt.sourceInformation($composer, "473@19122L39");
                String strStringResource2 = StringResources_androidKt.stringResource(C2421R.string.cd_expand_icon, $composer, 0);
                $composer.endReplaceGroup();
                str = strStringResource2;
            }
            IconKt.m4075Iconww6aTOc(expandLess, str, (Modifier) null, 0L, $composer, 0, 12);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$lambda$107$lambda$105$lambda$104 */
    public static final Unit m436xc33bbb40(MutableState $isBuiltInExpanded$delegate) {
        SkillManagerBottomSheet$lambda$52($isBuiltInExpanded$delegate, !SkillManagerBottomSheet$lambda$51($isBuiltInExpanded$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$lambda$108 */
    public static final Object m437x89472222(SkillState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String name = it.getSkill().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$lambda$119 */
    public static final Unit m438x89472242(final MutableState $isCustomExpanded$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        String str;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C513@20919L40,509@20729L1275:SkillManagerBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-558166963, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SkillManagerBottomSheet.kt:509)");
            }
            Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(20)));
            ComposerKt.sourceInformationMarkerStart($composer, 472467381, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SkillManagerBottomSheetKt.m439x5186ce01($isCustomExpanded$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifier$iv = PaddingKt.m1989paddingVpY3zN4(ClickableKt.m1401clickableoSLSa3U(modifierClip, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv), C1654Dp.m9788constructorimpl(16), C1654Dp.m9788constructorimpl(12));
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
            int i2 = ((384 >> 6) & 112) | 6;
            RowScope $this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132_u24lambda_u24131_u24lambda_u24130_u24lambda_u24129_u24lambda_u24128_u24lambda_u24119_u24lambda_u24118 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1476195442, "C518@21180L44,519@21272L10,517@21150L225,522@21398L584:SkillManagerBottomSheet.kt#41d64j");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.custom_skills_title, $composer, 0), RowScope.weight$default($this$SkillManagerBottomSheet_u24lambda_u24134_u24lambda_u24133_u24lambda_u24132_u24lambda_u24131_u24lambda_u24130_u24lambda_u24129_u24lambda_u24128_u24lambda_u24119_u24lambda_u24118, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 131068);
            ImageVector expandLess = SkillManagerBottomSheet$lambda$54($isCustomExpanded$delegate) ? ExpandLessKt.getExpandLess(Icons.Rounded.INSTANCE) : ExpandMoreKt.getExpandMore(Icons.Rounded.INSTANCE);
            if (SkillManagerBottomSheet$lambda$54($isCustomExpanded$delegate)) {
                $composer.startReplaceGroup(1476772878);
                ComposerKt.sourceInformation($composer, "531@21785L41");
                String strStringResource = StringResources_androidKt.stringResource(C2421R.string.cd_collapse_icon, $composer, 0);
                $composer.endReplaceGroup();
                str = strStringResource;
            } else {
                $composer.startReplaceGroup(1476876976);
                ComposerKt.sourceInformation($composer, "533@21890L39");
                String strStringResource2 = StringResources_androidKt.stringResource(C2421R.string.cd_expand_icon, $composer, 0);
                $composer.endReplaceGroup();
                str = strStringResource2;
            }
            IconKt.m4075Iconww6aTOc(expandLess, str, (Modifier) null, 0L, $composer, 0, 12);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$lambda$119$lambda$117$lambda$116 */
    public static final Unit m439x5186ce01(MutableState $isCustomExpanded$delegate) {
        SkillManagerBottomSheet$lambda$55($isCustomExpanded$delegate, !SkillManagerBottomSheet$lambda$54($isCustomExpanded$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillManagerBottomSheet$lambda$134$lambda$133$lambda$132$lambda$131$lambda$130$lambda$129$lambda$128$lambda$120 */
    public static final Object m440x89472258(SkillState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String name = it.getSkill().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$136$lambda$135(MutableState $showDeleteSkillDialog$delegate) {
        SkillManagerBottomSheet$lambda$18($showDeleteSkillDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$143(MutableState $inMultiSelectMode$delegate, Composer $composer, int $changed) {
        String str;
        ComposerKt.sourceInformation($composer, "C605@24792L168:SkillManagerBottomSheet.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-675208593, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheet.<anonymous> (SkillManagerBottomSheet.kt:605)");
            }
            if (SkillManagerBottomSheet$lambda$57($inMultiSelectMode$delegate)) {
                $composer.startReplaceGroup(-335394556);
                ComposerKt.sourceInformation($composer, "606@24831L53");
                String strStringResource = StringResources_androidKt.stringResource(C2421R.string.delete_selected_skills_title, $composer, 0);
                $composer.endReplaceGroup();
                str = strStringResource;
            } else {
                $composer.startReplaceGroup(-335392351);
                ComposerKt.sourceInformation($composer, "607@24900L50");
                String strStringResource2 = StringResources_androidKt.stringResource(C2421R.string.delete_skill_dialog_title, $composer, 0);
                $composer.endReplaceGroup();
                str = strStringResource2;
            }
            TextKt.m4781TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$144(SnapshotStateList $selectedCustomSkillNames, MutableState $inMultiSelectMode$delegate, Composer $composer, int $changed) {
        String str;
        ComposerKt.sourceInformation($composer, "C611@24993L310:SkillManagerBottomSheet.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1533915888, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheet.<anonymous> (SkillManagerBottomSheet.kt:611)");
            }
            if (SkillManagerBottomSheet$lambda$57($inMultiSelectMode$delegate)) {
                $composer.startReplaceGroup(919387973);
                ComposerKt.sourceInformation($composer, "613@25044L181");
                String strPluralStringResource = StringResources_androidKt.pluralStringResource(C2421R.plurals.delete_selected_skills_content, $selectedCustomSkillNames.size(), new Object[]{Integer.valueOf($selectedCustomSkillNames.size())}, $composer, 0);
                $composer.endReplaceGroup();
                str = strPluralStringResource;
            } else {
                $composer.startReplaceGroup(919394148);
                ComposerKt.sourceInformation($composer, "618@25241L52");
                String strStringResource = StringResources_androidKt.stringResource(C2421R.string.delete_skill_dialog_content, $composer, 0);
                $composer.endReplaceGroup();
                str = strStringResource;
            }
            TextKt.m4781TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$139(final SkillManagerViewModel $skillManagerViewModel, final SnapshotStateList $selectedCustomSkillNames, final MutableState $inMultiSelectMode$delegate, final MutableState $skillToDeleteName$delegate, final MutableState $showDeleteSkillDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C623@25373L371,635@25851L12,634@25792L143,622@25345L661:SkillManagerBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-921771925, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheet.<anonymous> (SkillManagerBottomSheet.kt:622)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1059555362, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($skillManagerViewModel);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$139$lambda$138$lambda$137($skillManagerViewModel, $selectedCustomSkillNames, $inMultiSelectMode$delegate, $skillToDeleteName$delegate, $showDeleteSkillDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) it$iv, null, false, null, ButtonDefaults.INSTANCE.m3587buttonColorsro_MJ88(ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11231getErrorTextColor0d7_KjU(), Color.INSTANCE.m6952getWhite0d7_KjU(), 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 48, 12), null, null, null, null, ComposableSingletons$SkillManagerBottomSheetKt.INSTANCE.m10464getLambda$1299340197$app_debug(), $composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$139$lambda$138$lambda$137(SkillManagerViewModel $skillManagerViewModel, SnapshotStateList $selectedCustomSkillNames, MutableState $inMultiSelectMode$delegate, MutableState $skillToDeleteName$delegate, MutableState $showDeleteSkillDialog$delegate) {
        if (SkillManagerBottomSheet$lambda$57($inMultiSelectMode$delegate)) {
            $skillManagerViewModel.deleteSkills(CollectionsKt.toSet($selectedCustomSkillNames));
            SkillManagerBottomSheet$lambda$58($inMultiSelectMode$delegate, false);
            $selectedCustomSkillNames.clear();
        } else {
            $skillManagerViewModel.deleteSkill(SkillManagerBottomSheet$lambda$29($skillToDeleteName$delegate));
        }
        SkillManagerBottomSheet$lambda$18($showDeleteSkillDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$142(final MutableState $showDeleteSkillDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C643@26073L33,643@26048L119:SkillManagerBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-798490259, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheet.<anonymous> (SkillManagerBottomSheet.kt:643)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1450008238, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$142$lambda$141$lambda$140($showDeleteSkillDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.OutlinedButton((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$SkillManagerBottomSheetKt.INSTANCE.m10466getLambda$798904993$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$142$lambda$141$lambda$140(MutableState $showDeleteSkillDialog$delegate) {
        SkillManagerBottomSheet$lambda$18($showDeleteSkillDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$146$lambda$145(MutableState $showAddSkillFromUrlDialog$delegate) {
        SkillManagerBottomSheet$lambda$3($showAddSkillFromUrlDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$148$lambda$147(CoroutineScope $scope, LazyListState $listState) {
        scrollToBottomOfList($scope, $listState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$150$lambda$149(MutableState $showAddSkillFromFeaturedListBottomSheet$delegate) {
        SkillManagerBottomSheet$lambda$9($showAddSkillFromFeaturedListBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$152$lambda$151(CoroutineScope $scope, LazyListState $listState) {
        scrollToBottomOfList($scope, $listState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$154$lambda$153(MutableState $showAddSkillFromLocalImportDialog$delegate) {
        SkillManagerBottomSheet$lambda$6($showAddSkillFromLocalImportDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$156$lambda$155(CoroutineScope $scope, LazyListState $listState) {
        scrollToBottomOfList($scope, $listState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$158$lambda$157(MutableState $showAddOrEditSkillBottomSheet$delegate, MutableIntState $skillToEditIndex$delegate) {
        SkillManagerBottomSheet$lambda$12($showAddOrEditSkillBottomSheet$delegate, false);
        $skillToEditIndex$delegate.setIntValue(-1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$160$lambda$159(CoroutineScope $scope, LazyListState $listState, MutableIntState $skillToEditIndex$delegate) {
        scrollToBottomOfList($scope, $listState);
        $skillToEditIndex$delegate.setIntValue(-1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$162$lambda$161(MutableState $showAddSkillOptionsSheet$delegate) {
        SkillManagerBottomSheet$lambda$15($showAddSkillOptionsSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$164$lambda$163(SkillManagerViewModel $skillManagerViewModel, MutableState $addSkillOptionTypeToConfirm$delegate, MutableState $showAddSkillFromFeaturedListBottomSheet$delegate, MutableState $showAddSkillFromUrlDialog$delegate, MutableState $showDisclaimerDialog$delegate, MutableState $showAddSkillOptionsSheet$delegate, AddSkillOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        $skillManagerViewModel.setValidationError(null);
        $addSkillOptionTypeToConfirm$delegate.setValue(option.getType());
        switch (WhenMappings.$EnumSwitchMapping$0[option.getType().ordinal()]) {
            case 1:
                SkillManagerBottomSheet$lambda$9($showAddSkillFromFeaturedListBottomSheet$delegate, true);
                break;
            case 2:
                SkillManagerBottomSheet$lambda$3($showAddSkillFromUrlDialog$delegate, true);
                break;
            case 3:
                SkillManagerBottomSheet$lambda$27($showDisclaimerDialog$delegate, true);
                break;
        }
        SkillManagerBottomSheet$lambda$15($showAddSkillOptionsSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$167$lambda$166$lambda$165(MutableState $showJsSkillTesterBottomSheet$delegate) {
        SkillManagerBottomSheet$lambda$21($showJsSkillTesterBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }

    private static final String SkillManagerBottomSheet$lambda$177$lambda$169(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$177$lambda$172$lambda$171(MutableState $curSecret$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $curSecret$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$177$lambda$174$lambda$173(SkillManagerViewModel $skillManagerViewModel, SkillState $it, MutableState $curSecret$delegate, MutableState $showSecretEditorDialog$delegate) {
        DataStoreRepository dataStoreRepository = $skillManagerViewModel.getDataStoreRepository();
        String name = $it.getSkill().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        dataStoreRepository.saveSecret(AgentToolsKt.getSkillSecretKey(name), SkillManagerBottomSheet$lambda$177$lambda$169($curSecret$delegate));
        SkillManagerBottomSheet$lambda$24($showSecretEditorDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$177$lambda$176$lambda$175(MutableState $showSecretEditorDialog$delegate) {
        SkillManagerBottomSheet$lambda$24($showSecretEditorDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$179$lambda$178(MutableState $showDisclaimerDialog$delegate, MutableState $addSkillOptionTypeToConfirm$delegate) {
        SkillManagerBottomSheet$lambda$27($showDisclaimerDialog$delegate, false);
        $addSkillOptionTypeToConfirm$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillManagerBottomSheet$lambda$182$lambda$181(MutableState $addSkillOptionTypeToConfirm$delegate, MutableState $showAddSkillFromLocalImportDialog$delegate, MutableState $showDisclaimerDialog$delegate) {
        AddSkillOptionType type = SkillManagerBottomSheet$lambda$35($addSkillOptionTypeToConfirm$delegate);
        if (type != null && type == AddSkillOptionType.LocalImport) {
            SkillManagerBottomSheet$lambda$6($showAddSkillFromLocalImportDialog$delegate, true);
        }
        SkillManagerBottomSheet$lambda$27($showDisclaimerDialog$delegate, false);
        $addSkillOptionTypeToConfirm$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SkillItemRow(final SkillState skillState, final boolean inMultiSelectMode, final boolean isSelectedForDeletion, final Function1<? super Boolean, Unit> function1, final Function0<Unit> function0, final Function1<? super Boolean, Unit> function12, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, final UriHandler uriHandler, Composer $composer, final int $changed) {
        Composer $composer2;
        Skill skill;
        Modifier.Companion companionM1411combinedClickablehoGz1lA;
        Function0<ComposeUiNode> function05;
        Skill skill2;
        int $dirty;
        Composer $composer$iv$iv$iv;
        Composer $composer$iv;
        Composer $composer3;
        Composer $composer$iv2;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        Composer $composer$iv$iv;
        Composer $composer4;
        Function0<ComposeUiNode> function06;
        Function0<ComposeUiNode> function07;
        Function0<ComposeUiNode> function08;
        Function0<ComposeUiNode> function09;
        Composer $composer$iv$iv2;
        Composer $composer$iv$iv$iv2;
        Composer $composer$iv3;
        final Skill skill3;
        Function0<ComposeUiNode> function010;
        Composer $composer5 = $composer.startRestartGroup(432082213);
        ComposerKt.sourceInformation($composer5, "C(SkillItemRow)P(8!2,5,3,6,7,4)790@30436L11,785@30213L5384:SkillManagerBottomSheet.kt#41d64j");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer5.changed(skillState) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer5.changed(inMultiSelectMode) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer5.changed(isSelectedForDeletion) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer5.changedInstance(function1) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty2 |= $composer5.changedInstance(function0) ? 16384 : 8192;
        }
        if (($changed & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty2 |= $composer5.changedInstance(function12) ? 131072 : 65536;
        }
        if (($changed & 1572864) == 0) {
            $dirty2 |= $composer5.changedInstance(function02) ? 1048576 : 524288;
        }
        if (($changed & 12582912) == 0) {
            $dirty2 |= $composer5.changedInstance(function03) ? 8388608 : 4194304;
        }
        if (($changed & 100663296) == 0) {
            $dirty2 |= $composer5.changedInstance(function04) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (($changed & 805306368) == 0) {
            $dirty2 |= $composer5.changedInstance(uriHandler) ? 536870912 : 268435456;
        }
        if ($composer5.shouldExecute(($dirty2 & 306783379) != 306783378, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(432082213, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillItemRow (SkillManagerBottomSheet.kt:781)");
            }
            Skill skill4 = skillState.getSkill();
            boolean isCustom = !skill4.getBuiltIn();
            Modifier modifierM1359backgroundbw27NRU$default = BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null).then((inMultiSelectMode && skill4.getBuiltIn()) ? AlphaKt.alpha(Modifier.INSTANCE, 0.5f) : Modifier.INSTANCE), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(20))), MaterialTheme.INSTANCE.getColorScheme($composer5, MaterialTheme.$stable).getSurfaceContainerLowest(), null, 2, null);
            if (isCustom) {
                $composer5.startReplaceGroup(145017608);
                ComposerKt.sourceInformation($composer5, "794@30577L143");
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer5, -1380793356, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                boolean invalid$iv = (($dirty2 & 7168) == 2048) | (($dirty2 & 112) == 32) | (($dirty2 & 896) == 256);
                skill = skill4;
                Object it$iv = $composer5.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SkillManagerBottomSheetKt.SkillItemRow$lambda$185$lambda$184(inMultiSelectMode, function1, isSelectedForDeletion);
                        }
                    };
                    $composer5.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer5);
                companionM1411combinedClickablehoGz1lA = ClickableKt.m1411combinedClickablehoGz1lA(companion, (239 & 1) != 0, (239 & 2) != 0 ? null : null, (239 & 4) != 0 ? null : null, (239 & 8) != 0 ? null : null, (239 & 16) != 0 ? null : function0, (239 & 32) != 0 ? null : null, (239 & 64) != 0, (239 & 128) != 0 ? null : null, (Function0) it$iv);
                $composer5.endReplaceGroup();
            } else {
                skill = skill4;
                $composer5.startReplaceGroup(-1380786547);
                $composer5.endReplaceGroup();
                companionM1411combinedClickablehoGz1lA = Modifier.INSTANCE;
            }
            Modifier modifier$iv = PaddingKt.m1989paddingVpY3zN4(modifierM1359backgroundbw27NRU$default.then(companionM1411combinedClickablehoGz1lA), C1654Dp.m9788constructorimpl(16), C1654Dp.m9788constructorimpl(12));
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer5, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer5, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            int $changed$iv$iv = (384 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer5, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer5, 0));
            CompositionLocalMap localMap$iv$iv = $composer5.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer5, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer5, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer5.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer5.startReusableNode();
            if ($composer5.getInserting()) {
                function05 = constructor;
                $composer5.createNode(function05);
            } else {
                function05 = constructor;
                $composer5.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer5);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer5, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i3 = ((384 >> 6) & 112) | 6;
            RowScope $this$SkillItemRow_u24lambda_u24195 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer5, -776788500, "C814@31146L4447:SkillManagerBottomSheet.kt#41d64j");
            if (inMultiSelectMode && isCustom) {
                $composer5.startReplaceGroup(-776892909);
                ComposerKt.sourceInformation($composer5, "807@30974L160");
                $composer$iv = $composer5;
                str4 = "C101@5233L9:Row.kt#2w3rfo";
                $dirty = $dirty2;
                str3 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
                $composer$iv$iv$iv = $composer5;
                $composer$iv$iv = $composer5;
                $composer$iv2 = $composer5;
                str = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
                str2 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                skill2 = skill;
                $composer3 = $composer5;
                i = -1159599143;
                CheckboxKt.Checkbox(isSelectedForDeletion, function1, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(12), 0.0f, 11, null), false, null, null, $composer5, (($dirty2 >> 6) & 14) | 384 | (($dirty2 >> 6) & 112), 56);
                $composer5.endReplaceGroup();
                $composer4 = $composer5;
            } else {
                skill2 = skill;
                $dirty = $dirty2;
                $composer$iv$iv$iv = $composer5;
                $composer$iv = $composer5;
                $composer3 = $composer5;
                $composer$iv2 = $composer5;
                str = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
                str2 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                str3 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
                str4 = "C101@5233L9:Row.kt#2w3rfo";
                i = -1159599143;
                $composer$iv$iv = $composer5;
                $composer4 = $composer5;
                $composer4.startReplaceGroup(-807617567);
                $composer4.endReplaceGroup();
            }
            Modifier modifier$iv2 = RowScope.weight$default($this$SkillItemRow_u24lambda_u24195, Modifier.INSTANCE, 1.0f, false, 2, null);
            Composer $composer$iv4 = $composer4;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer$iv4, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv2 = (0 << 3) & 112;
            String str5 = str;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, i, str5);
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv4, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer$iv4.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer$iv4, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            String str6 = str2;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, -553112988, str6);
            if (!($composer$iv4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv4.startReusableNode();
            if ($composer$iv4.getInserting()) {
                function06 = constructor2;
                $composer$iv4.createNode(function06);
            } else {
                function06 = constructor2;
                $composer$iv4.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer$iv4);
            Composer $composer6 = $composer4;
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int $changed2 = ((0 >> 6) & 112) | 6;
            ColumnScope $this$SkillItemRow_u24lambda_u24195_u24lambda_u24194 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, 827208622, "C815@31193L1957,868@33229L2358,868@33180L2407:SkillManagerBottomSheet.kt#41d64j");
            Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getTop();
            Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            String str7 = str3;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, 844473419, str7);
            Modifier modifier$iv3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer$iv4, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv3 = (432 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, -1159599143, str5);
            int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv4, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer$iv4.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer$iv4, modifier$iv3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, -553112988, str6);
            if (!($composer$iv4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv4.startReusableNode();
            if ($composer$iv4.getInserting()) {
                function07 = constructor3;
                $composer$iv4.createNode(function07);
            } else {
                function07 = constructor3;
                $composer$iv4.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer$iv4);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv3 >> 6) & 14;
            String str8 = str4;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, 1456264949, str8);
            int i6 = ((432 >> 6) & 112) | 6;
            RowScope $this$SkillItemRow_u24lambda_u24195_u24lambda_u24194_u24lambda_u24191 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, -2102509723, "C817@31327L1585,859@32948L194:SkillManagerBottomSheet.kt#41d64j");
            Modifier modifier$iv4 = PaddingKt.m1992paddingqDBjuR0$default(RowScope.weight$default($this$SkillItemRow_u24lambda_u24195_u24lambda_u24194_u24lambda_u24191, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, C1654Dp.m9788constructorimpl(2), 0.0f, 0.0f, 13, null);
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart($composer$iv4, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv4 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer$iv4, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            int $changed$iv$iv4 = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, -1159599143, str5);
            int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv4, 0));
            CompositionLocalMap localMap$iv$iv4 = $composer$iv4.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer$iv4, modifier$iv4);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv4 = (($changed$iv$iv4 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, -553112988, str6);
            if (!($composer$iv4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv4.startReusableNode();
            if ($composer$iv4.getInserting()) {
                function08 = constructor4;
                $composer$iv4.createNode(function08);
            } else {
                function08 = constructor4;
                $composer$iv4.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer$iv4);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = ($changed$iv$iv$iv4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i8 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, -1314590525, "C821@31479L1217,853@32805L10,854@32861L11,851@32707L195:SkillManagerBottomSheet.kt#41d64j");
            Alignment.Vertical verticalAlignment$iv3 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer$iv4, 844473419, str7);
            Modifier modifier$iv5 = Modifier.INSTANCE;
            Arrangement.Horizontal horizontalArrangement$iv3 = Arrangement.INSTANCE.getStart();
            int $changed$iv$iv$iv5 = ((384 >> 3) & 14) | ((384 >> 3) & 112);
            MeasurePolicy measurePolicy$iv5 = RowKt.rowMeasurePolicy(horizontalArrangement$iv3, verticalAlignment$iv3, $composer$iv4, $changed$iv$iv$iv5);
            int $changed$iv$iv5 = (384 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, -1159599143, str5);
            int compositeKeyHash$iv$iv5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv4, 0));
            CompositionLocalMap localMap$iv$iv5 = $composer$iv4.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier($composer$iv4, modifier$iv5);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv6 = (($changed$iv$iv5 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, -553112988, str6);
            if (!($composer$iv4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv4.startReusableNode();
            if ($composer$iv4.getInserting()) {
                function09 = constructor5;
                $composer$iv4.createNode(function09);
            } else {
                function09 = constructor5;
                $composer$iv4.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv5 = Updater.m6165constructorimpl($composer$iv4);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, measurePolicy$iv5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, localMap$iv$iv5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv5, Integer.valueOf(compositeKeyHash$iv$iv5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, materialized$iv$iv5, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = ($changed$iv$iv$iv6 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, 1456264949, str8);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i10 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, 1823758723, "C823@31631L10:SkillManagerBottomSheet.kt#41d64j");
            String homepage = skill2.getHomepage();
            Intrinsics.checkNotNullExpressionValue(homepage, "getHomepage(...)");
            boolean hasHomepage = !StringsKt.isBlank(homepage);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int compositeKeyHash$iv$iv6 = MaterialTheme.$stable;
            TextStyle textStyle = TextStyle.m9205copyp1EtxEg$default(materialTheme.getTypography($composer$iv4, compositeKeyHash$iv$iv6).getBodyMedium(), 0L, 0L, FontWeight.INSTANCE.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
            if (hasHomepage) {
                $composer$iv4.startReplaceGroup(1823924696);
                ComposerKt.sourceInformation($composer$iv4, "826@31736L863");
                Alignment.Vertical verticalAlignment$iv4 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal horizontalArrangement$iv4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(2));
                ComposerKt.sourceInformationMarkerStart($composer$iv4, 844473419, str7);
                Modifier modifier$iv6 = Modifier.INSTANCE;
                MeasurePolicy measurePolicy$iv6 = RowKt.rowMeasurePolicy(horizontalArrangement$iv4, verticalAlignment$iv4, $composer$iv4, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                int $changed$iv$iv6 = (432 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer$iv4, -1159599143, str5);
                int compositeKeyHash$iv$iv7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv4, 0));
                CompositionLocalMap localMap$iv$iv6 = $composer$iv4.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv6 = ComposedModifierKt.materializeModifier($composer$iv4, modifier$iv6);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv7 = (($changed$iv$iv6 << 6) & 896) | 6;
                $composer$iv$iv2 = $composer$iv4;
                $composer$iv3 = $composer$iv4;
                ComposerKt.sourceInformationMarkerStart($composer$iv4, -553112988, str6);
                if (!($composer$iv4.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv4.startReusableNode();
                if ($composer$iv4.getInserting()) {
                    function010 = constructor6;
                    $composer$iv4.createNode(function010);
                } else {
                    function010 = constructor6;
                    $composer$iv4.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv6 = Updater.m6165constructorimpl($composer$iv4);
                $composer$iv$iv$iv2 = $composer$iv4;
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, measurePolicy$iv6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, localMap$iv$iv6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv6, Integer.valueOf(compositeKeyHash$iv$iv7), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv6, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, materialized$iv$iv6, ComposeUiNode.INSTANCE.getSetModifier());
                int i11 = ($changed$iv$iv$iv7 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer$iv4, 1456264949, str8);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i12 = ((432 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer$iv4, 1500803121, "C834@32049L11,837@32198L12,838@32270L38,830@31907L420,844@32542L12,840@32344L239:SkillManagerBottomSheet.kt#41d64j");
                String name = skill2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                TextStyle textStyleM9205copyp1EtxEg$default = TextStyle.m9205copyp1EtxEg$default(textStyle, MaterialTheme.INSTANCE.getColorScheme($composer$iv4, MaterialTheme.$stable).getPrimary(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.getUnderline(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16773118, null);
                long jM11232getLinkColor0d7_KjU = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer$iv4, MaterialTheme.$stable).m11232getLinkColor0d7_KjU();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer$iv4, -1891238668, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                $composer2 = $composer3;
                skill3 = skill2;
                boolean invalid$iv2 = $composer2.changedInstance(uriHandler) | $composer2.changed(skill3);
                Object it$iv2 = $composer$iv4.rememberedValue();
                if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SkillManagerBottomSheetKt.m432xcb019852(uriHandler, skill3);
                        }
                    };
                    $composer$iv4.updateRememberedValue(value$iv2);
                    it$iv2 = value$iv2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer$iv4);
                TextKt.m4781TextNvy7gAk(name, ClickableKt.m1401clickableoSLSa3U(companion2, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv2), jM11232getLinkColor0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleM9205copyp1EtxEg$default, $composer$iv4, 0, 0, 131064);
                IconKt.m4075Iconww6aTOc(OpenInNewKt.getOpenInNew(Icons.AutoMirrored.Outlined.INSTANCE), (String) null, SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer$iv4, MaterialTheme.$stable).m11232getLinkColor0d7_KjU(), $composer$iv4, 432, 0);
                ComposerKt.sourceInformationMarkerEnd($composer$iv4);
                ComposerKt.sourceInformationMarkerEnd($composer$iv4);
                $composer$iv4.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv4);
                ComposerKt.sourceInformationMarkerEnd($composer$iv4);
                ComposerKt.sourceInformationMarkerEnd($composer$iv4);
                $composer$iv4.endReplaceGroup();
            } else {
                $composer$iv$iv2 = $composer$iv4;
                $composer$iv$iv$iv2 = $composer$iv4;
                $composer$iv3 = $composer$iv4;
                skill3 = skill2;
                $composer2 = $composer3;
                $composer$iv4.startReplaceGroup(1824790836);
                ComposerKt.sourceInformation($composer$iv4, "848@32635L35");
                String name2 = skill3.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                TextKt.m4781TextNvy7gAk(name2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, $composer$iv4, 0, 0, 131070);
                $composer$iv4.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            $composer$iv$iv$iv2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            String description = skill3.getDescription();
            if (description == null) {
                description = "";
            }
            TextKt.m4781TextNvy7gAk(StringsKt.replace$default(description, "\n", " ", false, 4, (Object) null), null, MaterialTheme.INSTANCE.getColorScheme($composer$iv4, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer$iv4, MaterialTheme.$stable).getBodySmall(), $composer$iv4, 0, 0, 131066);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            $composer$iv4.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            SwitchKt.Switch(skill3.getSelected(), function12, OffsetKt.m1945offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(-4), 1, null), null, !inMultiSelectMode, null, null, $composer$iv4, (($dirty >> 12) & 112) | 384, LocationRequestCompat.QUALITY_LOW_POWER);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            $composer$iv4.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            AnimatedVisibilityKt.AnimatedVisibility($this$SkillItemRow_u24lambda_u24195_u24lambda_u24194, !inMultiSelectMode, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-953210445, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SkillManagerBottomSheetKt.SkillItemRow$lambda$195$lambda$194$lambda$193(function02, skill3, function03, function04, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer$iv4, 54), $composer$iv4, ($changed2 & 14) | 1572864, 30);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            $composer$iv4.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer6);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            $composer$iv$iv$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer5;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SkillManagerBottomSheetKt.SkillItemRow$lambda$196(skillState, inMultiSelectMode, isSelectedForDeletion, function1, function0, function12, function02, function03, function04, uriHandler, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillItemRow$lambda$185$lambda$184(boolean $inMultiSelectMode, Function1 $onSelectionCheckedChange, boolean $isSelectedForDeletion) {
        if ($inMultiSelectMode) {
            $onSelectionCheckedChange.invoke(Boolean.valueOf(!$isSelectedForDeletion));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkillItemRow$lambda$195$lambda$194$lambda$191$lambda$190$lambda$189$lambda$188$lambda$187$lambda$186 */
    public static final Unit m432xcb019852(UriHandler $uriHandler, Skill $skill) {
        String homepage = $skill.getHomepage();
        Intrinsics.checkNotNullExpressionValue(homepage, "getHomepage(...)");
        $uriHandler.openUri(homepage);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkillItemRow$lambda$195$lambda$194$lambda$193(Function0 $onViewClick, Skill $skill, Function0 $onSecretClick, Function0 $onDeleteClick, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C869@33239L2340:SkillManagerBottomSheet.kt#41d64j");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-953210445, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.SkillItemRow.<anonymous>.<anonymous>.<anonymous> (SkillManagerBottomSheet.kt:869)");
        }
        Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
        Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 0.0f, 13, null);
        ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
        int $changed$iv$iv = (438 << 3) & 112;
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
        int i2 = ((438 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -2141768470, "C875@33447L621:SkillManagerBottomSheet.kt#41d64j");
        ButtonKt.FilledTonalButton($onViewClick, PaddingKt.m1992paddingqDBjuR0$default(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(32)), 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 11, null), false, null, null, null, null, BUTTON_CONTENT_PADDING, null, ComposableSingletons$SkillManagerBottomSheetKt.INSTANCE.getLambda$860936765$app_debug(), $composer, 817889328, 380);
        if ($skill.getRequireSecret()) {
            $composer.startReplaceGroup(-2141159662);
            ComposerKt.sourceInformation($composer, "895@34147L651");
            ButtonKt.FilledTonalButton($onSecretClick, PaddingKt.m1992paddingqDBjuR0$default(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(32)), 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 11, null), false, null, null, null, null, BUTTON_CONTENT_PADDING, null, ComposableSingletons$SkillManagerBottomSheetKt.INSTANCE.getLambda$289294466$app_debug(), $composer, 817889328, 380);
        } else {
            $composer.startReplaceGroup(2119952627);
        }
        $composer.endReplaceGroup();
        if (!$skill.getBuiltIn()) {
            $composer.startReplaceGroup(-2140379826);
            ComposerKt.sourceInformation($composer, "917@34929L628");
            ButtonKt.OutlinedButton($onDeleteClick, SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(32)), false, null, null, null, null, BUTTON_CONTENT_PADDING, null, ComposableSingletons$SkillManagerBottomSheetKt.INSTANCE.getLambda$1720599563$app_debug(), $composer, 817889328, 380);
        } else {
            $composer.startReplaceGroup(2119952627);
        }
        $composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$scrollToBottomOfList$1 */
    /* JADX INFO: compiled from: SkillManagerBottomSheet.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$scrollToBottomOfList$1", m932f = "SkillManagerBottomSheet.kt", m933i = {}, m934l = {945, 947}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LazyListState $listState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25231(LazyListState lazyListState, Continuation<? super C25231> continuation) {
            super(2, continuation);
            this.$listState = lazyListState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25231(this.$listState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 1
                switch(r1) {
                    case 0: goto L1a;
                    case 1: goto L16;
                    case 2: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L12:
                kotlin.ResultKt.throwOnFailure(r10)
                goto L55
            L16:
                kotlin.ResultKt.throwOnFailure(r10)
                goto L2b
            L1a:
                kotlin.ResultKt.throwOnFailure(r10)
                r1 = r9
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r9.label = r2
                r3 = 300(0x12c, double:1.48E-321)
                java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r3, r1)
                if (r1 != r0) goto L2b
                return r0
            L2b:
                androidx.compose.foundation.lazy.LazyListState r1 = r9.$listState
                androidx.compose.foundation.lazy.LazyListLayoutInfo r1 = r1.getLayoutInfo()
                int r1 = r1.getTotalItemsCount()
                if (r1 <= 0) goto L56
                androidx.compose.foundation.lazy.LazyListState r3 = r9.$listState
                androidx.compose.foundation.lazy.LazyListState r1 = r9.$listState
                androidx.compose.foundation.lazy.LazyListLayoutInfo r1 = r1.getLayoutInfo()
                int r1 = r1.getTotalItemsCount()
                int r4 = r1 + (-1)
                r6 = r9
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1 = 2
                r9.label = r1
                r5 = 0
                r7 = 2
                r8 = 0
                java.lang.Object r1 = androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r3, r4, r5, r6, r7, r8)
                if (r1 != r0) goto L55
                return r0
            L55:
            L56:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt.C25231.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static final void scrollToBottomOfList(CoroutineScope scope, LazyListState listState) {
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C25231(listState, null), 3, null);
    }

    private static final void AddSkillOptionsBottomSheet(final Function0<Unit> function0, final Function1<? super AddSkillOption, Unit> function1, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(1315948370);
        ComposerKt.sourceInformation($composer3, "C(AddSkillOptionsBottomSheet)957@36093L59,958@36227L1867,958@36155L1939:SkillManagerBottomSheet.kt#41d64j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1315948370, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillOptionsBottomSheet (SkillManagerBottomSheet.kt:956)");
            }
            SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer3, 6, 2);
            $composer2 = $composer3;
            ModalBottomSheetKt.m4185ModalBottomSheetYbuCTN8(function0, null, sheetState, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(-160490444, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda48
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SkillManagerBottomSheetKt.AddSkillOptionsBottomSheet$lambda$206(function1, function0, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, $dirty2 & 14, 3072, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda49
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SkillManagerBottomSheetKt.AddSkillOptionsBottomSheet$lambda$207(function0, function1, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillOptionsBottomSheet$lambda$206(Function1 $onOptionSelected, Function0 $onDismiss, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        Function0<ComposeUiNode> function04;
        Function0<ComposeUiNode> function05;
        final Function1 function1 = $onOptionSelected;
        final Function0 function06 = $onDismiss;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C959@36233L1857:SkillManagerBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160490444, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillOptionsBottomSheet.<anonymous> (SkillManagerBottomSheet.kt:959)");
            }
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 7, null);
            String str = "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            int $changed$iv$iv = (6 << 3) & 112;
            String str2 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            String str3 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
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
            String str4 = "C89@4557L9:Column.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i2 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1784619898, "C961@36307L34,962@36373L10,960@36293L191,965@36491L1593:SkillManagerBottomSheet.kt#41d64j");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.add_skill, $composer, 0), PaddingKt.m1990paddingVpY3zN4$default(PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 7, null), C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 48, 0, 131068);
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv$iv = Modifier.INSTANCE;
            Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            int $changed$iv$iv2 = (48 << 3) & 112;
            Composer $composer$iv$iv = $composer;
            ComposerKt.sourceInformationMarkerStart($composer$iv$iv, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv$iv, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer$iv$iv.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer$iv$iv, modifier$iv$iv);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            Composer $composer$iv$iv$iv = $composer$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer$iv$iv$iv.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv$iv$iv.startReusableNode();
            if ($composer$iv$iv$iv.getInserting()) {
                function02 = constructor2;
                $composer$iv$iv$iv.createNode(function02);
            } else {
                function02 = constructor2;
                $composer$iv$iv$iv.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer$iv$iv$iv);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
            Composer $composer$iv = $composer$iv$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer$iv, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i4 = ((48 >> 6) & 112) | 6;
            Composer $composer2 = $composer$iv;
            ComposerKt.sourceInformationMarkerStart($composer2, 891780438, "C:SkillManagerBottomSheet.kt#41d64j");
            $composer2.startReplaceGroup(-1910894981);
            ComposerKt.sourceInformation($composer2, "*970@36700L412,967@36607L1459");
            Iterable $this$forEach$iv = ADD_SKILL_OPTIONS;
            int $i$f$forEach = 0;
            for (Object element$iv : $this$forEach$iv) {
                Iterable $this$forEach$iv2 = $this$forEach$iv;
                final AddSkillOption option = (AddSkillOption) element$iv;
                int $i$f$forEach2 = $i$f$forEach;
                Modifier materialized$iv$iv3 = materialized$iv$iv2;
                int compositeKeyHash$iv$iv3 = compositeKeyHash$iv$iv2;
                CompositionLocalMap localMap$iv$iv3 = localMap$iv$iv2;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer2, 1345713696, "CC(remember):SkillManagerBottomSheet.kt#9igjgp");
                boolean invalid$iv = $composer2.changed(function1) | $composer2.changed(option) | $composer2.changed(function06);
                Composer $this$cache$iv = $composer2;
                Object it$iv = $this$cache$iv.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$$ExternalSyntheticLambda46
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SkillManagerBottomSheetKt.m431x5b51e123(function1, option, function06);
                        }
                    };
                    $this$cache$iv.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                Modifier modifier$iv2 = PaddingKt.m1989paddingVpY3zN4(ClickableKt.m1401clickableoSLSa3U(modifierFillMaxWidth$default, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv), C1654Dp.m9788constructorimpl(16), C1654Dp.m9788constructorimpl(8));
                Composer $composer$iv2 = $composer2;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
                Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getTop();
                int $changed$iv$iv$iv3 = $changed$iv$iv$iv2;
                int $changed$iv$iv$iv4 = ((0 >> 3) & 14) | ((0 >> 3) & 112);
                MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer$iv2, $changed$iv$iv$iv4);
                int $changed$iv$iv3 = (0 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, -1159599143, str2);
                int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv2, 0));
                CompositionLocalMap localMap$iv$iv4 = $composer$iv2.getCurrentCompositionLocalMap();
                Composer $composer$iv$iv2 = $composer$iv$iv;
                Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer$iv2, modifier$iv2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv5 = (($changed$iv$iv3 << 6) & 896) | 6;
                Composer $composer$iv$iv$iv2 = $composer$iv$iv$iv;
                Composer $composer$iv$iv$iv3 = $composer$iv;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, -553112988, str3);
                if (!($composer$iv2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv2.startReusableNode();
                if ($composer$iv2.getInserting()) {
                    function03 = constructor3;
                    $composer$iv2.createNode(function03);
                } else {
                    function03 = constructor3;
                    $composer$iv2.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer$iv2);
                Composer $composer3 = $composer2;
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = ($changed$iv$iv$iv5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i6 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, -273094066, "C983@37201L853:SkillManagerBottomSheet.kt#41d64j");
                Modifier modifier$iv3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer$iv2, 1341605231, str);
                Arrangement.Vertical verticalArrangement$iv3 = Arrangement.INSTANCE.getTop();
                Alignment.Horizontal horizontalAlignment$iv3 = Alignment.INSTANCE.getStart();
                String str5 = str;
                MeasurePolicy measurePolicy$iv4 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv3, horizontalAlignment$iv3, $composer$iv2, ((6 >> 3) & 14) | ((6 >> 3) & 112));
                int $changed$iv$iv4 = (6 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, -1159599143, str2);
                int compositeKeyHash$iv$iv5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv2, 0));
                CompositionLocalMap localMap$iv$iv5 = $composer$iv2.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier($composer$iv2, modifier$iv3);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv6 = (($changed$iv$iv4 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, -553112988, str3);
                if (!($composer$iv2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv2.startReusableNode();
                if ($composer$iv2.getInserting()) {
                    function04 = constructor4;
                    $composer$iv2.createNode(function04);
                } else {
                    function04 = constructor4;
                    $composer$iv2.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer$iv2);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv5, ComposeUiNode.INSTANCE.getSetModifier());
                int i7 = ($changed$iv$iv$iv6 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, 2093002350, str4);
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                int i8 = ((6 >> 6) & 112) | 6;
                String str6 = str4;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, -1771760811, "C985@37300L425,995@37796L39,996@37875L10,997@37935L11,994@37774L266:SkillManagerBottomSheet.kt#41d64j");
                Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal horizontalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(16));
                Modifier modifier$iv4 = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(4), 7, null);
                Arrangement.Horizontal horizontalArrangement$iv2 = horizontalM1843spacedBy0680j_4;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv5 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer$iv2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                int $changed$iv$iv5 = (438 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, -1159599143, str2);
                int compositeKeyHash$iv$iv6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv2, 0));
                CompositionLocalMap localMap$iv$iv6 = $composer$iv2.getCurrentCompositionLocalMap();
                String str7 = str2;
                Modifier materialized$iv$iv6 = ComposedModifierKt.materializeModifier($composer$iv2, modifier$iv4);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv7 = (($changed$iv$iv5 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, -553112988, str3);
                if (!($composer$iv2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv2.startReusableNode();
                if ($composer$iv2.getInserting()) {
                    function05 = constructor5;
                    $composer$iv2.createNode(function05);
                } else {
                    function05 = constructor5;
                    $composer$iv2.useNode();
                }
                String str8 = str3;
                Composer $this$Layout_u24lambda_u240$iv$iv5 = Updater.m6165constructorimpl($composer$iv2);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, measurePolicy$iv5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, localMap$iv$iv6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv5, Integer.valueOf(compositeKeyHash$iv$iv6), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, materialized$iv$iv6, ComposeUiNode.INSTANCE.getSetModifier());
                int i9 = ($changed$iv$iv$iv7 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i10 = ((438 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, 1074262348, "C990@37532L77,991@37631L33,991@37688L10,991@37626L83:SkillManagerBottomSheet.kt#41d64j");
                IconKt.m4075Iconww6aTOc(option.getIcon(), (String) null, SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(24)), 0L, $composer$iv2, 432, 8);
                TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(option.getTitleResId(), $composer$iv2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer$iv2, MaterialTheme.$stable).getBodyLarge(), $composer$iv2, 0, 0, 131070);
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                $composer$iv2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(option.getDescriptionResId(), $composer$iv2, 0), PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(40), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme($composer$iv2, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer$iv2, MaterialTheme.$stable).getBodySmall(), $composer$iv2, 48, 0, 131064);
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                $composer$iv2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                $composer$iv2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                function1 = $onOptionSelected;
                function06 = $onDismiss;
                $this$forEach$iv = $this$forEach$iv2;
                materialized$iv$iv2 = materialized$iv$iv3;
                $i$f$forEach = $i$f$forEach2;
                compositeKeyHash$iv$iv2 = compositeKeyHash$iv$iv3;
                localMap$iv$iv2 = localMap$iv$iv3;
                $composer$iv$iv = $composer$iv$iv2;
                $changed$iv$iv$iv2 = $changed$iv$iv$iv3;
                $composer$iv = $composer$iv$iv$iv3;
                $composer$iv$iv$iv = $composer$iv$iv$iv2;
                $composer2 = $composer3;
                str = str5;
                str4 = str6;
                str2 = str7;
                str3 = str8;
            }
            Composer $composer4 = $composer2;
            Composer $composer$iv$iv$iv4 = $composer$iv$iv$iv;
            $composer4.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            $composer$iv$iv$iv4.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddSkillOptionsBottomSheet$lambda$206$lambda$205$lambda$204$lambda$203$lambda$199$lambda$198 */
    public static final Unit m431x5b51e123(Function1 $onOptionSelected, AddSkillOption $option, Function0 $onDismiss) {
        $onOptionSelected.invoke($option);
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            String id = GalleryEvent.BUTTON_CLICKED.getId();
            Bundle $this$AddSkillOptionsBottomSheet_u24lambda_u24206_u24lambda_u24205_u24lambda_u24204_u24lambda_u24203_u24lambda_u24199_u24lambda_u24198_u24lambda_u24197 = new Bundle();
            $this$AddSkillOptionsBottomSheet_u24lambda_u24206_u24lambda_u24205_u24lambda_u24204_u24lambda_u24203_u24lambda_u24199_u24lambda_u24198_u24lambda_u24197.putString("event_type", "agent_skills_add_skill");
            $this$AddSkillOptionsBottomSheet_u24lambda_u24206_u24lambda_u24205_u24lambda_u24204_u24lambda_u24203_u24lambda_u24199_u24lambda_u24198_u24lambda_u24197.putString("button_id", $option.getType().toString());
            Unit unit = Unit.INSTANCE;
            firebaseAnalytics.logEvent(id, $this$AddSkillOptionsBottomSheet_u24lambda_u24206_u24lambda_u24205_u24lambda_u24204_u24lambda_u24203_u24lambda_u24199_u24lambda_u24198_u24lambda_u24197);
        }
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }
}
