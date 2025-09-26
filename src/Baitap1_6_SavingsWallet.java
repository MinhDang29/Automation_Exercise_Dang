public class Baitap1_6_SavingsWallet {

        public int amount;

        // Method to add money to the wallet
        public void addMoney(int cash) {
            // Add logic here
            amount += cash;
        }

        // Method to spend money from the wallet
        public void spendMoney(int cash) {
            // Add logic here
            amount -= cash;
        }

        // Method to get the current amount
        public int getCurrentAmount() {
            // Add logic here
            return amount;
        }
}
