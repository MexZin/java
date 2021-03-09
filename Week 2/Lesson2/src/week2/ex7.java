package week2;

import java.util.Scanner;

public class ex7 {
    public ex7(){
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("x:");
        x = scanner.nextInt();
        System.out.println("Y:");
        y = scanner.nextInt();
        int n = x*y;
        while (x!=y){
            if (x>y) x = x-y;
            else y = y - x;
        }
        System.out.println("usg: "+x);
        System.out.println("usj: "+n/x);
    }
}
