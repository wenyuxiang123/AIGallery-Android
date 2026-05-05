package com.google.ai.edge.gallery.ui.common;

import android.os.Bundle;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Shadow;
import androidx.compose.p000ui.graphics.drawscope.DrawStyle;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.platform.UriHandler;
import androidx.compose.p000ui.text.AnnotatedString;
import androidx.compose.p000ui.text.LinkAnnotation;
import androidx.compose.p000ui.text.LinkInteractionListener;
import androidx.compose.p000ui.text.PlatformSpanStyle;
import androidx.compose.p000ui.text.SpanStyle;
import androidx.compose.p000ui.text.TextLinkStyles;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontSynthesis;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.intl.LocaleList;
import androidx.compose.p000ui.text.style.BaselineShift;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.text.style.TextGeometricTransform;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.AnalyticsKt;
import com.google.ai.edge.gallery.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClickableLink.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a?\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m922d2 = {"buildTrackableUrlAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", ImagesContract.URL, "", "linkText", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "ClickableLink", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "ClickableLink-6ERogkM", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/vector/ImageVector;ILandroidx/compose/runtime/Composer;II)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ClickableLinkKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableLink_6ERogkM$lambda$6(String str, String str2, Modifier modifier, ImageVector imageVector, int i, int i2, int i3, Composer composer, int i4) {
        m10826ClickableLink6ERogkM(str, str2, modifier, imageVector, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final AnnotatedString buildTrackableUrlAnnotatedString(final String url, String linkText, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(linkText, "linkText");
        ComposerKt.sourceInformationMarkerStart($composer, -438302208, "C(buildTrackableUrlAnnotatedString)P(1)45@1869L7:ClickableLink.kt#t7sjiu");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-438302208, $changed, -1, "com.google.ai.edge.gallery.ui.common.buildTrackableUrlAnnotatedString (ClickableLink.kt:44)");
        }
        ProvidableCompositionLocal<UriHandler> localUriHandler = CompositionLocalsKt.getLocalUriHandler();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object objConsume = $composer.consume(localUriHandler);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final UriHandler uriHandler = (UriHandler) objConsume;
        $composer.startReplaceGroup(-301621397);
        ComposerKt.sourceInformation($composer, "*55@2121L12,59@2275L210");
        AnnotatedString.Builder $this$buildTrackableUrlAnnotatedString_u24lambda_u244 = new AnnotatedString.Builder(0, 1, null);
        TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11232getLinkColor0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (DefaultConstructorMarker) null), null, null, null, 14, null);
        ComposerKt.sourceInformationMarkerStart($composer, 856512647, "CC(remember):ClickableLink.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance(uriHandler) | (((($changed & 14) ^ 6) > 4 && $composer.changed(url)) || ($changed & 6) == 4);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = new LinkInteractionListener() { // from class: com.google.ai.edge.gallery.ui.common.ClickableLinkKt$$ExternalSyntheticLambda1
                @Override // androidx.compose.p000ui.text.LinkInteractionListener
                public final void onClick(LinkAnnotation linkAnnotation) {
                    ClickableLinkKt.buildTrackableUrlAnnotatedString$lambda$4$lambda$2$lambda$1(uriHandler, url, linkAnnotation);
                }
            };
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        LinkAnnotation link$iv = new LinkAnnotation.Url(url, textLinkStyles, (LinkInteractionListener) it$iv);
        int index$iv = $this$buildTrackableUrlAnnotatedString_u24lambda_u244.pushLink(link$iv);
        try {
            $this$buildTrackableUrlAnnotatedString_u24lambda_u244.append(linkText);
            Unit unit = Unit.INSTANCE;
            $this$buildTrackableUrlAnnotatedString_u24lambda_u244.pop(index$iv);
            AnnotatedString annotatedString = $this$buildTrackableUrlAnnotatedString_u24lambda_u244.toAnnotatedString();
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            return annotatedString;
        } catch (Throwable th) {
            $this$buildTrackableUrlAnnotatedString_u24lambda_u244.pop(index$iv);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildTrackableUrlAnnotatedString$lambda$4$lambda$2$lambda$1(UriHandler $uriHandler, String $url, LinkAnnotation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $uriHandler.openUri($url);
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            Bundle $this$buildTrackableUrlAnnotatedString_u24lambda_u244_u24lambda_u242_u24lambda_u241_u24lambda_u240 = new Bundle();
            $this$buildTrackableUrlAnnotatedString_u24lambda_u244_u24lambda_u242_u24lambda_u241_u24lambda_u240.putString("link_destination", $url);
            Unit unit = Unit.INSTANCE;
            firebaseAnalytics.logEvent("resource_link_click", $this$buildTrackableUrlAnnotatedString_u24lambda_u244_u24lambda_u242_u24lambda_u241_u24lambda_u240);
        }
    }

    /* JADX INFO: renamed from: ClickableLink-6ERogkM, reason: not valid java name */
    public static final void m10826ClickableLink6ERogkM(final String url, final String linkText, Modifier modifier, ImageVector icon, int textAlign, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        ImageVector imageVector;
        int textAlign2;
        Modifier modifier3;
        ImageVector icon2;
        int textAlign3;
        Modifier.Companion modifier4;
        ImageVector icon3;
        Function0<ComposeUiNode> function0;
        Composer $composer$iv$iv;
        Composer $composer$iv$iv$iv;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(linkText, "linkText");
        Composer $composer3 = $composer.startRestartGroup(-1373518843);
        ComposerKt.sourceInformation($composer3, "C(ClickableLink)P(4,1,2!,3:c#ui.text.style.TextAlign)81@2738L47,83@2789L419:ClickableLink.kt#t7sjiu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(url) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(linkText) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            imageVector = icon;
        } else if (($changed & 3072) == 0) {
            imageVector = icon;
            $dirty |= $composer3.changed(imageVector) ? 2048 : 1024;
        } else {
            imageVector = icon;
        }
        if (($changed & 24576) == 0) {
            if ((i & 16) == 0) {
                textAlign2 = textAlign;
                int i4 = $composer3.changed(textAlign2) ? 16384 : 8192;
                $dirty |= i4;
            } else {
                textAlign2 = textAlign;
            }
            $dirty |= i4;
        } else {
            textAlign2 = textAlign;
        }
        if ($composer3.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            $composer3.startDefaults();
            if (($changed & 1) != 0 && !$composer3.getDefaultsInvalid()) {
                $composer3.skipToGroupEnd();
                if ((i & 16) != 0) {
                    $dirty &= -57345;
                }
                modifier4 = modifier2;
                icon3 = imageVector;
            } else {
                if (i2 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i3 == 0) {
                    icon3 = imageVector;
                } else {
                    icon3 = null;
                }
                if ((i & 16) != 0) {
                    $dirty &= -57345;
                    textAlign2 = TextAlign.INSTANCE.m9627getCentere0LSkKk();
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1373518843, $dirty, -1, "com.google.ai.edge.gallery.ui.common.ClickableLink (ClickableLink.kt:80)");
            }
            AnnotatedString annotatedText = buildTrackableUrlAnnotatedString(url, linkText, $composer3, ($dirty & 14) | ($dirty & 112));
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getCenter();
            int $changed$iv = (($dirty >> 6) & 14) | 432;
            Modifier modifier$iv = modifier4;
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
            int $changed$iv$iv = ($changed$iv << 3) & 112;
            Modifier modifier5 = modifier4;
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
                function0 = constructor;
                $composer3.createNode(function0);
            } else {
                function0 = constructor;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = (($changed$iv >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -1198244657, "C94@3127L10,91@3036L168:ClickableLink.kt#t7sjiu");
            if (icon3 != null) {
                $composer3.startReplaceGroup(-1198232723);
                ComposerKt.sourceInformation($composer3, "89@2955L70");
                $composer$iv$iv = $composer3;
                $composer$iv$iv$iv = $composer3;
                IconKt.m4075Iconww6aTOc(icon3, (String) null, SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), 0L, $composer3, (($dirty >> 9) & 14) | 432, 8);
                $composer3.endReplaceGroup();
                $composer2 = $composer3;
            } else {
                $composer$iv$iv = $composer3;
                $composer$iv$iv$iv = $composer3;
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-1201159743);
                $composer2.endReplaceGroup();
            }
            TextKt.m4782TextZ58ophY(annotatedText, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m9620boximpl(textAlign2), 0L, 0, false, 0, 0, null, null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer2, 48, ($dirty >> 12) & 14, 261116);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer$iv$iv$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
            icon2 = icon3;
            textAlign3 = textAlign2;
        } else {
            $composer3.skipToGroupEnd();
            modifier3 = modifier2;
            icon2 = imageVector;
            textAlign3 = textAlign2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier6 = modifier3;
            final ImageVector imageVector2 = icon2;
            final int i7 = textAlign3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ClickableLinkKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ClickableLinkKt.ClickableLink_6ERogkM$lambda$6(url, linkText, modifier6, imageVector2, i7, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
