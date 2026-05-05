package com.google.ai.edge.gallery.p006ui.home;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.home.HomeScreenKt$HomeScreen$1$1", m932f = "HomeScreen.kt", m933i = {}, m934l = {225}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class HomeScreenKt$HomeScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $loadingModelAllowlistDelayed$delegate;
    final /* synthetic */ State<ModelManagerUiState> $uiState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeScreenKt$HomeScreen$1$1(State<ModelManagerUiState> state, MutableState<Boolean> mutableState, Continuation<? super HomeScreenKt$HomeScreen$1$1> continuation) {
        super(2, continuation);
        this.$uiState$delegate = state;
        this.$loadingModelAllowlistDelayed$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeScreenKt$HomeScreen$1$1(this.$uiState$delegate, this.$loadingModelAllowlistDelayed$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeScreenKt$HomeScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            switch(r1) {
                case 0: goto L16;
                case 1: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L12:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L33
        L16:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.compose.runtime.State<com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState> r1 = r5.$uiState$delegate
            com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState r1 = com.google.ai.edge.gallery.p006ui.home.HomeScreenKt.access$HomeScreen$lambda$0(r1)
            boolean r1 = r1.getLoadingModelAllowlist()
            if (r1 == 0) goto L45
            r1 = r5
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r5.label = r2
            r3 = 200(0xc8, double:9.9E-322)
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r3, r1)
            if (r1 != r0) goto L33
            return r0
        L33:
            androidx.compose.runtime.State<com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState> r0 = r5.$uiState$delegate
            com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState r0 = com.google.ai.edge.gallery.p006ui.home.HomeScreenKt.access$HomeScreen$lambda$0(r0)
            boolean r0 = r0.getLoadingModelAllowlist()
            if (r0 == 0) goto L4b
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r5.$loadingModelAllowlistDelayed$delegate
            com.google.ai.edge.gallery.p006ui.home.HomeScreenKt.access$HomeScreen$lambda$16(r0, r2)
            goto L4b
        L45:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r5.$loadingModelAllowlistDelayed$delegate
            r1 = 0
            com.google.ai.edge.gallery.p006ui.home.HomeScreenKt.access$HomeScreen$lambda$16(r0, r1)
        L4b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.p006ui.home.HomeScreenKt$HomeScreen$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
