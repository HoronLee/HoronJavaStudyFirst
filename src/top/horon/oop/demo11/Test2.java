package top.horon.oop.demo11;
//字符串内容声明后无法改变，输出都是hello
public class Test2 {
    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(str1);
        fun(str1);
        System.out.println(str1);
    }
    public static void fun(String str2) {
        str2 = "world";
    }
}
