package top.horon.oop.thir;
//内部类拿到外面
class Outer {
    private String info = "Hello World!!!";
    public String getInfo() {
        return this.info;
    }
    public void fun() {
        new Inner(this).print();
    }
}
class Inner {
    private Outer out = null;
    public Inner(Outer out) {
        this.out = out;
    }
    public void print() {
        System.out.println(out.getInfo());
    }
}
public class inner1 {
    public static void main(String[] args) {
        new Outer().fun();
    }
}
