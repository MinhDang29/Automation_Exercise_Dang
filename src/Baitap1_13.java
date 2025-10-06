public class Baitap1_13 {
    public static void main(String[] args) {
        /*
         * Homework #13 - XPath locators
         *
         * Create XPath locators for the following web elements on https://bantheme.xyz/hathanhauto/tai-khoan/
         * 1.) Login email address field
         * 2.) Login button
         * 3.) Logout button
         * 4.) Search field
         * 5.) Cart
         * ==============================================================
         * Remember to check your locators to meet the following criteria:
         * 1.) It must be unique
         * 2.) It should be short (avoid absolute paths and long locators)
         * 3.) Do not use any plugins to generate locators for you.
         *    The whole point of this HW is to practice finding locators by yourself
         */
            String registerEmailFieldLocator = "//input[@id='reg_email']"; //register email
            String registerButtonLocator = "//button[@name='register']";// button register
            String logoutButtonLocator = "//a[text()='Thoát']"; //logout
            String searchFieldLocator = " (//input[@name='s'])[1]";// Search
            String cartLocator = "(//i[contains(@class,'fa-shopping-basket')]/..)[1]";//cart

            System.out.println("XPath Locator for email field is: " + registerEmailFieldLocator);
            System.out.println("XPath Locator for submit button is: " + registerButtonLocator);
            System.out.println("XPath Locator for logout button is: " + logoutButtonLocator);
            System.out.println("XPath Locator for search field is: " + searchFieldLocator);
            System.out.println("XPath Locator for cart is: " + cartLocator);
        }
    }
