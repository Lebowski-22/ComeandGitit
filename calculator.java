import java.util.Scanner;

class calculator {

    public static void main(String[] args) {

        int firstnum, secondnum, totalSum, totalDiff, totalProd, totalQuotient;

        // get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        firstnum = scanner.nextInt();

        System.out.println("Enter second number: ");
        secondnum = scanner.nextInt();
        scanner.close();

        totalSum = firstnum + secondnum;
        totalDiff = firstnum - secondnum;
        totalProd = firstnum * secondnum;
        totalQuotient = firstnum / secondnum;

        System.out.println("Sum of the two numbers: " + totalSum);
        System.out.println("Difference of the two numbers: " + totalDiff);
        System.out.println("Product of the two numbers: " + totalProd);
        System.out.println("Quotient of the two numbers: " + totalQuotient);

    }
}
