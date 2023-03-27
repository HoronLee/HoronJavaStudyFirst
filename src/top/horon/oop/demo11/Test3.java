package top.horon.oop.demo11;

class Demo02 {
    private int temp = 30;
    public void fun(Demo02 d2) {
        d2.temp = 50;
    }
    public int getTemp() {
        return temp;
    }
    public void setTemp(int t) {
        temp = t;
    }
}
public class Test3 {
    public static void main(String[] args) {
        Demo02 d1 = new Demo02();
        d1.setTemp(50);
        d1.fun(d1);
        System.out.println(d1.getTemp());
    }
}