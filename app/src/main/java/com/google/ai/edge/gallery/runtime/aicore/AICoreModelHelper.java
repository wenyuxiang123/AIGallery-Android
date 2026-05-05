package com.google.ai.edge.gallery.runtime.aicore;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
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

public class AICoreModelHelper extends LlmModelHelper {
    public AICoreModelHelper() {}

    public void cleanUpListeners() {}

    public void initialize(Context context, Model model, boolean supportImage, boolean supportAudio, Function0<Unit> onDone, Contents systemInstruction, List<ToolProvider> tools, boolean enableConversationConstrainedDecoding, CoroutineScope coroutineScope) {}

    public void downloadModel(Context context, CoroutineScope coroutineScope, Model model, Function2<? super Long, ? super Long, Unit> onProgress, Function0<Unit> onDone, Function1<? super String, Unit> onError) {}

    public Object isModelDownloaded(Model model, Continuation<? super Boolean> continuation) {
        return false;
    }

    public void resetConversation() {}

    public void cleanUp() {}

    public void stopResponse() {}

    public void runInference(String input, Function3<String, Boolean, String, Unit> resultListener, Function1<String, Unit> onError, List<Bitmap> images, List<byte[]> audioClips, Map<String, Object> extraContext) {}

    public Object updateTokenLimit(Model model, GenerativeModel generativeModel, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
