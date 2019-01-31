package statics;

public class C extends A {//子类C继承A中的所有属性和方法
    public static String str = "C静态属性";
    public String name = "C非静态属性";
    public void run()
    {
        System.out.println("C改写后的非静态方法");
    }
}
