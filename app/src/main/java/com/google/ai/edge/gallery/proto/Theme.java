package com.google.ai.edge.gallery.proto;

import com.google.protobuf.Internal;


public enum Theme implements Internal.EnumLite {
    THEME_UNSPECIFIED(0),
    THEME_LIGHT(1),
    THEME_DARK(2),
    THEME_AUTO(3),
    UNRECOGNIZED(-1);

    public static final int THEME_AUTO_VALUE = 3;
    public static final int THEME_DARK_VALUE = 2;
    public static final int THEME_LIGHT_VALUE = 1;
    public static final int THEME_UNSPECIFIED_VALUE = 0;
    private static final Internal.EnumLiteMap<Theme> internalValueMap = new Internal.EnumLiteMap<Theme>() { // from class: com.google.ai.edge.gallery.proto.Theme.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public Theme findValueByNumber(int number) {
            return Theme.forNumber(number);
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
    public static Theme valueOf(int value) {
        return forNumber(value);
    }

    public static Theme forNumber(int value) {
        switch (value) {
            case 0:
                return THEME_UNSPECIFIED;
            case 1:
                return THEME_LIGHT;
            case 2:
                return THEME_DARK;
            case 3:
                return THEME_AUTO;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<Theme> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ThemeVerifier.INSTANCE;
    }

    private static final class ThemeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ThemeVerifier();

        private ThemeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int number) {
            return Theme.forNumber(number) != null;
        }
    }

    Theme(int value) {
        this.value = value;
    }
}
