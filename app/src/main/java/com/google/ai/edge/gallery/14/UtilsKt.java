// Class: final Lcom.google.ai.edge.gallery.common.UtilsKt
// Access: public
class UtilsKt extends Ljava/lang/Object {

    // Fields:
    public static final Ljava/lang/String; = "https://appassets.androidplatform.net" LOCAL_URL_BASE;
    private static final Ljava/lang/String; = "AGUtils" TAG;

    // Methods:
    public kotlin.Unit static synthetic $r8$lambda$7g59Mu-94K3oUwWpKvBnJmnXjIg(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.ui.focus.FocusState) {
        // STATIC clearFocusOnKeyboardDismiss$lambda$13$lambda$12$lambda$11(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/focus/FocusState;)Lkotlin/Unit;
        // move-result-object p0
        return p0;
    }
    public androidx.compose.ui.Modifier static synthetic $r8$lambda$l0d0_ubLICznLXHwKYUwV1LEjA0(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int) {
        // STATIC clearFocusOnKeyboardDismiss$lambda$13(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
        // move-result-object p0
        return p0;
    }
    public boolean static final synthetic access$clearFocusOnKeyboardDismiss$lambda$13$lambda$8(androidx.compose.runtime.MutableState) {
        // STATIC clearFocusOnKeyboardDismiss$lambda$13$lambda$8(Landroidx/compose/runtime/MutableState;)Z
        // move-result v0
        return v0;
    }
    public void static final synthetic access$clearFocusOnKeyboardDismiss$lambda$13$lambda$9(androidx.compose.runtime.MutableState, boolean) {
        // STATIC clearFocusOnKeyboardDismiss$lambda$13$lambda$9(Landroidx/compose/runtime/MutableState;Z)V
        return ;
    }
    private int static final calculateInSampleSize(android.graphics.BitmapFactory$Options, int, int) {
        // iget v0, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I
        // iget v1, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I
        // const/4 v2, 0x1
        // if-gt v0, p2, :cond_0
        // if-le v1, p1, :cond_1
        // int-to-float v3, v0
        // int-to-float v4, p2
        // div-float/2addr v3, v4
        // STATIC roundToInt(F)I
        // move-result v3
        // int-to-float v4, v1
        // int-to-float v5, p1
        // div-float/2addr v4, v5
        // STATIC roundToInt(F)I
        // move-result v4
        // STATIC max(II)I
        // move-result v2
        return v2;
    }
    public int static final calculatePeakAmplitude(byte[], byte, int) {
        String v0 = "buffer";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const/4 v0, 0x0
        // STATIC wrap([BII)Ljava/nio/ByteBuffer;
        // move-result-object v0
        // v1 = LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        // VIRTUAL order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        // move-result-object v0
        // VIRTUAL asShortBuffer()Ljava/nio/ShortBuffer;
        // move-result-object v0
        // nop
        // const/4 v1, 0x0
        // VIRTUAL hasRemaining()Z
        // move-result v2
        // if-eqz v2, :cond_1
        // VIRTUAL get()S
        // move-result v2
        // STATIC abs(I)I
        // move-result v2
        // if-le v2, v1, :cond_0
        // ... (truncated)
    }
    public java.lang.String static final cleanUpMediapipeTaskErrorMessage(java.lang.String) {
        String v0 = "message";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // move-object v1, p0
        // check-cast v1, Ljava/lang/CharSequence;
        // const/4 v5, 0x6
        // const/4 v6, 0x0
        String v2 = "=== Source Location Trace";
        // const/4 v3, 0x0
        // const/4 v4, 0x0
        // move-result v0
        // if-ltz v0, :cond_0
        // const/4 v1, 0x0
        // VIRTUAL substring(II)Ljava/lang/String;
        // move-result-object v1
        String v2 = "substring(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        return v1;
        return p0;
    }
    public androidx.compose.ui.Modifier static final clearFocusOnKeyboardDismiss(androidx.compose.ui.Modifier) {
        String v0 = "<this>";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        UtilsKt$$ExternalSyntheticLambda0; v0 = new UtilsKt$$ExternalSyntheticLambda0;();
        // DIRECT <init>()V
        // const/4 v1, 0x1
        // const/4 v2, 0x0
        // STATIC composed$default(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
        // move-result-object v0
        return v0;
    }
    private androidx.compose.ui.Modifier static final clearFocusOnKeyboardDismiss$lambda$13(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int) {
        // move-object/from16 v0, p0
        // move-object/from16 v1, p1
        String v2 = "$this$composed";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const v2, -0x1d18283e
        // INTERFACE startReplaceGroup(I)V
        String v3 = "C351@11962L34,352@12039L34,367@12450L141:Utils.kt#cx9pa2";
        // STATIC sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
        // STATIC isTraceInProgress()Z
        // move-result v3
        // if-eqz v3, :cond_0
        // const/4 v3, -0x1
        String v4 = "com.google.ai.edge.gallery.common.clearFocusOnKeyboardDismiss.<anonymous> (Utils.kt:351)";
        // move/from16 v5, p2
        // STATIC traceEventStart(IIILjava/lang/String;)V
        // goto :goto_0
        // move/from16 v5, p2
        // const v2, -0x37af0dfc
        String v3 = "CC(remember):Utils.kt#9igjgp";
        // STATIC sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
        // ... (truncated)
    }
    private kotlin.Unit static final clearFocusOnKeyboardDismiss$lambda$13$lambda$12$lambda$11(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.ui.focus.FocusState) {
        String v0 = "it";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // STATIC clearFocusOnKeyboardDismiss$lambda$13$lambda$5(Landroidx/compose/runtime/MutableState;)Z
        // move-result v0
        // INTERFACE isFocused()Z
        // move-result v1
        // if-eq v0, v1, :cond_0
        // INTERFACE isFocused()Z
        // move-result v0
        // STATIC clearFocusOnKeyboardDismiss$lambda$13$lambda$6(Landroidx/compose/runtime/MutableState;Z)V
        // STATIC clearFocusOnKeyboardDismiss$lambda$13$lambda$5(Landroidx/compose/runtime/MutableState;)Z
        // move-result v0
        // if-eqz v0, :cond_0
        // const/4 v0, 0x0
        // STATIC clearFocusOnKeyboardDismiss$lambda$13$lambda$9(Landroidx/compose/runtime/MutableState;Z)V
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
    private boolean static final clearFocusOnKeyboardDismiss$lambda$13$lambda$5(androidx.compose.runtime.MutableState) {
        // value = {
        // "(",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/Boolean;",
        // ">;)Z"
        // }
        // move-object v0, p0
        // check-cast v0, Landroidx/compose/runtime/State;
        // const/4 v1, 0x0
        // const/4 v2, 0x0
        // const/4 v3, 0x0
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Ljava/lang/Boolean;
        // VIRTUAL booleanValue()Z
        // move-result v0
        return v0;
    }
    private void static final clearFocusOnKeyboardDismiss$lambda$13$lambda$6(androidx.compose.runtime.MutableState, boolean) {
        // value = {
        // "(",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/Boolean;",
        // ">;Z)V"
        // }
        // const/4 v0, 0x0
        // const/4 v1, 0x0
        // STATIC valueOf(Z)Ljava/lang/Boolean;
        // move-result-object v2
        // move-object v3, p0
        // const/4 v4, 0x0
        // INTERFACE setValue(Ljava/lang/Object;)V
        // nop
        return ;
    }
    private boolean static final clearFocusOnKeyboardDismiss$lambda$13$lambda$8(androidx.compose.runtime.MutableState) {
        // value = {
        // "(",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/Boolean;",
        // ">;)Z"
        // }
        // move-object v0, p0
        // check-cast v0, Landroidx/compose/runtime/State;
        // const/4 v1, 0x0
        // const/4 v2, 0x0
        // const/4 v3, 0x0
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Ljava/lang/Boolean;
        // VIRTUAL booleanValue()Z
        // move-result v0
        return v0;
    }
    private void static final clearFocusOnKeyboardDismiss$lambda$13$lambda$9(androidx.compose.runtime.MutableState, boolean) {
        // value = {
        // "(",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/Boolean;",
        // ">;Z)V"
        // }
        // const/4 v0, 0x0
        // const/4 v1, 0x0
        // STATIC valueOf(Z)Ljava/lang/Boolean;
        // move-result-object v2
        // move-object v3, p0
        // const/4 v4, 0x0
        // INTERFACE setValue(Ljava/lang/Object;)V
        // nop
        return ;
    }
    private byte[] static final convert8BitTo16Bit(byte[], byte) {
        // array-length v0, p0
        // mul-int/lit8 v0, v0, 0x2
        // new-array v0, v0, [B
        // STATIC wrap([B)Ljava/nio/ByteBuffer;
        // move-result-object v1
        // v2 = LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        // VIRTUAL order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        // move-result-object v1
        // array-length v2, p0
        // const/4 v3, 0x0
        // if-ge v3, v2, :cond_0
        // aget-byte v4, p0, v3
        // and-int/lit16 v5, v4, 0xff
        // add-int/lit8 v6, v5, -0x80
        // mul-int/lit16 v6, v6, 0x100
        // int-to-short v6, v6
        // VIRTUAL putShort(S)Ljava/nio/ByteBuffer;
        // add-int/lit8 v3, v3, 0x1
        // goto :goto_0
        return v0;
    }
    public com.google.ai.edge.gallery.common.AudioClip static final convertWavToMonoWithMaxSeconds(android.content.Context, android.net.Uri, int) {
        // move-object/from16 v1, p1
        String v0 = "context";
        // move-object/from16 v2, p0
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "stereoUri";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "Start to convert wav file to mono channel";
        String v3 = "AGUtils";
        // STATIC d(Ljava/lang/String;Ljava/lang/String;)I
        // nop
        // const/4 v4, 0x0
        // move-result-object v0
        // if-eqz v0, :cond_1
        // move-result-object v0
        String v5 = "file";
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v0
        // if-eqz v0, :cond_0
        // goto :goto_0
        // move-result-object v0
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.common.AudioClip static synthetic convertWavToMonoWithMaxSeconds$default(android.content.Context, android.net.Uri, int, int, java.lang.Object) {
        // and-int/lit8 p3, p3, 0x4
        // if-eqz p3, :cond_0
        // const/16 p2, 0x1e
        // STATIC convertWavToMonoWithMaxSeconds(Landroid/content/Context;Landroid/net/Uri;I)Lcom/google/ai/edge/gallery/common/AudioClip;
        // move-result-object p0
        return p0;
    }
    public android.graphics.Bitmap static final decodeSampledBitmapFromUri(android.content.Context, android.net.Uri, int, int) {
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "uri";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        BitmapFactory$Options; v0 = new BitmapFactory$Options;();
        // DIRECT <init>()V
        // move-object v1, v0
        // const/4 v2, 0x0
        // const/4 v3, 0x1
        // iput-boolean v3, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
        // nop
        // VIRTUAL getScheme()Ljava/lang/String;
        // move-result-object v3
        String v5 = "file";
        // if-eqz v3, :cond_1
        // VIRTUAL getScheme()Ljava/lang/String;
        // move-result-object v3
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-eqz v3, :cond_0
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.common.JsonObjAndTextContent static final synthetic getJsonResponse(java.lang.String) {
        // value = {
        // "<T:",
        // "Ljava/lang/Object;",
        // ">(",
        // "Ljava/lang/String;",
        // ")",
        // "Lcom/google/ai/edge/gallery/common/JsonObjAndTextContent<",
        // "TT;>;"
        // }
        String v0 = "AGUtils";
        String v1 = "url";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const/4 v1, 0x0
        // nop
        // const/4 v2, 0x0
        URL; v3 = new URL;();
        // DIRECT <init>(Ljava/lang/String;)V
        // VIRTUAL openConnection()Ljava/net/URLConnection;
        // move-result-object v3
        String v4 = "null cannot be cast to non-null type java.net.HttpURLConnection";
        // ... (truncated)
    }
    public boolean static final isAICoreSupported(java.util.Set) {
        // value = {
        // "(",
        // "Ljava/util/Set<",
        // "Ljava/lang/String;",
        // ">;)Z"
        // }
        // move-object v0, p0
        // check-cast v0, Ljava/util/Collection;
        // const/4 v1, 0x0
        // if-eqz v0, :cond_1
        // INTERFACE isEmpty()Z
        // move-result v0
        // if-eqz v0, :cond_0
        // goto :goto_0
        // move v0, v1
        // goto :goto_1
        // const/4 v0, 0x1
        // if-eqz v0, :cond_2
        return v1;
        // v0 = MODEL:Ljava/lang/String;
        // ... (truncated)
    }
    public boolean static final isPixel10() {
        // v0 = MODEL:Ljava/lang/String;
        // const/4 v1, 0x0
        // if-eqz v0, :cond_0
        // v0 = MODEL:Ljava/lang/String;
        String v2 = "MODEL";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // v2 = ROOT:Ljava/util/Locale;
        // VIRTUAL toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
        // move-result-object v0
        String v2 = "toLowerCase(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v0, Ljava/lang/CharSequence;
        String v2 = "pixel 10";
        // check-cast v2, Ljava/lang/CharSequence;
        // const/4 v3, 0x2
        // const/4 v4, 0x0
        // STATIC contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
        // move-result v0
        // if-eqz v0, :cond_0
        // const/4 v1, 0x1
        // ... (truncated)
    }
    public java.lang.Object static final synthetic parseJson(java.lang.String) {
        // value = {
        // "<T:",
        // "Ljava/lang/Object;",
        // ">(",
        // "Ljava/lang/String;",
        // ")TT;"
        // }
        String v0 = "response";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const/4 v0, 0x0
        // nop
        Gson; v1 = new Gson;();
        // DIRECT <init>()V
        String v2 = "T";
        // const/4 v3, 0x4
        // STATIC reifiedOperationMarker(ILjava/lang/String;)V
        // const-class v2, Ljava/lang/Object;
        // move-object v3, v2
        // check-cast v3, Ljava/lang/Class;
        // VIRTUAL fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        // ... (truncated)
    }
    public java.lang.String static final processLlmResponse(java.lang.String) {
        String v0 = "response";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const/4 v5, 0x4
        // const/4 v6, 0x0
        String v2 = "\\n";
        String v3 = "\n";
        // const/4 v4, 0x0
        // move-object v1, p0
        // move-result-object v0
        return v0;
    }
    public java.nio.ByteBuffer static final readFileToByteBuffer(java.io.File) {
        String v0 = "file";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // nop
        FileInputStream; v0 = new FileInputStream;();
        // DIRECT <init>(Ljava/io/File;)V
        // VIRTUAL getChannel()Ljava/nio/channels/FileChannel;
        // move-result-object v1
        String v2 = "getChannel(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL size()J
        // move-result-wide v2
        // long-to-int v2, v2
        // STATIC allocateDirect(I)Ljava/nio/ByteBuffer;
        // move-result-object v2
        // VIRTUAL read(Ljava/nio/ByteBuffer;)I
        // VIRTUAL rewind()Ljava/nio/Buffer;
        // VIRTUAL close()V
        // nop
        // goto :goto_0
        // move-exception v0
        // ... (truncated)
    }
    private short[] static final resample(short[], short, int, int, int) {
        // move-object/from16 v0, p0
        // move/from16 v1, p1
        // move/from16 v2, p2
        // if-ne v1, v2, :cond_0
        return v0;
        // int-to-double v3, v2
        // int-to-double v5, v1
        // div-double/2addr v3, v5
        // array-length v5, v0
        // int-to-double v5, v5
        // mul-double/2addr v5, v3
        // double-to-int v5, v5
        // new-array v6, v5, [S
        // const/4 v7, 0x1
        // move/from16 v8, p3
        // if-ne v8, v7, :cond_4
        // const/4 v9, 0x0
        // array-length v10, v6
        // if-ge v9, v10, :cond_3
        // int-to-double v11, v9
        // ... (truncated)
    }
    public android.graphics.Bitmap static final rotateBitmap(android.graphics.Bitmap, int) {
        String v0 = "bitmap";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        Matrix; v0 = new Matrix;();
        // DIRECT <init>()V
        // const/high16 v1, 0x43870000    # 270.0f
        // const/high16 v2, 0x42b40000    # 90.0f
        // const/high16 v3, 0x3f800000    # 1.0f
        // const/high16 v4, -0x40800000    # -1.0f
        // packed-switch p1, :pswitch_data_0
        return p0;
        // VIRTUAL postRotate(F)Z
        // goto :goto_0
        // VIRTUAL postRotate(F)Z
        // VIRTUAL preScale(FF)Z
        // goto :goto_0
        // VIRTUAL postRotate(F)Z
        // goto :goto_0
        // VIRTUAL postRotate(F)Z
        // VIRTUAL preScale(FF)Z
        // goto :goto_0
        // ... (truncated)
    }
}