package com.google.ai.edge.gallery.runtime;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.litertlm.Contents;
import com.google.ai.edge.litertlm.ToolProvider;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;



\u001a\b\u0012\u0004\u0012\u00020*0\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010,H&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006.À\u0006\u0003"}, m922d2 = {"Lcom/google/ai/edge/gallery/runtime/LlmModelHelper;", "", "initialize", "", "context", "Landroid/content/Context;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "supportImage", "", "supportAudio", "onDone", "Lkotlin/Function1;", "", "systemInstruction", "Lcom/google/ai/edge/litertlm/Contents;", "tools", "", "Lcom/google/ai/edge/litertlm/ToolProvider;", "enableConversationConstrainedDecoding", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "resetConversation", "cleanUp", "Lkotlin/Function0;", "runInference", "input", "resultListener", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "partialResult", "done", "partialThinkingResult", "Lcom/google/ai/edge/gallery/runtime/ResultListener;", "cleanUpListener", "Lcom/google/ai/edge/gallery/runtime/CleanUpListener;", "onError", "message", "images", "Landroid/graphics/Bitmap;", "audioClips", "", "extraContext", "", "stopResponse", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public interface LlmModelHelper {
    void cleanUp(Model model, Function0<Unit> onDone);

    void initialize(Context context, Model model, boolean supportImage, boolean supportAudio, Function1<? super String, Unit> onDone, Contents systemInstruction, List<? extends ToolProvider> tools, boolean enableConversationConstrainedDecoding, CoroutineScope coroutineScope);

    void resetConversation(Model model, boolean supportImage, boolean supportAudio, Contents systemInstruction, List<? extends ToolProvider> tools, boolean enableConversationConstrainedDecoding);

    void runInference(Model model, String input, Function3<? super String, ? super Boolean, ? super String, Unit> resultListener, Function0<Unit> cleanUpListener, Function1<? super String, Unit> onError, List<Bitmap> images, List<byte[]> audioClips, CoroutineScope coroutineScope, Map<String, String> extraContext);

    void stopResponse(Model model);

    
    
    public static final class DefaultImpls {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initialize$default(LlmModelHelper llmModelHelper, Context context, Model model, boolean z, boolean z2, Function1 function1, Contents contents, List list, boolean z3, CoroutineScope coroutineScope, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
        }
        llmModelHelper.initialize(context, model, z, z2, function1, (i & 32) != 0 ? null : contents, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? null : coroutineScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void resetConversation$default(LlmModelHelper llmModelHelper, Model model, boolean z, boolean z2, Contents contents, List list, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetConversation");
        }
        llmModelHelper.resetConversation(model, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : contents, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) == 0 ? z3 : false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void runInference$default(LlmModelHelper llmModelHelper, Model model, String str, Function3 function3, Function0 function0, Function1 function1, List list, List list2, CoroutineScope coroutineScope, Map map, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runInference");
        }
        llmModelHelper.runInference(model, str, function3, function0, (i & 16) != 0 ? new Function1() { // from class: com.google.ai.edge.gallery.runtime.LlmModelHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return LlmModelHelper.runInference$lambda$0((String) obj2);
            }
        } : function1, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? null : coroutineScope, (i & 256) != 0 ? null : map);
    }

    
    static Unit runInference$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
