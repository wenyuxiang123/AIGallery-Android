package com.google.ai.edge.gallery.data;

import android.content.Context;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.common.primitives.Ints;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\\\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0015\u0012\b\b\u0002\u0010$\u001a\u00020\u0015\u0012\b\b\u0002\u0010%\u001a\u00020\u0015\u0012\b\b\u0002\u0010&\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0007\u0012\b\b\u0002\u0010)\u001a\u00020\u0015\u0012\b\b\u0002\u0010*\u001a\u00020\u0015\u0012\b\b\u0002\u0010+\u001a\u00020\u0015\u0012\b\b\u0002\u0010,\u001a\u00020\u0015\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0007\u0012\b\b\u0002\u0010/\u001a\u00020\f\u0012\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0007\u0012\b\b\u0002\u00102\u001a\u000201\u0012\b\b\u0002\u00103\u001a\u00020\u0015\u0012\u001a\b\u0002\u00104\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000705\u0012\b\b\u0002\u00106\u001a\u00020\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u00108\u001a\u00020\u0015\u0012\b\b\u0002\u00109\u001a\u00020\u0015\u0012\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000105\u0012\u0014\b\u0002\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000105\u0012\b\b\u0002\u0010<\u001a\u00020\u000f\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010>\u001a\u00020\u0015\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b@\u0010AJ\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001J\u001c\u0010\u0093\u0001\u001a\u00020\u00032\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020\u0003J\u001c\u0010\u0097\u0001\u001a\u00020\f2\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\t\b\u0002\u0010\u009a\u0001\u001a\u00020\fJ\u001e\u0010\u009b\u0001\u001a\u00030\u009c\u00012\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\n\b\u0002\u0010\u009a\u0001\u001a\u00030\u009c\u0001J\u001c\u0010\u009d\u0001\u001a\u00020\u00152\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\t\b\u0002\u0010\u009a\u0001\u001a\u00020\u0015J\u001c\u0010\u009e\u0001\u001a\u00020\u00032\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\t\b\u0002\u0010\u009a\u0001\u001a\u00020\u0003J\u0011\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0002\u001a\u00020\u0003J&\u0010 \u0001\u001a\u00020\u00012\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\b\u0010¡\u0001\u001a\u00030¢\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u0001H\u0002J\n\u0010£\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u0011\u0010©\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010MJ\n\u0010ª\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0015HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¶\u0001\u001a\u00020 HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020(0\u0007HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0015HÆ\u0003J\u0010\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020.0\u0007HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\fHÆ\u0003J\u0010\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u0002010\u0007HÆ\u0003J\n\u0010Å\u0001\u001a\u000201HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0015HÆ\u0003J\u001c\u0010Ç\u0001\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000705HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0015HÆ\u0003J\u0016\u0010Ì\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000105HÆ\u0003J\u0016\u0010Í\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000105HÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u000fHÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0015HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003JÊ\u0004\u0010Ò\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00152\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u00032\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\b\b\u0002\u0010)\u001a\u00020\u00152\b\b\u0002\u0010*\u001a\u00020\u00152\b\b\u0002\u0010+\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020\u00152\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\b\b\u0002\u0010/\u001a\u00020\f2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00072\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u00020\u00152\u001a\b\u0002\u00104\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007052\b\b\u0002\u00106\u001a\u00020\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u00108\u001a\u00020\u00152\b\b\u0002\u00109\u001a\u00020\u00152\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001052\u0014\b\u0002\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001052\b\b\u0002\u0010<\u001a\u00020\u000f2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010>\u001a\u00020\u00152\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0003\u0010Ó\u0001J\u0015\u0010Ô\u0001\u001a\u00020\u00152\t\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ö\u0001\u001a\u00020\fHÖ\u0001J\n\u0010×\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010CR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010CR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010CR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\bK\u0010GR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010CR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010C\"\u0004\bS\u0010TR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010C\"\u0004\bV\u0010TR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007¢\u0006\b\n\u0000\u001a\u0004\bW\u0010GR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010XR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010CR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010CR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007¢\u0006\b\n\u0000\u001a\u0004\b_\u0010GR\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010CR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010CR\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010CR\u0011\u0010#\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\be\u0010XR\u0011\u0010$\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bf\u0010XR\u0011\u0010%\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b%\u0010XR\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010CR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0007¢\u0006\b\n\u0000\u001a\u0004\bh\u0010GR\u0011\u0010)\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bi\u0010XR\u0011\u0010*\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bj\u0010XR\u0011\u0010+\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bk\u0010XR\u0011\u0010,\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bl\u0010XR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0007¢\u0006\b\n\u0000\u001a\u0004\bm\u0010GR\u0011\u0010/\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0007¢\u0006\b\n\u0000\u001a\u0004\bp\u0010GR\u0011\u00102\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0011\u00103\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bs\u0010XR#\u00104\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000705¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u001a\u00106\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010C\"\u0004\bw\u0010TR\u001c\u00107\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u001a\u00108\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010X\"\u0004\b}\u0010~R\u001b\u00109\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010X\"\u0005\b\u0080\u0001\u0010~R)\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000105X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0081\u0001\u0010u\"\u0006\b\u0082\u0001\u0010\u0083\u0001R)\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000105X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0084\u0001\u0010u\"\u0006\b\u0085\u0001\u0010\u0083\u0001R\u001d\u0010<\u001a\u00020\u000fX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0086\u0001\u0010Q\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001e\u0010=\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010C\"\u0005\b\u008a\u0001\u0010TR\u001c\u0010>\u001a\u00020\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010X\"\u0005\b\u008c\u0001\u0010~R \u0010?\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006Ø\u0001"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/Model;", "", "name", "", "displayName", "info", "configs", "", "Lcom/google/ai/edge/gallery/data/Config;", "learnMoreUrl", "bestForTaskIds", "minDeviceMemoryInGb", "", ImagesContract.URL, "sizeInBytes", "", "downloadFileName", "version", "extraDataFiles", "Lcom/google/ai/edge/gallery/data/ModelDataFile;", "isLlm", "", "aicoreReleaseStage", "Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;", "aicorePreference", "Lcom/google/ai/edge/gallery/data/AICoreModelPreference;", "parentModelName", "variantLabel", "updatableModelFiles", "Lcom/google/ai/edge/gallery/data/ModelFile;", "updateInfo", "runtimeType", "Lcom/google/ai/edge/gallery/data/RuntimeType;", "localFileRelativeDirPathOverride", "localModelFilePathOverride", "showRunAgainButton", "showBenchmarkButton", "isZip", "unzipDir", "llmPromptTemplates", "Lcom/google/ai/edge/gallery/data/PromptTemplate;", "llmSupportImage", "llmSupportAudio", "llmSupportTinyGarden", "llmSupportMobileActions", "capabilities", "Lcom/google/ai/edge/gallery/data/ModelCapability;", "llmMaxToken", "accelerators", "Lcom/google/ai/edge/gallery/data/Accelerator;", "visionAccelerator", "imported", "capabilityToTaskTypes", "", "normalizedName", "instance", "initializing", "cleanUpAfterInit", "configValues", "prevConfigValues", "totalBytes", "accessToken", "updatable", "latestModelFile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;Lcom/google/ai/edge/gallery/data/AICoreModelPreference;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/ai/edge/gallery/data/RuntimeType;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;ZZZZLjava/util/List;ILjava/util/List;Lcom/google/ai/edge/gallery/data/Accelerator;ZLjava/util/Map;Ljava/lang/String;Ljava/lang/Object;ZZLjava/util/Map;Ljava/util/Map;JLjava/lang/String;ZLcom/google/ai/edge/gallery/data/ModelFile;)V", "getName", "()Ljava/lang/String;", "getDisplayName", "getInfo", "getConfigs", "()Ljava/util/List;", "setConfigs", "(Ljava/util/List;)V", "getLearnMoreUrl", "getBestForTaskIds", "getMinDeviceMemoryInGb", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl", "getSizeInBytes", "()J", "getDownloadFileName", "setDownloadFileName", "(Ljava/lang/String;)V", "getVersion", "setVersion", "getExtraDataFiles", "()Z", "getAicoreReleaseStage", "()Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;", "getAicorePreference", "()Lcom/google/ai/edge/gallery/data/AICoreModelPreference;", "getParentModelName", "getVariantLabel", "getUpdatableModelFiles", "getUpdateInfo", "getRuntimeType", "()Lcom/google/ai/edge/gallery/data/RuntimeType;", "getLocalFileRelativeDirPathOverride", "getLocalModelFilePathOverride", "getShowRunAgainButton", "getShowBenchmarkButton", "getUnzipDir", "getLlmPromptTemplates", "getLlmSupportImage", "getLlmSupportAudio", "getLlmSupportTinyGarden", "getLlmSupportMobileActions", "getCapabilities", "getLlmMaxToken", "()I", "getAccelerators", "getVisionAccelerator", "()Lcom/google/ai/edge/gallery/data/Accelerator;", "getImported", "getCapabilityToTaskTypes", "()Ljava/util/Map;", "getNormalizedName", "setNormalizedName", "getInstance", "()Ljava/lang/Object;", "setInstance", "(Ljava/lang/Object;)V", "getInitializing", "setInitializing", "(Z)V", "getCleanUpAfterInit", "setCleanUpAfterInit", "getConfigValues", "setConfigValues", "(Ljava/util/Map;)V", "getPrevConfigValues", "setPrevConfigValues", "getTotalBytes", "setTotalBytes", "(J)V", "getAccessToken", "setAccessToken", "getUpdatable", "setUpdatable", "getLatestModelFile", "()Lcom/google/ai/edge/gallery/data/ModelFile;", "setLatestModelFile", "(Lcom/google/ai/edge/gallery/data/ModelFile;)V", "preProcess", "", "getPath", "context", "Landroid/content/Context;", "fileName", "getIntConfigValue", "key", "Lcom/google/ai/edge/gallery/data/ConfigKey;", "defaultValue", "getFloatConfigValue", "", "getBooleanConfigValue", "getStringConfigValue", "getExtraDataFile", "getTypedConfigValue", "valueType", "Lcom/google/ai/edge/gallery/data/ValueType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;Lcom/google/ai/edge/gallery/data/AICoreModelPreference;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/ai/edge/gallery/data/RuntimeType;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;ZZZZLjava/util/List;ILjava/util/List;Lcom/google/ai/edge/gallery/data/Accelerator;ZLjava/util/Map;Ljava/lang/String;Ljava/lang/Object;ZZLjava/util/Map;Ljava/util/Map;JLjava/lang/String;ZLcom/google/ai/edge/gallery/data/ModelFile;)Lcom/google/ai/edge/gallery/data/Model;", "equals", "other", "hashCode", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class Model {
    public static final int $stable = 8;
    private final List<Accelerator> accelerators;
    private String accessToken;
    private final AICoreModelPreference aicorePreference;
    private final AICoreModelReleaseStage aicoreReleaseStage;
    private final List<String> bestForTaskIds;
    private final List<ModelCapability> capabilities;
    private final Map<ModelCapability, List<String>> capabilityToTaskTypes;
    private boolean cleanUpAfterInit;
    private Map<String, ? extends Object> configValues;
    private List<? extends Config> configs;
    private final String displayName;
    private String downloadFileName;
    private final List<ModelDataFile> extraDataFiles;
    private final boolean imported;
    private final String info;
    private boolean initializing;
    private Object instance;
    private final boolean isLlm;
    private final boolean isZip;
    private ModelFile latestModelFile;
    private final String learnMoreUrl;
    private final int llmMaxToken;
    private final List<PromptTemplate> llmPromptTemplates;
    private final boolean llmSupportAudio;
    private final boolean llmSupportImage;
    private final boolean llmSupportMobileActions;
    private final boolean llmSupportTinyGarden;
    private final String localFileRelativeDirPathOverride;
    private final String localModelFilePathOverride;
    private final Integer minDeviceMemoryInGb;
    private final String name;
    private String normalizedName;
    private final String parentModelName;
    private Map<String, ? extends Object> prevConfigValues;
    private final RuntimeType runtimeType;
    private final boolean showBenchmarkButton;
    private final boolean showRunAgainButton;
    private final long sizeInBytes;
    private long totalBytes;
    private final String unzipDir;
    private boolean updatable;
    private final List<ModelFile> updatableModelFiles;
    private final String updateInfo;
    private final String url;
    private final String variantLabel;
    private String version;
    private final Accelerator visionAccelerator;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDownloadFileName() {
        return this.downloadFileName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final List<ModelDataFile> component12() {
        return this.extraDataFiles;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsLlm() {
        return this.isLlm;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final AICoreModelReleaseStage getAicoreReleaseStage() {
        return this.aicoreReleaseStage;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final AICoreModelPreference getAicorePreference() {
        return this.aicorePreference;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getParentModelName() {
        return this.parentModelName;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getVariantLabel() {
        return this.variantLabel;
    }

    public final List<ModelFile> component18() {
        return this.updatableModelFiles;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getUpdateInfo() {
        return this.updateInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final RuntimeType getRuntimeType() {
        return this.runtimeType;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getLocalFileRelativeDirPathOverride() {
        return this.localFileRelativeDirPathOverride;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getLocalModelFilePathOverride() {
        return this.localModelFilePathOverride;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getShowRunAgainButton() {
        return this.showRunAgainButton;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getShowBenchmarkButton() {
        return this.showBenchmarkButton;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getIsZip() {
        return this.isZip;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getUnzipDir() {
        return this.unzipDir;
    }

    public final List<PromptTemplate> component27() {
        return this.llmPromptTemplates;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getLlmSupportImage() {
        return this.llmSupportImage;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getLlmSupportAudio() {
        return this.llmSupportAudio;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getLlmSupportTinyGarden() {
        return this.llmSupportTinyGarden;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final boolean getLlmSupportMobileActions() {
        return this.llmSupportMobileActions;
    }

    public final List<ModelCapability> component32() {
        return this.capabilities;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final int getLlmMaxToken() {
        return this.llmMaxToken;
    }

    public final List<Accelerator> component34() {
        return this.accelerators;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Accelerator getVisionAccelerator() {
        return this.visionAccelerator;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final boolean getImported() {
        return this.imported;
    }

    public final Map<ModelCapability, List<String>> component37() {
        return this.capabilityToTaskTypes;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getNormalizedName() {
        return this.normalizedName;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Object getInstance() {
        return this.instance;
    }

    public final List<Config> component4() {
        return this.configs;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final boolean getInitializing() {
        return this.initializing;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final boolean getCleanUpAfterInit() {
        return this.cleanUpAfterInit;
    }

    public final Map<String, Object> component42() {
        return this.configValues;
    }

    public final Map<String, Object> component43() {
        return this.prevConfigValues;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final long getTotalBytes() {
        return this.totalBytes;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final boolean getUpdatable() {
        return this.updatable;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final ModelFile getLatestModelFile() {
        return this.latestModelFile;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public final List<String> component6() {
        return this.bestForTaskIds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getMinDeviceMemoryInGb() {
        return this.minDeviceMemoryInGb;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getSizeInBytes() {
        return this.sizeInBytes;
    }

    public final Model copy(String name, String displayName, String info, List<? extends Config> configs, String learnMoreUrl, List<String> bestForTaskIds, Integer minDeviceMemoryInGb, String url, long sizeInBytes, String downloadFileName, String version, List<ModelDataFile> extraDataFiles, boolean isLlm, AICoreModelReleaseStage aicoreReleaseStage, AICoreModelPreference aicorePreference, String parentModelName, String variantLabel, List<ModelFile> updatableModelFiles, String updateInfo, RuntimeType runtimeType, String localFileRelativeDirPathOverride, String localModelFilePathOverride, boolean showRunAgainButton, boolean showBenchmarkButton, boolean isZip, String unzipDir, List<PromptTemplate> llmPromptTemplates, boolean llmSupportImage, boolean llmSupportAudio, boolean llmSupportTinyGarden, boolean llmSupportMobileActions, List<? extends ModelCapability> capabilities, int llmMaxToken, List<? extends Accelerator> accelerators, Accelerator visionAccelerator, boolean imported, Map<ModelCapability, ? extends List<String>> capabilityToTaskTypes, String normalizedName, Object instance, boolean initializing, boolean cleanUpAfterInit, Map<String, ? extends Object> configValues, Map<String, ? extends Object> prevConfigValues, long totalBytes, String accessToken, boolean updatable, ModelFile latestModelFile) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        Intrinsics.checkNotNullParameter(bestForTaskIds, "bestForTaskIds");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(downloadFileName, "downloadFileName");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(extraDataFiles, "extraDataFiles");
        Intrinsics.checkNotNullParameter(updatableModelFiles, "updatableModelFiles");
        Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        Intrinsics.checkNotNullParameter(runtimeType, "runtimeType");
        Intrinsics.checkNotNullParameter(localFileRelativeDirPathOverride, "localFileRelativeDirPathOverride");
        Intrinsics.checkNotNullParameter(localModelFilePathOverride, "localModelFilePathOverride");
        Intrinsics.checkNotNullParameter(unzipDir, "unzipDir");
        Intrinsics.checkNotNullParameter(llmPromptTemplates, "llmPromptTemplates");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(accelerators, "accelerators");
        Intrinsics.checkNotNullParameter(visionAccelerator, "visionAccelerator");
        Intrinsics.checkNotNullParameter(capabilityToTaskTypes, "capabilityToTaskTypes");
        Intrinsics.checkNotNullParameter(normalizedName, "normalizedName");
        Intrinsics.checkNotNullParameter(configValues, "configValues");
        Intrinsics.checkNotNullParameter(prevConfigValues, "prevConfigValues");
        return new Model(name, displayName, info, configs, learnMoreUrl, bestForTaskIds, minDeviceMemoryInGb, url, sizeInBytes, downloadFileName, version, extraDataFiles, isLlm, aicoreReleaseStage, aicorePreference, parentModelName, variantLabel, updatableModelFiles, updateInfo, runtimeType, localFileRelativeDirPathOverride, localModelFilePathOverride, showRunAgainButton, showBenchmarkButton, isZip, unzipDir, llmPromptTemplates, llmSupportImage, llmSupportAudio, llmSupportTinyGarden, llmSupportMobileActions, capabilities, llmMaxToken, accelerators, visionAccelerator, imported, capabilityToTaskTypes, normalizedName, instance, initializing, cleanUpAfterInit, configValues, prevConfigValues, totalBytes, accessToken, updatable, latestModelFile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Model)) {
            return false;
        }
        Model model = (Model) other;
        return Intrinsics.areEqual(this.name, model.name) && Intrinsics.areEqual(this.displayName, model.displayName) && Intrinsics.areEqual(this.info, model.info) && Intrinsics.areEqual(this.configs, model.configs) && Intrinsics.areEqual(this.learnMoreUrl, model.learnMoreUrl) && Intrinsics.areEqual(this.bestForTaskIds, model.bestForTaskIds) && Intrinsics.areEqual(this.minDeviceMemoryInGb, model.minDeviceMemoryInGb) && Intrinsics.areEqual(this.url, model.url) && this.sizeInBytes == model.sizeInBytes && Intrinsics.areEqual(this.downloadFileName, model.downloadFileName) && Intrinsics.areEqual(this.version, model.version) && Intrinsics.areEqual(this.extraDataFiles, model.extraDataFiles) && this.isLlm == model.isLlm && this.aicoreReleaseStage == model.aicoreReleaseStage && this.aicorePreference == model.aicorePreference && Intrinsics.areEqual(this.parentModelName, model.parentModelName) && Intrinsics.areEqual(this.variantLabel, model.variantLabel) && Intrinsics.areEqual(this.updatableModelFiles, model.updatableModelFiles) && Intrinsics.areEqual(this.updateInfo, model.updateInfo) && this.runtimeType == model.runtimeType && Intrinsics.areEqual(this.localFileRelativeDirPathOverride, model.localFileRelativeDirPathOverride) && Intrinsics.areEqual(this.localModelFilePathOverride, model.localModelFilePathOverride) && this.showRunAgainButton == model.showRunAgainButton && this.showBenchmarkButton == model.showBenchmarkButton && this.isZip == model.isZip && Intrinsics.areEqual(this.unzipDir, model.unzipDir) && Intrinsics.areEqual(this.llmPromptTemplates, model.llmPromptTemplates) && this.llmSupportImage == model.llmSupportImage && this.llmSupportAudio == model.llmSupportAudio && this.llmSupportTinyGarden == model.llmSupportTinyGarden && this.llmSupportMobileActions == model.llmSupportMobileActions && Intrinsics.areEqual(this.capabilities, model.capabilities) && this.llmMaxToken == model.llmMaxToken && Intrinsics.areEqual(this.accelerators, model.accelerators) && this.visionAccelerator == model.visionAccelerator && this.imported == model.imported && Intrinsics.areEqual(this.capabilityToTaskTypes, model.capabilityToTaskTypes) && Intrinsics.areEqual(this.normalizedName, model.normalizedName) && Intrinsics.areEqual(this.instance, model.instance) && this.initializing == model.initializing && this.cleanUpAfterInit == model.cleanUpAfterInit && Intrinsics.areEqual(this.configValues, model.configValues) && Intrinsics.areEqual(this.prevConfigValues, model.prevConfigValues) && this.totalBytes == model.totalBytes && Intrinsics.areEqual(this.accessToken, model.accessToken) && this.updatable == model.updatable && Intrinsics.areEqual(this.latestModelFile, model.latestModelFile);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.name.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.info.hashCode()) * 31) + this.configs.hashCode()) * 31) + this.learnMoreUrl.hashCode()) * 31) + this.bestForTaskIds.hashCode()) * 31) + (this.minDeviceMemoryInGb == null ? 0 : this.minDeviceMemoryInGb.hashCode())) * 31) + this.url.hashCode()) * 31) + Long.hashCode(this.sizeInBytes)) * 31) + this.downloadFileName.hashCode()) * 31) + this.version.hashCode()) * 31) + this.extraDataFiles.hashCode()) * 31) + Boolean.hashCode(this.isLlm)) * 31) + (this.aicoreReleaseStage == null ? 0 : this.aicoreReleaseStage.hashCode())) * 31) + (this.aicorePreference == null ? 0 : this.aicorePreference.hashCode())) * 31) + (this.parentModelName == null ? 0 : this.parentModelName.hashCode())) * 31) + (this.variantLabel == null ? 0 : this.variantLabel.hashCode())) * 31) + this.updatableModelFiles.hashCode()) * 31) + this.updateInfo.hashCode()) * 31) + this.runtimeType.hashCode()) * 31) + this.localFileRelativeDirPathOverride.hashCode()) * 31) + this.localModelFilePathOverride.hashCode()) * 31) + Boolean.hashCode(this.showRunAgainButton)) * 31) + Boolean.hashCode(this.showBenchmarkButton)) * 31) + Boolean.hashCode(this.isZip)) * 31) + this.unzipDir.hashCode()) * 31) + this.llmPromptTemplates.hashCode()) * 31) + Boolean.hashCode(this.llmSupportImage)) * 31) + Boolean.hashCode(this.llmSupportAudio)) * 31) + Boolean.hashCode(this.llmSupportTinyGarden)) * 31) + Boolean.hashCode(this.llmSupportMobileActions)) * 31) + this.capabilities.hashCode()) * 31) + Integer.hashCode(this.llmMaxToken)) * 31) + this.accelerators.hashCode()) * 31) + this.visionAccelerator.hashCode()) * 31) + Boolean.hashCode(this.imported)) * 31) + this.capabilityToTaskTypes.hashCode()) * 31) + this.normalizedName.hashCode()) * 31) + (this.instance == null ? 0 : this.instance.hashCode())) * 31) + Boolean.hashCode(this.initializing)) * 31) + Boolean.hashCode(this.cleanUpAfterInit)) * 31) + this.configValues.hashCode()) * 31) + this.prevConfigValues.hashCode()) * 31) + Long.hashCode(this.totalBytes)) * 31) + (this.accessToken == null ? 0 : this.accessToken.hashCode())) * 31) + Boolean.hashCode(this.updatable)) * 31) + (this.latestModelFile != null ? this.latestModelFile.hashCode() : 0);
    }

    public String toString() {
        return "Model(name=" + this.name + ", displayName=" + this.displayName + ", info=" + this.info + ", configs=" + this.configs + ", learnMoreUrl=" + this.learnMoreUrl + ", bestForTaskIds=" + this.bestForTaskIds + ", minDeviceMemoryInGb=" + this.minDeviceMemoryInGb + ", url=" + this.url + ", sizeInBytes=" + this.sizeInBytes + ", downloadFileName=" + this.downloadFileName + ", version=" + this.version + ", extraDataFiles=" + this.extraDataFiles + ", isLlm=" + this.isLlm + ", aicoreReleaseStage=" + this.aicoreReleaseStage + ", aicorePreference=" + this.aicorePreference + ", parentModelName=" + this.parentModelName + ", variantLabel=" + this.variantLabel + ", updatableModelFiles=" + this.updatableModelFiles + ", updateInfo=" + this.updateInfo + ", runtimeType=" + this.runtimeType + ", localFileRelativeDirPathOverride=" + this.localFileRelativeDirPathOverride + ", localModelFilePathOverride=" + this.localModelFilePathOverride + ", showRunAgainButton=" + this.showRunAgainButton + ", showBenchmarkButton=" + this.showBenchmarkButton + ", isZip=" + this.isZip + ", unzipDir=" + this.unzipDir + ", llmPromptTemplates=" + this.llmPromptTemplates + ", llmSupportImage=" + this.llmSupportImage + ", llmSupportAudio=" + this.llmSupportAudio + ", llmSupportTinyGarden=" + this.llmSupportTinyGarden + ", llmSupportMobileActions=" + this.llmSupportMobileActions + ", capabilities=" + this.capabilities + ", llmMaxToken=" + this.llmMaxToken + ", accelerators=" + this.accelerators + ", visionAccelerator=" + this.visionAccelerator + ", imported=" + this.imported + ", capabilityToTaskTypes=" + this.capabilityToTaskTypes + ", normalizedName=" + this.normalizedName + ", instance=" + this.instance + ", initializing=" + this.initializing + ", cleanUpAfterInit=" + this.cleanUpAfterInit + ", configValues=" + this.configValues + ", prevConfigValues=" + this.prevConfigValues + ", totalBytes=" + this.totalBytes + ", accessToken=" + this.accessToken + ", updatable=" + this.updatable + ", latestModelFile=" + this.latestModelFile + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Model(String name, String displayName, String info, List<? extends Config> configs, String learnMoreUrl, List<String> bestForTaskIds, Integer minDeviceMemoryInGb, String url, long sizeInBytes, String downloadFileName, String version, List<ModelDataFile> extraDataFiles, boolean isLlm, AICoreModelReleaseStage aicoreReleaseStage, AICoreModelPreference aicorePreference, String parentModelName, String variantLabel, List<ModelFile> updatableModelFiles, String updateInfo, RuntimeType runtimeType, String localFileRelativeDirPathOverride, String localModelFilePathOverride, boolean showRunAgainButton, boolean showBenchmarkButton, boolean isZip, String unzipDir, List<PromptTemplate> llmPromptTemplates, boolean llmSupportImage, boolean llmSupportAudio, boolean llmSupportTinyGarden, boolean llmSupportMobileActions, List<? extends ModelCapability> capabilities, int llmMaxToken, List<? extends Accelerator> accelerators, Accelerator visionAccelerator, boolean imported, Map<ModelCapability, ? extends List<String>> capabilityToTaskTypes, String normalizedName, Object instance, boolean initializing, boolean cleanUpAfterInit, Map<String, ? extends Object> configValues, Map<String, ? extends Object> prevConfigValues, long totalBytes, String accessToken, boolean updatable, ModelFile latestModelFile) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        Intrinsics.checkNotNullParameter(bestForTaskIds, "bestForTaskIds");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(downloadFileName, "downloadFileName");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(extraDataFiles, "extraDataFiles");
        Intrinsics.checkNotNullParameter(updatableModelFiles, "updatableModelFiles");
        Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        Intrinsics.checkNotNullParameter(runtimeType, "runtimeType");
        Intrinsics.checkNotNullParameter(localFileRelativeDirPathOverride, "localFileRelativeDirPathOverride");
        Intrinsics.checkNotNullParameter(localModelFilePathOverride, "localModelFilePathOverride");
        Intrinsics.checkNotNullParameter(unzipDir, "unzipDir");
        Intrinsics.checkNotNullParameter(llmPromptTemplates, "llmPromptTemplates");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(accelerators, "accelerators");
        Intrinsics.checkNotNullParameter(visionAccelerator, "visionAccelerator");
        Intrinsics.checkNotNullParameter(capabilityToTaskTypes, "capabilityToTaskTypes");
        Intrinsics.checkNotNullParameter(normalizedName, "normalizedName");
        Intrinsics.checkNotNullParameter(configValues, "configValues");
        Intrinsics.checkNotNullParameter(prevConfigValues, "prevConfigValues");
        this.name = name;
        this.displayName = displayName;
        this.info = info;
        this.configs = configs;
        this.learnMoreUrl = learnMoreUrl;
        this.bestForTaskIds = bestForTaskIds;
        this.minDeviceMemoryInGb = minDeviceMemoryInGb;
        this.url = url;
        this.sizeInBytes = sizeInBytes;
        this.downloadFileName = downloadFileName;
        this.version = version;
        this.extraDataFiles = extraDataFiles;
        this.isLlm = isLlm;
        this.aicoreReleaseStage = aicoreReleaseStage;
        this.aicorePreference = aicorePreference;
        this.parentModelName = parentModelName;
        this.variantLabel = variantLabel;
        this.updatableModelFiles = updatableModelFiles;
        this.updateInfo = updateInfo;
        this.runtimeType = runtimeType;
        this.localFileRelativeDirPathOverride = localFileRelativeDirPathOverride;
        this.localModelFilePathOverride = localModelFilePathOverride;
        this.showRunAgainButton = showRunAgainButton;
        this.showBenchmarkButton = showBenchmarkButton;
        this.isZip = isZip;
        this.unzipDir = unzipDir;
        this.llmPromptTemplates = llmPromptTemplates;
        this.llmSupportImage = llmSupportImage;
        this.llmSupportAudio = llmSupportAudio;
        this.llmSupportTinyGarden = llmSupportTinyGarden;
        this.llmSupportMobileActions = llmSupportMobileActions;
        this.capabilities = capabilities;
        this.llmMaxToken = llmMaxToken;
        this.accelerators = accelerators;
        this.visionAccelerator = visionAccelerator;
        this.imported = imported;
        this.capabilityToTaskTypes = capabilityToTaskTypes;
        this.normalizedName = normalizedName;
        this.instance = instance;
        this.initializing = initializing;
        this.cleanUpAfterInit = cleanUpAfterInit;
        this.configValues = configValues;
        this.prevConfigValues = prevConfigValues;
        this.totalBytes = totalBytes;
        this.accessToken = accessToken;
        this.updatable = updatable;
        this.latestModelFile = latestModelFile;
        this.normalizedName = ModelKt.NORMALIZE_NAME_REGEX.replace(this.name, "_");
    }

    public /* synthetic */ Model(String str, String str2, String str3, List list, String str4, List list2, Integer num, String str5, long j, String str6, String str7, List list3, boolean z, AICoreModelReleaseStage aICoreModelReleaseStage, AICoreModelPreference aICoreModelPreference, String str8, String str9, List list4, String str10, RuntimeType runtimeType, String str11, String str12, boolean z2, boolean z3, boolean z4, String str13, List list5, boolean z5, boolean z6, boolean z7, boolean z8, List list6, int i, List list7, Accelerator accelerator, boolean z9, Map map, String str14, Object obj, boolean z10, boolean z11, Map map2, Map map3, long j2, String str15, boolean z12, ModelFile modelFile, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? 0L : j, (i2 & 512) != 0 ? "_" : str6, (i2 & 1024) == 0 ? str7 : "_", (i2 & 2048) != 0 ? CollectionsKt.emptyList() : list3, (i2 & 4096) != 0 ? false : z, (i2 & 8192) != 0 ? null : aICoreModelReleaseStage, (i2 & 16384) != 0 ? null : aICoreModelPreference, (i2 & 32768) != 0 ? null : str8, (i2 & 65536) != 0 ? null : str9, (i2 & 131072) != 0 ? CollectionsKt.emptyList() : list4, (i2 & 262144) != 0 ? "" : str10, (i2 & 524288) != 0 ? RuntimeType.UNKNOWN : runtimeType, (i2 & 1048576) != 0 ? "" : str11, (i2 & 2097152) != 0 ? "" : str12, (i2 & 4194304) != 0 ? true : z2, (i2 & 8388608) == 0 ? z3 : true, (i2 & 16777216) != 0 ? false : z4, (i2 & 33554432) != 0 ? "" : str13, (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? CollectionsKt.emptyList() : list5, (i2 & 134217728) != 0 ? false : z5, (i2 & 268435456) != 0 ? false : z6, (i2 & 536870912) != 0 ? false : z7, (i2 & Ints.MAX_POWER_OF_TWO) != 0 ? false : z8, (i2 & Integer.MIN_VALUE) != 0 ? CollectionsKt.emptyList() : list6, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? CollectionsKt.emptyList() : list7, (i3 & 4) != 0 ? Accelerator.GPU : accelerator, (i3 & 8) != 0 ? false : z9, (i3 & 16) != 0 ? MapsKt.emptyMap() : map, (i3 & 32) != 0 ? "" : str14, (i3 & 64) != 0 ? null : obj, (i3 & 128) != 0 ? false : z10, (i3 & 256) != 0 ? false : z11, (i3 & 512) != 0 ? MapsKt.emptyMap() : map2, (i3 & 1024) != 0 ? MapsKt.emptyMap() : map3, (i3 & 2048) != 0 ? 0L : j2, (i3 & 4096) != 0 ? null : str15, (i3 & 8192) != 0 ? false : z12, (i3 & 16384) != 0 ? null : modelFile);
    }

    public final String getName() {
        return this.name;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getInfo() {
        return this.info;
    }

    public final List<Config> getConfigs() {
        return this.configs;
    }

    public final void setConfigs(List<? extends Config> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.configs = list;
    }

    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public final List<String> getBestForTaskIds() {
        return this.bestForTaskIds;
    }

    public final Integer getMinDeviceMemoryInGb() {
        return this.minDeviceMemoryInGb;
    }

    public final String getUrl() {
        return this.url;
    }

    public final long getSizeInBytes() {
        return this.sizeInBytes;
    }

    public final String getDownloadFileName() {
        return this.downloadFileName;
    }

    public final void setDownloadFileName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.downloadFileName = str;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }

    public final List<ModelDataFile> getExtraDataFiles() {
        return this.extraDataFiles;
    }

    public final boolean isLlm() {
        return this.isLlm;
    }

    public final AICoreModelReleaseStage getAicoreReleaseStage() {
        return this.aicoreReleaseStage;
    }

    public final AICoreModelPreference getAicorePreference() {
        return this.aicorePreference;
    }

    public final String getParentModelName() {
        return this.parentModelName;
    }

    public final String getVariantLabel() {
        return this.variantLabel;
    }

    public final List<ModelFile> getUpdatableModelFiles() {
        return this.updatableModelFiles;
    }

    public final String getUpdateInfo() {
        return this.updateInfo;
    }

    public final RuntimeType getRuntimeType() {
        return this.runtimeType;
    }

    public final String getLocalFileRelativeDirPathOverride() {
        return this.localFileRelativeDirPathOverride;
    }

    public final String getLocalModelFilePathOverride() {
        return this.localModelFilePathOverride;
    }

    public final boolean getShowRunAgainButton() {
        return this.showRunAgainButton;
    }

    public final boolean getShowBenchmarkButton() {
        return this.showBenchmarkButton;
    }

    public final boolean isZip() {
        return this.isZip;
    }

    public final String getUnzipDir() {
        return this.unzipDir;
    }

    public final List<PromptTemplate> getLlmPromptTemplates() {
        return this.llmPromptTemplates;
    }

    public final boolean getLlmSupportImage() {
        return this.llmSupportImage;
    }

    public final boolean getLlmSupportAudio() {
        return this.llmSupportAudio;
    }

    public final boolean getLlmSupportTinyGarden() {
        return this.llmSupportTinyGarden;
    }

    public final boolean getLlmSupportMobileActions() {
        return this.llmSupportMobileActions;
    }

    public final List<ModelCapability> getCapabilities() {
        return this.capabilities;
    }

    public final int getLlmMaxToken() {
        return this.llmMaxToken;
    }

    public final List<Accelerator> getAccelerators() {
        return this.accelerators;
    }

    public final Accelerator getVisionAccelerator() {
        return this.visionAccelerator;
    }

    public final boolean getImported() {
        return this.imported;
    }

    public final Map<ModelCapability, List<String>> getCapabilityToTaskTypes() {
        return this.capabilityToTaskTypes;
    }

    public final String getNormalizedName() {
        return this.normalizedName;
    }

    public final void setNormalizedName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.normalizedName = str;
    }

    public final Object getInstance() {
        return this.instance;
    }

    public final void setInstance(Object obj) {
        this.instance = obj;
    }

    public final boolean getInitializing() {
        return this.initializing;
    }

    public final void setInitializing(boolean z) {
        this.initializing = z;
    }

    public final boolean getCleanUpAfterInit() {
        return this.cleanUpAfterInit;
    }

    public final void setCleanUpAfterInit(boolean z) {
        this.cleanUpAfterInit = z;
    }

    public final Map<String, Object> getConfigValues() {
        return this.configValues;
    }

    public final void setConfigValues(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.configValues = map;
    }

    public final Map<String, Object> getPrevConfigValues() {
        return this.prevConfigValues;
    }

    public final void setPrevConfigValues(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.prevConfigValues = map;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public final void setTotalBytes(long j) {
        this.totalBytes = j;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final boolean getUpdatable() {
        return this.updatable;
    }

    public final void setUpdatable(boolean z) {
        this.updatable = z;
    }

    public final ModelFile getLatestModelFile() {
        return this.latestModelFile;
    }

    public final void setLatestModelFile(ModelFile modelFile) {
        this.latestModelFile = modelFile;
    }

    public final void preProcess() {
        Map configValues = new LinkedHashMap();
        for (Config config : this.configs) {
            configValues.put(config.getKey().getLabel(), config.getDefaultValue());
        }
        this.configValues = configValues;
        long j = this.sizeInBytes;
        long sizeInBytes = 0;
        for (ModelDataFile it : this.extraDataFiles) {
            sizeInBytes += it.getSizeInBytes();
        }
        this.totalBytes = j + sizeInBytes;
    }

    public static /* synthetic */ String getPath$default(Model model, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = model.downloadFileName;
        }
        return model.getPath(context, str);
    }

    public final String getPath(Context context, String fileName) {
        String absolutePath;
        String absolutePath2;
        String absolutePath3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        String str = "";
        if (this.imported) {
            String[] strArr = new String[2];
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null && (absolutePath3 = externalFilesDir.getAbsolutePath()) != null) {
                str = absolutePath3;
            }
            strArr[0] = str;
            strArr[1] = fileName;
            List listListOf = CollectionsKt.listOf((Object[]) strArr);
            String separator = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator, "separator");
            return CollectionsKt.joinToString$default(listListOf, separator, null, null, 0, null, null, 62, null);
        }
        if (this.localModelFilePathOverride.length() > 0) {
            return this.localModelFilePathOverride;
        }
        if (this.localFileRelativeDirPathOverride.length() > 0) {
            String[] strArr2 = new String[3];
            File externalFilesDir2 = context.getExternalFilesDir(null);
            if (externalFilesDir2 != null && (absolutePath2 = externalFilesDir2.getAbsolutePath()) != null) {
                str = absolutePath2;
            }
            strArr2[0] = str;
            strArr2[1] = this.localFileRelativeDirPathOverride;
            strArr2[2] = fileName;
            List listListOf2 = CollectionsKt.listOf((Object[]) strArr2);
            String separator2 = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator2, "separator");
            return CollectionsKt.joinToString$default(listListOf2, separator2, null, null, 0, null, null, 62, null);
        }
        String[] strArr3 = new String[3];
        File externalFilesDir3 = context.getExternalFilesDir(null);
        if (externalFilesDir3 != null && (absolutePath = externalFilesDir3.getAbsolutePath()) != null) {
            str = absolutePath;
        }
        strArr3[0] = str;
        strArr3[1] = this.normalizedName;
        strArr3[2] = this.version;
        List listListOf3 = CollectionsKt.listOf((Object[]) strArr3);
        String separator3 = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator3, "separator");
        String baseDir = CollectionsKt.joinToString$default(listListOf3, separator3, null, null, 0, null, null, 62, null);
        if (this.isZip) {
            if (this.unzipDir.length() > 0) {
                List listListOf4 = CollectionsKt.listOf((Object[]) new String[]{baseDir, this.unzipDir});
                String separator4 = File.separator;
                Intrinsics.checkNotNullExpressionValue(separator4, "separator");
                return CollectionsKt.joinToString$default(listListOf4, separator4, null, null, 0, null, null, 62, null);
            }
        }
        List listListOf5 = CollectionsKt.listOf((Object[]) new String[]{baseDir, fileName});
        String separator5 = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator5, "separator");
        return CollectionsKt.joinToString$default(listListOf5, separator5, null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ int getIntConfigValue$default(Model model, ConfigKey configKey, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return model.getIntConfigValue(configKey, i);
    }

    public final int getIntConfigValue(ConfigKey key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object typedConfigValue = getTypedConfigValue(key, ValueType.INT, Integer.valueOf(defaultValue));
        Intrinsics.checkNotNull(typedConfigValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) typedConfigValue).intValue();
    }

    public static /* synthetic */ float getFloatConfigValue$default(Model model, ConfigKey configKey, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return model.getFloatConfigValue(configKey, f);
    }

    public final float getFloatConfigValue(ConfigKey key, float defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object typedConfigValue = getTypedConfigValue(key, ValueType.FLOAT, Float.valueOf(defaultValue));
        Intrinsics.checkNotNull(typedConfigValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) typedConfigValue).floatValue();
    }

    public static /* synthetic */ boolean getBooleanConfigValue$default(Model model, ConfigKey configKey, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return model.getBooleanConfigValue(configKey, z);
    }

    public final boolean getBooleanConfigValue(ConfigKey key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object typedConfigValue = getTypedConfigValue(key, ValueType.BOOLEAN, Boolean.valueOf(defaultValue));
        Intrinsics.checkNotNull(typedConfigValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) typedConfigValue).booleanValue();
    }

    public static /* synthetic */ String getStringConfigValue$default(Model model, ConfigKey configKey, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return model.getStringConfigValue(configKey, str);
    }

    public final String getStringConfigValue(ConfigKey key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object typedConfigValue = getTypedConfigValue(key, ValueType.STRING, defaultValue);
        Intrinsics.checkNotNull(typedConfigValue, "null cannot be cast to non-null type kotlin.String");
        return (String) typedConfigValue;
    }

    public final ModelDataFile getExtraDataFile(String name) {
        Object next;
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<T> it = this.extraDataFiles.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ModelDataFile it2 = (ModelDataFile) next;
            if (Intrinsics.areEqual(it2.getName(), name)) {
                break;
            }
        }
        return (ModelDataFile) next;
    }

    private final Object getTypedConfigValue(ConfigKey key, ValueType valueType, Object defaultValue) {
        return ConfigKt.convertValueToTargetType(this.configValues.getOrDefault(key.getLabel(), defaultValue), valueType);
    }
}
