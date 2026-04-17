
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String oldestName = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] split = input.split(",");
            int age = Integer.valueOf(split[1]);

            if (oldestAge < age) {
                oldestAge = age;
                oldestName = split[0];
            }
        }

        System.out.println("Name of the oldest: " + oldestName);

    }
}
