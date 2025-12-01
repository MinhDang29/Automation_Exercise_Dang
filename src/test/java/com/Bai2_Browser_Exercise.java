package com;

import org.testng.Assert;
import org.testng.annotations.Test;

//import static org.junit.jupiter.api.Assertions.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; // Import this
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.utils.BasicTest;
import com.utils.Utils;

public class Bai2_Browser_Exercise extends BasicTest {
    @Test()
    public void TC_01_Url() throws Exception {
        // Launch website
        String url = "https://live.techpanda.org/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);

        WebElement MyaccountBtn = driver.findElement(By.xpath("(//a[@title='My Account'])[2]"));
        MyaccountBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://live.techpanda.org/index.php/customer/account/login/");

        WebElement CreateanAccountBtn = driver.findElement(By.xpath("//a[@title='Create an Account']"));
        CreateanAccountBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://live.techpanda.org/index.php/customer/account/create/");
    }
        
    @Test()
    public void TC_02_Title() throws Exception {
        // Launch website
        String url = "https://live.techpanda.org/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);

        WebElement MyaccountBtn = driver.findElement(By.xpath("(//a[@title='My Account'])[2]"));
        MyaccountBtn.click();

        Assert.assertEquals(driver.getTitle(), "Customer Login");

        WebElement CreateanAccountBtn = driver.findElement(By.xpath("//a[@title='Create an Account']"));
        CreateanAccountBtn.click();

        Assert.assertEquals(driver.getTitle(), "Create New Customer Account");
    }

    @Test()
    public void TC_03_Navigate() throws Exception {
        String url = "https://live.techpanda.org/";
        driver.get(url);

        WebElement MyaccountBtn = driver.findElement(By.xpath("(//a[@title='My Account'])[2]"));
        MyaccountBtn.click();

        WebElement CreateanAccountBtn = driver.findElement(By.xpath("//a[@title='Create an Account']"));
        CreateanAccountBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://live.techpanda.org/index.php/customer/account/create/");

        driver.navigate().back();
        Assert.assertEquals(driver.getCurrentUrl(), "https://live.techpanda.org/index.php/customer/account/login/");
        
        driver.navigate().forward();
        Assert.assertEquals(driver.getTitle(), "Create New Customer Account");



    }

    @Test()
    public void TC_04_PageSource() throws Exception {
        // Launch website
        String url = "https://live.techpanda.org/";
        driver.get(url);

        WebElement MyaccountBtn = driver.findElement(By.xpath("(//a[@title='My Account'])[2]"));
        MyaccountBtn.click();

        Assert.assertTrue(driver.getPageSource().contains("Login or Create an Account"));

    }

    public boolean isElementDisplayed(By by) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
        } catch (Exception e) {
            return false;// TODO: handle exception
        }
    }
}