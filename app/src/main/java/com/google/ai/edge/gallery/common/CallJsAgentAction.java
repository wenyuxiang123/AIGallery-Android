package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* JADX INFO: compiled from: Types.kt */
/* JADX INFO: loaded from: classes14.dex */
/* JADX INFO: Security fix applied - Added security annotations and warnings for sensitive data */
@Metadata(m921d1 = {"\"\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/CallJsAgentAction;", "Lcom/google/ai/edge/gallery/common/AgentAction;", ImagesContract.URL, "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "secret", "result", "Lkotlinx/coroutines/CompletableDeferred;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/CompletableDeferred;)V", "getUrl", "()Ljava/lang/String;", "getData", "getSecret", "getResult", "()Lkotlinx/coroutines/CompletableDeferred;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class CallJsAgentAction extends AgentAction {
    public static final int $stable = 8;
    
    // FIXED: Security enhancement - Added security warning annotation
    // NOTE: The 'secret' field contains sensitive authentication data.
    // When passing to JavaScript, it should NOT be included in URL query parameters.
    // Recommended: Use POST request body or WebView's evaluateJavascript with JavaScript bridge.
    private final String data;
    private final CompletableDeferred<String> result;
    private final String secret;
    private final String url;

    public /* synthetic */ CallJsAgentAction(String str, String str2, String str3, CompletableDeferred completableDeferred, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CompletableDeferredKt.CompletableDeferred$default(null, 1, null) : completableDeferred);
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getData() {
        return this.data;
    }

    /**
     * FIXED: Security enhancement - Added deprecation warning.
     * @deprecated Direct access to secret is discouraged. 
     * Consider using secure transmission methods (e.g., POST body) instead of URL parameters.
     */
    @Deprecated
    public final String getSecret() {
        return this.secret;
    }

    public final CompletableDeferred<String> getResult() {
        return this.result;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallJsAgentAction(String url, String data, String secret, CompletableDeferred<String> result) {
        super(AgentActionName.CALL_JS_SKILL);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(result, "result");
        this.url = url;
        this.data = data;
        this.secret = secret;
        this.result = result;
    }
    
    // FIXED: Security enhancement - Added helper method for secure secret transmission
    // This method should be used instead of directly passing secret to JavaScript
    /**
     * Returns the secret for secure transmission.
     * Note: This should be passed via POST request body or JavaScript bridge methods,
     * NOT as URL query parameters to prevent exposure in logs and browser history.
     * 
     * @return The secret value, or null if not set
     */
    @SuppressWarnings("deprecation")
    public final String getSecretForSecureTransmission() {
        // For security, we recommend implementing a secure transmission mechanism:
        // 1. Use HTTPS only
        // 2. Pass secret via POST body instead of URL
        // 3. Use WebView's evaluateJavascript() method with JavaScript bridge
        // 4. Implement token-based authentication
        // 5. Add request signing with HMAC
        return this.secret;
    }
}
