package com.google.ai.edge.gallery.ui.common;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewAssetLoader;
import androidx.webkit.internal.AssetHelper;
import com.google.ai.edge.gallery.common.UtilsKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;



V", "localFileAssetsLoader", "Landroidx/webkit/WebViewAssetLoader;", "Lorg/jspecify/annotations/NonNull;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
