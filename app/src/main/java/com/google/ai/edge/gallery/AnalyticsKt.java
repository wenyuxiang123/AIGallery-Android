package com.google.ai.edge.gallery;

import android.util.Log;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.Firebase;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

/* JADX INFO: compiled from: Analytics.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m922d2 = {"hasLoggedAnalyticsWarning", "", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getFirebaseAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class AnalyticsKt {
    private static boolean hasLoggedAnalyticsWarning;

    public static final FirebaseAnalytics getFirebaseAnalytics() {
        Object objM11361constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM11361constructorimpl = Result.m11361constructorimpl(com.google.firebase.analytics.AnalyticsKt.getAnalytics(Firebase.INSTANCE));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11361constructorimpl = Result.m11361constructorimpl(ResultKt.createFailure(th));
        }
        Throwable exception = Result.m11364exceptionOrNullimpl(objM11361constructorimpl);
        if (exception != null && !hasLoggedAnalyticsWarning) {
            Log.w("AGAnalyticsFirebase", "Firebase Analytics is not available", exception);
        }
        if (Result.m11367isFailureimpl(objM11361constructorimpl)) {
            objM11361constructorimpl = null;
        }
        return (FirebaseAnalytics) objM11361constructorimpl;
    }
}
