package gupao.observer.mouseevent.handler;


import gupao.observer.mouseevent.core.Event;
import gupao.observer.mouseevent.core.EventListener;

/**
 * 观察者
 * Created by Tom.
 */
public class MouseEventLisenter implements EventListener {

    public void onClick(Event e){
        System.out.println("==========触发鼠标单击事件========\n" + e);
    }

    public void onMove(Event e){

        System.out.println("==========触发鼠标移动事件========\n" + e);
    }
}
