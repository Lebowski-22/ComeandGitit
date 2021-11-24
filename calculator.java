import java.util.Scanner;

class calculator {

    public static void main(String[] args) {

        int total;

        // get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstnum = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondnum = scanner.nextInt();

        // total sum of two numbers
        total = firstnum + secondnum;

        System.out.print("Sum of the two numbers: " + total);

        return;

    }
}