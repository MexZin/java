package inheritance;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class A {
    protected int x, y;

    public void setXY(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("X: ");
        x = scanner.nextInt();
        System.out.print("Y: ");
        y = scanner.nextInt();
    }
    public void printX(){
        System.out.println("X= " + x);
    }
    public void printY(){
        System.out.println("Y= " + y);
    }
}
