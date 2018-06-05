package cn.pjkbalance.study.thinkinjava.innerclasses.controller;

import javax.swing.text.StyledEditorKit;

/**
 * Created by jiakang on 2018/6/5.
 */
public class GreenhouseControls extends Controller {
    private boolean light = false;

    private class LightOn extends Event {
        public LightOn(long delayTime) {super(delayTime);}
        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }

    private class LightOff extends Event {
        public LightOff(long delayTime) {super(delayTime);}
        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

    private boolean water = false;

    private class WaterOn extends Event {
        public WaterOn(long delayTime) {super(delayTime);}
        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Water is on";
        }
    }

    private class WaterOff extends Event {
        public WaterOff(long delayTime) {super(delayTime);}
        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Water is off";
        }
    }

    private String thermostat = "Day";
    private class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "night setting";
        }
    }

    private class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
             thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Day setting";
        }
    }

    private class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {return "Bing";}
    }

    private class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e :
                    eventList) {
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for (Event e :
                    eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "restart system";
        }
    }

}
