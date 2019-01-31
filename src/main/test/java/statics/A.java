package statics;

public class A { //父类A
    public static String str = "A静态属性";
    public String name = "A非静态属性";
    public static void sing()
    {
        System.out.println("A静态方法");
    }

    public void run()
    {
        System.out.println("A非静态方法");
    }
}
