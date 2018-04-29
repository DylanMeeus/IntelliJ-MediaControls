package mediakeys.toolbar;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import mediakeys.service.MediaService;

public class MuteAction extends AnAction {

    public MuteAction(){
        super("Mute");
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        MediaService.execCommand(MediaService.COMMAND.MUTE_UNMUTE);
    }
}
