package com.google.ai.edge.gallery.customtasks.agentchat;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.documentfile.provider.DocumentFile;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.ai.edge.gallery.AnalyticsKt;
import com.google.ai.edge.gallery.GalleryEvent;
import com.google.ai.edge.gallery.common.JsonObjAndTextContent;
import com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import com.google.ai.edge.gallery.data.SkillAllowlist;
import com.google.ai.edge.gallery.proto.Skill;
import com.google.ai.edge.litertlm.Contents;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p009io.ByteStreamsKt;
import kotlin.p009io.CloseableKt;
import kotlin.p009io.FilesKt;
import kotlin.p009io.TextStreamsKt;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;



public final class SkillManagerViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<SkillManagerUiState> _uiState;
    private final Context context;
    private final DataStoreRepository dataStoreRepository;
    private boolean skillLoaded;
    private final StateFlow<SkillManagerUiState> uiState;

    public final DataStoreRepository getDataStoreRepository() {
        return this.dataStoreRepository;
    }

    @Inject
    public SkillManagerViewModel(DataStoreRepository dataStoreRepository, @ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(dataStoreRepository, "dataStoreRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.dataStoreRepository = dataStoreRepository;
        this.context = context;
        this._uiState = StateFlowKt.MutableStateFlow(new SkillManagerUiState(false, null, false, null, null, false, null, null, 255, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        if (!("".length() > 0)) {
            return;
        }
        loadSkillAllowlist();
    }

    public final StateFlow<SkillManagerUiState> getUiState() {
        return this.uiState;
    }

    public final boolean getSkillLoaded() {
        return this.skillLoaded;
    }

    public final void setSkillLoaded(boolean z) {
        this.skillLoaded = z;
    }

    public final void loadSkills(Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        if (!this.skillLoaded) {
            setLoading(true);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25301(onDone, null), 2, null);
        } else {
            onDone.invoke();
        }
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$loadSkills$1", m932f = "SkillManagerViewModel.kt", m933i = {0, 0, 0, 0, 0, 0}, m934l = {232}, m935m = "invokeSuspend", m936n = {"allDataStoreSkills", "dataStoreBuiltInSkills", "dataStoreCustomSkills", "builtInSelectionMap", "builtInSkills", "finalSkills"}, m938s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class C25301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onDone;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25301(Function0<Unit> function0, Continuation<? super C25301> continuation) {
            super(2, continuation);
            this.$onDone = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SkillManagerViewModel.this.new C25301(this.$onDone, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Iterator it;
            boolean z;
            String[] skillAssetDirs;
            InputStream inputStreamOpen;
            SkillManagerViewModel skillManagerViewModel;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d("AGSkillManagerVM", "Loading skills index...");
                    Iterable allSkills = SkillManagerViewModel.this.getDataStoreRepository().getAllSkills();
                    Iterable $this$filter$iv = allSkills;
                    Collection destination$iv$iv = new ArrayList();
                    for (Object element$iv$iv : $this$filter$iv) {
                        Skill it2 = (Skill) element$iv$iv;
                        if (it2.getBuiltIn()) {
                            destination$iv$iv.add(element$iv$iv);
                        }
                    }
                    Iterable dataStoreBuiltInSkills = (List) destination$iv$iv;
                    Iterable $this$filter$iv2 = allSkills;
                    Collection destination$iv$iv2 = new ArrayList();
                    for (Object element$iv$iv2 : $this$filter$iv2) {
                        Skill it3 = (Skill) element$iv$iv2;
                        if (!it3.getBuiltIn()) {
                            destination$iv$iv2.add(element$iv$iv2);
                        }
                    }
                    List dataStoreCustomSkills = (List) destination$iv$iv2;
                    Log.d("AGSkillManagerVM", "data store built-in skills:\n" + CollectionsKt.joinToString$default(dataStoreBuiltInSkills, "\n", null, null, 0, null, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$loadSkills$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SkillManagerViewModel.C25301.invokeSuspend$lambda$2((Skill) obj);
                        }
                    }, 30, null));
                    Log.d("AGSkillManagerVM", "data store custom skills:\n" + CollectionsKt.joinToString$default(dataStoreCustomSkills, "\n", null, null, 0, null, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$loadSkills$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SkillManagerViewModel.C25301.invokeSuspend$lambda$3((Skill) obj);
                        }
                    }, 30, null));
                    Iterable<Skill> $this$associate$iv = dataStoreBuiltInSkills;
                    int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
                    Map destination$iv$iv3 = new LinkedHashMap(capacity$iv);
                    for (Skill it4 : $this$associate$iv) {
                        Iterable $this$associate$iv2 = $this$associate$iv;
                        Pair pairM929to = TuplesKt.m929to(it4.getName(), Boxing.boxBoolean(it4.getSelected()));
                        destination$iv$iv3.put(pairM929to.getFirst(), pairM929to.getSecond());
                        $this$associate$iv = $this$associate$iv2;
                    }
                    Log.d("AGSkillManagerVM", "data store built-in skills selection map: " + destination$iv$iv3);
                    List builtInSkills = new ArrayList();
                    try {
                        String[] list = SkillManagerViewModel.this.context.getAssets().list("skills");
                        if (list == null) {
                            list = new String[0];
                        }
                        String[] skillAssetDirs2 = list;
                        int length = skillAssetDirs2.length;
                        int i = 0;
                        while (i < length) {
                            String dirName = skillAssetDirs2[i];
                            String skillMdPath = "skills/" + dirName + "/SKILL.md";
                            try {
                                inputStreamOpen = SkillManagerViewModel.this.context.getAssets().open(skillMdPath);
                                skillManagerViewModel = SkillManagerViewModel.this;
                            } catch (Exception e) {
                                e = e;
                                skillAssetDirs = skillAssetDirs2;
                            }
                            try {
                                InputStream inputStream = inputStreamOpen;
                                Intrinsics.checkNotNull(inputStream);
                                try {
                                    skillAssetDirs = skillAssetDirs2;
                                    try {
                                        Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                                        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                                        try {
                                            BufferedReader it5 = bufferedReader;
                                            String mdContent = TextStreamsKt.readText(it5);
                                            CloseableKt.closeFinally(bufferedReader, null);
                                            Pair pairConvertSkillMdToProto$default = SkillManagerViewModel.convertSkillMdToProto$default(skillManagerViewModel, mdContent, true, true, null, "assets/skills/" + dirName, 8, null);
                                            Skill skillProto = (Skill) pairConvertSkillMdToProto$default.component1();
                                            List errors = (List) pairConvertSkillMdToProto$default.component2();
                                            if (!errors.isEmpty()) {
                                                Boxing.boxInt(Log.w("AGSkillManagerVM", "Error parsing asset skill " + dirName + ": " + CollectionsKt.joinToString$default(errors, ", ", null, null, 0, null, null, 62, null)));
                                            } else if (skillProto != null) {
                                                Boolean bool = (Boolean) destination$iv$iv3.get(skillProto.getName());
                                                boolean selectedState = bool != null ? bool.booleanValue() : true;
                                                Skill skillBuild = skillProto.toBuilder().setSelected(selectedState).build();
                                                Intrinsics.checkNotNullExpressionValue(skillBuild, "build(...)");
                                                builtInSkills.add(skillBuild);
                                                Boxing.boxInt(Log.d("AGSkillManagerVM", "Added built-in skill: " + skillProto.getName()));
                                            }
                                            try {
                                                CloseableKt.closeFinally(inputStreamOpen, null);
                                            } catch (Exception e2) {
                                                e = e2;
                                                Boxing.boxInt(Log.w("AGSkillManagerVM", "SKILL.md not found or error reading for asset skill " + dirName, e));
                                                i++;
                                                skillAssetDirs2 = skillAssetDirs;
                                            }
                                            i++;
                                            skillAssetDirs2 = skillAssetDirs;
                                        } catch (Throwable th2) {
                                            try {
                                                throw th2;
                                            } catch (Throwable th3) {
                                                CloseableKt.closeFinally(bufferedReader, th2);
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            throw th;
                                        } catch (Throwable th5) {
                                            CloseableKt.closeFinally(inputStreamOpen, th);
                                            throw th5;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    skillAssetDirs = skillAssetDirs2;
                                    th = th6;
                                }
                            } catch (Throwable th7) {
                                skillAssetDirs = skillAssetDirs2;
                                th = th7;
                            }
                        }
                    } catch (Exception e3) {
                        Log.e("AGSkillManagerVM", "Error listing assets/skills", e3);
                    }
                    Log.d("AGSkillManagerVM", "Final built-in skills:\n" + CollectionsKt.joinToString$default(builtInSkills, "\n", null, null, 0, null, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$loadSkills$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SkillManagerViewModel.C25301.invokeSuspend$lambda$8((Skill) obj);
                        }
                    }, 30, null));
                    List<Skill> mutableList = CollectionsKt.toMutableList((Collection) builtInSkills);
                    Iterator it6 = dataStoreCustomSkills.iterator();
                    while (it6.hasNext()) {
                        Skill customSkill = (Skill) it6.next();
                        List<Skill> $this$any$iv = mutableList;
                        if (($this$any$iv instanceof Collection) && $this$any$iv.isEmpty()) {
                            it = it6;
                            z = false;
                        } else {
                            Iterator it7 = $this$any$iv.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    Object element$iv = it7.next();
                                    Skill it8 = (Skill) element$iv;
                                    it = it6;
                                    Iterable $this$any$iv2 = $this$any$iv;
                                    if (Intrinsics.areEqual(it8.getName(), customSkill.getName())) {
                                        z = true;
                                    } else {
                                        it6 = it;
                                        $this$any$iv = $this$any$iv2;
                                    }
                                } else {
                                    it = it6;
                                    z = false;
                                }
                            }
                        }
                        if (z) {
                            it6 = it;
                        } else {
                            mutableList.add(customSkill);
                            it6 = it;
                        }
                    }
                    SkillManagerViewModel.this.getDataStoreRepository().setSkills(mutableList);
                    MutableStateFlow $this$update$iv = SkillManagerViewModel.this._uiState;
                    int $i$f$update = 0;
                    while (true) {
                        Object prevValue$iv = $this$update$iv.getValue();
                        SkillManagerUiState currentState = (SkillManagerUiState) prevValue$iv;
                        List<Skill> $this$map$iv = mutableList;
                        int $i$f$update2 = $i$f$update;
                        Collection destination$iv$iv4 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
                        for (Object item$iv$iv : $this$map$iv) {
                            Skill it9 = (Skill) item$iv$iv;
                            destination$iv$iv4.add(new SkillState(it9));
                            $this$map$iv = $this$map$iv;
                        }
                        if ($this$update$iv.compareAndSet(prevValue$iv, currentState.copy((159 & 1) != 0 ? currentState.loading : false, (159 & 2) != 0 ? currentState.skills : (List) destination$iv$iv4, (159 & 4) != 0 ? currentState.validating : false, (159 & 8) != 0 ? currentState.validationError : null, (159 & 16) != 0 ? currentState.importDirectoryUri : null, (159 & 32) != 0 ? currentState.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState.featuredSkills : null, (159 & 128) != 0 ? currentState.skillAllowlistError : null))) {
                            SkillManagerViewModel.this.setLoading(false);
                            SkillManagerViewModel.this.setSkillLoaded(true);
                            this.L$0 = SpillingKt.nullOutSpilledVariable(allSkills);
                            this.L$1 = SpillingKt.nullOutSpilledVariable(dataStoreBuiltInSkills);
                            this.L$2 = SpillingKt.nullOutSpilledVariable(dataStoreCustomSkills);
                            this.L$3 = SpillingKt.nullOutSpilledVariable(destination$iv$iv3);
                            this.L$4 = SpillingKt.nullOutSpilledVariable(builtInSkills);
                            this.L$5 = SpillingKt.nullOutSpilledVariable(mutableList);
                            this.label = 1;
                            if (BuildersKt.withContext(Dispatchers.getDefault(), new AnonymousClass7(this.$onDone, null), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            $i$f$update = $i$f$update2;
                        }
                        break;
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

        
        public static final CharSequence invokeSuspend$lambda$2(Skill it) {
            String name = it.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }

        
        public static final CharSequence invokeSuspend$lambda$3(Skill it) {
            String name = it.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }

        
        public static final CharSequence invokeSuspend$lambda$8(Skill it) {
            return it.getName() + "(" + it.getSelected() + ")";
        }

        
        
        
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$loadSkills$1$7", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $onDone;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(Function0<Unit> function0, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.$onDone = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.$onDone, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.$onDone.invoke();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$loadSkillAllowlist$2", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25282 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C25282(Continuation<? super C25282> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SkillManagerViewModel.this.new C25282(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25282) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object prevValue$iv;
            SkillManagerUiState currentState;
            JsonObjAndTextContent jsonObjAndTextContent;
            Object prevValue$iv2;
            SkillManagerUiState currentState2;
            Object objFromJson;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        Log.d("AGSkillManagerVM", "Fetching skill allowlist from: ");
                        jsonObjAndTextContent = null;
                        try {
                            URLConnection uRLConnectionOpenConnection = new URL("").openConnection();
                            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                            HttpURLConnection connection$iv = (HttpURLConnection) uRLConnectionOpenConnection;
                            connection$iv.setRequestMethod(ShareTarget.METHOD_GET);
                            connection$iv.connect();
                            int responseCode$iv = connection$iv.getResponseCode();
                            if (responseCode$iv == 200) {
                                InputStream inputStream$iv = connection$iv.getInputStream();
                                Intrinsics.checkNotNull(inputStream$iv);
                                Reader inputStreamReader = new InputStreamReader(inputStream$iv, Charsets.UTF_8);
                                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                                try {
                                    BufferedReader it$iv = bufferedReader;
                                    String response$iv = TextStreamsKt.readText(it$iv);
                                    CloseableKt.closeFinally(bufferedReader, null);
                                    try {
                                        Gson gson$iv$iv = new Gson();
                                        objFromJson = gson$iv$iv.fromJson(response$iv, (Class<Object>) SkillAllowlist.class);
                                    } catch (Exception e$iv$iv) {
                                        Log.e("AGUtils", "Error parsing JSON string", e$iv$iv);
                                        objFromJson = null;
                                    }
                                    Object jsonObj$iv = objFromJson;
                                    if (jsonObj$iv != null) {
                                        jsonObjAndTextContent = new JsonObjAndTextContent(jsonObj$iv, response$iv);
                                    }
                                } finally {
                                }
                            } else {
                                Log.e("AGUtils", "HTTP error: " + responseCode$iv);
                            }
                        } catch (Exception e$iv) {
                            Log.e("AGUtils", "Error when getting or parsing json response", e$iv);
                        }
                        break;
                    } catch (Exception e) {
                        Log.e("AGSkillManagerVM", "Error loading skill allowlist", e);
                        MutableStateFlow $this$update$iv = SkillManagerViewModel.this._uiState;
                        do {
                            prevValue$iv = $this$update$iv.getValue();
                            currentState = (SkillManagerUiState) prevValue$iv;
                        } while (!$this$update$iv.compareAndSet(prevValue$iv, currentState.copy((159 & 1) != 0 ? currentState.loading : false, (159 & 2) != 0 ? currentState.skills : null, (159 & 4) != 0 ? currentState.validating : false, (159 & 8) != 0 ? currentState.validationError : null, (159 & 16) != 0 ? currentState.importDirectoryUri : null, (159 & 32) != 0 ? currentState.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState.featuredSkills : null, (159 & 128) != 0 ? currentState.skillAllowlistError : "Failed to load skill list: " + e.getMessage())));
                    }
                    if (jsonObjAndTextContent != null) {
                        JsonObjAndTextContent result = jsonObjAndTextContent;
                        SkillAllowlist allowlist = (SkillAllowlist) result.getJsonObj();
                        Log.d("AGSkillManagerVM", "Successfully loaded " + allowlist.getFeaturedSkills().size() + " featured skills.");
                        MutableStateFlow $this$update$iv2 = SkillManagerViewModel.this._uiState;
                        do {
                            prevValue$iv2 = $this$update$iv2.getValue();
                            currentState2 = (SkillManagerUiState) prevValue$iv2;
                        } while (!$this$update$iv2.compareAndSet(prevValue$iv2, currentState2.copy((159 & 1) != 0 ? currentState2.loading : false, (159 & 2) != 0 ? currentState2.skills : null, (159 & 4) != 0 ? currentState2.validating : false, (159 & 8) != 0 ? currentState2.validationError : null, (159 & 16) != 0 ? currentState2.importDirectoryUri : null, (159 & 32) != 0 ? currentState2.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState2.featuredSkills : allowlist.getFeaturedSkills(), (159 & 128) != 0 ? currentState2.skillAllowlistError : null)));
                        return Unit.INSTANCE;
                    }
                    throw new Exception("Failed to fetch or parse JSON from ");
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void loadSkillAllowlist() {
        SkillManagerUiState value;
        SkillManagerUiState it;
        MutableStateFlow<SkillManagerUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = value;
        } while (!mutableStateFlow.compareAndSet(value, it.copy((159 & 1) != 0 ? it.loading : false, (159 & 2) != 0 ? it.skills : null, (159 & 4) != 0 ? it.validating : false, (159 & 8) != 0 ? it.validationError : null, (159 & 16) != 0 ? it.importDirectoryUri : null, (159 & 32) != 0 ? it.loadingSkillAllowlist : true, (159 & 64) != 0 ? it.featuredSkills : null, (159 & 128) != 0 ? it.skillAllowlistError : null)));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25282(null), 2, null);
    }

    public final void validateAndAddSkillFromUrl(String url, Function0<Unit> onSuccess, Function1<? super String, Unit> onValidationError) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onValidationError, "onValidationError");
        setValidating(true);
        setValidationError(null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25351(url, this, onValidationError, onSuccess, null), 2, null);
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$validateAndAddSkillFromUrl$1", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ Function1<String, Unit> $onValidationError;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ SkillManagerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C25351(String str, SkillManagerViewModel skillManagerViewModel, Function1<? super String, Unit> function1, Function0<Unit> function0, Continuation<? super C25351> continuation) {
            super(2, continuation);
            this.$url = str;
            this.this$0 = skillManagerViewModel;
            this.$onValidationError = function1;
            this.$onSuccess = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25351(this.$url, this.this$0, this.$onValidationError, this.$onSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Exception {
            boolean z;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        Log.d("AGSkillManagerVM", "Validating skill from URL: " + this.$url);
                        String normalizedUrl = this.$url;
                        if (StringsKt.endsWith$default(normalizedUrl, "/SKILL.md", false, 2, (Object) null)) {
                            normalizedUrl = StringsKt.dropLast(normalizedUrl, 9);
                        }
                        if (StringsKt.endsWith$default(normalizedUrl, "/", false, 2, (Object) null)) {
                            normalizedUrl = StringsKt.dropLast(normalizedUrl, 1);
                        }
                        String skillMdUrl = normalizedUrl + "/SKILL.md";
                        Log.d("AGSkillManagerVM", "Fetching SKILL.md from: " + skillMdUrl);
                        try {
                            URLConnection connection = new URL(skillMdUrl).openConnection();
                            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
                            try {
                                InputStreamReader reader = inputStreamReader;
                                String mdContent = TextStreamsKt.readText(reader);
                                CloseableKt.closeFinally(inputStreamReader, null);
                                if (mdContent.length() == 0) {
                                    String error = "SKILL.md is empty at " + skillMdUrl;
                                    this.this$0.setValidationError(error);
                                    this.$onValidationError.invoke(error);
                                    Unit unit = Unit.INSTANCE;
                                    this.this$0.setValidating(false);
                                    return unit;
                                }
                                Pair pairConvertSkillMdToProto$default = SkillManagerViewModel.convertSkillMdToProto$default(this.this$0, mdContent, false, true, normalizedUrl, null, 16, null);
                                Skill skillProto = (Skill) pairConvertSkillMdToProto$default.component1();
                                List errors = (List) pairConvertSkillMdToProto$default.component2();
                                if (!errors.isEmpty()) {
                                    String error2 = "Error parsing SKILL.md from " + skillMdUrl + ": " + CollectionsKt.joinToString$default(errors, ", ", null, null, 0, null, null, 62, null);
                                    this.this$0.setValidationError(error2);
                                    this.$onValidationError.invoke(error2);
                                    Unit unit2 = Unit.INSTANCE;
                                    this.this$0.setValidating(false);
                                    return unit2;
                                }
                                if (skillProto != null) {
                                    SkillManagerViewModel skillManagerViewModel = this.this$0;
                                    Function1<String, Unit> function1 = this.$onValidationError;
                                    Function0<Unit> function0 = this.$onSuccess;
                                    String str = this.$url;
                                    Iterable $this$any$iv = ((SkillManagerUiState) skillManagerViewModel._uiState.getValue()).getSkills();
                                    if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
                                        z = false;
                                    } else {
                                        Iterator it = $this$any$iv.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                Object element$iv = it.next();
                                                SkillState curSkill = (SkillState) element$iv;
                                                Iterator it2 = it;
                                                Iterable $this$any$iv2 = $this$any$iv;
                                                if (Intrinsics.areEqual(curSkill.getSkill().getName(), skillProto.getName())) {
                                                    z = true;
                                                } else {
                                                    $this$any$iv = $this$any$iv2;
                                                    it = it2;
                                                }
                                            } else {
                                                z = false;
                                            }
                                        }
                                    }
                                    if (z) {
                                        String error3 = "A skill with the name '" + skillProto.getName() + "' already exists.";
                                        skillManagerViewModel.setValidationError(error3);
                                        function1.invoke(error3);
                                        Unit unit3 = Unit.INSTANCE;
                                        this.this$0.setValidating(false);
                                        return unit3;
                                    }
                                    skillManagerViewModel.addSkill(skillProto, true);
                                    Log.d("AGSkillManagerVM", "Successfully added skill from URL: " + skillProto.getName());
                                    FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
                                    if (firebaseAnalytics != null) {
                                        String id = GalleryEvent.SKILL_MANAGEMENT.getId();
                                        Bundle $this$invokeSuspend_u24lambda_u243_u24lambda_u242 = new Bundle();
                                        $this$invokeSuspend_u24lambda_u243_u24lambda_u242.putString("action", "add");
                                        $this$invokeSuspend_u24lambda_u243_u24lambda_u242.putString("source", "remote_url");
                                        $this$invokeSuspend_u24lambda_u243_u24lambda_u242.putString("skill_name", skillManagerViewModel.getSkillNameForLogging(skillProto));
                                        $this$invokeSuspend_u24lambda_u243_u24lambda_u242.putBoolean("is_built_in", skillProto.getBuiltIn());
                                        $this$invokeSuspend_u24lambda_u243_u24lambda_u242.putString("remote_url", str);
                                        Unit unit4 = Unit.INSTANCE;
                                        firebaseAnalytics.logEvent(id, $this$invokeSuspend_u24lambda_u243_u24lambda_u242);
                                    }
                                    function0.invoke();
                                }
                                this.this$0.setValidating(false);
                                return Unit.INSTANCE;
                            } finally {
                            }
                        } catch (Exception e) {
                            Log.e("AGSkillManagerVM", "Error fetching SKILL.md from " + skillMdUrl, e);
                            String error4 = "Failed to fetch SKILL.md: " + e.getMessage();
                            this.this$0.setValidationError(error4);
                            this.$onValidationError.invoke(error4);
                            Unit unit5 = Unit.INSTANCE;
                            this.this$0.setValidating(false);
                            return unit5;
                        }
                    } catch (Throwable e2) {
                        this.this$0.setValidating(false);
                        throw e2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final boolean checkLocalSkillExisted(Uri directoryUri) {
        Intrinsics.checkNotNullParameter(directoryUri, "directoryUri");
        String originalImportDirName = SkillManagerViewModelKt.getDisplayName(this.context, directoryUri);
        if (originalImportDirName.length() == 0) {
            return false;
        }
        File destDir = getSkillDestinationDir(originalImportDirName);
        return destDir.exists();
    }

    public final boolean checkBuiltInSkillExistedForImportedSkill(Uri directoryUri) {
        Intrinsics.checkNotNullParameter(directoryUri, "directoryUri");
        Log.d("AGSkillManagerVM", "Checking built-in skill existed for imported skill: " + directoryUri);
        DocumentFile rootFile = DocumentFile.fromTreeUri(this.context, directoryUri);
        String mdContent = null;
        DocumentFile skillMdFile = rootFile != null ? rootFile.findFile("SKILL.md") : null;
        if (skillMdFile == null || !skillMdFile.exists()) {
            Log.w("AGSkillManagerVM", "SKILL.md not found in the selected directory for built-in check.");
            return false;
        }
        try {
            InputStream inputStreamOpenInputStream = this.context.getContentResolver().openInputStream(skillMdFile.getUri());
            if (inputStreamOpenInputStream != null) {
                BufferedReader it = inputStreamOpenInputStream;
                try {
                    InputStream inputStream = it;
                    Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                    it = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    try {
                        String text = TextStreamsKt.readText(it);
                        CloseableKt.closeFinally(it, null);
                        CloseableKt.closeFinally(it, null);
                        mdContent = text;
                    } finally {
                    }
                } finally {
                }
            }
            if (mdContent == null) {
                mdContent = "";
            }
            if (mdContent.length() == 0) {
                Log.w("AGSkillManagerVM", "SKILL.md is empty for built-in check.");
                return false;
            }
            Pair pairConvertSkillMdToProto$default = convertSkillMdToProto$default(this, mdContent, false, false, null, null, 24, null);
            Skill skillProto = (Skill) pairConvertSkillMdToProto$default.component1();
            List errors = (List) pairConvertSkillMdToProto$default.component2();
            if (!errors.isEmpty() || skillProto == null) {
                Log.w("AGSkillManagerVM", "Error parsing SKILL.md for built-in check: " + CollectionsKt.joinToString$default(errors, ", ", null, null, 0, null, null, 62, null));
                return false;
            }
            String importedSkillName = skillProto.getName();
            Iterable $this$any$iv = this._uiState.getValue().getSkills();
            if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
                return false;
            }
            for (Object element$iv : $this$any$iv) {
                SkillState it2 = (SkillState) element$iv;
                if (it2.getSkill().getBuiltIn() && Intrinsics.areEqual(it2.getSkill().getName(), importedSkillName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            Log.e("AGSkillManagerVM", "Error reading SKILL.md for built-in check", e);
            return false;
        }
    }

    public final void validateAndAddSkillFromLocalImport(Function0<Unit> onSuccess, Function1<? super String, Unit> onValidationError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onValidationError, "onValidationError");
        setValidating(true);
        setValidationError(null);
        Uri directoryUri = this._uiState.getValue().getImportDirectoryUri();
        if (directoryUri != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25341(directoryUri, this, onValidationError, onSuccess, null), 2, null);
            return;
        }
        setValidating(false);
        setValidationError("No directory URI set.");
        onValidationError.invoke("No directory URI set.");
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$validateAndAddSkillFromLocalImport$1", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Uri $directoryUri;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ Function1<String, Unit> $onValidationError;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SkillManagerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C25341(Uri uri, SkillManagerViewModel skillManagerViewModel, Function1<? super String, Unit> function1, Function0<Unit> function0, Continuation<? super C25341> continuation) {
            super(2, continuation);
            this.$directoryUri = uri;
            this.this$0 = skillManagerViewModel;
            this.$onValidationError = function1;
            this.$onSuccess = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25341 c25341 = new C25341(this.$directoryUri, this.this$0, this.$onValidationError, this.$onSuccess, continuation);
            c25341.L$0 = obj;
            return c25341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            DocumentFile documentFileFindFile;
            String text;
            Function0<Unit> function0;
            boolean z;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        Log.d("AGSkillManagerVM", "Validating skill from directory URI: " + this.$directoryUri);
                        DocumentFile rootFile = DocumentFile.fromTreeUri(this.this$0.context, this.$directoryUri);
                        if (rootFile != null) {
                            try {
                                documentFileFindFile = rootFile.findFile("SKILL.md");
                            } catch (Throwable th) {
                                th = th;
                            }
                        } else {
                            documentFileFindFile = null;
                        }
                        DocumentFile skillMdFile = documentFileFindFile;
                        try {
                            if (skillMdFile == null || !skillMdFile.exists()) {
                                this.this$0.setValidationError("SKILL.md not found in the selected directory.");
                                this.$onValidationError.invoke("SKILL.md not found in the selected directory.");
                                Unit unit = Unit.INSTANCE;
                                this.this$0.setValidating(false);
                                this.this$0.setImportDirectoryUri(null);
                                return unit;
                            }
                            try {
                                InputStream inputStreamOpenInputStream = this.this$0.context.getContentResolver().openInputStream(skillMdFile.getUri());
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        BufferedReader bufferedReader = inputStreamOpenInputStream;
                                        try {
                                            InputStream inputStream = bufferedReader;
                                            Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                                            bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                                            try {
                                                BufferedReader it = bufferedReader;
                                                text = TextStreamsKt.readText(it);
                                                CloseableKt.closeFinally(bufferedReader, null);
                                                CloseableKt.closeFinally(bufferedReader, null);
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        Log.e("AGSkillManagerVM", "Error reading SKILL.md", e);
                                        String error = "Failed to read SKILL.md: " + e.getMessage();
                                        this.this$0.setValidationError(error);
                                        this.$onValidationError.invoke(error);
                                        Unit unit2 = Unit.INSTANCE;
                                        this.this$0.setValidating(false);
                                        this.this$0.setImportDirectoryUri(null);
                                        return unit2;
                                    }
                                } else {
                                    text = null;
                                }
                                String mdContent = text == null ? "" : text;
                                Pair pairConvertSkillMdToProto$default = SkillManagerViewModel.convertSkillMdToProto$default(this.this$0, mdContent, false, true, null, null, 24, null);
                                Skill skillProto = (Skill) pairConvertSkillMdToProto$default.component1();
                                List errors = (List) pairConvertSkillMdToProto$default.component2();
                                if (!errors.isEmpty()) {
                                    String error2 = "Error parsing SKILL.md: " + CollectionsKt.joinToString$default(errors, ", ", null, null, 0, null, null, 62, null);
                                    this.this$0.setValidationError(error2);
                                    this.$onValidationError.invoke(error2);
                                    Unit unit3 = Unit.INSTANCE;
                                    this.this$0.setValidating(false);
                                    this.this$0.setImportDirectoryUri(null);
                                    return unit3;
                                }
                                if (skillProto != null) {
                                    SkillManagerViewModel skillManagerViewModel = this.this$0;
                                    Uri uri = this.$directoryUri;
                                    Function1<String, Unit> function1 = this.$onValidationError;
                                    Function0<Unit> function02 = this.$onSuccess;
                                    String originalImportDirName = SkillManagerViewModelKt.getDisplayName(skillManagerViewModel.context, uri);
                                    File destDir = skillManagerViewModel.getSkillDestinationDir(originalImportDirName);
                                    File filesDir = skillManagerViewModel.context.getFilesDir();
                                    Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
                                    String newImportDirName = FilesKt.relativeTo(destDir, filesDir).getPath();
                                    if (destDir.exists()) {
                                        function0 = function02;
                                        Log.d("AGSkillManagerVM", "Destination directory already exists, deleting: " + destDir.getPath());
                                        String name = skillProto.getName();
                                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                        skillManagerViewModel.deleteSkill(name);
                                    } else {
                                        function0 = function02;
                                    }
                                    if (!destDir.exists()) {
                                        destDir.mkdirs();
                                    }
                                    Iterable $this$any$iv = ((SkillManagerUiState) skillManagerViewModel._uiState.getValue()).getSkills();
                                    if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
                                        z = false;
                                    } else {
                                        Iterator it2 = $this$any$iv.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                Object element$iv = it2.next();
                                                SkillState curSkill = (SkillState) element$iv;
                                                Iterable $this$any$iv2 = $this$any$iv;
                                                if (Intrinsics.areEqual(curSkill.getSkill().getName(), skillProto.getName())) {
                                                    z = true;
                                                } else {
                                                    $this$any$iv = $this$any$iv2;
                                                }
                                            } else {
                                                z = false;
                                            }
                                        }
                                    }
                                    if (z) {
                                        skillManagerViewModel.setValidating(false);
                                        String error3 = "A skill with the name '" + skillProto.getName() + "' already exists.";
                                        skillManagerViewModel.setValidationError(error3);
                                        function1.invoke(error3);
                                        Unit unit4 = Unit.INSTANCE;
                                        this.this$0.setValidating(false);
                                        this.this$0.setImportDirectoryUri(null);
                                        return unit4;
                                    }
                                    DocumentFile sourceDocumentFile = DocumentFile.fromTreeUri(skillManagerViewModel.context, uri);
                                    if (sourceDocumentFile == null) {
                                        Log.e("AGSkillManagerVM", "Failed to get DocumentFile from URI: " + uri);
                                        skillManagerViewModel.setValidationError("Failed to access the selected directory.");
                                        function1.invoke("Failed to access the selected directory.");
                                        Unit unit5 = Unit.INSTANCE;
                                        this.this$0.setValidating(false);
                                        this.this$0.setImportDirectoryUri(null);
                                        return unit5;
                                    }
                                    invokeSuspend$lambda$6$copyDocumentFile(skillManagerViewModel, sourceDocumentFile, destDir);
                                    Skill skillWithDir = skillProto.toBuilder().setImportDirName(newImportDirName).build();
                                    Intrinsics.checkNotNull(skillWithDir);
                                    skillManagerViewModel.addSkill(skillWithDir, true);
                                    Log.d("AGSkillManagerVM", "Successfully added skill from local import: " + skillWithDir.getName());
                                    FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
                                    if (firebaseAnalytics != null) {
                                        String id = GalleryEvent.SKILL_MANAGEMENT.getId();
                                        Bundle $this$invokeSuspend_u24lambda_u246_u24lambda_u245 = new Bundle();
                                        $this$invokeSuspend_u24lambda_u246_u24lambda_u245.putString("action", "add");
                                        $this$invokeSuspend_u24lambda_u246_u24lambda_u245.putString("source", "local_import");
                                        $this$invokeSuspend_u24lambda_u246_u24lambda_u245.putString("skill_name", skillManagerViewModel.getSkillNameForLogging(skillWithDir));
                                        $this$invokeSuspend_u24lambda_u246_u24lambda_u245.putBoolean("is_built_in", skillWithDir.getBuiltIn());
                                        Unit unit6 = Unit.INSTANCE;
                                        firebaseAnalytics.logEvent(id, $this$invokeSuspend_u24lambda_u246_u24lambda_u245);
                                    }
                                    function0.invoke();
                                } else {
                                    SkillManagerViewModel skillManagerViewModel2 = this.this$0;
                                    Function1<String, Unit> function12 = this.$onValidationError;
                                    skillManagerViewModel2.setValidationError("Unknown error during SKILL.md conversion.");
                                    function12.invoke("Unknown error during SKILL.md conversion.");
                                }
                                this.this$0.setValidating(false);
                                this.this$0.setImportDirectoryUri(null);
                                return Unit.INSTANCE;
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    this.this$0.setValidating(false);
                    this.this$0.setImportDirectoryUri(null);
                    throw th;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        private static final void invokeSuspend$lambda$6$copyDocumentFile(SkillManagerViewModel this$0, DocumentFile source, File dest) {
            if (source.isDirectory()) {
                dest.mkdirs();
                for (DocumentFile child : source.listFiles()) {
                    String name = child.getName();
                    Intrinsics.checkNotNull(name);
                    File childDest = new File(dest, name);
                    Intrinsics.checkNotNull(child);
                    invokeSuspend$lambda$6$copyDocumentFile(this$0, child, childDest);
                }
                return;
            }
            if (source.isFile()) {
                try {
                    Log.d("AGSkillManagerVM", "Copying file " + source.getName() + " to " + dest.getPath());
                    InputStream inputStreamOpenInputStream = this$0.context.getContentResolver().openInputStream(source.getUri());
                    if (inputStreamOpenInputStream != null) {
                        FileOutputStream fileOutputStream = inputStreamOpenInputStream;
                        try {
                            InputStream inputStream = fileOutputStream;
                            fileOutputStream = new FileOutputStream(dest);
                            try {
                                FileOutputStream outputStream = fileOutputStream;
                                long jCopyTo$default = ByteStreamsKt.copyTo$default(inputStream, outputStream, 0, 2, null);
                                CloseableKt.closeFinally(fileOutputStream, null);
                                Long.valueOf(jCopyTo$default);
                                CloseableKt.closeFinally(fileOutputStream, null);
                            } finally {
                            }
                        } finally {
                        }
                    }
                } catch (Exception e) {
                    Log.e("AGSkillManagerVM", "Error copying file " + source.getName() + " to " + dest.getPath(), e);
                }
            }
        }
    }

    public final void setLoading(boolean loading) {
        SkillManagerUiState value;
        SkillManagerUiState currentState;
        MutableStateFlow<SkillManagerUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            currentState = value;
        } while (!mutableStateFlow.compareAndSet(value, currentState.copy((159 & 1) != 0 ? currentState.loading : loading, (159 & 2) != 0 ? currentState.skills : null, (159 & 4) != 0 ? currentState.validating : false, (159 & 8) != 0 ? currentState.validationError : null, (159 & 16) != 0 ? currentState.importDirectoryUri : null, (159 & 32) != 0 ? currentState.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState.featuredSkills : null, (159 & 128) != 0 ? currentState.skillAllowlistError : null)));
    }

    public final void setValidating(boolean validating) {
        SkillManagerUiState value;
        SkillManagerUiState currentState;
        MutableStateFlow<SkillManagerUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            currentState = value;
        } while (!mutableStateFlow.compareAndSet(value, currentState.copy((159 & 1) != 0 ? currentState.loading : false, (159 & 2) != 0 ? currentState.skills : null, (159 & 4) != 0 ? currentState.validating : validating, (159 & 8) != 0 ? currentState.validationError : null, (159 & 16) != 0 ? currentState.importDirectoryUri : null, (159 & 32) != 0 ? currentState.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState.featuredSkills : null, (159 & 128) != 0 ? currentState.skillAllowlistError : null)));
    }

    public final void setValidationError(String error) {
        SkillManagerUiState value;
        SkillManagerUiState currentState;
        MutableStateFlow<SkillManagerUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            currentState = value;
        } while (!mutableStateFlow.compareAndSet(value, currentState.copy((159 & 1) != 0 ? currentState.loading : false, (159 & 2) != 0 ? currentState.skills : null, (159 & 4) != 0 ? currentState.validating : false, (159 & 8) != 0 ? currentState.validationError : error, (159 & 16) != 0 ? currentState.importDirectoryUri : null, (159 & 32) != 0 ? currentState.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState.featuredSkills : null, (159 & 128) != 0 ? currentState.skillAllowlistError : null)));
    }

    public final void setImportDirectoryUri(Uri uri) {
        SkillManagerUiState value;
        SkillManagerUiState currentState;
        MutableStateFlow<SkillManagerUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            currentState = value;
        } while (!mutableStateFlow.compareAndSet(value, currentState.copy((159 & 1) != 0 ? currentState.loading : false, (159 & 2) != 0 ? currentState.skills : null, (159 & 4) != 0 ? currentState.validating : false, (159 & 8) != 0 ? currentState.validationError : null, (159 & 16) != 0 ? currentState.importDirectoryUri : uri, (159 & 32) != 0 ? currentState.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState.featuredSkills : null, (159 & 128) != 0 ? currentState.skillAllowlistError : null)));
    }

    public final void addSkill(Skill skill, boolean addToDataStore) {
        int $i$f$update;
        List newSkills;
        SkillManagerUiState skillManagerUiStateCopy;
        Intrinsics.checkNotNullParameter(skill, "skill");
        Log.d("AGSkillManagerVM", "Adding skill: " + skill);
        MutableStateFlow<SkillManagerUiState> mutableStateFlow = this._uiState;
        int $i$f$update2 = 0;
        while (true) {
            SkillManagerUiState value = mutableStateFlow.getValue();
            SkillManagerUiState currentState = value;
            SkillState newSkillState = new SkillState(skill);
            if (skill.getBuiltIn()) {
                $i$f$update = $i$f$update2;
                skillManagerUiStateCopy = currentState.copy((159 & 1) != 0 ? currentState.loading : false, (159 & 2) != 0 ? currentState.skills : CollectionsKt.plus((Collection<? extends SkillState>) currentState.getSkills(), newSkillState), (159 & 4) != 0 ? currentState.validating : false, (159 & 8) != 0 ? currentState.validationError : null, (159 & 16) != 0 ? currentState.importDirectoryUri : null, (159 & 32) != 0 ? currentState.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState.featuredSkills : null, (159 & 128) != 0 ? currentState.skillAllowlistError : null);
            } else {
                $i$f$update = $i$f$update2;
                int index$iv = 0;
                Iterator<SkillState> it = currentState.getSkills().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object item$iv = it.next();
                        SkillState it2 = (SkillState) item$iv;
                        if (!it2.getSkill().getBuiltIn()) {
                            break;
                        } else {
                            index$iv++;
                        }
                    } else {
                        index$iv = -1;
                        break;
                    }
                }
                int firstCustomIndex = index$iv;
                if (firstCustomIndex == -1) {
                    newSkills = CollectionsKt.plus((Collection<? extends SkillState>) currentState.getSkills(), newSkillState);
                } else {
                    List $this$addSkill_u24lambda_u2410_u24lambda_u249 = CollectionsKt.toMutableList((Collection) currentState.getSkills());
                    $this$addSkill_u24lambda_u2410_u24lambda_u249.add(firstCustomIndex, newSkillState);
                    newSkills = $this$addSkill_u24lambda_u2410_u24lambda_u249;
                }
                skillManagerUiStateCopy = currentState.copy((159 & 1) != 0 ? currentState.loading : false, (159 & 2) != 0 ? currentState.skills : newSkills, (159 & 4) != 0 ? currentState.validating : false, (159 & 8) != 0 ? currentState.validationError : null, (159 & 16) != 0 ? currentState.importDirectoryUri : null, (159 & 32) != 0 ? currentState.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState.featuredSkills : null, (159 & 128) != 0 ? currentState.skillAllowlistError : null);
            }
            if (mutableStateFlow.compareAndSet(value, skillManagerUiStateCopy)) {
                break;
            } else {
                $i$f$update2 = $i$f$update;
            }
        }
        if (addToDataStore) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25242(skill, null), 2, null);
        }
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$addSkill$2", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25242 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Skill $skill;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25242(Skill skill, Continuation<? super C25242> continuation) {
            super(2, continuation);
            this.$skill = skill;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SkillManagerViewModel.this.new C25242(this.$skill, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25242) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    SkillManagerViewModel.this.getDataStoreRepository().addSkill(this.$skill);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void deleteSkill(String name) {
        Object element$iv;
        SkillManagerUiState value;
        SkillManagerUiState currentState;
        Collection destination$iv$iv;
        Intrinsics.checkNotNullParameter(name, "name");
        Iterable $this$firstOrNull$iv = this._uiState.getValue().getSkills();
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (it.hasNext()) {
                element$iv = it.next();
                SkillState it2 = (SkillState) element$iv;
                if (Intrinsics.areEqual(it2.getSkill().getName(), name)) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        SkillState skillState = (SkillState) element$iv;
        Skill skill = skillState != null ? skillState.getSkill() : null;
        if (skill == null) {
            return;
        }
        String skillNameToLog = getSkillNameForLogging(skill);
        Log.d("AGSkillManagerVM", "Analytics: skill_management, action=delete, skill_name=" + skillNameToLog);
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            String id = GalleryEvent.SKILL_MANAGEMENT.getId();
            Bundle $this$deleteSkill_u24lambda_u2412 = new Bundle();
            $this$deleteSkill_u24lambda_u2412.putString("action", "delete");
            $this$deleteSkill_u24lambda_u2412.putString("skill_name", skillNameToLog);
            $this$deleteSkill_u24lambda_u2412.putBoolean("is_built_in", skill.getBuiltIn());
            Unit unit = Unit.INSTANCE;
            firebaseAnalytics.logEvent(id, $this$deleteSkill_u24lambda_u2412);
        }
        MutableStateFlow<SkillManagerUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            currentState = value;
            Iterable $this$filter$iv = currentState.getSkills();
            destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                SkillState it3 = (SkillState) element$iv$iv;
                if (!Intrinsics.areEqual(it3.getSkill().getName(), name)) {
                    destination$iv$iv.add(element$iv$iv);
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, currentState.copy((159 & 1) != 0 ? currentState.loading : false, (159 & 2) != 0 ? currentState.skills : (List) destination$iv$iv, (159 & 4) != 0 ? currentState.validating : false, (159 & 8) != 0 ? currentState.validationError : null, (159 & 16) != 0 ? currentState.importDirectoryUri : null, (159 & 32) != 0 ? currentState.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState.featuredSkills : null, (159 & 128) != 0 ? currentState.skillAllowlistError : null)));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25253(skill, this, name, null), 2, null);
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$deleteSkill$3", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25253 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $name;
        final /* synthetic */ Skill $skill;
        int label;
        final /* synthetic */ SkillManagerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25253(Skill skill, SkillManagerViewModel skillManagerViewModel, String str, Continuation<? super C25253> continuation) {
            super(2, continuation);
            this.$skill = skill;
            this.this$0 = skillManagerViewModel;
            this.$name = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25253(this.$skill, this.this$0, this.$name, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25253) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    String importDirName = this.$skill.getImportDirName();
                    Intrinsics.checkNotNullExpressionValue(importDirName, "getImportDirName(...)");
                    if (importDirName.length() > 0) {
                        try {
                            File filesDir = this.this$0.context.getFilesDir();
                            Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
                            String importDirName2 = this.$skill.getImportDirName();
                            Intrinsics.checkNotNullExpressionValue(importDirName2, "getImportDirName(...)");
                            File skillDir = FilesKt.resolve(filesDir, importDirName2);
                            Boxing.boxBoolean(FilesKt.deleteRecursively(skillDir));
                        } catch (Exception e) {
                            Boxing.boxInt(Log.w("AGSkillManagerVM", "Failed to delete skill directory: " + this.$skill.getImportDirName(), e));
                        }
                        break;
                    }
                    this.this$0.getDataStoreRepository().deleteSkill(this.$name);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void deleteSkills(Set<String> names) {
        SkillManagerUiState value;
        SkillManagerUiState currentState;
        Collection destination$iv$iv;
        Intrinsics.checkNotNullParameter(names, "names");
        Iterable $this$filter$iv = this._uiState.getValue().getSkills();
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            SkillState it = (SkillState) element$iv$iv;
            if (names.contains(it.getSkill().getName())) {
                destination$iv$iv2.add(element$iv$iv);
            }
        }
        Iterable $this$map$iv = (List) destination$iv$iv2;
        Collection destination$iv$iv3 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            SkillState it2 = (SkillState) item$iv$iv;
            destination$iv$iv3.add(it2.getSkill());
        }
        List<Skill> skillsToDelete = (List) destination$iv$iv3;
        if (skillsToDelete.isEmpty()) {
            return;
        }
        for (Skill skill : skillsToDelete) {
            Log.d("AGSkillManagerVM", "Analytics: skill_management, action=delete, skill_name=" + getSkillNameForLogging(skill));
            FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
            if (firebaseAnalytics != null) {
                String id = GalleryEvent.SKILL_MANAGEMENT.getId();
                Bundle $this$deleteSkills_u24lambda_u2417 = new Bundle();
                $this$deleteSkills_u24lambda_u2417.putString("action", "delete");
                $this$deleteSkills_u24lambda_u2417.putString("skill_name", getSkillNameForLogging(skill));
                $this$deleteSkills_u24lambda_u2417.putBoolean("is_built_in", skill.getBuiltIn());
                Unit unit = Unit.INSTANCE;
                firebaseAnalytics.logEvent(id, $this$deleteSkills_u24lambda_u2417);
            }
        }
        MutableStateFlow<SkillManagerUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            currentState = value;
            Iterable $this$filter$iv2 = currentState.getSkills();
            destination$iv$iv = new ArrayList();
            for (Object element$iv$iv2 : $this$filter$iv2) {
                SkillState it3 = (SkillState) element$iv$iv2;
                if (!names.contains(it3.getSkill().getName())) {
                    destination$iv$iv.add(element$iv$iv2);
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, currentState.copy((159 & 1) != 0 ? currentState.loading : false, (159 & 2) != 0 ? currentState.skills : (List) destination$iv$iv, (159 & 4) != 0 ? currentState.validating : false, (159 & 8) != 0 ? currentState.validationError : null, (159 & 16) != 0 ? currentState.importDirectoryUri : null, (159 & 32) != 0 ? currentState.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState.featuredSkills : null, (159 & 128) != 0 ? currentState.skillAllowlistError : null)));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25273(skillsToDelete, this, names, null), 2, null);
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$deleteSkills$3", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {679}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25273 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Set<String> $names;
        final /* synthetic */ List<Skill> $skillsToDelete;
        int label;
        final /* synthetic */ SkillManagerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25273(List<Skill> list, SkillManagerViewModel skillManagerViewModel, Set<String> set, Continuation<? super C25273> continuation) {
            super(2, continuation);
            this.$skillsToDelete = list;
            this.this$0 = skillManagerViewModel;
            this.$names = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25273(this.$skillsToDelete, this.this$0, this.$names, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25273) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Iterator<Skill> it = this.$skillsToDelete.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Skill skill = it.next();
                            String importDirName = skill.getImportDirName();
                            Intrinsics.checkNotNullExpressionValue(importDirName, "getImportDirName(...)");
                            if (importDirName.length() > 0) {
                                try {
                                    File filesDir = this.this$0.context.getFilesDir();
                                    Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
                                    String importDirName2 = skill.getImportDirName();
                                    Intrinsics.checkNotNullExpressionValue(importDirName2, "getImportDirName(...)");
                                    File skillDir = FilesKt.resolve(filesDir, importDirName2);
                                    Boxing.boxBoolean(FilesKt.deleteRecursively(skillDir));
                                } catch (Exception e) {
                                    Boxing.boxInt(Log.w("AGSkillManagerVM", "Failed to delete skill directory: " + skill.getImportDirName(), e));
                                }
                            }
                        } else {
                            this.label = 1;
                            if (this.this$0.getDataStoreRepository().deleteSkills(this.$names, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
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

    public final void setSkillSelected(SkillState skill, boolean selected) {
        SkillManagerUiState value;
        SkillManagerUiState currentState;
        SkillState skillState;
        Intrinsics.checkNotNullParameter(skill, "skill");
        Skill updatedSkill = skill.getSkill().toBuilder().setSelected(selected).build();
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            String id = GalleryEvent.SKILL_MANAGEMENT.getId();
            Bundle $this$setSkillSelected_u24lambda_u2420 = new Bundle();
            $this$setSkillSelected_u24lambda_u2420.putString("action", selected ? "enable" : "disable");
            $this$setSkillSelected_u24lambda_u2420.putString("skill_name", getSkillNameForLogging(skill.getSkill()));
            $this$setSkillSelected_u24lambda_u2420.putBoolean("is_built_in", skill.getSkill().getBuiltIn());
            Unit unit = Unit.INSTANCE;
            firebaseAnalytics.logEvent(id, $this$setSkillSelected_u24lambda_u2420);
        }
        Iterable $this$map$iv = this._uiState.getValue().getSkills();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            SkillState curSkill = (SkillState) item$iv$iv;
            if (Intrinsics.areEqual(curSkill.getSkill().getName(), skill.getSkill().getName())) {
                Intrinsics.checkNotNull(updatedSkill);
                skillState = new SkillState(updatedSkill);
            } else {
                skillState = curSkill;
            }
            destination$iv$iv.add(skillState);
        }
        List updatedSkills = (List) destination$iv$iv;
        MutableStateFlow<SkillManagerUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            currentState = value;
        } while (!mutableStateFlow.compareAndSet(value, currentState.copy((159 & 1) != 0 ? currentState.loading : false, (159 & 2) != 0 ? currentState.skills : updatedSkills, (159 & 4) != 0 ? currentState.validating : false, (159 & 8) != 0 ? currentState.validationError : null, (159 & 16) != 0 ? currentState.importDirectoryUri : null, (159 & 32) != 0 ? currentState.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState.featuredSkills : null, (159 & 128) != 0 ? currentState.skillAllowlistError : null)));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25333(skill, selected, null), 2, null);
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$setSkillSelected$3", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25333 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $selected;
        final /* synthetic */ SkillState $skill;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25333(SkillState skillState, boolean z, Continuation<? super C25333> continuation) {
            super(2, continuation);
            this.$skill = skillState;
            this.$selected = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SkillManagerViewModel.this.new C25333(this.$skill, this.$selected, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25333) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    SkillManagerViewModel.this.getDataStoreRepository().setSkillSelected(this.$skill.getSkill(), this.$selected);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void setAllSkillsSelected(boolean selected) {
        MutableStateFlow<SkillManagerUiState> mutableStateFlow = this._uiState;
        int $i$f$update = 0;
        while (true) {
            SkillManagerUiState value = mutableStateFlow.getValue();
            SkillManagerUiState currentState = value;
            Iterable $this$map$iv = currentState.getSkills();
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                SkillState skillState = (SkillState) item$iv$iv;
                Skill skillBuild = skillState.getSkill().toBuilder().setSelected(selected).build();
                Intrinsics.checkNotNullExpressionValue(skillBuild, "build(...)");
                destination$iv$iv.add(new SkillState(skillBuild));
                $i$f$update = $i$f$update;
            }
            int $i$f$update2 = $i$f$update;
            List updatedSkills = (List) destination$iv$iv;
            if (mutableStateFlow.compareAndSet(value, currentState.copy((159 & 1) != 0 ? currentState.loading : false, (159 & 2) != 0 ? currentState.skills : updatedSkills, (159 & 4) != 0 ? currentState.validating : false, (159 & 8) != 0 ? currentState.validationError : null, (159 & 16) != 0 ? currentState.importDirectoryUri : null, (159 & 32) != 0 ? currentState.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState.featuredSkills : null, (159 & 128) != 0 ? currentState.skillAllowlistError : null))) {
                break;
            } else {
                $i$f$update = $i$f$update2;
            }
        }
        Log.d("AGSkillManagerVM", "Analytics: skill_management, action=" + (selected ? "enable_all" : "disable_all"));
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            String id = GalleryEvent.SKILL_MANAGEMENT.getId();
            Bundle $this$setAllSkillsSelected_u24lambda_u2425 = new Bundle();
            $this$setAllSkillsSelected_u24lambda_u2425.putString("action", selected ? "enable_all" : "disable_all");
            Unit unit = Unit.INSTANCE;
            firebaseAnalytics.logEvent(id, $this$setAllSkillsSelected_u24lambda_u2425);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25323(selected, null), 2, null);
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$setAllSkillsSelected$3", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25323 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $selected;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25323(boolean z, Continuation<? super C25323> continuation) {
            super(2, continuation);
            this.$selected = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SkillManagerViewModel.this.new C25323(this.$selected, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25323) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    SkillManagerViewModel.this.getDataStoreRepository().setAllSkillsSelected(this.$selected);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final List<Skill> getSelectedSkills() {
        Iterable $this$filter$iv = this._uiState.getValue().getSkills();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            SkillState it = (SkillState) element$iv$iv;
            if (it.getSkill().getSelected()) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$map$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            SkillState it2 = (SkillState) item$iv$iv;
            destination$iv$iv2.add(it2.getSkill());
        }
        return (List) destination$iv$iv2;
    }

    public final Contents getSystemPrompt(String baseSystemPrompt) {
        Intrinsics.checkNotNullParameter(baseSystemPrompt, "baseSystemPrompt");
        String selectedSkillsNamesAndDescriptions = getSelectedSkillsNamesAndDescriptions();
        String systemPrompt = StringsKt.replace$default(baseSystemPrompt, "___SKILLS___", selectedSkillsNamesAndDescriptions, false, 4, (Object) null);
        Log.d("AGSkillManagerVM", "System prompt:\n" + systemPrompt);
        return Contents.INSTANCE.m595of(systemPrompt);
    }

    public final Skill getSkill(String name) {
        Object element$iv;
        Intrinsics.checkNotNullParameter(name, "name");
        Iterable $this$firstOrNull$iv = this._uiState.getValue().getSkills();
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (it.hasNext()) {
                element$iv = it.next();
                SkillState it2 = (SkillState) element$iv;
                if (Intrinsics.areEqual(it2.getSkill().getName(), name)) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        SkillState skillState = (SkillState) element$iv;
        if (skillState != null) {
            return skillState.getSkill();
        }
        return null;
    }

    public final String getJsSkillUrl(String skillName, String scriptName) {
        Intrinsics.checkNotNullParameter(skillName, "skillName");
        Intrinsics.checkNotNullParameter(scriptName, "scriptName");
        Skill skill = getSkill(skillName);
        if (skill == null) {
            return null;
        }
        String baseUrl = "";
        String importDirName = skill.getImportDirName();
        Intrinsics.checkNotNullExpressionValue(importDirName, "getImportDirName(...)");
        if (importDirName.length() > 0) {
            baseUrl = "https://appassets.androidplatform.net/" + skill.getImportDirName();
        } else {
            String skillUrl = skill.getSkillUrl();
            Intrinsics.checkNotNullExpressionValue(skillUrl, "getSkillUrl(...)");
            if (skillUrl.length() > 0) {
                String skillUrl2 = skill.getSkillUrl();
                Intrinsics.checkNotNullExpressionValue(skillUrl2, "getSkillUrl(...)");
                baseUrl = skillUrl2;
            }
        }
        if (baseUrl.length() == 0) {
            return null;
        }
        return baseUrl + "/scripts/" + scriptName;
    }

    public final String getJsSkillWebviewUrl(String skillName, String url) {
        Intrinsics.checkNotNullParameter(skillName, "skillName");
        Intrinsics.checkNotNullParameter(url, "url");
        Skill skill = getSkill(skillName);
        if (skill == null) {
            return url;
        }
        if (StringsKt.startsWith$default(url, ProxyConfig.MATCH_HTTP, false, 2, (Object) null)) {
            return url;
        }
        String baseUrl = "";
        String importDirName = skill.getImportDirName();
        Intrinsics.checkNotNullExpressionValue(importDirName, "getImportDirName(...)");
        if (importDirName.length() > 0) {
            baseUrl = "https://appassets.androidplatform.net/" + skill.getImportDirName();
        } else {
            String skillUrl = skill.getSkillUrl();
            Intrinsics.checkNotNullExpressionValue(skillUrl, "getSkillUrl(...)");
            if (skillUrl.length() > 0) {
                String skillUrl2 = skill.getSkillUrl();
                Intrinsics.checkNotNullExpressionValue(skillUrl2, "getSkillUrl(...)");
                baseUrl = skillUrl2;
            }
        }
        if (baseUrl.length() == 0) {
            return url;
        }
        return baseUrl + "/assets/" + url;
    }

    public final String getSelectedSkillsNamesAndDescriptions() {
        return CollectionsKt.joinToString$default(getSelectedSkills(), "\n", null, null, 0, null, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SkillManagerViewModel.getSelectedSkillsNamesAndDescriptions$lambda$29((Skill) obj);
            }
        }, 30, null);
    }

    
    public static final CharSequence getSelectedSkillsNamesAndDescriptions$lambda$29(Skill skill) {
        Intrinsics.checkNotNullParameter(skill, "skill");
        return "- " + skill.getName() + ": " + skill.getDescription();
    }

    public static /* synthetic */ Pair convertSkillMdToProto$default(SkillManagerViewModel skillManagerViewModel, String str, boolean z, boolean z2, String str2, String str3, int i, Object obj) {
        String str4;
        String str5;
        if ((i & 8) == 0) {
            str4 = str2;
        } else {
            str4 = "";
        }
        if ((i & 16) == 0) {
            str5 = str3;
        } else {
            str5 = "";
        }
        return skillManagerViewModel.convertSkillMdToProto(str, z, z2, str4, str5);
    }

    public final Pair<Skill, List<String>> convertSkillMdToProto(String mdContent, boolean builtIn, boolean selected, String skillUrl, String importDir) {
        String header;
        Intrinsics.checkNotNullParameter(mdContent, "mdContent");
        Intrinsics.checkNotNullParameter(skillUrl, "skillUrl");
        Intrinsics.checkNotNullParameter(importDir, "importDir");
        List parts = StringsKt.split$default((CharSequence) mdContent, new String[]{"---"}, false, 0, 6, (Object) null);
        List errors = new ArrayList();
        if (parts.size() < 3) {
            errors.add("Invalid format: Expected at least two '---' sections.");
            return new Pair<>(null, errors);
        }
        String header2 = StringsKt.trim((CharSequence) parts.get(1)).toString();
        String name = null;
        String description = null;
        boolean requireSecret = false;
        String requireSecretDescription = "";
        String homepage = null;
        boolean startMetadata = false;
        for (String line : StringsKt.lines(header2)) {
            String trimmedLine = StringsKt.trim((CharSequence) line).toString();
            if (Intrinsics.areEqual(trimmedLine, "metadata:")) {
                startMetadata = true;
            } else if (!startMetadata) {
                header = header2;
                if (StringsKt.startsWith$default(trimmedLine, "name:", false, 2, (Object) null)) {
                    name = StringsKt.trim((CharSequence) StringsKt.substringAfter$default(trimmedLine, "name:", (String) null, 2, (Object) null)).toString();
                    header2 = header;
                } else if (StringsKt.startsWith$default(trimmedLine, "description:", false, 2, (Object) null)) {
                    description = StringsKt.trim((CharSequence) StringsKt.substringAfter$default(trimmedLine, "description:", (String) null, 2, (Object) null)).toString();
                    header2 = header;
                } else {
                    header2 = header;
                }
            } else {
                header = header2;
                if (StringsKt.startsWith$default(trimmedLine, "require-secret:", false, 2, (Object) null)) {
                    requireSecret = Boolean.parseBoolean(StringsKt.trim((CharSequence) StringsKt.substringAfter$default(trimmedLine, "require-secret:", (String) null, 2, (Object) null)).toString());
                    header2 = header;
                } else if (StringsKt.startsWith$default(trimmedLine, "require-secret-description:", false, 2, (Object) null)) {
                    requireSecretDescription = StringsKt.trim((CharSequence) StringsKt.substringAfter$default(trimmedLine, "require-secret-description:", (String) null, 2, (Object) null)).toString();
                    header2 = header;
                } else if (StringsKt.startsWith$default(trimmedLine, "homepage:", false, 2, (Object) null)) {
                    homepage = StringsKt.trim((CharSequence) StringsKt.substringAfter$default(trimmedLine, "homepage:", (String) null, 2, (Object) null)).toString();
                    header2 = header;
                } else {
                    header2 = header;
                }
            }
        }
        String str = name;
        if (str == null || str.length() == 0) {
            errors.add("Missing or empty 'name' in the header.");
        }
        String str2 = description;
        if (str2 == null || str2.length() == 0) {
            errors.add("Missing or empty 'description' in the header.");
        }
        String instructions = StringsKt.trim((CharSequence) CollectionsKt.joinToString$default(CollectionsKt.drop(parts, 2), "---", null, null, 0, null, null, 62, null)).toString();
        if (!errors.isEmpty()) {
            return new Pair<>(null, errors);
        }
        Skill.Builder builderNewBuilder = Skill.newBuilder();
        Intrinsics.checkNotNull(name);
        Skill.Builder name2 = builderNewBuilder.setName(name);
        Intrinsics.checkNotNull(description);
        Skill skill = name2.setDescription(description).setInstructions(instructions).setBuiltIn(builtIn).setSelected(selected).setSkillUrl(skillUrl).setRequireSecret(requireSecret).setRequireSecretDescription(requireSecretDescription).setHomepage(homepage == null ? "" : homepage).setImportDirName(importDir).build();
        return new Pair<>(skill, CollectionsKt.emptyList());
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$saveSkillEdit$1", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $description;
        final /* synthetic */ int $index;
        final /* synthetic */ String $instructions;
        final /* synthetic */ String $name;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ Map<String, String> $scriptsContent;
        int label;
        final /* synthetic */ SkillManagerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C25311(String str, int i, SkillManagerViewModel skillManagerViewModel, Function1<? super String, Unit> function1, String str2, String str3, Map<String, String> map, Function0<Unit> function0, Continuation<? super C25311> continuation) {
            super(2, continuation);
            this.$name = str;
            this.$index = i;
            this.this$0 = skillManagerViewModel;
            this.$onError = function1;
            this.$description = str2;
            this.$instructions = str3;
            this.$scriptsContent = map;
            this.$onSuccess = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25311(this.$name, this.$index, this.this$0, this.$onError, this.$description, this.$instructions, this.$scriptsContent, this.$onSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            SkillState skillState;
            boolean z;
            boolean z2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        Log.d("AGSkillManagerVM", "saveSkillEdit: " + this.$name);
                        boolean isNewSkill = this.$index < 0 || this.$index >= ((SkillManagerUiState) this.this$0._uiState.getValue()).getSkills().size();
                        if (isNewSkill) {
                            Log.d("AGSkillManagerVM", "Saving new skill: " + this.$name);
                            Iterable $this$any$iv = ((SkillManagerUiState) this.this$0._uiState.getValue()).getSkills();
                            String str = this.$name;
                            if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
                                z2 = false;
                            } else {
                                Iterator it = $this$any$iv.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object element$iv = it.next();
                                        SkillState it2 = (SkillState) element$iv;
                                        if (Intrinsics.areEqual(it2.getSkill().getName(), str)) {
                                            z2 = true;
                                        }
                                    } else {
                                        z2 = false;
                                    }
                                }
                            }
                            if (z2) {
                                String error = "A skill with the name '" + this.$name + "' already exists.";
                                Log.w("AGSkillManagerVM", error);
                                this.$onError.invoke(error);
                                return Unit.INSTANCE;
                            }
                            String normalizedName = new Regex("\\s+").replace(this.$name, "-");
                            File filesDir = this.this$0.context.getFilesDir();
                            Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
                            File skillDestDir = FilesKt.resolve(filesDir, "skills/" + normalizedName);
                            File scriptDestDir = new File(skillDestDir, "scripts");
                            if (skillDestDir.exists()) {
                                Log.w("AGSkillManagerVM", "Skill destination directory already exists for new skill: " + skillDestDir.getPath() + ", deleting.");
                                FilesKt.deleteRecursively(skillDestDir);
                            }
                            skillDestDir.mkdirs();
                            scriptDestDir.mkdirs();
                            File skillMdFile = new File(skillDestDir, "SKILL.md");
                            this.this$0.writeSkillMd(skillMdFile, normalizedName, this.$description, this.$instructions);
                            this.this$0.saveScripts(scriptDestDir, this.$scriptsContent);
                            Skill.Builder skillUrl = Skill.newBuilder().setName(normalizedName).setDescription(this.$description).setInstructions(this.$instructions).setBuiltIn(false).setSelected(true).setSkillUrl("");
                            File filesDir2 = this.this$0.context.getFilesDir();
                            Intrinsics.checkNotNullExpressionValue(filesDir2, "getFilesDir(...)");
                            Skill newSkill = skillUrl.setImportDirName(FilesKt.relativeTo(skillDestDir, filesDir2).getPath()).build();
                            SkillManagerViewModel skillManagerViewModel = this.this$0;
                            Intrinsics.checkNotNull(newSkill);
                            skillManagerViewModel.addSkill(newSkill, true);
                            this.$onSuccess.invoke();
                        } else {
                            Log.d("AGSkillManagerVM", "Saving skill edit: " + this.$name);
                            SkillState existingSkillState = ((SkillManagerUiState) this.this$0._uiState.getValue()).getSkills().get(this.$index);
                            Skill existingSkill = existingSkillState.getSkill();
                            String oldName = existingSkill.getName();
                            String normalizedNewName = new Regex("\\s+").replace(this.$name, "-");
                            File filesDir3 = this.this$0.context.getFilesDir();
                            Intrinsics.checkNotNullExpressionValue(filesDir3, "getFilesDir(...)");
                            File newSkillDestDir = FilesKt.resolve(filesDir3, "skills/" + normalizedNewName);
                            File newScriptDestDir = new File(newSkillDestDir, "scripts");
                            File newSkillMdFile = new File(newSkillDestDir, "SKILL.md");
                            if (existingSkill.getBuiltIn()) {
                                this.$onError.invoke("Cannot edit built-in skills.");
                                return Unit.INSTANCE;
                            }
                            String updatedImportDirName = existingSkill.getImportDirName();
                            if (!Intrinsics.areEqual(oldName, normalizedNewName)) {
                                Log.d("AGSkillManagerVM", "Renaming skill from " + oldName + " to " + normalizedNewName);
                                Iterable $this$any$iv2 = ((SkillManagerUiState) this.this$0._uiState.getValue()).getSkills();
                                if (($this$any$iv2 instanceof Collection) && ((Collection) $this$any$iv2).isEmpty()) {
                                    z = false;
                                } else {
                                    Iterator it3 = $this$any$iv2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            Object element$iv2 = it3.next();
                                            SkillState it4 = (SkillState) element$iv2;
                                            Iterator it5 = it3;
                                            if (Intrinsics.areEqual(it4.getSkill().getName(), normalizedNewName)) {
                                                z = true;
                                            } else {
                                                it3 = it5;
                                            }
                                        } else {
                                            z = false;
                                        }
                                    }
                                }
                                if (!z) {
                                    File filesDir4 = this.this$0.context.getFilesDir();
                                    Intrinsics.checkNotNullExpressionValue(filesDir4, "getFilesDir(...)");
                                    String importDirName = existingSkill.getImportDirName();
                                    Intrinsics.checkNotNullExpressionValue(importDirName, "getImportDirName(...)");
                                    File oldSkillDestDir = FilesKt.resolve(filesDir4, importDirName);
                                    if (oldSkillDestDir.exists()) {
                                        Log.d("AGSkillManagerVM", "Renaming directory from " + oldSkillDestDir.getPath() + " to " + newSkillDestDir.getPath());
                                        if (oldSkillDestDir.renameTo(newSkillDestDir)) {
                                            File filesDir5 = this.this$0.context.getFilesDir();
                                            Intrinsics.checkNotNullExpressionValue(filesDir5, "getFilesDir(...)");
                                            updatedImportDirName = FilesKt.relativeTo(newSkillDestDir, filesDir5).getPath();
                                        } else {
                                            String error2 = "Failed to rename skill directory from " + oldSkillDestDir.getName() + " to " + newSkillDestDir.getName() + ".";
                                            Log.e("AGSkillManagerVM", error2);
                                            this.$onError.invoke(error2);
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        Log.w("AGSkillManagerVM", "Old skill directory not found: " + oldSkillDestDir.getPath());
                                        Boxing.boxBoolean(newSkillDestDir.mkdirs());
                                    }
                                } else {
                                    String error3 = "A skill with the name '" + normalizedNewName + "' already exists.";
                                    Log.w("AGSkillManagerVM", error3);
                                    this.$onError.invoke(error3);
                                    return Unit.INSTANCE;
                                }
                            }
                            this.this$0.writeSkillMd(newSkillMdFile, normalizedNewName, this.$description, this.$instructions);
                            FilesKt.deleteRecursively(newScriptDestDir);
                            newScriptDestDir.mkdirs();
                            this.this$0.saveScripts(newScriptDestDir, this.$scriptsContent);
                            Skill updatedSkill = existingSkill.toBuilder().setName(normalizedNewName).setDescription(this.$description).setInstructions(this.$instructions).setImportDirName(updatedImportDirName).build();
                            MutableStateFlow $this$update$iv = this.this$0._uiState;
                            int i = this.$index;
                            while (true) {
                                Object prevValue$iv = $this$update$iv.getValue();
                                SkillManagerUiState currentState = (SkillManagerUiState) prevValue$iv;
                                Iterable $this$mapIndexed$iv = currentState.getSkills();
                                String normalizedNewName2 = normalizedNewName;
                                Skill existingSkill2 = existingSkill;
                                Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed$iv, 10));
                                Iterable $this$mapIndexedTo$iv$iv = $this$mapIndexed$iv;
                                int index$iv$iv = 0;
                                for (Object item$iv$iv : $this$mapIndexedTo$iv$iv) {
                                    int index$iv$iv2 = index$iv$iv + 1;
                                    if (index$iv$iv < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    SkillState skillState2 = (SkillState) item$iv$iv;
                                    Iterable $this$mapIndexedTo$iv$iv2 = $this$mapIndexedTo$iv$iv;
                                    int i2 = index$iv$iv;
                                    if (i2 == i) {
                                        Intrinsics.checkNotNull(updatedSkill);
                                        skillState = new SkillState(updatedSkill);
                                    } else {
                                        skillState = skillState2;
                                    }
                                    destination$iv$iv.add(skillState);
                                    index$iv$iv = index$iv$iv2;
                                    $this$mapIndexedTo$iv$iv = $this$mapIndexedTo$iv$iv2;
                                }
                                List updatedSkillsList = (List) destination$iv$iv;
                                if ($this$update$iv.compareAndSet(prevValue$iv, currentState.copy((159 & 1) != 0 ? currentState.loading : false, (159 & 2) != 0 ? currentState.skills : updatedSkillsList, (159 & 4) != 0 ? currentState.validating : false, (159 & 8) != 0 ? currentState.validationError : null, (159 & 16) != 0 ? currentState.importDirectoryUri : null, (159 & 32) != 0 ? currentState.loadingSkillAllowlist : false, (159 & 64) != 0 ? currentState.featuredSkills : null, (159 & 128) != 0 ? currentState.skillAllowlistError : null))) {
                                    SkillManagerViewModel skillManagerViewModel2 = this.this$0;
                                    Intrinsics.checkNotNull(oldName);
                                    Intrinsics.checkNotNull(updatedSkill);
                                    skillManagerViewModel2.updateSkillInDataStore(oldName, updatedSkill);
                                    this.$onSuccess.invoke();
                                } else {
                                    normalizedNewName = normalizedNewName2;
                                    existingSkill = existingSkill2;
                                }
                            }
                        }
                    } catch (Exception e) {
                        Log.e("AGSkillManagerVM", "Error saving skill edit", e);
                        this.$onError.invoke("Failed to save skill: " + e.getMessage());
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void saveSkillEdit(int index, String name, String description, String instructions, Map<String, String> scriptsContent, Function0<Unit> onSuccess, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        Intrinsics.checkNotNullParameter(scriptsContent, "scriptsContent");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25311(name, index, this, onError, description, instructions, scriptsContent, onSuccess, null), 2, null);
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$loadSkillScriptsContent$1", m932f = "SkillManagerViewModel.kt", m933i = {1, 1, 2, 2, 2}, m934l = {1062, 1071, 1088}, m935m = "invokeSuspend", m936n = {"skillDir", "scriptDir", "skillDir", "scriptDir", "scriptsContent"}, m938s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C25291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Map<String, String>, Unit> $onDone;
        final /* synthetic */ Skill $skill;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SkillManagerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C25291(Skill skill, SkillManagerViewModel skillManagerViewModel, Function1<? super Map<String, String>, Unit> function1, Continuation<? super C25291> continuation) {
            super(2, continuation);
            this.$skill = skill;
            this.this$0 = skillManagerViewModel;
            this.$onDone = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25291(this.$skill, this.this$0, this.$onDone, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 542
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel.C25291.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        
        
        
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$loadSkillScriptsContent$1$1", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Map<String, String>, Unit> $onDone;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function1<? super Map<String, String>, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$onDone = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$onDone, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.$onDone.invoke(MapsKt.emptyMap());
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        
        
        
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$loadSkillScriptsContent$1$2", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Map<String, String>, Unit> $onDone;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function1<? super Map<String, String>, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$onDone = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$onDone, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.$onDone.invoke(MapsKt.emptyMap());
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        
        
        
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$loadSkillScriptsContent$1$3", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Map<String, String>, Unit> $onDone;
            final /* synthetic */ Map<String, String> $scriptsContent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Function1<? super Map<String, String>, Unit> function1, Map<String, String> map, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$onDone = function1;
                this.$scriptsContent = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$onDone, this.$scriptsContent, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.$onDone.invoke(this.$scriptsContent);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void loadSkillScriptsContent(Skill skill, Function1<? super Map<String, String>, Unit> onDone) {
        Intrinsics.checkNotNullParameter(skill, "skill");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25291(skill, this, onDone, null), 2, null);
    }

    public final void deleteSkillScript(Skill skill, String scriptName) {
        Intrinsics.checkNotNullParameter(skill, "skill");
        Intrinsics.checkNotNullParameter(scriptName, "scriptName");
        String importDirName = skill.getImportDirName();
        Intrinsics.checkNotNullExpressionValue(importDirName, "getImportDirName(...)");
        if (!(importDirName.length() == 0)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25261(skill, scriptName, null), 2, null);
        } else {
            Log.d("AGSkillManagerVM", "Skill " + skill.getName() + " is not locally imported, cannot delete script.");
        }
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$deleteSkillScript$1", m932f = "SkillManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $scriptName;
        final /* synthetic */ Skill $skill;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25261(Skill skill, String str, Continuation<? super C25261> continuation) {
            super(2, continuation);
            this.$skill = skill;
            this.$scriptName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SkillManagerViewModel.this.new C25261(this.$skill, this.$scriptName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    File filesDir = SkillManagerViewModel.this.context.getFilesDir();
                    Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
                    String importDirName = this.$skill.getImportDirName();
                    Intrinsics.checkNotNullExpressionValue(importDirName, "getImportDirName(...)");
                    File skillDir = FilesKt.resolve(filesDir, importDirName);
                    File scriptDir = new File(skillDir, "scripts");
                    File scriptFile = new File(scriptDir, this.$scriptName);
                    if (scriptFile.exists()) {
                        try {
                            if (scriptFile.delete()) {
                                Log.d("AGSkillManagerVM", "Successfully deleted script: " + scriptFile.getPath());
                            } else {
                                Log.w("AGSkillManagerVM", "Failed to delete script: " + scriptFile.getPath());
                            }
                        } catch (Exception e) {
                            Log.e("AGSkillManagerVM", "Error deleting script " + scriptFile.getPath(), e);
                        }
                        break;
                    } else {
                        Log.d("AGSkillManagerVM", "Script file not found, ignoring delete: " + scriptFile.getPath());
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final boolean isSkillSelected(String skillName) {
        Object element$iv;
        Skill skill;
        Intrinsics.checkNotNullParameter(skillName, "skillName");
        Iterable $this$firstOrNull$iv = this._uiState.getValue().getSkills();
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (it.hasNext()) {
                element$iv = it.next();
                SkillState it2 = (SkillState) element$iv;
                if (Intrinsics.areEqual(it2.getSkill().getName(), skillName)) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        SkillState skillState = (SkillState) element$iv;
        return (skillState == null || (skill = skillState.getSkill()) == null || !skill.getSelected()) ? false : true;
    }

    
    public final void writeSkillMd(File skillMdFile, String name, String description, String instructions) {
        Log.d("AGSkillManagerVM", "Writing skill.md: " + skillMdFile.getPath());
        String mdContent = StringsKt.trimIndent("\n    ---\n    name: " + name + "\n    description: " + description + "\n    ---\n\n    " + instructions + "\n    ");
        FilesKt.writeText$default(skillMdFile, mdContent, null, 2, null);
    }

    
    public final void saveScripts(File scriptDestDir, Map<String, String> scriptsContent) {
        scriptDestDir.mkdirs();
        File[] fileArrListFiles = scriptDestDir.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }
        for (Map.Entry<String, String> entry : scriptsContent.entrySet()) {
            String scriptName = entry.getKey();
            String content = entry.getValue();
            File scriptFile = new File(scriptDestDir, scriptName);
            Log.d("AGSkillManagerVM", "Saving script: " + scriptFile.getPath());
            try {
                FilesKt.writeText$default(scriptFile, content, null, 2, null);
                Log.d("AGSkillManagerVM", "Saved script: " + scriptFile.getPath());
            } catch (Exception e) {
                Log.e("AGSkillManagerVM", "Error saving script " + scriptName + " to " + scriptFile.getPath(), e);
            }
        }
    }

    
    public final void updateSkillInDataStore(String oldName, Skill updatedSkill) {
        Iterable $this$map$iv = this.dataStoreRepository.getAllSkills();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Skill it = (Skill) item$iv$iv;
            if (Intrinsics.areEqual(it.getName(), oldName)) {
                it = updatedSkill;
            }
            destination$iv$iv.add(it);
        }
        List updatedList = (List) destination$iv$iv;
        this.dataStoreRepository.setSkills(updatedList);
    }

    
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getSkillNameForLogging(com.google.ai.edge.gallery.proto.Skill r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.getSkillUrl()
            java.lang.String r1 = "getSkillUrl(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = r2
        L16:
            if (r0 == 0) goto L5c
            kotlinx.coroutines.flow.MutableStateFlow<com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerUiState> r0 = r10._uiState
            java.lang.Object r0 = r0.getValue()
            com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerUiState r0 = (com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerUiState) r0
            java.util.List r0 = r0.getFeaturedSkills()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r3 = 0
            boolean r4 = r0 instanceof java.util.Collection
            if (r4 == 0) goto L36
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L36
            r0 = r2
            goto L59
        L36:
            java.util.Iterator r4 = r0.iterator()
        L3a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L58
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.google.ai.edge.gallery.data.AllowedSkill r6 = (com.google.ai.edge.gallery.data.AllowedSkill) r6
            r7 = 0
            java.lang.String r8 = r6.getSkillUrl()
            java.lang.String r9 = r11.getSkillUrl()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            if (r6 == 0) goto L3a
            r0 = r1
            goto L59
        L58:
            r0 = r2
        L59:
            if (r0 == 0) goto L5c
            goto L5d
        L5c:
            r1 = r2
        L5d:
            r0 = r1
            boolean r1 = r11.getBuiltIn()
            if (r1 != 0) goto L6a
            if (r0 == 0) goto L67
            goto L6a
        L67:
            java.lang.String r1 = "custom_skill"
            goto L71
        L6a:
            java.lang.String r1 = r11.getName()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel.getSkillNameForLogging(com.google.ai.edge.gallery.proto.Skill):java.lang.String");
    }

    
    public final File getSkillDestinationDir(String originalImportDirName) {
        String normalizedDirName = new Regex("\\s+").replace(originalImportDirName, "-");
        String newImportDirName = "skills/" + normalizedDirName;
        File filesDir = this.context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        return FilesKt.resolve(filesDir, newImportDirName);
    }
}
