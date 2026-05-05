package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SendEmailParamsJsonAdapter.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/SendEmailParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SendEmailParams;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
        StringBuilder $this$toString_u24lambda_u240 = new StringBuilder(40);
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
        if (extra_text == null) {
            throw Util.missingProperty("extra_text", "extra_text", reader);
        }
        return new SendEmailParams(extra_email, extra_subject, extra_text);
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
