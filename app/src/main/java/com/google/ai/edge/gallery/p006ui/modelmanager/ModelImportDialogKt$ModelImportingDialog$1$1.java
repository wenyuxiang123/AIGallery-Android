package com.google.ai.edge.gallery.p006ui.modelmanager;

import android.content.Context;
import android.net.Uri;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import com.google.ai.edge.gallery.proto.ImportedModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModelImportDialog.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.modelmanager.ModelImportDialogKt$ModelImportingDialog$1$1", m932f = "ModelImportDialog.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class ModelImportDialogKt$ModelImportingDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ ImportedModel $info;
    final /* synthetic */ Function1<ImportedModel, Unit> $onDone;
    final /* synthetic */ MutableFloatState $progress$delegate;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ModelImportDialogKt$ModelImportingDialog$1$1(Context context, CoroutineScope coroutineScope, ImportedModel importedModel, Uri uri, Function1<? super ImportedModel, Unit> function1, MutableFloatState mutableFloatState, MutableState<String> mutableState, Continuation<? super ModelImportDialogKt$ModelImportingDialog$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$coroutineScope = coroutineScope;
        this.$info = importedModel;
        this.$uri = uri;
        this.$onDone = function1;
        this.$progress$delegate = mutableFloatState;
        this.$error$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModelImportDialogKt$ModelImportingDialog$1$1(this.$context, this.$coroutineScope, this.$info, this.$uri, this.$onDone, this.$progress$delegate, this.$error$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModelImportDialogKt$ModelImportingDialog$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Context context = this.$context;
                CoroutineScope coroutineScope = this.$coroutineScope;
                String fileName = this.$info.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                long fileSize = this.$info.getFileSize();
                Uri uri = this.$uri;
                final Function1<ImportedModel, Unit> function1 = this.$onDone;
                final ImportedModel importedModel = this.$info;
                Function0 function0 = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelImportDialogKt$ModelImportingDialog$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ModelImportDialogKt$ModelImportingDialog$1$1.invokeSuspend$lambda$0(function1, importedModel);
                    }
                };
                final MutableFloatState mutableFloatState = this.$progress$delegate;
                Function1 function12 = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelImportDialogKt$ModelImportingDialog$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModelImportDialogKt$ModelImportingDialog$1$1.invokeSuspend$lambda$1(mutableFloatState, ((Float) obj).floatValue());
                    }
                };
                final MutableState<String> mutableState = this.$error$delegate;
                ModelImportDialogKt.importModel(context, coroutineScope, fileName, fileSize, uri, function0, function12, new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelImportDialogKt$ModelImportingDialog$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModelImportDialogKt$ModelImportingDialog$1$1.invokeSuspend$lambda$2(mutableState, (String) obj);
                    }
                });
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Function1 $onDone, ImportedModel $info) {
        $onDone.invoke($info);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(MutableFloatState $progress$delegate, float it) {
        $progress$delegate.setFloatValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(MutableState $error$delegate, String it) {
        $error$delegate.setValue(it);
        return Unit.INSTANCE;
    }
}
