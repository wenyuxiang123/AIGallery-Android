package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ConfigValue.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/ConfigValue;", "", "<init>", "()V", "IntValue", "FloatValue", "StringValue", "Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;", "Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;", "Lcom/google/ai/edge/gallery/data/ConfigValue$StringValue;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public abstract class ConfigValue {
    public static final int $stable = 0;

    public /* synthetic */ ConfigValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConfigValue() {
    }

    /* JADX INFO: compiled from: ConfigValue.kt */
    @Metadata(m921d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;", "Lcom/google/ai/edge/gallery/data/ConfigValue;", "value", "", "<init>", "(I)V", "getValue", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class IntValue extends ConfigValue {
        public static final int $stable = 0;
        private final int value;

        public static /* synthetic */ IntValue copy$default(IntValue intValue, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = intValue.value;
            }
            return intValue.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final IntValue copy(int value) {
            return new IntValue(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IntValue) && this.value == ((IntValue) other).value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return "IntValue(value=" + this.value + ")";
        }

        public IntValue(int value) {
            super(null);
            this.value = value;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: ConfigValue.kt */
    @Metadata(m921d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;", "Lcom/google/ai/edge/gallery/data/ConfigValue;", "value", "", "<init>", "(F)V", "getValue", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class FloatValue extends ConfigValue {
        public static final int $stable = 0;
        private final float value;

        public static /* synthetic */ FloatValue copy$default(FloatValue floatValue, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = floatValue.value;
            }
            return floatValue.copy(f);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        public final FloatValue copy(float value) {
            return new FloatValue(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FloatValue) && Float.compare(this.value, ((FloatValue) other).value) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.value);
        }

        public String toString() {
            return "FloatValue(value=" + this.value + ")";
        }

        public FloatValue(float value) {
            super(null);
            this.value = value;
        }

        public final float getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: ConfigValue.kt */
    @Metadata(m921d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/ConfigValue$StringValue;", "Lcom/google/ai/edge/gallery/data/ConfigValue;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class StringValue extends ConfigValue {
        public static final int $stable = 0;
        private final String value;

        public static /* synthetic */ StringValue copy$default(StringValue stringValue, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stringValue.value;
            }
            return stringValue.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final StringValue copy(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new StringValue(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StringValue) && Intrinsics.areEqual(this.value, ((StringValue) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "StringValue(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringValue(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final String getValue() {
            return this.value;
        }
    }
}
