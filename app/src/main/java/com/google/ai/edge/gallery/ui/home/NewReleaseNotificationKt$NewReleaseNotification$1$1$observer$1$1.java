package com.google.ai.edge.gallery.ui.home;

import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.compose.runtime.MutableState;
import com.google.gson.Gson;
import com.google.ai.edge.gallery.BuildConfig;
import com.google.ai.edge.gallery.common.JsonObjAndTextContent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p009io.CloseableKt;
import kotlin.p009io.TextStreamsKt;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.home.NewReleaseNotificationKt$NewReleaseNotification$1$1$observer$1$1", m932f = "NewReleaseNotification.kt", m933i = {}, m934l = {74}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class NewReleaseNotificationKt$NewReleaseNotification$1$1$observer$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $newReleaseUrl$delegate;
    final /* synthetic */ MutableState<String> $newReleaseVersion$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewReleaseNotificationKt$NewReleaseNotification$1$1$observer$1$1(MutableState<String> mutableState, MutableState<String> mutableState2, Continuation<? super NewReleaseNotificationKt$NewReleaseNotification$1$1$observer$1$1> continuation) {
        super(2, continuation);
        this.$newReleaseVersion$delegate = mutableState;
        this.$newReleaseUrl$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewReleaseNotificationKt$NewReleaseNotification$1$1$observer$1$1(this.$newReleaseVersion$delegate, this.$newReleaseUrl$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewReleaseNotificationKt$NewReleaseNotification$1$1$observer$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.home.NewReleaseNotificationKt$NewReleaseNotification$1$1$observer$1$1$1", m932f = "NewReleaseNotification.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C27561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<String> $newReleaseUrl$delegate;
        final /* synthetic */ MutableState<String> $newReleaseVersion$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27561(MutableState<String> mutableState, MutableState<String> mutableState2, Continuation<? super C27561> continuation) {
            super(2, continuation);
            this.$newReleaseVersion$delegate = mutableState;
            this.$newReleaseUrl$delegate = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27561(this.$newReleaseVersion$delegate, this.$newReleaseUrl$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFromJson;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d("AGNewReleaseNotifi", "Checking for new release...");
                    JsonObjAndTextContent jsonObjAndTextContent = null;
                    try {
                        URLConnection uRLConnectionOpenConnection = new URL("https://api.github.com/repos/google-ai-edge/gallery/releases/latest").openConnection();
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
                                    objFromJson = gson$iv$iv.fromJson(response$iv, (Class<Object>) ReleaseInfo.class);
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
                        break;
                    } catch (Exception e$iv) {
                        Log.e("AGUtils", "Error when getting or parsing json response", e$iv);
                    }
                    JsonObjAndTextContent info = jsonObjAndTextContent;
                    if (info != null) {
                        String newRelease = ((ReleaseInfo) info.getJsonObj()).getTag_name();
                        boolean isNewer = NewReleaseNotificationKt.isNewerRelease(BuildConfig.VERSION_NAME, newRelease);
                        Log.d("AGNewReleaseNotifi", "curRelease: " + BuildConfig.VERSION_NAME + ", newRelease: " + newRelease + ", isNewer: " + isNewer);
                        if (isNewer) {
                            this.$newReleaseVersion$delegate.setValue(newRelease);
                            this.$newReleaseUrl$delegate.setValue(((ReleaseInfo) info.getJsonObj()).getHtml_url());
                        }
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getIO(), new C27561(this.$newReleaseVersion$delegate, this.$newReleaseUrl$delegate, null), this) == coroutine_suspended) {
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
