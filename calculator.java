import java.util.Scanner;

class calculator {

    public static void main(String[] args) {

        int firstnum, secondnum, total, totalDiff;

        // get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        firstnum = scanner.nextInt();

        System.out.println("Enter second number: ");
        secondnum = scanner.nextInt();

        total = firstnum + secondnum;
        totalDiff = firstnum - secondnum;

        System.out.println("Sum of the two numbers: " + total);
        System.out.println("Difference of the two numbers: " + totalDiff);

    }
}