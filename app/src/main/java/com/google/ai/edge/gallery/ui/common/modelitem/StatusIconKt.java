package com.google.ai.edge.gallery.ui.common.modelitem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.HelpOutlineKt;
import androidx.compose.material.icons.filled.DownloadForOfflineKt;
import androidx.compose.material.icons.rounded.DownloadingKt;
import androidx.compose.material.icons.rounded.ErrorKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.ConstsKt;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelDownloadStatus;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.ColorUtilsKt;
import com.google.ai.edge.gallery.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;



V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class StatusIconKt {

    
    
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModelDownloadStatusType.values().length];
            try {
                iArr[ModelDownloadStatusType.NOT_DOWNLOADED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ModelDownloadStatusType.SUCCEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ModelDownloadStatusType.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[ModelDownloadStatusType.IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    
    public static final Unit StatusIcon$lambda$1(Task task, Model model, ModelDownloadStatus modelDownloadStatus, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StatusIcon(task, model, modelDownloadStatus, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void StatusIcon(final Task task, final Model model, final ModelDownloadStatus downloadStatus, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Modifier modifier3;
        Modifier.Companion modifier4;
        Function0<ComposeUiNode> function0;
        long color;
        Intrinsics.checkNotNullParameter(model, "model");
        Composer $composer2 = $composer.startRestartGroup(-1208756440);
        ComposerKt.sourceInformation($composer2, "C(StatusIcon)P(3,1)52@2158L1828:StatusIcon.kt#13a6jo");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(task) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(model) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(downloadStatus) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1208756440, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.modelitem.StatusIcon (StatusIcon.kt:51)");
            }
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getCenter();
            int $changed$iv = (($dirty2 >> 9) & 14) | 432;
            Modifier modifier$iv = modifier4;
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
            int $changed$iv$iv = ($changed$iv << 3) & 112;
            modifier3 = modifier4;
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer2);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = (($changed$iv >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 1963326499, "C:StatusIcon.kt#13a6jo");
            if (task != null) {
                $composer2.startReplaceGroup(1963311773);
                ComposerKt.sourceInformation($composer2, "59@2344L36");
                long jM6925unboximpl = ColorUtilsKt.getTaskBgGradientColors(task, $composer2, $dirty2 & 14).get(1).m6925unboximpl();
                $composer2.endReplaceGroup();
                color = jM6925unboximpl;
            } else {
                $composer2.startReplaceGroup(1963374083);
                ComposerKt.sourceInformation($composer2, "61@2421L11");
                long primary = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary();
                $composer2.endReplaceGroup();
                color = primary;
            }
            if (model.getLocalFileRelativeDirPathOverride().length() > 0) {
                $composer2.startReplaceGroup(1963491418);
                ComposerKt.sourceInformation($composer2, "67@2616L43,64@2518L206");
                IconKt.m4075Iconww6aTOc(DownloadForOfflineKt.getDownloadForOffline(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_downloaded_icon, $composer2, 0), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, ConstsKt.getMODEL_INFO_ICON_SIZE()), color, $composer2, 384, 0);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(1963747416);
                ComposerKt.sourceInformation($composer2, "");
                ModelDownloadStatusType status = downloadStatus != null ? downloadStatus.getStatus() : null;
                switch (status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
                    case 1:
                        $composer2.startReplaceGroup(1963816608);
                        ComposerKt.sourceInformation($composer2, "75@2928L12,76@2994L47,73@2836L278");
                        IconKt.m4075Iconww6aTOc(HelpOutlineKt.getHelpOutline(Icons.AutoMirrored.Outlined.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_not_downloaded_icon, $composer2, 0), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, ConstsKt.getMODEL_INFO_ICON_SIZE()), ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer2, MaterialTheme.$stable).m11233getModelInfoIconColor0d7_KjU(), $composer2, 384, 0);
                        $composer2.endReplaceGroup();
                        break;
                    case 2:
                        $composer2.startReplaceGroup(1964138078);
                        ComposerKt.sourceInformation($composer2, "84@3283L43,81@3173L226");
                        IconKt.m4075Iconww6aTOc(DownloadForOfflineKt.getDownloadForOffline(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_downloaded_icon, $composer2, 0), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, ConstsKt.getMODEL_INFO_ICON_SIZE()), color, $composer2, 384, 0);
                        $composer2.endReplaceGroup();
                        break;
                    case 3:
                        $composer2.startReplaceGroup(1964437135);
                        ComposerKt.sourceInformation($composer2, "93@3573L48,90@3463L231");
                        IconKt.m4075Iconww6aTOc(ErrorKt.getError(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_download_failed_icon, $composer2, 0), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, ConstsKt.getMODEL_INFO_ICON_SIZE()), ColorKt.Color(4289331200L), $composer2, 3456, 0);
                        $composer2.endReplaceGroup();
                        break;
                    case 4:
                        $composer2.startReplaceGroup(-767905809);
                        ComposerKt.sourceInformation($composer2, "100@3831L44,98@3753L195");
                        IconKt.m4075Iconww6aTOc(DownloadingKt.getDownloading(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_downloading_icon, $composer2, 0), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, ConstsKt.getMODEL_INFO_ICON_SIZE()), 0L, $composer2, 384, 8);
                        $composer2.endReplaceGroup();
                        break;
                    default:
                        $composer2.startReplaceGroup(1964929012);
                        $composer2.endReplaceGroup();
                        break;
                }
                $composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.StatusIconKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StatusIconKt.StatusIcon$lambda$1(task, model, downloadStatus, modifier5, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
