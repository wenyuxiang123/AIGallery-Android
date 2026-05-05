package com.google.ai.edge.gallery.customtasks.agentchat;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebView;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.platform.WindowInfo;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.res.VectorResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
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
import androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.AnalyticsKt;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.GalleryEvent;
import com.google.ai.edge.gallery.common.AgentAction;
import com.google.ai.edge.gallery.common.AskInfoAgentAction;
import com.google.ai.edge.gallery.common.CallJsSkillResultImage;
import com.google.ai.edge.gallery.common.CallJsSkillResultWebview;
import com.google.ai.edge.gallery.common.SkillProgressAgentAction;
import com.google.ai.edge.gallery.common.SkillTryOutChip;
import com.google.ai.edge.gallery.data.BuiltInTaskId;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.GalleryWebViewKt;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessage;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageCollapsableProgressPanel;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageImage;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageInfo;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageText;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageType;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageWebView;
import com.google.ai.edge.gallery.ui.common.chat.ChatSide;
import com.google.ai.edge.gallery.ui.common.chat.ChatUiState;
import com.google.ai.edge.gallery.ui.common.chat.LogMessage;
import com.google.ai.edge.gallery.ui.common.chat.LogMessageLevel;
import com.google.ai.edge.gallery.ui.common.chat.SendMessageTrigger;
import com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt;
import com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModel;
import com.google.ai.edge.gallery.ui.modelmanager.ModelInitializationStatus;
import com.google.ai.edge.gallery.ui.modelmanager.ModelInitializationStatusType;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.proto.Skill;
import com.google.ai.edge.litertlm.ToolKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;

