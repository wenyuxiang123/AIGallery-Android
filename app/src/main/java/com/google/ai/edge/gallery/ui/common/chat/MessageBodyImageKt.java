package com.google.ai.edge.gallery.ui.common.chat;

import android.graphics.Bitmap;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.ImageBitmap;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
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
import com.google.ai.edge.gallery.C2421R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageBodyImage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032<\u0010\u0004\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m922d2 = {"MessageBodyImage", "", "message", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageImage;", "onImageClicked", "Lkotlin/Function2;", "", "Landroid/graphics/Bitmap;", "Lkotlin/ParameterName;", "name", "bitmaps", "", "selectedBitmapIndex", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageImage;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class MessageBodyImageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageBodyImage$lambda$6(ChatMessageImage chatMessageImage, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MessageBodyImage(chatMessageImage, function2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MessageBodyImage(final ChatMessageImage message, final Function2<? super List<Bitmap>, ? super Integer, Unit> onImageClicked, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        int $dirty;
        Composer $composer2;
        Modifier modifier3;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        int imageCount;
        int $dirty2;
        int colCount;
        String str;
        String str2;
        MeasurePolicy measurePolicy$iv$iv;
        Composer $composer3;
        int $dirty3;
        String str3;
        int imageHeight;
        int imageWidth;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onImageClicked, "onImageClicked");
        Composer $composer4 = $composer.startRestartGroup(-353662217);
        ComposerKt.sourceInformation($composer4, "C(MessageBodyImage)P(!1,2):MessageBodyImage.kt#ouynps");
        int $dirty4 = $changed;
        if (($changed & 6) == 0) {
            $dirty4 |= $composer4.changedInstance(message) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty4 |= $composer4.changedInstance(onImageClicked) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty4 |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty4 |= $composer4.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ($composer4.shouldExecute(($dirty4 & 147) != 146, $dirty4 & 1)) {
            Modifier.Companion modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-353662217, $dirty4, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageBodyImage (MessageBodyImage.kt:40)");
            }
            int imageCount2 = message.getBitmaps().size();
            String str4 = "CC(remember):MessageBodyImage.kt#9igjgp";
            if (imageCount2 == 1) {
                $composer4.startReplaceGroup(-396044698);
                ComposerKt.sourceInformation($composer4, "62@2240L38,64@2368L56,60@2178L292");
                Bitmap bitmap = message.getBitmaps().get(0);
                ImageBitmap imageBitMap = message.getImageBitMaps().get(0);
                int bitmapWidth = bitmap.getWidth();
                int bitmapHeight = bitmap.getHeight();
                int maxSize = message.getMaxSize();
                if (bitmapWidth >= maxSize || bitmapHeight >= maxSize) {
                    int imageWidth2 = bitmapWidth >= bitmapHeight ? maxSize : (int) ((maxSize / bitmapHeight) * bitmapWidth);
                    imageHeight = bitmapHeight >= bitmapWidth ? maxSize : (int) ((maxSize / bitmapWidth) * bitmapHeight);
                    imageWidth = imageWidth2;
                } else {
                    imageWidth = bitmapWidth;
                    imageHeight = bitmapHeight;
                }
                String strStringResource = StringResources_androidKt.stringResource(C2421R.string.cd_user_image, $composer4, 0);
                int $this$dp$iv = imageHeight;
                Modifier modifierM2022height3ABfNKs = SizeKt.m2022height3ABfNKs(modifier4, C1654Dp.m9788constructorimpl($this$dp$iv));
                int $this$dp$iv2 = imageWidth;
                modifier3 = modifier4;
                Modifier modifierM2041width3ABfNKs = SizeKt.m2041width3ABfNKs(modifierM2022height3ABfNKs, C1654Dp.m9788constructorimpl($this$dp$iv2));
                ComposerKt.sourceInformationMarkerStart($composer4, -566940369, "CC(remember):MessageBodyImage.kt#9igjgp");
                boolean invalid$iv = $composer4.changedInstance(message) | (($dirty4 & 112) == 32);
                Object it$iv = $composer4.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyImageKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MessageBodyImageKt.MessageBodyImage$lambda$1$lambda$0(onImageClicked, message);
                        }
                    };
                    $composer4.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ImageKt.m1426Image5hnEew(imageBitMap, strStringResource, ClickableKt.m1401clickableoSLSa3U(modifierM2041width3ABfNKs, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv), null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, $composer4, 24576, 232);
                $composer4.endReplaceGroup();
                $dirty = $dirty4;
                $composer2 = $composer4;
            } else {
                modifier3 = modifier4;
                $composer4.startReplaceGroup(-395080970);
                ComposerKt.sourceInformation($composer4, "79@2682L961");
                int colCount2 = imageCount2 == 4 ? 2 : 3;
                int rowCount = (int) Math.ceil(imageCount2 / colCount2);
                Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getEnd();
                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(2));
                int $changed$iv = 432;
                ComposerKt.sourceInformationMarkerStart($composer4, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier modifier$iv$iv = Modifier.INSTANCE;
                MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer4, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                int $changed$iv$iv = (432 << 3) & 112;
                String str5 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
                ComposerKt.sourceInformationMarkerStart($composer4, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer4, 0));
                CompositionLocalMap localMap$iv$iv = $composer4.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer4, modifier$iv$iv);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
                String str6 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                ComposerKt.sourceInformationMarkerStart($composer4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer4.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer4.startReusableNode();
                if ($composer4.getInserting()) {
                    function0 = constructor;
                    $composer4.createNode(function0);
                } else {
                    function0 = constructor;
                    $composer4.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer4);
                Composer $composer5 = $composer4;
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = ($changed$iv$iv$iv >> 6) & 14;
                Composer $composer$iv = $composer4;
                int i4 = 0;
                MeasurePolicy measurePolicy$iv$iv2 = measurePolicy$iv;
                ComposerKt.sourceInformationMarkerStart($composer$iv, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i5 = ((432 >> 6) & 112) | 6;
                String str7 = "C:MessageBodyImage.kt#ouynps";
                Composer $composer6 = $composer$iv;
                ComposerKt.sourceInformationMarkerStart($composer6, -117789551, "C:MessageBodyImage.kt#ouynps");
                $composer6.startReplaceGroup(1104578994);
                ComposerKt.sourceInformation($composer6, "*81@2820L809");
                int row = 0;
                while (row < rowCount) {
                    Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
                    int rowCount2 = rowCount;
                    int $changed$iv2 = $changed$iv;
                    int i6 = i4;
                    Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(2));
                    int $changed$iv3 = 432;
                    Composer $composer$iv2 = $composer6;
                    CompositionLocalMap localMap$iv$iv2 = localMap$iv$iv;
                    int $changed$iv$iv$iv2 = $changed$iv$iv$iv;
                    ComposerKt.sourceInformationMarkerStart($composer$iv2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    Modifier modifier$iv = Modifier.INSTANCE;
                    Modifier materialized$iv$iv2 = materialized$iv$iv;
                    MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer$iv2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                    int $changed$iv$iv2 = (432 << 3) & 112;
                    ComposerKt.sourceInformationMarkerStart($composer$iv2, -1159599143, str5);
                    int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv2, 0));
                    String str8 = str5;
                    CompositionLocalMap localMap$iv$iv3 = $composer$iv2.getCurrentCompositionLocalMap();
                    Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer$iv2, modifier$iv);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int $changed$iv$iv$iv3 = (($changed$iv$iv2 << 6) & 896) | 6;
                    Composer $composer$iv3 = $composer$iv;
                    Composer $composer7 = $composer6;
                    ComposerKt.sourceInformationMarkerStart($composer$iv2, -553112988, str6);
                    if (!($composer$iv2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer$iv2.startReusableNode();
                    if ($composer$iv2.getInserting()) {
                        function02 = constructor2;
                        $composer$iv2.createNode(function02);
                    } else {
                        function02 = constructor2;
                        $composer$iv2.useNode();
                    }
                    Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer$iv2);
                    String str9 = str6;
                    MeasurePolicy measurePolicy$iv$iv3 = measurePolicy$iv2;
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i7 = ($changed$iv$iv$iv3 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer$iv2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i8 = ((432 >> 6) & 112) | 6;
                    $composer$iv2.startReplaceGroup(1654702592);
                    ComposerKt.sourceInformation($composer$iv2, str7);
                    $composer$iv2.startReplaceGroup(191924835);
                    ComposerKt.sourceInformation($composer$iv2, "*94@3297L75,96@3463L81,91@3203L404");
                    int col = 0;
                    while (true) {
                        if (col >= colCount2) {
                            imageCount = imageCount2;
                            $dirty2 = $dirty4;
                            colCount = colCount2;
                            str = str7;
                            str2 = str4;
                            measurePolicy$iv$iv = measurePolicy$iv$iv2;
                            $composer3 = $composer5;
                            $composer$iv2.endReplaceGroup();
                            $composer$iv2.endReplaceGroup();
                            break;
                        }
                        colCount = colCount2;
                        final int colCount3 = (row * colCount2) + col;
                        if (colCount3 >= imageCount2) {
                            $composer$iv2.endReplaceGroup();
                            $composer$iv2.endReplaceGroup();
                            imageCount = imageCount2;
                            $dirty2 = $dirty4;
                            str = str7;
                            str2 = str4;
                            measurePolicy$iv$iv = measurePolicy$iv$iv2;
                            $composer3 = $composer5;
                            break;
                        }
                        String str10 = str7;
                        ImageBitmap imageBitMap2 = message.getImageBitMaps().get(colCount3);
                        int $changed$iv4 = $changed$iv3;
                        int $changed$iv5 = C2421R.string.cd_user_image_in_group;
                        MeasurePolicy measurePolicy$iv$iv4 = measurePolicy$iv$iv3;
                        int compositeKeyHash$iv$iv3 = compositeKeyHash$iv$iv2;
                        String strStringResource2 = StringResources_androidKt.stringResource($changed$iv5, new Object[]{Integer.valueOf(colCount3 + 1), Integer.valueOf(imageCount2)}, $composer$iv2, 0);
                        int imageCount3 = imageCount2;
                        Modifier modifierM2041width3ABfNKs2 = SizeKt.m2041width3ABfNKs(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(100)), C1654Dp.m9788constructorimpl(100));
                        ComposerKt.sourceInformationMarkerStart($composer$iv2, 191940136, str4);
                        MeasurePolicy measurePolicy$iv$iv5 = measurePolicy$iv$iv2;
                        Composer $composer8 = $composer5;
                        boolean invalid$iv2 = (($dirty4 & 112) == 32) | $composer8.changedInstance(message) | $composer8.changed(colCount3);
                        Object it$iv2 = $composer$iv2.rememberedValue();
                        if (invalid$iv2) {
                            $dirty3 = $dirty4;
                        } else {
                            $dirty3 = $dirty4;
                            if (it$iv2 != Composer.INSTANCE.getEmpty()) {
                                str3 = str4;
                            }
                            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                            ImageKt.m1426Image5hnEew(imageBitMap2, strStringResource2, ClickableKt.m1401clickableoSLSa3U(modifierM2041width3ABfNKs2, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv2), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, $composer$iv2, 24576, 232);
                            col++;
                            $composer5 = $composer8;
                            measurePolicy$iv$iv2 = measurePolicy$iv$iv5;
                            imageCount2 = imageCount3;
                            colCount2 = colCount;
                            str7 = str10;
                            $changed$iv3 = $changed$iv4;
                            measurePolicy$iv$iv3 = measurePolicy$iv$iv4;
                            compositeKeyHash$iv$iv2 = compositeKeyHash$iv$iv3;
                            $dirty4 = $dirty3;
                            str4 = str3;
                        }
                        str3 = str4;
                        Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyImageKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MessageBodyImageKt.MessageBodyImage$lambda$5$lambda$4$lambda$3$lambda$2(onImageClicked, message, colCount3);
                            }
                        };
                        $composer$iv2.updateRememberedValue(value$iv2);
                        it$iv2 = value$iv2;
                        ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                        ImageKt.m1426Image5hnEew(imageBitMap2, strStringResource2, ClickableKt.m1401clickableoSLSa3U(modifierM2041width3ABfNKs2, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv2), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, $composer$iv2, 24576, 232);
                        col++;
                        $composer5 = $composer8;
                        measurePolicy$iv$iv2 = measurePolicy$iv$iv5;
                        imageCount2 = imageCount3;
                        colCount2 = colCount;
                        str7 = str10;
                        $changed$iv3 = $changed$iv4;
                        measurePolicy$iv$iv3 = measurePolicy$iv$iv4;
                        compositeKeyHash$iv$iv2 = compositeKeyHash$iv$iv3;
                        $dirty4 = $dirty3;
                        str4 = str3;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                    $composer$iv2.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                    row++;
                    $composer5 = $composer3;
                    measurePolicy$iv$iv2 = measurePolicy$iv$iv;
                    imageCount2 = imageCount;
                    $composer6 = $composer7;
                    rowCount = rowCount2;
                    $changed$iv = $changed$iv2;
                    i4 = i6;
                    localMap$iv$iv = localMap$iv$iv2;
                    $changed$iv$iv$iv = $changed$iv$iv$iv2;
                    materialized$iv$iv = materialized$iv$iv2;
                    str5 = str8;
                    $composer$iv = $composer$iv3;
                    str6 = str9;
                    colCount2 = colCount;
                    str7 = str;
                    $dirty4 = $dirty2;
                    str4 = str2;
                }
                $dirty = $dirty4;
                Composer $composer9 = $composer6;
                $composer2 = $composer5;
                $composer9.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd($composer9);
                ComposerKt.sourceInformationMarkerEnd($composer$iv);
                $composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerEnd($composer4);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $dirty = $dirty4;
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
            modifier3 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyImageKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageBodyImageKt.MessageBodyImage$lambda$6(message, onImageClicked, modifier5, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageBodyImage$lambda$1$lambda$0(Function2 $onImageClicked, ChatMessageImage $message) {
        $onImageClicked.invoke($message.getBitmaps(), 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageBodyImage$lambda$5$lambda$4$lambda$3$lambda$2(Function2 $onImageClicked, ChatMessageImage $message, int $imageIndex) {
        $onImageClicked.invoke($message.getBitmaps(), Integer.valueOf($imageIndex));
        return Unit.INSTANCE;
    }
}
