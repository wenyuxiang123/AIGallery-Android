package com.google.ai.edge.gallery.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getFileName", "()Ljava/lang/String;", "getCommitHash", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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

    
    public final String getFileName() {
        return this.fileName;
    }

    
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
