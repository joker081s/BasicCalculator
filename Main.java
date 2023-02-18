import java.util.Scanner;

public class Main {

    private static final String MSG1 = "Enter number 1 : ";
    private static final String MSG2 = "Enter number 2 : ";
    private static final String SEPARATION = "===========================================================";

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double num1, num2, result;
        int choice;
        System.out.println(SEPARATION);
        operation();
        System.out.println(SEPARATION);

        while(true) {

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 9) {
                System.out.println("Exiting...\nexited successfully (Error : 0)");
                System.out.println(SEPARATION);
                break;
            }

            switch(choice) {
                case 0 -> {
                    operation();
                    System.out.println(SEPARATION);
                }
                case 1 -> {
                    System.out.print(MSG1);
                    num1 = sc.nextDouble();
                    System.out.print(MSG2);
                    num2 = sc.nextDouble();
                    result = addition(num1, num2);
                    System.out.println("Addition of " + num1 + " and " + num2 + " : " + result);
                    System.out.println(SEPARATION);
                }
                case 2 -> {
                    System.out.print(MSG1);
                    num1 = sc.nextDouble();
                    System.out.print(MSG2);
                    num2 = sc.nextDouble();
                    result = subtraction(num1, num2);
                    System.out.println("Subtraction of " + num2 + " from " + num1 + " : " + result);
                    System.out.println(SEPARATION);
                }
                case 3 -> {
                    System.out.print(MSG1);
                    num1 = sc.nextDouble();
                    System.out.print(MSG2);
                    num2 = sc.nextDouble();
                    result = multiplication(num1, num2);
                    System.out.println("Multiplication of " + num1 + " and " + num2 + " : " + result);
                    System.out.println(SEPARATION);
                }
                case 4 -> {
                    System.out.print(MSG1);
                    num1 = sc.nextDouble();
                    System.out.print(MSG2);
                    num2 = sc.nextDouble();
                    result = division(num1, num2);
                    System.out.println("Division of " + num1 + " by " + num2 + " : " + result);
                    System.out.println(SEPARATION);
                }
                case 5 -> {
                    System.out.print(MSG1);
                    num1 = sc.nextDouble();
                    System.out.print(MSG2);
                    num2 = sc.nextDouble();
                    result = remainder(num1, num2);
                    System.out.println("Remainder of " + num1 + " by " + num2 + " : " + result);
                    System.out.println(SEPARATION);
                }
                case 6 -> {
                    System.out.print("Enter the number : ");
                    num1 = sc.nextDouble();
                    result = modulus(num1);
                    System.out.println("Modulus of " + num1 + " ( |" + num1 + "| ) : " + result);
                    System.out.println(SEPARATION);
                }
                case 7 -> {
                    System.out.print("Enter the number : ");
                    num1 = sc.nextDouble();
                    result = greatestIntegerFunction(num1);
                    System.out.println("Greatest Integer of " + num1 + " ( [" + num1 + "] ) : " + result);
                    System.out.println(SEPARATION);
                }
                case 8 -> {
                    System.out.print("Enter the number : ");
                    num1 = sc.nextDouble();
                    result = signumFunction(num1);
                    System.out.println("Signum of " + num1 + " ( sgn(" + num1 + ") ) : " + result);
                    System.out.println(SEPARATION);
                }
                default -> {
                    System.out.println("There is no such operation available.");
                    System.out.println(SEPARATION);
                }
            }
        }

    }

    private static void operation() {
        System.out.println("Basic Operations : \n\t0 - print operations\n\t1 - addition\n\t2 - subtraction\n\t3 - multiplication\n\t4 - division\n\t5 - remainder\n\t6 - modulus\n\t7 - greatest integer function\n\t8 - signum function\n\t9 - exit");
    }

    private static double addition(double a, double b) {
        return (a+b);
    }

    private static double subtraction(double a, double b) {
        return (a-b);
    }

    private static double multiplication(double a, double b) {
        return (a*b);
    }

    private static double division(double a, double b) {
        return (a/b);
    }

    private static double remainder(double a, double b) {
        return (a%b);
    }

    private static double modulus(double a) {
        return (a < 0 ? -a : a);
    }

    private static double greatestIntegerFunction(double a) {
        if ((a%1) == 0) {
            return a;
        } else {
            return a < 0 ? (int) a-1 : (int) a;
        }
    }

    private static double signumFunction(double a) {
        if (a == 0) {
            return 0;
        } else if (a > 0) {
            return 1;
        } else {
            return -1;
        }
     }

}
