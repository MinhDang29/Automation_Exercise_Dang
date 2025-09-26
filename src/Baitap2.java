public class Baitap2 {
    public static void main(String[] args) {
        /*
         * Homework #2 - Primitives
         *
         * Assignment #2
         * 1.) Declare an int variable named 'bookPrice' equal to $45
         *     Example: int bookPrice = 45;
         * 2.) Declare a double variable named 'discount' equal to 20% in decimal format
         * 3.) Declare a double variable named 'total' that will calculate the
         *     discounted price of the book
         * 4.) Print out the result of total due by a customer when purchasing a
         *     book that costs $45 with a 20% discount
         */

        // Write your answer below this line
        // Declare an int variable named 'bookPrice' equal to $45
        int bookPrice = 45;

        //Declare a double variable named 'discount' equal to 20% in decimal format
        double discount = 0.2; // 20% as decimal = 0.20

        // Declare a double variable named 'total' that will calculate the
        double total = bookPrice - (bookPrice * discount);

        //Print out the result of total due by a customer when purchasing a
        System.out.println("Total price after discount: $" + total);

    }
}
