public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(10);
    }

    public static void printFromNumberToOne(int number) {
        int counter = number;

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }

}
