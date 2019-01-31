public class Book1 {
    public static void main(String[] args)
    {
//        new Book1();
        System.out.println("Hello ShuYi.");
        new Book1();
    }

    Book1() {
        System.out.println("书的构造方法");
        System.out.println("price=" + price + ",amount=" + amount);
    }

    {
        System.out.println("书的普通代码块");
    }

    int price = 110;

    static
    {
        System.out.println("书的静态代码块");
    }

    static int amount = 112;
}
