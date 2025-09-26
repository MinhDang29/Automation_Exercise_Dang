public class Baitap1_6 {
    public static void main(String[] args) {
        Baitap1_6_SavingsWallet myWallet = new Baitap1_6_SavingsWallet();
        myWallet.addMoney(750); // Initial amount
        myWallet.addMoney(200); // add amount
        myWallet.spendMoney(125);//spendamount
        myWallet.getCurrentAmount();
        if (myWallet.getCurrentAmount() == 825) {
            System.out.println(" Current amount: $" + myWallet.getCurrentAmount() + " Correct calculation!");
        } else {
            System.out.println(" Current amount: $" + myWallet.getCurrentAmount() + " Something is wrong!");
        }
    }
}
        /*int currentAmount = myWallet.getCurrentAmount();
        // Please finish the rest
        if (currentAmount == 825) {
            System.out.println("Current amount: $" + currentAmount + "  Correct calculation!");
        } else {
            System.out.println("Current amount: $" + currentAmount + "  Something is wrong!");
        }*/
    /*
     * Homework #6 - Classes and Objects
     *
     * 1.) Initialize a savings wallet with an initial amount of $750.
     * 2.) Add $200 to the wallet.
     * 3.) Spend $125 from the wallet, amount should be correctly deducted.
     * 4.) Use an if statement to check if the final amount matches
     *     the expected result ($825).
     * 5.) Print the current amount and provide a message indicating
     *     whether the calculation is correct.
     */


