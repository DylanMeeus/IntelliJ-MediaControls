package mediakeys.toolbar;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import mediakeys.service.MediaService;

public class NextAction extends AnAction {

    public NextAction(){
        super("Next");
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        MediaService.execCommand(MediaService.COMMAND.NEXT);
    }
}
