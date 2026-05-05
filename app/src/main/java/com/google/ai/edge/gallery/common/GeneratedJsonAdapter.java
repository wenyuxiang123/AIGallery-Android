package com.google.ai.edge.gallery.common;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;




V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableCallJsSkillResultImageAdapter", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "nullableCallJsSkillResultWebviewAdapter", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
