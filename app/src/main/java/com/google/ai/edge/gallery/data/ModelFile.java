package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/ModelFile;", "", "fileName", "", "commitHash", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getCommitHash", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class ModelFile {
    public static final int $stable = 0;

    @SerializedName("commitHash")
    private final String commitHash;

    @SerializedName("fileName")
    private final String fileName;

    public static /* synthetic */ ModelFile copy$default(ModelFile modelFile, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelFile.fileName;
        }
        if ((i & 2) != 0) {
            str2 = modelFile.commitHash;
        }
        return modelFile.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCommitHash() {
        return this.commitHash;
    }

    public final ModelFile copy(String fileName, String commitHash) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(commitHash, "commitHash");
        return new ModelFile(fileName, commitHash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelFile)) {
            return false;
        }
        ModelFile modelFile = (ModelFile) other;
        return Intrinsics.areEqual(this.fileName, modelFile.fileName) && Intrinsics.areEqual(this.commitHash, modelFile.commitHash);
    }

    public int hashCode() {
        return (this.fileName.hashCode() * 31) + this.commitHash.hashCode();
    }

    public String toString() {
        return "ModelFile(fileName=" + this.fileName + ", commitHash=" + this.commitHash + ")";
    }

    public ModelFile(String fileName, String commitHash) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(commitHash, "commitHash");
        this.fileName = fileName;
        this.commitHash = commitHash;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getCommitHash() {
        return this.commitHash;
    }
}
