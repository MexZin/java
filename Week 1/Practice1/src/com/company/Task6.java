package com.company;

import java.util.Scanner;

public class Task6 {

    public Task6(){
        int x, s=0;
        System.out.println("x=");
        Scanner scanner = new Scanner(System.in);
        System.out.println("x=");
        x = scanner.nextInt();
        while (x!=0){
            s += x%10;
            x = x/10;
        }
        System.out.println("S="+s);
    }
}
