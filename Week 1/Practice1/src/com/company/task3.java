package com.company;

import java.util.Scanner;

public class task3 {
    public task3(){
        System.out.println("Task 3");

        int x, y, z;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        System.out.println("x+y+z= "+(x+y+z));
        System.out.println(x*y*z);
    }
}
