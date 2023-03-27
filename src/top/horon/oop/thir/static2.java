package top.horon.oop.thir;

class Demo {
    {
        System.out.println("1.构造代码块"); //4
    }
    static {
        System.out.println("0.静态代码块"); //3
    }
    public Demo() {
        System.out.println("2.构造方法");   //5
    }
}
public class static2 {
    static {
        System.out.println("在主方法所在类中定义的代码块"); //2
    }
    public static void main(String[] args) {
        System.out.println("主方法");   //1
        new Demo();
        new Demo();
        new Demo();
    }
}
