package top.horon.string;

public class split {
    public static void main(String[] args) {
        String str = "192.168.0.1";
        String result[] = str.split("\\.");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + ",");
        }
    }
}
