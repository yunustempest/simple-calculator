package Calculator;

import java.util.Scanner;

public class Calculator {
    static Scanner input = new Scanner(System.in);
    double number1, number2;

    public void calculate() { // The main method that makes the calculator work
        System.out.println("Operation sample: 3 + 5");
        while (true) { // Loop that enables continuous processing
            System.out.print("Enter the operation: ");
            String userInput = input.nextLine();
            String[] inputParts = userInput.split(" "); // seperates input by spaces
            // Checks if the input has 3 parts
            if (inputParts.length != 3) {
                System.out.println("Invalid type of operation!");
                continue;
            }
            // Converts the input numbers to double, catches any errors
            try {
                number1 = Double.parseDouble(inputParts[0]);
                number2 = Double.parseDouble(inputParts[2]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid numbers entered!");
                continue;
            }
            System.out.print(number1 + " " + inputParts[1] + " " + number2 + " = "); // for printing
            // Calculates according to operation type
            switch (inputParts[1]) {
                case "+":
                    System.out.println(number1 + number2);
                    break;
                case "-":
                    System.out.println(number1 - number2);
                    break;
                case "/":
                    if (number2 != 0) {
                        System.out.println(number1 / number2);
                        break;
                    } else {
                        System.out.println("When denominator is zero, the division is undefined!");
                        break;
                    }
                case "*":
                    System.out.println(number1 * number2);
                    break;
                case "^":
                    System.out.println(Math.pow(number1, number2));
                    break;
                default:
                    System.out.println("Invalid operation! use (+, -, *, /, ^)");
            }
            // Question to replay
            System.out.println("Continue to operate? y/n");
            String checker = input.nextLine();
            if (checker.equals("n")) {
                System.out.println("thank you for using my calculation program!");
                break; // breaks the loop if the answer is "n"
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        cal.calculate();
    }
}
