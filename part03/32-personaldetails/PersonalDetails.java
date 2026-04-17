import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        String longestName = "";
        int counter = 0;

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splitted = input.split(",");
            sum += Double.valueOf(splitted[1]);
            counter++;

            if (longestName.length() < splitted[0].length()) {
                longestName = splitted[0];
            }
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + sum / counter);

        scanner.close();

    }

}


