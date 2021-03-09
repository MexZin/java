package week2.project1;

import java.util.Scanner;

public class B {
    public int a, b, c;

    public void m1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("a->");
        a = scan.nextInt();
        System.out.print("b->");
        b = scan.nextInt();
        System.out.print("c->");
        c = scan.nextInt();
    }

    public void m2(){
        if ((a > b ) & (a > c )){
            System.out.println(a);
        }else if((b>a) & (b>c)){
            System.out.println(b);
        }else if((c>a) & (c>b)){
            System.out.println(c);
        }


    }

    public void m3(){
        int m = a;
        if (m>b) m=b;
        if (m>c) m=c;
        System.out.println("Min: "+m);
    }
}
