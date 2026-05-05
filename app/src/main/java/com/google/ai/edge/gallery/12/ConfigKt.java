// Class: final Lcom.google.ai.edge.gallery.data.ConfigKt
// Access: public
class ConfigKt extends Ljava/lang/Object {

    // Methods:
    public java.lang.Object static final convertValueToTargetType(java.lang.Object, com.google.ai.edge.gallery.data.ValueType) {
        String v0 = "value";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "valueType";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v0 = $EnumSwitchMapping$0:[I
        // VIRTUAL ordinal()I
        // move-result v1
        // aget v0, v0, v1
        // packed-switch v0, :pswitch_data_0
        NoWhenBranchMatchedException; v0 = new NoWhenBranchMatchedException;();
        // DIRECT <init>()V
        // throw v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v1
        // goto/16 :goto_4
        // nop
        // instance-of v0, p0, Ljava/lang/Integer;
        // const/4 v1, 0x0
        // if-eqz v0, :cond_0
        // STATIC valueOf(I)Ljava/lang/Integer;
        // ... (truncated)
    }
    public java.util.List static final createAICoreConfigs(int, int, float, java.util.List) {
        // value = {
        // "(IIF",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/gallery/data/Accelerator;",
        // ">;)",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/Config;",
        // ">;"
        // }
        // move-object/from16 v0, p3
        String v1 = "accelerators";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const/4 v1, 0x4
        // new-array v1, v1, [Lcom/google/ai/edge/gallery/data/Config;
        LabelConfig; v2 = new LabelConfig;();
        // v3 = INSTANCE:Lcom/google/ai/edge/gallery/data/ConfigKeys;
        // VIRTUAL getMAX_TOKENS()Lcom/google/ai/edge/gallery/data/ConfigKey;
        // move-result-object v3
        // move-result-object v4
        // ... (truncated)
    }
    public java.util.List static synthetic createAICoreConfigs$default(int, int, float, java.util.List, int, java.lang.Object) {
        // and-int/lit8 p5, p4, 0x1
        // if-eqz p5, :cond_0
        // const/16 p0, 0x400
        // and-int/lit8 p5, p4, 0x2
        // if-eqz p5, :cond_1
        // const/16 p1, 0x40
        // and-int/lit8 p5, p4, 0x4
        // if-eqz p5, :cond_2
        // const/high16 p2, 0x3f800000    # 1.0f
        // and-int/lit8 p4, p4, 0x8
        // if-eqz p4, :cond_3
        // STATIC getDEFAULT_ACCELERATORS()Ljava/util/List;
        // move-result-object p3
        // STATIC createAICoreConfigs(IIFLjava/util/List;)Ljava/util/List;
        // move-result-object p0
        return p0;
    }
    public java.util.List static final createLlmChatConfigs(int, java.lang.Integer, int, float, float, java.util.List, boolean) {
        // value = {
        // "(I",
        // "Ljava/lang/Integer;",
        // "IFF",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/gallery/data/Accelerator;",
        // ">;Z)",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/Config;",
        // ">;"
        // }
        // move-object/from16 v0, p5
        String v1 = "accelerators";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        LabelConfig; v1 = new LabelConfig;();
        // v2 = INSTANCE:Lcom/google/ai/edge/gallery/data/ConfigKeys;
        // VIRTUAL getMAX_TOKENS()Lcom/google/ai/edge/gallery/data/ConfigKey;
        // move-result-object v2
        // move-result-object v3
        // ... (truncated)
    }
    public java.util.List static synthetic createLlmChatConfigs$default(int, java.lang.Integer, int, float, float, java.util.List, boolean, int, java.lang.Object) {
        // and-int/lit8 p8, p7, 0x1
        // if-eqz p8, :cond_0
        // const/16 p0, 0x400
        // and-int/lit8 p8, p7, 0x2
        // if-eqz p8, :cond_1
        // const/4 p1, 0x0
        // move-object p8, p1
        // goto :goto_0
        // move-object p8, p1
        // and-int/lit8 p1, p7, 0x4
        // const/16 v0, 0x40
        // if-eqz p1, :cond_2
        // move v1, v0
        // goto :goto_1
        // move v1, p2
        // and-int/lit8 p1, p7, 0x8
        // if-eqz p1, :cond_3
        // const p3, 0x3f733333    # 0.95f
        // move v2, p3
        // goto :goto_2
        // ... (truncated)
    }
    public java.util.List static final createLlmChatConfigsForNpuModel(int, java.util.List) {
        // value = {
        // "(I",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/gallery/data/Accelerator;",
        // ">;)",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/Config;",
        // ">;"
        // }
        String v0 = "accelerators";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const/4 v0, 0x2
        // new-array v0, v0, [Lcom/google/ai/edge/gallery/data/Config;
        LabelConfig; v1 = new LabelConfig;();
        // v2 = INSTANCE:Lcom/google/ai/edge/gallery/data/ConfigKeys;
        // VIRTUAL getMAX_TOKENS()Lcom/google/ai/edge/gallery/data/ConfigKey;
        // move-result-object v2
        // STATIC valueOf(I)Ljava/lang/String;
        // move-result-object v3
        // ... (truncated)
    }
    public java.util.List static synthetic createLlmChatConfigsForNpuModel$default(int, java.util.List, int, java.lang.Object) {
        // and-int/lit8 p3, p2, 0x1
        // if-eqz p3, :cond_0
        // const/16 p0, 0x400
        // and-int/lit8 p2, p2, 0x2
        // if-eqz p2, :cond_1
        // STATIC getDEFAULT_ACCELERATORS()Ljava/util/List;
        // move-result-object p1
        // STATIC createLlmChatConfigsForNpuModel(ILjava/util/List;)Ljava/util/List;
        // move-result-object p0
        return p0;
    }
    public java.lang.String static final getConfigValueString(java.lang.Object, com.google.ai.edge.gallery.data.Config) {
        String v0 = "value";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "config";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // STATIC valueOf(Ljava/lang/Object;)Ljava/lang/String;
        // move-result-object v0
        // VIRTUAL getValueType()Lcom/google/ai/edge/gallery/data/ValueType;
        // move-result-object v1
        // v2 = FLOAT:Lcom/google/ai/edge/gallery/data/ValueType;
        // if-ne v1, v2, :cond_0
        // const/4 v1, 0x1
        // filled-new-array {p0}, [Ljava/lang/Object;
        // move-result-object v2
        // STATIC copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;
        // move-result-object v1
        String v2 = "%.2f";
        // STATIC format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        // move-result-object v1
        String v2 = "format(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // ... (truncated)
    }
}