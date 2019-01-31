package statics;

public class B extends A //子类B
{
    public static String str = "B该改写后的静态属性";
    public String name ="B改写后的非静态属性";
    public static void sing()
    {
        System.out.println("B改写后的静态方法");
    }

    public void run()
    {
        System.out.println("B改写后的非静态方法");
    }
}

