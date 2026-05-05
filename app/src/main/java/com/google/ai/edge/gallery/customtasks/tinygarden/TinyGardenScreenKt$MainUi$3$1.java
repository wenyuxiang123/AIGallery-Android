package com.google.ai.edge.gallery.customtasks.tinygarden;

import android.content.res.Resources;
import android.util.Log;
import android.webkit.WebView;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.p006ui.common.chat.ChatMessageText;
import com.google.ai.edge.gallery.p006ui.common.chat.ChatSide;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: TinyGardenScreen.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$MainUi$3$1", m932f = "TinyGardenScreen.kt", m933i = {}, m934l = {263}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class TinyGardenScreenKt$MainUi$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<TinyGardenCommand> $commandFlow;
    final /* synthetic */ MutableState<String> $prevAction$delegate;
    final /* synthetic */ MutableState<String> $prevPlots$delegate;
    final /* synthetic */ MutableState<String> $prevSeed$delegate;
    final /* synthetic */ Resources $resources;
    final /* synthetic */ TinyGardenViewModel $viewModel;
    final /* synthetic */ MutableState<WebView> $webViewRef$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TinyGardenScreenKt$MainUi$3$1(Flow<TinyGardenCommand> flow, Resources resources, TinyGardenViewModel tinyGardenViewModel, MutableState<WebView> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, Continuation<? super TinyGardenScreenKt$MainUi$3$1> continuation) {
        super(2, continuation);
        this.$commandFlow = flow;
        this.$resources = resources;
        this.$viewModel = tinyGardenViewModel;
        this.$webViewRef$delegate = mutableState;
        this.$prevSeed$delegate = mutableState2;
        this.$prevPlots$delegate = mutableState3;
        this.$prevAction$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TinyGardenScreenKt$MainUi$3$1(this.$commandFlow, this.$resources, this.$viewModel, this.$webViewRef$delegate, this.$prevSeed$delegate, this.$prevPlots$delegate, this.$prevAction$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TinyGardenScreenKt$MainUi$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Flow<TinyGardenCommand> flow = this.$commandFlow;
                final Resources resources = this.$resources;
                final TinyGardenViewModel tinyGardenViewModel = this.$viewModel;
                final MutableState<WebView> mutableState = this.$webViewRef$delegate;
                final MutableState<String> mutableState2 = this.$prevSeed$delegate;
                final MutableState<String> mutableState3 = this.$prevPlots$delegate;
                final MutableState<String> mutableState4 = this.$prevAction$delegate;
                this.label = 1;
                if (flow.collect(new FlowCollector() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$MainUi$3$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                        return emit((TinyGardenCommand) value, (Continuation<? super Unit>) $completion);
                    }

                    public final Object emit(TinyGardenCommand command, Continuation<? super Unit> continuation) {
                        Object objM11361constructorimpl;
                        int item = command.getItem();
                        String label = "";
                        String functionName = (item == TinyGardenItem.SUNFLOWER.ordinal() + 1 || item == TinyGardenItem.DAISY.ordinal() + 1 || item == TinyGardenItem.ROSE.ordinal() + 1 || item == TinyGardenItem.SPECIAL.ordinal() + 1) ? "plantSeed" : item == TinyGardenItem.WATERING_CAN.ordinal() + 1 ? "waterPlots" : item == TinyGardenItem.SCYTHE.ordinal() + 1 ? "harvestPlots" : "";
                        String strPlots = "[" + CollectionsKt.joinToString$default(command.getPlots(), ",", null, null, 0, null, null, 62, null) + "]";
                        int item2 = command.getItem();
                        String str = item2 == TinyGardenItem.SUNFLOWER.ordinal() + 1 ? "- seed: \"sunflower\"\n- plots: " + strPlots : item2 == TinyGardenItem.DAISY.ordinal() + 1 ? "- seed: \"daisy\"\n- plots: " + strPlots : item2 == TinyGardenItem.ROSE.ordinal() + 1 ? "- seed: \"rose\"\n- plots: " + strPlots : item2 == TinyGardenItem.SPECIAL.ordinal() + 1 ? "- seed: \"special\"\n- plots: " + strPlots : (item2 == TinyGardenItem.WATERING_CAN.ordinal() + 1 || item2 == TinyGardenItem.SCYTHE.ordinal() + 1) ? "- plots: " + strPlots : "";
                        String functionParameter = str;
                        int item3 = command.getItem();
                        int numParameters = (item3 == TinyGardenItem.WATERING_CAN.ordinal() + 1 || item3 == TinyGardenItem.SCYTHE.ordinal() + 1) ? 1 : 2;
                        String functionNameLabel = resources.getString(C2421R.string.function_name);
                        Intrinsics.checkNotNullExpressionValue(functionNameLabel, "getString(...)");
                        String parametersLabel = resources.getQuantityString(C2421R.plurals.parameter, numParameters);
                        Intrinsics.checkNotNullExpressionValue(parametersLabel, "getQuantityString(...)");
                        tinyGardenViewModel.addMessage(new ChatMessageText("**" + functionNameLabel + "**:\n- " + functionName + "\n\n**" + parametersLabel + "**:\n" + functionParameter, ChatSide.AGENT, 0.0f, false, null, null, false, null, 252, null));
                        String commandJson = "[{\"item\": " + command.getItem() + ", \"plot\":[" + CollectionsKt.joinToString$default(command.getPlots(), ",", null, null, 0, null, null, 62, null) + "]}]";
                        Log.d("AGTinyGarden", "commandJson: " + commandJson);
                        String jsScript = "tinyGarden.runCommands('" + commandJson + "')";
                        WebView $this$emit_u24lambda_u240 = TinyGardenScreenKt.MainUi___WMjBM$lambda$14(mutableState);
                        if ($this$emit_u24lambda_u240 != null) {
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                $this$emit_u24lambda_u240.evaluateJavascript(jsScript, null);
                                objM11361constructorimpl = Result.m11361constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM11361constructorimpl = Result.m11361constructorimpl(ResultKt.createFailure(th));
                            }
                            Throwable e = Result.m11364exceptionOrNullimpl(objM11361constructorimpl);
                            if (e != null) {
                                Log.e("AGTinyGarden", String.valueOf(e));
                            }
                            Result.m11360boximpl(objM11361constructorimpl);
                        }
                        MutableState<String> mutableState5 = mutableState2;
                        int item4 = command.getItem();
                        mutableState5.setValue(item4 == TinyGardenItem.SUNFLOWER.ordinal() + 1 ? TinyGardenItem.SUNFLOWER.getLabel() : item4 == TinyGardenItem.DAISY.ordinal() + 1 ? TinyGardenItem.DAISY.getLabel() : item4 == TinyGardenItem.ROSE.ordinal() + 1 ? TinyGardenItem.ROSE.getLabel() : item4 == TinyGardenItem.SPECIAL.ordinal() + 1 ? TinyGardenItem.SPECIAL.getLabel() : "");
                        mutableState3.setValue(CollectionsKt.joinToString$default(command.getPlots(), ",", null, null, 0, null, null, 62, null));
                        MutableState<String> mutableState6 = mutableState4;
                        int item5 = command.getItem();
                        if (item5 == TinyGardenItem.WATERING_CAN.ordinal() + 1) {
                            label = TinyGardenItem.WATERING_CAN.getLabel();
                        } else if (item5 == TinyGardenItem.SCYTHE.ordinal() + 1) {
                            label = TinyGardenItem.SCYTHE.getLabel();
                        }
                        mutableState6.setValue(label);
                        Log.d("AGTinyGarden", "prevSeed: '" + TinyGardenScreenKt.MainUi___WMjBM$lambda$35(mutableState2) + "', prevPlots: '" + TinyGardenScreenKt.MainUi___WMjBM$lambda$38(mutableState3) + "', prevAction: '" + TinyGardenScreenKt.MainUi___WMjBM$lambda$41(mutableState4) + "'");
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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
