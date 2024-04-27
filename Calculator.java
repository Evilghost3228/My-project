
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputData = input.split(" ");

        if (inputData.length != 3) {
            throw new IllegalArgumentException("Invalid input");
        }

        int a = Integer.parseInt(inputData[0]);
        int b = Integer.parseInt(inputData[2]);

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new IllegalArgumentException("Numbers should be between 1 and 10");
        }

        int result;
        switch (inputData[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed");
                }
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Invalid arithmetic operation");
        }

        System.out.println("Result: " + result);
    }
}