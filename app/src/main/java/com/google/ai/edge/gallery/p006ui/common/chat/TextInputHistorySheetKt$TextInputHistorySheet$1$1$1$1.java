package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.material3.SheetState;
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

/* JADX INFO: compiled from: TextInputHistorySheet.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$TextInputHistorySheet$1$1$1$1", m932f = "TextInputHistorySheet.kt", m933i = {}, m934l = {85, 86}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class TextInputHistorySheetKt$TextInputHistorySheet$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $item;
    final /* synthetic */ Function0<Unit> $onDismissed;
    final /* synthetic */ Function1<String, Unit> $onHistoryItemClicked;
    final /* synthetic */ SheetState $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextInputHistorySheetKt$TextInputHistorySheet$1$1$1$1(SheetState sheetState, Function1<? super String, Unit> function1, String str, Function0<Unit> function0, Continuation<? super TextInputHistorySheetKt$TextInputHistorySheet$1$1$1$1> continuation) {
        super(2, continuation);
        this.$sheetState = sheetState;
        this.$onHistoryItemClicked = function1;
        this.$item = str;
        this.$onDismissed = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextInputHistorySheetKt$TextInputHistorySheet$1$1$1$1(this.$sheetState, this.$onHistoryItemClicked, this.$item, this.$onDismissed, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextInputHistorySheetKt$TextInputHistorySheet$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            switch(r1) {
                case 0: goto L19;
                case 1: goto L15;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3a
        L15:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L2b
        L19:
            kotlin.ResultKt.throwOnFailure(r5)
            androidx.compose.material3.SheetState r1 = r4.$sheetState
            r2 = r4
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r3 = 1
            r4.label = r3
            java.lang.Object r1 = r1.hide(r2)
            if (r1 != r0) goto L2b
            return r0
        L2b:
            r1 = r4
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r2 = 2
            r4.label = r2
            r2 = 100
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r2, r1)
            if (r1 != r0) goto L3a
            return r0
        L3a:
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r0 = r4.$onHistoryItemClicked
            java.lang.String r1 = r4.$item
            r0.invoke(r1)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r4.$onDismissed
            r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.p006ui.common.chat.TextInputHistorySheetKt$TextInputHistorySheet$1$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
