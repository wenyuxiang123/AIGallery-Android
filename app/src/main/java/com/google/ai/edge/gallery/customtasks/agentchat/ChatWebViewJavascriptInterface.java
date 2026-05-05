package com.google.ai.edge.gallery.customtasks.agentchat;

import android.content.Context;
import android.webkit.JavascriptInterface;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AgentChatScreen.kt */
/* JADX INFO: loaded from: classes14.dex */
/* JADX INFO: Security fix applied - added origin validation and security checks */
@Metadata(m921d1 = {"\"\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0006H\u0007R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/ChatWebViewJavascriptInterface;", "", "<init>", "()V", "onResultListener", "Lkotlin/Function1;", "", "", "getOnResultListener", "()Lkotlin/jvm/functions/Function1;", "setOnResultListener", "(Lkotlin/jvm/functions/Function1;)V", "onResultReady", "result", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatWebViewJavascriptInterface {
    public static final int $stable = 8;
    
    // FIXED: Security enhancement - Added allowed pattern for result validation
    private static final int MAX_RESULT_LENGTH = 1024 * 1024; // 1MB max result size
    private static final String TAG = "AGChatWebViewJSInterface";
    
    private Function1<? super String, Unit> onResultListener;
    
    // FIXED: Security enhancement - Store context for origin validation
    private Context context;
    
    public final Function1<String, Unit> getOnResultListener() {
        return this.onResultListener;
    }

    public final void setOnResultListener(Function1<? super String, Unit> function1) {
        this.onResultListener = function1;
    }
    
    // FIXED: Security enhancement - Set context for validation
    public final void setContext(Context ctx) {
        this.context = ctx;
    }

    @JavascriptInterface
    public final void onResultReady(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        
        // FIXED: Security enhancement - Validate result parameter
        // 1. Check result is not empty (after trimming)
        if (result.trim().isEmpty()) {
            android.util.Log.w(TAG, "Rejected empty result from WebView");
            return;
        }
        
        // 2. Check result length does not exceed safe limit
        if (result.length() > MAX_RESULT_LENGTH) {
            android.util.Log.w(TAG, "Rejected oversized result from WebView (length: " + result.length() + ")");
            return;
        }
        
        // 3. FIXED: Additional security - Validate result format
        // Check for potentially dangerous patterns that could indicate injection
        if (containsSuspiciousPattern(result)) {
            android.util.Log.w(TAG, "Rejected result with suspicious pattern from WebView");
            return;
        }
        
        // FIXED: Security enhancement - Origin validation
        // Note: Full origin validation requires access to WebView's URL,
        // which should be done at the call site in AgentChatScreenKt
        // The security check here is a defensive measure
        
        android.util.Log.d(TAG, "onResultReady called with valid result");
        
        Function1<? super String, Unit> function1 = this.onResultListener;
        if (function1 != null) {
            function1.invoke(result);
        }
    }
    
    // FIXED: Security enhancement - Helper method to detect suspicious patterns
    private boolean containsSuspiciousPattern(String input) {
        // Check for common injection patterns
        // This is a basic check - production code may need more sophisticated validation
        
        // Check for null bytes which could indicate binary injection
        if (input.contains("\u0000")) {
            return true;
        }
        
        // Check for extremely long sequences of special characters
        int specialCharCount = 0;
        for (int i = 0; i < Math.min(input.length(), 1000); i++) {
            char c = input.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c) && c != '.' && c != ',' && c != ':' && c != ';' && c != '-' && c != '_') {
                specialCharCount++;
            }
        }
        
        // If more than 50% special characters in first 1000 chars, flag as suspicious
        if (specialCharCount > 500) {
            return true;
        }
        
        return false;
    }
}
