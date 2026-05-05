package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.CalendarMonthKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Actions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/CreateCalendarEventAction;", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/Action;", "datetime", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDatetime", "()Ljava/lang/String;", "getTitle", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class CreateCalendarEventAction extends Action {
    public static final int $stable = 8;
    private final String datetime;
    private final String title;

    public final String getDatetime() {
        return this.datetime;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCalendarEventAction(String datetime, String title) {
        super(ActionType.ACTION_CREATE_CALENDAR_EVENT, CalendarMonthKt.getCalendarMonth(Icons.Outlined.INSTANCE), new FunctionCallDetails("createCalendarEvent", CollectionsKt.listOf((Object[]) new Pair[]{new Pair("datetime", datetime), new Pair("title", title)}), 0L, 4, null));
        Intrinsics.checkNotNullParameter(datetime, "datetime");
        Intrinsics.checkNotNullParameter(title, "title");
        this.datetime = datetime;
        this.title = title;
    }
}
