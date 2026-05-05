package com.google.ai.edge.gallery.ui.common;

import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: GlitteringShapesLoader.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.GlitteringShapesLoaderKt$GlitteringShapesLoader$1$1", m932f = "GlitteringShapesLoader.kt", m933i = {}, m934l = {82}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class GlitteringShapesLoaderKt$GlitteringShapesLoader$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<Shape>> $shapes$delegate;
    final /* synthetic */ List<Color> $taskIconColors;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlitteringShapesLoaderKt$GlitteringShapesLoader$1$1(List<Color> list, MutableState<List<Shape>> mutableState, Continuation<? super GlitteringShapesLoaderKt$GlitteringShapesLoader$1$1> continuation) {
        super(2, continuation);
        this.$taskIconColors = list;
        this.$shapes$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GlitteringShapesLoaderKt$GlitteringShapesLoader$1$1(this.$taskIconColors, this.$shapes$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GlitteringShapesLoaderKt$GlitteringShapesLoader$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.GlitteringShapesLoaderKt$GlitteringShapesLoader$1$1$1 */
    /* JADX INFO: compiled from: GlitteringShapesLoader.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.GlitteringShapesLoaderKt$GlitteringShapesLoader$1$1$1", m932f = "GlitteringShapesLoader.kt", m933i = {0, 0}, m934l = {106}, m935m = "invokeSuspend", m936n = {"newShapes", "curTs"}, m938s = {"L$0", "J$0"})
    static final class C26701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<List<Shape>> $shapes$delegate;
        final /* synthetic */ List<Color> $taskIconColors;
        long J$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26701(List<Color> list, MutableState<List<Shape>> mutableState, Continuation<? super C26701> continuation) {
            super(2, continuation);
            this.$taskIconColors = list;
            this.$shapes$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26701(this.$taskIconColors, this.$shapes$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[LOOP:0: B:9:0x0032->B:11:0x0035, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00e9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ea  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ea -> B:23:0x00f0). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
        // Code decompiled incorrectly - placeholder implementation
        return null;
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            // Method dump skipped - placeholder implementation
            return null;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getDefault(), new C26701(this.$taskIconColors, this.$shapes$delegate, null), this) == coroutine_suspended) {
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
}
