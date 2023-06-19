public class Main2 {
    public static void main2(String[] args){
        boolean[] isPrime = new boolean[1001];
        for (int i = 2; i <= 1000; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= 1000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Простые числа от 1 до 1000:");
        for (int i = 2; i <= 1000; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
