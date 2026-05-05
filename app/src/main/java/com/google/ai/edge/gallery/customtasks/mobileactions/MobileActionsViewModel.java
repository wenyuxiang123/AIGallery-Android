package com.google.ai.edge.gallery.customtasks.mobileactions;

import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.provider.CalendarContract;
import android.util.Log;
import androidx.core.net.MailTo;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.ui.llmchat.LlmChatModelHelper;
import com.google.ai.edge.gallery.ui.modelmanager.ModelInitializationStatus;
import com.google.ai.edge.gallery.ui.modelmanager.ModelInitializationStatusType;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.runtime.LlmModelHelper;
import com.google.ai.edge.litertlm.Message;
import com.google.ai.edge.litertlm.ToolProvider;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

public final class MobileActionsViewModel extends ViewModel {
    private final MutableStateFlow<Boolean> _isResettingConversation;
    private final MutableStateFlow<MobileActionsUiState> _uiState;
    private final Context appContext;

    @Inject
    public MobileActionsViewModel(@ApplicationContext Context context) {
        this.appContext = context;
        this._uiState = new MutableStateFlow<>(new MobileActionsUiState());
        this._isResettingConversation = new MutableStateFlow(false);
    }

    public final MutableStateFlow<MobileActionsUiState> get_uiState() {
        return this._uiState;
    }

    public final StateFlow<MobileActionsUiState> getUiState() {
        return this._uiState;
    }

    public final MutableStateFlow<Boolean> get_isResettingConversation() {
        return this._isResettingConversation;
    }

    public final boolean isResettingConversation() {
        return this._isResettingConversation.getValue().booleanValue();
    }

    public final void reset() {
        this._isResettingConversation.setValue(true);
    }

    public final void cleanUp() {
    }

    public final void setShowWelcomeMessage(boolean showWelcomeMessage) {
        MobileActionsUiState state = this._uiState.getValue();
        MobileActionsUiState newState = new MobileActionsUiState();
        newState.setShowWelcomeMessage(showWelcomeMessage);
        newState.setProcessing(state.isProcessing());
        newState.setUserPrompt(state.getUserPrompt());
        newState.setModelResponse(state.getModelResponse());
        newState.setFunctionCallDetails(state.getFunctionCallDetails());
        newState.setNoFunctionRecognized(state.isNoFunctionRecognized());
        this._uiState.setValue(newState);
    }

    public final void setProcessing(boolean processing) {
        MobileActionsUiState state = this._uiState.getValue();
        MobileActionsUiState newState = new MobileActionsUiState();
        newState.setShowWelcomeMessage(state.isShowWelcomeMessage());
        newState.setProcessing(processing);
        newState.setUserPrompt(state.getUserPrompt());
        newState.setModelResponse(state.getModelResponse());
        newState.setFunctionCallDetails(state.getFunctionCallDetails());
        newState.setNoFunctionRecognized(state.isNoFunctionRecognized());
        this._uiState.setValue(newState);
    }

    public final void setUserPrompt(String prompt) {
        MobileActionsUiState state = this._uiState.getValue();
        MobileActionsUiState newState = new MobileActionsUiState();
        newState.setShowWelcomeMessage(state.isShowWelcomeMessage());
        newState.setProcessing(state.isProcessing());
        newState.setUserPrompt(prompt);
        newState.setModelResponse(state.getModelResponse());
        newState.setFunctionCallDetails(state.getFunctionCallDetails());
        newState.setNoFunctionRecognized(state.isNoFunctionRecognized());
        this._uiState.setValue(newState);
    }

    public final void setModelResponse(String response) {
        MobileActionsUiState state = this._uiState.getValue();
        MobileActionsUiState newState = new MobileActionsUiState();
        newState.setShowWelcomeMessage(state.isShowWelcomeMessage());
        newState.setProcessing(false);
        newState.setUserPrompt(state.getUserPrompt());
        newState.setModelResponse(response);
        newState.setFunctionCallDetails(state.getFunctionCallDetails());
        newState.setNoFunctionRecognized(state.isNoFunctionRecognized());
        this._uiState.setValue(newState);
    }

    public final void appendModelResponse(String partialResponse) {
        MobileActionsUiState state = this._uiState.getValue();
        setModelResponse(state.getModelResponse() + partialResponse);
    }

    public final void addFunctionCallDetails(List<Pair<String, String>> details) {
        MobileActionsUiState state = this._uiState.getValue();
        MobileActionsUiState newState = new MobileActionsUiState();
        newState.setShowWelcomeMessage(state.isShowWelcomeMessage());
        newState.setProcessing(state.isProcessing());
        newState.setUserPrompt(state.getUserPrompt());
        newState.setModelResponse(state.getModelResponse());
        newState.setFunctionCallDetails(details);
        newState.setNoFunctionRecognized(false);
        this._uiState.setValue(newState);
    }

    public final void clearFunctionCallDetails() {
        addFunctionCallDetails(new java.util.ArrayList<>());
    }

