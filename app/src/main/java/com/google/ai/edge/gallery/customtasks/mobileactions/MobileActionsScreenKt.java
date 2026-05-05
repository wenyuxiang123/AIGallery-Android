package com.google.ai.edge.gallery.customtasks.mobileactions;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.rounded.ArticleKt;
import androidx.compose.material.icons.outlined.CalendarMonthKt;
import androidx.compose.material.icons.outlined.EmailKt;
import androidx.compose.material.icons.outlined.FlashlightOnKt;
import androidx.compose.material.icons.outlined.MapKt;
import androidx.compose.material.icons.outlined.PersonAddKt;
import androidx.compose.material.icons.outlined.WifiKt;
import androidx.compose.material.icons.rounded.FunctionsKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TabIndicatorScope;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.AlphaKt;
import androidx.compose.p000ui.focus.FocusManager;
import androidx.compose.p000ui.graphics.ColorProducer;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.semantics.LiveRegionMode;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.window.core.layout.WindowSizeClass;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.AnalyticsKt;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.GalleryEvent;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.MarkdownTextKt;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageWarning;
import com.google.ai.edge.gallery.ui.common.chat.MessageBodyWarningKt;
import com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateUiState;
import com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateViewModel;
import com.google.ai.edge.gallery.ui.common.textandvoiceinput.VoiceRecognizerOverlayKt;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: MobileActionsScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001ao\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001aw\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010!\u001a\u00020\"2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cH\u0007¢\u0006\u0004\b#\u0010$\u001a\u0018\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)²\u0006\n\u0010*\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020.X\u008a\u0084\u0002²\u0006\n\u0010/\u001a\u000200X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000202X\u008a\u008e\u0002²\u0006\n\u00103\u001a\u000204X\u008a\u008e\u0002²\u0006\n\u00105\u001a\u000202X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u00107\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u00108\u001a\u00020\u0001X\u008a\u008e\u0002"}, m922d2 = {"TAG", "", "PROMPT_TEMPLATES", "", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/PromptTemplate;", "SAMPLE_ACTION_ITEMS", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/SampleActionItem;", "TABS", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/Tab;", "MobileActionsScreen", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "mobileActionsViewModel", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/MobileActionsViewModel;", "bottomPadding", "Landroidx/compose/ui/unit/Dp;", "setAppBarControlsDisabled", "Lkotlin/Function1;", "", "curActions", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/Action;", "tools", "Lcom/google/ai/edge/litertlm/ToolProvider;", "onProcessingStarted", "Lkotlin/Function0;", "MobileActionsScreen-aA_HZ9I", "(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lcom/google/ai/edge/gallery/customtasks/mobileactions/MobileActionsViewModel;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/SnapshotStateList;Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "MainUi", "viewModel", "holdToDictateViewModel", "Lcom/google/ai/edge/gallery/ui/common/textandvoiceinput/HoldToDictateViewModel;", "MainUi-_-WMjBM", "(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Ljava/util/List;FLcom/google/ai/edge/gallery/customtasks/mobileactions/MobileActionsViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/google/ai/edge/gallery/ui/common/textandvoiceinput/HoldToDictateViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "genFormattedFunctionCall", "action", "resources", "Landroid/content/res/Resources;", "app_debug", "recordAudioPermissionGranted", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "holdToDictateUiState", "Lcom/google/ai/edge/gallery/ui/common/textandvoiceinput/HoldToDictateUiState;", "uiState", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/MobileActionsUiState;", "curAmplitude", "", "clearInputTextTrigger", "", "selectedTabIndex", "doneGeneratingResponse", "showErrorDialog", "errorDialogContent"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class MobileActionsScreenKt {
    private static final List<PromptTemplate> PROMPT_TEMPLATES = CollectionsKt.listOf((Object[]) new PromptTemplate[]{new PromptTemplate(C2421R.string.prompt_template_label_flash_on, "Turn on flashlight"), new PromptTemplate(C2421R.string.prompt_template_label_flash_off, "Turn off flashlight"), new PromptTemplate(C2421R.string.prompt_template_label_create_contact, "Create contact John Smith with email address js@example.com and phone number 123 456 7890."), new PromptTemplate(C2421R.string.prompt_template_label_send_email, "Send an email to js@example.com with subject \"Meeting\" and body \"Hi John, let's meet at 3pm tomorrow.\""), new PromptTemplate(C2421R.string.prompt_template_label_create_calendar_event, "Create a calendar event at 2:30pm tomorrow for \"team meeting\""), new PromptTemplate(C2421R.string.prompt_template_label_show_location_on_map, "Show Googleplex on map"), new PromptTemplate(C2421R.string.prompt_template_label_open_wifi_settings, "Open WIFI settings")});
    private static final List<SampleActionItem> SAMPLE_ACTION_ITEMS = CollectionsKt.listOf((Object[]) new SampleActionItem[]{new SampleActionItem(C2421R.string.prompt_template_label_flash_on_off, FlashlightOnKt.getFlashlightOn(Icons.Outlined.INSTANCE)), new SampleActionItem(C2421R.string.prompt_template_label_create_contact, PersonAddKt.getPersonAdd(Icons.Outlined.INSTANCE)), new SampleActionItem(C2421R.string.prompt_template_label_send_email, EmailKt.getEmail(Icons.Outlined.INSTANCE)), new SampleActionItem(C2421R.string.prompt_template_label_create_calendar_event, CalendarMonthKt.getCalendarMonth(Icons.Outlined.INSTANCE)), new SampleActionItem(C2421R.string.prompt_template_label_show_location_on_map, MapKt.getMap(Icons.Outlined.INSTANCE)), new SampleActionItem(C2421R.string.prompt_template_label_open_wifi_settings, WifiKt.getWifi(Icons.Outlined.INSTANCE))});
    private static final List<Tab> TABS = CollectionsKt.listOf((Object[]) new Tab[]{new Tab(C2421R.string.mobile_actions_tab_model_response, ArticleKt.getArticle(Icons.AutoMirrored.Rounded.INSTANCE)), new Tab(C2421R.string.mobile_actions_tab_function_called, FunctionsKt.getFunctions(Icons.Rounded.INSTANCE))});
    private static final String TAG = "AGMAScreen";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$95(Task task, ModelManagerViewModel modelManagerViewModel, List list, float f, MobileActionsViewModel mobileActionsViewModel, Function1 function1, SnapshotStateList snapshotStateList, HoldToDictateViewModel holdToDictateViewModel, Function0 function0, int i, int i2, Composer composer, int i3) {
        m10520MainUi_WMjBM(task, modelManagerViewModel, list, f, mobileActionsViewModel, function1, snapshotStateList, holdToDictateViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MobileActionsScreen_aA_HZ9I$lambda$7(Task task, ModelManagerViewModel modelManagerViewModel, MobileActionsViewModel mobileActionsViewModel, float f, Function1 function1, SnapshotStateList snapshotStateList, List list, Function0 function0, int i, int i2, Composer composer, int i3) {
        m10521MobileActionsScreenaA_HZ9I(task, modelManagerViewModel, mobileActionsViewModel, f, function1, snapshotStateList, list, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0243  */
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
    /* JADX INFO: renamed from: MobileActionsScreen-aA_HZ9I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10521MobileActionsScreenaA_HZ9I(final com.google.ai.edge.gallery.data.Task r48, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r49, com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel r50, final float r51, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r52, final androidx.compose.runtime.snapshots.SnapshotStateList<com.google.ai.edge.gallery.customtasks.mobileactions.Action> r53, final java.util.List<? extends com.google.ai.edge.litertlm.ToolProvider> r54, final kotlin.jvm.functions.Function0<kotlin.Unit> r55, androidx.compose.runtime.Composer r56, final int r57, final int r58) {
        /*
            Method dump skipped, instruction units count: 1191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt.m10521MobileActionsScreenaA_HZ9I(com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel, float, kotlin.jvm.functions.Function1, androidx.compose.runtime.snapshots.SnapshotStateList, java.util.List, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean MobileActionsScreen_aA_HZ9I$lambda$1(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MobileActionsScreen_aA_HZ9I$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MobileActionsScreen_aA_HZ9I$lambda$4$lambda$3(MutableState $recordAudioPermissionGranted$delegate, boolean permissionGranted) {
        if (permissionGranted) {
            MobileActionsScreen_aA_HZ9I$lambda$2($recordAudioPermissionGranted$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x11b8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x18c2  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x18ce  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x18d2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x1a2f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x1a3b  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x1a41  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x1ae9  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x1cd0  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x1cdc  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x1ce0  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x1dbd  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x1dcf  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x1f50  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x2003  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x201a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c9  */
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
    /* JADX INFO: renamed from: MainUi-_-WMjBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10520MainUi_WMjBM(final com.google.ai.edge.gallery.data.Task r237, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r238, final java.util.List<? extends com.google.ai.edge.litertlm.ToolProvider> r239, final float r240, final com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel r241, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r242, final androidx.compose.runtime.snapshots.SnapshotStateList<com.google.ai.edge.gallery.customtasks.mobileactions.Action> r243, com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateViewModel r244, final kotlin.jvm.functions.Function0<kotlin.Unit> r245, androidx.compose.runtime.Composer r246, final int r247, final int r248) {
        /*
            Method dump skipped, instruction units count: 8271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt.m10520MainUi_WMjBM(com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, java.util.List, float, com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel, kotlin.jvm.functions.Function1, androidx.compose.runtime.snapshots.SnapshotStateList, com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final ModelManagerUiState MainUi___WMjBM$lambda$8(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    private static final HoldToDictateUiState MainUi___WMjBM$lambda$10(State<HoldToDictateUiState> state) {
        Object thisObj$iv = state.getValue();
        return (HoldToDictateUiState) thisObj$iv;
    }

    private static final MobileActionsUiState MainUi___WMjBM$lambda$11(State<MobileActionsUiState> state) {
        Object thisObj$iv = state.getValue();
        return (MobileActionsUiState) thisObj$iv;
    }

    private static final int MainUi___WMjBM$lambda$13(MutableIntState $curAmplitude$delegate) {
        MutableIntState $this$getValue$iv = $curAmplitude$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private static final long MainUi___WMjBM$lambda$16(MutableLongState $clearInputTextTrigger$delegate) {
        MutableLongState $this$getValue$iv = $clearInputTextTrigger$delegate;
        return $this$getValue$iv.getLongValue();
    }

    private static final int MainUi___WMjBM$lambda$19(MutableIntState $selectedTabIndex$delegate) {
        MutableIntState $this$getValue$iv = $selectedTabIndex$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private static final boolean MainUi___WMjBM$lambda$22(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void MainUi___WMjBM$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MainUi___WMjBM$lambda$25(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void MainUi___WMjBM$lambda$26(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String MainUi___WMjBM$lambda$28(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult MainUi___WMjBM$lambda$34$lambda$33(final MobileActionsViewModel $viewModel, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$MainUi___WMjBM$lambda$34$lambda$33$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                $viewModel.cleanUp();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$40$lambda$39(final CoroutineScope $scope, Function0 $onProcessingStarted, final MobileActionsViewModel $viewModel, Model $model, List $tools, FocusManager $focusManager, MutableIntState $selectedTabIndex$delegate, MutableLongState $clearInputTextTrigger$delegate, final MutableState $doneGeneratingResponse$delegate, final SnapshotStateList $curActions, final Context $context, final Resources $resources, final SnackbarHostState $snackbarHostState, final String $noFunctionCallSnackbarMessage, final MutableState $errorDialogContent$delegate, final MutableState $showErrorDialog$delegate, Task $task, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getMain(), null, new MobileActionsScreenKt$MainUi$send$1$1$1($focusManager, $selectedTabIndex$delegate, $clearInputTextTrigger$delegate, null), 2, null);
        $onProcessingStarted.invoke();
        MainUi___WMjBM$lambda$23($doneGeneratingResponse$delegate, false);
        $viewModel.processUserPrompt($model, text, $tools, new Function0() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobileActionsScreenKt.MainUi___WMjBM$lambda$40$lambda$39$lambda$36($curActions, $viewModel, $context, $resources, $scope, $doneGeneratingResponse$delegate, $snackbarHostState, $noFunctionCallSnackbarMessage);
            }
        }, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MobileActionsScreenKt.MainUi___WMjBM$lambda$40$lambda$39$lambda$37($doneGeneratingResponse$delegate, $errorDialogContent$delegate, $showErrorDialog$delegate, (String) obj);
            }
        });
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            String id = GalleryEvent.GENERATE_ACTION.getId();
            Bundle $this$MainUi___WMjBM_u24lambda_u2440_u24lambda_u2439_u24lambda_u2438 = new Bundle();
            $this$MainUi___WMjBM_u24lambda_u2440_u24lambda_u2439_u24lambda_u2438.putString("capability_name", $task.getId());
            $this$MainUi___WMjBM_u24lambda_u2440_u24lambda_u2439_u24lambda_u2438.putString("model_id", $model.getName());
            Unit unit = Unit.INSTANCE;
            firebaseAnalytics.logEvent(id, $this$MainUi___WMjBM_u24lambda_u2440_u24lambda_u2439_u24lambda_u2438);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$40$lambda$39$lambda$36(SnapshotStateList $curActions, MobileActionsViewModel $viewModel, Context $context, Resources $resources, CoroutineScope $scope, MutableState $doneGeneratingResponse$delegate, SnackbarHostState $snackbarHostState, String $noFunctionCallSnackbarMessage) {
        MainUi___WMjBM$lambda$23($doneGeneratingResponse$delegate, true);
        Log.d(TAG, "Actions count: " + $curActions.size());
        if ($curActions.isEmpty()) {
            $viewModel.setNoFunctionRecognized(true);
            BuildersKt__Builders_commonKt.launch$default($scope, null, null, new MobileActionsScreenKt$MainUi$send$1$1$2$2($snackbarHostState, $noFunctionCallSnackbarMessage, null), 3, null);
        } else {
            List errors = new ArrayList();
            Iterator it = $curActions.iterator();
            while (it.hasNext()) {
                Action action = (Action) it.next();
                String curError = $viewModel.performAction(action, $context);
                if (curError.length() == 0) {
                    $viewModel.addFunctionCallDetails(genFormattedFunctionCall(action, $resources));
                } else {
                    errors.add(curError);
                }
            }
            if (!errors.isEmpty()) {
                BuildersKt__Builders_commonKt.launch$default($scope, null, null, new MobileActionsScreenKt$MainUi$send$1$1$2$1($snackbarHostState, errors, null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$40$lambda$39$lambda$37(MutableState $doneGeneratingResponse$delegate, MutableState $errorDialogContent$delegate, MutableState $showErrorDialog$delegate, String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        MainUi___WMjBM$lambda$23($doneGeneratingResponse$delegate, true);
        $errorDialogContent$delegate.setValue(error);
        MainUi___WMjBM$lambda$26($showErrorDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MainUi___WMjBM$lambda$84$lambda$82$lambda$46$lambda$45$lambda$44$lambda$42$lambda$41 */
    public static final Unit m453xa50680f0(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(0.7f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$84$lambda$82$lambda$58$lambda$49(long $taskColor, MutableIntState $selectedTabIndex$delegate, TabIndicatorScope PrimaryTabRow, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(PrimaryTabRow, "$this$PrimaryTabRow");
        ComposerKt.sourceInformation($composer, "C508@19604L245:MobileActionsScreen.kt#okf2md");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-569568331, $changed, -1, "com.google.ai.edge.gallery.customtasks.mobileactions.MainUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MobileActionsScreen.kt:508)");
        }
        TabRowDefaults.INSTANCE.m4658PrimaryIndicator10LGxhE(PrimaryTabRow.tabIndicatorOffset(Modifier.INSTANCE, MainUi___WMjBM$lambda$19($selectedTabIndex$delegate), true), C1654Dp.INSTANCE.m9808getUnspecifiedD9Ej5fM(), 0.0f, $taskColor, null, $composer, (TabRowDefaults.$stable << 15) | 48, 20);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$84$lambda$82$lambda$58$lambda$57(State $uiState$delegate, final MutableIntState $selectedTabIndex$delegate, final long $taskColor, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C*522@20270L37,521@20186L28,523@20336L1371,518@20054L1674:MobileActionsScreen.kt#okf2md");
        boolean z = true;
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1187539745, $changed, -1, "com.google.ai.edge.gallery.customtasks.mobileactions.MainUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MobileActionsScreen.kt:516)");
            }
            int i = 0;
            for (final Tab tab : TABS) {
                final int index = i;
                int i2 = i + 1;
                final boolean enabled = (index == 0 || (index == z && !MainUi___WMjBM$lambda$11($uiState$delegate).getNoFunctionRecognized())) ? z : false;
                boolean z2 = MainUi___WMjBM$lambda$19($selectedTabIndex$delegate) == index ? z : false;
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 1235618148, "CC(remember):MobileActionsScreen.kt#9igjgp");
                boolean invalid$iv = $composer.changed(enabled);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MobileActionsScreenKt.m454x748b43d5(enabled, (GraphicsLayerScope) obj);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) it$iv);
                ComposerKt.sourceInformationMarkerStart($composer, 1235615451, "CC(remember):MobileActionsScreen.kt#9igjgp");
                boolean invalid$iv2 = $composer.changed(index);
                Object it$iv2 = $composer.rememberedValue();
                if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MobileActionsScreenKt.m455x9e54a959(index, $selectedTabIndex$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv2);
                    it$iv2 = value$iv2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                TabKt.m4650TabwqdebIU(z2, (Function0) it$iv2, modifierGraphicsLayer, enabled, ComposableLambdaKt.rememberComposableLambda(1732515642, z, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MobileActionsScreenKt.MainUi___WMjBM$lambda$84$lambda$82$lambda$58$lambda$57$lambda$56(index, $taskColor, tab, $selectedTabIndex$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer, 54), null, 0L, 0L, null, $composer, 24576, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
                i = i2;
                z = z;
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
    /* JADX INFO: renamed from: MainUi___WMjBM$lambda$84$lambda$82$lambda$58$lambda$57$lambda$53$lambda$52 */
    public static final Unit m455x9e54a959(int $index, MutableIntState $selectedTabIndex$delegate) {
        $selectedTabIndex$delegate.setIntValue($index);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MainUi___WMjBM$lambda$84$lambda$82$lambda$58$lambda$57$lambda$51$lambda$50 */
    public static final Unit m454x748b43d5(boolean $enabled, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha($enabled ? 1.0f : 0.3f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$84$lambda$82$lambda$58$lambda$57$lambda$56(int $index, long $taskColor, Tab $tab, MutableIntState $selectedTabIndex$delegate, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        final long titleColor;
        ComposerKt.sourceInformation($composer, "C524@20360L1325:MobileActionsScreen.kt#okf2md");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-98120010, $changed, -1, "com.google.ai.edge.gallery.customtasks.mobileactions.MainUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MobileActionsScreen.kt:524)");
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i2 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1426190307, "C531@20745L236,538@21050L30,540@21156L14,542@21248L10,537@21006L655:MobileActionsScreen.kt#okf2md");
            if (MainUi___WMjBM$lambda$19($selectedTabIndex$delegate) == $index) {
                $composer.startReplaceGroup(1062373797);
                $composer.endReplaceGroup();
                titleColor = $taskColor;
            } else {
                $composer.startReplaceGroup(1062375948);
                ComposerKt.sourceInformation($composer, "530@20692L11");
                titleColor = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer.endReplaceGroup();
            }
            IconKt.m4075Iconww6aTOc($tab.getIcon(), (String) null, AlphaKt.alpha(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), 0.7f), titleColor, $composer, 432, 0);
            String strStringResource = StringResources_androidKt.stringResource($tab.getLabelResId(), $composer, 0);
            ComposerKt.sourceInformationMarkerStart($composer, 1062390410, "CC(remember):MobileActionsScreen.kt#9igjgp");
            boolean invalid$iv = $composer.changed(titleColor);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = (ColorProducer) new ColorProducer() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$MainUi$4$1$4$2$3$1$1$1
                    @Override // androidx.compose.p000ui.graphics.ColorProducer
                    public final long mo3149invoke0d7_KjU() {
                        return titleColor;
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BasicTextKt.m2380BasicTextRWo7tUw(strStringResource, (Modifier) null, TextStyle.m9205copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), 0L, 0L, FontWeight.INSTANCE.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 1, 0, (ColorProducer) it$iv, TextAutoSize.INSTANCE.m2476StepBasedvU0ePk(TextUnitKt.getSp(9), TextUnitKt.getSp(14), TextUnitKt.getSp(1)), $composer, 1572864, 186);
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
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform MainUi___WMjBM$lambda$84$lambda$82$lambda$70$lambda$64$lambda$63(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((Number) AnimatedContent.getTargetState()).intValue() > ((Number) AnimatedContent.getInitialState()).intValue()) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(MobileActionsScreenKt.m456x6fdb6691(((Integer) obj).intValue()));
                }
            }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(MobileActionsScreenKt.m457x6fdb66a7(((Integer) obj).intValue()));
                }
            }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(50, 0, null, 6, null), 0.0f, 2, null)));
        }
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(MobileActionsScreenKt.m458x6fdb66a8(((Integer) obj).intValue()));
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(MobileActionsScreenKt.m459x6fdb66a9(((Integer) obj).intValue()));
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(50, 0, null, 6, null), 0.0f, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MainUi___WMjBM$lambda$84$lambda$82$lambda$70$lambda$64$lambda$63$lambda$59 */
    public static final int m456x6fdb6691(int it) {
        return 40;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MainUi___WMjBM$lambda$84$lambda$82$lambda$70$lambda$64$lambda$63$lambda$60 */
    public static final int m457x6fdb66a7(int it) {
        return -40;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MainUi___WMjBM$lambda$84$lambda$82$lambda$70$lambda$64$lambda$63$lambda$61 */
    public static final int m458x6fdb66a8(int it) {
        return -40;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MainUi___WMjBM$lambda$84$lambda$82$lambda$70$lambda$64$lambda$63$lambda$62 */
    public static final int m459x6fdb66a9(int it) {
        return 40;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$84$lambda$82$lambda$70$lambda$69(MutableIntState $selectedTabIndex$delegate, State $uiState$delegate, final MutableState $doneGeneratingResponse$delegate, AnimatedContentScope AnimatedContent, int it, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        int $changed$iv;
        Function0<ComposeUiNode> function02;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        ComposerKt.sourceInformation($composer, "C:MobileActionsScreen.kt#okf2md");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(895170053, $changed, -1, "com.google.ai.edge.gallery.customtasks.mobileactions.MainUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MobileActionsScreen.kt:577)");
        }
        if (MainUi___WMjBM$lambda$19($selectedTabIndex$delegate) == 0) {
            $composer.startReplaceGroup(559220095);
            ComposerKt.sourceInformation($composer, "578@22636L1016");
            Modifier modifier$iv = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
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
                function02 = constructor;
                $composer.createNode(function02);
            } else {
                function02 = constructor;
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
            ComposerKt.sourceInformationMarkerStart($composer, -2027893972, "C579@22718L47,583@22953L313,580@22786L545:MobileActionsScreen.kt#okf2md");
            final String cdResponse = StringResources_androidKt.stringResource(C2421R.string.cd_model_response_text, $composer, 0);
            String modelResponse = MainUi___WMjBM$lambda$11($uiState$delegate).getModelResponse();
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1735706829, "CC(remember):MobileActionsScreen.kt#9igjgp");
            boolean invalid$iv = $composer.changed(cdResponse);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MobileActionsScreenKt.m460x69452ace(cdResponse, $doneGeneratingResponse$delegate, (SemanticsPropertyReceiver) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            MarkdownTextKt.m10879MarkdownTextjA1GFJw(modelResponse, PaddingKt.m1988padding3ABfNKs(SemanticsModifierKt.semantics(companion, true, (Function1) it$iv), C1654Dp.m9788constructorimpl(16)), false, 0L, 0L, $composer, 0, 28);
            if (MainUi___WMjBM$lambda$11($uiState$delegate).getNoFunctionRecognized()) {
                $composer.startReplaceGroup(-2027234727);
                ComposerKt.sourceInformation($composer, "596@23511L49,594@23411L199");
                MessageBodyWarningKt.MessageBodyWarning(new ChatMessageWarning(StringResources_androidKt.stringResource(C2421R.string.warning_no_function_call, $composer, 0)), $composer, 0);
            } else {
                $composer.startReplaceGroup(-2050443218);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endReplaceGroup();
        } else {
            if (MainUi___WMjBM$lambda$19($selectedTabIndex$delegate) == 1) {
                $composer.startReplaceGroup(560335940);
                ComposerKt.sourceInformation($composer, "604@23775L563");
                Modifier modifier$iv2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
                int $changed$iv2 = 54;
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
                MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                int $changed$iv$iv2 = (54 << 3) & 112;
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
                    function0 = constructor2;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor2;
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
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int $changed2 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 492416649, "C:MobileActionsScreen.kt#okf2md");
                $composer.startReplaceGroup(-2062325574);
                ComposerKt.sourceInformation($composer, "*609@24041L64");
                Iterator it2 = MainUi___WMjBM$lambda$11($uiState$delegate).getFunctionCallDetails().iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    int index = i4;
                    i4++;
                    String details = (String) it2.next();
                    Iterator it3 = it2;
                    int $changed3 = $changed2;
                    int $changed$iv$iv$iv3 = $changed$iv$iv$iv2;
                    MarkdownTextKt.m10879MarkdownTextjA1GFJw(details, PaddingKt.m1988padding3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), false, 0L, 0L, $composer, 48, 28);
                    if (index != MainUi___WMjBM$lambda$11($uiState$delegate).getFunctionCallDetails().size() - 1) {
                        $composer.startReplaceGroup(492636035);
                        ComposerKt.sourceInformation($composer, "612@24206L66");
                        $changed$iv = $changed$iv2;
                        DividerKt.m3928HorizontalDivider9IZ8Weo(PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 0.0f, 0L, $composer, 6, 6);
                    } else {
                        $changed$iv = $changed$iv2;
                        $composer.startReplaceGroup(468644887);
                    }
                    $composer.endReplaceGroup();
                    $changed$iv2 = $changed$iv;
                    it2 = it3;
                    $changed2 = $changed3;
                    $changed$iv$iv$iv2 = $changed$iv$iv$iv3;
                }
                $composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
            } else {
                $composer.startReplaceGroup(536751357);
            }
            $composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MainUi___WMjBM$lambda$84$lambda$82$lambda$70$lambda$69$lambda$67$lambda$66$lambda$65 */
    public static final Unit m460x69452ace(String $cdResponse, MutableState $doneGeneratingResponse$delegate, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, $cdResponse);
        if (MainUi___WMjBM$lambda$22($doneGeneratingResponse$delegate)) {
            SemanticsPropertiesKt.m8951setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m8925getPolite0phEisY());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$84$lambda$82$lambda$81$lambda$72$lambda$71(State $uiState$delegate, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(MainUi___WMjBM$lambda$11($uiState$delegate).getProcessing() ? 0.5f : 1.0f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MainUi___WMjBM$lambda$84$lambda$82$lambda$81$lambda$75$lambda$74$lambda$73 */
    public static final Unit m461x3ca97729(Function1 $send, PromptTemplate $item) {
        $send.invoke($item.getPrompt());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MainUi___WMjBM$lambda$84$lambda$82$lambda$81$lambda$80$lambda$77$lambda$76 */
    public static final Unit m462x42e07e89(Function1 $send, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        $send.invoke(text);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MainUi___WMjBM$lambda$84$lambda$82$lambda$81$lambda$80$lambda$79$lambda$78 */
    public static final Unit m463x6ca9e40d(MutableIntState $curAmplitude$delegate, int it) {
        $curAmplitude$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$84$lambda$83(Task $task, HoldToDictateViewModel $holdToDictateViewModel, float $bottomPadding, MutableIntState $curAmplitude$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C684@26877L182:MobileActionsScreen.kt#okf2md");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2117329185, $changed, -1, "com.google.ai.edge.gallery.customtasks.mobileactions.MainUi.<anonymous>.<anonymous> (MobileActionsScreen.kt:684)");
        }
        VoiceRecognizerOverlayKt.m11045VoiceRecognizerOverlayTN_CM5M($task, $holdToDictateViewModel, $bottomPadding, MainUi___WMjBM$lambda$13($curAmplitude$delegate), null, $composer, 0, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$94(MutableState $errorDialogContent$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C702@27407L10,702@27360L69:MobileActionsScreen.kt#okf2md");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(654803330, $changed, -1, "com.google.ai.edge.gallery.customtasks.mobileactions.MainUi.<anonymous> (MobileActionsScreen.kt:702)");
            }
            TextKt.m4781TextNvy7gAk(MainUi___WMjBM$lambda$28($errorDialogContent$delegate), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$86$lambda$85(MutableState $showErrorDialog$delegate, MutableState $errorDialogContent$delegate) {
        MainUi___WMjBM$lambda$26($showErrorDialog$delegate, false);
        $errorDialogContent$delegate.setValue("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$93(final MutableState $showErrorDialog$delegate, final MutableState $errorDialogContent$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C709@27597L85,708@27565L187:MobileActionsScreen.kt#okf2md");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1664322523, $changed, -1, "com.google.ai.edge.gallery.customtasks.mobileactions.MainUi.<anonymous> (MobileActionsScreen.kt:708)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1686109062, "CC(remember):MobileActionsScreen.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MobileActionsScreenKt.MainUi___WMjBM$lambda$93$lambda$92$lambda$91($showErrorDialog$delegate, $errorDialogContent$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$MobileActionsScreenKt.INSTANCE.getLambda$1146078024$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$93$lambda$92$lambda$91(MutableState $showErrorDialog$delegate, MutableState $errorDialogContent$delegate) {
        MainUi___WMjBM$lambda$26($showErrorDialog$delegate, false);
        $errorDialogContent$delegate.setValue("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$90(final MobileActionsViewModel $viewModel, final Context $context, final Model $model, final List $tools, final ModelManagerViewModel $modelManagerViewModel, long $taskColor, final MutableState $showErrorDialog$delegate, final MutableState $errorDialogContent$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C719@27822L409,734@28267L40,718@27794L604:MobileActionsScreen.kt#okf2md");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1084560871, $changed, -1, "com.google.ai.edge.gallery.customtasks.mobileactions.MainUi.<anonymous> (MobileActionsScreen.kt:718)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1414054272, "CC(remember):MobileActionsScreen.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($viewModel) | $composer.changedInstance($context) | $composer.changedInstance($model) | $composer.changedInstance($tools) | $composer.changedInstance($modelManagerViewModel);
            Object value$iv = $composer.rememberedValue();
            if (invalid$iv || value$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MobileActionsScreenKt.MainUi___WMjBM$lambda$90$lambda$89$lambda$88($viewModel, $context, $model, $tools, $modelManagerViewModel, $showErrorDialog$delegate, $errorDialogContent$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) value$iv, null, false, null, ButtonDefaults.INSTANCE.m3587buttonColorsro_MJ88($taskColor, 0L, 0L, 0L, $composer, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableSingletons$MobileActionsScreenKt.INSTANCE.getLambda$1903548407$app_debug(), $composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$90$lambda$89$lambda$88(MobileActionsViewModel $viewModel, Context $context, Model $model, List $tools, ModelManagerViewModel $modelManagerViewModel, final MutableState $showErrorDialog$delegate, final MutableState $errorDialogContent$delegate) {
        MainUi___WMjBM$lambda$26($showErrorDialog$delegate, false);
        $errorDialogContent$delegate.setValue("");
        $viewModel.resetEngine($context, $model, $tools, $modelManagerViewModel, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MobileActionsScreenKt.MainUi___WMjBM$lambda$90$lambda$89$lambda$88$lambda$87($errorDialogContent$delegate, $showErrorDialog$delegate, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$90$lambda$89$lambda$88$lambda$87(MutableState $errorDialogContent$delegate, MutableState $showErrorDialog$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $errorDialogContent$delegate.setValue(it);
        MainUi___WMjBM$lambda$26($showErrorDialog$delegate, true);
        return Unit.INSTANCE;
    }

    private static final String genFormattedFunctionCall(Action action, Resources resources) {
        String strFunctionName = action.getFunctionCallDetails().getFunctionName();
        String functionNameLabel = resources.getString(C2421R.string.function_name);
        Intrinsics.checkNotNullExpressionValue(functionNameLabel, "getString(...)");
        String content = "**" + functionNameLabel + "**:\n- " + strFunctionName;
        if (!action.getFunctionCallDetails().getParameters().isEmpty()) {
            String parametersLabel = resources.getQuantityString(C2421R.plurals.parameter, action.getFunctionCallDetails().getParameters().size());
            Intrinsics.checkNotNullExpressionValue(parametersLabel, "getQuantityString(...)");
            String strParameters = CollectionsKt.joinToString$default(action.getFunctionCallDetails().getParameters(), "\n", null, null, 0, null, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MobileActionsScreenKt.genFormattedFunctionCall$lambda$96((Pair) obj);
                }
            }, 30, null);
            return content + "\n\n**" + parametersLabel + "**:\n" + strParameters;
        }
        return content;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence genFormattedFunctionCall$lambda$96(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "- " + it.getFirst() + ": \"" + it.getSecond() + "\"";
    }
}
