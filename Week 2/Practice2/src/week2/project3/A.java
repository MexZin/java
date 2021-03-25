package week2.project3;

import java.util.Random;

public class A {
    public void ex1(){
//        int[] m = {1,2,3,4,5,6,7,8,9,10};
//        for (int i:m){
//        System.out.println(i);
//        }

        Random rd = new Random();
        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i] = rd.nextInt(15);
            System.out.println(arr[i]);
        }


    }
}
