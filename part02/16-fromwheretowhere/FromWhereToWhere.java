
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");

        int numEnd = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");

        int numStart = Integer.valueOf(scanner.nextLine());

        if (numStart <= numEnd) {
            for (int i = numStart; i <= numEnd; i++) {
                System.out.println(i);
            }
        }
    }

}