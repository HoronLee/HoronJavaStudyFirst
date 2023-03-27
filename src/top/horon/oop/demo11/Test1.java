package top.horon.oop.demo11;
//对象引用传递
class Demo01 {
    int temp = 114;
}
public class Test1 {
    public static void main(String[] args) {
        Demo01 d1 = new Demo01();
        d1.temp = 1145;
        System.out.println(d1.temp);
        fun(d1);
        System.out.println(d1.temp);
    }
    public static void fun(Demo01 d2) {
        d2.temp = 11451;
    }
}