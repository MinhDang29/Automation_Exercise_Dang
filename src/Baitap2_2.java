public class Baitap2_2 {
    public static void main(String[] args) {
        /*
         * Homework #2 - Strings
         *
         * Assignment #2
         * 1.) Declare a String variable named 'author' with the value "Albert Einstein".
         * 2.) Declare a String variable named 'wisdom' with the value
         *     "Imagination is more important than knowledge".
         * 3.) Declare a String variable named 'citation' and set its value
         *     to the combination of 'author', a colon ":",
         *     and the String variable 'wisdom'.
         * 4.) Print out the complete citation.
         * 5.) Print out the first 15 characters of the citation.
         */        // Write your answer below this line
        String author= "Albert Einstein";
        String wisdom ="Imagination is more important than knowledge";
        //String concatenation
        String citation = author + ":" + wisdom;
        //Print full citation
        System.out.println(citation);
        //Get substring:
        System.out.println(citation.substring(0,15));

    }
}
