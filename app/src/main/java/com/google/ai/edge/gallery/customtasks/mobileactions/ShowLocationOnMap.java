package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.MapKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;



V", "getLocation", "()Ljava/lang/String;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
