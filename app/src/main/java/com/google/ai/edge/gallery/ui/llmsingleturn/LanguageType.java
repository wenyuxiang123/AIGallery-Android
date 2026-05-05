package com.google.ai.edge.gallery.ui.llmsingleturn;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;



V", "getLabel", "()Ljava/lang/String;", "CPP", "JAVA", "JAVASCRIPT", "KOTLIN", "PYTHON", "SWIFT", "TYPESCRIPT", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public enum LanguageType {
    CPP("C++"),
    JAVA("Java"),
    JAVASCRIPT("JavaScript"),
    KOTLIN("Kotlin"),
    PYTHON("Python"),
    SWIFT("Swift"),
    TYPESCRIPT("TypeScript");

    private final String label;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<LanguageType> getEntries() {
        return $ENTRIES;
    }

    LanguageType(String label) {
        this.label = label;
    }

    public final String getLabel() {
        return this.label;
    }
}
