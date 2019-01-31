package gc;
//-XX:+UseParNewGC -Xms20m -Xmx20m -Xmn10m -XX:+PrintHeapAtGC -XX:+PrintGCDetails
//-XX:MaxTenuringThreshold=1
public class FullGc {
    static int mb = 1024*1024;

    public static void main(String[] args) {
        byte[] b1 = new byte[1*mb/4];
        System.gc();
    }
}
