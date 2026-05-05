package com.google.ai.edge.gallery.customtasks.agentchat;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.core.net.MailTo;
import androidx.webkit.internal.AssetHelper;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntentHandler.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/IntentHandler;", "", "<init>", "()V", "TAG", "", "handleAction", "", "context", "Landroid/content/Context;", "action", "parameters", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class IntentHandler {
    public static final int $stable = 0;
    public static final IntentHandler INSTANCE = new IntentHandler();
    private static final String TAG = "IntentHandler";

    private IntentHandler() {
    }

    public final boolean handleAction(Context context, String action, String parameters) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        if (Intrinsics.areEqual(action, "send_email")) {
            try {
                Moshi moshi = new Moshi.Builder().build();
                JsonAdapter jsonAdapter = moshi.adapter(SendEmailParams.class);
                SendEmailParams params = (SendEmailParams) jsonAdapter.fromJson(parameters);
                if (params != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setData(Uri.parse(MailTo.MAILTO_SCHEME));
                    intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{params.getExtra_email()});
                    intent.putExtra("android.intent.extra.SUBJECT", params.getExtra_subject());
                    intent.putExtra("android.intent.extra.TEXT", params.getExtra_text());
                    context.startActivity(intent);
                    return true;
                }
                Log.e(TAG, "Failed to parse send_email parameters: " + parameters);
                return false;
            } catch (Exception e) {
                Log.e(TAG, "Failed to parse send_email parameters: " + parameters, e);
                return false;
            }
        }
        if (!Intrinsics.areEqual(action, "send_sms")) {
            return false;
        }
        try {
            Moshi moshi2 = new Moshi.Builder().build();
            JsonAdapter jsonAdapter2 = moshi2.adapter(SendSmsParams.class);
            SendSmsParams params2 = (SendSmsParams) jsonAdapter2.fromJson(parameters);
            if (params2 == null) {
                Log.e(TAG, "Failed to parse send_sms parameters: " + parameters);
                return false;
            }
            String $this$toUri$iv = "smsto:" + params2.getPhone_number();
            Uri uri = Uri.parse($this$toUri$iv);
            Intent intent2 = new Intent("android.intent.action.SENDTO", uri);
            intent2.putExtra("sms_body", params2.getSms_body());
            context.startActivity(intent2);
            return true;
        } catch (Exception e2) {
            Log.e(TAG, "Failed to parse send_sms parameters: " + parameters, e2);
            return false;
        }
    }
}
