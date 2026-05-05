package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Types.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/JsonObjAndTextContent;", ExifInterface.GPS_DIRECTION_TRUE, "", "jsonObj", "textContent", "", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "getJsonObj", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTextContent", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/google/ai/edge/gallery/common/JsonObjAndTextContent;", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component2, reason: from getter */
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
