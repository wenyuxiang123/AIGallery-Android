package com.google.ai.edge.gallery.ui.common.tos;

import androidx.lifecycle.ViewModel;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getIsTosAccepted", "", "acceptTos", "", "getIsGemmaTermsOfUseAccepted", "acceptGemmaTermsOfUse", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
