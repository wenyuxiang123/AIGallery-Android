package com.google.ai.edge.gallery.p006ui.llmchat;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.data.Accelerator;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.runtime.LlmModelHelper;
import com.google.ai.edge.litertlm.Content;
import com.google.ai.edge.litertlm.Contents;
import com.google.ai.edge.litertlm.Conversation;
import com.google.ai.edge.litertlm.ConversationConfig;
import com.google.ai.edge.litertlm.Engine;
import com.google.ai.edge.litertlm.ExperimentalFlags;
import com.google.ai.edge.litertlm.Message;
import com.google.ai.edge.litertlm.MessageCallback;
import com.google.ai.edge.litertlm.SamplerConfig;
import com.google.ai.edge.litertlm.ToolProvider;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LlmChatModelHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m921d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jf\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J@\u0010\u001c\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u001e\u0010\u001d\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016JÜ\u0001\u0010\u001f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00062Q\u0010!\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(&\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\b0\"j\u0002`(2\u0010\u0010)\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\b0\u00132\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00172\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000101H\u0016J\f\u00102\u001a\u00020/*\u00020-H\u0002R$\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatModelHelper;", "Lcom/google/ai/edge/gallery/runtime/LlmModelHelper;", "<init>", "()V", "cleanUpListeners", "", "", "Lkotlin/Function0;", "", "Lcom/google/ai/edge/gallery/runtime/CleanUpListener;", "initialize", "context", "Landroid/content/Context;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "supportImage", "", "supportAudio", "onDone", "Lkotlin/Function1;", "systemInstruction", "Lcom/google/ai/edge/litertlm/Contents;", "tools", "", "Lcom/google/ai/edge/litertlm/ToolProvider;", "enableConversationConstrainedDecoding", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "resetConversation", "cleanUp", "stopResponse", "runInference", "input", "resultListener", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "partialResult", "done", "partialThinkingResult", "Lcom/google/ai/edge/gallery/runtime/ResultListener;", "cleanUpListener", "onError", "message", "images", "Landroid/graphics/Bitmap;", "audioClips", "", "extraContext", "", "toPngByteArray", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class LlmChatModelHelper implements LlmModelHelper {
    public static final LlmChatModelHelper INSTANCE = new LlmChatModelHelper();
    private static final Map<String, Function0<Unit>> cleanUpListeners = new LinkedHashMap();
    public static final int $stable = 8;

    private LlmChatModelHelper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x026b  */
    @Override // com.google.ai.edge.gallery.runtime.LlmModelHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initialize(android.content.Context r33, com.google.ai.edge.gallery.data.Model r34, boolean r35, boolean r36, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r37, com.google.ai.edge.litertlm.Contents r38, java.util.List<? extends com.google.ai.edge.litertlm.ToolProvider> r39, boolean r40, kotlinx.coroutines.CoroutineScope r41) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.p006ui.llmchat.LlmChatModelHelper.initialize(android.content.Context, com.google.ai.edge.gallery.data.Model, boolean, boolean, kotlin.jvm.functions.Function1, com.google.ai.edge.litertlm.Contents, java.util.List, boolean, kotlinx.coroutines.CoroutineScope):void");
    }

    @Override // com.google.ai.edge.gallery.runtime.LlmModelHelper
    public void resetConversation(Model model, boolean supportImage, boolean supportAudio, Contents systemInstruction, List<? extends ToolProvider> tools, boolean enableConversationConstrainedDecoding) {
        String accelerator;
        SamplerConfig samplerConfig;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tools, "tools");
        try {
            Log.d("AGLlmChatModelHelper", "Resetting conversation for model '" + model.getName() + "'");
            LlmModelInstance instance = (LlmModelInstance) model.getInstance();
            if (instance == null) {
                return;
            }
            instance.getConversation().close();
            Engine engine = instance.getEngine();
            int topK = model.getIntConfigValue(ConfigKeys.INSTANCE.getTOPK(), 64);
            float topP = model.getFloatConfigValue(ConfigKeys.INSTANCE.getTOPP(), 0.95f);
            float temperature = model.getFloatConfigValue(ConfigKeys.INSTANCE.getTEMPERATURE(), 1.0f);
            Log.d("AGLlmChatModelHelper", "Enable image: " + supportImage + ", enable audio: " + supportAudio);
            String accelerator2 = model.getStringConfigValue(ConfigKeys.INSTANCE.getACCELERATOR(), Accelerator.GPU.getLabel());
            ExperimentalFlags.INSTANCE.setEnableConversationConstrainedDecoding(enableConversationConstrainedDecoding);
            if (Intrinsics.areEqual(accelerator2, Accelerator.NPU.getLabel()) || Intrinsics.areEqual(accelerator2, Accelerator.TPU.getLabel())) {
                accelerator = accelerator2;
                samplerConfig = null;
                boolean shouldEnableImage = false;
                Conversation newConversation = engine.createConversation(new ConversationConfig(systemInstruction, null, tools, samplerConfig, shouldEnableImage, null, 50, null));
                ExperimentalFlags.INSTANCE.setEnableConversationConstrainedDecoding(false);
                instance.setConversation(newConversation);
                Log.d("AGLlmChatModelHelper", "Resetting done");
            }
            accelerator = accelerator2;
            samplerConfig = new SamplerConfig(topK, topP, temperature, 0, 8, null);
            boolean shouldEnableImage2 = false;
            Conversation newConversation2 = engine.createConversation(new ConversationConfig(systemInstruction, null, tools, samplerConfig, shouldEnableImage2, null, 50, null));
            ExperimentalFlags.INSTANCE.setEnableConversationConstrainedDecoding(false);
            instance.setConversation(newConversation2);
            Log.d("AGLlmChatModelHelper", "Resetting done");
        } catch (Exception e) {
            Log.d("AGLlmChatModelHelper", "Failed to reset conversation", e);
        }
    }

    @Override // com.google.ai.edge.gallery.runtime.LlmModelHelper
    public void cleanUp(Model model, Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        if (model.getInstance() == null) {
            return;
        }
        Object model2 = model.getInstance();
        Intrinsics.checkNotNull(model2, "null cannot be cast to non-null type com.google.ai.edge.gallery.ui.llmchat.LlmModelInstance");
        LlmModelInstance instance = (LlmModelInstance) model2;
        try {
            instance.getConversation().close();
        } catch (Exception e) {
            Log.e("AGLlmChatModelHelper", "Failed to close the conversation: " + e.getMessage());
        }
        try {
            instance.getEngine().close();
        } catch (Exception e2) {
            Log.e("AGLlmChatModelHelper", "Failed to close the engine: " + e2.getMessage());
        }
        Function0<Unit> function0Remove = cleanUpListeners.remove(model.getName());
        if (function0Remove != null) {
            function0Remove.invoke();
        }
        model.setInstance(null);
        onDone.invoke();
        Log.d("AGLlmChatModelHelper", "Clean up done.");
    }

    @Override // com.google.ai.edge.gallery.runtime.LlmModelHelper
    public void stopResponse(Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object model2 = model.getInstance();
        LlmModelInstance instance = model2 instanceof LlmModelInstance ? (LlmModelInstance) model2 : null;
        if (instance == null) {
            return;
        }
        instance.getConversation().cancelProcess();
    }

    @Override // com.google.ai.edge.gallery.runtime.LlmModelHelper
    public void runInference(Model model, String input, final Function3<? super String, ? super Boolean, ? super String, Unit> resultListener, Function0<Unit> cleanUpListener, final Function1<? super String, Unit> onError, List<Bitmap> images, List<byte[]> audioClips, CoroutineScope coroutineScope, Map<String, String> extraContext) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Intrinsics.checkNotNullParameter(cleanUpListener, "cleanUpListener");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(audioClips, "audioClips");
        Object model2 = model.getInstance();
        LlmModelInstance instance = model2 instanceof LlmModelInstance ? (LlmModelInstance) model2 : null;
        if (instance == null) {
            onError.invoke("LlmModelInstance is not initialized.");
            return;
        }
        if (!cleanUpListeners.containsKey(model.getName())) {
            cleanUpListeners.put(model.getName(), cleanUpListener);
        }
        Conversation conversation = instance.getConversation();
        List contents = new ArrayList();
        for (Bitmap image : images) {
            contents.add(new Content.ImageBytes(toPngByteArray(image)));
        }
        for (byte[] audioClip : audioClips) {
            contents.add(new Content.AudioBytes(audioClip));
        }
        if (StringsKt.trim((CharSequence) input).toString().length() > 0) {
            contents.add(new Content.Text(input));
        }
        conversation.sendMessageAsync(Contents.INSTANCE.m596of((List<? extends Content>) contents), new MessageCallback() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatModelHelper.runInference.1
            @Override // com.google.ai.edge.litertlm.MessageCallback
            public void onMessage(Message message) {
                Intrinsics.checkNotNullParameter(message, "message");
                resultListener.invoke(message.toString(), false, message.getChannels().get("thought"));
            }

            @Override // com.google.ai.edge.litertlm.MessageCallback
            public void onDone() {
                resultListener.invoke("", true, null);
            }

            @Override // com.google.ai.edge.litertlm.MessageCallback
            public void onError(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (throwable instanceof CancellationException) {
                    Log.i("AGLlmChatModelHelper", "The inference is cancelled.");
                    resultListener.invoke("", true, null);
                } else {
                    Log.e("AGLlmChatModelHelper", "onError", throwable);
                    onError.invoke("Error: " + throwable.getMessage());
                }
            }
        }, extraContext == null ? MapsKt.emptyMap() : extraContext);
    }

    private final byte[] toPngByteArray(Bitmap $this$toPngByteArray) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        $this$toPngByteArray.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
