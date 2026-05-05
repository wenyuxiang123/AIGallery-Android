package com.google.ai.edge.gallery.p006ui.common;

import android.util.Log;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.p006ui.modelmanager.TokenStatus;
import com.google.ai.edge.gallery.p006ui.modelmanager.TokenStatusAndData;
import com.google.ai.edge.gallery.proto.AccessTokenData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1 */
/* JADX INFO: compiled from: DownloadAndTryButton.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1", m932f = "DownloadAndTryButton.kt", m933i = {0, 1, 1, 2, 2, 2, 3, 3, 3}, m934l = {274, 292, StatusLine.HTTP_PERM_REDIRECT, 319, 330, 335}, m935m = "invokeSuspend", m936n = {"firstResponseCode", "tokenStatusAndData", "firstResponseCode", "tokenStatusAndData", "firstResponseCode", "responseCode", "tokenStatusAndData", "firstResponseCode", "responseCode"}, m938s = {"I$0", "L$0", "I$0", "L$0", "I$0", "I$1", "L$0", "I$0", "I$1"})
final class C2669x548ac2d0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $checkingToken$delegate;
    final /* synthetic */ MutableState<Boolean> $downloadStarted$delegate;
    final /* synthetic */ Model $model;
    final /* synthetic */ ModelManagerViewModel $modelManagerViewModel;
    final /* synthetic */ boolean $needToDownloadFirst;
    final /* synthetic */ Function0<Unit> $onClicked;
    final /* synthetic */ MutableState<Boolean> $showErrorDialog$delegate;
    final /* synthetic */ Function1<String, Unit> $startDownload;
    final /* synthetic */ Function0<Unit> $startTokenExchange;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1$WhenMappings */
    /* JADX INFO: compiled from: DownloadAndTryButton.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TokenStatus.values().length];
            try {
                iArr[TokenStatus.NOT_STORED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[TokenStatus.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[TokenStatus.NOT_EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C2669x548ac2d0(boolean z, Model model, ModelManagerViewModel modelManagerViewModel, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Function1<? super String, Unit> function1, MutableState<Boolean> mutableState3, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super C2669x548ac2d0> continuation) {
        super(2, continuation);
        this.$needToDownloadFirst = z;
        this.$model = model;
        this.$modelManagerViewModel = modelManagerViewModel;
        this.$downloadStarted$delegate = mutableState;
        this.$checkingToken$delegate = mutableState2;
        this.$startDownload = function1;
        this.$showErrorDialog$delegate = mutableState3;
        this.$startTokenExchange = function0;
        this.$onClicked = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C2669x548ac2d0(this.$needToDownloadFirst, this.$model, this.$modelManagerViewModel, this.$downloadStarted$delegate, this.$checkingToken$delegate, this.$startDownload, this.$showErrorDialog$delegate, this.$startTokenExchange, this.$onClicked, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C2669x548ac2d0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$needToDownloadFirst) {
                    DownloadAndTryButtonKt.DownloadAndTryButton_cTzpE40$lambda$17(this.$downloadStarted$delegate, true);
                    if (StringsKt.startsWith$default(this.$model.getUrl(), "https://huggingface.co", false, 2, (Object) null)) {
                        DownloadAndTryButtonKt.DownloadAndTryButton_cTzpE40$lambda$2(this.$checkingToken$delegate, true);
                        Log.d("AGDownloadAndTryButton", "Model '" + this.$model.getName() + "' is from HuggingFace. Checking if the url needs auth to download");
                        int firstResponseCode = ModelManagerViewModel.getModelUrlResponse$default(this.$modelManagerViewModel, this.$model, null, 2, null);
                        if (firstResponseCode == 200) {
                            Log.d("AGDownloadAndTryButton", "Model '" + this.$model.getName() + "' doesn't need auth. Start downloading the model...");
                            this.I$0 = firstResponseCode;
                            this.label = 1;
                            return BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$startDownload, null), this) == coroutine_suspended ? coroutine_suspended : Unit.INSTANCE;
                        }
                        if (firstResponseCode < 0) {
                            DownloadAndTryButtonKt.DownloadAndTryButton_cTzpE40$lambda$2(this.$checkingToken$delegate, false);
                            DownloadAndTryButtonKt.DownloadAndTryButton_cTzpE40$lambda$17(this.$downloadStarted$delegate, false);
                            Log.e("AGDownloadAndTryButton", "Unknown network error");
                            DownloadAndTryButtonKt.DownloadAndTryButton_cTzpE40$lambda$8(this.$showErrorDialog$delegate, true);
                            return Unit.INSTANCE;
                        }
                        Log.d("AGDownloadAndTryButton", "Model '" + this.$model.getName() + "' needs auth. Start token exchange process...");
                        TokenStatusAndData tokenStatusAndData = this.$modelManagerViewModel.getTokenStatusAndData();
                        switch (WhenMappings.$EnumSwitchMapping$0[tokenStatusAndData.getStatus().ordinal()]) {
                            case 1:
                            case 2:
                                this.L$0 = SpillingKt.nullOutSpilledVariable(tokenStatusAndData);
                                this.I$0 = firstResponseCode;
                                this.label = 2;
                                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$startTokenExchange, null), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                break;
                            case 3:
                                Log.d("AGDownloadAndTryButton", "Checking the download url '" + this.$model.getUrl() + "' with the current token...");
                                ModelManagerViewModel modelManagerViewModel = this.$modelManagerViewModel;
                                Model model = this.$model;
                                AccessTokenData data = tokenStatusAndData.getData();
                                Intrinsics.checkNotNull(data);
                                int responseCode = modelManagerViewModel.getModelUrlResponse(model, data.getAccessToken());
                                if (responseCode != 200) {
                                    Log.d("AGDownloadAndTryButton", "Download url is NOT accessible. Response code: " + responseCode + ". Trying to request a new token.");
                                    this.L$0 = SpillingKt.nullOutSpilledVariable(tokenStatusAndData);
                                    this.I$0 = firstResponseCode;
                                    this.I$1 = responseCode;
                                    this.label = 4;
                                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass4(this.$startTokenExchange, null), this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    Log.d("AGDownloadAndTryButton", "Download url is accessible with the current token.");
                                    this.L$0 = SpillingKt.nullOutSpilledVariable(tokenStatusAndData);
                                    this.I$0 = firstResponseCode;
                                    this.I$1 = responseCode;
                                    this.label = 3;
                                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(this.$startDownload, tokenStatusAndData, null), this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        Log.d("AGDownloadAndTryButton", "Model '" + this.$model.getName() + "' is not from huggingface. Start downloading the model...");
                        this.label = 5;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass5(this.$startDownload, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    this.label = 6;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass6(this.$onClicked, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                int firstResponseCode2 = this.I$0;
                ResultKt.throwOnFailure($result);
            case 2:
                int responseCode2 = this.I$0;
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            case 3:
                int responseCode3 = this.I$1;
                int i = this.I$0;
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            case 4:
                int i2 = this.I$1;
                int i3 = this.I$0;
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: DownloadAndTryButton.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1$1", m932f = "DownloadAndTryButton.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $startDownload;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super String, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$startDownload = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$startDownload, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.$startDownload.invoke(null);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: DownloadAndTryButton.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1$2", m932f = "DownloadAndTryButton.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $startTokenExchange;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$startTokenExchange = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$startTokenExchange, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.$startTokenExchange.invoke();
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: DownloadAndTryButton.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1$3", m932f = "DownloadAndTryButton.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $startDownload;
        final /* synthetic */ TokenStatusAndData $tokenStatusAndData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function1<? super String, Unit> function1, TokenStatusAndData tokenStatusAndData, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$startDownload = function1;
            this.$tokenStatusAndData = tokenStatusAndData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$startDownload, this.$tokenStatusAndData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Function1<String, Unit> function1 = this.$startDownload;
                    AccessTokenData data = this.$tokenStatusAndData.getData();
                    Intrinsics.checkNotNull(data);
                    function1.invoke(data.getAccessToken());
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1$4, reason: invalid class name */
    /* JADX INFO: compiled from: DownloadAndTryButton.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1$4", m932f = "DownloadAndTryButton.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $startTokenExchange;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Function0<Unit> function0, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$startTokenExchange = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$startTokenExchange, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.$startTokenExchange.invoke();
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1$5, reason: invalid class name */
    /* JADX INFO: compiled from: DownloadAndTryButton.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1$5", m932f = "DownloadAndTryButton.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $startDownload;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(Function1<? super String, Unit> function1, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$startDownload = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.$startDownload, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.$startDownload.invoke(null);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1$6, reason: invalid class name */
    /* JADX INFO: compiled from: DownloadAndTryButton.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt$DownloadAndTryButton$handleClickButton$1$1$1$6", m932f = "DownloadAndTryButton.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onClicked;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(Function0<Unit> function0, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$onClicked = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.$onClicked, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.$onClicked.invoke();
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
