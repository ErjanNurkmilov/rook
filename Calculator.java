import java.util.Scanner;

public class Calculator {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("ВВЕДИТЕ ВЫРАЖЕНИЕ В ФОРМАТЕ ЧИСЛО ОПЕРАТОР ЧИСЛО");
                String input = scanner.nextLine();
                String[] parts = input.split("");
                if (parts.length != 3) {
                    System.out.println("ОШИБКА НЕКОРРЕКТНЫЙ ФОРМАТ ВВОДА");
                    return;
                }
                int num1, num2;
                try {
                    num1 = Integer.parseInt(parts[0]);
                    num2 = Integer.parseInt(parts[2]);

                } catch (NumberFormatException e) {
                    return;
                }

                if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                    System.out.println("Числа должны бbть от 1 до 10 включительно");
                    return;
                }

                char operator = parts[1].charAt(0);
                int result = 0;

                if (operator != '+' && operator != '-' && operator != '/' && operator != '*') {
                    throw new IllegalArgumentException();
                }

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;

                    case '-':
                        result = num1 - num2;
                        break;

                    case '*':
                        result = num1 * num2;
                        break;

                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: / by 0");
                            return;
                        }
                        break;

                }
                System.out.println("Result: " + result);
            }
        }
    }

