package com.google.ai.edge.gallery;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.Skills;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SkillsSerializer.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m922d2 = {"Lcom/google/ai/edge/gallery/SkillsSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/google/ai/edge/gallery/proto/Skills;", "<init>", "()V", "defaultValue", "getDefaultValue", "()Lcom/google/ai/edge/gallery/proto/Skills;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", "output", "Ljava/io/OutputStream;", "(Lcom/google/ai/edge/gallery/proto/Skills;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class SkillsSerializer implements Serializer<Skills> {
    public static final int $stable = 0;
    public static final SkillsSerializer INSTANCE = new SkillsSerializer();
    private static final Skills defaultValue;

    private SkillsSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(Skills skills, OutputStream output, Continuation $completion) {
        return writeTo2(skills, output, (Continuation<? super Unit>) $completion);
    }

    static {
        Skills defaultInstance = Skills.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance(...)");
        defaultValue = defaultInstance;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public Skills getDefaultValue() {
        return defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream input, Continuation<? super Skills> continuation) throws IOException {
        try {
            Skills from = Skills.parseFrom(input);
            Intrinsics.checkNotNullExpressionValue(from, "parseFrom(...)");
            return from;
        } catch (InvalidProtocolBufferException exception) {
            throw new CorruptionException("Cannot read proto.", exception);
        }
    }

    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(Skills t, OutputStream output, Continuation<? super Unit> continuation) {
        t.writeTo(output);
        return Unit.INSTANCE;
    }
}
