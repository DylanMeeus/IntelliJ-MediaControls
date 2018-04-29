package mediakeys.toolbar;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import mediakeys.service.MediaService;

public class PrevAction extends AnAction {

    public PrevAction(){
        super("Prev");
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        MediaService.execCommand(MediaService.COMMAND.PREV);
    }
}
