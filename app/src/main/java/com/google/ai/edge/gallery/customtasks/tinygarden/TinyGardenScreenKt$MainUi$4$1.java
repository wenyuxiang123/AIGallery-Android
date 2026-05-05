package com.google.ai.edge.gallery.customtasks.tinygarden;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.google.ai.edge.gallery.data.Config;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.ConfigKt;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.litertlm.ToolProvider;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$MainUi$4$1", m932f = "TinyGardenScreen.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class TinyGardenScreenKt$MainUi$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $errorDialogContent$delegate;
    final /* synthetic */ Map<String, Object> $initialModelConfigValues;
    final /* synthetic */ Model $model;
    final /* synthetic */ MutableState<Boolean> $showErrorDialog$delegate;
    final /* synthetic */ List<ToolProvider> $tools;
    final /* synthetic */ TinyGardenViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TinyGardenScreenKt$MainUi$4$1(Model model, Map<String, ? extends Object> map, TinyGardenViewModel tinyGardenViewModel, Context context, List<? extends ToolProvider> list, MutableState<String> mutableState, MutableState<Boolean> mutableState2, Continuation<? super TinyGardenScreenKt$MainUi$4$1> continuation) {
        super(2, continuation);
        this.$model = model;
        this.$initialModelConfigValues = map;
        this.$viewModel = tinyGardenViewModel;
        this.$context = context;
        this.$tools = list;
        this.$errorDialogContent$delegate = mutableState;
        this.$showErrorDialog$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TinyGardenScreenKt$MainUi$4$1(this.$model, this.$initialModelConfigValues, this.$viewModel, this.$context, this.$tools, this.$errorDialogContent$delegate, this.$showErrorDialog$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TinyGardenScreenKt$MainUi$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object oldValue;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!Intrinsics.areEqual(this.$model.getConfigValues(), this.$initialModelConfigValues)) {
                    boolean same = true;
                    boolean nonNumTurnsConfigChanged = false;
                    for (Config config : this.$model.getConfigs()) {
                        String key = config.getKey().getLabel();
                        if (this.$model.getPrevConfigValues().containsKey(key)) {
                            oldValue = ConfigKt.convertValueToTargetType(MapsKt.getValue(this.$model.getPrevConfigValues(), key), config.getValueType());
                        } else {
                            oldValue = null;
                        }
                        Object newValue = ConfigKt.convertValueToTargetType(MapsKt.getValue(this.$model.getConfigValues(), key), config.getValueType());
                        if (!Intrinsics.areEqual(oldValue, newValue)) {
                            same = false;
                            if (!Intrinsics.areEqual(config.getKey(), ConfigKeys.INSTANCE.getRESET_CONVERSATION_TURN_COUNT())) {
                                nonNumTurnsConfigChanged = true;
                            }
                        }
                    }
                    if (!same) {
                        Log.d("AGTinyGarden", "model config values changed.");
                        if (nonNumTurnsConfigChanged) {
                            Log.d("AGTinyGarden", "need to reset engine");
                            TinyGardenViewModel tinyGardenViewModel = this.$viewModel;
                            Context context = this.$context;
                            Model model = this.$model;
                            List<ToolProvider> list = this.$tools;
                            final MutableState<String> mutableState = this.$errorDialogContent$delegate;
                            final MutableState<Boolean> mutableState2 = this.$showErrorDialog$delegate;
                            tinyGardenViewModel.resetEngine(context, model, list, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$MainUi$4$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TinyGardenScreenKt$MainUi$4$1.invokeSuspend$lambda$0(mutableState, mutableState2, (String) obj);
                                }
                            });
                        } else {
                            Log.d("AGTinyGarden", "need to reset conversation");
                            this.$viewModel.resetConversation(this.$model, this.$tools, "", "", "");
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    
    public static final Unit invokeSuspend$lambda$0(MutableState $errorDialogContent$delegate, MutableState $showErrorDialog$delegate, String it) {
        $errorDialogContent$delegate.setValue(it);
        TinyGardenScreenKt.MainUi___WMjBM$lambda$29($showErrorDialog$delegate, true);
        return Unit.INSTANCE;
    }
}
