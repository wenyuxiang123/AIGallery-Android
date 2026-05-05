package com.google.ai.edge.gallery.common;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getJsonObj", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTextContent", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/google/ai/edge/gallery/common/JsonObjAndTextContent;", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class JsonObjAndTextContent<T> {
    public static final int $stable = 0;
    private final T jsonObj;
    private final String textContent;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JsonObjAndTextContent copy$default(JsonObjAndTextContent jsonObjAndTextContent, Object obj, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = jsonObjAndTextContent.jsonObj;
        }
        if ((i & 2) != 0) {
            str = jsonObjAndTextContent.textContent;
        }
        return jsonObjAndTextContent.copy(obj, str);
    }

    public final T component1() {
        return this.jsonObj;
    }

    
    public final String getTextContent() {
        return this.textContent;
    }

    public final JsonObjAndTextContent<T> copy(T jsonObj, String textContent) {
        Intrinsics.checkNotNullParameter(textContent, "textContent");
        return new JsonObjAndTextContent<>(jsonObj, textContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsonObjAndTextContent)) {
            return false;
        }
        JsonObjAndTextContent jsonObjAndTextContent = (JsonObjAndTextContent) other;
        return Intrinsics.areEqual(this.jsonObj, jsonObjAndTextContent.jsonObj) && Intrinsics.areEqual(this.textContent, jsonObjAndTextContent.textContent);
    }

    public int hashCode() {
        return ((this.jsonObj == null ? 0 : this.jsonObj.hashCode()) * 31) + this.textContent.hashCode();
    }

    public String toString() {
        return "JsonObjAndTextContent(jsonObj=" + this.jsonObj + ", textContent=" + this.textContent + ")";
    }

    public JsonObjAndTextContent(T t, String textContent) {
        Intrinsics.checkNotNullParameter(textContent, "textContent");
        this.jsonObj = t;
        this.textContent = textContent;
    }

    public final T getJsonObj() {
        return this.jsonObj;
    }

    public final String getTextContent() {
        return this.textContent;
    }
}
