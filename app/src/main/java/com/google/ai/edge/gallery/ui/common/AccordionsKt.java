package com.google.ai.edge.gallery.ui.common;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.rounded.ArrowRightKt;
import androidx.compose.material.icons.rounded.ArrowDropDownKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Accordions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m922d2 = {"Accordions", "", "title", "", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "subtitle", "boldTitle", "bgColor", "Landroidx/compose/ui/graphics/Color;", "titleRowAction", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "hideTitleRowActionOnCollapse", FirebaseAnalytics.Param.CONTENT, "Accordions-ueL0Wzs", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZJLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class AccordionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Accordions_ueL0Wzs$lambda$8(String str, boolean z, Function1 function1, Modifier modifier, String str2, boolean z2, long j, Function2 function2, boolean z3, Function2 function22, int i, int i2, Composer composer, int i3) {
        m10821AccordionsueL0Wzs(str, z, function1, modifier, str2, z2, j, function2, z3, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Accordions-ueL0Wzs, reason: not valid java name */
    public static final void m10821AccordionsueL0Wzs(final String title, final boolean expanded, final Function1<? super Boolean, Unit> onExpandedChange, Modifier modifier, String subtitle, boolean boldTitle, long bgColor, Function2<? super Composer, ? super Integer, Unit> function2, boolean hideTitleRowActionOnCollapse, final Function2<? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        String str;
        Composer $composer2;
        Modifier modifier2;
        boolean boldTitle2;
        long bgColor2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        boolean hideTitleRowActionOnCollapse2;
        String subtitle2;
        Modifier.Companion modifier3;
        String subtitle3;
        boolean boldTitle3;
        long bgColor3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int $dirty;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        Composer $composer3;
        Composer $composer4;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        boolean z;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onExpandedChange, "onExpandedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer5 = $composer.startRestartGroup(158431297);
        ComposerKt.sourceInformation($composer5, "C(Accordions)P(8,3,6,5,7,1,0:c#ui.graphics.Color,9,4)60@2347L1654:Accordions.kt#t7sjiu");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer5.changed(title) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer5.changed(expanded) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer5.changedInstance(onExpandedChange) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty2 |= 3072;
        } else if (($changed & 3072) == 0) {
            $dirty2 |= $composer5.changed(modifier) ? 2048 : 1024;
        }
        int i3 = i & 16;
        if (i3 != 0) {
            $dirty2 |= 24576;
            str = subtitle;
        } else if (($changed & 24576) == 0) {
            str = subtitle;
            $dirty2 |= $composer5.changed(str) ? 16384 : 8192;
        } else {
            str = subtitle;
        }
        int i4 = i & 32;
        if (i4 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.f249xf2722a21;
        } else if (($changed & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty2 |= $composer5.changed(boldTitle) ? 131072 : 65536;
        }
        if (($changed & 1572864) == 0) {
            $dirty2 |= ((i & 64) == 0 && $composer5.changed(bgColor)) ? 1048576 : 524288;
        }
        int i5 = i & 128;
        if (i5 != 0) {
            $dirty2 |= 12582912;
        } else if (($changed & 12582912) == 0) {
            $dirty2 |= $composer5.changedInstance(function2) ? 8388608 : 4194304;
        }
        int i6 = i & 256;
        if (i6 != 0) {
            $dirty2 |= 100663296;
        } else if (($changed & 100663296) == 0) {
            $dirty2 |= $composer5.changed(hideTitleRowActionOnCollapse) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (($changed & 805306368) == 0) {
            $dirty2 |= $composer5.changedInstance(content) ? 536870912 : 268435456;
        }
        if ($composer5.shouldExecute(($dirty2 & 306783379) != 306783378, $dirty2 & 1)) {
            $composer5.startDefaults();
            ComposerKt.sourceInformation($composer5, "55@2189L11");
            if (($changed & 1) != 0 && !$composer5.getDefaultsInvalid()) {
                $composer5.skipToGroupEnd();
                if ((i & 64) != 0) {
                    $dirty2 &= -3670017;
                }
                modifier2 = modifier;
                boldTitle2 = boldTitle;
                bgColor2 = bgColor;
                function23 = function2;
                hideTitleRowActionOnCollapse2 = hideTitleRowActionOnCollapse;
                $dirty = $dirty2;
                subtitle2 = str;
            } else {
                if (i2 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if (i3 == 0) {
                    subtitle3 = str;
                } else {
                    subtitle3 = "";
                }
                if (i4 == 0) {
                    boldTitle3 = boldTitle;
                } else {
                    boldTitle3 = false;
                }
                if ((i & 64) == 0) {
                    bgColor3 = bgColor;
                } else {
                    bgColor3 = MaterialTheme.INSTANCE.getColorScheme($composer5, MaterialTheme.$stable).getSurface();
                    $dirty2 &= -3670017;
                }
                Function2<? super Composer, ? super Integer, Unit> lambda$1599436987$app_debug = i5 != 0 ? ComposableSingletons$AccordionsKt.INSTANCE.getLambda$1599436987$app_debug() : function2;
                if (i6 == 0) {
                    hideTitleRowActionOnCollapse2 = hideTitleRowActionOnCollapse;
                    function23 = lambda$1599436987$app_debug;
                    $dirty = $dirty2;
                    modifier2 = modifier3;
                    subtitle2 = subtitle3;
                    boldTitle2 = boldTitle3;
                    bgColor2 = bgColor3;
                } else {
                    hideTitleRowActionOnCollapse2 = false;
                    function23 = lambda$1599436987$app_debug;
                    $dirty = $dirty2;
                    modifier2 = modifier3;
                    subtitle2 = subtitle3;
                    boldTitle2 = boldTitle3;
                    bgColor2 = bgColor3;
                }
            }
            $composer5.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(158431297, $dirty, -1, "com.google.ai.edge.gallery.ui.common.Accordions (Accordions.kt:59)");
            }
            Modifier modifier$iv = PaddingKt.m1988padding3ABfNKs(BackgroundKt.m1359backgroundbw27NRU$default(modifier2, bgColor2, null, 2, null), C1654Dp.m9788constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer5, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer5, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer5, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer5, 0));
            CompositionLocalMap localMap$iv$iv = $composer5.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer5, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer5, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer5.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer5.startReusableNode();
            if ($composer5.getInserting()) {
                function0 = constructor;
                $composer5.createNode(function0);
            } else {
                function0 = constructor;
                $composer5.useNode();
            }
            Function2<? super Composer, ? super Integer, Unit> function25 = function23;
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer5);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer5, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int $changed2 = ((0 >> 6) & 112) | 6;
            ColumnScope $this$Accordions_ueL0Wzs_u24lambda_u247 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer5, 1607311608, "C67@2632L31,62@2429L1280,105@3825L172,105@3731L266:Accordions.kt#t7sjiu");
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(6));
            Modifier modifierClip = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(8)));
            ComposerKt.sourceInformationMarkerStart($composer5, 1714421706, "CC(remember):Accordions.kt#9igjgp");
            boolean invalid$iv = (($dirty & 896) == 256) | (($dirty & 112) == 32);
            Object it$iv = $composer5.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.AccordionsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccordionsKt.Accordions_ueL0Wzs$lambda$7$lambda$1$lambda$0(onExpandedChange, expanded);
                    }
                };
                $composer5.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            Modifier modifier$iv2 = SizeKt.fillMaxWidth$default(ClickableKt.m1401clickableoSLSa3U(modifierClip, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv), 0.0f, 1, null);
            Arrangement.Horizontal horizontalArrangement$iv = horizontalM1843spacedBy0680j_4;
            ComposerKt.sourceInformationMarkerStart($composer5, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer5, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv2 = (432 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer5, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer5, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer5.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer5, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer5, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer5.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer5.startReusableNode();
            if ($composer5.getInserting()) {
                function02 = constructor2;
                $composer5.createNode(function02);
            } else {
                function02 = constructor2;
                $composer5.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer5);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer5, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int $changed3 = ((432 >> 6) & 112) | 6;
            RowScope $this$Accordions_ueL0Wzs_u24lambda_u247_u24lambda_u244 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer5, -1958159402, "C70@2705L142,74@2854L607:Accordions.kt#t7sjiu");
            IconKt.m4075Iconww6aTOc(expanded ? ArrowDropDownKt.getArrowDropDown(Icons.Rounded.INSTANCE) : ArrowRightKt.getArrowRight(Icons.AutoMirrored.Rounded.INSTANCE), (String) null, (Modifier) null, 0L, $composer5, 48, 12);
            Modifier modifier$iv3 = RowScope.weight$default($this$Accordions_ueL0Wzs_u24lambda_u247_u24lambda_u244, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer5, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv3 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer5, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv3 = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer5, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer5, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer5.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer5, modifier$iv3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer5, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer5.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer5.startReusableNode();
            if ($composer5.getInserting()) {
                function03 = constructor3;
                $composer5.createNode(function03);
            } else {
                function03 = constructor3;
                $composer5.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer5);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = ($changed$iv$iv$iv3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer5, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i10 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer5, 447324492, "C78@2970L10,81@3130L11,75@2903L333:Accordions.kt#t7sjiu");
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography($composer5, MaterialTheme.$stable).getBodyMedium();
            FontWeight.Companion companion = FontWeight.INSTANCE;
            int $dirty3 = $dirty;
            $composer2 = $composer5;
            TextKt.m4781TextNvy7gAk(title, null, MaterialTheme.INSTANCE.getColorScheme($composer5, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9686getMiddleEllipsisgIe3tQ8(), false, 1, 0, null, TextStyle.m9205copyp1EtxEg$default(bodyMedium, 0L, 0L, boldTitle2 ? companion.getSemiBold() : companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), $composer5, $dirty & 14, 24960, 110586);
            if (subtitle2.length() > 0) {
                $composer3 = $composer5;
                $composer3.startReplaceGroup(447679100);
                ComposerKt.sourceInformation($composer3, "88@3346L10,89@3402L11,86@3284L159");
                TextKt.m4781TextNvy7gAk(subtitle2, null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodySmall(), $composer3, ($dirty3 >> 12) & 14, 0, 131066);
            } else {
                $composer3 = $composer5;
                $composer3.startReplaceGroup(444426673);
            }
            $composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            $composer5.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            if (hideTitleRowActionOnCollapse2) {
                $composer4 = $composer5;
                $composer4.startReplaceGroup(-1957394726);
                ComposerKt.sourceInformation($composer4, "94@3577L78,94@3512L143");
                function24 = function25;
                z = true;
                AnimatedVisibilityKt.AnimatedVisibility($this$Accordions_ueL0Wzs_u24lambda_u247_u24lambda_u244, expanded, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1954326892, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.AccordionsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return AccordionsKt.Accordions_ueL0Wzs$lambda$7$lambda$4$lambda$3(expanded, function24, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer4, 54), $composer4, ($changed3 & 14) | 1600512 | ($dirty3 & 112), 18);
                $composer4.endReplaceGroup();
            } else {
                $composer4 = $composer5;
                function24 = function25;
                z = true;
                $composer4.startReplaceGroup(-1957232999);
                ComposerKt.sourceInformation($composer4, "100@3679L16");
                function24.invoke($composer4, Integer.valueOf(($dirty3 >> 21) & 14));
                $composer4.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            $composer5.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            AnimatedVisibilityKt.AnimatedVisibility($this$Accordions_ueL0Wzs_u24lambda_u247, expanded, (Modifier) null, EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1772664653, z, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.AccordionsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AccordionsKt.Accordions_ueL0Wzs$lambda$7$lambda$6(content, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer5, 54), $composer5, ($changed2 & 14) | 1600512 | ($dirty3 & 112), 18);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            $composer5.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function22 = function24;
        } else {
            $composer2 = $composer5;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            boldTitle2 = boldTitle;
            bgColor2 = bgColor;
            function22 = function2;
            hideTitleRowActionOnCollapse2 = hideTitleRowActionOnCollapse;
            subtitle2 = str;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final String str2 = subtitle2;
            final boolean z2 = boldTitle2;
            final long j = bgColor2;
            final Function2<? super Composer, ? super Integer, Unit> function26 = function22;
            final boolean z3 = hideTitleRowActionOnCollapse2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.AccordionsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccordionsKt.Accordions_ueL0Wzs$lambda$8(title, expanded, onExpandedChange, modifier4, str2, z2, j, function26, z3, content, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Accordions_ueL0Wzs$lambda$7$lambda$1$lambda$0(Function1 $onExpandedChange, boolean $expanded) {
        $onExpandedChange.invoke(Boolean.valueOf(!$expanded));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Accordions_ueL0Wzs$lambda$7$lambda$4$lambda$3(boolean $expanded, Function2 $titleRowAction, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C:Accordions.kt#t7sjiu");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1954326892, $changed, -1, "com.google.ai.edge.gallery.ui.common.Accordions.<anonymous>.<anonymous>.<anonymous> (Accordions.kt:95)");
        }
        if ($expanded) {
            $composer.startReplaceGroup(1224252100);
            ComposerKt.sourceInformation($composer, "96@3617L16");
            $titleRowAction.invoke($composer, 0);
        } else {
            $composer.startReplaceGroup(1220675630);
        }
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Accordions_ueL0Wzs$lambda$7$lambda$6(Function2 $content, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C106@3833L158:Accordions.kt#t7sjiu");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1772664653, $changed, -1, "com.google.ai.edge.gallery.ui.common.Accordions.<anonymous>.<anonymous> (Accordions.kt:106)");
        }
        Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 0.0f, 13, null);
        Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
        ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (54 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
        CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!($composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        $composer.startReusableNode();
        if ($composer.getInserting()) {
            function0 = constructor;
            $composer.createNode(function0);
        } else {
            function0 = constructor;
            $composer.useNode();
        }
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer);
        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
        int i = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        int i2 = ((54 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, 1519162189, "C110@3974L9:Accordions.kt#t7sjiu");
        $content.invoke($composer, 0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
