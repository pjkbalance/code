package cn.pjkbalance.study.thinkinjava.innerclasses;

/**
 * Created by jiakang on 2018/6/4.
 */
public class ParcelSix {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;
                TrackingSlip(String s) {id = s;}
                String getSlip() {return id;}
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
    }

}
