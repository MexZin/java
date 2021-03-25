package week3;

import constructor.Exercise2;
import constructor.Exercise5;
import inheritance.A;
import inheritance.B;
import inheritance.C;

public class Main {

    public static void main(String[] args) {

//        Exercise2 exercise2 = new Exercise2();
//        Exercise2 exercise21 = new Exercise2(14);
//        exercise21.m1();
//        System.out.println(exercise21.m2());
//        System.out.println(exercise21.m3());

//        Exercise5 exercise5 = new Exercise5(4);
//        exercise5.setY(3);
//        System.out.println(exercise5.m1());

        A a = new A();
        a.setXY();
        a.printX();
        a.printY();

        System.out.println("================");

        B b = new B(5, 6);
        b.printX();
        b.printY();
//        b.setXY();
//        b.printX();
//        b.printY();

        C c = new C(1, 5);

    }
}
