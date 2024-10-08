import java.util.Scanner;

public class DaysToYearsWeeksDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();
        if (totalDays < 0) {
            System.out.println("Invalid input: Days cannot be negative.");
        } else {
            int years = totalDays / 365;
            int remainingDaysAfterYears = totalDays % 365;
            int weeks = remainingDaysAfterYears / 7;
            int days = remainingDaysAfterYears % 7;
            System.out.println("No. of years: " + years);
            System.out.println("No. of weeks: " + weeks);
            System.out.println("No. of days: " + days);
        }

        scanner.close();
    }
}
