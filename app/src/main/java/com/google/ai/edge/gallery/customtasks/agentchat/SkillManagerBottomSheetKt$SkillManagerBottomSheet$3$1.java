package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SkillManagerBottomSheet.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$3$1", m932f = "SkillManagerBottomSheet.kt", m933i = {0}, m934l = {232}, m935m = "invokeSuspend", m936n = {"trimmedQuery"}, m938s = {"L$0"})
final class SkillManagerBottomSheetKt$SkillManagerBottomSheet$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<SkillState>> $filteredSkills$delegate;
    final /* synthetic */ MutableState<Boolean> $hasDeterminedExpansionStates$delegate;
    final /* synthetic */ MutableState<Boolean> $isBuiltInExpanded$delegate;
    final /* synthetic */ MutableState<Boolean> $isCustomExpanded$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ MutableState<String> $previousSearchQuery$delegate;
    final /* synthetic */ MutableState<String> $searchQuery$delegate;
    final /* synthetic */ State<SkillManagerUiState> $uiState$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkillManagerBottomSheetKt$SkillManagerBottomSheet$3$1(LazyListState lazyListState, State<SkillManagerUiState> state, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, MutableState<List<SkillState>> mutableState4, MutableState<String> mutableState5, MutableState<Boolean> mutableState6, Continuation<? super SkillManagerBottomSheetKt$SkillManagerBottomSheet$3$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$uiState$delegate = state;
        this.$hasDeterminedExpansionStates$delegate = mutableState;
        this.$isBuiltInExpanded$delegate = mutableState2;
        this.$searchQuery$delegate = mutableState3;
        this.$filteredSkills$delegate = mutableState4;
        this.$previousSearchQuery$delegate = mutableState5;
        this.$isCustomExpanded$delegate = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SkillManagerBottomSheetKt$SkillManagerBottomSheet$3$1(this.$listState, this.$uiState$delegate, this.$hasDeterminedExpansionStates$delegate, this.$isBuiltInExpanded$delegate, this.$searchQuery$delegate, this.$filteredSkills$delegate, this.$previousSearchQuery$delegate, this.$isCustomExpanded$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SkillManagerBottomSheetKt$SkillManagerBottomSheet$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v35 */
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
}
