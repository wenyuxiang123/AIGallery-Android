package com.google.ai.edge.gallery.di;

import android.content.Context;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.AppLifecycleProvider;
import com.google.ai.edge.gallery.BenchmarkResultsSerializer;
import com.google.ai.edge.gallery.CutoutsSerializer;
import com.google.ai.edge.gallery.GalleryLifecycleProvider;
import com.google.ai.edge.gallery.SettingsSerializer;
import com.google.ai.edge.gallery.SkillsSerializer;
import com.google.ai.edge.gallery.UserDataSerializer;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import com.google.ai.edge.gallery.data.DefaultDataStoreRepository;
import com.google.ai.edge.gallery.data.DefaultDownloadRepository;
import com.google.ai.edge.gallery.data.DownloadRepository;
import com.google.ai.edge.gallery.proto.BenchmarkResults;
import com.google.ai.edge.gallery.proto.CutoutCollection;
import com.google.ai.edge.gallery.proto.Settings;
import com.google.ai.edge.gallery.proto.Skills;
import com.google.ai.edge.gallery.proto.UserData;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.File;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppModule.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m921d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0007J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H\u0007J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0007J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0007J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H\u0007J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0007JN\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0007J\u001a\u0010%\u001a\u00020&2\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u001dH\u0007¨\u0006("}
