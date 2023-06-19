import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите уравнение вида q + w = e, где q, w, e >= 0, и замените некоторые цифры знаком '?': ");
        String equation = sc.nextLine();

        boolean solutionFound = false;

        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                String replacedEquation = equation.replace("?", String.valueOf(q));
                replacedEquation = replacedEquation.replace("?", String.valueOf(w));

                String[] parts = replacedEquation.split("=");

                int leftOperand = Integer.parseInt(parts[0].trim());
                int rightOperand = Integer.parseInt(parts[1].trim());

                if (leftOperand + rightOperand == q + w) {
                    System.out.println("Ответ: " + q + " + " + w + " = " + (q + w));
                    solutionFound = true;
                    break;
                }
            }
            if (solutionFound) {
                break;
            }
        }

        if (!solutionFound) {
            System.out.println("Решение не найдено.");
        }
        sc.close(); 
    }
}
