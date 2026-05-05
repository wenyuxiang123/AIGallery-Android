package com.google.ai.edge.gallery.ui.modelmanager;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.ai.edge.gallery.data.Model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$GlobalModelManager$2$1", m932f = "GlobalModelManager.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class GlobalModelManagerKt$GlobalModelManager$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotStateList<Model> $builtInModels;
    final /* synthetic */ SnapshotStateList<Model> $importedModels;
    final /* synthetic */ ModelManagerViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlobalModelManagerKt$GlobalModelManager$2$1(ModelManagerViewModel modelManagerViewModel, SnapshotStateList<Model> snapshotStateList, SnapshotStateList<Model> snapshotStateList2, Continuation<? super GlobalModelManagerKt$GlobalModelManager$2$1> continuation) {
        super(2, continuation);
        this.$viewModel = modelManagerViewModel;
        this.$builtInModels = snapshotStateList;
        this.$importedModels = snapshotStateList2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GlobalModelManagerKt$GlobalModelManager$2$1(this.$viewModel, this.$builtInModels, this.$importedModels, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GlobalModelManagerKt$GlobalModelManager$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Iterable<IndexedValue> $this$associate$iv = CollectionsKt.withIndex(this.$viewModel.getAllowlistModels());
                int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
                final Map destination$iv$iv = new LinkedHashMap(capacity$iv);
                for (IndexedValue it : $this$associate$iv) {
                    Pair pairM929to = TuplesKt.m929to(((Model) it.getValue()).getName(), Boxing.boxInt(it.getIndex()));
                    destination$iv$iv.put(pairM929to.getFirst(), pairM929to.getSecond());
                }
                Iterable $this$filter$iv = this.$viewModel.getAllModels();
                Collection destination$iv$iv2 = new ArrayList();
                for (Object element$iv$iv : $this$filter$iv) {
                    Model it2 = (Model) element$iv$iv;
                    String parentModelName = it2.getParentModelName();
                    if (parentModelName == null || parentModelName.length() == 0) {
                        destination$iv$iv2.add(element$iv$iv);
                    }
                }
                final Comparator comparator = new Comparator() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$GlobalModelManager$2$1$invokeSuspend$$inlined$compareBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        Model model = (Model) t;
                        Integer num = (Integer) destination$iv$iv.get(model.getName());
                        Integer num2 = num != null ? num : (Comparable) Integer.MAX_VALUE;
                        Model model2 = (Model) t2;
                        Integer num3 = (Integer) destination$iv$iv.get(model2.getName());
                        return ComparisonsKt.compareValues(num2, num3 != null ? num3 : (Comparable) Integer.MAX_VALUE);
                    }
                };
                Iterable sortedModels = CollectionsKt.sortedWith((List) destination$iv$iv2, new Comparator() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$GlobalModelManager$2$1$invokeSuspend$$inlined$thenBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        int previousCompare = comparator.compare(t, t2);
                        if (previousCompare != 0) {
                            return previousCompare;
                        }
                        Model model = (Model) t;
                        String name = model.getName();
                        Model model2 = (Model) t2;
                        return ComparisonsKt.compareValues(name, model2.getName());
                    }
                });
                this.$builtInModels.clear();
                SnapshotStateList<Model> snapshotStateList = this.$builtInModels;
                Iterable $this$filter$iv2 = sortedModels;
                Collection destination$iv$iv3 = new ArrayList();
                for (Object element$iv$iv2 : $this$filter$iv2) {
                    Model it3 = (Model) element$iv$iv2;
                    if (!it3.getImported()) {
                        destination$iv$iv3.add(element$iv$iv2);
                    }
                }
                snapshotStateList.addAll((List) destination$iv$iv3);
                this.$importedModels.clear();
                SnapshotStateList<Model> snapshotStateList2 = this.$importedModels;
                Iterable $this$filter$iv3 = sortedModels;
                Collection destination$iv$iv4 = new ArrayList();
                for (Object element$iv$iv3 : $this$filter$iv3) {
                    Model it4 = (Model) element$iv$iv3;
                    if (it4.getImported()) {
                        destination$iv$iv4.add(element$iv$iv3);
                    }
                }
                snapshotStateList2.addAll((List) destination$iv$iv4);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
