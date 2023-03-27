package top.horon.oop.thir;

class Outer3 {
    private String info = "Hello World!!!";
    public void fun(int temp) {
        class Inner{
            public void print() {
                System.out.println("类中的属性：" + info);
                System.out.println("方法中的参数：" + temp);
            }
        }
        new Inner().print();
    }
}
public class inner5 {
    public static void main(String[] args) {
        new Outer3().fun(30);
    }
}
