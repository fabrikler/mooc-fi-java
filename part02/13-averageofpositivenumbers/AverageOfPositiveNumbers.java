
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        double sum = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else if (num <= 0) {
                continue;
            }

            sum += num;
            counter++;

        }

        if (counter <= 0) {
            System.out.println("Cannot calculate average");
        } else {
            System.out.println(sum / counter);
        }

    }
}
