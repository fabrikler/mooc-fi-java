
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        int tempAge = 0;
        String oldestName = "";
        String tempName = "";


        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] split = input.split(",");
            tempName = split[0];
            tempAge = Integer.valueOf(split[1]);

            if (oldestAge < tempAge) {
                oldestAge = tempAge;
                oldestName = tempName;
            }
        }

        System.out.println("Name of the oldest: " + oldestName);

    }
}
