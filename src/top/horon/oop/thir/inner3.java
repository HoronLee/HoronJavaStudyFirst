package top.horon.oop.thir;

class Outer4 {
    private static String info = "Hello Wolrd!!!";
    static class Inner {
        public void print() {
            System.out.println(info);
        }
    }
}
public class inner3 {
    public static void main(String[] args) {
        new Outer4.Inner().print();
    }
}
