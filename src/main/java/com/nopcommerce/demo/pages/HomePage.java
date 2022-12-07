package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //1.3. create the @Test method name verifyPageNavigation.use selectMenu method to select the Menu and click on it and verify the page navigation.

    public void clickOnComputer() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a[1]"));
    }
    public void clickOnElectronic() {
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a"));
    }
    public void clickOnAppearals() {
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a"));
    }
    public void clickOndigitalDownload() {
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a"));
    }
    public void clickOnbooks() {
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a"));
    }
    public void clickOnJewelary() {
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[6]/a"));
    }
    public void clickOnGiftCard() {
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[7]/a"));
    }
}












