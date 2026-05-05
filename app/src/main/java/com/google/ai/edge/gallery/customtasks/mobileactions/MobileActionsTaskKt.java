package com.google.ai.edge.gallery.customtasks.mobileactions;

import com.google.ai.edge.litertlm.Content;
import com.google.ai.edge.litertlm.Contents;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;




public final class MobileActionsTaskKt {
    private static final String TAG = "AGMATask";

    public static final Contents getSystemPrompt() {
        LocalDateTime now = LocalDateTime.now();
        String curDateTimeString = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
        String dayOfWeekString = now.format(DateTimeFormatter.ofPattern("EEEE"));
        Contents.Companion companion = Contents.INSTANCE;
        Iterable $this$map$iv = CollectionsKt.listOf((Object[]) new String[]{"You are a model that can do function calling with the following functions", "Current date and time given in YYYY-MM-DDTHH:MM:SS format: " + curDateTimeString + "\nDay of week is " + dayOfWeekString});
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            destination$iv$iv.add(new Content.Text(it));
        }
        return companion.m596of((List<? extends Content>) destination$iv$iv);
    }
}
