package com.google.ai.edge.gallery;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.Settings;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;



V", "defaultValue", "getDefaultValue", "()Lcom/google/ai/edge/gallery/proto/Settings;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", "output", "Ljava/io/OutputStream;", "(Lcom/google/ai/edge/gallery/proto/Settings;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class SettingsSerializer implements Serializer<Settings> {
    public static final int $stable = 0;
    public static final SettingsSerializer INSTANCE = new SettingsSerializer();
    private static final Settings defaultValue;

    private SettingsSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(Settings settings, OutputStream output, Continuation $completion) {
        return writeTo2(settings, output, (Continuation<? super Unit>) $completion);
    }

    static {
        Settings defaultInstance = Settings.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance(...)");
        defaultValue = defaultInstance;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public Settings getDefaultValue() {
        return defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream input, Continuation<? super Settings> continuation) throws IOException {
        try {
            Settings from = Settings.parseFrom(input);
            Intrinsics.checkNotNullExpressionValue(from, "parseFrom(...)");
            return from;
        } catch (InvalidProtocolBufferException exception) {
            throw new CorruptionException("Cannot read proto.", exception);
        }
    }

    
    public Object writeTo2(Settings t, OutputStream output, Continuation<? super Unit> continuation) {
        t.writeTo(output);
        return Unit.INSTANCE;
    }
}
