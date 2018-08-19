package cn.jk.study.exceptions;

/**
 * Created by jiakang on 2018/7/25.
 */
class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("need to clean "+id);
    }
}
class ConstructionException extends  Exception {}
class NeedsCleanUp2 extends NeedsCleanup {
    public NeedsCleanUp2() throws ConstructionException {}
}
public class CleanupIdiom {
    public static void main(String... args) {
        NeedsCleanup nc1 = new NeedsCleanup();
        try {

        } finally {
            nc1.dispose();
        }
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {

        } finally {
            nc2.dispose();
            nc3.dispose();
        }

        try {
            NeedsCleanUp2 n4 = new NeedsCleanUp2();
            try {

            } finally {
                n4.dispose();
            }
        } catch (ConstructionException e) {
            e.printStackTrace();
        }
    }
}
