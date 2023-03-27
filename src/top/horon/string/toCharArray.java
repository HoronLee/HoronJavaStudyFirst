package top.horon.string;

public class toCharArray {
    public static void main(String[] args){
        String str1 = "hello";
        char c[] = str1.toCharArray();
        for(int i = 0;i < c.length;i++){
            System.out.println(c[i]+"\t");
        }
        System.out.print("");
        String str2 = new String(c);
        String str3 = new String(c,0,3);
        System.out.println(str2);
        System.out.println(str3);
    }
}
