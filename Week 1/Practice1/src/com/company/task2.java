package com.company;

import java.util.Scanner;

public class task2 {
    public task2(){
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("X: ");
        x = scanner.nextInt();
        System.out.print("Y: ");
        y = scanner.nextInt();

        System.out.println(x / y);
        System.out.println(y % x);

    }
}
