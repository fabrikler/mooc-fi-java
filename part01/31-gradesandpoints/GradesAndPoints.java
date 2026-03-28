
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");

        int result = Integer.valueOf(scan.nextLine());

        if (result < 0) {
            System.out.println("impossible!");
        } else if (result < 50) {
            System.out.println("failed");
        } else if (result < 60) {
            System.out.println("Grade: 1");
        } else if (result < 70) {
            System.out.println("Grade: 2");
        } else if (result < 80) {
            System.out.println("Grade: 3");
        } else if (result < 90) {
            System.out.println("Grade: 4");
        } else if (result <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("incredible!");
        }
    }
}
