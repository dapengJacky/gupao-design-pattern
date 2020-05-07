package gupao.observer.mouseevent;


import gupao.observer.mouseevent.handler.Mouse;
import gupao.observer.mouseevent.handler.MouseEventLisenter;
import gupao.observer.mouseevent.handler.MouseEventType;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        MouseEventLisenter listener = new MouseEventLisenter();

        Mouse mouse = new Mouse();
        mouse.addLisenter(MouseEventType.ON_CLICK,listener);
        mouse.addLisenter(MouseEventType.ON_MOVE,listener);

        mouse.click();
        mouse.move();
    }
}
