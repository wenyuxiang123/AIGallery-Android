package com.google.ai.edge.gallery.ui.llmchat;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.AnalyticsKt;
import com.google.ai.edge.gallery.GalleryEvent;
import com.google.ai.edge.gallery.data.BuiltInTaskId;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelCapability;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessage;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageAudioClip;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageImage;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageText;
import com.google.ai.edge.gallery.ui.common.chat.ChatViewKt;
import com.google.ai.edge.gallery.ui.common.chat.SendMessageTrigger;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: LlmChatScreen.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m921d1 = {"\u0000t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a±\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\f2\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\u0014\b\u0002\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010!0\u0007H\u0007¢\u0006\u0002\u0010\"\u001a7\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020$H\u0007¢\u0006\u0002\u0010%\u001a7\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020'H\u0007¢\u0006\u0002\u0010(\u001a\u00ad\u0002\u0010)\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020*2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\u00142\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\u0014\b\u0002\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010!0\u0007H\u0007¢\u0006\u0002\u0010+\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006,"}, m922d2 = {"TAG", "", "LlmChatScreen", "", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "navigateUp", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "taskId", "onFirstToken", "Lkotlin/Function1;", "Lcom/google/ai/edge/gallery/data/Model;", "onGenerateResponseDone", "onSkillClicked", "onResetSessionClickedOverride", "Lkotlin/Function2;", "Lcom/google/ai/edge/gallery/data/Task;", "composableBelowMessageList", "Landroidx/compose/runtime/Composable;", "viewModel", "Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModel;", "allowEditingSystemPrompt", "", "curSystemPrompt", "onSystemPromptChanged", "emptyStateComposable", "sendMessageTrigger", "Lcom/google/ai/edge/gallery/ui/common/chat/SendMessageTrigger;", "showImagePicker", "showAudioPicker", "getActiveSkills", "", "(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModel;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lcom/google/ai/edge/gallery/ui/common/chat/SendMessageTrigger;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "LlmAskImageScreen", "Lcom/google/ai/edge/gallery/ui/llmchat/LlmAskImageViewModel;", "(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/google/ai/edge/gallery/ui/llmchat/LlmAskImageViewModel;Landroidx/compose/runtime/Composer;II)V", "LlmAskAudioScreen", "Lcom/google/ai/edge/gallery/ui/llmchat/LlmAskAudioViewModel;", "(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/google/ai/edge/gallery/ui/llmchat/LlmAskAudioViewModel;Landroidx/compose/runtime/Composer;II)V", "ChatViewWrapper", "Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase;", "(Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/google/ai/edge/gallery/ui/common/chat/SendMessageTrigger;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class LlmChatScreenKt {
    private static final String TAG = "AGLlmChatScreen";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatViewWrapper$lambda$37(LlmChatViewModelBase llmChatViewModelBase, ModelManagerViewModel modelManagerViewModel, String str, Function0 function0, Modifier modifier, Function0 function02, Function1 function1, Function1 function12, Function2 function2, Function3 function3, Function3 function32, boolean z, String str2, Function1 function13, SendMessageTrigger sendMessageTrigger, boolean z2, boolean z3, Function0 function03, int i, int i2, int i3, Composer composer, int i4) {
        ChatViewWrapper(llmChatViewModelBase, modelManagerViewModel, str, function0, modifier, function02, function1, function12, function2, function3, function32, z, str2, function13, sendMessageTrigger, z2, z3, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmAskAudioScreen$lambda$12(ModelManagerViewModel modelManagerViewModel, Function0 function0, Modifier modifier, LlmAskAudioViewModel llmAskAudioViewModel, int i, int i2, Composer composer, int i3) {
        LlmAskAudioScreen(modelManagerViewModel, function0, modifier, llmAskAudioViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmAskImageScreen$lambda$11(ModelManagerViewModel modelManagerViewModel, Function0 function0, Modifier modifier, LlmAskImageViewModel llmAskImageViewModel, int i, int i2, Composer composer, int i3) {
        LlmAskImageScreen(modelManagerViewModel, function0, modifier, llmAskImageViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmChatScreen$lambda$10(ModelManagerViewModel modelManagerViewModel, Function0 function0, Modifier modifier, String str, Function1 function1, Function1 function12, Function0 function02, Function2 function2, Function3 function3, LlmChatViewModel llmChatViewModel, boolean z, String str2, Function1 function13, Function3 function32, SendMessageTrigger sendMessageTrigger, boolean z2, boolean z3, Function0 function03, int i, int i2, int i3, Composer composer, int i4) {
        LlmChatScreen(modelManagerViewModel, function0, modifier, str, function1, function12, function02, function2, function3, llmChatViewModel, z, str2, function13, function32, sendMessageTrigger, z2, z3, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmChatScreen$lambda$1$lambda$0(Model it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmChatScreen$lambda$3$lambda$2(Model it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmChatScreen$lambda$7$lambda$6(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void LlmChatScreen(final ModelManagerViewModel modelManagerViewModel, final Function0<Unit> navigateUp, Modifier modifier, String taskId, Function1<? super Model, Unit> function1, Function1<? super Model, Unit> function12, Function0<Unit> function0, Function2<? super Task, ? super Model, Unit> function2, Function3<? super Model, ? super Composer, ? super Integer, Unit> function3, LlmChatViewModel viewModel, boolean allowEditingSystemPrompt, String curSystemPrompt, Function1<? super String, Unit> function13, Function3<? super Model, ? super Composer, ? super Integer, Unit> function32, SendMessageTrigger sendMessageTrigger, boolean showImagePicker, boolean showAudioPicker, Function0<? extends List<String>> function02, Composer $composer, final int $changed, final int $changed1, final int i) {
        Composer $composer2;
        Modifier modifier2;
        String taskId2;
        Function1<? super Model, Unit> function14;
        Function1<? super Model, Unit> function15;
        Function0<Unit> function03;
        Function2<? super Task, ? super Model, Unit> function22;
        Function3<? super Model, ? super Composer, ? super Integer, Unit> function33;
        LlmChatViewModel viewModel2;
        boolean allowEditingSystemPrompt2;
        String curSystemPrompt2;
        Function1<? super String, Unit> function16;
        Function3<? super Model, ? super Composer, ? super Integer, Unit> function34;
        SendMessageTrigger sendMessageTrigger2;
        boolean showImagePicker2;
        boolean showAudioPicker2;
        Function0<? extends List<String>> function04;
        Modifier modifier3;
        String taskId3;
        Function1<? super Model, Unit> function17;
        Function1<? super Model, Unit> function18;
        Function1<? super Model, Unit> function19;
        Function1<? super Model, Unit> function110;
        Function0<Unit> function05;
        Function0<Unit> function06;
        Function3<? super Model, ? super Composer, ? super Integer, Unit> function35;
        LlmChatViewModel viewModel3;
        Function1<? super String, Unit> function111;
        int $dirty;
        Object it$iv;
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(navigateUp, "navigateUp");
        Composer $composer3 = $composer.startRestartGroup(-1093467858);
        ComposerKt.sourceInformation($composer3, "C(LlmChatScreen)P(5,7,6,16,8,9,11,10,1,17!2,12!1,13,15,14)77@3206L782:LlmChatScreen.kt#t2uuva");
        int $dirty2 = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changedInstance(modelManagerViewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(navigateUp) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty2 |= 384;
        } else if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changed(modifier) ? 256 : 128;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty2 |= 3072;
        } else if (($changed & 3072) == 0) {
            $dirty2 |= $composer3.changed(taskId) ? 2048 : 1024;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty2 |= 24576;
        } else if (($changed & 24576) == 0) {
            $dirty2 |= $composer3.changedInstance(function1) ? 16384 : 8192;
        }
        int i5 = i & 32;
        if (i5 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.f249xf2722a21;
        } else if (($changed & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty2 |= $composer3.changedInstance(function12) ? 131072 : 65536;
        }
        int i6 = i & 64;
        if (i6 != 0) {
            $dirty2 |= 1572864;
        } else if (($changed & 1572864) == 0) {
            $dirty2 |= $composer3.changedInstance(function0) ? 1048576 : 524288;
        }
        int i7 = i & 128;
        if (i7 != 0) {
            $dirty2 |= 12582912;
        } else if (($changed & 12582912) == 0) {
            $dirty2 |= $composer3.changedInstance(function2) ? 8388608 : 4194304;
        }
        int i8 = i & 256;
        if (i8 != 0) {
            $dirty2 |= 100663296;
        } else if (($changed & 100663296) == 0) {
            $dirty2 |= $composer3.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (($changed & 805306368) == 0) {
            $dirty2 |= ((i & 512) == 0 && $composer3.changedInstance(viewModel)) ? 536870912 : 268435456;
        }
        int i9 = i & 1024;
        if (i9 != 0) {
            $dirty1 |= 6;
        } else if (($changed1 & 6) == 0) {
            $dirty1 |= $composer3.changed(allowEditingSystemPrompt) ? 4 : 2;
        }
        int i10 = i & 2048;
        if (i10 != 0) {
            $dirty1 |= 48;
        } else if (($changed1 & 48) == 0) {
            $dirty1 |= $composer3.changed(curSystemPrompt) ? 32 : 16;
        }
        int i11 = i & 4096;
        if (i11 != 0) {
            $dirty1 |= 384;
        } else if (($changed1 & 384) == 0) {
            $dirty1 |= $composer3.changedInstance(function13) ? 256 : 128;
        }
        int i12 = i & 8192;
        if (i12 != 0) {
            $dirty1 |= 3072;
        } else if (($changed1 & 3072) == 0) {
            $dirty1 |= $composer3.changedInstance(function32) ? 2048 : 1024;
        }
        int i13 = i & 16384;
        if (i13 != 0) {
            $dirty1 |= 24576;
        } else if (($changed1 & 24576) == 0) {
            $dirty1 |= $composer3.changedInstance(sendMessageTrigger) ? 16384 : 8192;
        }
        int i14 = i & 32768;
        if (i14 != 0) {
            $dirty1 |= ProfileVerifier.CompilationStatus.f249xf2722a21;
        } else if (($changed1 & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty1 |= $composer3.changed(showImagePicker) ? 131072 : 65536;
        }
        int i15 = i & 65536;
        if (i15 != 0) {
            $dirty1 |= 1572864;
        } else if (($changed1 & 1572864) == 0) {
            $dirty1 |= $composer3.changed(showAudioPicker) ? 1048576 : 524288;
        }
        int i16 = i & 131072;
        if (i16 != 0) {
            $dirty1 |= 12582912;
        } else if (($changed1 & 12582912) == 0) {
            $dirty1 |= $composer3.changedInstance(function02) ? 8388608 : 4194304;
        }
        if ($composer3.shouldExecute((($dirty2 & 306783379) == 306783378 && (4793491 & $dirty1) == 4793490) ? false : true, $dirty2 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "62@2572L2,63@2620L2,64@2655L2,67@2821L15,70@2959L2,75@3183L15");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                Modifier.Companion modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier;
                String taskId4 = i3 != 0 ? BuiltInTaskId.LLM_CHAT : taskId;
                if (i4 != 0) {
                    ComposerKt.sourceInformationMarkerStart($composer3, 1444382864, "CC(remember):LlmChatScreen.kt#9igjgp");
                    modifier3 = modifier4;
                    Object it$iv2 = $composer3.rememberedValue();
                    taskId3 = taskId4;
                    if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LlmChatScreenKt.LlmChatScreen$lambda$1$lambda$0((Model) obj);
                            }
                        };
                        $composer3.updateRememberedValue(value$iv);
                        it$iv = value$iv;
                    } else {
                        it$iv = it$iv2;
                    }
                    function17 = (Function1) it$iv;
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                } else {
                    modifier3 = modifier4;
                    taskId3 = taskId4;
                    function17 = function1;
                }
                if (i5 != 0) {
                    ComposerKt.sourceInformationMarkerStart($composer3, 1444384400, "CC(remember):LlmChatScreen.kt#9igjgp");
                    function18 = function17;
                    Object it$iv3 = $composer3.rememberedValue();
                    if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LlmChatScreenKt.LlmChatScreen$lambda$3$lambda$2((Model) obj);
                            }
                        };
                        $composer3.updateRememberedValue(value$iv2);
                        it$iv3 = value$iv2;
                    }
                    function19 = (Function1) it$iv3;
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                } else {
                    function18 = function17;
                    function19 = function12;
                }
                if (i6 != 0) {
                    ComposerKt.sourceInformationMarkerStart($composer3, 1444385520, "CC(remember):LlmChatScreen.kt#9igjgp");
                    function110 = function19;
                    Object it$iv4 = $composer3.rememberedValue();
                    if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        $composer3.updateRememberedValue(value$iv3);
                        it$iv4 = value$iv3;
                    }
                    function05 = (Function0) it$iv4;
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                } else {
                    function110 = function19;
                    function05 = function0;
                }
                Function2<? super Task, ? super Model, Unit> function23 = i7 != 0 ? null : function2;
                Function3<? super Model, ? super Composer, ? super Integer, Unit> lambda$830606768$app_debug = i8 != 0 ? ComposableSingletons$LlmChatScreenKt.INSTANCE.getLambda$830606768$app_debug() : function3;
                if ((i & 512) != 0) {
                    function06 = function05;
                    function35 = lambda$830606768$app_debug;
                    ComposerKt.sourceInformationMarkerStart($composer3, 1890788296, "CC(hiltViewModel)P(1)51@2126L7,55@2260L46:HiltViewModel.kt#9mcars");
                    ViewModelStoreOwner viewModelStoreOwner$iv = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer3, LocalViewModelStoreOwner.$stable);
                    if (viewModelStoreOwner$iv == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    int $changed$iv$iv = (0 & 14) | (0 & 112);
                    function22 = function23;
                    ComposerKt.sourceInformationMarkerStart($composer3, 1192010736, "CC(hiltViewModel)P(1)38@1622L7,43@1774L47,44@1833L54:HiltViewModel.kt#gplxbw");
                    ViewModelProvider.Factory factory$iv$iv = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner$iv, $composer3, $changed$iv$iv & 14);
                    int $changed$iv$iv$iv = ($changed$iv$iv & 14) | ($changed$iv$iv & 112);
                    ComposerKt.sourceInformationMarkerStart($composer3, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
                    CreationExtras extras$iv$iv$iv = viewModelStoreOwner$iv instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner$iv).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                    ViewModel viewModel4 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LlmChatViewModel.class), viewModelStoreOwner$iv, (String) null, factory$iv$iv, extras$iv$iv$iv, $composer3, (($changed$iv$iv$iv << 3) & 112) | (($changed$iv$iv$iv << 3) & 896) | (($changed$iv$iv$iv << 3) & 7168) | (($changed$iv$iv$iv << 3) & 57344), 0);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    viewModel3 = (LlmChatViewModel) viewModel4;
                    $dirty2 &= -1879048193;
                } else {
                    function06 = function05;
                    function35 = lambda$830606768$app_debug;
                    function22 = function23;
                    viewModel3 = viewModel;
                }
                boolean allowEditingSystemPrompt3 = i9 != 0 ? false : allowEditingSystemPrompt;
                String curSystemPrompt3 = i10 != 0 ? "" : curSystemPrompt;
                if (i11 != 0) {
                    ComposerKt.sourceInformationMarkerStart($composer3, 1444395248, "CC(remember):LlmChatScreen.kt#9igjgp");
                    Object it$iv5 = $composer3.rememberedValue();
                    if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv4 = new Function1() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LlmChatScreenKt.LlmChatScreen$lambda$7$lambda$6((String) obj);
                            }
                        };
                        $composer3.updateRememberedValue(value$iv4);
                        it$iv5 = value$iv4;
                    }
                    function111 = (Function1) it$iv5;
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                } else {
                    function111 = function13;
                }
                Function3<? super Model, ? super Composer, ? super Integer, Unit> function3M11095getLambda$1219269216$app_debug = i12 != 0 ? ComposableSingletons$LlmChatScreenKt.INSTANCE.m11095getLambda$1219269216$app_debug() : function32;
                SendMessageTrigger sendMessageTrigger3 = i13 != 0 ? null : sendMessageTrigger;
                boolean showImagePicker3 = i14 != 0 ? false : showImagePicker;
                boolean showAudioPicker3 = i15 != 0 ? false : showAudioPicker;
                if (i16 != 0) {
                    ComposerKt.sourceInformationMarkerStart($composer3, 1444402429, "CC(remember):LlmChatScreen.kt#9igjgp");
                    Object it$iv6 = $composer3.rememberedValue();
                    int $dirty3 = $dirty2;
                    if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv5 = new Function0() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CollectionsKt.emptyList();
                            }
                        };
                        $composer3.updateRememberedValue(value$iv5);
                        it$iv6 = value$iv5;
                    }
                    Function0<? extends List<String>> function07 = (Function0) it$iv6;
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    function14 = function18;
                    taskId2 = taskId3;
                    function15 = function110;
                    function03 = function06;
                    function33 = function35;
                    $dirty = $dirty3;
                    modifier2 = modifier3;
                    function04 = function07;
                    viewModel2 = viewModel3;
                    allowEditingSystemPrompt2 = allowEditingSystemPrompt3;
                    curSystemPrompt2 = curSystemPrompt3;
                    function16 = function111;
                    function34 = function3M11095getLambda$1219269216$app_debug;
                    sendMessageTrigger2 = sendMessageTrigger3;
                    showImagePicker2 = showImagePicker3;
                    showAudioPicker2 = showAudioPicker3;
                } else {
                    function14 = function18;
                    taskId2 = taskId3;
                    function15 = function110;
                    function03 = function06;
                    function33 = function35;
                    $dirty = $dirty2;
                    function04 = function02;
                    modifier2 = modifier3;
                    viewModel2 = viewModel3;
                    allowEditingSystemPrompt2 = allowEditingSystemPrompt3;
                    curSystemPrompt2 = curSystemPrompt3;
                    function16 = function111;
                    function34 = function3M11095getLambda$1219269216$app_debug;
                    sendMessageTrigger2 = sendMessageTrigger3;
                    showImagePicker2 = showImagePicker3;
                    showAudioPicker2 = showAudioPicker3;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 512) != 0) {
                    $dirty2 &= -1879048193;
                }
                modifier2 = modifier;
                taskId2 = taskId;
                function14 = function1;
                function15 = function12;
                function03 = function0;
                function22 = function2;
                function33 = function3;
                viewModel2 = viewModel;
                allowEditingSystemPrompt2 = allowEditingSystemPrompt;
                curSystemPrompt2 = curSystemPrompt;
                function16 = function13;
                function34 = function32;
                sendMessageTrigger2 = sendMessageTrigger;
                showImagePicker2 = showImagePicker;
                showAudioPicker2 = showAudioPicker;
                function04 = function02;
                $dirty = $dirty2;
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1093467858, $dirty, $dirty1, "com.google.ai.edge.gallery.ui.llmchat.LlmChatScreen (LlmChatScreen.kt:76)");
            }
            $composer2 = $composer3;
            ChatViewWrapper(viewModel2, modelManagerViewModel, taskId2, navigateUp, modifier2, function03, function14, function15, function22, function33, function34, allowEditingSystemPrompt2, curSystemPrompt2, function16, sendMessageTrigger2, showImagePicker2, showAudioPicker2, function04, $composer2, (($dirty >> 27) & 14) | (($dirty << 3) & 112) | (($dirty >> 3) & 896) | (($dirty << 6) & 7168) | (($dirty << 6) & 57344) | (($dirty >> 3) & 458752) | (($dirty << 6) & 3670016) | (29360128 & ($dirty << 6)) | (($dirty << 3) & 234881024) | (($dirty << 3) & 1879048192), (($dirty1 >> 9) & 14) | (($dirty1 << 3) & 112) | (($dirty1 << 3) & 896) | (($dirty1 << 3) & 7168) | (57344 & $dirty1) | (458752 & $dirty1) | (3670016 & $dirty1) | (29360128 & $dirty1), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            taskId2 = taskId;
            function14 = function1;
            function15 = function12;
            function03 = function0;
            function22 = function2;
            function33 = function3;
            viewModel2 = viewModel;
            allowEditingSystemPrompt2 = allowEditingSystemPrompt;
            curSystemPrompt2 = curSystemPrompt;
            function16 = function13;
            function34 = function32;
            sendMessageTrigger2 = sendMessageTrigger;
            showImagePicker2 = showImagePicker;
            showAudioPicker2 = showAudioPicker;
            function04 = function02;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            final String str = taskId2;
            final Function1<? super Model, Unit> function112 = function14;
            final Function1<? super Model, Unit> function113 = function15;
            final Function0<Unit> function08 = function03;
            final Function2<? super Task, ? super Model, Unit> function24 = function22;
            final Function3<? super Model, ? super Composer, ? super Integer, Unit> function36 = function33;
            final LlmChatViewModel llmChatViewModel = viewModel2;
            final boolean z = allowEditingSystemPrompt2;
            final String str2 = curSystemPrompt2;
            final Function1<? super String, Unit> function114 = function16;
            final Function3<? super Model, ? super Composer, ? super Integer, Unit> function37 = function34;
            final SendMessageTrigger sendMessageTrigger4 = sendMessageTrigger2;
            final boolean z2 = showImagePicker2;
            final boolean z3 = showAudioPicker2;
            final Function0<? extends List<String>> function09 = function04;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LlmChatScreenKt.LlmChatScreen$lambda$10(modelManagerViewModel, navigateUp, modifier5, str, function112, function113, function08, function24, function36, llmChatViewModel, z, str2, function114, function37, sendMessageTrigger4, z2, z3, function09, $changed, $changed1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LlmAskImageScreen(final ModelManagerViewModel modelManagerViewModel, final Function0<Unit> navigateUp, Modifier modifier, LlmAskImageViewModel viewModel, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        LlmAskImageViewModel viewModel2;
        Composer $composer2;
        Modifier modifier3;
        Modifier.Companion modifier4;
        int $dirty;
        LlmAskImageViewModel viewModel3;
        CreationExtras extras$iv$iv$iv;
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(navigateUp, "navigateUp");
        Composer $composer3 = $composer.startRestartGroup(1009525584);
        ComposerKt.sourceInformation($composer3, "C(LlmAskImageScreen)P(!1,2)106@4193L1118:LlmChatScreen.kt#t2uuva");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changedInstance(modelManagerViewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(navigateUp) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty2 |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                viewModel2 = viewModel;
                int i3 = $composer3.changedInstance(viewModel2) ? 2048 : 1024;
                $dirty2 |= i3;
            } else {
                viewModel2 = viewModel;
            }
            $dirty2 |= i3;
        } else {
            viewModel2 = viewModel;
        }
        if ($composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "104@4170L15");
            if (($changed & 1) != 0 && !$composer3.getDefaultsInvalid()) {
                $composer3.skipToGroupEnd();
                if ((i & 8) != 0) {
                    $dirty2 &= -7169;
                }
                $dirty = $dirty2;
                modifier3 = modifier2;
                viewModel3 = viewModel2;
            } else {
                if (i2 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i & 8) == 0) {
                    $dirty = $dirty2;
                    modifier3 = modifier4;
                    viewModel3 = viewModel2;
                } else {
                    ComposerKt.sourceInformationMarkerStart($composer3, 1890788296, "CC(hiltViewModel)P(1)51@2126L7,55@2260L46:HiltViewModel.kt#9mcars");
                    ViewModelStoreOwner viewModelStoreOwner$iv = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer3, LocalViewModelStoreOwner.$stable);
                    if (viewModelStoreOwner$iv != null) {
                        int $changed$iv$iv = (0 & 14) | (0 & 112);
                        ComposerKt.sourceInformationMarkerStart($composer3, 1192010736, "CC(hiltViewModel)P(1)38@1622L7,43@1774L47,44@1833L54:HiltViewModel.kt#gplxbw");
                        ViewModelProvider.Factory factory$iv$iv = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner$iv, $composer3, $changed$iv$iv & 14);
                        int $changed$iv$iv$iv = ($changed$iv$iv & 14) | ($changed$iv$iv & 112);
                        ComposerKt.sourceInformationMarkerStart($composer3, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
                        if (viewModelStoreOwner$iv instanceof HasDefaultViewModelProviderFactory) {
                            extras$iv$iv$iv = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner$iv).getDefaultViewModelCreationExtras();
                        } else {
                            extras$iv$iv$iv = CreationExtras.Empty.INSTANCE;
                        }
                        ViewModel viewModel4 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LlmAskImageViewModel.class), viewModelStoreOwner$iv, (String) null, factory$iv$iv, extras$iv$iv$iv, $composer3, (($changed$iv$iv$iv << 3) & 112) | (($changed$iv$iv$iv << 3) & 896) | (($changed$iv$iv$iv << 3) & 7168) | (($changed$iv$iv$iv << 3) & 57344), 0);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        viewModel3 = (LlmAskImageViewModel) viewModel4;
                        $dirty = $dirty2 & (-7169);
                        modifier3 = modifier4;
                    } else {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1009525584, $dirty, -1, "com.google.ai.edge.gallery.ui.llmchat.LlmAskImageScreen (LlmChatScreen.kt:105)");
            }
            $composer2 = $composer3;
            ChatViewWrapper(viewModel3, modelManagerViewModel, BuiltInTaskId.LLM_ASK_IMAGE, navigateUp, modifier3, null, null, null, null, null, ComposableSingletons$LlmChatScreenKt.INSTANCE.m11096getLambda$159269329$app_debug(), false, null, null, null, true, false, null, $composer2, (($dirty >> 9) & 14) | 384 | (($dirty << 3) & 112) | (($dirty << 6) & 7168) | (($dirty << 6) & 57344), 1769478, 162784);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            viewModel2 = viewModel3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            final LlmAskImageViewModel llmAskImageViewModel = viewModel2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LlmChatScreenKt.LlmAskImageScreen$lambda$11(modelManagerViewModel, navigateUp, modifier5, llmAskImageViewModel, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LlmAskAudioScreen(final ModelManagerViewModel modelManagerViewModel, final Function0<Unit> navigateUp, Modifier modifier, LlmAskAudioViewModel viewModel, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        LlmAskAudioViewModel viewModel2;
        Composer $composer2;
        Modifier modifier3;
        Modifier.Companion modifier4;
        int $dirty;
        LlmAskAudioViewModel viewModel3;
        CreationExtras extras$iv$iv$iv;
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(navigateUp, "navigateUp");
        Composer $composer3 = $composer.startRestartGroup(872915568);
        ComposerKt.sourceInformation($composer3, "C(LlmAskAudioScreen)P(!1,2)145@5516L953:LlmChatScreen.kt#t2uuva");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changedInstance(modelManagerViewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(navigateUp) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty2 |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                viewModel2 = viewModel;
                int i3 = $composer3.changedInstance(viewModel2) ? 2048 : 1024;
                $dirty2 |= i3;
            } else {
                viewModel2 = viewModel;
            }
            $dirty2 |= i3;
        } else {
            viewModel2 = viewModel;
        }
        if ($composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "143@5493L15");
            if (($changed & 1) != 0 && !$composer3.getDefaultsInvalid()) {
                $composer3.skipToGroupEnd();
                if ((i & 8) != 0) {
                    $dirty2 &= -7169;
                }
                $dirty = $dirty2;
                modifier3 = modifier2;
                viewModel3 = viewModel2;
            } else {
                if (i2 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i & 8) == 0) {
                    $dirty = $dirty2;
                    modifier3 = modifier4;
                    viewModel3 = viewModel2;
                } else {
                    ComposerKt.sourceInformationMarkerStart($composer3, 1890788296, "CC(hiltViewModel)P(1)51@2126L7,55@2260L46:HiltViewModel.kt#9mcars");
                    ViewModelStoreOwner viewModelStoreOwner$iv = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer3, LocalViewModelStoreOwner.$stable);
                    if (viewModelStoreOwner$iv != null) {
                        int $changed$iv$iv = (0 & 14) | (0 & 112);
                        ComposerKt.sourceInformationMarkerStart($composer3, 1192010736, "CC(hiltViewModel)P(1)38@1622L7,43@1774L47,44@1833L54:HiltViewModel.kt#gplxbw");
                        ViewModelProvider.Factory factory$iv$iv = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner$iv, $composer3, $changed$iv$iv & 14);
                        int $changed$iv$iv$iv = ($changed$iv$iv & 14) | ($changed$iv$iv & 112);
                        ComposerKt.sourceInformationMarkerStart($composer3, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
                        if (viewModelStoreOwner$iv instanceof HasDefaultViewModelProviderFactory) {
                            extras$iv$iv$iv = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner$iv).getDefaultViewModelCreationExtras();
                        } else {
                            extras$iv$iv$iv = CreationExtras.Empty.INSTANCE;
                        }
                        ViewModel viewModel4 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LlmAskAudioViewModel.class), viewModelStoreOwner$iv, (String) null, factory$iv$iv, extras$iv$iv$iv, $composer3, (($changed$iv$iv$iv << 3) & 112) | (($changed$iv$iv$iv << 3) & 896) | (($changed$iv$iv$iv << 3) & 7168) | (($changed$iv$iv$iv << 3) & 57344), 0);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        viewModel3 = (LlmAskAudioViewModel) viewModel4;
                        $dirty = $dirty2 & (-7169);
                        modifier3 = modifier4;
                    } else {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(872915568, $dirty, -1, "com.google.ai.edge.gallery.ui.llmchat.LlmAskAudioScreen (LlmChatScreen.kt:144)");
            }
            $composer2 = $composer3;
            ChatViewWrapper(viewModel3, modelManagerViewModel, BuiltInTaskId.LLM_ASK_AUDIO, navigateUp, modifier3, null, null, null, null, null, ComposableSingletons$LlmChatScreenKt.INSTANCE.m11098getLambda$295879345$app_debug(), false, null, null, null, false, true, null, $composer2, (($dirty >> 9) & 14) | 384 | (($dirty << 3) & 112) | (($dirty << 6) & 7168) | (($dirty << 6) & 57344), 1769478, 162784);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            viewModel2 = viewModel3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            final LlmAskAudioViewModel llmAskAudioViewModel = viewModel2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LlmChatScreenKt.LlmAskAudioScreen$lambda$12(modelManagerViewModel, navigateUp, modifier5, llmAskAudioViewModel, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatViewWrapper$lambda$16$lambda$15(Model it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatViewWrapper$lambda$18$lambda$17(Model it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatViewWrapper$lambda$20$lambda$19(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void ChatViewWrapper(final LlmChatViewModelBase viewModel, final ModelManagerViewModel modelManagerViewModel, final String taskId, final Function0<Unit> navigateUp, Modifier modifier, Function0<Unit> function0, Function1<? super Model, Unit> function1, Function1<? super Model, Unit> function12, Function2<? super Task, ? super Model, Unit> function2, Function3<? super Model, ? super Composer, ? super Integer, Unit> function3, Function3<? super Model, ? super Composer, ? super Integer, Unit> function32, boolean allowEditingSystemPrompt, String curSystemPrompt, Function1<? super String, Unit> function13, SendMessageTrigger sendMessageTrigger, boolean showImagePicker, boolean showAudioPicker, Function0<? extends List<String>> function02, Composer $composer, final int $changed, final int $changed1, final int i) {
        Modifier modifier2;
        Function0<Unit> function03;
        Function1<? super Model, Unit> function14;
        Function1<? super Model, Unit> function15;
        Function2<? super Task, ? super Model, Unit> function22;
        Function3<? super Model, ? super Composer, ? super Integer, Unit> function33;
        Function3<? super Model, ? super Composer, ? super Integer, Unit> function34;
        boolean allowEditingSystemPrompt2;
        String curSystemPrompt2;
        Function1<? super String, Unit> function16;
        SendMessageTrigger sendMessageTrigger2;
        boolean showImagePicker2;
        boolean showAudioPicker2;
        Function0<? extends List<String>> function04;
        Function0<Unit> function05;
        Function0<Unit> function06;
        Function1<? super Model, Unit> function17;
        Function1<? super Model, Unit> function18;
        Function1<? super String, Unit> function19;
        Function1<? super String, Unit> function110;
        SendMessageTrigger sendMessageTrigger3;
        Function0<? extends List<String>> function07;
        Function2<? super Task, ? super Model, Unit> function23;
        Object value$iv;
        Object value$iv2;
        Object it$iv;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(navigateUp, "navigateUp");
        Composer $composer2 = $composer.startRestartGroup(1056459346);
        ComposerKt.sourceInformation($composer2, "C(ChatViewWrapper)P(17,5,16,7,6,11,8,9,10,1,3!2,12,13,15,14)181@6697L2,182@6735L2,183@6783L2,189@7096L2,193@7262L15,195@7312L7,202@7510L2302,264@9838L543,282@10408L17,283@10455L315,296@10846L50,198@7385L3987:LlmChatScreen.kt#t2uuva");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(modelManagerViewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(taskId) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(navigateUp) ? 2048 : 1024;
        }
        int i2 = i & 16;
        if (i2 != 0) {
            $dirty |= 24576;
        } else if (($changed & 24576) == 0) {
            $dirty |= $composer2.changed(modifier) ? 16384 : 8192;
        }
        int i3 = i & 32;
        if (i3 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f249xf2722a21;
        } else if (($changed & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 131072 : 65536;
        }
        int i4 = i & 64;
        if (i4 != 0) {
            $dirty |= 1572864;
        } else if (($changed & 1572864) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 1048576 : 524288;
        }
        int i5 = i & 128;
        if (i5 != 0) {
            $dirty |= 12582912;
        } else if (($changed & 12582912) == 0) {
            $dirty |= $composer2.changedInstance(function12) ? 8388608 : 4194304;
        }
        int i6 = i & 256;
        if (i6 != 0) {
            $dirty |= 100663296;
        } else if (($changed & 100663296) == 0) {
            $dirty |= $composer2.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i7 = i & 512;
        if (i7 != 0) {
            $dirty |= 805306368;
        } else if (($changed & 805306368) == 0) {
            $dirty |= $composer2.changedInstance(function3) ? 536870912 : 268435456;
        }
        int i8 = i & 1024;
        if (i8 != 0) {
            $dirty1 |= 6;
        } else if (($changed1 & 6) == 0) {
            $dirty1 |= $composer2.changedInstance(function32) ? 4 : 2;
        }
        int i9 = i & 2048;
        if (i9 != 0) {
            $dirty1 |= 48;
        } else if (($changed1 & 48) == 0) {
            $dirty1 |= $composer2.changed(allowEditingSystemPrompt) ? 32 : 16;
        }
        int i10 = i & 4096;
        if (i10 != 0) {
            $dirty1 |= 384;
        } else if (($changed1 & 384) == 0) {
            $dirty1 |= $composer2.changed(curSystemPrompt) ? 256 : 128;
        }
        int i11 = i & 8192;
        if (i11 != 0) {
            $dirty1 |= 3072;
        } else if (($changed1 & 3072) == 0) {
            $dirty1 |= $composer2.changedInstance(function13) ? 2048 : 1024;
        }
        int i12 = i & 16384;
        if (i12 != 0) {
            $dirty1 |= 24576;
        } else if (($changed1 & 24576) == 0) {
            $dirty1 |= $composer2.changedInstance(sendMessageTrigger) ? 16384 : 8192;
        }
        int i13 = i & 32768;
        if (i13 != 0) {
            $dirty1 |= ProfileVerifier.CompilationStatus.f249xf2722a21;
        } else if (($changed1 & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty1 |= $composer2.changed(showImagePicker) ? 131072 : 65536;
        }
        int i14 = i & 65536;
        if (i14 != 0) {
            $dirty1 |= 1572864;
        } else if (($changed1 & 1572864) == 0) {
            $dirty1 |= $composer2.changed(showAudioPicker) ? 1048576 : 524288;
        }
        int i15 = i & 131072;
        if (i15 != 0) {
            $dirty1 |= 12582912;
        } else if (($changed1 & 12582912) == 0) {
            $dirty1 |= $composer2.changedInstance(function02) ? 8388608 : 4194304;
        }
        if ($composer2.shouldExecute((($dirty & 306783379) == 306783378 && (4793491 & $dirty1) == 4793490) ? false : true, $dirty & 1)) {
            Modifier.Companion modifier3 = i2 != 0 ? Modifier.INSTANCE : modifier;
            if (i3 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer2, 1645156820, "CC(remember):LlmChatScreen.kt#9igjgp");
                Object it$iv2 = $composer2.rememberedValue();
                if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer2.updateRememberedValue(value$iv3);
                    it$iv = value$iv3;
                } else {
                    it$iv = it$iv2;
                }
                function05 = (Function0) it$iv;
                ComposerKt.sourceInformationMarkerEnd($composer2);
            } else {
                function05 = function0;
            }
            if (i4 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer2, 1645158036, "CC(remember):LlmChatScreen.kt#9igjgp");
                Object it$iv3 = $composer2.rememberedValue();
                function06 = function05;
                if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                    value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LlmChatScreenKt.ChatViewWrapper$lambda$16$lambda$15((Model) obj);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv2);
                } else {
                    value$iv2 = it$iv3;
                }
                function17 = (Function1) value$iv2;
                ComposerKt.sourceInformationMarkerEnd($composer2);
            } else {
                function06 = function05;
                function17 = function1;
            }
            if (i5 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer2, 1645159572, "CC(remember):LlmChatScreen.kt#9igjgp");
                Object it$iv4 = $composer2.rememberedValue();
                modifier2 = modifier3;
                if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv4 = new Function1() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LlmChatScreenKt.ChatViewWrapper$lambda$18$lambda$17((Model) obj);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv4);
                    it$iv4 = value$iv4;
                }
                function18 = (Function1) it$iv4;
                ComposerKt.sourceInformationMarkerEnd($composer2);
            } else {
                modifier2 = modifier3;
                function18 = function12;
            }
            Function2<? super Task, ? super Model, Unit> function24 = i6 != 0 ? null : function2;
            Function3<? super Model, ? super Composer, ? super Integer, Unit> lambda$1511550292$app_debug = i7 != 0 ? ComposableSingletons$LlmChatScreenKt.INSTANCE.getLambda$1511550292$app_debug() : function3;
            Function3<? super Model, ? super Composer, ? super Integer, Unit> function3M11097getLambda$2030167740$app_debug = i8 != 0 ? ComposableSingletons$LlmChatScreenKt.INSTANCE.m11097getLambda$2030167740$app_debug() : function32;
            boolean allowEditingSystemPrompt3 = i9 != 0 ? false : allowEditingSystemPrompt;
            String curSystemPrompt3 = i10 != 0 ? "" : curSystemPrompt;
            if (i11 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer2, 1645169588, "CC(remember):LlmChatScreen.kt#9igjgp");
                Object it$iv5 = $composer2.rememberedValue();
                if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv5 = new Function1() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LlmChatScreenKt.ChatViewWrapper$lambda$20$lambda$19((String) obj);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv5);
                    it$iv5 = value$iv5;
                }
                function19 = (Function1) it$iv5;
                ComposerKt.sourceInformationMarkerEnd($composer2);
            } else {
                function19 = function13;
            }
            SendMessageTrigger sendMessageTrigger4 = i12 != 0 ? null : sendMessageTrigger;
            boolean showImagePicker3 = i13 != 0 ? false : showImagePicker;
            boolean showAudioPicker3 = i14 != 0 ? false : showAudioPicker;
            if (i15 != 0) {
                sendMessageTrigger3 = sendMessageTrigger4;
                ComposerKt.sourceInformationMarkerStart($composer2, 1645174913, "CC(remember):LlmChatScreen.kt#9igjgp");
                Object it$iv6 = $composer2.rememberedValue();
                function110 = function19;
                if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                    value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CollectionsKt.emptyList();
                        }
                    };
                    $composer2.updateRememberedValue(value$iv);
                } else {
                    value$iv = it$iv6;
                }
                function07 = (Function0) value$iv;
                ComposerKt.sourceInformationMarkerEnd($composer2);
            } else {
                function110 = function19;
                sendMessageTrigger3 = sendMessageTrigger4;
                function07 = function02;
            }
            if (ComposerKt.isTraceInProgress()) {
                curSystemPrompt2 = curSystemPrompt3;
                ComposerKt.traceEventStart(1056459346, $dirty, $dirty1, "com.google.ai.edge.gallery.ui.llmchat.ChatViewWrapper (LlmChatScreen.kt:194)");
            } else {
                curSystemPrompt2 = curSystemPrompt3;
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            allowEditingSystemPrompt2 = allowEditingSystemPrompt3;
            function34 = function3M11097getLambda$2030167740$app_debug;
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            final Task task = modelManagerViewModel.getTaskById(taskId);
            Intrinsics.checkNotNull(task);
            LlmChatViewModelBase llmChatViewModelBase = viewModel;
            ComposerKt.sourceInformationMarkerStart($composer2, 1645185136, "CC(remember):LlmChatScreen.kt#9igjgp");
            function33 = lambda$1511550292$app_debug;
            final boolean showAudioPicker4 = showAudioPicker3;
            boolean invalid$iv = (($dirty & 3670016) == 1048576) | $composer2.changedInstance(viewModel) | $composer2.changedInstance(modelManagerViewModel) | (($dirty & 29360128) == 8388608) | $composer2.changedInstance(context) | $composer2.changedInstance(task) | (($dirty1 & 29360128) == 8388608);
            Object it$iv7 = $composer2.rememberedValue();
            if (invalid$iv || it$iv7 == Composer.INSTANCE.getEmpty()) {
                final Function1<? super Model, Unit> function111 = function17;
                final Function0<? extends List<String>> function08 = function07;
                final Function1<? super Model, Unit> function112 = function18;
                Object value$iv6 = new Function2() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LlmChatScreenKt.ChatViewWrapper$lambda$27$lambda$26(viewModel, modelManagerViewModel, function111, task, function08, function112, context, (Model) obj, (List) obj2);
                    }
                };
                $composer2.updateRememberedValue(value$iv6);
                it$iv7 = value$iv6;
            }
            Function2 function25 = (Function2) it$iv7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1645257873, "CC(remember):LlmChatScreen.kt#9igjgp");
            boolean invalid$iv2 = $composer2.changedInstance(viewModel) | $composer2.changedInstance(context) | $composer2.changedInstance(task) | $composer2.changedInstance(modelManagerViewModel);
            function15 = function18;
            Object value$iv7 = $composer2.rememberedValue();
            if (invalid$iv2 || value$iv7 == Composer.INSTANCE.getEmpty()) {
                value$iv7 = new Function2() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LlmChatScreenKt.ChatViewWrapper$lambda$30$lambda$29(viewModel, task, context, modelManagerViewModel, (Model) obj, (ChatMessage) obj2);
                    }
                };
                $composer2.updateRememberedValue(value$iv7);
            }
            Function2 function26 = (Function2) value$iv7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1645275587, "CC(remember):LlmChatScreen.kt#9igjgp");
            Object it$iv8 = $composer2.rememberedValue();
            if (it$iv8 == Composer.INSTANCE.getEmpty()) {
                Object value$iv8 = new Function4() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        return LlmChatScreenKt.ChatViewWrapper$lambda$32$lambda$31((Model) obj, (ChatMessage) obj2, ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
                    }
                };
                $composer2.updateRememberedValue(value$iv8);
                it$iv8 = value$iv8;
            }
            Function4 function4 = (Function4) it$iv8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1645277389, "CC(remember):LlmChatScreen.kt#9igjgp");
            boolean invalid$iv3 = ((234881024 & $dirty) == 67108864) | $composer2.changedInstance(task) | $composer2.changedInstance(viewModel) | ((458752 & $dirty1) == 131072) | (($dirty1 & 3670016) == 1048576);
            Object it$iv9 = $composer2.rememberedValue();
            if (invalid$iv3 || it$iv9 == Composer.INSTANCE.getEmpty()) {
                final Function2<? super Task, ? super Model, Unit> function27 = function24;
                final boolean z = showImagePicker3;
                Object value$iv9 = new Function1() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LlmChatScreenKt.ChatViewWrapper$lambda$34$lambda$33(function27, task, viewModel, z, showAudioPicker4, (Model) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv9);
                it$iv9 = value$iv9;
            }
            Function1 function113 = (Function1) it$iv9;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1645289636, "CC(remember):LlmChatScreen.kt#9igjgp");
            boolean invalid$iv4 = $composer2.changedInstance(viewModel);
            Object it$iv10 = $composer2.rememberedValue();
            if (invalid$iv4 || it$iv10 == Composer.INSTANCE.getEmpty()) {
                function23 = function24;
                Object value$iv10 = new Function1() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LlmChatScreenKt.ChatViewWrapper$lambda$36$lambda$35(viewModel, (Model) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv10);
                it$iv10 = value$iv10;
            } else {
                function23 = function24;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ChatViewKt.ChatView(task, llmChatViewModelBase, modelManagerViewModel, function25, function26, function4, navigateUp, modifier2, function113, null, (Function1) it$iv10, function06, true, function33, showImagePicker3, showAudioPicker4, function34, allowEditingSystemPrompt2, curSystemPrompt2, function110, sendMessageTrigger3, $composer2, (($dirty << 3) & 112) | ProfileVerifier.CompilationStatus.f249xf2722a21 | (($dirty << 3) & 896) | (($dirty << 9) & 3670016) | (($dirty << 9) & 29360128), (($dirty >> 12) & 112) | 384 | (($dirty >> 18) & 7168) | (($dirty1 >> 3) & 57344) | (458752 & ($dirty1 >> 3)) | (($dirty1 << 18) & 3670016) | (($dirty1 << 18) & 29360128) | (($dirty1 << 18) & 234881024) | (1879048192 & ($dirty1 << 18)), ($dirty1 >> 12) & 14, 512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function22 = function23;
            sendMessageTrigger2 = sendMessageTrigger3;
            function16 = function110;
            showAudioPicker2 = showAudioPicker4;
            function03 = function06;
            function14 = function17;
            function04 = function07;
            showImagePicker2 = showImagePicker3;
        } else {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            function03 = function0;
            function14 = function1;
            function15 = function12;
            function22 = function2;
            function33 = function3;
            function34 = function32;
            allowEditingSystemPrompt2 = allowEditingSystemPrompt;
            curSystemPrompt2 = curSystemPrompt;
            function16 = function13;
            sendMessageTrigger2 = sendMessageTrigger;
            showImagePicker2 = showImagePicker;
            showAudioPicker2 = showAudioPicker;
            function04 = function02;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final Function0<Unit> function09 = function03;
            final Function1<? super Model, Unit> function114 = function14;
            final Function1<? super Model, Unit> function115 = function15;
            final Function2<? super Task, ? super Model, Unit> function28 = function22;
            final Function3<? super Model, ? super Composer, ? super Integer, Unit> function35 = function33;
            final Function3<? super Model, ? super Composer, ? super Integer, Unit> function36 = function34;
            final boolean z2 = allowEditingSystemPrompt2;
            final String str = curSystemPrompt2;
            final Function1<? super String, Unit> function116 = function16;
            final SendMessageTrigger sendMessageTrigger5 = sendMessageTrigger2;
            final boolean z3 = showImagePicker2;
            final boolean z4 = showAudioPicker2;
            final Function0<? extends List<String>> function010 = function04;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LlmChatScreenKt.ChatViewWrapper$lambda$37(viewModel, modelManagerViewModel, taskId, navigateUp, modifier4, function09, function114, function115, function28, function35, function36, z2, str, function116, sendMessageTrigger5, z3, z4, function010, $changed, $changed1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatViewWrapper$lambda$27$lambda$26(final LlmChatViewModelBase $viewModel, final ModelManagerViewModel $modelManagerViewModel, Function1 $onFirstToken, final Task $task, Function0 $getActiveSkills, final Function1 $onGenerateResponseDone, final Context $context, final Model model, List messages) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Iterator it = messages.iterator();
        while (it.hasNext()) {
            $viewModel.addMessage(model, (ChatMessage) it.next());
        }
        List<Bitmap> arrayList = new ArrayList<>();
        List audioMessages = new ArrayList();
        Iterator it2 = messages.iterator();
        String text = "";
        ChatMessageText chatMessageText = null;
        while (it2.hasNext()) {
            ChatMessage message = (ChatMessage) it2.next();
            if (message instanceof ChatMessageText) {
                chatMessageText = (ChatMessageText) message;
                text = ((ChatMessageText) message).getContent();
            } else if (message instanceof ChatMessageImage) {
                arrayList.addAll(((ChatMessageImage) message).getBitmaps());
            } else if (message instanceof ChatMessageAudioClip) {
                audioMessages.add(message);
            }
        }
        if (((text.length() > 0) && chatMessageText != null) || !audioMessages.isEmpty()) {
            if (text.length() > 0) {
                $modelManagerViewModel.addTextInputHistory(text);
            }
            $viewModel.generateResponse(model, text, arrayList, audioMessages, $onFirstToken, new Function0() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LlmChatScreenKt.ChatViewWrapper$lambda$27$lambda$26$lambda$23($onGenerateResponseDone, model);
                }
            }, new Function1() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LlmChatScreenKt.ChatViewWrapper$lambda$27$lambda$26$lambda$24($viewModel, $context, $task, model, $modelManagerViewModel, (String) obj);
                }
            }, $task.allowCapability(ModelCapability.LLM_THINKING, model));
            List activeSkills = (List) $getActiveSkills.invoke();
            Log.d(TAG, "Analytics: generate_action, capability_name=" + $task.getId() + ", active_skills=" + CollectionsKt.joinToString$default(activeSkills, ",", null, null, 0, null, null, 62, null));
            FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
            if (firebaseAnalytics != null) {
                String id = GalleryEvent.GENERATE_ACTION.getId();
                Bundle $this$ChatViewWrapper_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425 = new Bundle();
                $this$ChatViewWrapper_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425.putString("capability_name", $task.getId());
                $this$ChatViewWrapper_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425.putString("model_id", model.getName());
                $this$ChatViewWrapper_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425.putBoolean("has_image", !arrayList.isEmpty());
                $this$ChatViewWrapper_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425.putInt("image_count", arrayList.size());
                $this$ChatViewWrapper_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425.putBoolean("has_audio", !audioMessages.isEmpty());
                $this$ChatViewWrapper_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425.putInt("audio_count", audioMessages.size());
                $this$ChatViewWrapper_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425.putInt("active_skills_count", activeSkills.size());
                $this$ChatViewWrapper_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425.putString("active_skills_list", CollectionsKt.joinToString$default(activeSkills, ",", null, null, 0, null, null, 62, null));
                Unit unit = Unit.INSTANCE;
                firebaseAnalytics.logEvent(id, $this$ChatViewWrapper_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatViewWrapper$lambda$27$lambda$26$lambda$23(Function1 $onGenerateResponseDone, Model $model) {
        $onGenerateResponseDone.invoke($model);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatViewWrapper$lambda$27$lambda$26$lambda$24(LlmChatViewModelBase $viewModel, Context $context, Task $task, Model $model, ModelManagerViewModel $modelManagerViewModel, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        $viewModel.handleError($context, $task, $model, $modelManagerViewModel, errorMessage);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatViewWrapper$lambda$30$lambda$29(final LlmChatViewModelBase $viewModel, final Task $task, final Context $context, final ModelManagerViewModel $modelManagerViewModel, final Model model, ChatMessage message) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof ChatMessageText) {
            $viewModel.runAgain(model, (ChatMessageText) message, new Function1() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LlmChatScreenKt.ChatViewWrapper$lambda$30$lambda$29$lambda$28($viewModel, $context, $task, model, $modelManagerViewModel, (String) obj);
                }
            }, $task.allowCapability(ModelCapability.LLM_THINKING, model));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatViewWrapper$lambda$30$lambda$29$lambda$28(LlmChatViewModelBase $viewModel, Context $context, Task $task, Model $model, ModelManagerViewModel $modelManagerViewModel, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        $viewModel.handleError($context, $task, $model, $modelManagerViewModel, errorMessage);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatViewWrapper$lambda$32$lambda$31(Model model, ChatMessage chatMessage, int i, int i2) {
        Intrinsics.checkNotNullParameter(model, "<unused var>");
        Intrinsics.checkNotNullParameter(chatMessage, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatViewWrapper$lambda$34$lambda$33(Function2 $onResetSessionClickedOverride, Task $task, LlmChatViewModelBase $viewModel, boolean $showImagePicker, boolean $showAudioPicker, Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if ($onResetSessionClickedOverride != null) {
            $onResetSessionClickedOverride.invoke($task, model);
        } else {
            LlmChatViewModelBase.resetSession$default($viewModel, $task, model, null, null, $showImagePicker, $showAudioPicker, null, false, 204, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatViewWrapper$lambda$36$lambda$35(LlmChatViewModelBase $viewModel, Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        $viewModel.stopResponse(model);
        return Unit.INSTANCE;
    }
}
