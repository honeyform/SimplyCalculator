/**
 * Created by Honey on 04.08.2015.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        while (true) {
//        System.out.println("Write first number:");
            int firstNumber = s.nextInt();
//        System.out.println("Write:");
            String symbol = s.next();
//        System.out.println("Write second number:");
            int secondNumber = s.nextInt();


            if (symbol.equals("+")) {
                Context add = new Context(new Add());
                System.out.print("" + (firstNumber) + " + " + (secondNumber) + " = " + add.DoAction(firstNumber, secondNumber));
            } else if (symbol.equals("-")) {
                Context substract = new Context(new Subtract());
                System.out.print("" + (firstNumber) + " - " + (secondNumber) + " = " + substract.DoAction(firstNumber, secondNumber));
            } else if (symbol.equals("/")) {
                try {
                    Context divide = new Context(new Dividing ());
                    System.out.print("" + (firstNumber) + " / " + (secondNumber) + " = " + divide.DoAction(firstNumber, secondNumber));
                } catch (ArithmeticException e) {
                    System.out.println("Zerrooo!");
                }
            } else {
                Context multiply = new Context(new Multiply());
                System.out.print("" + (firstNumber) + " * " + (secondNumber) + " = " + multiply.DoAction(firstNumber, secondNumber));
            }
        }
    }
}
