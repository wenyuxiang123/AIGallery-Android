package com.google.ai.edge.gallery.p006ui.common.chat;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.Log;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.CloseKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.draw.ShadowKt;
import androidx.compose.p000ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.p000ui.graphics.RectangleShapeKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.common.AudioClip;
import com.google.ai.edge.gallery.common.UtilsKt;
import com.google.ai.edge.gallery.data.RuntimeType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: MessageInputText.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000~\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aò\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00122\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0002\u0010\u0016\u001a\u00020\n2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182#\b\u0002\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00030\u00122\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00122\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u001a\b\u0002\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u0014\u0012\u0004\u0012\u00020\u00030\u00122\u001a\b\u0002\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u0014\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\n2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018H\u0007¢\u0006\u0002\u0010*\u001a\u001b\u0010+\u001a\u00020\u00032\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018H\u0003¢\u0006\u0002\u0010-\u001a8\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00142\u0018\u00103\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u0014\u0012\u0004\u0012\u00020\u00030\u0012H\u0002\u001a,\u00104\u001a\u00020\u00032\u0006\u0010/\u001a\u0002002\u0006\u00105\u001a\u0002022\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u0012H\u0002\u001a\u001a\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020!2\b\b\u0002\u00109\u001a\u00020\rH\u0002\u001a$\u0010:\u001a\u00020\u00032\u0006\u0010/\u001a\u0002002\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0012H\u0002\u001a2\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010=\u001a\b\u0012\u0004\u0012\u00020!0\u00142\f\u0010>\u001a\b\u0012\u0004\u0012\u00020#0\u00142\u0006\u0010?\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006@²\u0006\n\u0010A\u001a\u00020BX\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010D\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010E\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010F\u001a\u00020\nX\u008a\u008e\u0002²\u0006\u0010\u0010=\u001a\b\u0012\u0004\u0012\u00020!0\u0014X\u008a\u008e\u0002²\u0006\u0010\u0010G\u001a\b\u0012\u0004\u0012\u00020#0\u0014X\u008a\u008e\u0002²\u0006\n\u0010H\u001a\u00020\nX\u008a\u008e\u0002²\u0006\f\u0010I\u001a\u0004\u0018\u00010JX\u008a\u008e\u0002²\u0006\f\u0010K\u001a\u0004\u0018\u00010LX\u008a\u008e\u0002²\u0006\n\u0010M\u001a\u00020\rX\u008a\u008e\u0002"}, m922d2 = {"TAG", "", "MessageInputText", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "curMessage", "isResettingSession", "", "inProgress", "imageCount", "", "audioClipMessageCount", "modelInitializing", "textFieldPlaceHolderRes", "onValueChanged", "Lkotlin/Function1;", "onSendMessage", "", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "modelPreparing", "onOpenPromptTemplatesClicked", "Lkotlin/Function0;", "onStopButtonClicked", "onSetAudioRecorderVisible", "Lkotlin/ParameterName;", "name", "visible", "onAmplitudeChanged", "onSkillsClicked", "onPickedImagesChanged", "Landroid/graphics/Bitmap;", "onPickedAudioClipsChanged", "Lcom/google/ai/edge/gallery/common/AudioClip;", "showPromptTemplatesInMenu", "showSkillsPicker", "showImagePicker", "showAudioPicker", "showStopButtonWhenInProgress", "onImageLimitExceeded", "(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Ljava/lang/String;ZZIIZILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;IIII)V", "MediaPanelCloseButton", "onClicked", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "handleImagesSelected", "context", "Landroid/content/Context;", "uris", "Landroid/net/Uri;", "onImagesSelected", "handleAudioWavSelected", "uri", "onAudioSelected", "resizeBitmap", "originalBitmap", "size", "checkFrontCamera", "callback", "createMessagesToSend", "pickedImages", "audioClips", "text", "app_debug", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "showAddContentMenu", "showTextInputHistorySheet", "showCameraCaptureBottomSheet", "showAudioRecorder", "pickedAudioClips", "hasFrontCamera", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "cameraControl", "Landroidx/camera/core/CameraControl;", "cameraSide"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class MessageInputTextKt {
    private static final String TAG = "AGMessageInputText";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaPanelCloseButton$lambda$144(Function0 function0, int i, Composer composer, int i2) {
        MediaPanelCloseButton(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$140(Task task, ModelManagerViewModel modelManagerViewModel, String str, boolean z, boolean z2, int i, int i2, boolean z3, int i3, Function1 function1, Function1 function12, boolean z4, Function0 function0, Function0 function02, Function1 function13, Function1 function14, Function0 function03, Function1 function15, Function1 function16, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Function0 function04, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        MessageInputText(task, modelManagerViewModel, str, z, z2, i, i2, z3, i3, function1, function12, z4, function0, function02, function13, function14, function03, function15, function16, z5, z6, z7, z8, z9, function04, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$5$lambda$4(boolean it) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$9$lambda$8(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$11$lambda$10(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
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
    public static final void MessageInputText(final Task task, final ModelManagerViewModel modelManagerViewModel, final String curMessage, final boolean isResettingSession, final boolean inProgress, final int imageCount, final int audioClipMessageCount, final boolean modelInitializing, final int textFieldPlaceHolderRes, final Function1<? super String, Unit> onValueChanged, final Function1<? super List<? extends ChatMessage>, Unit> onSendMessage, boolean modelPreparing, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Boolean, Unit> function1, final Function1<? super Integer, Unit> onAmplitudeChanged, Function0<Unit> function03, Function1<? super List<Bitmap>, Unit> function12, Function1<? super List<AudioClip>, Unit> function13, boolean showPromptTemplatesInMenu, boolean showSkillsPicker, boolean showImagePicker, boolean showAudioPicker, boolean showStopButtonWhenInProgress, Function0<Unit> function04, Composer $composer, final int $changed, final int $changed1, final int $changed2, final int i) {
        Function1<? super Boolean, Unit> function14;
        int i2;
        Composer $composer2;
        boolean modelPreparing2;
        Function0<Unit> function05;
        Function0<Unit> function06;
        Function0<Unit> function07;
        Function1<? super List<Bitmap>, Unit> function15;
        Function1<? super List<AudioClip>, Unit> function16;
        boolean showPromptTemplatesInMenu2;
        boolean showSkillsPicker2;
        boolean showImagePicker2;
        boolean showAudioPicker2;
        boolean showStopButtonWhenInProgress2;
        Function0<Unit> function08;
        Function1<? super Boolean, Unit> function17;
        Function1<? super Boolean, Unit> function18;
        Function1<? super List<Bitmap>, Unit> function19;
        Function1<? super List<AudioClip>, Unit> function110;
        LifecycleOwner lifecycleOwner;
        Function1<? super Boolean, Unit> function111;
        MutableState showTextInputHistorySheet$delegate;
        MutableState showCameraCaptureBottomSheet$delegate;
        Function1<? super List<AudioClip>, Unit> function112;
        Function1<? super List<Bitmap>, Unit> function113;
        Function1<? super List<AudioClip>, Unit> function114;
        final MutableState showAddContentMenu$delegate;
        MutableState showAddContentMenu$delegate2;
        final MutableState hasFrontCamera$delegate;
        Function1<? super List<AudioClip>, Unit> function115;
        MutableState showCameraCaptureBottomSheet$delegate2;
        final Function1<? super Boolean, Unit> function116;
        final MutableState showCameraCaptureBottomSheet$delegate3;
        Function0<ComposeUiNode> function09;
        Composer $composer$iv;
        Modifier materialized$iv$iv;
        MeasurePolicy measurePolicy$iv$iv;
        Composer $composer$iv$iv$iv;
        Function1<? super Boolean, Unit> function117;
        Function1 updatePickedAudioClips;
        CoroutineScope scope;
        Function0<ComposeUiNode> function010;
        MutableState showAudioRecorder$delegate;
        Composer $composer3;
        MutableState pickedImages$delegate;
        String str;
        String str2;
        Function0<ComposeUiNode> function011;
        Function0<ComposeUiNode> function012;
        Function0<ComposeUiNode> function013;
        final MutableState pickedImages$delegate2;
        final MutableState pickedAudioClips$delegate;
        final MutableState showTextInputHistorySheet$delegate2;
        Composer $composer4;
        String str3;
        final MutableState showCameraCaptureBottomSheet$delegate4;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(curMessage, "curMessage");
        Intrinsics.checkNotNullParameter(onValueChanged, "onValueChanged");
        Intrinsics.checkNotNullParameter(onSendMessage, "onSendMessage");
        Intrinsics.checkNotNullParameter(onAmplitudeChanged, "onAmplitudeChanged");
        Composer $composer5 = $composer.startRestartGroup(1447838069);
        ComposerKt.sourceInformation($composer5, "C(MessageInputText)P(23,6,1,4,3,2!2,24,17,13!1,10,16,14!1,15,12,11,20,21,19,18,22)163@7225L2,164@7265L2,165@7327L2,167@7400L2,168@7454L2,169@7515L2,175@7760L2,177@7797L7,178@7848L7,179@7870L24,180@7954L16,181@7999L34,182@8069L34,183@8142L34,184@8209L59,185@8296L34,186@8363L59,187@8445L51,188@8523L54,189@8602L34,190@8660L36,192@8749L657,214@9466L438,228@9929L75,228@9908L96,230@10037L39,230@10008L68,232@10113L47,232@10080L80,236@10328L152,236@10249L231,244@10517L101,252@10798L110,252@10719L189,261@11088L379,261@11003L464,278@11596L673,276@11489L780,301@12306L136,301@12273L169,306@12446L17000:MessageInputText.kt#ouynps");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        int $dirty2 = $changed2;
        if (($changed & 6) == 0) {
            $dirty |= $composer5.changedInstance(task) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer5.changedInstance(modelManagerViewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer5.changed(curMessage) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer5.changed(isResettingSession) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer5.changed(inProgress) ? 16384 : 8192;
        }
        if (($changed & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty |= $composer5.changed(imageCount) ? 131072 : 65536;
        }
        if (($changed & 1572864) == 0) {
            $dirty |= $composer5.changed(audioClipMessageCount) ? 1048576 : 524288;
        }
        if (($changed & 12582912) == 0) {
            $dirty |= $composer5.changed(modelInitializing) ? 8388608 : 4194304;
        }
        if (($changed & 100663296) == 0) {
            $dirty |= $composer5.changed(textFieldPlaceHolderRes) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (($changed & 805306368) == 0) {
            $dirty |= $composer5.changedInstance(onValueChanged) ? 536870912 : 268435456;
        }
        if (($changed1 & 6) == 0) {
            $dirty1 |= $composer5.changedInstance(onSendMessage) ? 4 : 2;
        }
        int i3 = i & 2048;
        if (i3 != 0) {
            $dirty1 |= 48;
        } else if (($changed1 & 48) == 0) {
            $dirty1 |= $composer5.changed(modelPreparing) ? 32 : 16;
        }
        int i4 = i & 8192;
        if (i4 != 0) {
            $dirty1 |= 3072;
        } else if (($changed1 & 3072) == 0) {
            $dirty1 |= $composer5.changedInstance(function02) ? 2048 : 1024;
        }
        int i5 = i & 16384;
        if (i5 != 0) {
            $dirty1 |= 24576;
            function14 = function1;
        } else if (($changed1 & 24576) == 0) {
            function14 = function1;
            $dirty1 |= $composer5.changedInstance(function14) ? 16384 : 8192;
        } else {
            function14 = function1;
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty1 |= $composer5.changedInstance(onAmplitudeChanged) ? 131072 : 65536;
        }
        int i6 = i & 65536;
        if (i6 != 0) {
            $dirty1 |= 1572864;
        } else if (($changed1 & 1572864) == 0) {
            $dirty1 |= $composer5.changedInstance(function03) ? 1048576 : 524288;
        }
        int i7 = i & 131072;
        if (i7 != 0) {
            $dirty1 |= 12582912;
        } else if (($changed1 & 12582912) == 0) {
            $dirty1 |= $composer5.changedInstance(function12) ? 8388608 : 4194304;
        }
        int i8 = i & 262144;
        if (i8 != 0) {
            $dirty1 |= 100663296;
        } else if (($changed1 & 100663296) == 0) {
            $dirty1 |= $composer5.changedInstance(function13) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i9 = i & 1048576;
        if (i9 != 0) {
            $dirty2 |= 6;
            i2 = $changed2;
        } else {
            i2 = $changed2;
            if ((i2 & 6) == 0) {
                $dirty2 |= $composer5.changed(showSkillsPicker) ? 4 : 2;
            }
        }
        int i10 = i & 2097152;
        if (i10 != 0) {
            $dirty2 |= 48;
        } else if ((i2 & 48) == 0) {
            $dirty2 |= $composer5.changed(showImagePicker) ? 32 : 16;
        }
        int i11 = i & 4194304;
        if (i11 != 0) {
            $dirty2 |= 384;
        } else if ((i2 & 384) == 0) {
            $dirty2 |= $composer5.changed(showAudioPicker) ? 256 : 128;
        }
        int i12 = i & 8388608;
        if (i12 != 0) {
            $dirty2 |= 3072;
        } else if ((i2 & 3072) == 0) {
            $dirty2 |= $composer5.changed(showStopButtonWhenInProgress) ? 2048 : 1024;
        }
        int i13 = i & 16777216;
        if (i13 != 0) {
            $dirty2 |= 24576;
        } else if ((i2 & 24576) == 0) {
            $dirty2 |= $composer5.changedInstance(function04) ? 16384 : 8192;
        }
        if ($composer5.shouldExecute((($dirty & 306783379) == 306783378 && (38347795 & $dirty1) == 38347794 && ($dirty2 & 9363) == 9362) ? false : true, $dirty & 1)) {
            modelPreparing2 = i3 != 0 ? false : modelPreparing;
            if ((i & 4096) != 0) {
                ComposerKt.sourceInformationMarkerStart($composer5, -197003721, "CC(remember):MessageInputText.kt#9igjgp");
                Object it$iv = $composer5.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer5.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer5);
                function05 = (Function0) it$iv;
            } else {
                function05 = function0;
            }
            if (i4 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer5, -197002441, "CC(remember):MessageInputText.kt#9igjgp");
                Object it$iv2 = $composer5.rememberedValue();
                if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer5.updateRememberedValue(value$iv2);
                    it$iv2 = value$iv2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer5);
                function06 = (Function0) it$iv2;
            } else {
                function06 = function02;
            }
            if (i5 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer5, -197000457, "CC(remember):MessageInputText.kt#9igjgp");
                Object it$iv3 = $composer5.rememberedValue();
                if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MessageInputTextKt.MessageInputText$lambda$5$lambda$4(((Boolean) obj).booleanValue());
                        }
                    };
                    $composer5.updateRememberedValue(value$iv3);
                    it$iv3 = value$iv3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer5);
                function18 = (Function1) it$iv3;
            } else {
                function18 = function14;
            }
            if (i6 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer5, -196998121, "CC(remember):MessageInputText.kt#9igjgp");
                Object it$iv4 = $composer5.rememberedValue();
                if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv4 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer5.updateRememberedValue(value$iv4);
                    it$iv4 = value$iv4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer5);
                function07 = (Function0) it$iv4;
            } else {
                function07 = function03;
            }
            if (i7 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer5, -196996393, "CC(remember):MessageInputText.kt#9igjgp");
                Object it$iv5 = $composer5.rememberedValue();
                if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv5 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MessageInputTextKt.MessageInputText$lambda$9$lambda$8((List) obj);
                        }
                    };
                    $composer5.updateRememberedValue(value$iv5);
                    it$iv5 = value$iv5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer5);
                function19 = (Function1) it$iv5;
            } else {
                function19 = function12;
            }
            if (i8 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer5, -196994441, "CC(remember):MessageInputText.kt#9igjgp");
                Object it$iv6 = $composer5.rememberedValue();
                if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv6 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MessageInputTextKt.MessageInputText$lambda$11$lambda$10((List) obj);
                        }
                    };
                    $composer5.updateRememberedValue(value$iv6);
                    it$iv6 = value$iv6;
                }
                ComposerKt.sourceInformationMarkerEnd($composer5);
                function110 = (Function1) it$iv6;
            } else {
                function110 = function13;
            }
            showPromptTemplatesInMenu2 = (524288 & i) != 0 ? false : showPromptTemplatesInMenu;
            showSkillsPicker2 = i9 != 0 ? false : showSkillsPicker;
            showImagePicker2 = i10 != 0 ? false : showImagePicker;
            showAudioPicker2 = i11 != 0 ? false : showAudioPicker;
            showStopButtonWhenInProgress2 = i12 != 0 ? false : showStopButtonWhenInProgress;
            if (i13 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer5, -196986601, "CC(remember):MessageInputText.kt#9igjgp");
                Object it$iv7 = $composer5.rememberedValue();
                if (it$iv7 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv7 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer5.updateRememberedValue(value$iv7);
                    it$iv7 = value$iv7;
                }
                ComposerKt.sourceInformationMarkerEnd($composer5);
                function08 = (Function0) it$iv7;
            } else {
                function08 = function04;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1447838069, $dirty, $dirty1, "com.google.ai.edge.gallery.ui.common.chat.MessageInputText (MessageInputText.kt:176)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer5.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final Context context = (Context) objConsume;
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart($composer5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer5.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) objConsume2;
            ComposerKt.sourceInformationMarkerStart($composer5, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer5, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object value$iv$iv = $composer5.rememberedValue();
            if (value$iv$iv == Composer.INSTANCE.getEmpty()) {
                value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer5);
                $composer5.updateRememberedValue(value$iv$iv);
            }
            final CoroutineScope scope2 = (CoroutineScope) value$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final State modelManagerUiState$delegate = SnapshotStateKt.collectAsState(modelManagerViewModel.getUiState(), null, $composer5, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer5, -196978921, "CC(remember):MessageInputText.kt#9igjgp");
            Object value$iv8 = $composer5.rememberedValue();
            if (value$iv8 == Composer.INSTANCE.getEmpty()) {
                lifecycleOwner = lifecycleOwner2;
                value$iv8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(value$iv8);
            } else {
                lifecycleOwner = lifecycleOwner2;
            }
            MutableState showAddContentMenu$delegate3 = (MutableState) value$iv8;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -196976681, "CC(remember):MessageInputText.kt#9igjgp");
            Object value$iv9 = $composer5.rememberedValue();
            if (value$iv9 == Composer.INSTANCE.getEmpty()) {
                function111 = function18;
                value$iv9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(value$iv9);
            } else {
                function111 = function18;
            }
            MutableState showTextInputHistorySheet$delegate3 = (MutableState) value$iv9;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -196974345, "CC(remember):MessageInputText.kt#9igjgp");
            Object value$iv10 = $composer5.rememberedValue();
            if (value$iv10 == Composer.INSTANCE.getEmpty()) {
                showTextInputHistorySheet$delegate = showTextInputHistorySheet$delegate3;
                value$iv10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(value$iv10);
            } else {
                showTextInputHistorySheet$delegate = showTextInputHistorySheet$delegate3;
            }
            MutableState showCameraCaptureBottomSheet$delegate5 = (MutableState) value$iv10;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final SheetState cameraCaptureSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer5, 6, 2);
            ComposerKt.sourceInformationMarkerStart($composer5, -196969417, "CC(remember):MessageInputText.kt#9igjgp");
            Object value$iv11 = $composer5.rememberedValue();
            if (value$iv11 == Composer.INSTANCE.getEmpty()) {
                value$iv11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(value$iv11);
            }
            MutableState showAudioRecorder$delegate2 = (MutableState) value$iv11;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final SheetState audioRecorderSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer5, 6, 2);
            ComposerKt.sourceInformationMarkerStart($composer5, -196964632, "CC(remember):MessageInputText.kt#9igjgp");
            Object it$iv8 = $composer5.rememberedValue();
            if (it$iv8 == Composer.INSTANCE.getEmpty()) {
                Object value$iv12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer5.updateRememberedValue(value$iv12);
                it$iv8 = value$iv12;
            }
            final MutableState pickedImages$delegate3 = (MutableState) it$iv8;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -196962133, "CC(remember):MessageInputText.kt#9igjgp");
            Object value$iv13 = $composer5.rememberedValue();
            if (value$iv13 == Composer.INSTANCE.getEmpty()) {
                showCameraCaptureBottomSheet$delegate = showCameraCaptureBottomSheet$delegate5;
                value$iv13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer5.updateRememberedValue(value$iv13);
            } else {
                showCameraCaptureBottomSheet$delegate = showCameraCaptureBottomSheet$delegate5;
            }
            final MutableState pickedAudioClips$delegate2 = (MutableState) value$iv13;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -196959625, "CC(remember):MessageInputText.kt#9igjgp");
            Object value$iv14 = $composer5.rememberedValue();
            if (value$iv14 == Composer.INSTANCE.getEmpty()) {
                function112 = function110;
                value$iv14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(value$iv14);
            } else {
                function112 = function110;
            }
            MutableState hasFrontCamera$delegate2 = (MutableState) value$iv14;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -196957767, "CC(remember):MessageInputText.kt#9igjgp");
            Object value$iv15 = $composer5.rememberedValue();
            if (value$iv15 == Composer.INSTANCE.getEmpty()) {
                value$iv15 = new SensorObserver(context);
                $composer5.updateRememberedValue(value$iv15);
            }
            final SensorObserver sensorObserver = (SensorObserver) value$iv15;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -196954298, "CC(remember):MessageInputText.kt#9igjgp");
            boolean invalid$iv = $composer5.changed(modelManagerUiState$delegate) | ((458752 & $dirty) == 131072) | $composer5.changedInstance(scope2) | ((57344 & $dirty2) == 16384);
            Object it$iv9 = $composer5.rememberedValue();
            if (invalid$iv || it$iv9 == Composer.INSTANCE.getEmpty()) {
                final Function0<Unit> function014 = function08;
                Object value$iv16 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageInputTextKt.MessageInputText$lambda$38$lambda$37(imageCount, scope2, modelManagerUiState$delegate, pickedImages$delegate3, function014, (List) obj);
                    }
                };
                $composer5.updateRememberedValue(value$iv16);
                it$iv9 = value$iv16;
            }
            final Function1 updatePickedImages = (Function1) it$iv9;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -196931573, "CC(remember):MessageInputText.kt#9igjgp");
            boolean invalid$iv2 = (3670016 & $dirty) == 1048576;
            Object value$iv17 = $composer5.rememberedValue();
            if (invalid$iv2 || value$iv17 == Composer.INSTANCE.getEmpty()) {
                value$iv17 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageInputTextKt.MessageInputText$lambda$40$lambda$39(audioClipMessageCount, pickedAudioClips$delegate2, (List) obj);
                    }
                };
                $composer5.updateRememberedValue(value$iv17);
            }
            final Function1 updatePickedAudioClips2 = (Function1) value$iv17;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer5, -196917120, "CC(remember):MessageInputText.kt#9igjgp");
            boolean invalid$iv3 = $composer5.changedInstance(context);
            Object it$iv10 = $composer5.rememberedValue();
            if (invalid$iv3 || it$iv10 == Composer.INSTANCE.getEmpty()) {
                Object value$iv18 = (Function2) new MessageInputTextKt$MessageInputText$8$1(context, hasFrontCamera$delegate2, null);
                $composer5.updateRememberedValue(value$iv18);
                it$iv10 = value$iv18;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv10, $composer5, 6);
            List<Bitmap> listMessageInputText$lambda$28 = MessageInputText$lambda$28(pickedImages$delegate3);
            ComposerKt.sourceInformationMarkerStart($composer5, -196913700, "CC(remember):MessageInputText.kt#9igjgp");
            boolean invalid$iv4 = (29360128 & $dirty1) == 8388608;
            Object it$iv11 = $composer5.rememberedValue();
            if (invalid$iv4 || it$iv11 == Composer.INSTANCE.getEmpty()) {
                Object value$iv19 = (Function2) new MessageInputTextKt$MessageInputText$9$1(function19, pickedImages$delegate3, null);
                $composer5.updateRememberedValue(value$iv19);
                it$iv11 = value$iv19;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            EffectsKt.LaunchedEffect(listMessageInputText$lambda$28, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv11, $composer5, 0);
            List<AudioClip> listMessageInputText$lambda$31 = MessageInputText$lambda$31(pickedAudioClips$delegate2);
            ComposerKt.sourceInformationMarkerStart($composer5, -196911260, "CC(remember):MessageInputText.kt#9igjgp");
            boolean invalid$iv5 = (234881024 & $dirty1) == 67108864;
            Object it$iv12 = $composer5.rememberedValue();
            if (invalid$iv5 || it$iv12 == Composer.INSTANCE.getEmpty()) {
                function113 = function19;
                function114 = function112;
                Object value$iv20 = (Function2) new MessageInputTextKt$MessageInputText$10$1(function114, pickedAudioClips$delegate2, null);
                $composer5.updateRememberedValue(value$iv20);
                it$iv12 = value$iv20;
            } else {
                function113 = function19;
                function114 = function112;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            EffectsKt.LaunchedEffect(listMessageInputText$lambda$31, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv12, $composer5, 0);
            ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
            ComposerKt.sourceInformationMarkerStart($composer5, -196904275, "CC(remember):MessageInputText.kt#9igjgp");
            Object value$iv21 = $composer5.rememberedValue();
            if (value$iv21 == Composer.INSTANCE.getEmpty()) {
                showAddContentMenu$delegate = showAddContentMenu$delegate3;
                showAddContentMenu$delegate2 = hasFrontCamera$delegate2;
                hasFrontCamera$delegate = showCameraCaptureBottomSheet$delegate;
                value$iv21 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageInputTextKt.MessageInputText$lambda$45$lambda$44(showAddContentMenu$delegate, hasFrontCamera$delegate, ((Boolean) obj).booleanValue());
                    }
                };
                $composer5.updateRememberedValue(value$iv21);
            } else {
                showAddContentMenu$delegate = showAddContentMenu$delegate3;
                showAddContentMenu$delegate2 = hasFrontCamera$delegate2;
                hasFrontCamera$delegate = showCameraCaptureBottomSheet$delegate;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final ManagedActivityResultLauncher takePicturePermissionLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) value$iv21, $composer5, 48);
            ComposerKt.sourceInformationMarkerStart($composer5, -196898278, "CC(remember):MessageInputText.kt#9igjgp");
            boolean invalid$iv6 = (57344 & $dirty1) == 16384;
            Object it$iv13 = $composer5.rememberedValue();
            if (invalid$iv6 || it$iv13 == Composer.INSTANCE.getEmpty()) {
                function115 = function114;
                showCameraCaptureBottomSheet$delegate2 = hasFrontCamera$delegate;
                function116 = function111;
                showCameraCaptureBottomSheet$delegate3 = showAudioRecorder$delegate2;
                Object value$iv22 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MessageInputTextKt.MessageInputText$lambda$47$lambda$46(function116, showAddContentMenu$delegate, showCameraCaptureBottomSheet$delegate3);
                    }
                };
                $composer5.updateRememberedValue(value$iv22);
                it$iv13 = value$iv22;
            } else {
                function115 = function114;
                showCameraCaptureBottomSheet$delegate2 = hasFrontCamera$delegate;
                function116 = function111;
                showCameraCaptureBottomSheet$delegate3 = showAudioRecorder$delegate2;
            }
            final Function0 handleClickRecordAudioClip = (Function0) it$iv13;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ActivityResultContracts.RequestPermission requestPermission2 = new ActivityResultContracts.RequestPermission();
            ComposerKt.sourceInformationMarkerStart($composer5, -196889277, "CC(remember):MessageInputText.kt#9igjgp");
            boolean invalid$iv7 = $composer5.changed(handleClickRecordAudioClip);
            int $dirty12 = $dirty1;
            Object value$iv23 = $composer5.rememberedValue();
            if (invalid$iv7 || value$iv23 == Composer.INSTANCE.getEmpty()) {
                value$iv23 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageInputTextKt.MessageInputText$lambda$49$lambda$48(handleClickRecordAudioClip, ((Boolean) obj).booleanValue());
                    }
                };
                $composer5.updateRememberedValue(value$iv23);
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final ManagedActivityResultLauncher recordAudioClipsPermissionLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission2, (Function1) value$iv23, $composer5, 0);
            ActivityResultContracts.PickMultipleVisualMedia pickMultipleVisualMedia = new ActivityResultContracts.PickMultipleVisualMedia(0, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer5, -196879728, "CC(remember):MessageInputText.kt#9igjgp");
            boolean invalid$iv8 = $composer5.changedInstance(scope2) | $composer5.changedInstance(context) | $composer5.changed(updatePickedImages);
            Object it$iv14 = $composer5.rememberedValue();
            if (invalid$iv8 || it$iv14 == Composer.INSTANCE.getEmpty()) {
                Object value$iv24 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageInputTextKt.MessageInputText$lambda$51$lambda$50(scope2, context, updatePickedImages, (List) obj);
                    }
                };
                $composer5.updateRememberedValue(value$iv24);
                it$iv14 = value$iv24;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final ManagedActivityResultLauncher pickMedia = ActivityResultRegistryKt.rememberLauncherForActivityResult(pickMultipleVisualMedia, (Function1) it$iv14, $composer5, 0);
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            ComposerKt.sourceInformationMarkerStart($composer5, -196863178, "CC(remember):MessageInputText.kt#9igjgp");
            boolean invalid$iv9 = $composer5.changedInstance(scope2) | $composer5.changedInstance(context) | $composer5.changed(updatePickedAudioClips2);
            Object it$iv15 = $composer5.rememberedValue();
            if (invalid$iv9 || it$iv15 == Composer.INSTANCE.getEmpty()) {
                Object value$iv25 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda41
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageInputTextKt.MessageInputText$lambda$54$lambda$53(scope2, context, updatePickedAudioClips2, (ActivityResult) obj);
                    }
                };
                $composer5.updateRememberedValue(value$iv25);
                it$iv15 = value$iv25;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final ManagedActivityResultLauncher pickWav = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (Function1) it$iv15, $composer5, 0);
            ComposerKt.sourceInformationMarkerStart($composer5, -196840995, "CC(remember):MessageInputText.kt#9igjgp");
            final LifecycleOwner lifecycleOwner3 = lifecycleOwner;
            boolean invalid$iv10 = $composer5.changedInstance(lifecycleOwner3) | $composer5.changedInstance(sensorObserver);
            Object it$iv16 = $composer5.rememberedValue();
            if (invalid$iv10 || it$iv16 == Composer.INSTANCE.getEmpty()) {
                Object value$iv26 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageInputTextKt.MessageInputText$lambda$57$lambda$56(lifecycleOwner3, sensorObserver, (DisposableEffectScope) obj);
                    }
                };
                $composer5.updateRememberedValue(value$iv26);
                it$iv16 = value$iv26;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            EffectsKt.DisposableEffect(lifecycleOwner3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) it$iv16, $composer5, 0);
            ComposerKt.sourceInformationMarkerStart($composer5, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer5, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv = (0 << 3) & 112;
            String str4 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
            final MutableState showAddContentMenu$delegate4 = showAddContentMenu$delegate;
            ComposerKt.sourceInformationMarkerStart($composer5, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer5, 0));
            CompositionLocalMap localMap$iv$iv = $composer5.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer5, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            String str5 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart($composer5, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer5.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer5.startReusableNode();
            if ($composer5.getInserting()) {
                function09 = constructor;
                $composer5.createNode(function09);
            } else {
                function09 = constructor;
                $composer5.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer5);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i14 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer5, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i15 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer5, -576006931, "C358@14441L15001:MessageInputText.kt#ouynps");
            if (MessageInputText$lambda$28(pickedImages$delegate3).isEmpty() && MessageInputText$lambda$31(pickedAudioClips$delegate2).isEmpty()) {
                $composer5.startReplaceGroup(-588955229);
                $composer5.endReplaceGroup();
                str2 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
                $composer3 = $composer5;
                str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                $composer$iv = $composer5;
                updatePickedAudioClips = updatePickedAudioClips2;
                materialized$iv$iv = materialized$iv$iv2;
                measurePolicy$iv$iv = measurePolicy$iv;
                function117 = function116;
                showAudioRecorder$delegate = showCameraCaptureBottomSheet$delegate3;
                $composer$iv$iv$iv = $composer5;
                pickedImages$delegate = pickedImages$delegate3;
                scope = scope2;
            } else {
                $composer5.startReplaceGroup(-576410645);
                ComposerKt.sourceInformation($composer5, "310@12660L21,309@12595L1834");
                $composer$iv = $composer5;
                materialized$iv$iv = materialized$iv$iv2;
                Modifier modifier$iv2 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, $composer5, 0, 1), false, null, false, 14, null);
                Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(16));
                Composer $composer$iv2 = $composer5;
                measurePolicy$iv$iv = measurePolicy$iv;
                $composer$iv$iv$iv = $composer5;
                ComposerKt.sourceInformationMarkerStart($composer$iv2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getTop();
                MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer$iv2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                int $changed$iv$iv2 = (48 << 3) & 112;
                Composer $composer$iv$iv = $composer$iv2;
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv$iv, 0));
                CompositionLocalMap localMap$iv$iv2 = $composer$iv$iv.getCurrentCompositionLocalMap();
                function117 = function116;
                Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer$iv$iv, modifier$iv2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
                updatePickedAudioClips = updatePickedAudioClips2;
                Composer $composer$iv$iv$iv2 = $composer$iv$iv;
                scope = scope2;
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer$iv$iv$iv2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv$iv$iv2.startReusableNode();
                if ($composer$iv$iv$iv2.getInserting()) {
                    function010 = constructor2;
                    $composer$iv$iv$iv2.createNode(function010);
                } else {
                    function010 = constructor2;
                    $composer$iv$iv$iv2.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer$iv$iv$iv2);
                showAudioRecorder$delegate = showCameraCaptureBottomSheet$delegate3;
                $composer3 = $composer5;
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
                int i16 = ($changed$iv$iv$iv2 >> 6) & 14;
                Composer $composer$iv3 = $composer$iv$iv$iv2;
                int i17 = 0;
                ComposerKt.sourceInformationMarkerStart($composer$iv3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i18 = ((48 >> 6) & 112) | 6;
                Composer $composer6 = $composer$iv3;
                ComposerKt.sourceInformationMarkerStart($composer6, -1267152471, "C313@12763L40,354@14381L40:MessageInputText.kt#ouynps");
                SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), $composer6, 6);
                $composer6.startReplaceGroup(236219346);
                ComposerKt.sourceInformation($composer6, "*316@12853L576");
                Iterator<Bitmap> it = MessageInputText$lambda$28(pickedImages$delegate3).iterator();
                while (it.hasNext()) {
                    final Bitmap image = it.next();
                    Alignment contentAlignment$iv = Alignment.INSTANCE.getTopEnd();
                    Iterator<Bitmap> it2 = it;
                    Modifier materialized$iv$iv4 = materialized$iv$iv3;
                    int $changed$iv$iv$iv3 = $changed$iv$iv$iv2;
                    ComposerKt.sourceInformationMarkerStart($composer6, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    Modifier modifier$iv3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
                    int $changed$iv$iv3 = (48 << 3) & 112;
                    ComposerKt.sourceInformationMarkerStart($composer6, -1159599143, str4);
                    int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer6, 0));
                    CompositionLocalMap localMap$iv$iv3 = $composer6.getCurrentCompositionLocalMap();
                    int i19 = i17;
                    Composer $composer$iv4 = $composer$iv2;
                    Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier($composer6, modifier$iv3);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    int $changed$iv$iv$iv4 = (($changed$iv$iv3 << 6) & 896) | 6;
                    Composer $composer$iv$iv2 = $composer$iv$iv;
                    Composer $composer$iv$iv$iv3 = $composer$iv$iv$iv2;
                    ComposerKt.sourceInformationMarkerStart($composer6, -553112988, str5);
                    if (!($composer6.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer6.startReusableNode();
                    if ($composer6.getInserting()) {
                        function013 = constructor3;
                        $composer6.createNode(function013);
                    } else {
                        function013 = constructor3;
                        $composer6.useNode();
                    }
                    Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer6);
                    Composer $composer$iv5 = $composer$iv3;
                    String str6 = str5;
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv5, ComposeUiNode.INSTANCE.getSetModifier());
                    int i20 = ($changed$iv$iv$iv4 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer6, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i21 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer6, 883275246, "C319@12996L43,324@13267L11,317@12908L420,326@13363L54,326@13341L76:MessageInputText.kt#ouynps");
                    String str7 = str4;
                    ImageKt.m1426Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(image), StringResources_androidKt.stringResource(C2421R.string.cd_image_thumbnail, $composer6, 0), BorderKt.m1374borderxT4_qwU(ClipKt.clip(ShadowKt.m6512shadows4CzXII(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(80)), C1654Dp.m9788constructorimpl(2), (24 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(8)), (24 & 4) != 0 ? C1654Dp.m9787compareTo0680j_4(28, C1654Dp.m9788constructorimpl((float) 0)) > 0 : false, (24 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (24 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(8))), C1654Dp.m9788constructorimpl(1), MaterialTheme.INSTANCE.getColorScheme($composer6, MaterialTheme.$stable).getOutline(), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(8))), null, null, 0.0f, null, 0, $composer6, 0, 248);
                    ComposerKt.sourceInformationMarkerStart($composer6, -802777138, "CC(remember):MessageInputText.kt#9igjgp");
                    boolean invalid$iv11 = $composer6.changedInstance(image);
                    Object it$iv17 = $composer6.rememberedValue();
                    if (invalid$iv11 || it$iv17 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv27 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda43
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MessageInputTextKt.m500x3f372dc6(pickedImages$delegate3, image);
                            }
                        };
                        $composer6.updateRememberedValue(value$iv27);
                        it$iv17 = value$iv27;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer6);
                    MediaPanelCloseButton((Function0) it$iv17, $composer6, 0);
                    ComposerKt.sourceInformationMarkerEnd($composer6);
                    ComposerKt.sourceInformationMarkerEnd($composer6);
                    $composer6.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer6);
                    ComposerKt.sourceInformationMarkerEnd($composer6);
                    ComposerKt.sourceInformationMarkerEnd($composer6);
                    it = it2;
                    materialized$iv$iv3 = materialized$iv$iv4;
                    $changed$iv$iv$iv2 = $changed$iv$iv$iv3;
                    $composer$iv2 = $composer$iv4;
                    i17 = i19;
                    $composer$iv$iv$iv2 = $composer$iv$iv$iv3;
                    $composer$iv$iv = $composer$iv$iv2;
                    str5 = str6;
                    $composer$iv3 = $composer$iv5;
                    str4 = str7;
                }
                String str8 = str4;
                Composer $composer$iv$iv3 = $composer$iv$iv;
                String str9 = str5;
                Composer $composer$iv6 = $composer$iv2;
                Composer $composer$iv$iv$iv4 = $composer$iv$iv$iv2;
                Composer $composer$iv7 = $composer$iv3;
                $composer6.endReplaceGroup();
                $composer6.startReplaceGroup(236239994);
                ComposerKt.sourceInformation($composer6, "*331@13518L843");
                Iterator it3 = MessageInputText$lambda$31(pickedAudioClips$delegate2).iterator();
                int i22 = 0;
                while (it3.hasNext()) {
                    final int index = i22;
                    int i23 = i22 + 1;
                    AudioClip audioClip = (AudioClip) it3.next();
                    Alignment contentAlignment$iv2 = Alignment.INSTANCE.getTopEnd();
                    Composer $composer$iv8 = $composer6;
                    ComposerKt.sourceInformationMarkerStart($composer$iv8, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    Modifier modifier$iv$iv = Modifier.INSTANCE;
                    MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
                    int $changed$iv$iv4 = (48 << 3) & 112;
                    Iterator it4 = it3;
                    String str10 = str8;
                    ComposerKt.sourceInformationMarkerStart($composer$iv8, -1159599143, str10);
                    int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv8, 0));
                    CompositionLocalMap localMap$iv$iv4 = $composer$iv8.getCurrentCompositionLocalMap();
                    Modifier materialized$iv$iv6 = ComposedModifierKt.materializeModifier($composer$iv8, modifier$iv$iv);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    int $changed$iv$iv$iv5 = (($changed$iv$iv4 << 6) & 896) | 6;
                    MutableState pickedImages$delegate4 = pickedImages$delegate3;
                    String str11 = str9;
                    ComposerKt.sourceInformationMarkerStart($composer$iv8, -553112988, str11);
                    if (!($composer$iv8.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer$iv8.startReusableNode();
                    if ($composer$iv8.getInserting()) {
                        function011 = constructor4;
                        $composer$iv8.createNode(function011);
                    } else {
                        function011 = constructor4;
                        $composer$iv8.useNode();
                    }
                    Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer$iv8);
                    Composer $composer7 = $composer6;
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv6, ComposeUiNode.INSTANCE.getSetModifier());
                    int i24 = ($changed$iv$iv$iv5 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer$iv8, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i25 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer$iv8, 1617841053, "C336@13769L11,337@13836L11,332@13573L584,346@14192L157,346@14170L179:MessageInputText.kt#ouynps");
                    Modifier modifierM1359backgroundbw27NRU$default = BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(ShadowKt.m6512shadows4CzXII(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(2), (24 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(8)), (24 & 4) != 0 ? C1654Dp.m9787compareTo0680j_4(28, C1654Dp.m9788constructorimpl((float) 0)) > 0 : false, (24 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (24 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(8))), MaterialTheme.INSTANCE.getColorScheme($composer$iv8, MaterialTheme.$stable).getSurface(), null, 2, null);
                    float fM9788constructorimpl = C1654Dp.m9788constructorimpl(1);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int $changed$iv$iv$iv6 = MaterialTheme.$stable;
                    Modifier modifier$iv4 = BorderKt.m1374borderxT4_qwU(modifierM1359backgroundbw27NRU$default, fM9788constructorimpl, materialTheme.getColorScheme($composer$iv8, $changed$iv$iv$iv6).getOutline(), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(8)));
                    ComposerKt.sourceInformationMarkerStart($composer$iv8, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    Alignment contentAlignment$iv3 = Alignment.INSTANCE.getTopStart();
                    MeasurePolicy measurePolicy$iv5 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, false);
                    int $changed$iv$iv5 = (0 << 3) & 112;
                    ComposerKt.sourceInformationMarkerStart($composer$iv8, -1159599143, str10);
                    int compositeKeyHash$iv$iv5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv8, 0));
                    CompositionLocalMap localMap$iv$iv5 = $composer$iv8.getCurrentCompositionLocalMap();
                    Modifier materialized$iv$iv7 = ComposedModifierKt.materializeModifier($composer$iv8, modifier$iv4);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    int $changed$iv$iv$iv7 = (($changed$iv$iv5 << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer$iv8, -553112988, str11);
                    if (!($composer$iv8.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer$iv8.startReusableNode();
                    if ($composer$iv8.getInserting()) {
                        function012 = constructor5;
                        $composer$iv8.createNode(function012);
                    } else {
                        function012 = constructor5;
                        $composer$iv8.useNode();
                    }
                    Composer $this$Layout_u24lambda_u240$iv$iv5 = Updater.m6165constructorimpl($composer$iv8);
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, measurePolicy$iv5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, localMap$iv$iv5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv5, Integer.valueOf(compositeKeyHash$iv$iv5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, materialized$iv$iv7, ComposeUiNode.INSTANCE.getSetModifier());
                    int i26 = ($changed$iv$iv$iv7 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer$iv8, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    int i27 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer$iv8, -522246880, "C339@13913L230:MessageInputText.kt#ouynps");
                    AudioPlaybackPanelKt.AudioPlaybackPanel(audioClip.getAudioData(), audioClip.getSampleRate(), false, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 0.0f, 11, null), false, $composer$iv8, 3456, 16);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv8);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv8);
                    $composer$iv8.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer$iv8);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv8);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv8);
                    ComposerKt.sourceInformationMarkerStart($composer$iv8, 1160586267, "CC(remember):MessageInputText.kt#9igjgp");
                    boolean invalid$iv12 = $composer$iv8.changed(index);
                    Object it$iv18 = $composer$iv8.rememberedValue();
                    if (invalid$iv12 || it$iv18 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv28 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda44
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MessageInputTextKt.m501x66ab772a(pickedAudioClips$delegate2, index);
                            }
                        };
                        $composer$iv8.updateRememberedValue(value$iv28);
                        it$iv18 = value$iv28;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer$iv8);
                    MediaPanelCloseButton((Function0) it$iv18, $composer$iv8, 0);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv8);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv8);
                    $composer$iv8.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer$iv8);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv8);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv8);
                    i22 = i23;
                    it3 = it4;
                    pickedImages$delegate3 = pickedImages$delegate4;
                    $composer6 = $composer7;
                    str8 = str10;
                    str9 = str11;
                }
                Composer $composer8 = $composer6;
                pickedImages$delegate = pickedImages$delegate3;
                str = str9;
                str2 = str8;
                $composer8.endReplaceGroup();
                SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), $composer8, 6);
                ComposerKt.sourceInformationMarkerEnd($composer8);
                ComposerKt.sourceInformationMarkerEnd($composer$iv7);
                $composer$iv$iv$iv4.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv4);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv3);
                ComposerKt.sourceInformationMarkerEnd($composer$iv6);
                $composer3.endReplaceGroup();
            }
            Alignment contentAlignment$iv4 = Alignment.INSTANCE.getCenter();
            Modifier modifier$iv5 = SizeKt.m2024heightInVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(76), 0.0f, 2, null);
            Composer $composer$iv9 = $composer3;
            ComposerKt.sourceInformationMarkerStart($composer$iv9, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv6 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv4, false);
            int $changed$iv$iv6 = (54 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer$iv9, -1159599143, str2);
            int compositeKeyHash$iv$iv6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv9, 0));
            CompositionLocalMap localMap$iv$iv6 = $composer$iv9.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv8 = ComposedModifierKt.materializeModifier($composer$iv9, modifier$iv5);
            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv8 = (($changed$iv$iv6 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer$iv9, -553112988, str);
            if (!($composer$iv9.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv9.startReusableNode();
            if ($composer$iv9.getInserting()) {
                $composer$iv9.createNode(constructor6);
            } else {
                $composer$iv9.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv6 = Updater.m6165constructorimpl($composer$iv9);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, measurePolicy$iv6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, localMap$iv$iv6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv6, Integer.valueOf(compositeKeyHash$iv$iv6), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv6, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, materialized$iv$iv8, ComposeUiNode.INSTANCE.getSetModifier());
            int i28 = ($changed$iv$iv$iv8 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer$iv9, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            int i29 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer$iv9, -665486445, "C359@14582L14854,359@14533L14903:MessageInputText.kt#ouynps");
            final CoroutineScope coroutineScope = scope;
            final Function1 function118 = updatePickedAudioClips;
            final Function1<? super Boolean, Unit> function119 = function117;
            function16 = function115;
            Function1<? super Boolean, Unit> function120 = function117;
            function15 = function113;
            final MutableState hasFrontCamera$delegate3 = showAddContentMenu$delegate2;
            final MutableState showAudioRecorder$delegate3 = showAudioRecorder$delegate;
            final boolean z = showStopButtonWhenInProgress2;
            Composer $composer$iv$iv$iv5 = $composer$iv$iv$iv;
            final MutableState pickedImages$delegate5 = pickedImages$delegate;
            final boolean z2 = modelPreparing2;
            final Function0<Unit> function015 = function06;
            function17 = function120;
            final boolean z3 = showSkillsPicker2;
            final Function0<Unit> function016 = function07;
            final boolean z4 = showImagePicker2;
            final Function0<Unit> function017 = function08;
            final boolean z5 = showAudioPicker2;
            final MutableState mutableState = showCameraCaptureBottomSheet$delegate2;
            final MutableState mutableState2 = showTextInputHistorySheet$delegate;
            AnimatedContentKt.AnimatedContent(Boolean.valueOf(MessageInputText$lambda$25(showAudioRecorder$delegate)), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-215892650, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return MessageInputTextKt.MessageInputText$lambda$100$lambda$99$lambda$98(task, onAmplitudeChanged, coroutineScope, function118, audioRecorderSheetState, function119, curMessage, onValueChanged, textFieldPlaceHolderRes, inProgress, z, modelInitializing, z2, function015, isResettingSession, onSendMessage, z3, function016, showAddContentMenu$delegate4, z4, imageCount, function017, context, takePicturePermissionLauncher, pickMedia, z5, audioClipMessageCount, handleClickRecordAudioClip, recordAudioClipsPermissionLauncher, pickWav, modelManagerUiState$delegate, pickedImages$delegate5, mutableState, pickedAudioClips$delegate2, mutableState2, showAudioRecorder$delegate3, (AnimatedContentScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer$iv9, 54), $composer$iv9, 1572864, 62);
            ComposerKt.sourceInformationMarkerEnd($composer$iv9);
            ComposerKt.sourceInformationMarkerEnd($composer$iv9);
            $composer$iv9.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv9);
            ComposerKt.sourceInformationMarkerEnd($composer$iv9);
            ComposerKt.sourceInformationMarkerEnd($composer$iv9);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            $composer$iv$iv$iv5.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            if (MessageInputText$lambda$19(showTextInputHistorySheet$delegate)) {
                $composer4 = $composer5;
                $composer4.startReplaceGroup(-1789984200);
                ComposerKt.sourceInformation($composer4, "696@29717L335,708@30083L62,709@30179L49,695@29649L37,693@29552L683");
                List<String> textInputHistory = MessageInputText$lambda$14(modelManagerUiState$delegate).getTextInputHistory();
                str3 = "CC(remember):MessageInputText.kt#9igjgp";
                ComposerKt.sourceInformationMarkerStart($composer4, -196283644, str3);
                boolean invalid$iv13 = $composer4.changedInstance(modelManagerViewModel) | (($dirty12 & 14) == 4);
                Object it$iv19 = $composer4.rememberedValue();
                if (invalid$iv13 || it$iv19 == Composer.INSTANCE.getEmpty()) {
                    pickedImages$delegate2 = pickedImages$delegate5;
                    pickedAudioClips$delegate = pickedAudioClips$delegate2;
                    Object value$iv29 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MessageInputTextKt.MessageInputText$lambda$102$lambda$101(onSendMessage, modelManagerViewModel, pickedImages$delegate2, pickedAudioClips$delegate, (String) obj);
                        }
                    };
                    $composer4.updateRememberedValue(value$iv29);
                    it$iv19 = value$iv29;
                } else {
                    pickedImages$delegate2 = pickedImages$delegate5;
                    pickedAudioClips$delegate = pickedAudioClips$delegate2;
                }
                Function1 function121 = (Function1) it$iv19;
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerStart($composer4, -196272205, str3);
                boolean invalid$iv14 = $composer4.changedInstance(modelManagerViewModel);
                Object it$iv20 = $composer4.rememberedValue();
                if (invalid$iv14 || it$iv20 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv30 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MessageInputTextKt.MessageInputText$lambda$104$lambda$103(modelManagerViewModel, (String) obj);
                        }
                    };
                    $composer4.updateRememberedValue(value$iv30);
                    it$iv20 = value$iv30;
                }
                Function1 function122 = (Function1) it$iv20;
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerStart($composer4, -196269146, str3);
                boolean invalid$iv15 = $composer4.changedInstance(modelManagerViewModel);
                Object it$iv21 = $composer4.rememberedValue();
                if (invalid$iv15 || it$iv21 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv31 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MessageInputTextKt.MessageInputText$lambda$106$lambda$105(modelManagerViewModel);
                        }
                    };
                    $composer4.updateRememberedValue(value$iv31);
                    it$iv21 = value$iv31;
                }
                Function0 function018 = (Function0) it$iv21;
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerStart($composer4, -196286118, str3);
                Object it$iv22 = $composer4.rememberedValue();
                if (it$iv22 == Composer.INSTANCE.getEmpty()) {
                    showTextInputHistorySheet$delegate2 = showTextInputHistorySheet$delegate;
                    Object value$iv32 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MessageInputTextKt.MessageInputText$lambda$108$lambda$107(showTextInputHistorySheet$delegate2);
                        }
                    };
                    $composer4.updateRememberedValue(value$iv32);
                    it$iv22 = value$iv32;
                } else {
                    showTextInputHistorySheet$delegate2 = showTextInputHistorySheet$delegate;
                }
                ComposerKt.sourceInformationMarkerEnd($composer4);
                TextInputHistorySheetKt.TextInputHistorySheet(textInputHistory, function121, function122, function018, (Function0) it$iv22, $composer4, 24576);
            } else {
                pickedImages$delegate2 = pickedImages$delegate5;
                pickedAudioClips$delegate = pickedAudioClips$delegate2;
                showTextInputHistorySheet$delegate2 = showTextInputHistorySheet$delegate;
                $composer4 = $composer5;
                str3 = "CC(remember):MessageInputText.kt#9igjgp";
                $composer4.startReplaceGroup(-1819316307);
            }
            $composer4.endReplaceGroup();
            if (MessageInputText$lambda$22(showCameraCaptureBottomSheet$delegate2)) {
                $composer4.startReplaceGroup(-1789080581);
                ComposerKt.sourceInformation($composer4, "716@30370L40,717@30418L6305,714@30283L6440");
                ComposerKt.sourceInformationMarkerStart($composer4, -196263043, str3);
                Composer $this$cache$iv = $composer4;
                Object it$iv23 = $this$cache$iv.rememberedValue();
                if (it$iv23 == Composer.INSTANCE.getEmpty()) {
                    showCameraCaptureBottomSheet$delegate4 = showCameraCaptureBottomSheet$delegate2;
                    Object value$iv33 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MessageInputTextKt.MessageInputText$lambda$110$lambda$109(showCameraCaptureBottomSheet$delegate4);
                        }
                    };
                    $this$cache$iv.updateRememberedValue(value$iv33);
                    it$iv23 = value$iv33;
                } else {
                    showCameraCaptureBottomSheet$delegate4 = showCameraCaptureBottomSheet$delegate2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer4);
                final CoroutineScope coroutineScope2 = scope;
                final MutableState mutableState3 = showCameraCaptureBottomSheet$delegate4;
                Composer $composer9 = $composer4;
                ModalBottomSheetKt.m4185ModalBottomSheetYbuCTN8((Function0) it$iv23, null, cameraCaptureSheetState, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(1189535045, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MessageInputTextKt.MessageInputText$lambda$139(coroutineScope2, cameraCaptureSheetState, sensorObserver, updatePickedImages, mutableState3, hasFrontCamera$delegate3, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer4, 54), $composer9, 6, 3072, 8186);
                $composer9.endReplaceGroup();
                $composer2 = $composer9;
            } else {
                $composer2 = $composer4;
                $composer2.startReplaceGroup(-1819316307);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer5;
            $composer2.skipToGroupEnd();
            modelPreparing2 = modelPreparing;
            function05 = function0;
            function06 = function02;
            function07 = function03;
            function15 = function12;
            function16 = function13;
            showPromptTemplatesInMenu2 = showPromptTemplatesInMenu;
            showSkillsPicker2 = showSkillsPicker;
            showImagePicker2 = showImagePicker;
            showAudioPicker2 = showAudioPicker;
            showStopButtonWhenInProgress2 = showStopButtonWhenInProgress;
            function08 = function04;
            function17 = function14;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z6 = modelPreparing2;
            final Function0<Unit> function019 = function05;
            final Function0<Unit> function020 = function06;
            final Function1<? super Boolean, Unit> function123 = function17;
            final Function0<Unit> function021 = function07;
            final Function1<? super List<Bitmap>, Unit> function124 = function15;
            final Function1<? super List<AudioClip>, Unit> function125 = function16;
            final boolean z7 = showPromptTemplatesInMenu2;
            final boolean z8 = showSkillsPicker2;
            final boolean z9 = showImagePicker2;
            final boolean z10 = showAudioPicker2;
            final boolean z11 = showStopButtonWhenInProgress2;
            final Function0<Unit> function022 = function08;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageInputTextKt.MessageInputText$lambda$140(task, modelManagerViewModel, curMessage, isResettingSession, inProgress, imageCount, audioClipMessageCount, modelInitializing, textFieldPlaceHolderRes, onValueChanged, onSendMessage, z6, function019, function020, function123, onAmplitudeChanged, function021, function124, function125, z7, z8, z9, z10, z11, function022, $changed, $changed1, $changed2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ModelManagerUiState MessageInputText$lambda$14(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    private static final boolean MessageInputText$lambda$16(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void MessageInputText$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MessageInputText$lambda$19(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void MessageInputText$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MessageInputText$lambda$22(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageInputText$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MessageInputText$lambda$25(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageInputText$lambda$26(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Bitmap> MessageInputText$lambda$28(MutableState<List<Bitmap>> mutableState) {
        MutableState<List<Bitmap>> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AudioClip> MessageInputText$lambda$31(MutableState<List<AudioClip>> mutableState) {
        MutableState<List<AudioClip>> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean MessageInputText$lambda$34(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageInputText$lambda$35(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$38$lambda$37(int $imageCount, CoroutineScope $scope, State $modelManagerUiState$delegate, MutableState $pickedImages$delegate, Function0 $onImageLimitExceeded, List bitmaps) {
        List listTake;
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        boolean isAiCore = MessageInputText$lambda$14($modelManagerUiState$delegate).getSelectedModel().getRuntimeType() == RuntimeType.AICORE;
        int limit = 10;
        if (isAiCore) {
            limit = 1;
        }
        int maxAllowedForThisMessage = RangesKt.coerceAtLeast(limit - $imageCount, 0);
        int combinedSize = MessageInputText$lambda$28($pickedImages$delegate).size() + bitmaps.size();
        boolean withinLimit = combinedSize <= maxAllowedForThisMessage;
        if (withinLimit) {
            listTake = CollectionsKt.plus((Collection) MessageInputText$lambda$28($pickedImages$delegate), (Iterable) bitmaps);
        } else {
            if (isAiCore) {
                BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getMain(), null, new MessageInputTextKt$MessageInputText$updatePickedImages$1$1$1($onImageLimitExceeded, null), 2, null);
            }
            listTake = CollectionsKt.take(CollectionsKt.plus((Collection) MessageInputText$lambda$28($pickedImages$delegate), (Iterable) bitmaps), maxAllowedForThisMessage);
        }
        $pickedImages$delegate.setValue(listTake);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$40$lambda$39(int $audioClipMessageCount, MutableState $pickedAudioClips$delegate, List audioDataList) {
        List listTake;
        Intrinsics.checkNotNullParameter(audioDataList, "audioDataList");
        int maxAllowedForThisMessage = RangesKt.coerceAtLeast(1 - $audioClipMessageCount, 0);
        int combinedSize = MessageInputText$lambda$31($pickedAudioClips$delegate).size() + audioDataList.size();
        boolean withinLimit = combinedSize <= maxAllowedForThisMessage;
        if (withinLimit) {
            listTake = CollectionsKt.plus((Collection) MessageInputText$lambda$31($pickedAudioClips$delegate), (Iterable) audioDataList);
        } else {
            listTake = CollectionsKt.take(CollectionsKt.plus((Collection) MessageInputText$lambda$31($pickedAudioClips$delegate), (Iterable) audioDataList), maxAllowedForThisMessage);
        }
        $pickedAudioClips$delegate.setValue(listTake);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$45$lambda$44(MutableState $showAddContentMenu$delegate, MutableState $showCameraCaptureBottomSheet$delegate, boolean permissionGranted) {
        if (permissionGranted) {
            MessageInputText$lambda$17($showAddContentMenu$delegate, false);
            MessageInputText$lambda$23($showCameraCaptureBottomSheet$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$47$lambda$46(Function1 $onSetAudioRecorderVisible, MutableState $showAddContentMenu$delegate, MutableState $showAudioRecorder$delegate) {
        MessageInputText$lambda$17($showAddContentMenu$delegate, false);
        MessageInputText$lambda$26($showAudioRecorder$delegate, true);
        $onSetAudioRecorderVisible.invoke(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$49$lambda$48(Function0 $handleClickRecordAudioClip, boolean permissionGranted) {
        if (permissionGranted) {
            $handleClickRecordAudioClip.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$51$lambda$50(CoroutineScope $scope, Context $context, Function1 $updatePickedImages, List uris) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        if (!uris.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getIO(), null, new MessageInputTextKt$MessageInputText$pickMedia$1$1$1($context, uris, $updatePickedImages, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$54$lambda$53(CoroutineScope $scope, Context $context, Function1 $updatePickedAudioClips, ActivityResult result) {
        Uri uri;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            if (data != null && (uri = data.getData()) != null) {
                Log.d(TAG, "Picked wav file: " + uri);
                BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getIO(), null, new MessageInputTextKt$MessageInputText$pickWav$1$1$1$1($context, uri, $updatePickedAudioClips, null), 2, null);
            }
        } else {
            Log.d(TAG, "Wav picking cancelled.");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult MessageInputText$lambda$57$lambda$56(final LifecycleOwner $lifecycleOwner, final SensorObserver $sensorObserver, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        $lifecycleOwner.getLifecycle().addObserver($sensorObserver);
        return new DisposableEffectResult() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$MessageInputText$lambda$57$lambda$56$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                $lifecycleOwner.getLifecycle().removeObserver($sensorObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$67$lambda$61$lambda$60$lambda$59 */
    public static final Unit m500x3f372dc6(MutableState $pickedImages$delegate, Bitmap $image) {
        Iterable $this$filter$iv = MessageInputText$lambda$28($pickedImages$delegate);
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Bitmap it = (Bitmap) element$iv$iv;
            if (!Intrinsics.areEqual($image, it)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        $pickedImages$delegate.setValue((List) destination$iv$iv);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$67$lambda$66$lambda$65$lambda$64 */
    public static final Unit m501x66ab772a(MutableState $pickedAudioClips$delegate, int $index) {
        Iterable $this$filterIndexed$iv = MessageInputText$lambda$31($pickedAudioClips$delegate);
        Collection destination$iv$iv = new ArrayList();
        int index$iv$iv = 0;
        for (Object item$iv$iv$iv : $this$filterIndexed$iv) {
            int index$iv$iv$iv = index$iv$iv + 1;
            if (index$iv$iv < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int curIndex = index$iv$iv;
            Iterable $this$filterIndexed$iv2 = $this$filterIndexed$iv;
            if (curIndex != $index) {
                destination$iv$iv.add(item$iv$iv$iv);
            }
            index$iv$iv = index$iv$iv$iv;
            $this$filterIndexed$iv = $this$filterIndexed$iv2;
        }
        $pickedAudioClips$delegate.setValue((List) destination$iv$iv);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0a69  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MessageInputText$lambda$100$lambda$99$lambda$98(com.google.ai.edge.gallery.data.Task r185, kotlin.jvm.functions.Function1 r186, final kotlinx.coroutines.CoroutineScope r187, final kotlin.jvm.functions.Function1 r188, final androidx.compose.material3.SheetState r189, final kotlin.jvm.functions.Function1 r190, java.lang.String r191, kotlin.jvm.functions.Function1 r192, final int r193, boolean r194, boolean r195, boolean r196, boolean r197, kotlin.jvm.functions.Function0 r198, boolean r199, final kotlin.jvm.functions.Function1 r200, boolean r201, kotlin.jvm.functions.Function0 r202, final androidx.compose.runtime.MutableState r203, final boolean r204, final int r205, final kotlin.jvm.functions.Function0 r206, final android.content.Context r207, final androidx.activity.compose.ManagedActivityResultLauncher r208, final androidx.activity.compose.ManagedActivityResultLauncher r209, final boolean r210, final int r211, final kotlin.jvm.functions.Function0 r212, final androidx.activity.compose.ManagedActivityResultLauncher r213, final androidx.activity.compose.ManagedActivityResultLauncher r214, final androidx.compose.runtime.State r215, final androidx.compose.runtime.MutableState r216, final androidx.compose.runtime.MutableState r217, final androidx.compose.runtime.MutableState r218, final androidx.compose.runtime.MutableState r219, final androidx.compose.runtime.MutableState r220, androidx.compose.animation.AnimatedContentScope r221, boolean r222, androidx.compose.runtime.Composer r223, int r224) {
        /*
            Method dump skipped, instruction units count: 3002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.p006ui.common.chat.MessageInputTextKt.MessageInputText$lambda$100$lambda$99$lambda$98(com.google.ai.edge.gallery.data.Task, kotlin.jvm.functions.Function1, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function1, androidx.compose.material3.SheetState, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, int, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, boolean, int, kotlin.jvm.functions.Function0, android.content.Context, androidx.activity.compose.ManagedActivityResultLauncher, androidx.activity.compose.ManagedActivityResultLauncher, boolean, int, kotlin.jvm.functions.Function0, androidx.activity.compose.ManagedActivityResultLauncher, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.animation.AnimatedContentScope, boolean, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$99$lambda$98$lambda$93$lambda$71$lambda$69$lambda$68 */
    public static final Unit m502x98060696(String $cdPromptInput, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, $cdPromptInput);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$99$lambda$98$lambda$93$lambda$71$lambda$70 */
    public static final Unit m503x3531db51(int $textFieldPlaceHolderRes, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C392@16121L39,392@16116L45:MessageInputText.kt#ouynps");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1200626019, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageInputText.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageInputText.kt:392)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource($textFieldPlaceHolderRes, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$99$lambda$98$lambda$93$lambda$92$lambda$89$lambda$88$lambda$73$lambda$72 */
    public static final Unit m504x8dac9dfa(MutableState $showAddContentMenu$delegate) {
        MessageInputText$lambda$17($showAddContentMenu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$99$lambda$98$lambda$93$lambda$92$lambda$89$lambda$88$lambda$75$lambda$74 */
    public static final Unit m505xb776037e(MutableState $showAddContentMenu$delegate) {
        MessageInputText$lambda$17($showAddContentMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$99$lambda$98$lambda$93$lambda$92$lambda$89$lambda$88$lambda$87 */
    public static final Unit m506x1ae40469(boolean $showImagePicker, int $imageCount, final Function0 $onImageLimitExceeded, final Context $context, final ManagedActivityResultLauncher $takePicturePermissionLauncher, final ManagedActivityResultLauncher $pickMedia, boolean $showAudioPicker, int $audioClipMessageCount, final Function0 $handleClickRecordAudioClip, final ManagedActivityResultLauncher $recordAudioClipsPermissionLauncher, final ManagedActivityResultLauncher $pickWav, State $modelManagerUiState$delegate, MutableState $pickedImages$delegate, final MutableState $showAddContentMenu$delegate, final MutableState $showCameraCaptureBottomSheet$delegate, MutableState $pickedAudioClips$delegate, final MutableState $showTextInputHistorySheet$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        String str;
        Composer composer;
        int i;
        String str2;
        Object value$iv;
        final boolean isImageLimitExceededForAiCore;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation($composer, "C593@25878L139,583@25388L654:MessageInputText.kt#ouynps");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1192155118, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageInputText.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageInputText.kt:440)");
            }
            if (!$showImagePicker) {
                str = "CC(remember):MessageInputText.kt#9igjgp";
                composer = $composer;
                i = 390364372;
                composer.startReplaceGroup(390364372);
            } else {
                $composer.startReplaceGroup(408703910);
                ComposerKt.sourceInformation($composer, "458@19397L1106,447@18821L1709,495@21180L679,484@20609L1277");
                final boolean isImageLimitExceededForAiCore2 = MessageInputText$lambda$14($modelManagerUiState$delegate).getSelectedModel().getRuntimeType() == RuntimeType.AICORE && $imageCount + MessageInputText$lambda$28($pickedImages$delegate).size() >= 1;
                boolean enableAddImageMenuItems = $imageCount + MessageInputText$lambda$28($pickedImages$delegate).size() < 10;
                Function2<Composer, Integer, Unit> function2M10958getLambda$54225693$app_debug = ComposableSingletons$MessageInputTextKt.INSTANCE.m10958getLambda$54225693$app_debug();
                ComposerKt.sourceInformationMarkerStart($composer, -1095164416, "CC(remember):MessageInputText.kt#9igjgp");
                boolean invalid$iv = $composer.changed(isImageLimitExceededForAiCore2) | $composer.changed($onImageLimitExceeded) | $composer.changedInstance($context) | $composer.changedInstance($takePicturePermissionLauncher);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    isImageLimitExceededForAiCore = isImageLimitExceededForAiCore2;
                    str = "CC(remember):MessageInputText.kt#9igjgp";
                    i = 390364372;
                    value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MessageInputTextKt.m507x2778b51a(isImageLimitExceededForAiCore2, $onImageLimitExceeded, $context, $takePicturePermissionLauncher, $showAddContentMenu$delegate, $showCameraCaptureBottomSheet$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                } else {
                    isImageLimitExceededForAiCore = isImageLimitExceededForAiCore2;
                    str = "CC(remember):MessageInputText.kt#9igjgp";
                    i = 390364372;
                    value$iv = it$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                composer = $composer;
                AndroidMenu_androidKt.DropdownMenuItem(function2M10958getLambda$54225693$app_debug, (Function0) value$iv, null, null, null, enableAddImageMenuItems, null, null, null, $composer, 6, 476);
                Function2<Composer, Integer, Unit> lambda$1035442956$app_debug = ComposableSingletons$MessageInputTextKt.INSTANCE.getLambda$1035442956$app_debug();
                ComposerKt.sourceInformationMarkerStart(composer, -1095107787, str);
                boolean invalid$iv2 = composer.changed(isImageLimitExceededForAiCore) | composer.changed($onImageLimitExceeded) | composer.changedInstance($pickMedia);
                Object it$iv2 = $composer.rememberedValue();
                if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MessageInputTextKt.m508x51421a9e(isImageLimitExceededForAiCore, $onImageLimitExceeded, $pickMedia, $showAddContentMenu$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv2);
                    it$iv2 = value$iv2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                AndroidMenu_androidKt.DropdownMenuItem(lambda$1035442956$app_debug, (Function0) it$iv2, null, null, null, enableAddImageMenuItems, null, null, null, $composer, 6, 476);
            }
            $composer.endReplaceGroup();
            if ($showAudioPicker) {
                composer.startReplaceGroup(412298143);
                ComposerKt.sourceInformation(composer, "527@22768L866,516@22190L1471,559@24267L1005,548@23687L1612");
                boolean enableRecordAudioClipMenuItems = $audioClipMessageCount + MessageInputText$lambda$31($pickedAudioClips$delegate).size() < 1;
                Function2<Composer, Integer, Unit> function2M10957getLambda$2088637172$app_debug = ComposableSingletons$MessageInputTextKt.INSTANCE.m10957getLambda$2088637172$app_debug();
                ComposerKt.sourceInformationMarkerStart(composer, -1095056784, str);
                str2 = str;
                boolean invalid$iv3 = composer.changedInstance($context) | composer.changed($handleClickRecordAudioClip) | composer.changedInstance($recordAudioClipsPermissionLauncher);
                Object it$iv3 = $composer.rememberedValue();
                if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MessageInputTextKt.m509xb1ce2a0c($context, $handleClickRecordAudioClip, $recordAudioClipsPermissionLauncher);
                        }
                    };
                    $composer.updateRememberedValue(value$iv3);
                    it$iv3 = value$iv3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                AndroidMenu_androidKt.DropdownMenuItem(function2M10957getLambda$2088637172$app_debug, (Function0) it$iv3, null, null, null, enableRecordAudioClipMenuItems, null, null, null, $composer, 6, 476);
                Function2<Composer, Integer, Unit> lambda$1405881589$app_debug = ComposableSingletons$MessageInputTextKt.INSTANCE.getLambda$1405881589$app_debug();
                ComposerKt.sourceInformationMarkerStart(composer, -1095008677, str2);
                boolean invalid$iv4 = composer.changedInstance($pickWav);
                Object it$iv4 = $composer.rememberedValue();
                if (invalid$iv4 || it$iv4 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv4 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MessageInputTextKt.m510x707c4252($pickWav, $showAddContentMenu$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv4);
                    it$iv4 = value$iv4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                AndroidMenu_androidKt.DropdownMenuItem(lambda$1405881589$app_debug, (Function0) it$iv4, null, null, null, enableRecordAudioClipMenuItems, null, null, null, $composer, 6, 476);
            } else {
                str2 = str;
                composer.startReplaceGroup(i);
            }
            $composer.endReplaceGroup();
            Function2<Composer, Integer, Unit> lambda$1440992798$app_debug = ComposableSingletons$MessageInputTextKt.INSTANCE.getLambda$1440992798$app_debug();
            ComposerKt.sourceInformationMarkerStart(composer, -1094957991, str2);
            Object it$iv5 = $composer.rememberedValue();
            if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                Object value$iv5 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MessageInputTextKt.m511x9a45a7d6($showAddContentMenu$delegate, $showTextInputHistorySheet$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv5);
                it$iv5 = value$iv5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(lambda$1440992798$app_debug, (Function0) it$iv5, null, null, null, false, null, null, null, $composer, 54, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$99$lambda$98$lambda$93$lambda$92$lambda$89$lambda$88$lambda$87$lambda$77$lambda$76 */
    public static final Unit m507x2778b51a(boolean $isImageLimitExceededForAiCore, Function0 $onImageLimitExceeded, Context $context, ManagedActivityResultLauncher $takePicturePermissionLauncher, MutableState $showAddContentMenu$delegate, MutableState $showCameraCaptureBottomSheet$delegate) {
        if ($isImageLimitExceededForAiCore) {
            $onImageLimitExceeded.invoke();
            MessageInputText$lambda$17($showAddContentMenu$delegate, false);
            return Unit.INSTANCE;
        }
        if (ContextCompat.checkSelfPermission($context, "android.permission.CAMERA") == 0) {
            MessageInputText$lambda$17($showAddContentMenu$delegate, false);
            MessageInputText$lambda$23($showCameraCaptureBottomSheet$delegate, true);
        } else {
            $takePicturePermissionLauncher.launch("android.permission.CAMERA");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$99$lambda$98$lambda$93$lambda$92$lambda$89$lambda$88$lambda$87$lambda$79$lambda$78 */
    public static final Unit m508x51421a9e(boolean $isImageLimitExceededForAiCore, Function0 $onImageLimitExceeded, ManagedActivityResultLauncher $pickMedia, MutableState $showAddContentMenu$delegate) {
        if ($isImageLimitExceededForAiCore) {
            $onImageLimitExceeded.invoke();
            MessageInputText$lambda$17($showAddContentMenu$delegate, false);
            return Unit.INSTANCE;
        }
        $pickMedia.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
        MessageInputText$lambda$17($showAddContentMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$99$lambda$98$lambda$93$lambda$92$lambda$89$lambda$88$lambda$87$lambda$81$lambda$80 */
    public static final Unit m509xb1ce2a0c(Context $context, Function0 $handleClickRecordAudioClip, ManagedActivityResultLauncher $recordAudioClipsPermissionLauncher) {
        if (ContextCompat.checkSelfPermission($context, "android.permission.RECORD_AUDIO") == 0) {
            $handleClickRecordAudioClip.invoke();
        } else {
            $recordAudioClipsPermissionLauncher.launch("android.permission.RECORD_AUDIO");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$99$lambda$98$lambda$93$lambda$92$lambda$89$lambda$88$lambda$87$lambda$84$lambda$83 */
    public static final Unit m510x707c4252(ManagedActivityResultLauncher $pickWav, MutableState $showAddContentMenu$delegate) {
        MessageInputText$lambda$17($showAddContentMenu$delegate, false);
        Intent $this$MessageInputText_u24lambda_u24100_u24lambda_u2499_u24lambda_u2498_u24lambda_u2493_u24lambda_u2492_u24lambda_u2489_u24lambda_u2488_u24lambda_u2487_u24lambda_u2484_u24lambda_u2483_u24lambda_u2482 = new Intent("android.intent.action.GET_CONTENT");
        $this$MessageInputText_u24lambda_u24100_u24lambda_u2499_u24lambda_u2498_u24lambda_u2493_u24lambda_u2492_u24lambda_u2489_u24lambda_u2488_u24lambda_u2487_u24lambda_u2484_u24lambda_u2483_u24lambda_u2482.addCategory("android.intent.category.OPENABLE");
        $this$MessageInputText_u24lambda_u24100_u24lambda_u2499_u24lambda_u2498_u24lambda_u2493_u24lambda_u2492_u24lambda_u2489_u24lambda_u2488_u24lambda_u2487_u24lambda_u2484_u24lambda_u2483_u24lambda_u2482.setType("audio/*");
        String[] mimeTypes = {"audio/wav", "audio/x-wav"};
        $this$MessageInputText_u24lambda_u24100_u24lambda_u2499_u24lambda_u2498_u24lambda_u2493_u24lambda_u2492_u24lambda_u2489_u24lambda_u2488_u24lambda_u2487_u24lambda_u2484_u24lambda_u2483_u24lambda_u2482.putExtra("android.intent.extra.MIME_TYPES", mimeTypes);
        $this$MessageInputText_u24lambda_u24100_u24lambda_u2499_u24lambda_u2498_u24lambda_u2493_u24lambda_u2492_u24lambda_u2489_u24lambda_u2488_u24lambda_u2487_u24lambda_u2484_u24lambda_u2483_u24lambda_u2482.putExtra("android.intent.extra.ALLOW_MULTIPLE", false).addFlags(64).addFlags(1);
        $pickWav.launch($this$MessageInputText_u24lambda_u24100_u24lambda_u2499_u24lambda_u2498_u24lambda_u2493_u24lambda_u2492_u24lambda_u2489_u24lambda_u2488_u24lambda_u2487_u24lambda_u2484_u24lambda_u2483_u24lambda_u2482);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$99$lambda$98$lambda$93$lambda$92$lambda$89$lambda$88$lambda$87$lambda$86$lambda$85 */
    public static final Unit m511x9a45a7d6(MutableState $showAddContentMenu$delegate, MutableState $showTextInputHistorySheet$delegate) {
        MessageInputText$lambda$17($showAddContentMenu$delegate, false);
        MessageInputText$lambda$20($showTextInputHistorySheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$99$lambda$98$lambda$93$lambda$92$lambda$91$lambda$90 */
    public static final Unit m512x2199cbbf(String $curMessage, Function1 $onSendMessage, MutableState $pickedImages$delegate, MutableState $pickedAudioClips$delegate) {
        String message = StringsKt.trim((CharSequence) $curMessage).toString();
        $onSendMessage.invoke(createMessagesToSend(MessageInputText$lambda$28($pickedImages$delegate), MessageInputText$lambda$31($pickedAudioClips$delegate), message));
        $pickedImages$delegate.setValue(CollectionsKt.emptyList());
        $pickedAudioClips$delegate.setValue(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$99$lambda$98$lambda$95$lambda$94 */
    public static final Unit m513xece5d2a2(CoroutineScope $scope, Function1 $updatePickedAudioClips, SheetState $audioRecorderSheetState, Function1 $onSetAudioRecorderVisible, MutableState $showAudioRecorder$delegate, byte[] audioData) {
        Intrinsics.checkNotNullParameter(audioData, "audioData");
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new MessageInputTextKt$MessageInputText$12$2$1$2$1$1($updatePickedAudioClips, audioData, $audioRecorderSheetState, $onSetAudioRecorderVisible, $showAudioRecorder$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageInputText$lambda$100$lambda$99$lambda$98$lambda$97$lambda$96 */
    public static final Unit m514x16af3826(Function1 $onSetAudioRecorderVisible, MutableState $showAudioRecorder$delegate) {
        MessageInputText$lambda$26($showAudioRecorder$delegate, false);
        $onSetAudioRecorderVisible.invoke(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$108$lambda$107(MutableState $showTextInputHistorySheet$delegate) {
        MessageInputText$lambda$20($showTextInputHistorySheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$102$lambda$101(Function1 $onSendMessage, ModelManagerViewModel $modelManagerViewModel, MutableState $pickedImages$delegate, MutableState $pickedAudioClips$delegate, String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        $onSendMessage.invoke(createMessagesToSend(MessageInputText$lambda$28($pickedImages$delegate), MessageInputText$lambda$31($pickedAudioClips$delegate), item));
        $pickedImages$delegate.setValue(CollectionsKt.emptyList());
        $pickedAudioClips$delegate.setValue(CollectionsKt.emptyList());
        $modelManagerViewModel.promoteTextInputHistoryItem(item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$104$lambda$103(ModelManagerViewModel $modelManagerViewModel, String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        $modelManagerViewModel.deleteTextInputHistory(item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$106$lambda$105(ModelManagerViewModel $modelManagerViewModel) {
        $modelManagerViewModel.clearTextInputHistory();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$110$lambda$109(MutableState $showCameraCaptureBottomSheet$delegate) {
        MessageInputText$lambda$23($showCameraCaptureBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x06b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MessageInputText$lambda$139(final kotlinx.coroutines.CoroutineScope r64, final androidx.compose.material3.SheetState r65, final com.google.ai.edge.gallery.p006ui.common.chat.SensorObserver r66, final kotlin.jvm.functions.Function1 r67, final androidx.compose.runtime.MutableState r68, androidx.compose.runtime.MutableState r69, androidx.compose.foundation.layout.ColumnScope r70, androidx.compose.runtime.Composer r71, int r72) {
        /*
            Method dump skipped, instruction units count: 1733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.p006ui.common.chat.MessageInputTextKt.MessageInputText$lambda$139(kotlinx.coroutines.CoroutineScope, androidx.compose.material3.SheetState, com.google.ai.edge.gallery.ui.common.chat.SensorObserver, kotlin.jvm.functions.Function1, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProcessCameraProvider MessageInputText$lambda$139$lambda$114(MutableState<ProcessCameraProvider> mutableState) {
        MutableState<ProcessCameraProvider> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final CameraControl MessageInputText$lambda$139$lambda$117(MutableState<CameraControl> mutableState) {
        MutableState<CameraControl> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final int MessageInputText$lambda$139$lambda$120(MutableIntState $cameraSide$delegate) {
        MutableIntState $this$getValue$iv = $cameraSide$delegate;
        return $this$getValue$iv.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageInputText$lambda$139$rebindCameraProvider(MutableState<ProcessCameraProvider> mutableState, LifecycleOwner lifecycleOwner, Preview previewUseCase, ImageCapture imageCaptureUseCase, MutableIntState cameraSide$delegate, MutableState<CameraControl> mutableState2) {
        ProcessCameraProvider cameraProvider = MessageInputText$lambda$139$lambda$114(mutableState);
        if (cameraProvider != null) {
            CameraSelector cameraSelector = new CameraSelector.Builder().requireLensFacing(MessageInputText$lambda$139$lambda$120(cameraSide$delegate)).build();
            Intrinsics.checkNotNullExpressionValue(cameraSelector, "build(...)");
            try {
                cameraProvider.unbindAll();
                Camera camera = cameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, previewUseCase, imageCaptureUseCase);
                mutableState2.setValue(camera.getCameraControl());
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                Integer.valueOf(Log.d(TAG, "Failed to bind camera", e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult MessageInputText$lambda$139$lambda$128$lambda$127(final ExecutorService $executor, final MutableState $cameraProvider$delegate, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$MessageInputText$lambda$139$lambda$128$lambda$127$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ProcessCameraProvider processCameraProviderMessageInputText$lambda$139$lambda$114 = MessageInputTextKt.MessageInputText$lambda$139$lambda$114($cameraProvider$delegate);
                if (processCameraProviderMessageInputText$lambda$139$lambda$114 != null) {
                    processCameraProviderMessageInputText$lambda$139$lambda$114.unbindAll();
                }
                if ($executor.isShutdown()) {
                    return;
                }
                $executor.shutdown();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreviewView MessageInputText$lambda$139$lambda$138$lambda$131$lambda$130(Preview $previewUseCase, MutableState $cameraProvider$delegate, LifecycleOwner $lifecycleOwner, ImageCapture $imageCaptureUseCase, MutableIntState $cameraSide$delegate, MutableState $cameraControl$delegate, Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        PreviewView it = new PreviewView(ctx);
        $previewUseCase.setSurfaceProvider(it.getSurfaceProvider());
        MessageInputText$lambda$139$rebindCameraProvider($cameraProvider$delegate, $lifecycleOwner, $previewUseCase, $imageCaptureUseCase, $cameraSide$delegate, $cameraControl$delegate);
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$139$lambda$138$lambda$133$lambda$132(CoroutineScope $scope, SheetState $cameraCaptureSheetState, MutableState $showCameraCaptureBottomSheet$delegate) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new MessageInputTextKt$MessageInputText$18$4$2$1$1($cameraCaptureSheetState, $showCameraCaptureBottomSheet$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$139$lambda$138$lambda$135$lambda$134(ImageCapture $imageCaptureUseCase, ExecutorService $executor, final SensorObserver $sensorObserver, final Function1 $updatePickedImages, final CoroutineScope $scope, final SheetState $cameraCaptureSheetState, final MutableState $showCameraCaptureBottomSheet$delegate) {
        $imageCaptureUseCase.m1025lambda$takePicture$1$androidxcameracoreImageCapture($executor, new ImageCapture.OnImageCapturedCallback() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$MessageInputText$18$4$3$1$callback$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy image) {
                CoroutineScope coroutineScope;
                C2727x4b72ac73 c2727x4b72ac73;
                Bitmap bitmap;
                Intrinsics.checkNotNullParameter(image, "image");
                try {
                    try {
                        Bitmap bitmap2 = image.toBitmap();
                        Intrinsics.checkNotNullExpressionValue(bitmap2, "toBitmap(...)");
                        int rotation = $sensorObserver.getCurrentRotation() + image.getImageInfo().getRotationDegrees();
                        if (rotation != 0) {
                            Matrix matrix = new Matrix();
                            matrix.postRotate(rotation);
                            bitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
                            Intrinsics.checkNotNull(bitmap);
                        } else {
                            bitmap = bitmap2;
                        }
                        $updatePickedImages.invoke(CollectionsKt.listOf(MessageInputTextKt.resizeBitmap$default(bitmap, 0, 2, null)));
                        image.close();
                        coroutineScope = $scope;
                        c2727x4b72ac73 = new C2727x4b72ac73($cameraCaptureSheetState, $showCameraCaptureBottomSheet$delegate, null);
                    } catch (Exception e) {
                        Log.e("AGMessageInputText", "Failed to process image", e);
                        image.close();
                        coroutineScope = $scope;
                        c2727x4b72ac73 = new C2727x4b72ac73($cameraCaptureSheetState, $showCameraCaptureBottomSheet$delegate, null);
                    }
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, c2727x4b72ac73, 3, null);
                } catch (Throwable th) {
                    image.close();
                    BuildersKt__Builders_commonKt.launch$default($scope, null, null, new C2727x4b72ac73($cameraCaptureSheetState, $showCameraCaptureBottomSheet$delegate, null), 3, null);
                    throw th;
                }
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageInputText$lambda$139$lambda$138$lambda$137$lambda$136(MutableIntState $cameraSide$delegate) {
        $cameraSide$delegate.setIntValue(MessageInputText$lambda$139$lambda$120($cameraSide$delegate) == 1 ? 0 : 1);
        return Unit.INSTANCE;
    }

    private static final void MediaPanelCloseButton(final Function0<Unit> function0, Composer $composer, final int $changed) {
        Function0<ComposeUiNode> function02;
        Composer $composer2 = $composer.startRestartGroup(-844763004);
        ComposerKt.sourceInformation($composer2, "C(MediaPanelCloseButton)891@36932L11,892@36993L11,893@37046L15,887@36804L431:MessageInputText.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 4 : 2;
        }
        if ($composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-844763004, $dirty, -1, "com.google.ai.edge.gallery.ui.common.chat.MediaPanelCloseButton (MessageInputText.kt:886)");
            }
            Modifier modifierM1374borderxT4_qwU = BorderKt.m1374borderxT4_qwU(BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(OffsetKt.m1944offsetVpY3zN4(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(10), C1654Dp.m9788constructorimpl(-10)), RoundedCornerShapeKt.getCircleShape()), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurface(), null, 2, null), C1654Dp.m9788constructorimpl((float) 1.5d), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutline(), RoundedCornerShapeKt.getCircleShape());
            ComposerKt.sourceInformationMarkerStart($composer2, -68417805, "CC(remember):MessageInputText.kt#9igjgp");
            boolean invalid$iv = ($dirty & 14) == 4;
            Object it$iv = $composer2.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MessageInputTextKt.MediaPanelCloseButton$lambda$142$lambda$141(function0);
                    }
                };
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifier$iv = ClickableKt.m1401clickableoSLSa3U(modifierM1374borderxT4_qwU, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv);
            ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $i$f$Box = $changed$iv$iv << 6;
            int $changed$iv$iv$iv = ($i$f$Box & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function02 = constructor;
                $composer2.createNode(function02);
            } else {
                function02 = constructor;
                $composer2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer2);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i2 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1650437830, "C897@37132L39,895@37072L159:MessageInputText.kt#ouynps");
            IconKt.m4075Iconww6aTOc(CloseKt.getClose(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_delete_icon, $composer2, 0), SizeKt.m2036size3ABfNKs(PaddingKt.m1988padding3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(3)), C1654Dp.m9788constructorimpl(16)), 0L, $composer2, 384, 8);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageInputTextKt.MediaPanelCloseButton$lambda$144(function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaPanelCloseButton$lambda$142$lambda$141(Function0 $onClicked) {
        $onClicked.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleImagesSelected(Context context, List<? extends Uri> list, Function1<? super List<Bitmap>, Unit> function1) {
        FileInputStream inputStream;
        List images = new ArrayList();
        for (Uri uri : list) {
            Bitmap bitmap = null;
            try {
                if (uri.getScheme() == null || Intrinsics.areEqual(uri.getScheme(), "file")) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    inputStream = new FileInputStream(path);
                } else {
                    inputStream = context.getContentResolver().openInputStream(uri);
                }
                if (inputStream != null) {
                    ExifInterface exif = new ExifInterface(inputStream);
                    int orientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                    inputStream.close();
                    Bitmap originalBitmap = UtilsKt.decodeSampledBitmapFromUri(context, uri, 1024, 1024);
                    if (originalBitmap != null) {
                        bitmap = UtilsKt.rotateBitmap(originalBitmap, orientation);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (bitmap != null) {
                images.add(bitmap);
            }
        }
        if (!images.isEmpty()) {
            function1.invoke(images);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleAudioWavSelected(Context context, Uri uri, Function1<? super AudioClip, Unit> function1) {
        AudioClip audioClip = UtilsKt.convertWavToMonoWithMaxSeconds$default(context, uri, 0, 4, null);
        if (audioClip != null) {
            function1.invoke(audioClip);
        }
    }

    static /* synthetic */ Bitmap resizeBitmap$default(Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1024;
        }
        return resizeBitmap(bitmap, i);
    }

    private static final Bitmap resizeBitmap(Bitmap originalBitmap, int size) {
        int newHeight;
        int newWidth;
        int originalWidth = originalBitmap.getWidth();
        int originalHeight = originalBitmap.getHeight();
        if (originalWidth <= size && originalHeight <= size) {
            return originalBitmap;
        }
        float aspectRatio = originalWidth / originalHeight;
        if (aspectRatio > 1.0f) {
            newWidth = size;
            newHeight = (int) (size / aspectRatio);
        } else {
            newHeight = size;
            newWidth = (int) (size * aspectRatio);
        }
        Log.d(TAG, "Resizing image from " + originalWidth + " x " + originalHeight + " to " + newWidth + " x " + newHeight);
        int height$iv = newHeight;
        int width$iv = newWidth;
        return Bitmap.createScaledBitmap(originalBitmap, width$iv, height$iv, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkFrontCamera(Context context, final Function1<? super Boolean, Unit> function1) {
        final ListenableFuture<ProcessCameraProvider> companion = ProcessCameraProvider.INSTANCE.getInstance(context);
        companion.addListener(new Runnable() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MessageInputTextKt.checkFrontCamera$lambda$147(companion, function1);
            }
        }, ContextCompat.getMainExecutor(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void checkFrontCamera$lambda$147(ListenableFuture $cameraProviderFuture, Function1 $callback) {
        ProcessCameraProvider cameraProvider = (ProcessCameraProvider) $cameraProviderFuture.get();
        try {
            CameraSelector DEFAULT_FRONT_CAMERA = CameraSelector.DEFAULT_FRONT_CAMERA;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
            boolean hasFront = cameraProvider.hasCamera(DEFAULT_FRONT_CAMERA);
            $callback.invoke(Boolean.valueOf(hasFront));
        } catch (Exception e) {
            e.printStackTrace();
            $callback.invoke(false);
        }
    }

    private static final List<ChatMessage> createMessagesToSend(List<Bitmap> list, List<AudioClip> list2, String text) {
        List messages = new ArrayList();
        if (!list.isEmpty()) {
            List curPickedImages = CollectionsKt.toList(list);
            if (curPickedImages.size() > 10) {
                curPickedImages = curPickedImages.subList(0, 10);
            }
            Iterable $this$map$iv = curPickedImages;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                Bitmap it = (Bitmap) item$iv$iv;
                destination$iv$iv.add(AndroidImageBitmap_androidKt.asImageBitmap(it));
            }
            messages.add(new ChatMessageImage(curPickedImages, (List) destination$iv$iv, 0, ChatSide.USER, 0.0f, null, false, 116, null));
        }
        List audioMessages = new ArrayList();
        if (!list2.isEmpty()) {
            for (AudioClip audioClip : list2) {
                audioMessages.add(new ChatMessageAudioClip(audioClip.getAudioData(), audioClip.getSampleRate(), ChatSide.USER, 0.0f, 8, null));
            }
        }
        if (audioMessages.size() > 1) {
            audioMessages = audioMessages.subList(0, 1);
        }
        messages.addAll(audioMessages);
        if (text.length() > 0) {
            messages.add(new ChatMessageText(text, ChatSide.USER, 0.0f, false, null, null, false, null, 252, null));
        }
        return messages;
    }
}
