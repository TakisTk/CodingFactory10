package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * aplos upologistis tsepis pou emfanizei menou me
 * prosthesi aferesi polaplasiasmo dieresi kai mod,
 * o xristis epilegei, stin sunexeia dinei tis times
 * eisodou kai lamvanei to apotelesma. auto epanalamvanete
 * mexri na epileksei 'eksodo'.
 */
public class CalculatorApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        int result = 0;
        int num1 = 0;
        int num2 = 0;
        final int EXIT = 6;


        while (true) {
            printMenu();
            choice = getOneInt();

            if ( choice == EXIT){
                System.out.println("exit");
                break;
            }

            if (!isChoiceValid(choice)){
                System.out.println("not valid choice. Try again");
                continue;
            }

            System.out.println("dwste duo akereous: ");
            num1 = getOneInt();
            num2 = getOneInt();

            result = getResultOnChoice(choice, num1, num2);

            System.out.println("result: " + result);
        }
    }
    public static void printMenu() {
        System.out.println("select option");
        System.out.println("1. prosthesi");
        System.out.println("2. afairesi");
        System.out.println("3. polaplasiasmos");
        System.out.println("4. dieresi");
        System.out.println("5. mod");
        System.out.println("6. eksodos");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice)
    {
        return choice >=1 && choice <= 6;
    }

    public static int getResultOnChoice(int choice, int num1, int num2){
        int result = 0;


        return switch (choice){
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mul(num1, num2);
            case 4 -> div(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0;
        };
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return  a - b;
    }
    public static int mul(int a, int b){
        return  a * b;
    }
    public static int div(int a, int b){
        if (b == 0){
            return 0;
        }
        return a / b;

    }
    public static int mod(int a, int b){
        return a % b;

    }

}
