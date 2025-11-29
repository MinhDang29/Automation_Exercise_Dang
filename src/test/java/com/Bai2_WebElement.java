package com;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.testng.annotations.Test;


import com.utils.BasicTest;

public class Bai2_WebElement extends BasicTest {
    @Test()
    public void loginTestSuccess() throws Exception {
      
        //tìm element
        driver.findElement(By.xpath(" "));
        
        // xuất hiện btn kiểm tra endable hoặc disable
        driver.findElement(By.xpath(" ")).isEnabled();

        // kiểm tra dữ  liệu hiển thị
        Assert.assertTrue(driver.findElement(By.xpath(" ")).isDisplayed());

        // kiểm tra dữ  liệu hiển thị sai
        Assert.assertFalse(driver.findElement(By.xpath(" ")).isDisplayed());

        // kieemrtra  mong đợi
        Assert.assertEquals(driver.findElement(By.xpath(" ")).getText(), " ");

        // hiển thị hay không  hiển thị
        Assert.assertTrue(driver.findElement(By.xpath(" ")).isDisplayed());

        // kiểm tra 1 element  được chọn hay chưa checkbox, radio, dropdown
        driver.findElement(By.xpath(" ")).isSelected();

        // get text
        driver.findElement(By.xpath(" ")).getText();
        Assert.assertEquals(driver.findElement(By.xpath(" ")).getText(), " ");

        //lấy giá trị thuốc  tính html ví dụ chữ đã có sẵn trong ô textbox
        Assert.assertEquals(driver.findElement(By.xpath(" ")).getDomAttribute("value"), " "); 
        // lấy giá trị thuốc  tính DOM ví dụ mình nhập vào ô textbox
        driver.findElement(By.xpath(" ")).getDomProperty("value");

        // lấy giá trị css value ví dụ màu, background-color, font-size
        driver.findElement(By.xpath(" ")).getCssValue(" ");

        //rectangle vị trí của element
        Rectangle rect = driver.findElement(By.xpath(" ")).getRect();
        // rect.height();
        // rect.width();
    }
}