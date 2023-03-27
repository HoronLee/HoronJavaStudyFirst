package top.horon.oop.thir;

class Person {
    String name;
    int age;
    static String city = "A";
    public static void setcity(String c) {
        city = c;
    }
    public Person(String namne, int age) {
        this.name = namne;
        this.age = age;
    }
    public void info() {
        System.out.println("姓名：" + this.name + " 年龄：" + this.age + "城市：" + city);
    }
    public static String getcity() {
        return city;
    }
}
public class static1 {
    public static void main(String[] args) {
        Person person1 = new Person("张三", 15);
        Person person2 = new Person("李四", 20);
        Person person3 = new Person("王五", 25);
        System.out.println("===修改之前===");
        person1.info();
        person2.info();
        person3.info();
        System.out.println("===修改之后===");
        Person.city = "B";
        person1.info();
        person2.info();
        person3.info();
    }
}
