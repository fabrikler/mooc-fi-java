
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");

        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number?");

        int secondNum = Integer.valueOf(scanner.nextLine());

        if (firstNum > secondNum) {
            System.out.println("The first number must be smaller than the last number.");
            return;
        }

        int sum = 0;

        for (int i = firstNum; i <= secondNum; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);

    }
}
