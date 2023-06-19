import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();

        System.out.print("Введите знак операции (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();

        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                }
                break;
            default:
                System.out.println("Ошибка: некорректный знак операции.");
        }
    }
    
}
