package mediakeys.toolbar;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import mediakeys.service.MediaService;

public class LowerAction extends AnAction {

    public LowerAction(){
        super("Lower");
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        MediaService.execCommand(MediaService.COMMAND.LOWER);
    }
}
