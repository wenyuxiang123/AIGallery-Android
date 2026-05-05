// Class: final Lcom.google.ai.edge.gallery.data.ConstsKt
// Access: public
class ConstsKt extends Ljava/lang/Object {

    // Fields:
    private static final java.util.List DEFAULT_ACCELERATORS;
    public static final I = 0x400 DEFAULT_MAX_TOKEN;
    public static final F = 1.0f DEFAULT_TEMPERATURE;
    public static final I = 0x40 DEFAULT_TOPK;
    public static final F = 0.95f DEFAULT_TOPP;
    private static final com.google.ai.edge.gallery.data.Accelerator DEFAULT_VISION_ACCELERATOR;
    public static final Ljava/lang/String; = "KEY_MODEL_COMMIT_HASH" KEY_MODEL_COMMIT_HASH;
    public static final Ljava/lang/String; = "KEY_MODEL_DOWNLOAD_ACCESS_TOKEN" KEY_MODEL_DOWNLOAD_ACCESS_TOKEN;
    public static final Ljava/lang/String; = "KEY_MODEL_DOWNLOAD_ERROR_MESSAGE" KEY_MODEL_DOWNLOAD_ERROR_MESSAGE;
    public static final Ljava/lang/String; = "KEY_MODEL_DOWNLOAD_FILE_NAME" KEY_MODEL_DOWNLOAD_FILE_NAME;
    public static final Ljava/lang/String; = "KEY_MODEL_DOWNLOAD_MODEL_DIR" KEY_MODEL_DOWNLOAD_MODEL_DIR;
    public static final Ljava/lang/String; = "KEY_MODEL_DOWNLOAD_RATE" KEY_MODEL_DOWNLOAD_RATE;
    public static final Ljava/lang/String; = "KEY_MODEL_DOWNLOAD_RECEIVED_BYTES" KEY_MODEL_DOWNLOAD_RECEIVED_BYTES;
    public static final Ljava/lang/String; = "KEY_MODEL_DOWNLOAD_REMAINING_SECONDS" KEY_MODEL_DOWNLOAD_REMAINING_MS;
    public static final Ljava/lang/String; = "KEY_MODEL_EXTRA_DATA_DOWNLOAD_FILE_NAMES" KEY_MODEL_EXTRA_DATA_DOWNLOAD_FILE_NAMES;
    public static final Ljava/lang/String; = "KEY_MODEL_EXTRA_DATA_URLS" KEY_MODEL_EXTRA_DATA_URLS;
    public static final Ljava/lang/String; = "KEY_MODEL_IS_ZIP" KEY_MODEL_IS_ZIP;
    public static final Ljava/lang/String; = "KEY_MODEL_NAME" KEY_MODEL_NAME;
    public static final Ljava/lang/String; = "KEY_MODEL_START_UNZIPPING" KEY_MODEL_START_UNZIPPING;
    public static final Ljava/lang/String; = "KEY_MODEL_TOTAL_BYTES" KEY_MODEL_TOTAL_BYTES;
    public static final Ljava/lang/String; = "KEY_MODEL_UNZIPPED_DIR" KEY_MODEL_UNZIPPED_DIR;
    public static final Ljava/lang/String; = "KEY_MODEL_URL" KEY_MODEL_URL;
    public static final I = 0x1 MAX_AUDIO_CLIP_COUNT;
    public static final I = 0x1e MAX_AUDIO_CLIP_DURATION_SEC;
    public static final I = 0xa MAX_IMAGE_COUNT;
    public static final I = 0x1 MAX_IMAGE_COUNT_AI_CORE;
    public static final I = 0xf MAX_RECOMMENDED_SKILL_COUNT;
    private static final float MODEL_INFO_ICON_SIZE;
    public static final I = 0x3e80 SAMPLE_RATE;
    private static final java.lang.String SOC;
    public static final Ljava/lang/String; = "gallerytmp" TMP_FILE_EXT;

    // Methods:
    static void constructor <clinit>() {
        // v0 = GPU:Lcom/google/ai/edge/gallery/data/Accelerator;
        // STATIC listOf(Ljava/lang/Object;)Ljava/util/List;
        // move-result-object v0
        // sput-object v0, Lcom/google/ai/edge/gallery/data/ConstsKt;->DEFAULT_ACCELERATORS:Ljava/util/List;
        // v0 = GPU:Lcom/google/ai/edge/gallery/data/Accelerator;
        // const/16 v0, 0x12
        // const/4 v1, 0x0
        // int-to-float v2, v0
        // STATIC constructor-impl(F)F
        // move-result v0
        // sput v0, Lcom/google/ai/edge/gallery/data/ConstsKt;->MODEL_INFO_ICON_SIZE:F
        // nop
        // nop
        // v0 = SOC_MODEL:Ljava/lang/String;
        // if-nez v0, :cond_0
        // v1 = ROOT:Ljava/util/Locale;
        // VIRTUAL toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
        // move-result-object v0
        String v1 = "toLowerCase(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // ... (truncated)
    }
    public java.util.List static final getDEFAULT_ACCELERATORS() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/Accelerator;",
        // ">;"
        // }
        // v0 = DEFAULT_ACCELERATORS:Ljava/util/List;
        return v0;
    }
    public com.google.ai.edge.gallery.data.Accelerator static final getDEFAULT_VISION_ACCELERATOR() {
        // v0 = DEFAULT_VISION_ACCELERATOR:Lcom/google/ai/edge/gallery/data/Accelerator;
        return v0;
    }
    public float static final getMODEL_INFO_ICON_SIZE() {
        // v0 = MODEL_INFO_ICON_SIZE:F
        return v0;
    }
    public java.lang.String static final getSOC() {
        // v0 = SOC:Ljava/lang/String;
        return v0;
    }
}