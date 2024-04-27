
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputData = input.split(" ");

        if (inputData.length != 3) {
            throw new IllegalArgumentException("Неверный Ввод");
        }

        int a = Integer.parseInt(inputData[0]);
        int b = Integer.parseInt(inputData[2]);

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new IllegalArgumentException("Числа должны быть от 1 до 10.");
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
                    throw new IllegalArgumentException("Деление на ноль не допускается");
                }
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Неверная арифметическая операция");
        }

        System.out.println("Result: " + result);
    }
}
