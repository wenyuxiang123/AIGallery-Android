package com.google.ai.edge.gallery.customtasks.agentchat;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.EmailKt;
import androidx.compose.material.icons.outlined.KitchenKt;
import androidx.compose.material.icons.outlined.LocalLibraryKt;
import androidx.compose.material.icons.outlined.MapKt;
import androidx.compose.material.icons.outlined.QrCodeKt;
import androidx.compose.material.icons.outlined.ScreenRotationKt;
import androidx.compose.material.icons.outlined.SentimentVerySatisfiedKt;
import androidx.compose.material.icons.outlined.TagKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.common.SkillTryOutChip;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p009io.CloseableKt;
import kotlin.p009io.encoding.Base64;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: SkillManagerViewModel.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}
