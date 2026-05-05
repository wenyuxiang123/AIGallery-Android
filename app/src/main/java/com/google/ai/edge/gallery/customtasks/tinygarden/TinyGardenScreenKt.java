package com.google.ai.edge.gallery.customtasks.tinygarden;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessage;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageWarning;
import com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateViewModel;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.litertlm.ToolProvider;
import java.security.MessageDigest;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

public final class TinyGardenScreenKt {
    private static final String TAG = "TinyGardenScreen";
    private static final String ASSETS_BASE_URL = "https://play.google.com/studio/apps/gallery-tiny-garden/";

    public static final void TinyGardenScreen(Task task, ModelManagerViewModel modelManagerViewModel, List<ToolProvider> tools, float bottomPadding, Function1<? super Boolean, Unit> setAppBarControlsDisabled, Function1<? super Boolean, Unit> setTopBarVisible, Flow<TinyGardenCommand> commandFlow, TinyGardenViewModel viewModel, Composer composer, int i, int i2) {
    }

    public static final void MainUi(Task task, ModelManagerViewModel modelManagerViewModel, List<ToolProvider> tools, float f, TinyGardenViewModel viewModel, Function1<? super Boolean, Unit> setAppBarControlsDisabled, Function1<? super Boolean, Unit> setTopBarVisible, Flow<TinyGardenCommand> commandFlow, HoldToDictateViewModel holdToDictateViewModel, Composer composer, int i, int i2) {
    }

    private static final String sha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            return "";
        }
    }
}
