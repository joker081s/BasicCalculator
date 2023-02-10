import java.util.Scanner;

public class Main {

    private static final String MSG1 = "Enter number 1 : ";
    private static final String MSG2 = "Enter number 2 : ";
    private static final String SEPARATION = "===========================================================";

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2, choice, result;
        System.out.println(SEPARATION);
        operation();
        System.out.println(SEPARATION);

        while(true) {

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 7) {
                System.out.println("Exiting...\nexited successfully (Error : 0)");
                System.out.println(SEPARATION);
                break;
            }

            switch(choice) {
                case 0 :
                    operation();
                    System.out.println(SEPARATION);
                    break;
                case 1 :
                    System.out.print(MSG1);
                    num1 = sc.nextInt();
                    System.out.print(MSG2);
                    num2 = sc.nextInt();
                    result = addition(num1, num2);
                    System.out.println("Addition of " + num1 + " and " + num2 + " : " + result);
                    System.out.println(SEPARATION);
                    break;
                case 2 :
                    System.out.print(MSG1);
                    num1 = sc.nextInt();
                    System.out.print(MSG2);
                    num2 = sc.nextInt();
                    result = subtraction(num1, num2);
                    System.out.println("Subtraction of " + num2 + " from " + num1 + " : " + result);
                    System.out.println(SEPARATION);
                    break;
                case 3 :
                    System.out.print(MSG1);
                    num1 = sc.nextInt();
                    System.out.print(MSG2);
                    num2 = sc.nextInt();
                    result = multiplication(num1, num2);
                    System.out.println("Multiplication of " + num1 + " and " + num2 + " : " + result);
                    System.out.println(SEPARATION);
                    break;
                case 4 :
                    System.out.print(MSG1);
                    num1 = sc.nextInt();
                    System.out.print(MSG2);
                    num2 = sc.nextInt();
                    result = division(num1, num2);
                    System.out.println("Division of " + num1 + " by " + num2 + " : " + result);
                    System.out.println(SEPARATION);
                    break;
                case 5 :
                    System.out.print(MSG1);
                    num1 = sc.nextInt();
                    System.out.print(MSG2);
                    num2 = sc.nextInt();
                    result = remainder(num1, num2);
                    System.out.println("Remainder of " + num1 + " by " + num2 + " : " + result);
                    System.out.println(SEPARATION);
                    break;
                case 6 :
                    System.out.print("Enter the number : ");
                    num1 = sc.nextInt();
                    result = modulus(num1);
                    System.out.println("Modulus of " + num1 + " ( |" + num1 + "| ) : " + result);
                    System.out.println(SEPARATION);
                    break;
                default :
                    System.out.println("There is no such operation available.");
                    System.out.println(SEPARATION);
                    break;
            }
        }

    }

    private static void operation() {
        System.out.println("Basic Operations : \n\t0 - print operations\n\t1 - addition\n\t2 - subtraction\n\t3 - multiplication\n\t4 - division\n\t5 - remainder\n\t6 - modulus\n\t7 - exit");
    }

    private static int addition(int a, int b) {
        return (a+b);
    }

    private static int subtraction(int a, int b) {
        return (a-b);
    }

    private static int multiplication(int a, int b) {
        return (a*b);
    }

    private static int division(int a, int b) {
        return (a/b);
    }

    private static int remainder(int a, int b) {
        return (a%b);
    }

    private static int modulus(int a) {
        return (a < 0 ? -a : a);
    }

}