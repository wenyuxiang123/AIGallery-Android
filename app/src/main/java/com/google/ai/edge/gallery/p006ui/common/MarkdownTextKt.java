package com.google.ai.edge.gallery.p006ui.common;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Shadow;
import androidx.compose.p000ui.graphics.drawscope.DrawStyle;
import androidx.compose.p000ui.text.PlatformSpanStyle;
import androidx.compose.p000ui.text.PlatformTextStyle;
import androidx.compose.p000ui.text.SpanStyle;
import androidx.compose.p000ui.text.TextLinkStyles;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontSynthesis;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.font.GenericFontFamily;
import androidx.compose.p000ui.text.intl.LocaleList;
import androidx.compose.p000ui.text.style.BaselineShift;
import androidx.compose.p000ui.text.style.LineHeightStyle;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.text.style.TextGeometricTransform;
import androidx.compose.p000ui.text.style.TextIndent;
import androidx.compose.p000ui.text.style.TextMotion;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.TextUnit;
import androidx.compose.p000ui.unit.TextUnitKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.p006ui.theme.ThemeKt;
import com.halilibo.richtext.commonmark.MarkdownKt;
import com.halilibo.richtext.p008ui.CodeBlockStyle;
import com.halilibo.richtext.p008ui.RichTextScope;
import com.halilibo.richtext.p008ui.RichTextStyle;
import com.halilibo.richtext.p008ui.material3.RichTextKt;
import com.halilibo.richtext.p008ui.string.RichTextStringStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarkdownText.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m922d2 = {"MarkdownText", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "smallFontSize", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "linkColor", "MarkdownText-jA1GFJw", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/runtime/Composer;II)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class MarkdownTextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownText_jA1GFJw$lambda$3(String str, Modifier modifier, boolean z, long j, long j2, int i, int i2, Composer composer, int i3) {
        m10879MarkdownTextjA1GFJw(str, modifier, z, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: MarkdownText-jA1GFJw, reason: not valid java name */
    public static final void m10879MarkdownTextjA1GFJw(final String text, Modifier modifier, boolean smallFontSize, long textColor, long linkColor, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean z;
        long textColor2;
        long j;
        Modifier modifier3;
        boolean smallFontSize2;
        long textColor3;
        long linkColor2;
        Modifier.Companion modifier4;
        boolean smallFontSize3;
        int $dirty;
        final long fontSize;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer2 = $composer.startRestartGroup(-108904286);
        ComposerKt.sourceInformation($composer2, "C(MarkdownText)P(3,1,2,4:c#ui.graphics.Color,0:c#ui.graphics.Color)48@1903L893,48@1878L918:MarkdownText.kt#t7sjiu");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changed(text) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty2 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer2.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty2 |= 384;
            z = smallFontSize;
        } else if (($changed & 384) == 0) {
            z = smallFontSize;
            $dirty2 |= $composer2.changed(z) ? 256 : 128;
        } else {
            z = smallFontSize;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                textColor2 = textColor;
                int i4 = $composer2.changed(textColor2) ? 2048 : 1024;
                $dirty2 |= i4;
            } else {
                textColor2 = textColor;
            }
            $dirty2 |= i4;
        } else {
            textColor2 = textColor;
        }
        if (($changed & 24576) == 0) {
            if ((i & 16) == 0) {
                j = linkColor;
                int i5 = $composer2.changed(j) ? 16384 : 8192;
                $dirty2 |= i5;
            } else {
                j = linkColor;
            }
            $dirty2 |= i5;
        } else {
            j = linkColor;
        }
        if ($composer2.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "42@1652L11,43@1710L12");
            if (($changed & 1) != 0 && !$composer2.getDefaultsInvalid()) {
                $composer2.skipToGroupEnd();
                if ((i & 8) != 0) {
                    $dirty2 &= -7169;
                }
                if ((i & 16) != 0) {
                    $dirty2 &= -57345;
                }
                modifier3 = modifier2;
                smallFontSize2 = z;
                textColor3 = textColor2;
                linkColor2 = j;
                $dirty = $dirty2;
            } else {
                if (i2 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i3 == 0) {
                    smallFontSize3 = z;
                } else {
                    smallFontSize3 = false;
                }
                if ((i & 8) != 0) {
                    $dirty2 &= -7169;
                    textColor2 = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface();
                }
                if ((i & 16) == 0) {
                    modifier3 = modifier4;
                    smallFontSize2 = smallFontSize3;
                    textColor3 = textColor2;
                    linkColor2 = j;
                    $dirty = $dirty2;
                } else {
                    $dirty = $dirty2 & (-57345);
                    modifier3 = modifier4;
                    smallFontSize2 = smallFontSize3;
                    linkColor2 = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer2, MaterialTheme.$stable).m11232getLinkColor0d7_KjU();
                    textColor3 = textColor2;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-108904286, $dirty, -1, "com.google.ai.edge.gallery.ui.common.MarkdownText (MarkdownText.kt:44)");
            }
            if (smallFontSize2) {
                $composer2.startReplaceGroup(-1577793814);
                ComposerKt.sourceInformation($composer2, "46@1792L10");
                long jM9223getFontSizeXSAIIZE = MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium().m9223getFontSizeXSAIIZE();
                $composer2.endReplaceGroup();
                fontSize = jM9223getFontSizeXSAIIZE;
            } else {
                $composer2.startReplaceGroup(-1577792118);
                ComposerKt.sourceInformation($composer2, "47@1846L10");
                long jM9223getFontSizeXSAIIZE2 = MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyLarge().m9223getFontSizeXSAIIZE();
                $composer2.endReplaceGroup();
                fontSize = jM9223getFontSizeXSAIIZE2;
            }
            final boolean z2 = smallFontSize2;
            final long j2 = textColor3;
            final Modifier modifier5 = modifier3;
            final long j3 = linkColor2;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[0], ComposableLambdaKt.rememberComposableLambda(334062946, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.MarkdownTextKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownTextKt.MarkdownText_jA1GFJw$lambda$2(fontSize, z2, j2, modifier5, j3, text, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            smallFontSize2 = z;
            textColor3 = textColor2;
            linkColor2 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier6 = modifier3;
            final boolean z3 = smallFontSize2;
            final long j4 = textColor3;
            final long j5 = linkColor2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.MarkdownTextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownTextKt.MarkdownText_jA1GFJw$lambda$3(text, modifier6, z3, j4, j5, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownText_jA1GFJw$lambda$2(long $fontSize, boolean $smallFontSize, long $textColor, final Modifier $modifier, final long $linkColor, final String $text, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C57@2139L653,49@1909L883:MarkdownText.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(334062946, $changed, -1, "com.google.ai.edge.gallery.ui.common.MarkdownText.<anonymous> (MarkdownText.kt:49)");
            }
            float other$iv = $smallFontSize ? 1.4f : 1.5f;
            TextUnitKt.m9995checkArithmeticR2X_6o($fontSize);
            TextKt.ProvideTextStyle(new TextStyle($textColor, $fontSize, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.getSp(0.2d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.pack(TextUnit.m9980getRawTypeimpl($fontSize), TextUnit.m9982getValueimpl($fontSize) * other$iv), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646012, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(742765267, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.MarkdownTextKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownTextKt.MarkdownText_jA1GFJw$lambda$2$lambda$1($modifier, $linkColor, $text, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownText_jA1GFJw$lambda$2$lambda$1(Modifier $modifier, long $linkColor, final String $text, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C66@2388L10,68@2521L10,74@2744L42,58@2147L639:MarkdownText.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(742765267, $changed, -1, "com.google.ai.edge.gallery.ui.common.MarkdownText.<anonymous>.<anonymous> (MarkdownText.kt:58)");
            }
            long jM9223getFontSizeXSAIIZE = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall().m9223getFontSizeXSAIIZE();
            GenericFontFamily monospace = FontFamily.INSTANCE.getMonospace();
            long jM9223getFontSizeXSAIIZE2 = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall().m9223getFontSizeXSAIIZE();
            TextUnitKt.m9995checkArithmeticR2X_6o(jM9223getFontSizeXSAIIZE2);
            RichTextKt.RichText($modifier, new RichTextStyle(null, null, null, null, new CodeBlockStyle(new TextStyle(0L, jM9223getFontSizeXSAIIZE, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, monospace, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.pack(TextUnit.m9980getRawTypeimpl(jM9223getFontSizeXSAIIZE2), TextUnit.m9982getValueimpl(jM9223getFontSizeXSAIIZE2) * 1.4f), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646109, (DefaultConstructorMarker) null), null, null, null, 14, null), null, null, new RichTextStringStyle(null, null, null, null, null, null, null, new TextLinkStyles(new SpanStyle($linkColor, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), null, null, null, 14, null), 127, null), 111, null), ComposableLambdaKt.rememberComposableLambda(99367144, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.MarkdownTextKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MarkdownTextKt.MarkdownText_jA1GFJw$lambda$2$lambda$1$lambda$0($text, (RichTextScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownText_jA1GFJw$lambda$2$lambda$1$lambda$0(String $text, RichTextScope RichText, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(RichText, "$this$RichText");
        ComposerKt.sourceInformation($composer, "C75@2754L24:MarkdownText.kt#t7sjiu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(RichText) ? 4 : 2;
        }
        if (!$composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(99367144, $dirty, -1, "com.google.ai.edge.gallery.ui.common.MarkdownText.<anonymous>.<anonymous>.<anonymous> (MarkdownText.kt:75)");
            }
            MarkdownKt.Markdown(RichText, $text, null, null, $composer, $dirty & 14, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