    public final void setNoFunctionRecognized(boolean value) {
        MobileActionsUiState state = this._uiState.getValue();
        MobileActionsUiState newState = new MobileActionsUiState();
        newState.setShowWelcomeMessage(state.isShowWelcomeMessage());
        newState.setProcessing(state.isProcessing());
        newState.setUserPrompt(state.getUserPrompt());
        newState.setModelResponse(state.getModelResponse());
        newState.setFunctionCallDetails(state.getFunctionCallDetails());
        newState.setNoFunctionRecognized(value);
        this._uiState.setValue(newState);
    }

    public final String performAction(Action action, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(context, "context");
        if (action instanceof FlashlightOnAction) {
            return setFlashlight(context, true);
        }
        if (action instanceof FlashlightOffAction) {
            return setFlashlight(context, false);
        }
        if (action instanceof CreateContactAction) {
            CreateContactAction createContactAction = (CreateContactAction) action;
            return createContact(context, createContactAction.getFirstName(), createContactAction.getLastName(), createContactAction.getPhoneNumber(), createContactAction.getEmail());
        }
        if (action instanceof SendEmailAction) {
            SendEmailAction sendEmailAction = (SendEmailAction) action;
            return sendEmail(context, sendEmailAction.getTo(), sendEmailAction.getSubject(), sendEmailAction.getBody());
        }
        if (action instanceof ShowLocationOnMap) {
            return showLocationOnMap(context, ((ShowLocationOnMap) action).getLocation());
        }
        if (action instanceof OpenWifiSettingsAction) {
            return openWifiSettings(context);
        }
        if (action instanceof CreateCalendarEventAction) {
            CreateCalendarEventAction createCalendarEventAction = (CreateCalendarEventAction) action;
            return createCalendarEvent(context, createCalendarEventAction.getDatetime(), createCalendarEventAction.getTitle());
        }
        return "";
    }

    private final String setFlashlight(Context context, boolean isEnabled) {
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);
            String cameraId = null;
            for (String id : cameraManager.getCameraIdList()) {
                CameraCharacteristics characteristics = cameraManager.getCameraCharacteristics(id);
                Boolean flashAvailable = (Boolean) characteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                if (flashAvailable != null && flashAvailable) {
                    cameraId = id;
                    break;
                }
            }
            if (cameraId != null) {
                cameraManager.setTorchMode(cameraId, isEnabled);
                return "";
            }
            return "No camera with flash available";
        } catch (Exception e) {
            Log.e("AGMAViewModel", "Failed to set flashlight", e);
            return e.getMessage() != null ? e.getMessage() : "Unknown error";
        }
    }

    private final String createContact(Context context, String firstName, String lastName, String phoneNumber, String email) {
        try {
            Intent intent = new Intent(Intent.ACTION_INSERT);
            intent.setType("vnd.android.cursor.dir/contact");
            intent.putExtra("name", firstName + " " + lastName);
            intent.putExtra("email", email);
            intent.putExtra("email_type", 2);
            intent.putExtra("phone", phoneNumber);
            intent.putExtra("phone_type", 3);
            context.startActivity(intent);
            return "";
        } catch (Exception e) {
            Log.e("AGMAViewModel", "Failed to create contact", e);
            return e.getMessage() != null ? e.getMessage() : "Unknown error";
        }
    }

    private final String sendEmail(Context context, String to, String subject, String body) {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT, body);
            context.startActivity(intent);
            return "";
        } catch (Exception e) {
            Log.e("AGMAViewModel", "Failed to send email", e);
            return e.getMessage() != null ? e.getMessage() : "Unknown error";
        }
    }

    private final String showLocationOnMap(Context context, String location) {
        try {
            String encodedLocation = URLEncoder.encode(location, StandardCharsets.UTF_8.toString());
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:0,0?q=" + encodedLocation));
            context.startActivity(intent);
            return "";
        } catch (Exception e) {
            Log.e("AGMAViewModel", "Failed to show location on map", e);
            return e.getMessage() != null ? e.getMessage() : "Unknown error";
        }
    }

    private final String openWifiSettings(Context context) {
        try {
            Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
            context.startActivity(intent);
            return "";
        } catch (Exception e) {
            Log.e("AGMAViewModel", "Failed to open wifi settings", e);
            return e.getMessage() != null ? e.getMessage() : "Unknown error";
        }
    }

    private final String createCalendarEvent(Context context, String datetime, String title) {
        try {
            long beginTime = System.currentTimeMillis();
            try {
                LocalDateTime localDateTime = LocalDateTime.parse(datetime);
                beginTime = localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            } catch (Exception e) {
                Log.w("AGMAViewModel", "Failed to parse datetime: '" + datetime + "'", e);
            }
            Intent intent = new Intent(Intent.ACTION_INSERT);
            intent.setData(CalendarContract.Events.CONTENT_URI);
            intent.putExtra("title", title);
            intent.putExtra("beginTime", beginTime);
            intent.putExtra("endTime", beginTime + 3600000);
            context.startActivity(intent);
            return "";
        } catch (Exception e) {
            Log.e("AGMAViewModel", "Failed to create calendar event", e);
            return e.getMessage() != null ? e.getMessage() : "Unknown error";
        }
    }
}
