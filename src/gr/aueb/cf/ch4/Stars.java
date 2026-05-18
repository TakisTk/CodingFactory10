package gr.aueb.cf.ch4;

/**
 * ektuponoume orizontia kai kathetA
 * APO 1-10 APO 10-1 KAI 10X10 ASTERAKIA
 *
 */
public class Stars {
    public static void main(String[] args) {
        int height = 5;


//        for (int i = 1; i <= 10; i++){
//            System.out.print("*");
//        }
//
//        for (int i = 1; i <= 10; i++){
//            System.out.println("*");
//        }
//
//        for (int i = 1; i <= 15; i++){
//            for (int j = 1; j <= 10; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        for(int i = 1; i <= 10; i++){
//
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i = 1; i <= height; i++) {

            for (int j = i; j <= height; j++){
                System.out.print(" ");
            }

            for( int x = 1; x <= (2 * i - 1); x++){
                System.out.print("*");
            }


            System.out.println();
        }


    }
}
