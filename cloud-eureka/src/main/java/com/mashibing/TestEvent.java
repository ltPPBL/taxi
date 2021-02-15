package com.mashibing;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @Auther: liutao
 * @Date: 2021/2/7 - 02 - 07 - 17:34
 * @Description: com.mashibing
 * @Version: 1.0
 */
public class TestEvent implements Serializable {

    private static final long serialVersionUID = 2034763566778309033L;
    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
       int a = 10;
       int b = 20;
       int c = 30;
       int[] arr = new int[4];
       arr[0] = 11;
       arr[1] = 56;
       arr[2] = 98;
       arr[3] = 67;
       Arrays.toString(arr);
       int eat = eat();
        System.out.println(eat);
    }

    public static int eat(){
        System.out.println("=-======1");
        return 10;
    }

}
