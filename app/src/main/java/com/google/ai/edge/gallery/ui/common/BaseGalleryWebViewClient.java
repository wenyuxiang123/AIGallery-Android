package com.google.ai.edge.gallery.ui.common;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.webkit.WebViewAssetLoader;
import androidx.webkit.internal.AssetHelper;
import com.google.ai.edge.gallery.common.UtilsKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: GalleryWebView.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u00070\u0007¢\u0006\u0002\b\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/BaseGalleryWebViewClient;", "Landroid/webkit/WebViewClient;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "localFileAssetsLoader", "Landroidx/webkit/WebViewAssetLoader;", "Lorg/jspecify/annotations/NonNull;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public class BaseGalleryWebViewClient extends WebViewClient {
    public static final int $stable = 8;
    private final Context context;
    private final WebViewAssetLoader localFileAssetsLoader;

    public BaseGalleryWebViewClient(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        WebViewAssetLoader webViewAssetLoaderBuild = new WebViewAssetLoader.Builder().addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(this.context)).addPathHandler("/", new WebViewAssetLoader.InternalStoragePathHandler(this.context, this.context.getFilesDir())).build();
        Intrinsics.checkNotNullExpressionValue(webViewAssetLoaderBuild, "build(...)");
        this.localFileAssetsLoader = webViewAssetLoaderBuild;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        if ((request != null ? request.getUrl() : null) != null) {
            String string = request.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (StringsKt.startsWith$default(string, UtilsKt.LOCAL_URL_BASE, false, 2, (Object) null)) {
                String string2 = request.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                if (!StringsKt.startsWith$default(string2, "https://appassets.androidplatform.net/assets/", false, 2, (Object) null)) {
                    String path = request.getUrl().getPath();
                    if (path == null) {
                        path = "";
                    }
                    File localFile = new File(this.context.getFilesDir(), path);
                    if (!localFile.exists() || localFile.isDirectory()) {
                        return new WebResourceResponse(AssetHelper.DEFAULT_MIME_TYPE, "UTF-8", null);
                    }
                }
                return this.localFileAssetsLoader.shouldInterceptRequest(request.getUrl());
            }
        }
        return super.shouldInterceptRequest(view, request);
    }
}
