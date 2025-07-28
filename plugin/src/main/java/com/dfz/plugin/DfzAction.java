package com.dfz.plugin;

import com.intellij.notification.NotificationGroupManager;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;

/**
 *@author dfz
 *@date 2025/7/25 - 16:52
 */
public class DfzAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent event) {
        Project project = event.getRequiredData(CommonDataKeys.PROJECT);
        // Get all the required data from data keys
        Editor editor = event.getRequiredData(CommonDataKeys.EDITOR);
        Document document = editor.getDocument();
        log(project, "当前文档内容:\n" + document.getCharsSequence());
        // Work off of the primary caret to get the selection info
//        Caret primaryCaret = editor.getCaretModel().getPrimaryCaret();
//        int start = primaryCaret.getSelectionStart();
//        int end = primaryCaret.getSelectionEnd();
//
//        // Replace the selection with a fixed string.
//        // Must do this document change in a write action context.
//        WriteCommandAction.runWriteCommandAction(project, () ->
//                document.replaceString(start, end, "editor_basics")
//        );
//
//        // De-select the text range that was just replaced
//        primaryCaret.removeSelection();
    }

    private static void log(Project project, String string) {
        NotificationGroupManager.getInstance().getNotificationGroup("dfz").
                createNotification(string, NotificationType.INFORMATION)
                .notify(project);
    }
}
