package com.dong4j.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * Created by: dong4j.
 * Date: 2017-05-22.
 * Time: 23:30.
 * Description:
 */
public class HelloWorldAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        String userName = askForName(project);
        sayHello(project, userName);
    }

    private String askForName(Project project) {
        return Messages.showInputDialog(project,
                "What is your name?", "Input Your Name",
                Messages.getQuestionIcon());
    }

    private void sayHello(Project project, String userName) {
        Messages.showMessageDialog(project,
                String.format("Hello, %s!\n Welcome to PubEditor.", userName), "Information",
                Messages.getInformationIcon());
    }
}
