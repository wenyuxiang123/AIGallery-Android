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
public final class SendSmsParamsJsonAdapter extends JsonAdapter<SendSmsParams> {
    public static final int $stable = 8;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public SendSmsParamsJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM915of = JsonReader.Options.m915of("phone_number", "sms_body");
        Intrinsics.checkNotNullExpressionValue(optionsM915of, "of(...)");
        this.options = optionsM915of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "phone_number");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
    }

    public String toString() {
        StringBuilder $this$toString_u24lambda_u240 = new StringBuilder(35);
        $this$toString_u24lambda_u240.append("SendSmsParamsJsonAdapter(").append("SendSmsParams").append(')');
        return $this$toString_u24lambda_u240.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public SendSmsParams fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String phone_number = null;
        String sms_body = null;
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
                        throw Util.unexpectedNull("phone_number", "phone_number", reader);
                    }
                    phone_number = strFromJson;
                    break;
                case 1:
                    String strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw Util.unexpectedNull("sms_body", "sms_body", reader);
                    }
                    sms_body = strFromJson2;
                    break;
                default:
                    break;
            }
        }
        reader.endObject();
        if (phone_number == null) {
            throw Util.missingProperty("phone_number", "phone_number", reader);
        }
        if (sms_body != null) {
            return new SendSmsParams(phone_number, sms_body);
        }
        throw Util.missingProperty("sms_body", "sms_body", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, SendSmsParams value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("phone_number");
        this.stringAdapter.toJson(writer, value_.getPhone_number());
        writer.name("sms_body");
        this.stringAdapter.toJson(writer, value_.getSms_body());
        writer.endObject();
    }
}
