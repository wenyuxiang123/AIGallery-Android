package com.google.ai.edge.gallery.customtasks.agentchat;

import android.content.ClipData;
import androidx.compose.p000ui.platform.ClipEntry;
import androidx.compose.p000ui.platform.Clipboard;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$ScriptsTabContent$3$2$2$1$1", m932f = "AddOrEditSkillBottomSheet.kt", m933i = {}, m934l = {592}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class AddOrEditSkillBottomSheetKt$ScriptsTabContent$3$2$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Clipboard $clipboard;
    final /* synthetic */ Function2<String, String, Unit> $onScriptChanged;
    final /* synthetic */ String $selectedScript;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddOrEditSkillBottomSheetKt$ScriptsTabContent$3$2$2$1$1(Clipboard clipboard, String str, Function2<? super String, ? super String, Unit> function2, Continuation<? super AddOrEditSkillBottomSheetKt$ScriptsTabContent$3$2$2$1$1> continuation) {
        super(2, continuation);
        this.$clipboard = clipboard;
        this.$selectedScript = str;
        this.$onScriptChanged = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddOrEditSkillBottomSheetKt$ScriptsTabContent$3$2$2$1$1(this.$clipboard, this.$selectedScript, this.$onScriptChanged, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddOrEditSkillBottomSheetKt$ScriptsTabContent$3$2$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object clipEntry;
        String curSelectedScript;
        ClipData clipData;
        ClipData.Item itemAt;
        CharSequence text;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                clipEntry = this.$clipboard.getClipEntry(this);
                if (clipEntry == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                clipEntry = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ClipEntry clipEntry2 = (ClipEntry) clipEntry;
        String pastedText = (clipEntry2 == null || (clipData = clipEntry2.getClipData()) == null || (itemAt = clipData.getItemAt(0)) == null || (text = itemAt.getText()) == null) ? null : text.toString();
        if (pastedText != null && (curSelectedScript = this.$selectedScript) != null) {
            this.$onScriptChanged.invoke(curSelectedScript, pastedText);
        }
        return Unit.INSTANCE;
    }
}
