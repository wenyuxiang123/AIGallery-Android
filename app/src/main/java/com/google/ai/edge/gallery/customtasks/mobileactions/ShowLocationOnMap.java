package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.MapKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Actions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/ShowLocationOnMap;", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/Action;", FirebaseAnalytics.Param.LOCATION, "", "<init>", "(Ljava/lang/String;)V", "getLocation", "()Ljava/lang/String;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ShowLocationOnMap extends Action {
    public static final int $stable = 8;
    private final String location;

    public final String getLocation() {
        return this.location;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowLocationOnMap(String location) {
        super(ActionType.ACTION_SHOW_LOCATION_ON_MAP, MapKt.getMap(Icons.Outlined.INSTANCE), new FunctionCallDetails("showLocationOnMap", CollectionsKt.listOf(new Pair(FirebaseAnalytics.Param.LOCATION, location)), 0L, 4, null));
        Intrinsics.checkNotNullParameter(location, "location");
        this.location = location;
    }
}
