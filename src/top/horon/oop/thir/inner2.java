package top.horon.oop.thir;

class Outer1 {
    private String info = "Hello World!!!";
    class inner {
        public void print() {
            System.out.println(info);
        }
    }
    public void fun() {
        new inner().print();
    }
}
public class inner2 {
    public static void main(String[] args) {
        new Outer1().fun();
    }
}
