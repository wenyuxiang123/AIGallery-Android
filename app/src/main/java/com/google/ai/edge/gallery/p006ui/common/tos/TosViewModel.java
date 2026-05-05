package com.google.ai.edge.gallery.p006ui.common.tos;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.lifecycle.ViewModel;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TosViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/tos/TosViewModel;", "Landroidx/lifecycle/ViewModel;", "dataStoreRepository", "Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "<init>", "(Lcom/google/ai/edge/gallery/data/DataStoreRepository;)V", "getIsTosAccepted", "", "acceptTos", "", "getIsGemmaTermsOfUseAccepted", "acceptGemmaTermsOfUse", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public class TosViewModel extends ViewModel {
    public static final int $stable = 8;
    private final DataStoreRepository dataStoreRepository;

    @Inject
    public TosViewModel(DataStoreRepository dataStoreRepository) {
        Intrinsics.checkNotNullParameter(dataStoreRepository, "dataStoreRepository");
        this.dataStoreRepository = dataStoreRepository;
    }

    public boolean getIsTosAccepted() {
        return this.dataStoreRepository.isTosAccepted();
    }

    public void acceptTos() {
        this.dataStoreRepository.acceptTos();
    }

    public boolean getIsGemmaTermsOfUseAccepted() {
        return this.dataStoreRepository.isGemmaTermsOfUseAccepted();
    }

    public void acceptGemmaTermsOfUse() {
        this.dataStoreRepository.acceptGemmaTermsOfUse();
    }
}
