package com.google.ai.edge.gallery.customtasks.agentchat;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;



V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class SendEmailParamsJsonAdapter extends JsonAdapter<SendEmailParams> {
    public static final int $stable = 8;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public SendEmailParamsJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM915of = JsonReader.Options.m915of("extra_email", "extra_subject", "extra_text");
        Intrinsics.checkNotNullExpressionValue(optionsM915of, "of(...)");
        this.options = optionsM915of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "extra_email");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
    }

    public String toString() {
        StringBuilder $this$toString_u24lambda_u240 = new StringBuilder(35);
        $this$toString_u24lambda_u240.append("SendEmailParamsJsonAdapter(").append("SendEmailParams").append(')');
        return $this$toString_u24lambda_u240.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public SendEmailParams fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String extra_email = null;
        String extra_subject = null;
        String extra_text = null;
        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    String strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw Util.unexpectedNull("extra_email", "extra_email", reader);
                    }
                    extra_email = strFromJson;
                    break;
                case 1:
                    String strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw Util.unexpectedNull("extra_subject", "extra_subject", reader);
                    }
                    extra_subject = strFromJson2;
                    break;
                case 2:
                    String strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw Util.unexpectedNull("extra_text", "extra_text", reader);
                    }
                    extra_text = strFromJson3;
                    break;
                default:
                    break;
            }
        }
        reader.endObject();
        if (extra_email == null) {
            throw Util.missingProperty("extra_email", "extra_email", reader);
        }
        if (extra_subject == null) {
            throw Util.missingProperty("extra_subject", "extra_subject", reader);
        }
        if (extra_text != null) {
            return new SendEmailParams(extra_email, extra_subject, extra_text);
        }
        throw Util.missingProperty("extra_text", "extra_text", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, SendEmailParams value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("extra_email");
        this.stringAdapter.toJson(writer, value_.getExtra_email());
        writer.name("extra_subject");
        this.stringAdapter.toJson(writer, value_.getExtra_subject());
        writer.name("extra_text");
        this.stringAdapter.toJson(writer, value_.getExtra_text());
        writer.endObject();
    }
}
