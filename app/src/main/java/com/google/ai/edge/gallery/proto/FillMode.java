package com.google.ai.edge.gallery.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes5.dex */
public enum FillMode implements Internal.EnumLite {
    FILL_MODE_UNSPECIFIED(0),
    FILL_MODE_DISABLED(1),
    FILL_MODE_SOLID(2),
    FILL_MODE_COLORIZE(3),
    UNRECOGNIZED(-1);

    public static final int FILL_MODE_COLORIZE_VALUE = 3;
    public static final int FILL_MODE_DISABLED_VALUE = 1;
    public static final int FILL_MODE_SOLID_VALUE = 2;
    public static final int FILL_MODE_UNSPECIFIED_VALUE = 0;
    private static final Internal.EnumLiteMap<FillMode> internalValueMap = new Internal.EnumLiteMap<FillMode>() { // from class: com.google.ai.edge.gallery.proto.FillMode.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public FillMode findValueByNumber(int number) {
            return FillMode.forNumber(number);
        }
    };
    private final int value;

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static FillMode valueOf(int value) {
        return forNumber(value);
    }

    public static FillMode forNumber(int value) {
        switch (value) {
            case 0:
                return FILL_MODE_UNSPECIFIED;
            case 1:
                return FILL_MODE_DISABLED;
            case 2:
                return FILL_MODE_SOLID;
            case 3:
                return FILL_MODE_COLORIZE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<FillMode> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return FillModeVerifier.INSTANCE;
    }

    private static final class FillModeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new FillModeVerifier();

        private FillModeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int number) {
            return FillMode.forNumber(number) != null;
        }
    }

    FillMode(int value) {
        this.value = value;
    }
}
