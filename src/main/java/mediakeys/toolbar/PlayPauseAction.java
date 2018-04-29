package mediakeys.toolbar;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import mediakeys.service.MediaService;

public class PlayPauseAction extends AnAction {
    public PlayPauseAction() {
        super("Play/Pause");
    }

    @Override
    public void actionPerformed(AnActionEvent event) {
        MediaService.execCommand(MediaService.COMMAND.PLAY_PAUSE);
    }
}

