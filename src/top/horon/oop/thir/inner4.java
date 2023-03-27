package top.horon.oop.thir;

class Outer2 {
    private String info = "Hello World!!!";
    class Inner {
        public void print() {
            System.out.println(info);
        }
    }
}
public class inner4 {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Outer2.Inner in = out.new Inner();
        in.print();
    }
}
