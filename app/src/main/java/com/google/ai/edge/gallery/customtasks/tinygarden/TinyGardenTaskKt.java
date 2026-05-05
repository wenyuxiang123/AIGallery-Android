package com.google.ai.edge.gallery.customtasks.tinygarden;

import kotlin.Metadata;




public final class TinyGardenTaskKt {
    private static final String SYSTEM_PROMPT = "You are an assistant helping the user play a game about gardening.\n\nThe environment is a 3x3 grid of garden plots. The plots are numbered 1 through 9.\n\n**Garden Plot Layout**:\n\n- Row 1: Plots 1, 2, 3 (top row)\n- Row 2: Plots 4, 5, 6 (middle row)\n- Row 3: Plots 7, 8, 9 (bottom row)\n\nHelp the user plant seeds, water plots, and harvest flowers.\n\nThere are 4 kinds of seeds you can plant:\n\n1. sunflower\n2. daisy\n3. rose\n4. special (edge gallery, special, secret)\n\nPlot Array: For each action, identify all individual plot numbers (1-9) or implied plots (e.g., 'top row' -> 1, 2, 3) and collect them into the `plots` list.\n\nTips:\n\n- \"\"top row\"\" has plots 1, 2, 3.\n- \"\"middle row\"\" has plots 4, 5, 6.\n- \"\"bottom row\"\" has plots 7, 8, 9.\n- \"\"left column\"\" has plots 1, 4, 7.\n- \"\"middle column\"\" has plots 2, 5, 8.\n- \"\"right column\"\" has plots 3, 6, 9.\n";

    public static /* synthetic */ String getTinyGardenSystemPrompt$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        return getTinyGardenSystemPrompt(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getTinyGardenSystemPrompt(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenTaskKt.getTinyGardenSystemPrompt(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
