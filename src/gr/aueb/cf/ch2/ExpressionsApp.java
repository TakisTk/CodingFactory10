package gr.aueb.cf.ch2;

/**
 * Expressions Demo
 * Pizza App Calculator.
 */

public class ExpressionsApp {

    public static void main(String[] args) {
        int bestFriends = 5;
        int pizzasOrdered = 3;
        int slicesPerPizza = 8;

        int totalSlices = 0;
        int slicesPerPerson = 0;
        int leftoverSlices = 0;
        int aliceSlices = 0;

        int wallet = 50;
        int pizzaCost = 10;
        int drinkCost = 3;
        int totalBill = 0;
        int finalBill = 0;
        int costPerPerson = 0;
        int reminder = 0;
        int beforeArrival = 0;

        final int DISCOUNT = 10;  //10% Discount
        beforeArrival = bestFriends++;

        //βασικες πραξεις
        totalSlices = pizzasOrdered * slicesPerPizza;
        slicesPerPerson = totalSlices / bestFriends;
        leftoverSlices = totalSlices % bestFriends;

        aliceSlices = slicesPerPerson;
       --aliceSlices;

        wallet += 10;                   // wallet = wallet + 10;
        wallet -= 5;                    // wallet = wallet - 5;




       totalBill = (pizzasOrdered * pizzaCost) + (drinkCost * bestFriends);
       finalBill = totalBill - (totalBill * DISCOUNT / 100);
       costPerPerson = finalBill / bestFriends;
       reminder = finalBill % bestFriends;

       System.out.printf("κομματια: %d, ανα ατομο: %d, επιπλεον: %d, Alice: %d, Wallet: %d, ατομα: %d%n",
               totalSlices, slicesPerPerson, leftoverSlices, aliceSlices, wallet, bestFriends);
        System.out.printf("λογαριασμοσ: %d, με εκπτωση: %d, ανα ατομο: %d, επιπλεον: %d",
                totalBill, finalBill, costPerPerson, reminder);



    }
}
