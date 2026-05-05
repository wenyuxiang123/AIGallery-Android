package com.google.ai.edge.gallery.p006ui.theme;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.graphics.TileMode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.proto.Theme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Theme.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a \u0010\u0016\u001a\u00020\u00122\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00120\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n\"\u0015\u0010\r\u001a\u00020\u0005*\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m922d2 = {"lightScheme", "Landroidx/compose/material3/ColorScheme;", "darkScheme", "LocalCustomColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/google/ai/edge/gallery/ui/theme/CustomColors;", "getLocalCustomColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lightCustomColors", "getLightCustomColors", "()Lcom/google/ai/edge/gallery/ui/theme/CustomColors;", "darkCustomColors", "getDarkCustomColors", "customColors", "Landroidx/compose/material3/MaterialTheme;", "getCustomColors", "(Landroidx/compose/material3/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/google/ai/edge/gallery/ui/theme/CustomColors;", "StatusBarColorController", "", "useDarkTheme", "", "(ZLandroidx/compose/runtime/Composer;I)V", "GalleryTheme", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ThemeKt {
    private static final ProvidableCompositionLocal<CustomColors> LocalCustomColors;
    private static final CustomColors darkCustomColors;
    private static final ColorScheme darkScheme;
    private static final CustomColors lightCustomColors;
    private static final ColorScheme lightScheme;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryTheme$lambda$6(Function2 function2, int i, Composer composer, int i2) {
        GalleryTheme(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatusBarColorController$lambda$3(boolean z, int i, Composer composer, int i2) {
        StatusBarColorController(z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static {
        long primaryLight = ColorKt.getPrimaryLight();
        long onPrimaryLight = ColorKt.getOnPrimaryLight();
        long primaryContainerLight = ColorKt.getPrimaryContainerLight();
        long onPrimaryContainerLight = ColorKt.getOnPrimaryContainerLight();
        long secondaryLight = ColorKt.getSecondaryLight();
        long onSecondaryLight = ColorKt.getOnSecondaryLight();
        long secondaryContainerLight = ColorKt.getSecondaryContainerLight();
        long onSecondaryContainerLight = ColorKt.getOnSecondaryContainerLight();
        long tertiaryLight = ColorKt.getTertiaryLight();
        long onTertiaryLight = ColorKt.getOnTertiaryLight();
        long tertiaryContainerLight = ColorKt.getTertiaryContainerLight();
        long onTertiaryContainerLight = ColorKt.getOnTertiaryContainerLight();
        long errorLight = ColorKt.getErrorLight();
        long onErrorLight = ColorKt.getOnErrorLight();
        long errorContainerLight = ColorKt.getErrorContainerLight();
        long onErrorContainerLight = ColorKt.getOnErrorContainerLight();
        long backgroundLight = ColorKt.getBackgroundLight();
        long onBackgroundLight = ColorKt.getOnBackgroundLight();
        long surfaceLight = ColorKt.getSurfaceLight();
        long onSurfaceLight = ColorKt.getOnSurfaceLight();
        long surfaceVariantLight = ColorKt.getSurfaceVariantLight();
        long onSurfaceVariantLight = ColorKt.getOnSurfaceVariantLight();
        long outlineLight = ColorKt.getOutlineLight();
        long outlineVariantLight = ColorKt.getOutlineVariantLight();
        long scrimLight = ColorKt.getScrimLight();
        lightScheme = ColorSchemeKt.m3755lightColorScheme_VG5OTI$default(primaryLight, onPrimaryLight, primaryContainerLight, onPrimaryContainerLight, ColorKt.getInversePrimaryLight(), secondaryLight, onSecondaryLight, secondaryContainerLight, onSecondaryContainerLight, tertiaryLight, onTertiaryLight, tertiaryContainerLight, onTertiaryContainerLight, backgroundLight, onBackgroundLight, surfaceLight, onSurfaceLight, surfaceVariantLight, onSurfaceVariantLight, 0L, ColorKt.getInverseSurfaceLight(), ColorKt.getInverseOnSurfaceLight(), errorLight, onErrorLight, errorContainerLight, onErrorContainerLight, outlineLight, outlineVariantLight, scrimLight, ColorKt.getSurfaceBrightLight(), ColorKt.getSurfaceContainerLight(), ColorKt.getSurfaceContainerHighLight(), ColorKt.getSurfaceContainerHighestLight(), ColorKt.getSurfaceContainerLowLight(), ColorKt.getSurfaceContainerLowestLight(), ColorKt.getSurfaceDimLight(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 524288, 65520, null);
        long primaryDark = ColorKt.getPrimaryDark();
        long onPrimaryDark = ColorKt.getOnPrimaryDark();
        long primaryContainerDark = ColorKt.getPrimaryContainerDark();
        long onPrimaryContainerDark = ColorKt.getOnPrimaryContainerDark();
        long secondaryDark = ColorKt.getSecondaryDark();
        long onSecondaryDark = ColorKt.getOnSecondaryDark();
        long secondaryContainerDark = ColorKt.getSecondaryContainerDark();
        long onSecondaryContainerDark = ColorKt.getOnSecondaryContainerDark();
        long tertiaryDark = ColorKt.getTertiaryDark();
        long onTertiaryDark = ColorKt.getOnTertiaryDark();
        long tertiaryContainerDark = ColorKt.getTertiaryContainerDark();
        long onTertiaryContainerDark = ColorKt.getOnTertiaryContainerDark();
        long errorDark = ColorKt.getErrorDark();
        long onErrorDark = ColorKt.getOnErrorDark();
        long errorContainerDark = ColorKt.getErrorContainerDark();
        long onErrorContainerDark = ColorKt.getOnErrorContainerDark();
        long backgroundDark = ColorKt.getBackgroundDark();
        long onBackgroundDark = ColorKt.getOnBackgroundDark();
        long surfaceDark = ColorKt.getSurfaceDark();
        long onSurfaceDark = ColorKt.getOnSurfaceDark();
        long surfaceVariantDark = ColorKt.getSurfaceVariantDark();
        long onSurfaceVariantDark = ColorKt.getOnSurfaceVariantDark();
        long outlineDark = ColorKt.getOutlineDark();
        long outlineVariantDark = ColorKt.getOutlineVariantDark();
        long scrimDark = ColorKt.getScrimDark();
        darkScheme = ColorSchemeKt.m3749darkColorScheme_VG5OTI$default(primaryDark, onPrimaryDark, primaryContainerDark, onPrimaryContainerDark, ColorKt.getInversePrimaryDark(), secondaryDark, onSecondaryDark, secondaryContainerDark, onSecondaryContainerDark, tertiaryDark, onTertiaryDark, tertiaryContainerDark, onTertiaryContainerDark, backgroundDark, onBackgroundDark, surfaceDark, onSurfaceDark, surfaceVariantDark, onSurfaceVariantDark, 0L, ColorKt.getInverseSurfaceDark(), ColorKt.getInverseOnSurfaceDark(), errorDark, onErrorDark, errorContainerDark, onErrorContainerDark, outlineDark, outlineVariantDark, scrimDark, ColorKt.getSurfaceBrightDark(), ColorKt.getSurfaceContainerDark(), ColorKt.getSurfaceContainerHighDark(), ColorKt.getSurfaceContainerHighestDark(), ColorKt.getSurfaceContainerLowDark(), ColorKt.getSurfaceContainerLowestDark(), ColorKt.getSurfaceDimDark(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 524288, 65520, null);
        LocalCustomColors = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.google.ai.edge.gallery.ui.theme.ThemeKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThemeKt.LocalCustomColors$lambda$0();
            }
        });
        List listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4286951928L)), Color.m6905boximpl(ColorKt.Color(4281431281L))});
        long jColor = ColorKt.Color(4281431281L);
        long surfaceContainerLowestLight = ColorKt.getSurfaceContainerLowestLight();
        List listListOf2 = CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4294964725L)), Color.m6905boximpl(ColorKt.Color(4294245366L)), Color.m6905boximpl(ColorKt.Color(4294047486L)), Color.m6905boximpl(ColorKt.Color(4294966256L))});
        List listListOf3 = CollectionsKt.listOf((Object[]) new List[]{CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4293025623L)), Color.m6905boximpl(ColorKt.Color(4292556589L))}), CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4282491231L)), Color.m6905boximpl(ColorKt.Color(4279404855L))}), CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4284915190L)), Color.m6905boximpl(ColorKt.Color(4281431281L))}), CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4294825053L)), Color.m6905boximpl(ColorKt.Color(4291469610L))})});
        List listListOf4 = CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4292556589L)), Color.m6905boximpl(ColorKt.Color(4279404855L)), Color.m6905boximpl(ColorKt.Color(4281431281L)), Color.m6905boximpl(ColorKt.Color(4291469610L))});
        long jM6952getWhite0d7_KjU = Color.INSTANCE.m6952getWhite0d7_KjU();
        List listListOf5 = CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(16316927)), Color.m6905boximpl(ColorKt.Color(4294963145L))});
        long jColor2 = ColorKt.Color(4293521142L);
        long jColor3 = ColorKt.Color(4281492109L);
        long jColor4 = ColorKt.Color(4281492109L);
        long jColor5 = ColorKt.Color(4282222091L);
        long jColor6 = ColorKt.Color(4293814108L);
        long jColor7 = ColorKt.Color(4289374890L);
        long jColor8 = ColorKt.Color(4291611852L);
        long jColor9 = ColorKt.Color(4294899680L);
        long jColor10 = ColorKt.Color(4293096448L);
        long jColor11 = ColorKt.Color(4294764774L);
        long jColor12 = ColorKt.Color(4292423717L);
        long jColor13 = ColorKt.Color(4293844222L);
        long jColor14 = ColorKt.Color(4282387332L);
        long jColor15 = ColorKt.Color(979802869);
        Brush.Companion companion = Brush.INSTANCE;
        Pair[] pairArr = {TuplesKt.m929to(Float.valueOf(0.0f), Color.m6905boximpl(ColorKt.Color(1118615551))), TuplesKt.m929to(Float.valueOf(0.6154f), Color.m6905boximpl(ColorKt.Color(1110284031))), TuplesKt.m929to(Float.valueOf(1.0f), Color.m6905boximpl(ColorKt.Color(1111256063)))};
        long v1$iv$iv = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv = Float.floatToRawIntBits(0.0f);
        long jM6662constructorimpl = Offset.m6662constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        long v1$iv$iv2 = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv2 = Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
        Brush brushM6876linearGradientmHitzGk = companion.m6876linearGradientmHitzGk((Pair<Float, Color>[]) pairArr, (8 & 2) != 0 ? Offset.INSTANCE.m6686getZeroF1C5BW0() : jM6662constructorimpl, (8 & 4) != 0 ? Offset.INSTANCE.m6684getInfiniteF1C5BW0() : Offset.m6662constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L)), (8 & 8) != 0 ? TileMode.INSTANCE.m7312getClamp3opZhB0() : 0);
        Brush.Companion companion2 = Brush.INSTANCE;
        Pair[] pairArr2 = {TuplesKt.m929to(Float.valueOf(0.2442f), Color.m6905boximpl(ColorKt.Color(994340607))), TuplesKt.m929to(Float.valueOf(0.4296f), Color.m6905boximpl(ColorKt.Color(992909055))), TuplesKt.m929to(Float.valueOf(0.6651f), Color.m6905boximpl(ColorKt.Color(1001506303)))};
        long v1$iv$iv3 = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv3 = Float.floatToRawIntBits(1.0f);
        long v2$iv$iv4 = Offset.m6662constructorimpl((v1$iv$iv3 << 32) | (v2$iv$iv3 & 4294967295L));
        long v1$iv$iv4 = Float.floatToRawIntBits(1.0f);
        long v2$iv$iv5 = Float.floatToRawIntBits(0.0f);
        lightCustomColors = new CustomColors(listListOf, jColor, surfaceContainerLowestLight, listListOf2, listListOf3, listListOf4, jM6952getWhite0d7_KjU, listListOf5, jColor3, jColor2, jColor4, jColor5, jColor6, jColor7, jColor8, jColor9, jColor10, jColor11, jColor12, jColor13, jColor14, jColor15, brushM6876linearGradientmHitzGk, companion2.m6876linearGradientmHitzGk((Pair<Float, Color>[]) pairArr2, (8 & 2) != 0 ? Offset.INSTANCE.m6686getZeroF1C5BW0() : v2$iv$iv4, (8 & 4) != 0 ? Offset.INSTANCE.m6684getInfiniteF1C5BW0() : Offset.m6662constructorimpl((v1$iv$iv4 << 32) | (v2$iv$iv5 & 4294967295L)), (8 & 8) != 0 ? TileMode.INSTANCE.m7312getClamp3opZhB0() : 0), null);
        List listListOf6 = CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4286951928L)), Color.m6905boximpl(ColorKt.Color(4281431281L))});
        long jColor16 = ColorKt.Color(4281431281L);
        long surfaceContainerHighDark = ColorKt.getSurfaceContainerHighDark();
        List listListOf7 = CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4279767568L)), Color.m6905boximpl(ColorKt.Color(4279441169L)), Color.m6905boximpl(ColorKt.Color(4279834916L)), Color.m6905boximpl(ColorKt.Color(4279900179L))});
        List listListOf8 = CollectionsKt.listOf((Object[]) new List[]{CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4293025623L)), Color.m6905boximpl(ColorKt.Color(4292556589L))}), CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4282491231L)), Color.m6905boximpl(ColorKt.Color(4279404855L))}), CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4284915190L)), Color.m6905boximpl(ColorKt.Color(4281431281L))}), CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4294825053L)), Color.m6905boximpl(ColorKt.Color(4291469610L))})});
        List listListOf9 = CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(4293025623L)), Color.m6905boximpl(ColorKt.Color(4282491231L)), Color.m6905boximpl(ColorKt.Color(4284915190L)), Color.m6905boximpl(ColorKt.Color(4291469610L))});
        long jColor17 = ColorKt.Color(4280295716L);
        List listListOf10 = CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(ColorKt.Color(16316927)), Color.m6905boximpl(ColorKt.Color(452373761))});
        long jColor18 = ColorKt.Color(4279966749L);
        long jColor19 = ColorKt.Color(4280235872L);
        long jColor20 = ColorKt.Color(4288531196L);
        long jColor21 = ColorKt.Color(4288794243L);
        long jColor22 = ColorKt.Color(4293814108L);
        long jColor23 = ColorKt.Color(4289374890L);
        long jColor24 = ColorKt.Color(4291611852L);
        long jColor25 = ColorKt.Color(4283780147L);
        long jColor26 = ColorKt.Color(4294756660L);
        long jColor27 = ColorKt.Color(4283578939L);
        long jColor28 = ColorKt.Color(4293814108L);
        long jColor29 = ColorKt.Color(4293844222L);
        long jColor30 = ColorKt.Color(4282387332L);
        long jColor31 = ColorKt.Color(422865904);
        Brush.Companion companion3 = Brush.INSTANCE;
        Pair[] pairArr3 = {TuplesKt.m929to(Float.valueOf(0.0f), Color.m6905boximpl(ColorKt.Color(2182624624L))), TuplesKt.m929to(Float.valueOf(0.8077f), Color.m6905boximpl(ColorKt.Color(2181698093L)))};
        long v1$iv$iv5 = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv6 = Float.floatToRawIntBits(0.0f);
        long jM6662constructorimpl2 = Offset.m6662constructorimpl((v1$iv$iv5 << 32) | (v2$iv$iv6 & 4294967295L));
        long v1$iv$iv6 = Float.floatToRawIntBits(0.0f);
        int $i$f$Offset = Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
        long v2$iv$iv7 = $i$f$Offset;
        Brush brushM6876linearGradientmHitzGk2 = companion3.m6876linearGradientmHitzGk((Pair<Float, Color>[]) pairArr3, (8 & 2) != 0 ? Offset.INSTANCE.m6686getZeroF1C5BW0() : jM6662constructorimpl2, (8 & 4) != 0 ? Offset.INSTANCE.m6684getInfiniteF1C5BW0() : Offset.m6662constructorimpl((v1$iv$iv6 << 32) | (v2$iv$iv7 & 4294967295L)), (8 & 8) != 0 ? TileMode.INSTANCE.m7312getClamp3opZhB0() : 0);
        Brush.Companion companion4 = Brush.INSTANCE;
        Pair[] pairArr4 = {TuplesKt.m929to(Float.valueOf(0.2442f), Color.m6905boximpl(ColorKt.Color(1863270904))), TuplesKt.m929to(Float.valueOf(0.4296f), Color.m6905boximpl(ColorKt.Color(1863747064))), TuplesKt.m929to(Float.valueOf(0.6651f), Color.m6905boximpl(ColorKt.Color(1870700275)))};
        long v1$iv$iv7 = Float.floatToRawIntBits(0.0f);
        int $i$f$Offset2 = Float.floatToRawIntBits(1.0f);
        long v2$iv$iv8 = $i$f$Offset2;
        long jM6662constructorimpl3 = Offset.m6662constructorimpl((v1$iv$iv7 << 32) | (v2$iv$iv8 & 4294967295L));
        long v1$iv$iv8 = Float.floatToRawIntBits(1.0f);
        int $i$f$Offset3 = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv9 = $i$f$Offset3;
        darkCustomColors = new CustomColors(listListOf6, jColor16, surfaceContainerHighDark, listListOf7, listListOf8, listListOf9, jColor17, listListOf10, jColor19, jColor18, jColor20, jColor21, jColor22, jColor23, jColor24, jColor25, jColor26, jColor27, jColor28, jColor29, jColor30, jColor31, brushM6876linearGradientmHitzGk2, companion4.m6876linearGradientmHitzGk((Pair<Float, Color>[]) pairArr4, (8 & 2) != 0 ? Offset.INSTANCE.m6686getZeroF1C5BW0() : jM6662constructorimpl3, (8 & 4) != 0 ? Offset.INSTANCE.m6684getInfiniteF1C5BW0() : Offset.m6662constructorimpl((v1$iv$iv8 << 32) | (v2$iv$iv9 & 4294967295L)), (8 & 8) != 0 ? TileMode.INSTANCE.m7312getClamp3opZhB0() : 0), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomColors LocalCustomColors$lambda$0() {
        return new CustomColors(null, 0L, 0L, null, null, null, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    public static final ProvidableCompositionLocal<CustomColors> getLocalCustomColors() {
        return LocalCustomColors;
    }

    public static final CustomColors getLightCustomColors() {
        return lightCustomColors;
    }

    public static final CustomColors getDarkCustomColors() {
        return darkCustomColors;
    }

    public static final CustomColors getCustomColors(MaterialTheme $this$customColors, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$customColors, "<this>");
        ComposerKt.sourceInformationMarkerStart($composer, 1338988879, "C(<get-customColors>)298@10457L7:Theme.kt#zgnhxe");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1338988879, $changed, -1, "com.google.ai.edge.gallery.ui.theme.<get-customColors> (Theme.kt:298)");
        }
        ProvidableCompositionLocal<CustomColors> providableCompositionLocal = LocalCustomColors;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object objConsume = $composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd($composer);
        CustomColors customColors = (CustomColors) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return customColors;
    }

    public static final void StatusBarColorController(final boolean useDarkTheme, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1817098175);
        ComposerKt.sourceInformation($composer2, "C(StatusBarColorController)306@10668L7:Theme.kt#zgnhxe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(useDarkTheme) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1817098175, $dirty, -1, "com.google.ai.edge.gallery.ui.theme.StatusBarColorController (Theme.kt:305)");
            }
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localView);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final View view = (View) objConsume;
            Context context = view.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            final Window currentWindow = activity != null ? activity.getWindow() : null;
            if (currentWindow != null) {
                $composer2.startReplaceGroup(-595875653);
                ComposerKt.sourceInformation($composer2, "310@10781L243,310@10770L254");
                ComposerKt.sourceInformationMarkerStart($composer2, -1820336590, "CC(remember):Theme.kt#9igjgp");
                boolean invalid$iv = $composer2.changedInstance(currentWindow) | $composer2.changedInstance(view) | (($dirty & 14) == 4);
                Object it$iv = $composer2.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ThemeKt.StatusBarColorController$lambda$2$lambda$1(currentWindow, view, useDarkTheme);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                EffectsKt.SideEffect((Function0) it$iv, $composer2, 0);
            } else {
                $composer2.startReplaceGroup(-606562717);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.theme.ThemeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.StatusBarColorController$lambda$3(useDarkTheme, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatusBarColorController$lambda$2$lambda$1(Window $currentWindow, View $view, boolean $useDarkTheme) {
        WindowCompat.setDecorFitsSystemWindows($currentWindow, false);
        WindowInsetsControllerCompat controller = WindowCompat.getInsetsController($currentWindow, $view);
        Intrinsics.checkNotNullExpressionValue(controller, "getInsetsController(...)");
        controller.setAppearanceLightStatusBars(!$useDarkTheme);
        return Unit.INSTANCE;
    }

    public static final void GalleryTheme(final Function2<? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(1646385635);
        ComposerKt.sourceInformation($composer2, "C(GalleryTheme)322@11178L21,324@11317L7,326@11328L50,336@11633L97,336@11560L170,341@11837L174,341@11811L200:Theme.kt#zgnhxe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(content) ? 4 : 2;
        }
        if ($composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1646385635, $dirty, -1, "com.google.ai.edge.gallery.ui.theme.GalleryTheme (Theme.kt:319)");
            }
            MutableState<Theme> themeOverride = ThemeSettings.INSTANCE.getThemeOverride();
            boolean darkTheme = (DarkThemeKt.isSystemInDarkTheme($composer2, 0) || themeOverride.getValue() == Theme.THEME_DARK) && themeOverride.getValue() != Theme.THEME_LIGHT;
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localView);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            View view = (View) objConsume;
            StatusBarColorController(darkTheme, $composer2, 0);
            final ColorScheme colorScheme = darkTheme ? darkScheme : lightScheme;
            CustomColors customColorsPalette = darkTheme ? darkCustomColors : lightCustomColors;
            CompositionLocalKt.CompositionLocalProvider(LocalCustomColors.provides(customColorsPalette), ComposableLambdaKt.rememberComposableLambda(-180666717, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.theme.ThemeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.GalleryTheme$lambda$4(colorScheme, content, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, ProvidedValue.$stable | 48);
            Boolean boolValueOf = Boolean.valueOf(darkTheme);
            ComposerKt.sourceInformationMarkerStart($composer2, 1628656241, "CC(remember):Theme.kt#9igjgp");
            boolean invalid$iv = $composer2.changedInstance(view);
            Object it$iv = $composer2.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = (Function2) new ThemeKt$GalleryTheme$2$1(view, null);
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv, $composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.theme.ThemeKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.GalleryTheme$lambda$6(content, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryTheme$lambda$4(ColorScheme $colorScheme, Function2 $content, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C337@11639L87:Theme.kt#zgnhxe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-180666717, $changed, -1, "com.google.ai.edge.gallery.ui.theme.GalleryTheme.<anonymous> (Theme.kt:337)");
            }
            MaterialThemeKt.MaterialTheme($colorScheme, null, TypeKt.getAppTypography(), $content, $composer, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
