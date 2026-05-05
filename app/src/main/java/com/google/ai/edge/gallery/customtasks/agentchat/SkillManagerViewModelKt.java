package com.google.ai.edge.gallery.customtasks.agentchat;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.EmailKt;
import androidx.compose.material.icons.outlined.KitchenKt;
import androidx.compose.material.icons.outlined.LocalLibraryKt;
import androidx.compose.material.icons.outlined.MapKt;
import androidx.compose.material.icons.outlined.QrCodeKt;
import androidx.compose.material.icons.outlined.ScreenRotationKt;
import androidx.compose.material.icons.outlined.SentimentVerySatisfiedKt;
import androidx.compose.material.icons.outlined.TagKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.common.SkillTryOutChip;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p009io.CloseableKt;
import kotlin.p009io.encoding.Base64;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: SkillManagerViewModel.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m922d2 = {"TAG", "", "SKILL_ALLOWLIST_URL", "TRYOUT_CHIPS", "", "Lcom/google/ai/edge/gallery/common/SkillTryOutChip;", "getTRYOUT_CHIPS", "()Ljava/util/List;", "getDisplayName", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "decodeBase64ToBitmap", "Landroid/graphics/Bitmap;", "base64String", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class SkillManagerViewModelKt {
    private static final String SKILL_ALLOWLIST_URL = "";
    private static final String TAG = "AGSkillManagerVM";
    private static final List<SkillTryOutChip> TRYOUT_CHIPS = CollectionsKt.listOf((Object[]) new SkillTryOutChip[]{new SkillTryOutChip(MapKt.getMap(Icons.Outlined.INSTANCE), "Interactive Map", "Show me Googleplex on interactive map.", "interactive-map"), new SkillTryOutChip(KitchenKt.getKitchen(Icons.Outlined.INSTANCE), "Kitchen Adventure", "Start kitchen adventure", "kitchen-adventure"), new SkillTryOutChip(TagKt.getTag(Icons.Outlined.INSTANCE), "Calculate Hash", "What is the sha1 hash of \"gemma\"?", "calculate-hash"), new SkillTryOutChip(ScreenRotationKt.getScreenRotation(Icons.Outlined.INSTANCE), "Text Spinner", "Spin \"Gemma\" on my head", "text-spinner"), new SkillTryOutChip(EmailKt.getEmail(Icons.Outlined.INSTANCE), "Send Email", "Send email 'Good morning' to abc@example.com. Content: 'Any plans for tonight?'", "send-email"), new SkillTryOutChip(SentimentVerySatisfiedKt.getSentimentVerySatisfied(Icons.Outlined.INSTANCE), "Track my mood", "Log yesterday's mood as 2 because it was raining quite heavily, and log today's mood as 9 because I had a great time playing pickleball again. Then show me my mood dashboard.", "mood-tracker"), new SkillTryOutChip(LocalLibraryKt.getLocalLibrary(Icons.Outlined.INSTANCE), "Query Wikipedia", "Check Wikipedia about Oscars 2026. Tell me who won the best picture.", "query-wikipedia"), new SkillTryOutChip(QrCodeKt.getQrCode(Icons.Outlined.INSTANCE), "Generate QR code", "Generate QR code for https://deepmind.google/models/gemma/", "qr-code")});

    public static final List<SkillTryOutChip> getTRYOUT_CHIPS() {
        return TRYOUT_CHIPS;
    }

    public static final String getDisplayName(Context context, Uri uri) {
        String strSubstringAfterLast$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Object name = "";
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    int nameIndex = cursor2.getColumnIndex("_display_name");
                    if (nameIndex != -1 && cursor2.moveToFirst()) {
                        Object string = cursor2.getString(nameIndex);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        name = string;
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursor, null);
                } finally {
                }
            }
        } catch (Exception e) {
        }
        String str = (CharSequence) name;
        if (str.length() == 0) {
            String path = uri.getPath();
            if (path == null || (strSubstringAfterLast$default = StringsKt.substringAfterLast$default(path, '/', (String) null, 2, (Object) null)) == null) {
                strSubstringAfterLast$default = "Unknown";
            }
            str = strSubstringAfterLast$default;
        }
        return str;
    }

    public static final Bitmap decodeBase64ToBitmap(String base64String) {
        Intrinsics.checkNotNullParameter(base64String, "base64String");
        try {
            String pureBase64 = StringsKt.substringAfter$default(base64String, ",", (String) null, 2, (Object) null);
            byte[] imageBytes = Base64.decode$default(Base64.INSTANCE, pureBase64, 0, 0, 6, (Object) null);
            return BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
