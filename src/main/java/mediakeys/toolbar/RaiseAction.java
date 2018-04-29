package mediakeys.toolbar;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import mediakeys.service.MediaService;

public class RaiseAction extends AnAction {

    public RaiseAction(){
        super("Raise");
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        MediaService.execCommand(MediaService.COMMAND.RAISE);
    }

}
