package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.autofill.HintConstants;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.PersonAddKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Actions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/CreateContactAction;", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/Action;", "firstName", "", "lastName", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getPhoneNumber", "getEmail", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class CreateContactAction extends Action {
    public static final int $stable = 8;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getEmail() {
        return this.email;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateContactAction(String firstName, String lastName, String phoneNumber, String email) {
        super(ActionType.ACTION_CREATE_CONTACT, PersonAddKt.getPersonAdd(Icons.Outlined.INSTANCE), new FunctionCallDetails("createContact", CollectionsKt.listOf((Object[]) new Pair[]{new Pair("firstName", firstName), new Pair("lastName", lastName), new Pair(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, phoneNumber), new Pair("email", email)}), 0L, 4, null));
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(email, "email");
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
