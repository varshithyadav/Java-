import java.util.Scanner;

public class UserCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total Users: ");
        int totalUsers = scanner.nextInt();
        System.out.print("Staff Users: ");
        int staffUsers = scanner.nextInt();
        int nonTeachingStaff = staffUsers / 3;
        int studentUsers = totalUsers - (staffUsers + nonTeachingStaff);
        System.out.println("Student Users: " + studentUsers);

        scanner.close();
    }
}
