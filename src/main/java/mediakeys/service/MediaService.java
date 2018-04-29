package mediakeys.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public interface MediaService {


    enum COMMAND{
        PLAY_PAUSE,
        NEXT,
        PREV,
        MUTE_UNMUTE,
        LOWER,
        RAISE
    }

    Map<COMMAND, String> xdoCommands = new HashMap<COMMAND, String>(3){{
        put(COMMAND.PLAY_PAUSE, "xdotool key XF86AudioPlay");
        put(COMMAND.NEXT, "xdotool key XF86AudioNext");
        put(COMMAND.PREV, "xdotool key XF86AudioPrev");
        put(COMMAND.MUTE_UNMUTE, "xdotool key XF86AudioMute");
        put(COMMAND.LOWER, "xdotool key XF86AudioLowerVolume");
        put(COMMAND.RAISE, "xdotool key XF86AudioRaiseVolume");
    }};

    public static void playPause(){
    }

    public static void execCommand(final COMMAND command){
        try {
            Runtime.getRuntime().exec(xdoCommands.getOrDefault(command, ""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
