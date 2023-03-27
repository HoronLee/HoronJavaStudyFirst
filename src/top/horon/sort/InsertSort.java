package top.horon.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args){
        System.out.println("插入排序");
        int[] num = new int[7];
        for (int i = 0;i <= num.length-1;i++){  //给数组赋值
            num[i] = num.length-i;
        }
        System.out.println("排序前的数组为：" + Arrays.toString(num));
        //int[] arr = Arrays.copyOf(num, num.length);
        for (int i = 1; i < num.length; i++) {
            int key = num[i];
            int j = i - 1;
            while (j >= 0 && num[j] > key) {
                num[j+1] = num[j];
                j--;
            }
            num[j+1] = key;
        }
        System.out.println("排序之后的数组为：" + Arrays.toString(num));
    }
}
