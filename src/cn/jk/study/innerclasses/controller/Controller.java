package cn.jk.study.innerclasses.controller;

import cn.jk.study.util.Print;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiakang on 2018/6/5.
 */
public class Controller {
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event e) {
        eventList.add(e);
    }

    public void run() {
        while (eventList.size() > 0) {
            for (Event e :
                    new ArrayList<Event>(eventList)) {
                if (e.ready()) {
                    Print.print(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
