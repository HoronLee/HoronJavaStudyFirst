package top.horon.string;

public class getBytes {
    public static void main(String[] args) {
        String str1 = "hello";
        byte b[] = str1.getBytes();
        System.out.println(new String(b));
        System.out.println(new String(b,1,3));
    }
}
