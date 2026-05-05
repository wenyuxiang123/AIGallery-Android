package com.google.ai.edge.gallery.ui.benchmark;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.proto.BenchmarkResult;
import com.google.ai.edge.gallery.proto.ValueSeries;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;



\u001a\u00020\u00142\f\u0010*\u001a\b\u0012\u0004\u0012\u00020(0+J\u000e\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0018J\u000e\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0018J\u0006\u0010/\u001a\u00020\u0014J\u0016\u00100\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u001fJ\u0016\u00102\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u001fJ\u0016\u00103\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u001fJ\u0006\u00104\u001a\u00020\u0014J\u0006\u00105\u001a\u00020\u0014J\u0016\u00106\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00182\u0006\u00107\u001a\u000208J\u0016\u00109\u001a\u00020:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0+H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006="}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkViewModel;", "Landroidx/lifecycle/ViewModel;", "appContext", "Landroid/content/Context;", "dataStoreRepository", "Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "<init>", "(Landroid/content/Context;Lcom/google/ai/edge/gallery/data/DataStoreRepository;)V", "getDataStoreRepository", "()Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkUiState;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "runBenchmark", "", "model", "Lcom/google/ai/edge/gallery/data/Model;", "accelerator", "", "prefillTokens", "", "decodeTokens", "runCount", "setShowResultsViewer", "showResultsViewer", "", "setRunning", "running", "setTotalRunCount", "totalRunCount", "setRunProgress", "completedRunCount", "addBenchmarkResult", "result", "Lcom/google/ai/edge/gallery/proto/BenchmarkResult;", "setBenchmarkResults", "results", "", "deleteBenchmarkResult", "id", "setBaseline", "clearBaseline", "setExpanded", "expanded", "setBasicInfoExpanded", "setStatsExpanded", "expandAll", "collapseAll", "setAggregation", "aggregation", "Lcom/google/ai/edge/gallery/ui/benchmark/Aggregation;", "calculateValueSeries", "Lcom/google/ai/edge/gallery/proto/ValueSeries;", "values", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class BenchmarkViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<BenchmarkUiState> _uiState;
    private final Context appContext;
    private final DataStoreRepository dataStoreRepository;
    private final StateFlow<BenchmarkUiState> uiState;

    public final DataStoreRepository getDataStoreRepository() {
        return this.dataStoreRepository;
    }

    @Inject
    public BenchmarkViewModel(@ApplicationContext Context appContext, DataStoreRepository dataStoreRepository) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(dataStoreRepository, "dataStoreRepository");
        this.appContext = appContext;
        this.dataStoreRepository = dataStoreRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new BenchmarkUiState(null, null, false, false, 0, 0, 63, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        List<BenchmarkResult> allBenchmarkResults = this.dataStoreRepository.getAllBenchmarkResults();
        Log.d("AGBenchmarkVM", "Loaded " + allBenchmarkResults.size() + " benchmark results");
        setBenchmarkResults(allBenchmarkResults);
        collapseAll();
    }

    protected final MutableStateFlow<BenchmarkUiState> get_uiState() {
        return this._uiState;
    }

    public final StateFlow<BenchmarkUiState> getUiState() {
        return this.uiState;
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.benchmark.BenchmarkViewModel$runBenchmark$1", m932f = "BenchmarkViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C26421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accelerator;
        final /* synthetic */ int $decodeTokens;
        final /* synthetic */ Model $model;
        final /* synthetic */ int $prefillTokens;
        final /* synthetic */ int $runCount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26421(int i, Model model, String str, int i2, int i3, Continuation<? super C26421> continuation) {
            super(2, continuation);
            this.$runCount = i;
            this.$model = model;
            this.$accelerator = str;
            this.$prefillTokens = i2;
            this.$decodeTokens = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BenchmarkViewModel.this.new C26421(this.$runCount, this.$model, this.$accelerator, this.$prefillTokens, this.$decodeTokens, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x01ce  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 886
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.ui.benchmark.BenchmarkViewModel.C26421.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void runBenchmark(Model model, String accelerator, int prefillTokens, int decodeTokens, int runCount) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(accelerator, "accelerator");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C26421(runCount, model, accelerator, prefillTokens, decodeTokens, null), 2, null);
    }

    public final void setShowResultsViewer(boolean showResultsViewer) {
        BenchmarkUiState value;
        BenchmarkUiState it;
        MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = BenchmarkUiState.copy$default(this._uiState.getValue(), null, null, showResultsViewer, false, 0, 0, 59, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setRunning(boolean running) {
        BenchmarkUiState value;
        BenchmarkUiState it;
        MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = BenchmarkUiState.copy$default(this._uiState.getValue(), null, null, false, running, 0, 0, 55, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setTotalRunCount(int totalRunCount) {
        BenchmarkUiState value;
        BenchmarkUiState it;
        MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = BenchmarkUiState.copy$default(this._uiState.getValue(), null, null, false, false, totalRunCount, 0, 47, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setRunProgress(int completedRunCount) {
        BenchmarkUiState value;
        BenchmarkUiState it;
        MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = BenchmarkUiState.copy$default(this._uiState.getValue(), null, null, false, false, 0, completedRunCount, 31, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final String addBenchmarkResult(BenchmarkResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        List newResults = CollectionsKt.toMutableList((Collection) this._uiState.getValue().getResults());
        String newId = String.valueOf(Random.INSTANCE.nextDouble());
        newResults.add(0, new BenchmarkResultInfo(newId, result, false, true, true, null, 36, null));
        MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
        while (true) {
            BenchmarkUiState value = mutableStateFlow.getValue();
            List newResults2 = newResults;
            BenchmarkUiState it = BenchmarkUiState.copy$default(this._uiState.getValue(), newResults, null, false, false, 0, 0, 62, null);
            if (mutableStateFlow.compareAndSet(value, it)) {
                this.dataStoreRepository.addBenchmarkResult(result);
                return newId;
            }
            newResults = newResults2;
        }
    }

    public final void setBenchmarkResults(List<BenchmarkResult> results) {
        BenchmarkUiState value;
        BenchmarkUiState value2;
        Collection destination$iv$iv;
        Intrinsics.checkNotNullParameter(results, "results");
        MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            value2 = this._uiState.getValue();
            List<BenchmarkResult> $this$map$iv = results;
            destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                BenchmarkResult result = (BenchmarkResult) item$iv$iv;
                destination$iv$iv.add(new BenchmarkResultInfo(String.valueOf(Random.INSTANCE.nextDouble()), result, false, false, true, null, 32, null));
            }
        } while (!mutableStateFlow.compareAndSet(value, BenchmarkUiState.copy$default(value2, (List) destination$iv$iv, null, false, false, 0, 0, 62, null)));
    }

    public final void deleteBenchmarkResult(String id) {
        BenchmarkUiState value;
        BenchmarkUiState it;
        Intrinsics.checkNotNullParameter(id, "id");
        List newResults = CollectionsKt.toMutableList((Collection) this._uiState.getValue().getResults());
        int index$iv = 0;
        Iterator it2 = newResults.iterator();
        while (true) {
            if (it2.hasNext()) {
                Object item$iv = it2.next();
                BenchmarkResultInfo it3 = (BenchmarkResultInfo) item$iv;
                if (Intrinsics.areEqual(it3.getId(), id)) {
                    break;
                } else {
                    index$iv++;
                }
            } else {
                index$iv = -1;
                break;
            }
        }
        int index = index$iv;
        if (index != -1) {
            BenchmarkResultInfo deletedResult = (BenchmarkResultInfo) newResults.remove(index);
            MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
            while (true) {
                List newResults2 = newResults;
                if (mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), BenchmarkUiState.copy$default(this._uiState.getValue(), newResults, null, false, false, 0, 0, 62, null))) {
                    break;
                } else {
                    newResults = newResults2;
                }
            }
            Object prevValue$iv = deletedResult.getId();
            BenchmarkResultInfo baselineResult = this.uiState.getValue().getBaselineResult();
            if (Intrinsics.areEqual(prevValue$iv, baselineResult != null ? baselineResult.getId() : null)) {
                MutableStateFlow<BenchmarkUiState> mutableStateFlow2 = this._uiState;
                do {
                    value = mutableStateFlow2.getValue();
                    it = BenchmarkUiState.copy$default(this._uiState.getValue(), null, null, false, false, 0, 0, 61, null);
                } while (!mutableStateFlow2.compareAndSet(value, it));
            }
            this.dataStoreRepository.deleteBenchmarkResult(index);
            return;
        }
        Log.w("AGBenchmarkVM", "Benchmark result with id " + id + " not found.");
    }

    public final void setBaseline(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        BenchmarkResultInfo baselineResult = this.uiState.getValue().getBaselineResult();
        Object obj = null;
        if (Intrinsics.areEqual(id, baselineResult != null ? baselineResult.getId() : null)) {
            clearBaseline();
            return;
        }
        Iterable $this$firstOrNull$iv = this._uiState.getValue().getResults();
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object element$iv = it.next();
            BenchmarkResultInfo it2 = (BenchmarkResultInfo) element$iv;
            if (Intrinsics.areEqual(it2.getId(), id)) {
                obj = element$iv;
                break;
            }
        }
        BenchmarkResultInfo result = (BenchmarkResultInfo) obj;
        if (result == null) {
            Log.w("AGBenchmarkVM", "Benchmark result with id " + id + " not found.");
        } else {
            MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), BenchmarkUiState.copy$default(this._uiState.getValue(), null, result, false, false, 0, 0, 61, null))) {
            }
        }
    }

    public final void clearBaseline() {
        BenchmarkUiState value;
        BenchmarkUiState it;
        MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = BenchmarkUiState.copy$default(this._uiState.getValue(), null, null, false, false, 0, 0, 61, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setExpanded(String id, boolean expanded) {
        Intrinsics.checkNotNullParameter(id, "id");
        List newResults = CollectionsKt.toMutableList((Collection) this._uiState.getValue().getResults());
        int index$iv = 0;
        Iterator it = newResults.iterator();
        while (true) {
            if (it.hasNext()) {
                Object item$iv = it.next();
                BenchmarkResultInfo it2 = (BenchmarkResultInfo) item$iv;
                if (Intrinsics.areEqual(it2.getId(), id)) {
                    break;
                } else {
                    index$iv++;
                }
            } else {
                index$iv = -1;
                break;
            }
        }
        int index = index$iv;
        if (index != -1) {
            newResults.set(index, BenchmarkResultInfo.copy$default((BenchmarkResultInfo) newResults.get(index), null, null, expanded, expanded, expanded, null, 35, null));
            MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), BenchmarkUiState.copy$default(this._uiState.getValue(), newResults, null, false, false, 0, 0, 62, null))) {
            }
            return;
        }
        Log.w("AGBenchmarkVM", "Benchmark result with id " + id + " not found.");
    }

    public final void setBasicInfoExpanded(String id, boolean expanded) {
        Intrinsics.checkNotNullParameter(id, "id");
        List newResults = CollectionsKt.toMutableList((Collection) this._uiState.getValue().getResults());
        int index$iv = 0;
        Iterator it = newResults.iterator();
        while (true) {
            if (it.hasNext()) {
                Object item$iv = it.next();
                BenchmarkResultInfo it2 = (BenchmarkResultInfo) item$iv;
                if (Intrinsics.areEqual(it2.getId(), id)) {
                    break;
                } else {
                    index$iv++;
                }
            } else {
                index$iv = -1;
                break;
            }
        }
        int index = index$iv;
        if (index != -1) {
            newResults.set(index, BenchmarkResultInfo.copy$default((BenchmarkResultInfo) newResults.get(index), null, null, false, expanded, false, null, 55, null));
            MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), BenchmarkUiState.copy$default(this._uiState.getValue(), newResults, null, false, false, 0, 0, 62, null))) {
            }
            return;
        }
        Log.w("AGBenchmarkVM", "Benchmark result with id " + id + " not found.");
    }

    public final void setStatsExpanded(String id, boolean expanded) {
        Intrinsics.checkNotNullParameter(id, "id");
        List newResults = CollectionsKt.toMutableList((Collection) this._uiState.getValue().getResults());
        int index$iv = 0;
        Iterator it = newResults.iterator();
        while (true) {
            if (it.hasNext()) {
                Object item$iv = it.next();
                BenchmarkResultInfo it2 = (BenchmarkResultInfo) item$iv;
                if (Intrinsics.areEqual(it2.getId(), id)) {
                    break;
                } else {
                    index$iv++;
                }
            } else {
                index$iv = -1;
                break;
            }
        }
        int index = index$iv;
        if (index != -1) {
            newResults.set(index, BenchmarkResultInfo.copy$default((BenchmarkResultInfo) newResults.get(index), null, null, false, false, expanded, null, 47, null));
            MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), BenchmarkUiState.copy$default(this._uiState.getValue(), newResults, null, false, false, 0, 0, 62, null))) {
            }
            return;
        }
        Log.w("AGBenchmarkVM", "Benchmark result with id " + id + " not found.");
    }

    public final void expandAll() {
        List newResults = CollectionsKt.toMutableList((Collection) this._uiState.getValue().getResults());
        int size = newResults.size();
        for (int i = 0; i < size; i++) {
            newResults.set(i, BenchmarkResultInfo.copy$default((BenchmarkResultInfo) newResults.get(i), null, null, true, true, true, null, 35, null));
        }
        MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), BenchmarkUiState.copy$default(this._uiState.getValue(), newResults, null, false, false, 0, 0, 62, null))) {
        }
    }

    public final void collapseAll() {
        List newResults = CollectionsKt.toMutableList((Collection) this._uiState.getValue().getResults());
        int size = newResults.size();
        for (int i = 0; i < size; i++) {
            newResults.set(i, BenchmarkResultInfo.copy$default((BenchmarkResultInfo) newResults.get(i), null, null, false, false, false, null, 35, null));
        }
        MutableStateFlow<BenchmarkUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), BenchmarkUiState.copy$default(this._uiState.getValue(), newResults, null, false, false, 0, 0, 62, null))) {
        }
    }

    public final void setAggregation(String id, Aggregation aggregation) {
        BenchmarkUiState value;
        BenchmarkUiState it;
        BenchmarkViewModel benchmarkViewModel = this;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(aggregation, "aggregation");
        List newResults = CollectionsKt.toMutableList((Collection) benchmarkViewModel._uiState.getValue().getResults());
        int index$iv = 0;
        Iterator it2 = newResults.iterator();
        while (true) {
            if (it2.hasNext()) {
                Object item$iv = it2.next();
                BenchmarkResultInfo it3 = (BenchmarkResultInfo) item$iv;
                if (Intrinsics.areEqual(it3.getId(), id)) {
                    break;
                } else {
                    index$iv++;
                }
            } else {
                index$iv = -1;
                break;
            }
        }
        int index = index$iv;
        if (index >= 0) {
            newResults.set(index, BenchmarkResultInfo.copy$default((BenchmarkResultInfo) newResults.get(index), null, null, false, false, false, aggregation, 31, null));
            BenchmarkResultInfo baselineResult = benchmarkViewModel.uiState.getValue().getBaselineResult();
            if (Intrinsics.areEqual(baselineResult != null ? baselineResult.getId() : null, ((BenchmarkResultInfo) newResults.get(index)).getId())) {
                MutableStateFlow<BenchmarkUiState> mutableStateFlow = benchmarkViewModel._uiState;
                do {
                    value = mutableStateFlow.getValue();
                    it = BenchmarkUiState.copy$default(benchmarkViewModel._uiState.getValue(), null, (BenchmarkResultInfo) newResults.get(index), false, false, 0, 0, 61, null);
                } while (!mutableStateFlow.compareAndSet(value, it));
            }
        }
        MutableStateFlow<BenchmarkUiState> mutableStateFlow2 = benchmarkViewModel._uiState;
        while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), BenchmarkUiState.copy$default(benchmarkViewModel._uiState.getValue(), newResults, null, false, false, 0, 0, 62, null))) {
            benchmarkViewModel = this;
        }
    }

    
    public final ValueSeries calculateValueSeries(List<Double> values) {
        if (values.isEmpty()) {
            ValueSeries defaultInstance = ValueSeries.getDefaultInstance();
            Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance(...)");
            return defaultInstance;
        }
        List sortedValues = CollectionsKt.sorted(values);
        int size = sortedValues.size();
        double min = ((Number) CollectionsKt.first(sortedValues)).doubleValue();
        double max = ((Number) CollectionsKt.last(sortedValues)).doubleValue();
        double avg = CollectionsKt.averageOfDouble(values);
        double median = calculateValueSeries$getPercentile(size, sortedValues, 0.5d);
        double pct25 = calculateValueSeries$getPercentile(size, sortedValues, 0.25d);
        double pct75 = calculateValueSeries$getPercentile(size, sortedValues, 0.75d);
        ValueSeries valueSeriesBuild = ValueSeries.newBuilder().addAllValue(values).setMin(min).setMax(max).setAvg(avg).setMedium(median).setPct25(pct25).setPct75(pct75).build();
        Intrinsics.checkNotNullExpressionValue(valueSeriesBuild, "build(...)");
        return valueSeriesBuild;
    }

    private static final double calculateValueSeries$getPercentile(int size, List<Double> list, double p) {
        if (size == 1) {
            return list.get(0).doubleValue();
        }
        double index = ((double) (size - 1)) * p;
        int lower = (int) Math.floor(index);
        int upper = (int) Math.ceil(index);
        if (lower == upper) {
            return list.get(lower).doubleValue();
        }
        double weight = index - ((double) lower);
        return (list.get(lower).doubleValue() * (((double) 1) - weight)) + (list.get(upper).doubleValue() * weight);
    }
}
