package top.horon.string;

public class contains {
    public static void main(String[] args) {
        String str = "blog.horon.top";
        if(str.contains("horon")){
            System.out.println("可以查询到。");
        }else{
            System.out.println("无法查询到");
        }
    }
}
