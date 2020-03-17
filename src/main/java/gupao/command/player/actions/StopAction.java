package gupao.command.player.actions;


import gupao.command.player.GPlayer;
import gupao.command.player.IAction;

/**
 * Created by Tom.
 */
public class StopAction implements IAction {
    private GPlayer gplayer;

    public StopAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.stop();
    }
}
