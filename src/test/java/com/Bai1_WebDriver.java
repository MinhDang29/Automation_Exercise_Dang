package com;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import com.utils.BasicTest;

public class Bai1_WebDriver extends BasicTest {
    @Test()
    public void loginTestSuccess() throws Exception {
        // Launch website
        String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
        driver.get(url);
        
        // đóng tab
        driver.close();

        // tìm element
        driver.findElement(By.xpath(url));

        // url hiện tại
        driver.getCurrentUrl();

        //lấy toàn bộ source code
        driver.getPageSource();
        Assert.assertTrue(driver.getPageSource().contains("Hello World"));// chỉ so sánh tương đối

        //tr về id của  tab hoặc cửa  sổ hiện tại dang active
        driver.getWindowHandle();

        // trả  về id của tất cả tab hoặc cửa sổ đang mở
        driver.getWindowHandles();

        //tite của trang hiện tại
        driver.getTitle();

        // hàm manage cửa sổ
        driver.manage().window().maximize();

        // timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // lấy cookie
        driver.manage().getCookies();

        // switch to
        driver.switchTo().alert();

        // switch to
        driver.switchTo().window(" ");

        // switch to
        driver.switchTo().frame(" ");

        // đóng driver
        driver.quit();





    }
}