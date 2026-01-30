import java.util.Scanner;

public class Console_based_calculator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int ch;

        do {
            System.out.println("\n******************************");
            System.out.println("Choice Operation :");
            System.out.println("1. Arithmetic Operation");
            System.out.println("2. Scientific Calculation");
            System.out.println("3. Unit Conversion");
            System.out.println("4. Exit");
            System.out.println("******************************");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    basic_arithmetic_op();
                    break;
                case 2:
                    scientific_op();
                    break;
                case 3:
                    unit_conversion();
                    break;
                case 4:
                    System.out.println("THANK YOU for using Calculator..!!");
                    break;
                default:
                    System.out.println("Invalid Choice..!!");
            }
        } while (ch != 4);
    }

    // Arithmetic Operations
    static void basic_arithmetic_op() {

        System.out.print("Enter 1st Number : ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd Number : ");
        double b = sc.nextDouble();

        System.out.println("\nArithmetic Operation :");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter choice : ");
        int c = sc.nextInt();

        switch (c) {
            case 1:
                System.out.println("Addition is : " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction is : " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication is : " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Division is : " + (a / b));
                else
                    System.out.println("Error: Division by zero!");
                break;
            default:
                System.out.println("Invalid Choice..!!");
        }
    }

    // Scientific Calculations
    static void scientific_op() {

        System.out.println("1. Square Root");
        System.out.println("2. Power");
        System.out.print("Enter operation : ");
        int c = sc.nextInt();

        switch (c) {
            case 1:
                System.out.print("Enter Number : ");
                double num = sc.nextDouble();
                System.out.println("Square Root is : " + Math.sqrt(num));
                break;
            case 2:
                System.out.print("Enter Base : ");
                double base = sc.nextDouble();
                System.out.print("Enter Exponent : ");
                double exp = sc.nextDouble();
                System.out.println("Result is : " + Math.pow(base, exp));
                break;
            default:
                System.out.println("Invalid Choice..!!");
        }
    }

    // Unit Conversion
    static void unit_conversion() {

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. INR to USD");
        System.out.println("4. USD to INR");
        System.out.print("Enter operation : ");
        int c = sc.nextInt();
        double val;

        switch (c) {
            case 1:
                System.out.print("Enter temperature in Celsius : ");
                val = sc.nextDouble();
                System.out.println("Fahrenheit : " + (val * 9.0 / 5 + 32));
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit : ");
                val = sc.nextDouble();
                System.out.println("Celsius : " + ((val - 32) * 5.0 / 9));
                break;
            case 3:
                System.out.print("Enter INR : ");
                val = sc.nextDouble();
                System.out.println("USD : " + (val * 0.012));
                break;
            case 4:
                System.out.print("Enter USD : ");
                val = sc.nextDouble();
                System.out.println("INR : " + (val * 83));
                break;
            default:
                System.out.println("Invalid Choice..!!");
        }
    }
}
