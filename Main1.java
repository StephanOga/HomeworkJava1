import java.util.Scanner;

/**
 * task1
 */
public class Main1 {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Вычисление треугольного числа
        System.out.print("Введите n для вычисления треугольного числа: ");
        int n = sc.nextInt();
        
        int triangleNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
        }
        
        System.out.println("Треугольное число " + n + " = " + triangleNumber);

        // Вычисление факториала
        System.out.print("Введите n для вычисления факториала: ");
        n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал " + n + "! = " + factorial);
}
}

