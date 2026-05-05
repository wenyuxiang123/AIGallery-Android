package com.google.ai.edge.gallery.customtasks.tinygarden;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.webkit.WebViewAssetLoader;
import com.google.common.p007io.BaseEncoding;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.AnalyticsKt;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.GalleryEvent;
import com.google.ai.edge.gallery.common.UtilsKt;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.ConfigKt;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.data.ValueType;
import com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage;
import com.google.ai.edge.gallery.p006ui.common.chat.ChatMessageWarning;
import com.google.ai.edge.gallery.p006ui.common.chat.ChatSide;
import com.google.ai.edge.gallery.p006ui.common.textandvoiceinput.HoldToDictateUiState;
import com.google.ai.edge.gallery.p006ui.common.textandvoiceinput.HoldToDictateViewModel;
import com.google.ai.edge.gallery.p006ui.common.textandvoiceinput.VoiceRecognizerOverlayKt;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.p006ui.theme.ThemeKt;
import com.google.ai.edge.litertlm.ToolProvider;
import java.security.MessageDigest;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: TinyGardenScreen.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m921d1 = {"\u0000z\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001au\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a}\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\f\u0010\u001e\u001a\u00020\u0001*\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010&X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020(X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020*X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020\u0001X\u008a\u008e\u0002"}, m922d2 = {"TAG", "", "ASSETS_BASE_URL", "TinyGardenScreen", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "tools", "", "Lcom/google/ai/edge/litertlm/ToolProvider;", "bottomPadding", "Landroidx/compose/ui/unit/Dp;", "setAppBarControlsDisabled", "Lkotlin/Function1;", "", "setTopBarVisible", "commandFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenCommand;", "viewModel", "Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenViewModel;", "TinyGardenScreen-aA_HZ9I", "(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Ljava/util/List;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/Flow;Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenViewModel;Landroidx/compose/runtime/Composer;II)V", "MainUi", "holdToDictateViewModel", "Lcom/google/ai/edge/gallery/ui/common/textandvoiceinput/HoldToDictateViewModel;", "MainUi-_-WMjBM", "(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Ljava/util/List;FLcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/Flow;Lcom/google/ai/edge/gallery/ui/common/textandvoiceinput/HoldToDictateViewModel;Landroidx/compose/runtime/Composer;II)V", "sha256", "app_debug", "uiState", "Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenUiState;", "recordAudioPermissionGranted", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "webViewRef", "Landroid/webkit/WebView;", "clearTextTrigger", "", "curAmplitude", "", "holdToDictateUiState", "Lcom/google/ai/edge/gallery/ui/common/textandvoiceinput/HoldToDictateUiState;", "showConversationHistoryPanel", "showErrorDialog", "errorDialogContent", "prevSeed", "prevPlots", "prevAction"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class TinyGardenScreenKt {
    private static final String ASSETS_BASE_URL = "https://appassets.androidplatform.net";
    private static final String TAG = "AGTinyGarden";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$88(Task task, ModelManagerViewModel modelManagerViewModel, List list, float f, TinyGardenViewModel tinyGardenViewModel, Function1 function1, Function1 function12, Flow flow, HoldToDictateViewModel holdToDictateViewModel, int i, int i2, Composer composer, int i3) {
        m10535MainUi_WMjBM(task, modelManagerViewModel, list, f, tinyGardenViewModel, function1, function12, flow, holdToDictateViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TinyGardenScreen_aA_HZ9I$lambda$10(Task task, ModelManagerViewModel modelManagerViewModel, List list, float f, Function1 function1, Function1 function12, Flow flow, TinyGardenViewModel tinyGardenViewModel, int i, int i2, Composer composer, int i3) {
        m10536TinyGardenScreenaA_HZ9I(task, modelManagerViewModel, list, f, function1, function12, flow, tinyGardenViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0256  */
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
    /* JADX INFO: renamed from: TinyGardenScreen-aA_HZ9I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10536TinyGardenScreenaA_HZ9I(final com.google.ai.edge.gallery.data.Task r97, final com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel r98, final java.util.List<? extends com.google.ai.edge.litertlm.ToolProvider> r99, final float r100, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r101, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r102, final kotlinx.coroutines.flow.Flow<com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenCommand> r103, com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel r104, androidx.compose.runtime.Composer r105, final int r106, final int r107) {
        /*
            Method dump skipped, instruction units count: 1867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt.m10536TinyGardenScreenaA_HZ9I(com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, java.util.List, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final TinyGardenUiState TinyGardenScreen_aA_HZ9I$lambda$0(State<TinyGardenUiState> state) {
        Object thisObj$iv = state.getValue();
        return (TinyGardenUiState) thisObj$iv;
    }

    private static final boolean TinyGardenScreen_aA_HZ9I$lambda$2(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TinyGardenScreen_aA_HZ9I$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TinyGardenScreen_aA_HZ9I$lambda$5$lambda$4(MutableState $recordAudioPermissionGranted$delegate, boolean permissionGranted) {
        if (permissionGranted) {
            TinyGardenScreen_aA_HZ9I$lambda$3($recordAudioPermissionGranted$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0f94  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0fa2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x1041  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x104d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x1053  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x10cf  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x1135  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x1269  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x1297  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x12ef  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x13a5  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x13bd  */
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
    public static final void m10535MainUi_WMjBM(final com.google.ai.edge.gallery.data.Task r154, final com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel r155, final java.util.List<? extends com.google.ai.edge.litertlm.ToolProvider> r156, final float r157, final com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel r158, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r159, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r160, final kotlinx.coroutines.flow.Flow<com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenCommand> r161, com.google.ai.edge.gallery.p006ui.common.textandvoiceinput.HoldToDictateViewModel r162, androidx.compose.runtime.Composer r163, final int r164, final int r165) {
        /*
            Method dump skipped, instruction units count: 5106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt.m10535MainUi_WMjBM(com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, java.util.List, float, com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final ModelManagerUiState MainUi___WMjBM$lambda$11(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView MainUi___WMjBM$lambda$14(MutableState<WebView> mutableState) {
        MutableState<WebView> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final TinyGardenUiState MainUi___WMjBM$lambda$16(State<TinyGardenUiState> state) {
        Object thisObj$iv = state.getValue();
        return (TinyGardenUiState) thisObj$iv;
    }

    private static final long MainUi___WMjBM$lambda$18(MutableLongState $clearTextTrigger$delegate) {
        MutableLongState $this$getValue$iv = $clearTextTrigger$delegate;
        return $this$getValue$iv.getLongValue();
    }

    private static final int MainUi___WMjBM$lambda$21(MutableIntState $curAmplitude$delegate) {
        MutableIntState $this$getValue$iv = $curAmplitude$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private static final HoldToDictateUiState MainUi___WMjBM$lambda$23(State<HoldToDictateUiState> state) {
        Object thisObj$iv = state.getValue();
        return (HoldToDictateUiState) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MainUi___WMjBM$lambda$25(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void MainUi___WMjBM$lambda$26(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MainUi___WMjBM$lambda$28(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainUi___WMjBM$lambda$29(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String MainUi___WMjBM$lambda$31(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MainUi___WMjBM$lambda$35(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MainUi___WMjBM$lambda$38(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MainUi___WMjBM$lambda$41(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$44$lambda$43(MutableState $showConversationHistoryPanel$delegate) {
        MainUi___WMjBM$lambda$26($showConversationHistoryPanel$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void MainUi___WMjBM$processInstructionText(final TinyGardenViewModel $viewModel, final Model model, MutableLongState clearTextTrigger$delegate, MutableState<WebView> mutableState, final String noFunctionCallWarningMessage, final CoroutineScope scope, final List<? extends ToolProvider> list, final State<TinyGardenUiState> state, final SnackbarHostState snackbarHostState, final String noFunctionCallSnackbarMessage, final MutableState<String> mutableState2, final MutableState<String> mutableState3, final MutableState<String> mutableState4, final MutableState<String> mutableState5, final MutableState<Boolean> mutableState6, Task $task, String text) {
        Object objM11361constructorimpl;
        clearTextTrigger$delegate.setLongValue(System.currentTimeMillis());
        if (StringsKt.trim((CharSequence) text).toString().length() > 0) {
            if (Intrinsics.areEqual(sha256(StringsKt.trim((CharSequence) text).toString()), "XtNztQDSDvVpMRPOK+q9tZs43x/VD1teVs3CvWp7zkc=")) {
                WebView $this$MainUi___WMjBM_u24processInstructionText_u24lambda_u2447 = MainUi___WMjBM$lambda$14(mutableState);
                if ($this$MainUi___WMjBM_u24processInstructionText_u24lambda_u2447 != null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        $this$MainUi___WMjBM_u24processInstructionText_u24lambda_u2447.evaluateJavascript("tinyGarden.unlockAll()", null);
                        objM11361constructorimpl = Result.m11361constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM11361constructorimpl = Result.m11361constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable e = Result.m11364exceptionOrNullimpl(objM11361constructorimpl);
                    if (e != null) {
                        Log.e(TAG, String.valueOf(e));
                    }
                    Result.m11360boximpl(objM11361constructorimpl);
                }
            } else {
                $viewModel.getCommand(model, text, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TinyGardenScreenKt.MainUi___WMjBM$processInstructionText$lambda$49($viewModel, noFunctionCallWarningMessage, scope, model, list, state, snackbarHostState, noFunctionCallSnackbarMessage, mutableState2, mutableState3, mutableState4, (String) obj);
                    }
                }, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TinyGardenScreenKt.MainUi___WMjBM$processInstructionText$lambda$50(mutableState5, mutableState6, (String) obj);
                    }
                });
            }
            FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
            if (firebaseAnalytics != null) {
                String id = GalleryEvent.GENERATE_ACTION.getId();
                Bundle $this$MainUi___WMjBM_u24processInstructionText_u24lambda_u2451 = new Bundle();
                $this$MainUi___WMjBM_u24processInstructionText_u24lambda_u2451.putString("capability_name", $task.getId());
                $this$MainUi___WMjBM_u24processInstructionText_u24lambda_u2451.putString("model_id", model.getName());
                Unit unit = Unit.INSTANCE;
                firebaseAnalytics.logEvent(id, $this$MainUi___WMjBM_u24processInstructionText_u24lambda_u2451);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$processInstructionText$lambda$49(TinyGardenViewModel $viewModel, String $noFunctionCallWarningMessage, CoroutineScope $scope, Model $model, List $tools, State $uiState$delegate, SnackbarHostState $snackbarHostState, String $noFunctionCallSnackbarMessage, MutableState $prevSeed$delegate, MutableState $prevPlots$delegate, MutableState $prevAction$delegate, String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (((ChatMessage) CollectionsKt.last((List) MainUi___WMjBM$lambda$16($uiState$delegate).getMessages())).getSide() != ChatSide.AGENT) {
            $viewModel.addMessage(new ChatMessageWarning($noFunctionCallWarningMessage));
            BuildersKt__Builders_commonKt.launch$default($scope, null, null, new TinyGardenScreenKt$MainUi$processInstructionText$3$1($snackbarHostState, $noFunctionCallSnackbarMessage, null), 3, null);
        }
        Object objConvertValueToTargetType = ConfigKt.convertValueToTargetType(MapsKt.getValue($model.getConfigValues(), ConfigKeys.INSTANCE.getRESET_CONVERSATION_TURN_COUNT().getLabel()), ValueType.INT);
        Intrinsics.checkNotNull(objConvertValueToTargetType, "null cannot be cast to non-null type kotlin.Int");
        int numTurnsToReset = ((Integer) objConvertValueToTargetType).intValue();
        Log.d(TAG, "Target turn to reset: " + numTurnsToReset);
        if (MainUi___WMjBM$lambda$16($uiState$delegate).getNumTurns() == numTurnsToReset) {
            Log.d(TAG, "!! This is the turn to reset conversation");
            $viewModel.resetConversation($model, $tools, MainUi___WMjBM$lambda$35($prevSeed$delegate), MainUi___WMjBM$lambda$38($prevPlots$delegate), MainUi___WMjBM$lambda$41($prevAction$delegate));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$processInstructionText$lambda$50(MutableState $errorDialogContent$delegate, MutableState $showErrorDialog$delegate, String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        $errorDialogContent$delegate.setValue(error);
        MainUi___WMjBM$lambda$29($showErrorDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView MainUi___WMjBM$lambda$76$lambda$67$lambda$58$lambda$57$lambda$56(final TinyGardenViewModel $viewModel, final MutableState $webViewRef$delegate, final CoroutineScope $scope, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final WebViewAssetLoader assetLoader = new WebViewAssetLoader.Builder().addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(context)).build();
        Intrinsics.checkNotNullExpressionValue(assetLoader, "build(...)");
        WebView $this$MainUi___WMjBM_u24lambda_u2476_u24lambda_u2467_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455 = new WebView(context);
        $webViewRef$delegate.setValue($this$MainUi___WMjBM_u24lambda_u2476_u24lambda_u2467_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455);
        $this$MainUi___WMjBM_u24lambda_u2476_u24lambda_u2467_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WebSettings $this$MainUi___WMjBM_u24lambda_u2476_u24lambda_u2467_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455_u24lambda_u2454 = $this$MainUi___WMjBM_u24lambda_u2476_u24lambda_u2467_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455.getSettings();
        $this$MainUi___WMjBM_u24lambda_u2476_u24lambda_u2467_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455_u24lambda_u2454.setJavaScriptEnabled(true);
        $this$MainUi___WMjBM_u24lambda_u2476_u24lambda_u2467_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455_u24lambda_u2454.setDomStorageEnabled(true);
        $this$MainUi___WMjBM_u24lambda_u2476_u24lambda_u2467_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455_u24lambda_u2454.setAllowFileAccess(true);
        $this$MainUi___WMjBM_u24lambda_u2476_u24lambda_u2467_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455_u24lambda_u2454.setMediaPlaybackRequiresUserGesture(false);
        $this$MainUi___WMjBM_u24lambda_u2476_u24lambda_u2467_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455.setWebViewClient(new WebViewClient() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$MainUi$6$1$1$1$1$1$2
            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(request, "request");
                return assetLoader.shouldInterceptRequest(request.getUrl());
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Log.d("AGTinyGarden", "webview finished loading");
                if (!$viewModel.getDataStoreRepository().getHasRunTinyGarden()) {
                    Log.d("AGTinyGarden", "First time running Tiny Garden. Showing help screen...");
                    $viewModel.getDataStoreRepository().setHasRunTinyGarden(true);
                    BuildersKt__Builders_commonKt.launch$default($scope, null, null, new TinyGardenScreenKt$MainUi$6$1$1$1$1$1$2$onPageFinished$1($webViewRef$delegate, null), 3, null);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Context context2;
                if (request == null) {
                    return false;
                }
                String url = request.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                if (StringsKt.startsWith$default(url, UtilsKt.LOCAL_URL_BASE, false, 2, (Object) null)) {
                    return false;
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                    if (view == null || (context2 = view.getContext()) == null) {
                        return true;
                    }
                    context2.startActivity(intent);
                    return true;
                } catch (Exception e) {
                    Log.e("AGTinyGarden", "Could not open external URL: " + url, e);
                    return true;
                }
            }
        });
        $this$MainUi___WMjBM_u24lambda_u2476_u24lambda_u2467_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455.setWebChromeClient(new WebChromeClient() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$MainUi$6$1$1$1$1$1$3
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Log.d("AGTinyGarden", (consoleMessage != null ? consoleMessage.message() : null) + " -- From line " + (consoleMessage != null ? Integer.valueOf(consoleMessage.lineNumber()) : null) + " of " + (consoleMessage != null ? consoleMessage.sourceId() : null));
                return super.onConsoleMessage(consoleMessage);
            }
        });
        String url = "https://appassets.androidplatform.net/assets/tinygarden/index.html";
        if (!$viewModel.getDataStoreRepository().getHasRunTinyGarden()) {
            Log.d(TAG, "First time running Tiny Garden. Showing tutorial screen...");
            $viewModel.getDataStoreRepository().setHasRunTinyGarden(true);
            url = "https://appassets.androidplatform.net/assets/tinygarden/index.html?tutorial=1";
        }
        $this$MainUi___WMjBM_u24lambda_u2476_u24lambda_u2467_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455.loadUrl(url);
        return $this$MainUi___WMjBM_u24lambda_u2476_u24lambda_u2467_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$76$lambda$67$lambda$66$lambda$60$lambda$59(TinyGardenViewModel $viewModel, Model $model, MutableLongState $clearTextTrigger$delegate, MutableState $webViewRef$delegate, String $noFunctionCallWarningMessage, CoroutineScope $scope, List $tools, State $uiState$delegate, SnackbarHostState $snackbarHostState, String $noFunctionCallSnackbarMessage, MutableState $prevSeed$delegate, MutableState $prevPlots$delegate, MutableState $prevAction$delegate, MutableState $errorDialogContent$delegate, MutableState $showErrorDialog$delegate, Task $task, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        MainUi___WMjBM$processInstructionText($viewModel, $model, $clearTextTrigger$delegate, $webViewRef$delegate, $noFunctionCallWarningMessage, $scope, $tools, $uiState$delegate, $snackbarHostState, $noFunctionCallSnackbarMessage, $prevSeed$delegate, $prevPlots$delegate, $prevAction$delegate, $errorDialogContent$delegate, $showErrorDialog$delegate, $task, text);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$76$lambda$67$lambda$66$lambda$62$lambda$61(MutableIntState $curAmplitude$delegate, int it) {
        $curAmplitude$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MainUi___WMjBM$lambda$76$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63 */
    public static final Unit m465x10318e7d(MutableState $showConversationHistoryPanel$delegate) {
        MainUi___WMjBM$lambda$26($showConversationHistoryPanel$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$76$lambda$68(Task $task, HoldToDictateViewModel $holdToDictateViewModel, float $bottomPadding, MutableIntState $curAmplitude$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C655@26196L182:TinyGardenScreen.kt#pwpd1x");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2134358441, $changed, -1, "com.google.ai.edge.gallery.customtasks.tinygarden.MainUi.<anonymous>.<anonymous> (TinyGardenScreen.kt:655)");
        }
        VoiceRecognizerOverlayKt.m11045VoiceRecognizerOverlayTN_CM5M($task, $holdToDictateViewModel, $bottomPadding, MainUi___WMjBM$lambda$21($curAmplitude$delegate), null, $composer, 0, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MainUi___WMjBM$lambda$76$lambda$70$lambda$69(int fullHeight) {
        return fullHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MainUi___WMjBM$lambda$76$lambda$72$lambda$71(int fullHeight) {
        return fullHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$76$lambda$75(Task $task, float $bottomPadding, TinyGardenViewModel $viewModel, final MutableState $showConversationHistoryPanel$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C673@26780L40,669@26635L196:TinyGardenScreen.kt#pwpd1x");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1345623712, $changed, -1, "com.google.ai.edge.gallery.customtasks.tinygarden.MainUi.<anonymous>.<anonymous> (TinyGardenScreen.kt:669)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 359236136, "CC(remember):TinyGardenScreen.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TinyGardenScreenKt.MainUi___WMjBM$lambda$76$lambda$75$lambda$74$lambda$73($showConversationHistoryPanel$delegate);
                }
            };
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        ConversationHistoryPanelKt.m10528ConversationHistoryPaneluFdPcIQ($task, $bottomPadding, $viewModel, (Function0) it$iv, $composer, 3072);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$76$lambda$75$lambda$74$lambda$73(MutableState $showConversationHistoryPanel$delegate) {
        MainUi___WMjBM$lambda$26($showConversationHistoryPanel$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$87(MutableState $errorDialogContent$delegate, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        ComposerKt.sourceInformation($composer, "C683@26972L348:TinyGardenScreen.kt#pwpd1x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(367704204, $changed, -1, "com.google.ai.edge.gallery.customtasks.tinygarden.MainUi.<anonymous> (TinyGardenScreen.kt:683)");
            }
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
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
            ComposerKt.sourceInformationMarkerStart($composer, -1244580224, "C684@27088L10,684@27041L69,686@27139L35,687@27210L10,688@27268L12,685@27121L189:TinyGardenScreen.kt#pwpd1x");
            TextKt.m4781TextNvy7gAk(MainUi___WMjBM$lambda$31($errorDialogContent$delegate), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 131070);
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.reset_note, $composer, 0), null, ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11243getWarningTextColor0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 0, 0, 131066);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$78$lambda$77(MutableState $showErrorDialog$delegate, MutableState $errorDialogContent$delegate) {
        MainUi___WMjBM$lambda$29($showErrorDialog$delegate, false);
        $errorDialogContent$delegate.setValue("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$85(final MutableState $showErrorDialog$delegate, final MutableState $errorDialogContent$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C698@27494L85,697@27462L187:TinyGardenScreen.kt#pwpd1x");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(78858095, $changed, -1, "com.google.ai.edge.gallery.customtasks.tinygarden.MainUi.<anonymous> (TinyGardenScreen.kt:697)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1526780604, "CC(remember):TinyGardenScreen.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TinyGardenScreenKt.MainUi___WMjBM$lambda$85$lambda$84$lambda$83($showErrorDialog$delegate, $errorDialogContent$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$TinyGardenScreenKt.INSTANCE.m10526getLambda$261975342$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$85$lambda$84$lambda$83(MutableState $showErrorDialog$delegate, MutableState $errorDialogContent$delegate) {
        MainUi___WMjBM$lambda$29($showErrorDialog$delegate, false);
        $errorDialogContent$delegate.setValue("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$82(final TinyGardenViewModel $viewModel, final Context $context, final Model $model, final List $tools, long $taskColor, final MutableState $showErrorDialog$delegate, final MutableState $errorDialogContent$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C708@27719L348,722@28103L40,707@27691L543:TinyGardenScreen.kt#pwpd1x");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1545361743, $changed, -1, "com.google.ai.edge.gallery.customtasks.tinygarden.MainUi.<anonymous> (TinyGardenScreen.kt:707)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 966050957, "CC(remember):TinyGardenScreen.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($viewModel) | $composer.changedInstance($context) | $composer.changedInstance($model) | $composer.changedInstance($tools);
            Object value$iv = $composer.rememberedValue();
            if (invalid$iv || value$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TinyGardenScreenKt.MainUi___WMjBM$lambda$82$lambda$81$lambda$80($viewModel, $context, $model, $tools, $showErrorDialog$delegate, $errorDialogContent$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) value$iv, null, false, null, ButtonDefaults.INSTANCE.m3587buttonColorsro_MJ88($taskColor, 0L, 0L, 0L, $composer, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableSingletons$TinyGardenScreenKt.INSTANCE.m10525getLambda$1557048127$app_debug(), $composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$82$lambda$81$lambda$80(TinyGardenViewModel $viewModel, Context $context, Model $model, List $tools, final MutableState $showErrorDialog$delegate, final MutableState $errorDialogContent$delegate) {
        MainUi___WMjBM$lambda$29($showErrorDialog$delegate, false);
        $errorDialogContent$delegate.setValue("");
        $viewModel.resetEngine($context, $model, $tools, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TinyGardenScreenKt.MainUi___WMjBM$lambda$82$lambda$81$lambda$80$lambda$79($errorDialogContent$delegate, $showErrorDialog$delegate, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainUi___WMjBM$lambda$82$lambda$81$lambda$80$lambda$79(MutableState $errorDialogContent$delegate, MutableState $showErrorDialog$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $errorDialogContent$delegate.setValue(it);
        MainUi___WMjBM$lambda$29($showErrorDialog$delegate, true);
        return Unit.INSTANCE;
    }

    private static final String sha256(String $this$sha256) {
        byte[] inputBytes = $this$sha256.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(inputBytes, "getBytes(...)");
        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            byte[] digest = sha256.digest(inputBytes);
            String strEncode = BaseEncoding.base64().encode(digest);
            Intrinsics.checkNotNull(strEncode);
            return strEncode;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
