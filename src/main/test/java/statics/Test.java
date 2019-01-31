package statics;

public class Test {
    public static void main(String[] args)
    {
        C c = new C();
        System.out.println(c.name);
        System.out.println(c.str);
        c.sing();//输出的结果都是父类中的非静态属性、静态属性和静态方法,推出静态属性和静态方法可以被继承
        c.run();

        A c1 = new C();
        System.out.println(c1.name);
        System.out.println(c1.str);
        c1.sing();//结果同上，输出的结果都是父类中的非静态属性、静态属性和静态方法,推出静态属性和静态方法可以被继承
        c1.run();

        B b = new B();
        System.out.println(b.name);
        System.out.println(b.str);
        b.sing();//结果都是子类的非静态属性，静态属性和静态方法，这里和非静态属性和非静态类的继承相同
        b.run();

        A b1 = new B();
        System.out.println(b1.str);//结果是父类的静态属性，说明静态属性不可以被重写，不能实现多态
        System.out.println(b1.name);//结果是父类的非静态属性，说明非静态属性不可以被重写，不能实现多态
        b1.sing();//结果都是父类的静态方法，说明静态方法不可以被重写，不能实现多态
        b1.run();
    }
}
