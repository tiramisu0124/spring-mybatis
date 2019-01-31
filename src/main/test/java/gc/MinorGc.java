package gc;
//-XX:+UseParNewGC -Xms20m -Xmx20m -Xmn10m -XX:+PrintHeapAtGC -XX:+PrintGCDetails
public class MinorGc {
    static int mb = 1024*1024;

    public static void main(String[] args) {
        byte[] b1 = new byte[2*mb];
        System.out.println("b1 over");
        byte[] b2 = new byte[2*mb];
        System.out.println("b2 over");
        byte[] b3 = new byte[2*mb];
        System.out.println("b3 over");//GC
        byte[] b4 = new byte[4*mb];
        System.out.println("b4 over");
    }
}
