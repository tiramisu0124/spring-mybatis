package gc;
//-XX:+UseParNewGC -Xms20m -Xmx20m -Xmn10m -XX:+PrintHeapAtGC -XX:+PrintGCDetails
//-XX:PretenureSizeThreshold=2097152
public class BigObject {
    static int mb = 1024*1024;

    public static void main(String[] args) {
        byte[] b1 = new byte[3*mb];
        System.out.println("b1 over");
    }
}
