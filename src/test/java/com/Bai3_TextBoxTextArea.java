package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.utils.BasicTest; // Giữ nguyên class cha của bạn

public class Bai3_TextBoxTextArea extends BasicTest {

    // --- 1. KHAI BÁO LOCATOR (Định danh phần tử) ---
    // Đặt ở đây để dễ quản lý, không phải viết lại nhiều lần trong code
    By myAccountLink = By.xpath("(//a[@title='My Account'])[2]");
    By createAccountLink = By.xpath("//a[@title='Create an Account']");
    
    By firstNameInput = By.id("firstname");
    By lastNameInput = By.id("lastname");
    By emailInput = By.id("email_address");
    By passwordInput = By.id("password");
    By confirmPasswordInput = By.id("confirmation");
    By registerBtn = By.cssSelector("button[title='Register']");

    // --- 2. HÀM HỖ TRỢ (Helper) ---
    // Hàm tạo email ngẫu nhiên: automation + số giây hiện tại + @gmail.com
    public String generateRandomEmail() {
        return "automation" + System.currentTimeMillis() + "@gmail.com";
    }

    // --- 3. CÁC TEST CASES ---

    @Test
    public void TC_01_Register() {
        driver.get("https://live.techpanda.org/");

        // Click My Account -> Create Account
        driver.findElement(myAccountLink).click();
        driver.findElement(createAccountLink).click();

        // Điền thông tin
        driver.findElement(firstNameInput).sendKeys("Automation");
        driver.findElement(lastNameInput).sendKeys("FC");
        
        // Sử dụng hàm random email ở đây
        String randomEmail = generateRandomEmail();
        System.out.println("Email đăng ký là: " + randomEmail); // In ra để kiểm tra
        driver.findElement(emailInput).sendKeys(randomEmail);

        driver.findElement(passwordInput).sendKeys("123456");
        driver.findElement(confirmPasswordInput).sendKeys("123456");

        // Click đăng ký
        driver.findElement(registerBtn).click();
        
        // (Optional) Kiểm tra đăng ký thành công nếu cần
        // Assert.assertTrue(driver.getPageSource().contains("Thank you for registering"));
    }

    //@Test
    public void TC_02_CheckTitle() {
        driver.get("https://live.techpanda.org/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://live.techpanda.org/");

        driver.findElement(myAccountLink).click();
        Assert.assertEquals(driver.getTitle(), "Customer Login");

        driver.findElement(createAccountLink).click();
        Assert.assertEquals(driver.getTitle(), "Create New Customer Account");
    }

    //@Test
    public void TC_03_Navigate() {
        driver.get("https://live.techpanda.org/");

        // Điều hướng đến trang đăng ký
        driver.findElement(myAccountLink).click();
        driver.findElement(createAccountLink).click();

        // Kiểm tra Url trang đăng ký
        Assert.assertEquals(driver.getCurrentUrl(), "https://live.techpanda.org/index.php/customer/account/create/");

        // Back lại trang đăng nhập
        driver.navigate().back();
        Assert.assertEquals(driver.getCurrentUrl(), "https://live.techpanda.org/index.php/customer/account/login/");

        // Forward lại trang đăng ký
        driver.navigate().forward();
        Assert.assertEquals(driver.getTitle(), "Create New Customer Account");
    }

   // @Test
    public void TC_04_CheckPageSource() {
        driver.get("https://live.techpanda.org/");
        
        driver.findElement(myAccountLink).click();
        
        // Kiểm tra xem trang có chứa đoạn text mong muốn không
        Assert.assertTrue(driver.getPageSource().contains("Login or Create an Account"));
    }
}
    