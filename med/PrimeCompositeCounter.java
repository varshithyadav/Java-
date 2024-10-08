import java.util.Scanner;
public class PrimeCompositeCounter {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers (enter a negative number to stop):");
        int primeCount = 0;
        int compositeCount = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }

            if (isPrime(number)) {
                primeCount++;
            } else if (number > 1) {
                compositeCount++;
            }
        }
        System.out.println("Composite numbers: " + compositeCount);
        System.out.println("Prime numbers: " + primeCount);

        scanner.close();
    }
}
