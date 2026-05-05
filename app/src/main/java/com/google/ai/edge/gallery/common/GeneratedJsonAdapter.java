package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.ai.edge.gallery.common.CallJsSkillResultJsonAdapter, reason: from toString */
/* JADX INFO: compiled from: CallJsSkillResultJsonAdapter.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/CallJsSkillResultJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/google/ai/edge/gallery/common/CallJsSkillResult;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableCallJsSkillResultImageAdapter", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "nullableCallJsSkillResultWebviewAdapter", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GeneratedJsonAdapter extends JsonAdapter<CallJsSkillResult> {
    public static final int $stable = 8;
    private final JsonAdapter<CallJsSkillResultImage> nullableCallJsSkillResultImageAdapter;
    private final JsonAdapter<CallJsSkillResultWebview> nullableCallJsSkillResultWebviewAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM915of = JsonReader.Options.m915of("result", "error", "image", "webview");
        Intrinsics.checkNotNullExpressionValue(optionsM915of, "of(...)");
        this.options = optionsM915of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "result");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter;
        JsonAdapter<CallJsSkillResultImage> jsonAdapterAdapter2 = moshi.adapter(CallJsSkillResultImage.class, SetsKt.emptySet(), "image");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableCallJsSkillResultImageAdapter = jsonAdapterAdapter2;
        JsonAdapter<CallJsSkillResultWebview> jsonAdapterAdapter3 = moshi.adapter(CallJsSkillResultWebview.class, SetsKt.emptySet(), "webview");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableCallJsSkillResultWebviewAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder $this$toString_u24lambda_u240 = new StringBuilder(39);
        $this$toString_u24lambda_u240.append("GeneratedJsonAdapter(").append("CallJsSkillResult").append(')');
        return $this$toString_u24lambda_u240.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public CallJsSkillResult fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String result = null;
        String error = null;
        CallJsSkillResultImage image = null;
        CallJsSkillResultWebview webview = null;
        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    String result2 = this.nullableStringAdapter.fromJson(reader);
                    result = result2;
                    break;
                case 1:
                    String error2 = this.nullableStringAdapter.fromJson(reader);
                    error = error2;
                    break;
                case 2:
                    CallJsSkillResultImage image2 = this.nullableCallJsSkillResultImageAdapter.fromJson(reader);
                    image = image2;
                    break;
                case 3:
                    CallJsSkillResultWebview webview2 = this.nullableCallJsSkillResultWebviewAdapter.fromJson(reader);
                    webview = webview2;
                    break;
            }
        }
        reader.endObject();
        return new CallJsSkillResult(result, error, image, webview);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CallJsSkillResult value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("result");
        this.nullableStringAdapter.toJson(writer, value_.getResult());
        writer.name("error");
        this.nullableStringAdapter.toJson(writer, value_.getError());
        writer.name("image");
        this.nullableCallJsSkillResultImageAdapter.toJson(writer, value_.getImage());
        writer.name("webview");
        this.nullableCallJsSkillResultWebviewAdapter.toJson(writer, value_.getWebview());
        writer.endObject();
    }
}
