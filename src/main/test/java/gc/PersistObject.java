package gc;
//-XX:+UseParNewGC -Xms20m -Xmx20m -Xmn10m -XX:+PrintHeapAtGC -XX:+PrintGCDetails
//-XX:MaxTenuringThreshold=1
public class PersistObject {
    static int mb = 1024*1024;

    public static void main(String[] args) {
        System.out.println("step 1");
        byte[] b1 = new byte[1*mb/4];
        System.out.println("step 2");
        byte[] b2 = new byte[4*mb];
        System.out.println("step 3");
        byte[] b3 = new byte[4*mb];//GC
        System.out.println("step 4");
        b3 = null;
        System.out.println("step 5");
        b3 = new byte[4*mb];//GC
    }
}
