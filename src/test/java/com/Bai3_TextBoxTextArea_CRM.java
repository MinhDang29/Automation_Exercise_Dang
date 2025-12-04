package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.utils.BasicTest; // Giữ nguyên class cha của bạn

public class Bai3_TextBoxTextArea_CRM extends BasicTest {

    // --- 1. KHAI BÁO LOCATOR (Định danh phần tử) ---
    // Đặt ở đây để dễ quản lý, không phải viết lại nhiều lần trong code
    By Username = By.xpath("//*[@name='username']");
    By Password = By.xpath("//*[@name='password']");
    By LoginBtn = By.xpath("//*[@type='submit']");
    By itemviewBy = By.xpath("//*[@class='oxd-loading-spinner']");
    By DashboardView = By.xpath("//h6[text()='Dashboard']");
    By PIMBtn = By.xpath("//*[@class='oxd-main-menu-item active']");
    By PIMView = By.xpath("//h6[text()='PIM']");
   


    // --- 3. CÁC TEST CASES ---

    @Test
    public void TC_01_Login() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Điền thông tin
        WebElement usernameInput = driver.findElement(Username);
        usernameInput.sendKeys("Admin");
        WebElement passwordInput = driver.findElement(Password);
        passwordInput.sendKeys("admin123");
        driver.findElement(LoginBtn).click();

        Assert.assertTrue(new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions
            .invisibilityOfAllElements(driver.findElements(itemviewBy))));

        Assert.assertTrue(isElementDisplayed(DashboardView));

        driver.findElement(PIMBtn).click();
        Assert.assertTrue(isElementDisplayed(PIMView));

        
        
        
    }
   public boolean isElementDisplayed(By by) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
        } catch (Exception e) {
            return false;// TODO: handle exception
        }
    }
}
 
    