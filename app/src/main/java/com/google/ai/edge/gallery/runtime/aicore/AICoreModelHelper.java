package com.google.ai.edge.gallery.runtime.aicore;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import com.google.mlkit.genai.common.DownloadStatus;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import com.google.mlkit.genai.prompt.Generation;
import com.google.mlkit.genai.prompt.GenerationConfig;
import com.google.mlkit.genai.prompt.GenerationConfigKt;
import com.google.mlkit.genai.prompt.GenerativeModel;
import com.google.mlkit.genai.prompt.ModelConfig;
import com.google.mlkit.genai.prompt.ModelConfigKt;
import com.google.ai.edge.gallery.data.AICoreModelPreference;
import com.google.ai.edge.gallery.data.AICoreModelReleaseStage;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.runtime.LlmModelHelper;
import com.google.ai.edge.litertlm.Contents;
import com.google.ai.edge.litertlm.ToolProvider;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: AICoreModelHelper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m921d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jf\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016JZ\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0013J\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\"J@\u0010#\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u001e\u0010$\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010%\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016JÜ\u0001\u0010&\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00062Q\u0010(\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(-\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\b0)j\u0002`/2\u0010\u00100\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\b0\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00172\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000107H\u0016Jº\u0001\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00172\u0006\u0010'\u001a\u00020\u00062Q\u0010(\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(-\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\b0)j\u0002`/2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\b0\u0013H\u0082@¢\u0006\u0002\u0010@J\u001e\u0010A\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020CH\u0082@¢\u0006\u0002\u0010DJ\u0010\u0010E\u001a\u00020C2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\f\u0010F\u001a\u00020G*\u00020\u000eH\u0002J\u001e\u0010H\u001a\u00020\u00062\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u00172\u0006\u0010'\u001a\u00020\u0006H\u0002R$\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, m922d2 = {"Lcom/google/ai/edge/gallery/runtime/aicore/AICoreModelHelper;", "Lcom/google/ai/edge/gallery/runtime/LlmModelHelper;", "<init>", "()V", "cleanUpListeners", "", "", "Lkotlin/Function0;", "", "Lcom/google/ai/edge/gallery/runtime/CleanUpListener;", "initialize", "context", "Landroid/content/Context;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "supportImage", "", "supportAudio", "onDone", "Lkotlin/Function1;", "systemInstruction", "Lcom/google/ai/edge/litertlm/Contents;", "tools", "", "Lcom/google/ai/edge/litertlm/ToolProvider;", "enableConversationConstrainedDecoding", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "downloadModel", "onProgress", "Lkotlin/Function2;", "", "onError", "isModelDownloaded", "(Lcom/google/ai/edge/gallery/data/Model;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetConversation", "cleanUp", "stopResponse", "runInference", "input", "resultListener", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "partialResult", "done", "partialThinkingResult", "Lcom/google/ai/edge/gallery/runtime/ResultListener;", "cleanUpListener", "message", "images", "Landroid/graphics/Bitmap;", "audioClips", "", "extraContext", "", "executeRunInference", "instance", "Lcom/google/ai/edge/gallery/runtime/aicore/AICoreModelInstance;", "prompt", "temperature", "", "topK", "", "(Lcom/google/ai/edge/gallery/runtime/aicore/AICoreModelInstance;Ljava/lang/String;FILjava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTokenLimit", "generativeModel", "Lcom/google/mlkit/genai/prompt/GenerativeModel;", "(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/mlkit/genai/prompt/GenerativeModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGenerativeModel", "toAICoreModelConfig", "Lcom/google/mlkit/genai/prompt/ModelConfig;", "formatChatPrompt", "chatHistory", "Lcom/google/ai/edge/gallery/runtime/aicore/AICoreChatMessage;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class AICoreModelHelper implements LlmModelHelper {
    public static final AICoreModelHelper INSTANCE = new AICoreModelHelper();
    private static final Map<String, Function0<Unit>> cleanUpListeners = new LinkedHashMap();
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper$executeRunInference$1 */
    /* JADX INFO: compiled from: AICoreModelHelper.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper", m932f = "AICoreModelHelper.kt", m933i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m934l = {312}, m935m = "executeRunInference", m936n = {"instance", "prompt", "images", "input", "resultListener", "onError", "request", "flow", "fullResponse", "temperature", "topK"}, m938s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "F$0", "I$0"})
    static final class C26121 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        C26121(Continuation<? super C26121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AICoreModelHelper.this.executeRunInference(null, null, 0.0f, 0, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper$isModelDownloaded$1 */
    /* JADX INFO: compiled from: AICoreModelHelper.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper", m932f = "AICoreModelHelper.kt", m933i = {0, 0}, m934l = {183}, m935m = "isModelDownloaded", m936n = {"model", "generativeModel"}, m938s = {"L$0", "L$1"})
    static final class C26151 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C26151(Continuation<? super C26151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AICoreModelHelper.this.isModelDownloaded(null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper$updateTokenLimit$1 */
    /* JADX INFO: compiled from: AICoreModelHelper.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper", m932f = "AICoreModelHelper.kt", m933i = {0, 0}, m934l = {340}, m935m = "updateTokenLimit", m936n = {"model", "generativeModel"}, m938s = {"L$0", "L$1"})
    static final class C26171 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C26171(Continuation<? super C26171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AICoreModelHelper.this.updateTokenLimit(null, null, this);
        }
    }

    private AICoreModelHelper() {
    }

    @Override // com.google.ai.edge.gallery.runtime.LlmModelHelper
    public void initialize(Context context, Model model, boolean supportImage, boolean supportAudio, Function1<? super String, Unit> onDone, Contents systemInstruction, List<? extends ToolProvider> tools, boolean enableConversationConstrainedDecoding, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Intrinsics.checkNotNullParameter(tools, "tools");
        if (coroutineScope != null) {
            GenerativeModel generativeModel = getGenerativeModel(model);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C26141(generativeModel, model, onDone, null), 3, null);
        } else {
            Log.e("AICoreModelHelper", "CoroutineScope is required for AICoreModelHelper");
            onDone.invoke("Initialization failed: CoroutineScope is null");
        }
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper$initialize$1 */
    /* JADX INFO: compiled from: AICoreModelHelper.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper$initialize$1", m932f = "AICoreModelHelper.kt", m933i = {1, 2, 3}, m934l = {83, 86, 87, 93}, m935m = "invokeSuspend", m936n = {NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS}, m938s = {"I$0", "I$0", "I$0"})
    static final class C26141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GenerativeModel $generativeModel;
        final /* synthetic */ Model $model;
        final /* synthetic */ Function1<String, Unit> $onDone;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C26141(GenerativeModel generativeModel, Model model, Function1<? super String, Unit> function1, Continuation<? super C26141> continuation) {
            super(2, continuation);
            this.$generativeModel = generativeModel;
            this.$model = model;
            this.$onDone = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26141(this.$generativeModel, this.$model, this.$onDone, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:7:0x0013, B:10:0x001a, B:32:0x0072, B:13:0x0020, B:28:0x005c, B:14:0x0024, B:22:0x003f, B:23:0x0045, B:24:0x0048, B:39:0x00b7, B:25:0x004b, B:33:0x008b, B:38:0x00af, B:19:0x0030), top: B:47:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:7:0x0013, B:10:0x001a, B:32:0x0072, B:13:0x0020, B:28:0x005c, B:14:0x0024, B:22:0x003f, B:23:0x0045, B:24:0x0048, B:39:0x00b7, B:25:0x004b, B:33:0x008b, B:38:0x00af, B:19:0x0030), top: B:47:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:7:0x0013, B:10:0x001a, B:32:0x0072, B:13:0x0020, B:28:0x005c, B:14:0x0024, B:22:0x003f, B:23:0x0045, B:24:0x0048, B:39:0x00b7, B:25:0x004b, B:33:0x008b, B:38:0x00af, B:19:0x0030), top: B:47:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:7:0x0013, B:10:0x001a, B:32:0x0072, B:13:0x0020, B:28:0x005c, B:14:0x0024, B:22:0x003f, B:23:0x0045, B:24:0x0048, B:39:0x00b7, B:25:0x004b, B:33:0x008b, B:38:0x00af, B:19:0x0030), top: B:47:0x0006 }] */
        /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
            java.lang.UnsupportedOperationException
            	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1060)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
            	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
        // Code decompiled incorrectly - placeholder implementation
        return null;
        /* JADX INFO: compiled from: AICoreModelHelper.kt */
        @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ GenerativeModel $generativeModel;
            final /* synthetic */ Model $model;
            final /* synthetic */ Function1<String, Unit> $onDone;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function1<? super String, Unit> function1, GenerativeModel generativeModel, Model model) {
                this.$onDone = function1;
                this.$generativeModel = generativeModel;
                this.$model = model;
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00e8 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
            /*
        // Code decompiled incorrectly - placeholder implementation
        return null;
                return emit((DownloadStatus) value, (Continuation<? super Unit>) $completion);
            }
        }
    }

    public final void downloadModel(Context context, CoroutineScope coroutineScope, Model model, Function2<? super Long, ? super Long, Unit> onProgress, Function0<Unit> onDone, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Intrinsics.checkNotNullParameter(onError, "onError");
        GenerativeModel generativeModel = getGenerativeModel(model);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C26111(generativeModel, onDone, model, onError, onProgress, null), 3, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper$downloadModel$1 */
    /* JADX INFO: compiled from: AICoreModelHelper.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper$downloadModel$1", m932f = "AICoreModelHelper.kt", m933i = {1, 1}, m934l = {139, 147}, m935m = "invokeSuspend", m936n = {"totalBytesToDownload", NotificationCompat.CATEGORY_STATUS}, m938s = {"L$0", "I$0"})
    static final class C26111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GenerativeModel $generativeModel;
        final /* synthetic */ Model $model;
        final /* synthetic */ Function0<Unit> $onDone;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ Function2<Long, Long, Unit> $onProgress;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C26111(GenerativeModel generativeModel, Function0<Unit> function0, Model model, Function1<? super String, Unit> function1, Function2<? super Long, ? super Long, Unit> function2, Continuation<? super C26111> continuation) {
            super(2, continuation);
            this.$generativeModel = generativeModel;
            this.$onDone = function0;
            this.$model = model;
            this.$onError = function1;
            this.$onProgress = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26111(this.$generativeModel, this.$onDone, this.$model, this.$onError, this.$onProgress, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x0017, B:8:0x001b, B:16:0x0036, B:17:0x003c, B:18:0x003f, B:26:0x0089, B:19:0x0042, B:20:0x0049, B:25:0x0081, B:13:0x0027), top: B:34:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x0017, B:8:0x001b, B:16:0x0036, B:17:0x003c, B:18:0x003f, B:26:0x0089, B:19:0x0042, B:20:0x0049, B:25:0x0081, B:13:0x0027), top: B:34:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x0017, B:8:0x001b, B:16:0x0036, B:17:0x003c, B:18:0x003f, B:26:0x0089, B:19:0x0042, B:20:0x0049, B:25:0x0081, B:13:0x0027), top: B:34:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x0017, B:8:0x001b, B:16:0x0036, B:17:0x003c, B:18:0x003f, B:26:0x0089, B:19:0x0042, B:20:0x0049, B:25:0x0081, B:13:0x0027), top: B:34:0x0006 }] */
        /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
            java.lang.UnsupportedOperationException
            	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1060)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
            	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
        // Code decompiled incorrectly - placeholder implementation
        return null;
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        // Code decompiled incorrectly - placeholder implementation
        // Code decompiled incorrectly - placeholder implementation
        return null;
    /* JADX INFO: compiled from: AICoreModelHelper.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper$runInference$1", m932f = "AICoreModelHelper.kt", m933i = {}, m934l = {269}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C26161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Bitmap> $images;
        final /* synthetic */ String $input;
        final /* synthetic */ AICoreModelInstance $instance;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ String $prompt;
        final /* synthetic */ Function3<String, Boolean, String, Unit> $resultListener;
        final /* synthetic */ float $temperature;
        final /* synthetic */ int $topK;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C26161(AICoreModelInstance aICoreModelInstance, String str, float f, int i, List<Bitmap> list, String str2, Function3<? super String, ? super Boolean, ? super String, Unit> function3, Function1<? super String, Unit> function1, Continuation<? super C26161> continuation) {
            super(2, continuation);
            this.$instance = aICoreModelInstance;
            this.$prompt = str;
            this.$temperature = f;
            this.$topK = i;
            this.$images = list;
            this.$input = str2;
            this.$resultListener = function3;
            this.$onError = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26161(this.$instance, this.$prompt, this.$temperature, this.$topK, this.$images, this.$input, this.$resultListener, this.$onError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (AICoreModelHelper.INSTANCE.executeRunInference(this.$instance, this.$prompt, this.$temperature, this.$topK, this.$images, this.$input, this.$resultListener, this.$onError, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        // Code decompiled incorrectly - placeholder implementation
        return null;
    public static final Unit executeRunInference$lambda$0(float $temperature, int $topK, GenerateContentRequest.Builder generateContentRequest) {
        Intrinsics.checkNotNullParameter(generateContentRequest, "$this$generateContentRequest");
        generateContentRequest.setTemperature(Float.valueOf($temperature));
        generateContentRequest.setTopK(Integer.valueOf($topK));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit executeRunInference$lambda$1(float $temperature, int $topK, GenerateContentRequest.Builder generateContentRequest) {
        Intrinsics.checkNotNullParameter(generateContentRequest, "$this$generateContentRequest");
        generateContentRequest.setTemperature(Float.valueOf($temperature));
        generateContentRequest.setTopK(Integer.valueOf($topK));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        // Code decompiled incorrectly - placeholder implementation
        return null;
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper.updateTokenLimit(com.google.ai.edge.gallery.data.Model, com.google.mlkit.genai.prompt.GenerativeModel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final GenerativeModel getGenerativeModel(final Model model) {
        return Generation.INSTANCE.getClient(GenerationConfigKt.generationConfig(new Function1() { // from class: com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AICoreModelHelper.getGenerativeModel$lambda$2(model, (GenerationConfig.Builder) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getGenerativeModel$lambda$2(Model $model, GenerationConfig.Builder generationConfig) {
        Intrinsics.checkNotNullParameter(generationConfig, "$this$generationConfig");
        generationConfig.setModelConfig(INSTANCE.toAICoreModelConfig($model));
        return Unit.INSTANCE;
    }

    private final ModelConfig toAICoreModelConfig(final Model $this$toAICoreModelConfig) {
        return ModelConfigKt.modelConfig(new Function1() { // from class: com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AICoreModelHelper.toAICoreModelConfig$lambda$3($this$toAICoreModelConfig, (ModelConfig.Builder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toAICoreModelConfig$lambda$3(Model $this_toAICoreModelConfig, ModelConfig.Builder modelConfig) {
        int i;
        Intrinsics.checkNotNullParameter(modelConfig, "$this$modelConfig");
        if ($this_toAICoreModelConfig.getAicoreReleaseStage() == AICoreModelReleaseStage.PREVIEW) {
            i = 1;
        } else {
            i = 0;
        }
        modelConfig.setReleaseStage(i);
        modelConfig.setPreference($this_toAICoreModelConfig.getAicorePreference() == AICoreModelPreference.FULL ? 2 : 1);
        return Unit.INSTANCE;
    }

    private final String formatChatPrompt(List<AICoreChatMessage> chatHistory, String input) {
        StringBuilder $this$formatChatPrompt_u24lambda_u244 = new StringBuilder();
        for (AICoreChatMessage message : chatHistory) {
            String role = message.isUser() ? "user" : "model";
            $this$formatChatPrompt_u24lambda_u244.append(role).append(": ").append(message.getText()).append("\n");
        }
        $this$formatChatPrompt_u24lambda_u244.append("user: ").append(input).append("\nmodel: ");
        return $this$formatChatPrompt_u24lambda_u244.toString();
    }