/* JADX INFO: compiled from: AgentChatScreen.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aG\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a \u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rH\u0002\u001aN\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0019H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\"X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010$X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002"}, m922d2 = {"TAG", "", "chatViewJavascriptInterface", "Lcom/google/ai/edge/gallery/customtasks/agentchat/ChatWebViewJavascriptInterface;", "AgentChatScreen", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "navigateUp", "Lkotlin/Function0;", "agentTools", "Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;", "viewModel", "Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModel;", "skillManagerViewModel", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;", "(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lkotlin/jvm/functions/Function0;Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModel;Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;Landroidx/compose/runtime/Composer;II)V", "updateProgressPanel", "model", "Lcom/google/ai/edge/gallery/data/Model;", "resetSessionWithCurrentSkills", "curSystemPrompt", "onDone", "Lkotlin/Function1;", "app_debug", "showSkillManagerBottomSheet", "", "showAskInfoDialog", "currentAskInfoAction", "Lcom/google/ai/edge/gallery/common/AskInfoAgentAction;", "askInfoInputValue", "webViewRef", "Landroid/webkit/WebView;", "sendMessageTrigger", "Lcom/google/ai/edge/gallery/ui/common/chat/SendMessageTrigger;", "showAlertForDisabledSkill", "disabledSkillName", "currentModel", "uiState", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatUiState;", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class AgentChatScreenKt {
    private static final String TAG = "AGAgentChatScreen";
    private static final ChatWebViewJavascriptInterface chatViewJavascriptInterface = new ChatWebViewJavascriptInterface();

    /* JADX INFO: compiled from: AgentChatScreen.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            try {
                iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$79(Task task, ModelManagerViewModel modelManagerViewModel, Function0 function0, AgentTools agentTools, LlmChatViewModel llmChatViewModel, SkillManagerViewModel skillManagerViewModel, int i, int i2, Composer composer, int i3) {
        AgentChatScreen(task, modelManagerViewModel, function0, agentTools, llmChatViewModel, skillManagerViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

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
    public static final void AgentChatScreen(final Task task, final ModelManagerViewModel modelManagerViewModel, final Function0<Unit> navigateUp, final AgentTools agentTools, LlmChatViewModel viewModel, SkillManagerViewModel skillManagerViewModel, Composer $composer, final int $changed, final int i) {
        LlmChatViewModel llmChatViewModel;
        SkillManagerViewModel skillManagerViewModel2;
        Composer $composer2;
        LlmChatViewModel viewModel2;
        final SkillManagerViewModel skillManagerViewModel3;
        LlmChatViewModel viewModel3;
        final SkillManagerViewModel skillManagerViewModel4;
        int $dirty;
        final LlmChatViewModel viewModel4;
        int $dirty2;
        MutableState showAskInfoDialog$delegate;
        Context context;
        String systemPromptUpdatedMessage;
        MutableState showAlertForDisabledSkill$delegate;
        MutableState currentAskInfoAction$delegate;
        MutableState currentAskInfoAction$delegate2;
        MutableState showSkillManagerBottomSheet$delegate;
        String str;
        int i2;
        SkillManagerViewModel skillManagerViewModel5;
        final MutableState showAskInfoDialog$delegate2;
        final MutableState currentAskInfoAction$delegate3;
        int i3;
        int i4;
        String str2;
        final MutableState showAlertForDisabledSkill$delegate2;
        AgentTools agentTools2;
        Composer $composer3;
        final MutableState askInfoInputValue$delegate;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(navigateUp, "navigateUp");
        Intrinsics.checkNotNullParameter(agentTools, "agentTools");
        Composer $composer4 = $composer.startRestartGroup(1016958983);
        ComposerKt.sourceInformation($composer4, "C(AgentChatScreen)P(4,1,2!1,5)121@5520L7,124@5647L7,125@5690L7,126@5720L68,127@5826L34,128@5888L34,129@5953L54,130@6035L31,131@6097L33,132@6157L49,133@6232L53,134@6321L46,135@6396L54,136@6486L34,137@6548L31,143@6740L105,146@6876L1443,200@8587L38,190@8357L207,208@8876L7198,379@16180L426,396@16635L4168,203@8705L136,139@6583L14270:AgentChatScreen.kt#41d64j");
        int $dirty3 = $changed;
        if (($changed & 6) == 0) {
            $dirty3 |= $composer4.changedInstance(task) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty3 |= $composer4.changedInstance(modelManagerViewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty3 |= $composer4.changedInstance(navigateUp) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty3 |= $composer4.changedInstance(agentTools) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            if ((i & 16) == 0) {
                llmChatViewModel = viewModel;
                int i5 = $composer4.changedInstance(llmChatViewModel) ? 16384 : 8192;
                $dirty3 |= i5;
            } else {
                llmChatViewModel = viewModel;
            }
            $dirty3 |= i5;
        } else {
            llmChatViewModel = viewModel;
        }
        if ((196608 & $changed) == 0) {
            if ((i & 32) == 0) {
                skillManagerViewModel2 = skillManagerViewModel;
                int i6 = $composer4.changedInstance(skillManagerViewModel2) ? 131072 : 65536;
                $dirty3 |= i6;
            } else {
                skillManagerViewModel2 = skillManagerViewModel;
            }
            $dirty3 |= i6;
        } else {
            skillManagerViewModel2 = skillManagerViewModel;
        }
        if ($composer4.shouldExecute((74899 & $dirty3) != 74898, $dirty3 & 1)) {
            $composer4.startDefaults();
            ComposerKt.sourceInformation($composer4, "118@5404L15,119@5470L15");
            if (($changed & 1) == 0 || $composer4.getDefaultsInvalid()) {
                if ((i & 16) != 0) {
                    ComposerKt.sourceInformationMarkerStart($composer4, 1192010736, "CC(hiltViewModel)P(1)38@1622L7,43@1774L47,44@1833L54:HiltViewModel.kt#gplxbw");
                    ViewModelStoreOwner viewModelStoreOwner$iv = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer4, LocalViewModelStoreOwner.$stable);
                    if (viewModelStoreOwner$iv == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModelProvider.Factory factory$iv = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner$iv, $composer4, 0 & 14);
                    int $changed$iv$iv = (0 & 14) | (0 & 112);
                    ComposerKt.sourceInformationMarkerStart($composer4, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
                    CreationExtras extras$iv$iv = viewModelStoreOwner$iv instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner$iv).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                    ViewModel viewModel5 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LlmChatViewModel.class), viewModelStoreOwner$iv, (String) null, factory$iv, extras$iv$iv, $composer4, (($changed$iv$iv << 3) & 112) | (($changed$iv$iv << 3) & 896) | (($changed$iv$iv << 3) & 7168) | (($changed$iv$iv << 3) & 57344), 0);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    viewModel3 = (LlmChatViewModel) viewModel5;
                    $dirty3 &= -57345;
                } else {
                    viewModel3 = viewModel;
                }
                if ((i & 32) != 0) {
                    ComposerKt.sourceInformationMarkerStart($composer4, 1192010736, "CC(hiltViewModel)P(1)38@1622L7,43@1774L47,44@1833L54:HiltViewModel.kt#gplxbw");
                    ViewModelStoreOwner viewModelStoreOwner$iv2 = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer4, LocalViewModelStoreOwner.$stable);
                    if (viewModelStoreOwner$iv2 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModelProvider.Factory factory$iv2 = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner$iv2, $composer4, 0 & 14);
                    int $changed$iv$iv2 = (0 & 14) | (0 & 112);
                    LlmChatViewModel viewModel6 = viewModel3;
                    ComposerKt.sourceInformationMarkerStart($composer4, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
                    CreationExtras extras$iv$iv2 = viewModelStoreOwner$iv2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner$iv2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                    int $i$f$hiltViewModel = $changed$iv$iv2 << 3;
                    ViewModel viewModel7 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SkillManagerViewModel.class), viewModelStoreOwner$iv2, (String) null, factory$iv2, extras$iv$iv2, $composer4, ($i$f$hiltViewModel & 896) | (($changed$iv$iv2 << 3) & 112) | (($changed$iv$iv2 << 3) & 7168) | (($changed$iv$iv2 << 3) & 57344), 0);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    skillManagerViewModel4 = (SkillManagerViewModel) viewModel7;
                    $dirty = $dirty3 & (-458753);
                    viewModel4 = viewModel6;
                } else {
                    skillManagerViewModel4 = skillManagerViewModel;
                    $dirty = $dirty3;
                    viewModel4 = viewModel3;
                }
            } else {
                $composer4.skipToGroupEnd();
                if ((i & 16) != 0) {
                    $dirty3 &= -57345;
                }
                if ((i & 32) != 0) {
                    $dirty3 &= -458753;
                }
                $dirty = $dirty3;
                viewModel4 = llmChatViewModel;
                skillManagerViewModel4 = skillManagerViewModel2;
            }
            $composer4.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1016958983, $dirty, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreen (AgentChatScreen.kt:120)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer4.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            Context context2 = (Context) objConsume;
            agentTools.setContext(context2);
            agentTools.setSkillManagerViewModel(skillManagerViewModel4);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer4.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            Density density = (Density) objConsume2;
            ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
            ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume3 = $composer4.consume(localWindowInfo);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            WindowInfo windowInfo = (WindowInfo) objConsume3;
            ComposerKt.sourceInformationMarkerStart($composer4, -1954943733, "CC(remember):AgentChatScreen.kt#9igjgp");
            Object it$iv = $composer4.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = C1654Dp.m9786boximpl(density.mo1521toDpu2uoSUM((int) (windowInfo.mo8878getContainerSizeYbymL2g() >> 32)));
                $composer4.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final float screenWidthDp = ((C1654Dp) it$iv).m9802unboximpl();
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954940375, "CC(remember):AgentChatScreen.kt#9igjgp");
            Object it$iv2 = $composer4.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableState showSkillManagerBottomSheet$delegate2 = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954938391, "CC(remember):AgentChatScreen.kt#9igjgp");
            Object it$iv3 = $composer4.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                $dirty2 = $dirty;
                Object value$iv3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            } else {
                $dirty2 = $dirty;
            }
            MutableState showAskInfoDialog$delegate3 = (MutableState) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954936291, "CC(remember):AgentChatScreen.kt#9igjgp");
            Object value$iv4 = $composer4.rememberedValue();
            if (value$iv4 == Composer.INSTANCE.getEmpty()) {
                value$iv4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer4.updateRememberedValue(value$iv4);
            }
            MutableState currentAskInfoAction$delegate4 = (MutableState) value$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954933690, "CC(remember):AgentChatScreen.kt#9igjgp");
            Object value$iv5 = $composer4.rememberedValue();
            if (value$iv5 == Composer.INSTANCE.getEmpty()) {
                showAskInfoDialog$delegate = showAskInfoDialog$delegate3;
                value$iv5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer4.updateRememberedValue(value$iv5);
            } else {
                showAskInfoDialog$delegate = showAskInfoDialog$delegate3;
            }
            final MutableState askInfoInputValue$delegate2 = (MutableState) value$iv5;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954931704, "CC(remember):AgentChatScreen.kt#9igjgp");
            Object value$iv6 = $composer4.rememberedValue();
            if (value$iv6 == Composer.INSTANCE.getEmpty()) {
                value$iv6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer4.updateRememberedValue(value$iv6);
            }
            final MutableState webViewRef$delegate = (MutableState) value$iv6;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954929768, "CC(remember):AgentChatScreen.kt#9igjgp");
            Object value$iv7 = $composer4.rememberedValue();
            if (value$iv7 == Composer.INSTANCE.getEmpty()) {
                value$iv7 = new ChatWebViewClient(context2);
                $composer4.updateRememberedValue(value$iv7);
            }
            final ChatWebViewClient chatWebViewClient = (ChatWebViewClient) value$iv7;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954927364, "CC(remember):AgentChatScreen.kt#9igjgp");
            Object value$iv8 = $composer4.rememberedValue();
            if (value$iv8 == Composer.INSTANCE.getEmpty()) {
                context = context2;
                value$iv8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(task.getDefaultSystemPrompt(), null, 2, null);
                $composer4.updateRememberedValue(value$iv8);
            } else {
                context = context2;
            }
            final MutableState curSystemPrompt$delegate = (MutableState) value$iv8;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            String systemPromptUpdatedMessage2 = StringResources_androidKt.stringResource(C2421R.string.system_prompt_updated, $composer4, 0);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954922115, "CC(remember):AgentChatScreen.kt#9igjgp");
            Object value$iv9 = $composer4.rememberedValue();
            if (value$iv9 == Composer.INSTANCE.getEmpty()) {
                value$iv9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer4.updateRememberedValue(value$iv9);
            }
            final MutableState sendMessageTrigger$delegate = (MutableState) value$iv9;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954919255, "CC(remember):AgentChatScreen.kt#9igjgp");
            Object value$iv10 = $composer4.rememberedValue();
            if (value$iv10 == Composer.INSTANCE.getEmpty()) {
                systemPromptUpdatedMessage = systemPromptUpdatedMessage2;
                value$iv10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(value$iv10);
            } else {
                systemPromptUpdatedMessage = systemPromptUpdatedMessage2;
            }
            MutableState showAlertForDisabledSkill$delegate3 = (MutableState) value$iv10;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954917274, "CC(remember):AgentChatScreen.kt#9igjgp");
            Object value$iv11 = $composer4.rememberedValue();
            if (value$iv11 == Composer.INSTANCE.getEmpty()) {
                showAlertForDisabledSkill$delegate = showAlertForDisabledSkill$delegate3;
                value$iv11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer4.updateRememberedValue(value$iv11);
            } else {
                showAlertForDisabledSkill$delegate = showAlertForDisabledSkill$delegate3;
            }
            MutableState disabledSkillName$delegate = (MutableState) value$iv11;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            String strAgentChatScreen$lambda$19 = AgentChatScreen$lambda$19(curSystemPrompt$delegate);
            SendMessageTrigger sendMessageTriggerAgentChatScreen$lambda$22 = AgentChatScreen$lambda$22(sendMessageTrigger$delegate);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954911056, "CC(remember):AgentChatScreen.kt#9igjgp");
            boolean invalid$iv = $composer4.changedInstance(viewModel4) | $composer4.changedInstance(agentTools);
            Object it$iv4 = $composer4.rememberedValue();
            if (invalid$iv || it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv12 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AgentChatScreenKt.AgentChatScreen$lambda$31$lambda$30(viewModel4, agentTools, (Model) obj);
                    }
                };
                $composer4.updateRememberedValue(value$iv12);
                it$iv4 = value$iv12;
            }
            Function1 function1 = (Function1) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954905366, "CC(remember):AgentChatScreen.kt#9igjgp");
            boolean invalid$iv2 = $composer4.changedInstance(agentTools) | $composer4.changedInstance(viewModel4);
            Object it$iv5 = $composer4.rememberedValue();
            if (invalid$iv2 || it$iv5 == Composer.INSTANCE.getEmpty()) {
                Object value$iv13 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AgentChatScreenKt.AgentChatScreen$lambda$37$lambda$36(agentTools, viewModel4, screenWidthDp, (Model) obj);
                    }
                };
                $composer4.updateRememberedValue(value$iv13);
                it$iv5 = value$iv13;
            }
            Function1 function12 = (Function1) it$iv5;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954852019, "CC(remember):AgentChatScreen.kt#9igjgp");
            Object value$iv14 = $composer4.rememberedValue();
            if (value$iv14 == Composer.INSTANCE.getEmpty()) {
                value$iv14 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AgentChatScreenKt.AgentChatScreen$lambda$39$lambda$38(showSkillManagerBottomSheet$delegate2);
                    }
                };
                $composer4.updateRememberedValue(value$iv14);
            }
            Function0 function0 = (Function0) value$iv14;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954859210, "CC(remember):AgentChatScreen.kt#9igjgp");
            boolean invalid$iv3 = $composer4.changedInstance(viewModel4) | $composer4.changedInstance(modelManagerViewModel) | $composer4.changedInstance(skillManagerViewModel4) | $composer4.changedInstance(agentTools);
            Object value$iv15 = $composer4.rememberedValue();
            if (invalid$iv3 || value$iv15 == Composer.INSTANCE.getEmpty()) {
                final LlmChatViewModel llmChatViewModel2 = viewModel4;
                currentAskInfoAction$delegate = currentAskInfoAction$delegate4;
                currentAskInfoAction$delegate2 = disabledSkillName$delegate;
                showSkillManagerBottomSheet$delegate = showSkillManagerBottomSheet$delegate2;
                final SkillManagerViewModel skillManagerViewModel6 = skillManagerViewModel4;
                str = "CC(remember):AgentChatScreen.kt#9igjgp";
                value$iv15 = new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AgentChatScreenKt.AgentChatScreen$lambda$41$lambda$40(llmChatViewModel2, modelManagerViewModel, skillManagerViewModel6, agentTools, curSystemPrompt$delegate, (Task) obj, (Model) obj2);
                    }
                };
                $composer4.updateRememberedValue(value$iv15);
            } else {
                showSkillManagerBottomSheet$delegate = showSkillManagerBottomSheet$delegate2;
                str = "CC(remember):AgentChatScreen.kt#9igjgp";
                currentAskInfoAction$delegate = currentAskInfoAction$delegate4;
                currentAskInfoAction$delegate2 = disabledSkillName$delegate;
            }
            Function2 function2 = (Function2) value$iv15;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            final LlmChatViewModel llmChatViewModel3 = viewModel4;
            final MutableState mutableState = currentAskInfoAction$delegate;
            final MutableState disabledSkillName$delegate2 = currentAskInfoAction$delegate2;
            int $dirty4 = $dirty2;
            final MutableState showAskInfoDialog$delegate4 = showAskInfoDialog$delegate;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1297117366, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AgentChatScreenKt.AgentChatScreen$lambda$49(agentTools, llmChatViewModel3, chatWebViewClient, webViewRef$delegate, mutableState, askInfoInputValue$delegate2, showAskInfoDialog$delegate4, (Model) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer4, 54);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954608655, str);
            final String systemPromptUpdatedMessage3 = systemPromptUpdatedMessage;
            boolean invalid$iv4 = $composer4.changedInstance(viewModel4) | $composer4.changedInstance(modelManagerViewModel) | $composer4.changedInstance(skillManagerViewModel4) | $composer4.changedInstance(task) | $composer4.changedInstance(agentTools) | $composer4.changed(systemPromptUpdatedMessage3);
            Object value$iv16 = $composer4.rememberedValue();
            if (invalid$iv4 || value$iv16 == Composer.INSTANCE.getEmpty()) {
                final LlmChatViewModel llmChatViewModel4 = viewModel4;
                final SkillManagerViewModel skillManagerViewModel7 = skillManagerViewModel4;
                i2 = 54;
                value$iv16 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AgentChatScreenKt.AgentChatScreen$lambda$52$lambda$51(llmChatViewModel4, modelManagerViewModel, skillManagerViewModel7, task, agentTools, curSystemPrompt$delegate, systemPromptUpdatedMessage3, (String) obj);
                    }
                };
                $composer4.updateRememberedValue(value$iv16);
            } else {
                i2 = 54;
            }
            Function1 function13 = (Function1) value$iv16;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            final LlmChatViewModel llmChatViewModel5 = viewModel4;
            final SkillManagerViewModel skillManagerViewModel8 = skillManagerViewModel4;
            final MutableState mutableState2 = showAlertForDisabledSkill$delegate;
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(2009944014, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AgentChatScreenKt.AgentChatScreen$lambda$61(llmChatViewModel5, modelManagerViewModel, skillManagerViewModel8, sendMessageTrigger$delegate, disabledSkillName$delegate2, mutableState2, (Model) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer4, i2);
            ComposerKt.sourceInformationMarkerStart($composer4, -1954848145, str);
            boolean invalid$iv5 = $composer4.changedInstance(skillManagerViewModel4);
            Object it$iv6 = $composer4.rememberedValue();
            if (invalid$iv5 || it$iv6 == Composer.INSTANCE.getEmpty()) {
                Object value$iv17 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AgentChatScreenKt.AgentChatScreen$lambda$64$lambda$63(skillManagerViewModel4);
                    }
                };
                $composer4.updateRememberedValue(value$iv17);
                it$iv6 = value$iv17;
            }
            ComposerKt.sourceInformationMarkerEnd($composer4);
            SkillManagerViewModel skillManagerViewModel9 = skillManagerViewModel4;
            final LlmChatViewModel viewModel8 = viewModel4;
            String str3 = str;
            LlmChatScreenKt.LlmChatScreen(modelManagerViewModel, navigateUp, null, BuiltInTaskId.LLM_AGENT_CHAT, function1, function12, function0, function2, composableLambdaRememberComposableLambda, null, true, strAgentChatScreen$lambda$19, function13, composableLambdaRememberComposableLambda2, sendMessageTriggerAgentChatScreen$lambda$22, true, true, (Function0) it$iv6, $composer4, (($dirty4 >> 3) & 14) | 102239232 | (($dirty4 >> 3) & 112), 1772550, 516);
            if (!AgentChatScreen$lambda$6(showAskInfoDialog$delegate4) || AgentChatScreen$lambda$9(currentAskInfoAction$delegate) == null) {
                skillManagerViewModel5 = skillManagerViewModel9;
                showAskInfoDialog$delegate2 = showAskInfoDialog$delegate4;
                currentAskInfoAction$delegate3 = currentAskInfoAction$delegate;
                i3 = -479390917;
                $composer4.startReplaceGroup(-479390917);
                $composer4.endReplaceGroup();
            } else {
                $composer4.startReplaceGroup(-458629411);
                ComposerKt.sourceInformation($composer4, "503@21105L26,504@21148L129,509@21297L114,499@20958L460");
                final AskInfoAgentAction action = AgentChatScreen$lambda$9(currentAskInfoAction$delegate);
                Intrinsics.checkNotNull(action);
                String dialogTitle = action.getDialogTitle();
                String fieldLabel = action.getFieldLabel();
                String strAgentChatScreen$lambda$12 = AgentChatScreen$lambda$12(askInfoInputValue$delegate2);
                ComposerKt.sourceInformationMarkerStart($composer4, -1954451455, str3);
                Object it$iv7 = $composer4.rememberedValue();
                if (it$iv7 == Composer.INSTANCE.getEmpty()) {
                    askInfoInputValue$delegate = askInfoInputValue$delegate2;
                    Object value$iv18 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AgentChatScreenKt.AgentChatScreen$lambda$66$lambda$65(askInfoInputValue$delegate, (String) obj);
                        }
                    };
                    $composer4.updateRememberedValue(value$iv18);
                    it$iv7 = value$iv18;
                } else {
                    askInfoInputValue$delegate = askInfoInputValue$delegate2;
                }
                Function1 function14 = (Function1) it$iv7;
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerStart($composer4, -1954449976, str3);
                boolean invalid$iv6 = $composer4.changedInstance(action);
                Object it$iv8 = $composer4.rememberedValue();
                if (invalid$iv6 || it$iv8 == Composer.INSTANCE.getEmpty()) {
                    skillManagerViewModel5 = skillManagerViewModel9;
                    showAskInfoDialog$delegate2 = showAskInfoDialog$delegate4;
                    currentAskInfoAction$delegate3 = currentAskInfoAction$delegate;
                    Object value$iv19 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AgentChatScreenKt.AgentChatScreen$lambda$68$lambda$67(action, askInfoInputValue$delegate, showAskInfoDialog$delegate2, currentAskInfoAction$delegate3);
                        }
                    };
                    $composer4.updateRememberedValue(value$iv19);
                    it$iv8 = value$iv19;
                } else {
                    skillManagerViewModel5 = skillManagerViewModel9;
                    showAskInfoDialog$delegate2 = showAskInfoDialog$delegate4;
                    currentAskInfoAction$delegate3 = currentAskInfoAction$delegate;
                }
                Function0 function02 = (Function0) it$iv8;
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerStart($composer4, -1954445223, str3);
                boolean invalid$iv7 = $composer4.changedInstance(action);
                Object it$iv9 = $composer4.rememberedValue();
                if (invalid$iv7 || it$iv9 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv20 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AgentChatScreenKt.AgentChatScreen$lambda$70$lambda$69(action, showAskInfoDialog$delegate2, currentAskInfoAction$delegate3);
                        }
                    };
                    $composer4.updateRememberedValue(value$iv20);
                    it$iv9 = value$iv20;
                }
                ComposerKt.sourceInformationMarkerEnd($composer4);
                SecretEditorDialogKt.SecretEditorDialog(dialogTitle, fieldLabel, strAgentChatScreen$lambda$12, function14, function02, (Function0) it$iv9, $composer4, 3072);
                $composer4.endReplaceGroup();
                i3 = -479390917;
            }
            if (AgentChatScreen$lambda$3(showSkillManagerBottomSheet$delegate)) {
                $composer4.startReplaceGroup(-458082850);
                ComposerKt.sourceInformation($composer4, "521@21592L493,518@21465L627");
                ComposerKt.sourceInformationMarkerStart($composer4, -1954435404, str3);
                skillManagerViewModel3 = skillManagerViewModel5;
                boolean invalid$iv8 = $composer4.changedInstance(viewModel8) | $composer4.changedInstance(modelManagerViewModel) | $composer4.changedInstance(skillManagerViewModel3) | $composer4.changedInstance(task) | $composer4.changedInstance(agentTools);
                Object it$iv10 = $composer4.rememberedValue();
                if (invalid$iv8 || it$iv10 == Composer.INSTANCE.getEmpty()) {
                    str2 = str3;
                    agentTools2 = agentTools;
                    $composer3 = $composer4;
                    i4 = i3;
                    viewModel2 = viewModel8;
                    final MutableState mutableState3 = showSkillManagerBottomSheet$delegate;
                    Object value$iv21 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AgentChatScreenKt.AgentChatScreen$lambda$72$lambda$71(viewModel8, modelManagerViewModel, skillManagerViewModel3, task, agentTools, mutableState3, curSystemPrompt$delegate, ((Boolean) obj).booleanValue());
                        }
                    };
                    $composer4.updateRememberedValue(value$iv21);
                    it$iv10 = value$iv21;
                } else {
                    i4 = i3;
                    str2 = str3;
                    agentTools2 = agentTools;
                    $composer3 = $composer4;
                    viewModel2 = viewModel8;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer2 = $composer3;
                SkillManagerBottomSheetKt.SkillManagerBottomSheet(agentTools2, skillManagerViewModel3, (Function1) it$iv10, $composer2, (($dirty4 >> 9) & 14) | (($dirty4 >> 12) & 112));
            } else {
                i4 = i3;
                str2 = str3;
                viewModel2 = viewModel8;
                skillManagerViewModel3 = skillManagerViewModel5;
                $composer2 = $composer4;
                $composer2.startReplaceGroup(i4);
            }
            $composer2.endReplaceGroup();
            if (AgentChatScreen$lambda$25(showAlertForDisabledSkill$delegate)) {
                $composer2.startReplaceGroup(-457423449);
                ComposerKt.sourceInformation($composer2, "543@22175L37,546@22395L129,544@22228L66,542@22137L394");
                ComposerKt.sourceInformationMarkerStart($composer2, -1954417204, str2);
                Composer $this$cache$iv = $composer2;
                Object it$iv11 = $this$cache$iv.rememberedValue();
                if (it$iv11 == Composer.INSTANCE.getEmpty()) {
                    showAlertForDisabledSkill$delegate2 = showAlertForDisabledSkill$delegate;
                    Object value$iv22 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AgentChatScreenKt.AgentChatScreen$lambda$74$lambda$73(showAlertForDisabledSkill$delegate2);
                        }
                    };
                    $this$cache$iv.updateRememberedValue(value$iv22);
                    it$iv11 = value$iv22;
                } else {
                    showAlertForDisabledSkill$delegate2 = showAlertForDisabledSkill$delegate;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0((Function0) it$iv11, ComposableLambdaKt.rememberComposableLambda(-1527015972, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AgentChatScreenKt.AgentChatScreen$lambda$77(showAlertForDisabledSkill$delegate2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, null, null, ComposableLambdaKt.rememberComposableLambda(-948864800, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AgentChatScreenKt.AgentChatScreen$lambda$78(disabledSkillName$delegate2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), ComposableSingletons$AgentChatScreenKt.INSTANCE.getLambda$269414817$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1769526, 0, 16284);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(i4);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
            viewModel2 = viewModel;
            skillManagerViewModel3 = skillManagerViewModel;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final LlmChatViewModel llmChatViewModel6 = viewModel2;
            final SkillManagerViewModel skillManagerViewModel10 = skillManagerViewModel3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AgentChatScreenKt.AgentChatScreen$lambda$79(task, modelManagerViewModel, navigateUp, agentTools, llmChatViewModel6, skillManagerViewModel10, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean AgentChatScreen$lambda$3(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void AgentChatScreen$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean AgentChatScreen$lambda$6(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AgentChatScreen$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final AskInfoAgentAction AgentChatScreen$lambda$9(MutableState<AskInfoAgentAction> mutableState) {
        MutableState<AskInfoAgentAction> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String AgentChatScreen$lambda$12(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView AgentChatScreen$lambda$15(MutableState<WebView> mutableState) {
        MutableState<WebView> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String AgentChatScreen$lambda$19(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final SendMessageTrigger AgentChatScreen$lambda$22(MutableState<SendMessageTrigger> mutableState) {
        MutableState<SendMessageTrigger> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean AgentChatScreen$lambda$25(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void AgentChatScreen$lambda$26(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String AgentChatScreen$lambda$28(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$31$lambda$30(LlmChatViewModel $viewModel, AgentTools $agentTools, Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        updateProgressPanel($viewModel, model, $agentTools);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$37$lambda$36(AgentTools $agentTools, LlmChatViewModel $viewModel, float $screenWidthDp, Model model) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(model, "model");
        CallJsSkillResultImage resultImage = $agentTools.getResultImageToShow();
        if (resultImage != null) {
            String base64 = resultImage.getBase64();
            if (base64 != null && (bitmap = SkillManagerViewModelKt.decodeBase64ToBitmap(base64)) != null) {
                $viewModel.addMessage(model, new ChatMessageImage(CollectionsKt.listOf(bitmap), CollectionsKt.listOf(AndroidImageBitmap_androidKt.asImageBitmap(bitmap)), (int) (((double) $screenWidthDp) * 0.8d), ChatSide.AGENT, -1.0f, null, true, 32, null));
            }
            $agentTools.setResultImageToShow(null);
        }
        CallJsSkillResultWebview webview = $agentTools.getResultWebviewToShow();
        if (webview != null) {
            String url = webview.getUrl();
            if (url == null) {
                url = "";
            }
            String url2 = url;
            boolean iframe = Intrinsics.areEqual((Object) webview.getIframe(), (Object) true);
            Float aspectRatio = webview.getAspectRatio();
            float aspectRatio2 = aspectRatio != null ? aspectRatio.floatValue() : 1.333f;
            $viewModel.addMessage(model, new ChatMessageWebView(url2, iframe, aspectRatio2, null, true, 8, null));
            $agentTools.setResultWebviewToShow(null);
        }
        updateProgressPanel($viewModel, model, $agentTools);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$41$lambda$40(LlmChatViewModel $viewModel, ModelManagerViewModel $modelManagerViewModel, SkillManagerViewModel $skillManagerViewModel, AgentTools $agentTools, MutableState $curSystemPrompt$delegate, Task task, Model model) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(model, "model");
        resetSessionWithCurrentSkills$default($viewModel, $modelManagerViewModel, $skillManagerViewModel, task, AgentChatScreen$lambda$19($curSystemPrompt$delegate), $agentTools, null, 64, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$39$lambda$38(MutableState $showSkillManagerBottomSheet$delegate) {
        AgentChatScreen$lambda$4($showSkillManagerBottomSheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List AgentChatScreen$lambda$64$lambda$63(SkillManagerViewModel $skillManagerViewModel) {
        Iterable $this$map$iv = $skillManagerViewModel.getSelectedSkills();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Skill skill = (Skill) item$iv$iv;
            destination$iv$iv.add(skill.getBuiltIn() ? skill.getName() : "custom_skill");
        }
        return (List) destination$iv$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$49(AgentTools $agentTools, final LlmChatViewModel $viewModel, ChatWebViewClient $chatWebViewClient, final MutableState $webViewRef$delegate, MutableState $currentAskInfoAction$delegate, MutableState $askInfoInputValue$delegate, MutableState $showAskInfoDialog$delegate, final Model model, Composer $composer, int $changed) {
        String str;
        ReceiveChannel<AgentAction> receiveChannel;
        Intrinsics.checkNotNullParameter(model, "model");
        ComposerKt.sourceInformation($composer, "C210@8971L32,213@9223L27,214@9287L5288,214@9257L5318,343@14668L140,348@14886L1173,341@14583L1485:AgentChatScreen.kt#41d64j");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1297117366, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreen.<anonymous> (AgentChatScreen.kt:209)");
        }
        ReceiveChannel<AgentAction> actionChannel = $agentTools.getActionChannel();
        ImageVector doneIcon = VectorResources_androidKt.vectorResource(ImageVector.INSTANCE, C2421R.drawable.skill, $composer, 6);
        State currentModel$delegate = SnapshotStateKt.rememberUpdatedState(model, $composer, $changed & 14);
        ComposerKt.sourceInformationMarkerStart($composer, 989291326, "CC(remember):AgentChatScreen.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance(actionChannel) | $composer.changedInstance($viewModel) | $composer.changed(currentModel$delegate) | $composer.changed(doneIcon) | $composer.changedInstance($chatWebViewClient);
        Object value$iv = $composer.rememberedValue();
        if (invalid$iv || value$iv == Composer.INSTANCE.getEmpty()) {
            str = "CC(remember):AgentChatScreen.kt#9igjgp";
            receiveChannel = actionChannel;
            value$iv = new AgentChatScreenKt$AgentChatScreen$5$1$1(actionChannel, $viewModel, doneIcon, currentModel$delegate, $chatWebViewClient, $webViewRef$delegate, $currentAskInfoAction$delegate, $askInfoInputValue$delegate, $showAskInfoDialog$delegate, null);
            $composer.updateRememberedValue(value$iv);
        } else {
            str = "CC(remember):AgentChatScreen.kt#9igjgp";
            receiveChannel = actionChannel;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(receiveChannel, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) value$iv, $composer, 0);
        Modifier modifierM2036size3ABfNKs = SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(300));
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart($composer, 989458370, str2);
        Object it$iv = $composer.rememberedValue();
        if (it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AgentChatScreenKt.AgentChatScreen$lambda$49$lambda$45$lambda$44($webViewRef$delegate, (WebView) obj);
                }
            };
            $composer.updateRememberedValue(value$iv2);
            it$iv = value$iv2;
        }
        Function1 function1 = (Function1) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 989466379, str2);
        boolean invalid$iv2 = $composer.changedInstance($viewModel) | $composer.changedInstance(model);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
            Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AgentChatScreenKt.AgentChatScreen$lambda$49$lambda$48$lambda$47($viewModel, model, (ConsoleMessage) obj);
                }
            };
            $composer.updateRememberedValue(value$iv3);
            it$iv2 = value$iv3;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        GalleryWebViewKt.GalleryWebView(modifierM2036size3ABfNKs, null, false, false, false, function1, (Function1) it$iv2, null, $chatWebViewClient, $composer, 196614, 158);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Model AgentChatScreen$lambda$49$lambda$42(State<Model> state) {
        Object thisObj$iv = state.getValue();
        return (Model) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$49$lambda$45$lambda$44(MutableState $webViewRef$delegate, WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        $webViewRef$delegate.setValue(webView);
        
        // FIXED: Security enhancement - Set context for JavaScript interface validation
        chatViewJavascriptInterface.setContext(webView.getContext());
        
        // FIXED: Security enhancement - Disable file access from WebView
        webView.getSettings().setAllowFileAccess(false);
        
        // FIXED: Security enhancement - Disable content URL access if not needed
        webView.getSettings().setAllowContentAccess(false);
        
        // FIXED: Security enhancement - Add interface with strict naming
        // Using a non-predictable interface name reduces attack surface
        webView.addJavascriptInterface(chatViewJavascriptInterface, "AiEdgeGallery");
        
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$49$lambda$48$lambda$47(LlmChatViewModel $viewModel, Model $model, ConsoleMessage consoleMessage) {
        LogMessageLevel logMessageLevel;
        if (consoleMessage != null) {
            ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
            switch (messageLevel == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageLevel.ordinal()]) {
                case 1:
                    logMessageLevel = LogMessageLevel.Info;
                    break;
                case 2:
                    logMessageLevel = LogMessageLevel.Error;
                    break;
                case 3:
                    logMessageLevel = LogMessageLevel.Warning;
                    break;
                default:
                    logMessageLevel = LogMessageLevel.Info;
                    break;
            }
            String strSourceId = consoleMessage.sourceId();
            Intrinsics.checkNotNullExpressionValue(strSourceId, "sourceId(...)");
            int iLineNumber = consoleMessage.lineNumber();
            String strMessage = consoleMessage.message();
            Intrinsics.checkNotNullExpressionValue(strMessage, "message(...)");
            LogMessage logMessage = new LogMessage(logMessageLevel, strSourceId, iLineNumber, strMessage);
            $viewModel.addLogMessageToLastCollapsableProgressPanel($model, logMessage);
            Log.d(TAG, consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$52$lambda$51(final LlmChatViewModel $viewModel, ModelManagerViewModel $modelManagerViewModel, SkillManagerViewModel $skillManagerViewModel, Task $task, AgentTools $agentTools, MutableState $curSystemPrompt$delegate, final String $systemPromptUpdatedMessage, String newPrompt) {
        Intrinsics.checkNotNullParameter(newPrompt, "newPrompt");
        $curSystemPrompt$delegate.setValue(newPrompt);
        resetSessionWithCurrentSkills($viewModel, $modelManagerViewModel, $skillManagerViewModel, $task, AgentChatScreen$lambda$19($curSystemPrompt$delegate), $agentTools, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AgentChatScreenKt.AgentChatScreen$lambda$52$lambda$51$lambda$50($viewModel, $systemPromptUpdatedMessage, (Model) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$52$lambda$51$lambda$50(LlmChatViewModel $viewModel, String $systemPromptUpdatedMessage, Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        $viewModel.addMessage(model, new ChatMessageInfo($systemPromptUpdatedMessage));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$61(LlmChatViewModel $viewModel, ModelManagerViewModel $modelManagerViewModel, final SkillManagerViewModel $skillManagerViewModel, final MutableState $sendMessageTrigger$delegate, final MutableState $disabledSkillName$delegate, final MutableState $showAlertForDisabledSkill$delegate, final Model model, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Composer $composer$iv$iv;
        MeasurePolicy measurePolicy$iv$iv;
        BoxScope $this$AgentChatScreen_u24lambda_u2461_u24lambda_u2460;
        SkillTryOutChip promptChip;
        Composer $composer$iv;
        Composer $composer2;
        Modifier modifier$iv$iv;
        Function0<ComposeUiNode> function03;
        Modifier modifier$iv$iv2;
        Composer $composer$iv$iv$iv;
        Arrangement.Horizontal horizontalArrangement$iv;
        Alignment.Vertical verticalAlignment$iv;
        Composer $composer3;
        Composer $composer$iv2;
        CompositionLocalMap localMap$iv$iv;
        Intrinsics.checkNotNullParameter(model, "model");
        ComposerKt.sourceInformation($composer, "C397@16685L16,398@16765L16,400@16884L3913:AgentChatScreen.kt#41d64j");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2009944014, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreen.<anonymous> (AgentChatScreen.kt:397)");
        }
        State uiState$delegate = SnapshotStateKt.collectAsState($viewModel.getUiState(), null, $composer, 0, 1);
        State modelManagerUiState$delegate = SnapshotStateKt.collectAsState($modelManagerViewModel.getUiState(), null, $composer, 0, 1);
        ModelInitializationStatus modelInitializationStatus = AgentChatScreen$lambda$61$lambda$54(modelManagerUiState$delegate).getModelInitializationStatus().get(model.getName());
        Modifier modifier$iv = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
        CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier$iv$iv3 = modifier$iv;
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
        Function0<ComposeUiNode> function04 = function0;
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer);
        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        MeasurePolicy measurePolicy$iv$iv2 = measurePolicy$iv;
        Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
        int i = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        int i2 = ((6 >> 6) & 112) | 6;
        BoxScope $this$AgentChatScreen_u24lambda_u2461_u24lambda_u24602 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, 118480479, "C402@16977L12,401@16933L1979,451@19031L21,448@18922L1867:AgentChatScreen.kt#41d64j");
        CompositionLocalMap localMap$iv$iv3 = localMap$iv$iv2;
        AnimatedVisibilityKt.AnimatedVisibility(!WindowInsets_androidKt.isImeVisible(WindowInsets.INSTANCE, $composer, 6), (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableSingletons$AgentChatScreenKt.INSTANCE.m10457getLambda$2022058580$app_debug(), $composer, 200064, 18);
        BoxScope $this$AgentChatScreen_u24lambda_u2461_u24lambda_u24603 = $this$AgentChatScreen_u24lambda_u2461_u24lambda_u24602;
        Modifier modifier$iv2 = PaddingKt.m1990paddingVpY3zN4$default(ScrollKt.horizontalScroll$default($this$AgentChatScreen_u24lambda_u2461_u24lambda_u24602.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), ScrollKt.rememberScrollState(0, $composer, 0, 1), false, null, false, 14, null), C1654Dp.m9788constructorimpl(12), 0.0f, 2, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
        Composer $composer$iv3 = $composer;
        Alignment.Vertical verticalAlignment$iv2 = centerVertically;
        ComposerKt.sourceInformationMarkerStart($composer$iv3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer$iv3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
        int $changed$iv$iv2 = (432 << 3) & 112;
        Composer $composer4 = $composer;
        ComposerKt.sourceInformationMarkerStart($composer$iv3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv3, 0));
        CompositionLocalMap localMap$iv$iv4 = $composer$iv3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer$iv3, modifier$iv2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier$iv$iv4 = modifier$iv2;
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        Composer $composer$iv$iv2 = $composer$iv3;
        Composer $composer$iv$iv$iv2 = $composer$iv3;
        ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!($composer$iv$iv$iv2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        $composer$iv$iv$iv2.startReusableNode();
        if ($composer$iv$iv$iv2.getInserting()) {
            function02 = constructor2;
            $composer$iv$iv$iv2.createNode(function02);
        } else {
            function02 = constructor2;
            $composer$iv$iv$iv2.useNode();
        }
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer$iv$iv$iv2);
        MeasurePolicy measurePolicy$iv$iv3 = measurePolicy$iv2;
        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
        int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        int i4 = ((432 >> 6) & 112) | 6;
        Composer $composer5 = $composer$iv$iv$iv2;
        Composer $composer$iv4 = $composer$iv$iv$iv2;
        ComposerKt.sourceInformationMarkerStart($composer5, 1967216040, "C:AgentChatScreen.kt#41d64j");
        $composer5.startReplaceGroup(1310384571);
        ComposerKt.sourceInformation($composer5, "*461@19499L984,485@20565L202,457@19287L1480");
        for (final SkillTryOutChip promptChip2 : SkillManagerViewModelKt.getTRYOUT_CHIPS()) {
            Composer $composer$iv$iv$iv3 = $composer$iv$iv$iv2;
            boolean z = (modelInitializationStatus != null ? modelInitializationStatus.getStatus() : null) == ModelInitializationStatusType.INITIALIZED && !AgentChatScreen$lambda$61$lambda$53(uiState$delegate).isResettingSession();
            Composer $composer$iv5 = $composer$iv3;
            MeasurePolicy measurePolicy$iv$iv4 = measurePolicy$iv$iv3;
            PaddingValues paddingValuesM1983PaddingValuesYgX7TsA$default = PaddingKt.m1983PaddingValuesYgX7TsA$default(C1654Dp.m9788constructorimpl(12), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer5, 1310392304, "CC(remember):AgentChatScreen.kt#9igjgp");
            boolean invalid$iv = $composer5.changedInstance($skillManagerViewModel) | $composer5.changed(promptChip2) | $composer5.changedInstance(model);
            Composer $this$cache$iv = $composer5;
            Object value$iv = $this$cache$iv.rememberedValue();
            if (invalid$iv || value$iv == Composer.INSTANCE.getEmpty()) {
                BoxScope boxScope = $this$AgentChatScreen_u24lambda_u2461_u24lambda_u24603;
                $composer$iv$iv = $composer$iv$iv2;
                measurePolicy$iv$iv = measurePolicy$iv$iv2;
                $this$AgentChatScreen_u24lambda_u2461_u24lambda_u2460 = boxScope;
                promptChip = promptChip2;
                $composer$iv = $composer$iv4;
                Function0<ComposeUiNode> function05 = function04;
                $composer2 = $composer4;
                modifier$iv$iv = modifier$iv$iv3;
                function03 = function05;
                modifier$iv$iv2 = modifier$iv$iv4;
                $composer$iv$iv$iv = $composer$iv$iv$iv3;
                horizontalArrangement$iv = horizontalArrangement$iv2;
                verticalAlignment$iv = verticalAlignment$iv2;
                $composer3 = $composer5;
                CompositionLocalMap compositionLocalMap = localMap$iv$iv3;
                $composer$iv2 = $composer$iv5;
                localMap$iv$iv = compositionLocalMap;
                value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AgentChatScreenKt.m428x85340e02($skillManagerViewModel, promptChip2, model, $sendMessageTrigger$delegate, $disabledSkillName$delegate, $showAlertForDisabledSkill$delegate);
                    }
                };
                $this$cache$iv.updateRememberedValue(value$iv);
            } else {
                $composer3 = $composer5;
                promptChip = promptChip2;
                horizontalArrangement$iv = horizontalArrangement$iv2;
                verticalAlignment$iv = verticalAlignment$iv2;
                modifier$iv$iv2 = modifier$iv$iv4;
                $composer$iv = $composer$iv4;
                $composer$iv$iv$iv = $composer$iv$iv$iv3;
                CompositionLocalMap compositionLocalMap2 = localMap$iv$iv3;
                $composer$iv2 = $composer$iv5;
                localMap$iv$iv = compositionLocalMap2;
                Function0<ComposeUiNode> function06 = function04;
                $composer2 = $composer4;
                modifier$iv$iv = modifier$iv$iv3;
                function03 = function06;
                BoxScope boxScope2 = $this$AgentChatScreen_u24lambda_u2461_u24lambda_u24603;
                $composer$iv$iv = $composer$iv$iv2;
                measurePolicy$iv$iv = measurePolicy$iv$iv2;
                $this$AgentChatScreen_u24lambda_u2461_u24lambda_u2460 = boxScope2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final SkillTryOutChip promptChip3 = promptChip;
            Composer $composer6 = $composer3;
            ButtonKt.FilledTonalButton((Function0) value$iv, null, z, null, null, null, null, paddingValuesM1983PaddingValuesYgX7TsA$default, null, ComposableLambdaKt.rememberComposableLambda(-869374100, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AgentChatScreenKt.AgentChatScreen$lambda$61$lambda$60$lambda$59$lambda$58(promptChip3, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer6, 54), $composer6, 817889280, 378);
            $composer5 = $composer6;
            measurePolicy$iv$iv3 = measurePolicy$iv$iv4;
            $composer$iv3 = $composer$iv2;
            $composer$iv$iv$iv2 = $composer$iv$iv$iv;
            $composer$iv4 = $composer$iv;
            horizontalArrangement$iv2 = horizontalArrangement$iv;
            verticalAlignment$iv2 = verticalAlignment$iv;
            localMap$iv$iv3 = localMap$iv$iv;
            modifier$iv$iv4 = modifier$iv$iv2;
            Function0<ComposeUiNode> function07 = function03;
            modifier$iv$iv3 = modifier$iv$iv;
            $composer4 = $composer2;
            function04 = function07;
            BoxScope boxScope3 = $this$AgentChatScreen_u24lambda_u2461_u24lambda_u2460;
            measurePolicy$iv$iv2 = measurePolicy$iv$iv;
            $composer$iv$iv2 = $composer$iv$iv;
            $this$AgentChatScreen_u24lambda_u2461_u24lambda_u24603 = boxScope3;
        }
        Composer $composer7 = $composer5;
        Composer $composer$iv$iv$iv4 = $composer$iv$iv$iv2;
        $composer7.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer7);
        ComposerKt.sourceInformationMarkerEnd($composer$iv4);
        $composer$iv$iv$iv4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv4);
        ComposerKt.sourceInformationMarkerEnd($composer$iv$iv2);
        ComposerKt.sourceInformationMarkerEnd($composer$iv3);
        ComposerKt.sourceInformationMarkerEnd($composer4);
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

    private static final ChatUiState AgentChatScreen$lambda$61$lambda$53(State<ChatUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ChatUiState) thisObj$iv;
    }

    private static final ModelManagerUiState AgentChatScreen$lambda$61$lambda$54(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AgentChatScreen$lambda$61$lambda$60$lambda$59$lambda$57$lambda$56 */
    public static final Unit m428x85340e02(SkillManagerViewModel $skillManagerViewModel, SkillTryOutChip $promptChip, Model $model, MutableState $sendMessageTrigger$delegate, MutableState $disabledSkillName$delegate, MutableState $showAlertForDisabledSkill$delegate) {
        if ($skillManagerViewModel.isSkillSelected($promptChip.getSkillName())) {
            $sendMessageTrigger$delegate.setValue(new SendMessageTrigger($model, CollectionsKt.listOf(new ChatMessageText($promptChip.getPrompt(), ChatSide.USER, 0.0f, false, null, null, false, null, 252, null))));
            FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
            if (firebaseAnalytics != null) {
                String id = GalleryEvent.BUTTON_CLICKED.getId();
                Bundle $this$AgentChatScreen_u24lambda_u2461_u24lambda_u2460_u24lambda_u2459_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455 = new Bundle();
                $this$AgentChatScreen_u24lambda_u2461_u24lambda_u2460_u24lambda_u2459_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455.putString("event_type", "agent_skills_prompt_chip");
                $this$AgentChatScreen_u24lambda_u2461_u24lambda_u2460_u24lambda_u2459_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455.putString("button_id", $promptChip.getLabel());
                Unit unit = Unit.INSTANCE;
                firebaseAnalytics.logEvent(id, $this$AgentChatScreen_u24lambda_u2461_u24lambda_u2460_u24lambda_u2459_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455);
            }
        } else {
            $disabledSkillName$delegate.setValue($promptChip.getSkillName());
            AgentChatScreen$lambda$26($showAlertForDisabledSkill$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$61$lambda$60$lambda$59$lambda$58(SkillTryOutChip $promptChip, RowScope FilledTonalButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(FilledTonalButton, "$this$FilledTonalButton");
        ComposerKt.sourceInformation($composer, "C486@20581L81,487@20677L39,488@20731L22:AgentChatScreen.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-869374100, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AgentChatScreen.kt:486)");
            }
            IconKt.m4075Iconww6aTOc($promptChip.getIcon(), (String) null, SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(20)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(4)), $composer, 6);
            TextKt.m4781TextNvy7gAk($promptChip.getLabel(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$66$lambda$65(MutableState $askInfoInputValue$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $askInfoInputValue$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$68$lambda$67(AskInfoAgentAction $action, MutableState $askInfoInputValue$delegate, MutableState $showAskInfoDialog$delegate, MutableState $currentAskInfoAction$delegate) {
        $action.getResult().complete(AgentChatScreen$lambda$12($askInfoInputValue$delegate));
        AgentChatScreen$lambda$7($showAskInfoDialog$delegate, false);
        $currentAskInfoAction$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$70$lambda$69(AskInfoAgentAction $action, MutableState $showAskInfoDialog$delegate, MutableState $currentAskInfoAction$delegate) {
        $action.getResult().complete("");
        AgentChatScreen$lambda$7($showAskInfoDialog$delegate, false);
        $currentAskInfoAction$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$72$lambda$71(LlmChatViewModel $viewModel, ModelManagerViewModel $modelManagerViewModel, SkillManagerViewModel $skillManagerViewModel, Task $task, AgentTools $agentTools, MutableState $showSkillManagerBottomSheet$delegate, MutableState $curSystemPrompt$delegate, boolean selectedSkillsChanged) {
        AgentChatScreen$lambda$4($showSkillManagerBottomSheet$delegate, false);
        if (selectedSkillsChanged) {
            Log.d(TAG, "Selected skill changed. Resetting conversation.");
            resetSessionWithCurrentSkills$default($viewModel, $modelManagerViewModel, $skillManagerViewModel, $task, AgentChatScreen$lambda$19($curSystemPrompt$delegate), $agentTools, null, 64, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$74$lambda$73(MutableState $showAlertForDisabledSkill$delegate) {
        AgentChatScreen$lambda$26($showAlertForDisabledSkill$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$78(MutableState $disabledSkillName$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C544@22230L62:AgentChatScreen.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-948864800, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreen.<anonymous> (AgentChatScreen.kt:544)");
            }
            TextKt.m4781TextNvy7gAk("The \"" + AgentChatScreen$lambda$28($disabledSkillName$delegate) + "\" skill is currently disabled", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$77(final MutableState $showAlertForDisabledSkill$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C547@22422L37,547@22405L111:AgentChatScreen.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1527015972, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreen.<anonymous> (AgentChatScreen.kt:547)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1416467041, "CC(remember):AgentChatScreen.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AgentChatScreenKt.AgentChatScreen$lambda$77$lambda$76$lambda$75($showAlertForDisabledSkill$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$AgentChatScreenKt.INSTANCE.getLambda$1220466124$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentChatScreen$lambda$77$lambda$76$lambda$75(MutableState $showAlertForDisabledSkill$delegate) {
        AgentChatScreen$lambda$26($showAlertForDisabledSkill$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void updateProgressPanel(LlmChatViewModel viewModel, Model model, AgentTools agentTools) {
        ChatMessage lastProgressPanelMessage = viewModel.getLastMessageWithType(model, ChatMessageType.COLLAPSABLE_PROGRESS_PANEL);
        if (lastProgressPanelMessage != null && (lastProgressPanelMessage instanceof ChatMessageCollapsableProgressPanel)) {
            if (StringsKt.startsWith$default(((ChatMessageCollapsableProgressPanel) lastProgressPanelMessage).getTitle(), "Loading", false, 2, (Object) null)) {
                agentTools.sendAgentAction(new SkillProgressAgentAction(StringsKt.replace$default(((ChatMessageCollapsableProgressPanel) lastProgressPanelMessage).getTitle(), "Loading", "Loaded", false, 4, (Object) null), false, null, null, null, 28, null));
            } else if (StringsKt.startsWith$default(((ChatMessageCollapsableProgressPanel) lastProgressPanelMessage).getTitle(), "Calling", false, 2, (Object) null)) {
                agentTools.sendAgentAction(new SkillProgressAgentAction(StringsKt.replace$default(((ChatMessageCollapsableProgressPanel) lastProgressPanelMessage).getTitle(), "Calling", "Called", false, 4, (Object) null), false, null, null, null, 28, null));
            } else if (StringsKt.startsWith$default(((ChatMessageCollapsableProgressPanel) lastProgressPanelMessage).getTitle(), "Executing", false, 2, (Object) null)) {
                agentTools.sendAgentAction(new SkillProgressAgentAction(StringsKt.replace$default(((ChatMessageCollapsableProgressPanel) lastProgressPanelMessage).getTitle(), "Executing", "Executed", false, 4, (Object) null), false, null, null, null, 28, null));
            }
        }
    }

    static /* synthetic */ void resetSessionWithCurrentSkills$default(LlmChatViewModel llmChatViewModel, ModelManagerViewModel modelManagerViewModel, SkillManagerViewModel skillManagerViewModel, Task task, String str, AgentTools agentTools, Function1 function1, int i, Object obj) {
        Function1 function12;
        if ((i & 64) == 0) {
            function12 = function1;
        } else {
            function12 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AgentChatScreenKt.resetSessionWithCurrentSkills$lambda$80((Model) obj2);
                }
            };
        }
        resetSessionWithCurrentSkills(llmChatViewModel, modelManagerViewModel, skillManagerViewModel, task, str, agentTools, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resetSessionWithCurrentSkills$lambda$80(Model it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private static final void resetSessionWithCurrentSkills(LlmChatViewModel viewModel, ModelManagerViewModel modelManagerViewModel, SkillManagerViewModel skillManagerViewModel, Task task, String curSystemPrompt, AgentTools agentTools, final Function1<? super Model, Unit> function1) {
        final Model model = modelManagerViewModel.getUiState().getValue().getSelectedModel();
        viewModel.resetSession(task, model, skillManagerViewModel.getSelectedSkills().isEmpty() ? null : skillManagerViewModel.getSystemPrompt(curSystemPrompt), CollectionsKt.listOf(ToolKt.tool(agentTools)), true, true, new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AgentChatScreenKt.resetSessionWithCurrentSkills$lambda$81(function1, model);
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resetSessionWithCurrentSkills$lambda$81(Function1 $onDone, Model $model) {
        $onDone.invoke($model);
        return Unit.INSTANCE;
    }
}
