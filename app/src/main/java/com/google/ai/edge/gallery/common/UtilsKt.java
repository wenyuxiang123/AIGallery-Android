package com.google.ai.edge.gallery.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.focus.FocusEventModifierKt;
import androidx.compose.p000ui.focus.FocusManager;
import androidx.compose.p000ui.focus.FocusState;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.Gson;
import com.google.ai.edge.gallery.data.ConstsKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.p009io.ByteStreamsKt;
import kotlin.p009io.CloseableKt;
import kotlin.p009io.TextStreamsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000j\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001\u001a!\u0010\u0007\u001a\n\u0012\u0004\u0012\u0002H\t\u0018\u00010\b\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0086\b\u001a \u0010\u000b\u001a\u0004\u0018\u0001H\t\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\f\u001a\"\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u001a\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u001a(\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014H\u0002\u001a\u0016\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0014\u001a(\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0014\u001a\u0016\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u0014\u001a \u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0014H\u0002\u001a\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/\u001a\u0006\u00100\u001a\u000201\u001a\n\u00102\u001a\u000203*\u000203\u001a\u0016\u00104\u001a\u0002012\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u000106\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u00067²\u0006\n\u00108\u001a\u000201X\u008a\u008e\u0002²\u0006\n\u00109\u001a\u000201X\u008a\u008e\u0002"}, m922d2 = {"TAG", "", "LOCAL_URL_BASE", "cleanUpMediapipeTaskErrorMessage", "message", "processLlmResponse", "response", "getJsonResponse", "Lcom/google/ai/edge/gallery/common/JsonObjAndTextContent;", ExifInterface.GPS_DIRECTION_TRUE, ImagesContract.URL, "parseJson", "(Ljava/lang/String;)Ljava/lang/Object;", "convertWavToMonoWithMaxSeconds", "Lcom/google/ai/edge/gallery/common/AudioClip;", "context", "Landroid/content/Context;", "stereoUri", "Landroid/net/Uri;", "maxSeconds", "", "convert8BitTo16Bit", "", "eightBitData", "resample", "", "inputSamples", "originalSampleRate", "targetSampleRate", "channels", "calculatePeakAmplitude", "buffer", "bytesRead", "decodeSampledBitmapFromUri", "Landroid/graphics/Bitmap;", "uri", "reqWidth", "reqHeight", "rotateBitmap", "bitmap", "orientation", "calculateInSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "readFileToByteBuffer", "Ljava/nio/ByteBuffer;", "file", "Ljava/io/File;", "isPixel10", "", "clearFocusOnKeyboardDismiss", "Landroidx/compose/ui/Modifier;", "isAICoreSupported", "allowedDeviceModels", "", "app_debug", "isFocused", "keyboardAppearedSinceLastFocused"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class UtilsKt {
    public static final String LOCAL_URL_BASE = "https://appassets.androidplatform.net";
    private static final String TAG = "AGUtils";

    public static final String cleanUpMediapipeTaskErrorMessage(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        int index = StringsKt.indexOf$default((CharSequence) message, "=== Source Location Trace", 0, false, 6, (Object) null);
        if (index >= 0) {
            String strSubstring = message.substring(0, index);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        return message;
    }

    public static final String processLlmResponse(String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return StringsKt.replace$default(response, "\\n", "\n", false, 4, (Object) null);
    }

    public static final /* synthetic */ <T> JsonObjAndTextContent<T> getJsonResponse(String url) {
        // FIXED: Security fix - Added timeout and proper resource management
        HttpURLConnection connection = null;
        int responseCode = -1; // FIXED: Initialize to invalid value
        Object objFromJson = null;
        String response = null;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            URL urlObj = new URL(url);
            URLConnection urlConnection = urlObj.openConnection();
            Intrinsics.checkNotNull(urlConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            connection = (HttpURLConnection) urlConnection;
            
            // FIXED: Security fix - Set timeouts to prevent hanging
            connection.setConnectTimeout(10000); // 10 seconds
            connection.setReadTimeout(10000);     // 10 seconds
            
            connection.setRequestMethod(ShareTarget.METHOD_GET);
            connection.connect();
            responseCode = connection.getResponseCode();
        } catch (Exception e) {
            Log.e(TAG, "Error when getting or parsing json response", e);
        }
        
        // FIXED: Security fix - Check connection before use
        if (connection != null && responseCode == 200) {
            InputStream inputStream = null;
            BufferedReader bufferedReader = null;
            try {
                inputStream = connection.getInputStream();
                Intrinsics.checkNotNull(inputStream);
                Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                
                response = TextStreamsKt.readText(bufferedReader);
                
                // FIXED: Security fix - Parse JSON safely
                try {
                    Gson gson$iv = new Gson();
                    Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                    objFromJson = gson$iv.fromJson(response, (Class<Object>) Object.class);
                } catch (Exception e$iv) {
                    Log.e(TAG, "Error parsing JSON string", e$iv);
                    objFromJson = null;
                }
                
                Object jsonObj = objFromJson;
                if (jsonObj != null) {
                    JsonObjAndTextContent<T> jsonObjAndTextContent = new JsonObjAndTextContent<>(jsonObj, response);
                    // FIXED: Security fix - Close resources before return
                    CloseableKt.closeFinally(bufferedReader, null);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e) {
                            Log.w(TAG, "Error closing input stream", e);
                        }
                    }
                    return jsonObjAndTextContent;
                }
            } catch (Exception e) {
                Log.e(TAG, "Error reading response", e);
            } finally {
                // FIXED: Security fix - Ensure resources are closed
                CloseableKt.closeFinally(bufferedReader, null);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e) {
                        Log.w(TAG, "Error closing input stream", e);
                    }
                }
            }
        } else {
            Log.e(TAG, "HTTP error: " + responseCode);
        }
        
        // FIXED: Security fix - Disconnect connection in finally block
        if (connection != null) {
            try {
                connection.disconnect();
            } catch (Exception e) {
                Log.w(TAG, "Error disconnecting connection", e);
            }
        }
        
        return null;
    }

    public static final /* synthetic */ <T> T parseJson(String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            Gson gson = new Gson();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) gson.fromJson(response, (Class) Object.class);
        } catch (Exception e) {
            Log.e(TAG, "Error parsing JSON string", e);
            return null;
        }
    }

    public static /* synthetic */ AudioClip convertWavToMonoWithMaxSeconds$default(Context context, Uri uri, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 30;
        }
        return convertWavToMonoWithMaxSeconds(context, uri, i);
    }

    public static final AudioClip convertWavToMonoWithMaxSeconds(Context context, Uri stereoUri, int maxSeconds) {
        FileInputStream inputStream;
        byte[] sixteenBitBytes;
        short[] mono;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stereoUri, "stereoUri");
        Log.d(TAG, "Start to convert wav file to mono channel");
        try {
            if (stereoUri.getScheme() == null || Intrinsics.areEqual(stereoUri.getScheme(), "file")) {
                String path = stereoUri.getPath();
                if (path == null) {
                    path = "";
                }
                inputStream = new FileInputStream(path);
            } else {
                inputStream = context.getContentResolver().openInputStream(stereoUri);
            }
            if (inputStream == null) {
                return null;
            }
            byte[] originalBytes = ByteStreamsKt.readBytes(inputStream);
            inputStream.close();
            if (originalBytes.length < 44) {
                Log.e(TAG, "Not a valid wav file");
                return null;
            }
            ByteBuffer headerBuffer = ByteBuffer.wrap(originalBytes, 0, 44).order(ByteOrder.LITTLE_ENDIAN);
            short channels = headerBuffer.getShort(22);
            int sampleRate = headerBuffer.getInt(24);
            short bitDepth = headerBuffer.getShort(34);
            Log.d(TAG, "File metadata: channels: " + ((int) channels) + ", sampleRate: " + sampleRate + ", bitDepth: " + ((int) bitDepth));
            byte[] audioDataBytes = ArraysKt.copyOfRange(originalBytes, 44, originalBytes.length);
            if (bitDepth == 8) {
                Log.d(TAG, "Converting 8-bit audio to 16-bit.");
                sixteenBitBytes = convert8BitTo16Bit(audioDataBytes);
            } else {
                sixteenBitBytes = audioDataBytes;
            }
            ShortBuffer shortBuffer = ByteBuffer.wrap(sixteenBitBytes).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
            short[] pcmSamples = new short[shortBuffer.remaining()];
            shortBuffer.get(pcmSamples);
            if (sampleRate < 16000) {
                Log.d(TAG, "Resampling from " + sampleRate + " Hz to 16000 Hz.");
                pcmSamples = resample(pcmSamples, sampleRate, ConstsKt.SAMPLE_RATE, channels);
                sampleRate = ConstsKt.SAMPLE_RATE;
                Log.d(TAG, "Resampling complete. New sample count: " + pcmSamples.length);
            }
            if (channels == 2) {
                Log.d(TAG, "Converting stereo to mono.");
                mono = new short[pcmSamples.length / 2];
                int i = 0;
                int length = mono.length;
                while (i < length) {
                    short left = pcmSamples[i * 2];
                    short right = pcmSamples[(i * 2) + 1];
                    mono[i] = (short) ((left + right) / 2);
                    i++;
                    inputStream = inputStream;
                }
            } else {
                Log.d(TAG, "Audio is already mono. No channel conversion needed.");
                mono = pcmSamples;
            }
            short[] monoSamples = mono;
            int maxSamples = maxSeconds * sampleRate;
            if (monoSamples.length > maxSamples) {
                Log.d(TAG, "Trimming clip from " + monoSamples.length + " samples to " + maxSamples + " samples.");
                monoSamples = ArraysKt.copyOfRange(monoSamples, 0, maxSamples);
            }
            ByteBuffer monoByteBuffer = ByteBuffer.allocate(monoSamples.length * 2).order(ByteOrder.LITTLE_ENDIAN);
            monoByteBuffer.asShortBuffer().put(monoSamples);
            byte[] bArrArray = monoByteBuffer.array();
            Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
            return new AudioClip(bArrArray, sampleRate);
        } catch (Exception e) {
            Log.e(TAG, "Failed to convert wav to mono", e);
            return null;
        }
    }

    private static final byte[] convert8BitTo16Bit(byte[] eightBitData) {
        byte[] sixteenBitData = new byte[eightBitData.length * 2];
        ByteBuffer buffer = ByteBuffer.wrap(sixteenBitData).order(ByteOrder.LITTLE_ENDIAN);
        for (byte b : eightBitData) {
            int unsignedByte = b & 255;
            short sixteenBitSample = (short) ((unsignedByte + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) * 256);
            buffer.putShort(sixteenBitSample);
        }
        return sixteenBitData;
    }

    private static final short[] resample(short[] inputSamples, int originalSampleRate, int targetSampleRate, int channels) {
        double ratio;
        if (originalSampleRate == targetSampleRate) {
            return inputSamples;
        }
        double ratio2 = ((double) targetSampleRate) / ((double) originalSampleRate);
        int outputLength = (int) (((double) inputSamples.length) * ratio2);
        short[] resampledData = new short[outputLength];
        if (channels == 1) {
            int i = 0;
            int length = resampledData.length;
            while (i < length) {
                double position = ((double) i) / ratio2;
                int index1 = (int) Math.floor(position);
                int index2 = index1 + 1;
                double fraction = position - ((double) index1);
                int length2 = inputSamples.length;
                double ratio3 = AudioStats.AUDIO_AMPLITUDE_NONE;
                double sample1 = index1 < length2 ? inputSamples[index1] : 0.0d;
                if (index2 < inputSamples.length) {
                    ratio = ratio2;
                    ratio3 = inputSamples[index2];
                } else {
                    ratio = ratio2;
                }
                resampledData[i] = (short) (((((double) 1) - fraction) * sample1) + (ratio3 * fraction));
                i++;
                length = length;
                ratio2 = ratio;
            }
        }
        return resampledData;
    }

    public static final int calculatePeakAmplitude(byte[] buffer, int bytesRead) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ShortBuffer shortBuffer = ByteBuffer.wrap(buffer, 0, bytesRead).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
        int maxAmplitude = 0;
        while (shortBuffer.hasRemaining()) {
            int currentSample = Math.abs((int) shortBuffer.get());
            if (currentSample > maxAmplitude) {
                maxAmplitude = currentSample;
            }
        }
        return maxAmplitude;
    }

    public static final Bitmap decodeSampledBitmapFromUri(Context context, Uri uri, int reqWidth, int reqHeight) throws FileNotFoundException {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        InputStream inputStream;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (uri.getScheme() == null || Intrinsics.areEqual(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            fileInputStream = new FileInputStream(path);
        } else {
            fileInputStream = context.getContentResolver().openInputStream(uri);
        }
        if (fileInputStream != null) {
            inputStream = fileInputStream;
            try {
                InputStream it = inputStream;
                BitmapFactory.decodeStream(it, null, options);
                CloseableKt.closeFinally(inputStream, null);
            } finally {
            }
        }
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
        options.inJustDecodeBounds = false;
        if (uri.getScheme() == null || Intrinsics.areEqual(uri.getScheme(), "file")) {
            String path2 = uri.getPath();
            fileInputStream2 = new FileInputStream(path2 != null ? path2 : "");
        } else {
            fileInputStream2 = context.getContentResolver().openInputStream(uri);
        }
        if (fileInputStream2 == null) {
            return null;
        }
        inputStream = fileInputStream2;
        try {
            InputStream it2 = inputStream;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(it2, null, options);
            CloseableKt.closeFinally(inputStream, null);
            return bitmapDecodeStream;
        } finally {
        }
    }

    public static final Bitmap rotateBitmap(Bitmap bitmap, int orientation) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Matrix matrix = new Matrix();
        switch (orientation) {
            case 1:
                return bitmap;
            case 2:
                matrix.preScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.preScale(1.0f, -1.0f);
                break;
            case 5:
                matrix.postRotate(90.0f);
                matrix.preScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postRotate(270.0f);
                matrix.preScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.postRotate(270.0f);
                break;
            default:
                return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    private static final int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int height = options.outHeight;
        int width = options.outWidth;
        if (height <= reqHeight && width <= reqWidth) {
            return 1;
        }
        int heightRatio = MathKt.roundToInt(height / reqHeight);
        int widthRatio = MathKt.roundToInt(width / reqWidth);
        int inSampleSize = Math.max(heightRatio, widthRatio);
        return inSampleSize;
    }

    public static final ByteBuffer readFileToByteBuffer(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel fileChannel = fileInputStream.getChannel();
            Intrinsics.checkNotNullExpressionValue(fileChannel, "getChannel(...)");
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int) fileChannel.size());
            fileChannel.read(byteBuffer);
            byteBuffer.rewind();
            fileInputStream.close();
            return byteBuffer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final boolean isPixel10() {
        if (Build.MODEL == null) {
            return false;
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String lowerCase = MODEL.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "pixel 10", false, 2, (Object) null);
    }

    public static final Modifier clearFocusOnKeyboardDismiss(Modifier $this$clearFocusOnKeyboardDismiss) {
        Intrinsics.checkNotNullParameter($this$clearFocusOnKeyboardDismiss, "<this>");
        return ComposedModifierKt.composed$default($this$clearFocusOnKeyboardDismiss, null, new Function3() { // from class: com.google.ai.edge.gallery.common.UtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return UtilsKt.clearFocusOnKeyboardDismiss$lambda$13((Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier clearFocusOnKeyboardDismiss$lambda$13(Modifier composed, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        $composer.startReplaceGroup(-488122430);
        ComposerKt.sourceInformation($composer, "C351@11962L34,352@12039L34,367@12450L141:Utils.kt#cx9pa2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-488122430, $changed, -1, "com.google.ai.edge.gallery.common.clearFocusOnKeyboardDismiss.<anonymous> (Utils.kt:351)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, -934219260, "CC(remember):Utils.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        final MutableState isFocused$delegate = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -934216796, "CC(remember):Utils.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 == Composer.INSTANCE.getEmpty()) {
            Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        }
        final MutableState keyboardAppearedSinceLastFocused$delegate = (MutableState) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (clearFocusOnKeyboardDismiss$lambda$13$lambda$5(isFocused$delegate)) {
            $composer.startReplaceGroup(1104112491);
            ComposerKt.sourceInformation($composer, "355@12130L3,355@12157L7,356@12211L7,358@12253L176,358@12224L205");
            WindowInsets ime = WindowInsets_androidKt.getIme(WindowInsets.INSTANCE, $composer, 6);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer);
            boolean imeIsVisible = ime.getBottom((Density) objConsume) > 0;
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd($composer);
            FocusManager focusManager = (FocusManager) objConsume2;
            Boolean boolValueOf = Boolean.valueOf(imeIsVisible);
            ComposerKt.sourceInformationMarkerStart($composer, -934209806, "CC(remember):Utils.kt#9igjgp");
            boolean invalid$iv = $composer.changed(imeIsVisible) | $composer.changedInstance(focusManager);
            Object it$iv3 = $composer.rememberedValue();
            if (invalid$iv || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = (Function2) new UtilsKt$clearFocusOnKeyboardDismiss$1$1$1(imeIsVisible, focusManager, keyboardAppearedSinceLastFocused$delegate, null);
                $composer.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv3, $composer, 0);
        } else {
            $composer.startReplaceGroup(1092105664);
        }
        $composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart($composer, -934203537, "CC(remember):Utils.kt#9igjgp");
        Object it$iv4 = $composer.rememberedValue();
        if (it$iv4 == Composer.INSTANCE.getEmpty()) {
            Object value$iv4 = new Function1() { // from class: com.google.ai.edge.gallery.common.UtilsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UtilsKt.clearFocusOnKeyboardDismiss$lambda$13$lambda$12$lambda$11(isFocused$delegate, keyboardAppearedSinceLastFocused$delegate, (FocusState) obj);
                }
            };
            $composer.updateRememberedValue(value$iv4);
            it$iv4 = value$iv4;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        Modifier modifierOnFocusEvent = FocusEventModifierKt.onFocusEvent(composed, (Function1) it$iv4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceGroup();
        return modifierOnFocusEvent;
    }

    private static final boolean clearFocusOnKeyboardDismiss$lambda$13$lambda$5(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void clearFocusOnKeyboardDismiss$lambda$13$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearFocusOnKeyboardDismiss$lambda$13$lambda$8(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearFocusOnKeyboardDismiss$lambda$13$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearFocusOnKeyboardDismiss$lambda$13$lambda$12$lambda$11(MutableState $isFocused$delegate, MutableState $keyboardAppearedSinceLastFocused$delegate, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (clearFocusOnKeyboardDismiss$lambda$13$lambda$5($isFocused$delegate) != it.isFocused()) {
            clearFocusOnKeyboardDismiss$lambda$13$lambda$6($isFocused$delegate, it.isFocused());
            if (clearFocusOnKeyboardDismiss$lambda$13$lambda$5($isFocused$delegate)) {
                clearFocusOnKeyboardDismiss$lambda$13$lambda$9($keyboardAppearedSinceLastFocused$delegate, false);
            }
        }
        return Unit.INSTANCE;
    }

    public static final boolean isAICoreSupported(Set<String> set) {
        String str;
        Set<String> set2 = set;
        if (!(set2 == null || set2.isEmpty()) && (str = Build.MODEL) != null) {
            String currentModel = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(currentModel, "toLowerCase(...)");
            if (currentModel != null) {
                return set.contains(currentModel);
            }
        }
        return false;
    }
}
