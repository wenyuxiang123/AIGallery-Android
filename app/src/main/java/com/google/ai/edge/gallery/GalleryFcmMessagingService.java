package com.google.ai.edge.gallery;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.util.Log;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FcmMessagingService.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0002J0\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u0011"}, m922d2 = {"Lcom/google/ai/edge/gallery/GalleryFcmMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "handleNow", "sendNotification", "title", "", "messageBody", "imageUrl", "Landroid/net/Uri;", "deeplink", "Companion", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GalleryFcmMessagingService extends FirebaseMessagingService {
    private static final String TAG = "AGFcmMessagingService";
    public static final int $stable = 8;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Uri uri;
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        Log.d(TAG, "Full message: " + remoteMessage);
        Log.d(TAG, "From: " + remoteMessage.getFrom());
        Map<String, String> data = remoteMessage.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        String deeplink = data.get("deeplink");
        String imageUrlStr = data.get("image_url");
        String body = null;
        if (imageUrlStr == null) {
            uri = null;
        } else {
            uri = Uri.parse(imageUrlStr);
        }
        Uri imageUrl = uri;
        String title = data.get("title");
        if (title == null) {
            title = notification != null ? notification.getTitle() : null;
        }
        String str = data.get("body");
        if (str != null) {
            body = str;
        } else if (notification != null) {
            body = notification.getBody();
        }
        Log.d(TAG, "Extracted FCM Data -> Title: " + title + ", Body: " + body + ", Deeplink: " + deeplink);
        if (title != null && body != null) {
            sendNotification(title, body, imageUrl, deeplink);
        } else if (!data.isEmpty()) {
            handleNow();
        }
    }

    private final void handleNow() {
        Log.d(TAG, "Short lived task is done.");
    }

    static /* synthetic */ void sendNotification$default(GalleryFcmMessagingService galleryFcmMessagingService, String str, String str2, Uri uri, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        galleryFcmMessagingService.sendNotification(str, str2, uri, str3);
    }

    private final void sendNotification(String title, String messageBody, Uri imageUrl, String deeplink) {
        Intent $this$sendNotification_u24lambda_u241;
        String string;
        String str = deeplink;
        if (!(str == null || str.length() == 0)) {
            $this$sendNotification_u24lambda_u241 = new Intent("android.intent.action.VIEW", Uri.parse(deeplink));
            $this$sendNotification_u24lambda_u241.setFlags(268435456);
        } else {
            $this$sendNotification_u24lambda_u241 = new Intent(this, (Class<?>) MainActivity.class);
            $this$sendNotification_u24lambda_u241.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, $this$sendNotification_u24lambda_u241, 201326592);
        Uri defaultSoundUri = RingtoneManager.getDefaultUri(2);
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(this, "gallery_high_priority_push_channel").setSmallIcon(C2421R.mipmap.ic_launcher);
        if (title == null) {
            string = getString(C2421R.string.gallery_news_notification_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = title;
        }
        NotificationCompat.Builder notificationBuilder = smallIcon.setContentTitle(string).setContentText(messageBody).setAutoCancel(true).setSound(defaultSoundUri).setContentIntent(pendingIntent).setPriority(1);
        Intrinsics.checkNotNullExpressionValue(notificationBuilder, "setPriority(...)");
        if (imageUrl != null) {
            URLConnection connection = null;
            try {
                URL url = new URL(imageUrl.toString());
                connection = url.openConnection();
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                Bitmap bitmap = BitmapFactory.decodeStream(connection.getInputStream());
                if (bitmap != null) {
                    notificationBuilder.setLargeIcon(bitmap);
                    notificationBuilder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
                }
            } catch (Exception e) {
                Log.w(TAG, "Failed to download image", e);
            } finally {
                // FIXED: Ensure URLConnection is properly closed to prevent resource leak
                if (connection != null) {
                    try {
                        // URLConnection does not have a direct close() method,
                        // but we can null out references to help GC
                        if (connection instanceof java.net.HttpURLConnection) {
                            ((java.net.HttpURLConnection) connection).disconnect();
                        }
                    } catch (Exception e2) {
                        Log.w(TAG, "Failed to disconnect connection", e2);
                    }
                }
            }
        }
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationChannel channel = new NotificationChannel("gallery_high_priority_push_channel", getString(C2421R.string.gallery_news_notification_title), 4);
        notificationManager.createNotificationChannel(channel);
        notificationManager.notify(0, notificationBuilder.build());
    }
}
