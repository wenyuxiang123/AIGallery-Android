package com.google.ai.edge.gallery.customtasks.agentchat;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.google.ai.edge.gallery.proto.Skill;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$1$1", m932f = "AddOrEditSkillBottomSheet.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotStateMap<String, String> $scriptContents;
    final /* synthetic */ MutableState<Boolean> $scriptsLoading$delegate;
    final /* synthetic */ MutableState<String> $selectedScript$delegate;
    final /* synthetic */ MutableState<Skill> $skill$delegate;
    final /* synthetic */ SkillManagerViewModel $skillManagerViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$1$1(SkillManagerViewModel skillManagerViewModel, MutableState<Skill> mutableState, MutableState<Boolean> mutableState2, SnapshotStateMap<String, String> snapshotStateMap, MutableState<String> mutableState3, Continuation<? super AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$1$1> continuation) {
        super(2, continuation);
        this.$skillManagerViewModel = skillManagerViewModel;
        this.$skill$delegate = mutableState;
        this.$scriptsLoading$delegate = mutableState2;
        this.$scriptContents = snapshotStateMap;
        this.$selectedScript$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$1$1(this.$skillManagerViewModel, this.$skill$delegate, this.$scriptsLoading$delegate, this.$scriptContents, this.$selectedScript$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Skill curSkill = AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$5(this.$skill$delegate);
                if (curSkill != null) {
                    Log.d("AGAddOrEditSkill", "Loading skill scripts...");
                    AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$40(this.$scriptsLoading$delegate, true);
                    SkillManagerViewModel skillManagerViewModel = this.$skillManagerViewModel;
                    final SnapshotStateMap<String, String> snapshotStateMap = this.$scriptContents;
                    final MutableState<Boolean> mutableState = this.$scriptsLoading$delegate;
                    final MutableState<String> mutableState2 = this.$selectedScript$delegate;
                    skillManagerViewModel.loadSkillScriptsContent(curSkill, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$1$1.invokeSuspend$lambda$1(snapshotStateMap, mutableState, mutableState2, (Map) obj);
                        }
                    });
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    
    public static final Unit invokeSuspend$lambda$1(SnapshotStateMap $scriptContents, MutableState $scriptsLoading$delegate, MutableState $selectedScript$delegate, Map loaded) {
        Object element$iv;
        $scriptContents.clear();
        $scriptContents.putAll(loaded);
        Log.d("AGAddOrEditSkill", "Loaded scripts: " + CollectionsKt.joinToString$default($scriptContents.keySet(), ",", null, null, 0, null, null, 62, null));
        AddOrEditSkillBottomSheetKt.AddOrEditSkillBottomSheet$lambda$40($scriptsLoading$delegate, false);
        Iterable $this$firstOrNull$iv = $scriptContents.keySet();
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (it.hasNext()) {
                element$iv = it.next();
                String it2 = (String) element$iv;
                if (Intrinsics.areEqual(it2, "index.html")) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        String str = (String) element$iv;
        if (str == null) {
            str = (String) CollectionsKt.firstOrNull($scriptContents.keySet());
        }
        $selectedScript$delegate.setValue(str);
        return Unit.INSTANCE;
    }
}
