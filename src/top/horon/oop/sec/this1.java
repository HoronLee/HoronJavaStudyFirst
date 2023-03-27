package top.horon.oop.sec;

class Person {
    private String name;
    private int age;
    public Person() {
        System.out.print("一个虚拟的Person对象被实例化了。");
    }
    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }
    public String getInfo() {
        return "姓名：" + name + "，年龄：" + age;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void steAge(int a) {
        age  = a;
    }
}
public class this1 {
    public static void main(String[] args) {
        Person per1 = new Person("皓然",21);
        System.out.println(per1.getInfo());
    }
}
