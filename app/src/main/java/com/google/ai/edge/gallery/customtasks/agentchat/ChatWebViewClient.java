package com.google.ai.edge.gallery.customtasks.agentchat;

import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.ai.edge.gallery.ui.common.BaseGalleryWebViewClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AgentChatScreen.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ\u001c\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/ChatWebViewClient;", "Lcom/google/ai/edge/gallery/ui/common/BaseGalleryWebViewClient;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "onPageLoaded", "Lkotlin/Function0;", "", "setPageLoadListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onPageFinished", "view", "Landroid/webkit/WebView;", ImagesContract.URL, "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatWebViewClient extends BaseGalleryWebViewClient {
    public static final int $stable = 8;
    private final Context context;
    private Function0<Unit> onPageLoaded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatWebViewClient(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }

    public final void setPageLoadListener(Function0<Unit> listener) {
        this.onPageLoaded = listener;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        Log.d("AGAgentChatScreen", "page loaded");
        Function0<Unit> function0 = this.onPageLoaded;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
