import java.util.*;

class calculator {

    public static void main(String[] args) {

        System.out.println("CALCULATOR BY KENNETH CASTRO");
        System.out.println("----------------------------");

        int firstnum, secondnum, totalSum, totalDiff, totalProd, totalQuotient, ModofTwonum;

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
        ModofTwonum = firstnum % secondnum;

        System.out.println("Sum of the two numbers: " + totalSum);
        System.out.println("Difference of the two numbers: " + totalDiff);
        System.out.println("Product of the two numbers: " + totalProd);
        System.out.println("Quotient of the two numbers: " + totalQuotient);
        System.out.println("Modulo of the two numbers: " + ModofTwonum);

    }
}
