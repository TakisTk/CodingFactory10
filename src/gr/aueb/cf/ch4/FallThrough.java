package gr.aueb.cf.ch4;


import java.util.Scanner;

public class FallThrough {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int grade = 0;

        System.out.println("give a grade (1-10):");
        grade = in.nextInt();

        switch (grade){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("failed");
                break;
            case 5:
            case 6:
                System.out.println("good");
                break;
            case 7:
            case 8:
                System.out.println("very good");
                break;
            case 9:
            case 10:
                System.out.println("excelent");
            default:
                System.out.println("not a valid number");
        }



        switch (grade) {
            case 1,2,3,4 -> System.out.println("fail");
            case 5,6 -> System.out.println("good");
            case 7,8 -> System.out.println("very good");
            case 9,10 -> System.out.println("excelent");
            default -> System.out.println("not a valid number");
        }
    }
}
