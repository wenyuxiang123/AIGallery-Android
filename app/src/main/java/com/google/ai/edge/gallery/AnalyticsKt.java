package com.google.ai.edge.gallery;

import android.util.Log;
import com.google.firebase.Firebase;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;



Lcom/google/firebase/analytics/FirebaseAnalytics;", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
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
