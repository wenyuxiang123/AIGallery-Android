package com.google.ai.edge.gallery;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.UserData;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;



V", "defaultValue", "getDefaultValue", "()Lcom/google/ai/edge/gallery/proto/UserData;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", "output", "Ljava/io/OutputStream;", "(Lcom/google/ai/edge/gallery/proto/UserData;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class UserDataSerializer implements Serializer<UserData> {
    public static final int $stable = 0;
    public static final UserDataSerializer INSTANCE = new UserDataSerializer();
    private static final UserData defaultValue;

    private UserDataSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(UserData userData, OutputStream output, Continuation $completion) {
        return writeTo2(userData, output, (Continuation<? super Unit>) $completion);
    }

    static {
        UserData defaultInstance = UserData.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance(...)");
        defaultValue = defaultInstance;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public UserData getDefaultValue() {
        return defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream input, Continuation<? super UserData> continuation) throws IOException {
        try {
            UserData from = UserData.parseFrom(input);
            Intrinsics.checkNotNullExpressionValue(from, "parseFrom(...)");
            return from;
        } catch (InvalidProtocolBufferException exception) {
            throw new CorruptionException("Cannot read proto.", exception);
        }
    }

    
    public Object writeTo2(UserData t, OutputStream output, Continuation<? super Unit> continuation) {
        t.writeTo(output);
        return Unit.INSTANCE;
    }
}
