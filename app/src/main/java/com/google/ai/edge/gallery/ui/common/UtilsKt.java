package com.google.ai.edge.gallery.ui.common;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.DrawModifierKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.graphics.BlendMode;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.graphics.CompositingStrategy;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.graphics.TileMode;
import androidx.compose.p000ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.AnnotatedString;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0007\u001a\u0013\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012\u001a\u001e\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0001\u001a<\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"\u001a\u000e\u0010#\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001\u001aO\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000f2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00112\b\b\u0002\u0010-\u001a\u00020\fH\u0007¢\u0006\u0004\b.\u0010/\u001a]\u00100\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020*2\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00112\b\b\u0002\u0010-\u001a\u00020\f2\b\b\u0002\u00103\u001a\u000204H\u0007¢\u0006\u0004\b5\u00106\u001aG\u00100\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\u0006\u00107\u001a\u00020\f2\b\b\u0002\u0010)\u001a\u00020*2\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\b\b\u0002\u0010-\u001a\u00020\fH\u0007¢\u0006\u0004\b:\u0010;\u001a1\u0010<\u001a\u00020\f2\b\b\u0002\u0010=\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u00012\b\b\u0002\u0010?\u001a\u00020@H\u0007¢\u0006\u0002\u0010A\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006B²\u0006\n\u0010C\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010D\u001a\u00020\fX\u008a\u0084\u0002"}, m922d2 = {"TAG", "", "SMALL_BUTTON_CONTENT_PADDING", "Landroidx/compose/foundation/layout/PaddingValues;", "getSMALL_BUTTON_CONTENT_PADDING", "()Landroidx/compose/foundation/layout/PaddingValues;", "humanReadableSize", "", "si", "", "extraDecimalForGbAndAbove", "humanReadableDuration", "", "formatToHourMinSecond", "getDistinctiveColor", "Landroidx/compose/ui/graphics/Color;", FirebaseAnalytics.Param.INDEX, "", "(I)J", "createTempPictureUri", "Landroid/net/Uri;", "Landroid/content/Context;", "fileName", "fileExtension", "checkNotificationPermissionAndStartDownload", "", "context", "launcher", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "task", "Lcom/google/ai/edge/gallery/data/Task;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "ensureValidFileName", "SwipingText", "text", "style", "Landroidx/compose/ui/text/TextStyle;", "color", "modifier", "Landroidx/compose/ui/Modifier;", "animationDelay", "animationDurationMs", "edgeGradientRelativeSize", "SwipingText-TgFrcIs", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/Modifier;JIFLandroidx/compose/runtime/Composer;II)V", "RevealingText", "annotatedText", "Landroidx/compose/ui/text/AnnotatedString;", "extraTextPadding", "Landroidx/compose/ui/unit/Dp;", "RevealingText-egy_3UM", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;JIFFLandroidx/compose/runtime/Composer;II)V", "animationProgress", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "RevealingText-UkQjaSs", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/Modifier;Landroidx/compose/ui/text/style/TextAlign;FLandroidx/compose/runtime/Composer;II)V", "rememberDelayedAnimationProgress", "initialDelay", "animationLabel", "easing", "Landroidx/compose/animation/core/Easing;", "(JILjava/lang/String;Landroidx/compose/animation/core/Easing;Landroidx/compose/runtime/Composer;II)F", "app_debug", "startAnimation", NotificationCompat.CATEGORY_PROGRESS}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class UtilsKt {
    private static final PaddingValues SMALL_BUTTON_CONTENT_PADDING = PaddingKt.m1984PaddingValuesa9UjIt4(C1654Dp.m9788constructorimpl(16), C1654Dp.m9788constructorimpl(8), C1654Dp.m9788constructorimpl(16), C1654Dp.m9788constructorimpl(8));
    private static final String TAG = "AGUtils";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RevealingText_UkQjaSs$lambda$11(String str, TextStyle textStyle, float f, Modifier modifier, TextAlign textAlign, float f2, int i, int i2, Composer composer, int i3) {
        m10903RevealingTextUkQjaSs(str, textStyle, f, modifier, textAlign, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RevealingText_egy_3UM$lambda$7(String str, TextStyle textStyle, Modifier modifier, AnnotatedString annotatedString, long j, int i, float f, float f2, int i2, int i3, Composer composer, int i4) {
        m10904RevealingTextegy_3UM(str, textStyle, modifier, annotatedString, j, i, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipingText_TgFrcIs$lambda$3(String str, TextStyle textStyle, long j, Modifier modifier, long j2, int i, float f, int i2, int i3, Composer composer, int i4) {
        m10905SwipingTextTgFrcIs(str, textStyle, j, modifier, j2, i, f, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final PaddingValues getSMALL_BUTTON_CONTENT_PADDING() {
        return SMALL_BUTTON_CONTENT_PADDING;
    }

    public static /* synthetic */ String humanReadableSize$default(long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return humanReadableSize(j, z, z2);
    }

    public static final String humanReadableSize(long $this$humanReadableSize, boolean si, boolean extraDecimalForGbAndAbove) {
        int unit = si ? 1000 : 1024;
        if ($this$humanReadableSize < unit) {
            return $this$humanReadableSize + " B";
        }
        int exp = (int) (Math.log($this$humanReadableSize) / Math.log(unit));
        String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp - 1) + (si ? "" : "i");
        String formatString = "%.1f %sB";
        if (extraDecimalForGbAndAbove) {
            String lowerCase = pre.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!Intrinsics.areEqual(lowerCase, "k") && !Intrinsics.areEqual(pre, "M")) {
                formatString = "%.2f %sB";
            }
        }
        String str = String.format(formatString, Arrays.copyOf(new Object[]{Double.valueOf($this$humanReadableSize / Math.pow(unit, exp)), pre}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final String humanReadableDuration(float $this$humanReadableDuration) {
        if ($this$humanReadableDuration < 1000.0f) {
            return $this$humanReadableDuration + " ms";
        }
        float seconds = $this$humanReadableDuration / 1000.0f;
        if (seconds < 60.0f) {
            String str = String.format("%.1f s", Arrays.copyOf(new Object[]{Float.valueOf(seconds)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        float minutes = seconds / 60.0f;
        if (minutes < 60.0f) {
            String str2 = String.format("%.1f min", Arrays.copyOf(new Object[]{Float.valueOf(minutes)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        float hours = minutes / 60.0f;
        String str3 = String.format("%.1f h", Arrays.copyOf(new Object[]{Float.valueOf(hours)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }

    public static final String formatToHourMinSecond(long $this$formatToHourMinSecond) {
        if ($this$formatToHourMinSecond >= 0) {
            long seconds = $this$formatToHourMinSecond / ((long) 1000);
            long j = 3600;
            long hours = seconds / j;
            long j2 = 60;
            long minutes = (seconds % j) / j2;
            long remainingSeconds = seconds % j2;
            List parts = new ArrayList();
            if (hours > 0) {
                parts.add(hours + " h");
            }
            if (minutes > 0) {
                parts.add(minutes + " min");
            }
            if (remainingSeconds > 0 || (hours == 0 && minutes == 0)) {
                parts.add(remainingSeconds + " sec");
            }
            return CollectionsKt.joinToString$default(parts, " ", null, null, 0, null, null, 62, null);
        }
        return "-";
    }

    public static final long getDistinctiveColor(int index) {
        List colors = CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4282168395L)), Color.m6905boximpl(ColorKt.Color(4294959385L)), Color.m6905boximpl(ColorKt.Color(4282606552L)), Color.m6905boximpl(ColorKt.Color(4294279729L)), Color.m6905boximpl(ColorKt.Color(4287700660L)), Color.m6905boximpl(ColorKt.Color(4282839280L)), Color.m6905boximpl(ColorKt.Color(4293931750L)), Color.m6905boximpl(ColorKt.Color(4290573836L)), Color.m6905boximpl(ColorKt.Color(4294622910L)), Color.m6905boximpl(ColorKt.Color(4278222976L)), Color.m6905boximpl(ColorKt.Color(4293312255L)), Color.m6905boximpl(ColorKt.Color(4288308004L)), Color.m6905boximpl(ColorKt.Color(4294965960L)), Color.m6905boximpl(ColorKt.Color(4286578688L)), Color.m6905boximpl(ColorKt.Color(4289396675L)), Color.m6905boximpl(ColorKt.Color(4286611456L)), Color.m6905boximpl(ColorKt.Color(4294957233L)), Color.m6905boximpl(ColorKt.Color(4278190197L))});
        return ((Color) colors.get(index % colors.size())).m6925unboximpl();
    }

    public static /* synthetic */ Uri createTempPictureUri$default(Context context, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "picture_" + System.currentTimeMillis();
        }
        if ((i & 2) != 0) {
            str2 = ".png";
        }
        return createTempPictureUri(context, str, str2);
    }

    public static final Uri createTempPictureUri(Context $this$createTempPictureUri, String fileName, String fileExtension) throws XmlPullParserException, IOException {
        Intrinsics.checkNotNullParameter($this$createTempPictureUri, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
        File tempFile = File.createTempFile(fileName, fileExtension, $this$createTempPictureUri.getCacheDir());
        tempFile.createNewFile();
        Uri uriForFile = FileProvider.getUriForFile($this$createTempPictureUri.getApplicationContext(), "com.google.ai.edge.gallery.provider", tempFile);
        Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }

    public static final void checkNotificationPermissionAndStartDownload(Context context, ManagedActivityResultLauncher<String, Boolean> launcher, ModelManagerViewModel modelManagerViewModel, Task task, Model model) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(model, "model");
        if (ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            modelManagerViewModel.downloadModel(task, model);
        } else if (Build.VERSION.SDK_INT >= 33) {
            launcher.launch("android.permission.POST_NOTIFICATIONS");
        }
    }

    public static final String ensureValidFileName(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new Regex("[^a-zA-Z0-9._-]").replace(fileName, "_");
    }

    /* JADX INFO: renamed from: SwipingText-TgFrcIs, reason: not valid java name */
    public static final void m10905SwipingTextTgFrcIs(final String text, final TextStyle style, final long color, Modifier modifier, long animationDelay, int animationDurationMs, float edgeGradientRelativeSize, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        long j;
        int i2;
        float f;
        Composer $composer2;
        Modifier modifier3;
        long animationDelay2;
        int animationDurationMs2;
        float edgeGradientRelativeSize2;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer $composer3 = $composer.startRestartGroup(2066823691);
        ComposerKt.sourceInformation($composer3, "C(SwipingText)P(6,5,2:c#ui.graphics.Color,4)211@6556L193,230@7140L20,217@6752L413:Utils.kt#t7sjiu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(text) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(style) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(color) ? 256 : 128;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty |= 24576;
            j = animationDelay;
        } else if (($changed & 24576) == 0) {
            j = animationDelay;
            $dirty |= $composer3.changed(j) ? 16384 : 8192;
        } else {
            j = animationDelay;
        }
        int i5 = i & 32;
        if (i5 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f249xf2722a21;
            i2 = animationDurationMs;
        } else if ((196608 & $changed) == 0) {
            i2 = animationDurationMs;
            $dirty |= $composer3.changed(i2) ? 131072 : 65536;
        } else {
            i2 = animationDurationMs;
        }
        int i6 = i & 64;
        if (i6 != 0) {
            $dirty |= 1572864;
            f = edgeGradientRelativeSize;
        } else if (($changed & 1572864) == 0) {
            f = edgeGradientRelativeSize;
            $dirty |= $composer3.changed(f) ? 1048576 : 524288;
        } else {
            f = edgeGradientRelativeSize;
        }
        if ($composer3.shouldExecute(($dirty & 599187) != 599186, $dirty & 1)) {
            Modifier.Companion modifier4 = i3 != 0 ? Modifier.INSTANCE : modifier2;
            animationDelay2 = i4 != 0 ? 0L : j;
            animationDurationMs2 = i5 != 0 ? 300 : i2;
            edgeGradientRelativeSize2 = i6 != 0 ? 1.0f : f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2066823691, $dirty, -1, "com.google.ai.edge.gallery.ui.common.SwipingText (Utils.kt:209)");
            }
            int $dirty2 = $dirty;
            final float progress = rememberDelayedAnimationProgress(animationDelay2, animationDurationMs2, "swiping text", EasingKt.getLinearEasing(), $composer3, (($dirty >> 12) & 14) | 384 | (($dirty >> 12) & 112), 0);
            TextStyle textStyleM9203copyNs73l9s$default = TextStyle.m9203copyNs73l9s$default(style, Brush.INSTANCE.m6876linearGradientmHitzGk((Pair<Float, Color>[]) new Pair[]{TuplesKt.m929to(Float.valueOf(((edgeGradientRelativeSize2 + 1.0f) * progress) - edgeGradientRelativeSize2), Color.m6905boximpl(color)), TuplesKt.m929to(Float.valueOf((edgeGradientRelativeSize2 + 1.0f) * progress), Color.m6905boximpl(Color.INSTANCE.m6950getTransparent0d7_KjU()))}, (8 & 2) != 0 ? Offset.INSTANCE.m6686getZeroF1C5BW0() : 0L, (8 & 4) != 0 ? Offset.INSTANCE.m6684getInfiniteF1C5BW0() : 0L, (8 & 8) != 0 ? TileMode.INSTANCE.m7312getClamp3opZhB0() : 0), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1942702783, "CC(remember):Utils.kt#9igjgp");
            boolean invalid$iv = $composer3.changed(progress);
            Object it$iv = $composer3.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.UtilsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UtilsKt.SwipingText_TgFrcIs$lambda$2$lambda$1(progress, (GraphicsLayerScope) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            modifier3 = modifier4;
            TextKt.m4781TextNvy7gAk(text, GraphicsLayerModifierKt.graphicsLayer(modifier4, (Function1) it$iv), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleM9203copyNs73l9s$default, $composer2, $dirty2 & 14, 0, 131068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            animationDelay2 = j;
            animationDurationMs2 = i2;
            edgeGradientRelativeSize2 = f;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            final long j2 = animationDelay2;
            final int i7 = animationDurationMs2;
            final float f2 = edgeGradientRelativeSize2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.UtilsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UtilsKt.SwipingText_TgFrcIs$lambda$3(text, style, color, modifier5, j2, i7, f2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipingText_TgFrcIs$lambda$2$lambda$1(float $progress, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha($progress);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: RevealingText-egy_3UM, reason: not valid java name */
    public static final void m10904RevealingTextegy_3UM(final String text, final TextStyle style, Modifier modifier, AnnotatedString annotatedText, long animationDelay, int animationDurationMs, float edgeGradientRelativeSize, float extraTextPadding, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        AnnotatedString annotatedString;
        long j;
        Composer $composer2;
        int animationDurationMs2;
        float edgeGradientRelativeSize2;
        float extraTextPadding2;
        Modifier modifier3;
        AnnotatedString annotatedText2;
        long animationDelay2;
        float extraTextPadding3;
        Composer $composer$iv;
        Composer $composer$iv$iv;
        Composer $composer$iv2;
        Composer $composer$iv$iv$iv;
        Composer $composer3;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer $composer4 = $composer.startRestartGroup(-1806941055);
        ComposerKt.sourceInformation($composer4, "C(RevealingText)P(7,6,5,2!,4:c#ui.unit.Dp)260@8379L166,278@8970L103,274@8819L551:Utils.kt#t7sjiu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer4.changed(text) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer4.changed(style) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer4.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            annotatedString = annotatedText;
        } else if (($changed & 3072) == 0) {
            annotatedString = annotatedText;
            $dirty |= $composer4.changed(annotatedString) ? 2048 : 1024;
        } else {
            annotatedString = annotatedText;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty |= 24576;
            j = animationDelay;
        } else if (($changed & 24576) == 0) {
            j = animationDelay;
            $dirty |= $composer4.changed(j) ? 16384 : 8192;
        } else {
            j = animationDelay;
        }
        int i5 = i & 32;
        if (i5 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f249xf2722a21;
        } else if (($changed & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty |= $composer4.changed(animationDurationMs) ? 131072 : 65536;
        }
        int i6 = i & 64;
        if (i6 != 0) {
            $dirty |= 1572864;
        } else if (($changed & 1572864) == 0) {
            $dirty |= $composer4.changed(edgeGradientRelativeSize) ? 1048576 : 524288;
        }
        int i7 = i & 128;
        if (i7 != 0) {
            $dirty |= 12582912;
        } else if (($changed & 12582912) == 0) {
            $dirty |= $composer4.changed(extraTextPadding) ? 8388608 : 4194304;
        }
        if ($composer4.shouldExecute(($dirty & 4793491) != 4793490, $dirty & 1)) {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i3 == 0) {
                annotatedText2 = annotatedString;
            } else {
                annotatedText2 = null;
            }
            if (i4 == 0) {
                animationDelay2 = j;
            } else {
                animationDelay2 = 0;
            }
            if (i5 == 0) {
                animationDurationMs2 = animationDurationMs;
            } else {
                animationDurationMs2 = 300;
            }
            if (i6 == 0) {
                edgeGradientRelativeSize2 = edgeGradientRelativeSize;
            } else {
                edgeGradientRelativeSize2 = 0.5f;
            }
            if (i7 == 0) {
                extraTextPadding3 = extraTextPadding;
            } else {
                extraTextPadding3 = C1654Dp.m9788constructorimpl(16);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1806941055, $dirty, -1, "com.google.ai.edge.gallery.ui.common.RevealingText (Utils.kt:258)");
            }
            float progress = rememberDelayedAnimationProgress(animationDelay2, animationDurationMs2, "revealing text", null, $composer4, (($dirty >> 12) & 14) | 384 | (($dirty >> 12) & 112), 8);
            final Brush maskBrush = Brush.INSTANCE.m6876linearGradientmHitzGk((Pair<Float, Color>[]) new Pair[]{TuplesKt.m929to(Float.valueOf(((edgeGradientRelativeSize2 + 1.0f) * progress) - edgeGradientRelativeSize2), Color.m6905boximpl(Color.INSTANCE.m6950getTransparent0d7_KjU())), TuplesKt.m929to(Float.valueOf((edgeGradientRelativeSize2 + 1.0f) * progress), Color.m6905boximpl(Color.INSTANCE.m6949getRed0d7_KjU()))}, (8 & 2) != 0 ? Offset.INSTANCE.m6686getZeroF1C5BW0() : 0L, (8 & 4) != 0 ? Offset.INSTANCE.m6684getInfiniteF1C5BW0() : 0L, (8 & 8) != 0 ? TileMode.INSTANCE.m7312getClamp3opZhB0() : 0);
            Modifier modifierM7082graphicsLayer_6ThJ44$default = GraphicsLayerModifierKt.m7082graphicsLayer_6ThJ44$default(modifier3, 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, CompositingStrategy.INSTANCE.m7008getOffscreenNrFUSI(), 0, null, 458747, null);
            ComposerKt.sourceInformationMarkerStart($composer4, -1303537560, "CC(remember):Utils.kt#9igjgp");
            boolean invalid$iv = $composer4.changed(maskBrush);
            Object it$iv = $composer4.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.UtilsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UtilsKt.RevealingText_egy_3UM$lambda$5$lambda$4(maskBrush, (ContentDrawScope) obj);
                    }
                };
                $composer4.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer4);
            Modifier modifier$iv = DrawModifierKt.drawWithContent(modifierM7082graphicsLayer_6ThJ44$default, (Function1) it$iv);
            Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer4, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer4, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer4, 0));
            CompositionLocalMap localMap$iv$iv = $composer4.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer4, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer4.startReusableNode();
            if ($composer4.getInserting()) {
                $composer4.createNode(constructor);
            } else {
                $composer4.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer4);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer4, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i9 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer4, 179180908, "C:Utils.kt#t7sjiu");
            if (annotatedText2 != null) {
                $composer4.startReplaceGroup(179203599);
                ComposerKt.sourceInformation($composer4, "285@9161L94");
                $composer$iv$iv = $composer4;
                $composer$iv2 = $composer4;
                $composer2 = $composer4;
                $composer$iv$iv$iv = $composer4;
                $composer$iv = $composer4;
                TextKt.m4782TextZ58ophY(annotatedText2, PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, extraTextPadding3, 0.0f, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, style, $composer4, ($dirty >> 9) & 14, ($dirty << 21) & 234881024, 262140);
                $composer4.endReplaceGroup();
                $composer3 = $composer4;
                extraTextPadding2 = extraTextPadding3;
            } else {
                $composer$iv = $composer4;
                int $dirty2 = $dirty;
                $composer$iv$iv = $composer4;
                $composer$iv2 = $composer4;
                $composer2 = $composer4;
                $composer$iv$iv$iv = $composer4;
                $composer4.startReplaceGroup(179316408);
                ComposerKt.sourceInformation($composer4, "287@9275L85");
                $composer3 = $composer4;
                extraTextPadding2 = extraTextPadding3;
                TextKt.m4781TextNvy7gAk(text, PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, extraTextPadding3, 0.0f, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style, $composer3, $dirty2 & 14, ($dirty2 << 18) & 29360128, 131068);
                $composer3.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            $composer$iv$iv$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
            animationDurationMs2 = animationDurationMs;
            edgeGradientRelativeSize2 = edgeGradientRelativeSize;
            extraTextPadding2 = extraTextPadding;
            modifier3 = modifier2;
            annotatedText2 = annotatedString;
            animationDelay2 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            final AnnotatedString annotatedString2 = annotatedText2;
            final long j2 = animationDelay2;
            final int i10 = animationDurationMs2;
            final float f = edgeGradientRelativeSize2;
            final float f2 = extraTextPadding2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.UtilsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UtilsKt.RevealingText_egy_3UM$lambda$7(text, style, modifier4, annotatedString2, j2, i10, f, f2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RevealingText_egy_3UM$lambda$5$lambda$4(Brush $maskBrush, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        DrawScope.m7489drawRectAsUm42w$default(drawWithContent, $maskBrush, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m6837getDstOut0nO6VwU(), 62, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: RevealingText-UkQjaSs, reason: not valid java name */
    public static final void m10903RevealingTextUkQjaSs(final String text, final TextStyle style, final float animationProgress, Modifier modifier, TextAlign textAlign, float edgeGradientRelativeSize, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        TextAlign textAlign2;
        float edgeGradientRelativeSize2;
        Composer $composer2;
        Modifier modifier3;
        TextAlign textAlign3;
        Modifier modifier4;
        float edgeGradientRelativeSize3;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer $composer3 = $composer.startRestartGroup(-676935853);
        ComposerKt.sourceInformation($composer3, "C(RevealingText)P(4,3!1,2,5:c#ui.text.style.TextAlign)315@10096L103,311@9945L439:Utils.kt#t7sjiu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(text) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(style) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(animationProgress) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 16;
        if (i3 != 0) {
            $dirty |= 24576;
            textAlign2 = textAlign;
        } else if (($changed & 24576) == 0) {
            textAlign2 = textAlign;
            $dirty |= $composer3.changed(textAlign2) ? 16384 : 8192;
        } else {
            textAlign2 = textAlign;
        }
        int i4 = i & 32;
        if (i4 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f249xf2722a21;
            edgeGradientRelativeSize2 = edgeGradientRelativeSize;
        } else if ((196608 & $changed) == 0) {
            edgeGradientRelativeSize2 = edgeGradientRelativeSize;
            $dirty |= $composer3.changed(edgeGradientRelativeSize2) ? 131072 : 65536;
        } else {
            edgeGradientRelativeSize2 = edgeGradientRelativeSize;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i3 == 0) {
                textAlign3 = textAlign2;
            } else {
                textAlign3 = null;
            }
            if (i4 == 0) {
                edgeGradientRelativeSize3 = edgeGradientRelativeSize2;
            } else {
                edgeGradientRelativeSize3 = 0.5f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-676935853, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.RevealingText (Utils.kt:301)");
            }
            final Brush maskBrush = Brush.INSTANCE.m6876linearGradientmHitzGk((Pair<Float, Color>[]) new Pair[]{TuplesKt.m929to(Float.valueOf(((edgeGradientRelativeSize3 + 1.0f) * animationProgress) - edgeGradientRelativeSize3), Color.m6905boximpl(Color.INSTANCE.m6950getTransparent0d7_KjU())), TuplesKt.m929to(Float.valueOf((edgeGradientRelativeSize3 + 1.0f) * animationProgress), Color.m6905boximpl(Color.INSTANCE.m6949getRed0d7_KjU()))}, (8 & 2) != 0 ? Offset.INSTANCE.m6686getZeroF1C5BW0() : 0L, (8 & 4) != 0 ? Offset.INSTANCE.m6684getInfiniteF1C5BW0() : 0L, (8 & 8) != 0 ? TileMode.INSTANCE.m7312getClamp3opZhB0() : 0);
            Modifier modifierM7082graphicsLayer_6ThJ44$default = GraphicsLayerModifierKt.m7082graphicsLayer_6ThJ44$default(modifier4, 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, CompositingStrategy.INSTANCE.m7008getOffscreenNrFUSI(), 0, null, 458747, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -1995272198, "CC(remember):Utils.kt#9igjgp");
            boolean invalid$iv = $composer3.changed(maskBrush);
            Object it$iv = $composer3.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.UtilsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UtilsKt.RevealingText_UkQjaSs$lambda$9$lambda$8(maskBrush, (ContentDrawScope) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifier$iv = DrawModifierKt.drawWithContent(modifierM7082graphicsLayer_6ThJ44$default, (Function1) it$iv);
            Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i6 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -1570225462, "C321@10252L128:Utils.kt#t7sjiu");
            Modifier materialized$iv$iv2 = PaddingKt.m1990paddingVpY3zN4$default(modifier4, C1654Dp.m9788constructorimpl(16), 0.0f, 2, null);
            modifier3 = modifier4;
            $composer2 = $composer3;
            TextKt.m4781TextNvy7gAk(text, materialized$iv$iv2, 0L, null, 0L, null, null, null, 0L, null, textAlign3, 0L, 0, false, 0, 0, null, style, $composer3, $dirty2 & 14, (($dirty2 >> 12) & 14) | (($dirty2 << 18) & 29360128), 130044);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            edgeGradientRelativeSize2 = edgeGradientRelativeSize3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            textAlign3 = textAlign2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            final TextAlign textAlign4 = textAlign3;
            final float f = edgeGradientRelativeSize2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.UtilsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UtilsKt.RevealingText_UkQjaSs$lambda$11(text, style, animationProgress, modifier5, textAlign4, f, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RevealingText_UkQjaSs$lambda$9$lambda$8(Brush $maskBrush, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        DrawScope.m7489drawRectAsUm42w$default(drawWithContent, $maskBrush, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m6837getDstOut0nO6VwU(), 62, null);
        return Unit.INSTANCE;
    }

    public static final float rememberDelayedAnimationProgress(long initialDelay, int animationDurationMs, String animationLabel, Easing easing, Composer $composer, int $changed, int i) {
        long initialDelay2;
        Easing easing2;
        Intrinsics.checkNotNullParameter(animationLabel, "animationLabel");
        ComposerKt.sourceInformationMarkerStart($composer, -495896220, "C(rememberDelayedAnimationProgress)P(3)345@10941L34,347@11005L178,352@11207L55,352@11186L76:Utils.kt#t7sjiu");
        if ((i & 1) != 0) {
            initialDelay2 = 0;
        } else {
            initialDelay2 = initialDelay;
        }
        if ((i & 8) == 0) {
            easing2 = easing;
        } else {
            easing2 = EasingKt.getFastOutSlowInEasing();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-495896220, $changed, -1, "com.google.ai.edge.gallery.ui.common.rememberDelayedAnimationProgress (Utils.kt:344)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 185109030, "CC(remember):Utils.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        MutableState startAnimation$delegate = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(rememberDelayedAnimationProgress$lambda$13(startAnimation$delegate) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(animationDurationMs, 0, easing2, 2, null), 0.0f, animationLabel, null, $composer, ($changed << 3) & 7168, 20);
        Unit unit = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, 185117563, "CC(remember):Utils.kt#9igjgp");
        boolean invalid$iv = ((($changed & 14) ^ 6) > 4 && $composer.changed(initialDelay2)) || ($changed & 6) == 4;
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv || it$iv2 == Composer.INSTANCE.getEmpty()) {
            Object value$iv2 = (Function2) new UtilsKt$rememberDelayedAnimationProgress$1$1(initialDelay2, startAnimation$delegate, null);
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv2, $composer, 6);
        float fRememberDelayedAnimationProgress$lambda$15 = rememberDelayedAnimationProgress$lambda$15(stateAnimateFloatAsState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return fRememberDelayedAnimationProgress$lambda$15;
    }

    private static final boolean rememberDelayedAnimationProgress$lambda$13(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rememberDelayedAnimationProgress$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final float rememberDelayedAnimationProgress$lambda$15(State<Float> state) {
        Object thisObj$iv = state.getValue();
        return ((Number) thisObj$iv).floatValue();
    }
}
