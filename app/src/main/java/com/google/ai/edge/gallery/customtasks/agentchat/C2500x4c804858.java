package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.material3.SheetState;
import androidx.compose.p000ui.platform.Clipboard;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.agentchat.GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$2$1$1$2$1$1$1 */
/* JADX INFO: compiled from: GenerateLlmPromptBottomSheet.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$2$1$1$2$1$1$1", m932f = "GenerateLlmPromptBottomSheet.kt", m933i = {0, 0, 1, 1}, m934l = {165, 167}, m935m = "invokeSuspend", m936n = {"clipData", "clipEntry", "clipData", "clipEntry"}, m938s = {"L$0", "L$1", "L$0", "L$1"})
final class C2500x4c804858 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Clipboard $clipboard;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<String, Unit> $onLlmPromptGenerated;
    final /* synthetic */ String $prompt;
    final /* synthetic */ SheetState $sheetState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C2500x4c804858(String str, Clipboard clipboard, Function1<? super String, Unit> function1, SheetState sheetState, Function0<Unit> function0, Continuation<? super C2500x4c804858> continuation) {
        super(2, continuation);
        this.$prompt = str;
        this.$clipboard = clipboard;
        this.$onLlmPromptGenerated = function1;
        this.$sheetState = sheetState;
        this.$onDismiss = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C2500x4c804858(this.$prompt, this.$clipboard, this.$onLlmPromptGenerated, this.$sheetState, this.$onDismiss, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C2500x4c804858) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            switch(r1) {
                case 0: goto L29;
                case 1: goto L1d;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            java.lang.Object r0 = r7.L$1
            androidx.compose.ui.platform.ClipEntry r0 = (androidx.compose.p000ui.platform.ClipEntry) r0
            java.lang.Object r1 = r7.L$0
            android.content.ClipData r1 = (android.content.ClipData) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L82
        L1d:
            java.lang.Object r1 = r7.L$1
            androidx.compose.ui.platform.ClipEntry r1 = (androidx.compose.p000ui.platform.ClipEntry) r1
            java.lang.Object r2 = r7.L$0
            android.content.ClipData r2 = (android.content.ClipData) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5e
        L29:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r1 = "prompt"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = r7.$prompt
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r2)
            androidx.compose.ui.platform.ClipEntry r2 = new androidx.compose.ui.platform.ClipEntry
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r2.<init>(r1)
            androidx.compose.ui.platform.Clipboard r3 = r7.$clipboard
            r4 = r7
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r7.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r7.L$1 = r5
            r5 = 1
            r7.label = r5
            java.lang.Object r3 = r3.setClipEntry(r2, r4)
            if (r3 != r0) goto L5b
            return r0
        L5b:
            r6 = r2
            r2 = r1
            r1 = r6
        L5e:
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r3 = r7.$onLlmPromptGenerated
            java.lang.String r4 = r7.$prompt
            r3.invoke(r4)
            androidx.compose.material3.SheetState r3 = r7.$sheetState
            r4 = r7
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r7.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r7.L$1 = r5
            r5 = 2
            r7.label = r5
            java.lang.Object r3 = r3.hide(r4)
            if (r3 != r0) goto L80
            return r0
        L80:
            r0 = r1
            r1 = r2
        L82:
            kotlin.jvm.functions.Function0<kotlin.Unit> r2 = r7.$onDismiss
            r2.invoke()
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.agentchat.C2500x4c804858.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
