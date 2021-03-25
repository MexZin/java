package Calculator;
import java.util.Scanner;

public class CalculatorV1 {

    public void cal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operation: ");
        String operation = sc.next();

        switch (operation) {
            case "+":
                int result = num1 + num2;
                System.out.println("Result: "+result);
                break;
            case "-":
                int result2 = num1 - num2;
                System.out.println("Result: "+result2);
                break;
            case "/":
                int result3 = num1 / num2;
                System.out.println("Result: "+result3);
                break;
            case "*":
                int result4 = num1 * num2;
                System.out.println("Result: "+result4);
                break;
            default:
                System.out.println("Wrong operation");


        }
    }


}
