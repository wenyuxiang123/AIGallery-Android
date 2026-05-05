package com.google.ai.edge.gallery.customtasks.mobileactions;

import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.litertlm.Tool;
import com.google.ai.edge.litertlm.ToolParam;
import com.google.ai.edge.litertlm.ToolSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MobileActionsTools.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0007J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0007J<\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\fH\u0007J2\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\fH\u0007J\u001e\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\fH\u0007J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0007J(\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u001c\u001a\u00020\fH\u0007R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001d"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/MobileActionsTools;", "Lcom/google/ai/edge/litertlm/ToolSet;", "onFunctionCalled", "Lkotlin/Function1;", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/Action;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getOnFunctionCalled", "()Lkotlin/jvm/functions/Function1;", "turnOnFlashlight", "", "", "turnOffFlashlight", "createContact", "firstName", "lastName", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "email", "sendEmail", "to", "subject", "body", "showLocationOnMap", FirebaseAnalytics.Param.LOCATION, "openWifiSettings", "createCalendarEvent", "datetime", "title", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class MobileActionsTools implements ToolSet {
    public static final int $stable = 0;
    private final Function1<Action, Unit> onFunctionCalled;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileActionsTools(Function1<? super Action, Unit> onFunctionCalled) {
        Intrinsics.checkNotNullParameter(onFunctionCalled, "onFunctionCalled");
        this.onFunctionCalled = onFunctionCalled;
    }

    public final Function1<Action, Unit> getOnFunctionCalled() {
        return this.onFunctionCalled;
    }

    @Tool(description = "Turns the flashlight on")
    public final Map<String, String> turnOnFlashlight() {
        Log.d("AGMATools", "turn on flashlight");
        this.onFunctionCalled.invoke(new FlashlightOnAction());
        return MapsKt.mapOf(TuplesKt.m929to("result", FirebaseAnalytics.Param.SUCCESS));
    }

    @Tool(description = "Turns the flashlight off")
    public final Map<String, String> turnOffFlashlight() {
        Log.d("AGMATools", "turn off flashlight");
        this.onFunctionCalled.invoke(new FlashlightOffAction());
        return MapsKt.mapOf(TuplesKt.m929to("result", FirebaseAnalytics.Param.SUCCESS));
    }

    @Tool(description = "Creates a contact in the phone's contact list.")
    public final Map<String, String> createContact(@ToolParam(description = "The first name of the contact.") String firstName, @ToolParam(description = "The last name of the contact.") String lastName, @ToolParam(description = "The phone number of the contact.") String phoneNumber, @ToolParam(description = "The email address of the contact.") String email) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(email, "email");
        Log.d("AGMATools", "create contact. First name: '" + firstName + "', last name: '" + lastName + "', phone number: '" + phoneNumber + "', email: '" + email + "'");
        this.onFunctionCalled.invoke(new CreateContactAction(firstName, lastName, phoneNumber, email));
        return MapsKt.mapOf(TuplesKt.m929to("result", FirebaseAnalytics.Param.SUCCESS), TuplesKt.m929to("first_name", firstName), TuplesKt.m929to("last_name", lastName), TuplesKt.m929to("phone_number", phoneNumber), TuplesKt.m929to("email", email));
    }

    @Tool(description = "Sends an email.")
    public final Map<String, String> sendEmail(@ToolParam(description = "The email address of the recipient.") String to, @ToolParam(description = "The subject of the email.") String subject, @ToolParam(description = "The body of the email.") String body) {
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(body, "body");
        Log.d("AGMATools", "send email. To: '" + to + "', subject: '" + subject + "', body: '" + body + "'");
        this.onFunctionCalled.invoke(new SendEmailAction(to, subject, body));
        return MapsKt.mapOf(TuplesKt.m929to("result", FirebaseAnalytics.Param.SUCCESS), TuplesKt.m929to("to", to), TuplesKt.m929to("subject", subject), TuplesKt.m929to("body", body));
    }

    @Tool(description = "Shows a location on the map.")
    public final Map<String, String> showLocationOnMap(@ToolParam(description = "The location to search for. May be the name of a place, a business, or an address.") String location) {
        Intrinsics.checkNotNullParameter(location, "location");
        Log.d("AGMATools", "Show location on map. Location: '" + location + "'");
        this.onFunctionCalled.invoke(new ShowLocationOnMap(location));
        return MapsKt.mapOf(TuplesKt.m929to("result", FirebaseAnalytics.Param.SUCCESS), TuplesKt.m929to(FirebaseAnalytics.Param.LOCATION, location));
    }

    @Tool(description = "Opens the WiFi settings.")
    public final Map<String, String> openWifiSettings() {
        Log.d("AGMATools", "Open wifi settings");
        this.onFunctionCalled.invoke(new OpenWifiSettingsAction());
        return MapsKt.mapOf(TuplesKt.m929to("result", FirebaseAnalytics.Param.SUCCESS));
    }

    @Tool(description = "Creates a new calendar event.")
    public final Map<String, String> createCalendarEvent(@ToolParam(description = "The date and time of the event in the format YYYY-MM-DDTHH:MM:SS.") String datetime, @ToolParam(description = "The title of the event.") String title) {
        Intrinsics.checkNotNullParameter(datetime, "datetime");
        Intrinsics.checkNotNullParameter(title, "title");
        Log.d("AGMATools", "Create calendar event. Datetime: '" + datetime + "', title: '" + title + "'");
        this.onFunctionCalled.invoke(new CreateCalendarEventAction(datetime, title));
        return MapsKt.mapOf(TuplesKt.m929to("result", FirebaseAnalytics.Param.SUCCESS), TuplesKt.m929to("datetime", datetime), TuplesKt.m929to("title", title));
    }
}
