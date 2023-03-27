package top.horon.oop.sec;

public class this2 {
    public static void main(String[] args) {
        Person per1 = new Person("张三",30);
        Person per2 = new Person("张三",30);
        if(per1.getName().equals(per2.getName())
            && per1.getAge() == per2.getAge()) {
                System.out.print("两个对象相等");
            } else {
                System.out.print("两个对象不相等");
            }
    }
}
