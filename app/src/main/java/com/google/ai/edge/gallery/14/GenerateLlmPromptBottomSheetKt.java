// Class: final Lcom.google.ai.edge.gallery.customtasks.agentchat.GenerateLlmPromptBottomSheetKt
// Access: public
class GenerateLlmPromptBottomSheetKt extends Ljava/lang/Object {

    // Fields:
    private static final java.lang.String PROMPT_TEMPLATE;

    // Methods:
    public kotlin.Unit static synthetic $r8$lambda$8V27wbGUFnsI6tIceIuNi5Bttbs(java.lang.String, java.lang.String, java.lang.String, kotlinx.coroutines.CoroutineScope, androidx.compose.ui.platform.Clipboard, kotlin.jvm.functions.Function1, androidx.compose.material3.SheetState, kotlin.jvm.functions.Function0) {
        // move-result-object p0
        return p0;
    }
    public kotlin.Unit static synthetic $r8$lambda$B6N-QjilCDgYOVEOwN5flFy4z5I(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, int, androidx.compose.runtime.Composer, int) {
        // move-result-object p0
        return p0;
    }
    public kotlin.Unit static synthetic $r8$lambda$nb4XeoNOcJki3_EUZXFpZzOP6rk(java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, kotlinx.coroutines.CoroutineScope, androidx.compose.ui.platform.Clipboard, kotlin.jvm.functions.Function1, androidx.compose.material3.SheetState, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int) {
        // move-result-object p0
        return p0;
    }
    static void constructor <clinit>() {
        String v0 = "# Task: Custom HTML/JS Implementation\nGenerate a single, self-contained HTML file that implements a specific feature or logic as described below.\n\n## 1. Requirement\nThe implementation must fulfill the following:\n> ___requirement___\n\n## 2. Technical Specifications\n* **Structure:** A complete, valid HTML5 document.\n* **Head (Dependencies):** If third-party JS libraries (e.g., Three.js, D3, Lodash, GSAP) are required, include them via CDN using `<script src=\"...\" defer>` tags inside the `<head>`. Do not put implementation logic here.\n* **Body (Implementation):** Place the actual logic implementation inside a single `<script>` tag at the very end of the `<body>`.\n* **Global Interface:** Within the body script, you must expose an `async` function to the global `window` object named: `window[\'ai_edge_gallery_get_result\']`.\n\n## 3. Data Interface & Serialization\n* **Parameter 1 (`data`):** A **JSON-stringified string**.\n    * Once parsed, the input object follows this schema: `___input_data_schema___`\n* **Parameter 2 (`secret`):** A **string** representing a sensitive token or API key (e.g., Bearer token, private key). The implementation should use this if the requirement involves authenticated API calls or encrypted operations.\n* **Output (return value):** The function must return a **JSON-stringified string** with the following exact structure:\n    ```json\n    {\n      \"result\": \"___output_data_schema___\",\n      \"image\": { \"base64\": \"data:image/png;base64,...\" },\n      \"error\": \"Error message string or null\"\n    }\n    ```\n    **CRITICAL RULES:**\n    1. **Dual Output:** The `\"result\"` and `\"image\"` fields can and should coexist in the same response if the requirement involves returning both data/text and a visual asset.\n    2. **Result Serialization:** The value for `\"result\"` must be a JSON-stringified representation of the output data. Set to `null` only if no data is produced.\n    3. **Image Serialization:** The `\"image.base64\"` field must contain a full Data URI. Set the entire `\"image\"` object to `null` only if no image is produced.\n\n## 4. Error Handling\n* Wrap the entire function logic in a `try/catch` block.\n* If an error occurs, the function should return a JSON string where `result` is `null` and `error` contains the error message.\n\n## 5. Response Constraints\n* Return the **raw HTML code only**.\n* Do not provide any introductory text, markdown backticks, or concluding remarks.\n* Start the response immediately with `<!DOCTYPE html>`.\n* Put the output code into a Markdown code block so I can easily copy.";
        return ;
    }
    public void static final GenerateLlmPromptBottomSheet(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;",
        // "Ljava/lang/String;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;",
        // "Ljava/lang/String;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ... (truncated)
    }
    private kotlin.Unit static final GenerateLlmPromptBottomSheet$lambda$7(java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, kotlinx.coroutines.CoroutineScope, androidx.compose.ui.platform.Clipboard, kotlin.jvm.functions.Function1, androidx.compose.material3.SheetState, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int) {
        // move-object/from16 v0, p12
        // move/from16 v1, p13
        String v2 = "$this$ModalBottomSheet";
        // move-object/from16 v3, p11
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v2 = "C117@5475L2226:GenerateLlmPromptBottomSheet.kt#41d64j";
        // STATIC sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
        // and-int/lit8 v2, v1, 0x11
        // const/16 v4, 0x10
        // const/4 v5, 0x1
        // const/4 v6, 0x0
        // if-eq v2, v4, :cond_0
        // move v2, v5
        // goto :goto_0
        // move v2, v6
        // and-int/lit8 v4, v1, 0x1
        // INTERFACE shouldExecute(ZI)Z
        // move-result v2
        // if-eqz v2, :cond_c
        // STATIC isTraceInProgress()Z
        // ... (truncated)
    }
    private kotlin.Unit static final GenerateLlmPromptBottomSheet$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(java.lang.String, java.lang.String, java.lang.String, kotlinx.coroutines.CoroutineScope, androidx.compose.ui.platform.Clipboard, kotlin.jvm.functions.Function1, androidx.compose.material3.SheetState, kotlin.jvm.functions.Function0) {
        // v0 = PROMPT_TEMPLATE:Ljava/lang/String;
        // const/4 v4, 0x4
        // const/4 v5, 0x0
        String v1 = "___requirement___";
        // const/4 v3, 0x0
        // move-object v2, p0
        // move-result-object v6
        // const/4 v10, 0x4
        // const/4 v11, 0x0
        String v7 = "___input_data_schema___";
        // const/4 v9, 0x0
        // move-object v8, p1
        // move-result-object v0
        String v1 = "___output_data_schema___";
        // move-object v2, p2
        // move-result-object v7
        // nop
        GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$2$1$1$2$1$1$1; v0 = new GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$2$1$1$2$1$1$1;();
        // const/4 v12, 0x0
        // move-object v6, v0
        // ... (truncated)
    }
    private kotlin.Unit static final GenerateLlmPromptBottomSheet$lambda$8(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, int, androidx.compose.runtime.Composer, int) {
        // or-int/lit8 v0, p9, 0x1
        // STATIC updateChangedFlags(I)I
        // move-result v11
        // move-object v1, p0
        // move-object v2, p1
        // move-object v3, p2
        // move-object v4, p3
        // move-object/from16 v5, p4
        // move-object/from16 v6, p5
        // move-object/from16 v7, p6
        // move-object/from16 v8, p7
        // move-object/from16 v9, p8
        // move-object/from16 v10, p10
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
}