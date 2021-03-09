package week2.project1;

import java.util.Scanner;

public class A {
    public int a, b;

    public void m1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("a->");
        a = scan.nextInt();
        System.out.println("b->");
        b = scan.nextInt();
    }

    public void m2(){
        System.out.println("sum= "+(a+b));
    }

    public int m3(){
        return a*b;
    }
}
