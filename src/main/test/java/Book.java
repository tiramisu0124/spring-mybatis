public class Book {
    int price = 110;
    public static void main(String[] args)    {
        staticFunction();
    }
    static {
        System.out.println("书的静态代码块1");
    }
    static Book book = new Book();
    static {
        System.out.println("书的静态代码块2");
    }
    {
        System.out.println("书的普通代码块");
    }

    Book(){
        System.out.println("书的构造方法");
        System.out.println("price=" + price +",amount=" + amount);
    }

    public static void staticFunction(){
        System.out.println("书的静态方法" + amount);
    }

    static int amount = 112;


}
