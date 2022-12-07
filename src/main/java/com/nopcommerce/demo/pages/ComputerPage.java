package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    By desktop = By.xpath("//h2[@class='title']//a");
    By nameZtoA = By.name("products-orderby");
    By verifyProductsArranged = By.className("product-title");
    By addToCartButton = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By buildYourOwnComTxt = By.xpath("//h1[text()='Build your own computer']");
    By dualCoreFunctionality = By.name("product_attribute_1");
    By gbRamFunctionality = By.name("product_attribute_2");
    By hDDRadio = By.xpath("//label[@for='product_attribute_3_7']");
    By vistaPremium = By.xpath("//input[@id='product_attribute_4_9']");
    By microsoftOffice = By.xpath("//input[@id='product_attribute_5_12']");
    By priceText = By.xpath("//span[text()='$1,475.00']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By productAddedToYourCartTxt = By.xpath("//p[@class='content']");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By shoppingCartTxr = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quntityField = By.xpath("//input[@value='1']");
    By updateCart = By.xpath("//button[@id='updatecart']");
    By totalText = By.xpath("//tbody/tr[4]/td[2]");
    By checkboxButton = By.xpath("//input[@id='termsofservice']");
    By checkOut = By.xpath("//button[@id='checkout']");
    By welcomeSignInText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')");
    By checkoutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By firstNameField = By.name("BillingNewAddress.FirstName");
    By lastNameField = By.name("BillingNewAddress.LastName");
    By emailIdFiedl = By.id("BillingNewAddress_Email");
    By counrtyNameField = By.name("BillingNewAddress.CountryId");
    By cityNameFiled = By.name("BillingNewAddress.City");
    By addressField = By.name("BillingNewAddress.Address1");
    By postcodeField = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By continueButton1 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    By nextDayRadioButton = By.xpath("//label[contains(text(),'Next Day Air ($0.00)')]");
    By continue2 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    By creditCard = By.xpath("//input[@id='paymentmethod_1']");
    By selectCreditCard1 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    By creditCardType = By.xpath("//select[@id='CreditCardType']");
    By mastercardTye = By.xpath("//option[contains(text(),'Master card')]");
    By cardHolderName = By.name("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonth = By.id("ExpireMonth");
    By expireYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continue3 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    By paymentMethodText = By.xpath("//li[@class='payment-method']");
    By shippingMethodText = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]");
    By totalpriceText2 = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By thankyouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By sucessfullMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continue5 = By.xpath("//button[contains(text(),'Continue')]");
    By wecometoOurSotreTexy = By.xpath("//h2[contains(text(),'Welcome to our store')]");


    // 1.2	Click on Desktop
    public void clickonDesktop() {
        clickOnElement(desktop);
    }

    //1.4 Verify the Product will arrange in Descending order.
    public void productname() {
        List<WebElement> products = driver.findElements(By.xpath("//option[contains(text(),'Name: Z to A')]"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
    }

    //1.3	Select Sort By position "Name: Z to A"
    public void sortByPositionZtoA() {
        selectByValueFromDropDown(nameZtoA, "6");

    }

    //1.4 Verify the Product will arrange in Descending order.
    public void productnameZtoA() {
        List<WebElement> products = driver.findElements(By.xpath("//option[contains(text(),'Name: Z to A')]"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }

        System.out.println(afterSortByZToAProductsName);
    }

    //2.3	Select Sort By
    //2.4	position "Name: A to Z"
    public void sortByPositionAtoZ() {
        selectByValueFromDropDown(nameZtoA, "5");

    }
    //  2.5	Click on "Add To Cart"
    public void clickOnAddToCart() {
        try {
            clickOnElement(addToCartButton);
        } catch (
                StaleElementReferenceException e) {
            clickOnElement(addToCartButton);
        }
    }

    // 2.5 Verify the Text "Build your own computer"
    public String verifyBuildyourowncomputerText() {
        return getTextFromElement(buildYourOwnComTxt);
    }

    //2.6	Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    public void selectDualCoreE2200() {
        selectByVisibleTextFromDropDown(dualCoreFunctionality, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    //2.7.Select "8GB [+$60.00]" using Select class.
    public void select8GbFunctionality() {
        selectByVisibleTextFromDropDown(gbRamFunctionality, "8GB [+$60.00]");
    }

    //2.8	Select HDD radio "400 GB [+$100.00]"2.8	Select HDD radio "400 GB [+$100.00]"
    public void selectHddRadioOption() {
        clickOnElement(hDDRadio);
    }

    // 2.9	Select OS radio "Vista Premium [+$60.00]"
    public void selectVistaPremiumOption() {
        clickOnElement(vistaPremium);
    }

    // 2.10	Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    public void clickonMicrosoftOfficeOption() {
        clickOnElement(microsoftOffice);
    }

    // 2.11	Verify the price "$1,475.00"
    public String verifyPriceText() {
        return getTextFromElement(priceText);
    }

    // 2.12 Click on "ADD TO CARD" Button.
    public void clickonAddtoCardButton() {
        clickOnElement(addToCart);
    }

    //2.13	Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
    public String verifyProcductAddedToCart() {
        return getTextFromElement(productAddedToYourCartTxt);
    }

    // 2.14	Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void mouseHoverOnShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        WebElement shopping = driver.findElement(shoppingCart);
        WebElement goToCard = driver.findElement(goToCart);
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(shopping).moveToElement(goToCard).click().build().perform();
    }
    public void mouseHoverOnGoToCart() {
        clickOnElement(shoppingCart);
    }

    //2.15 verify the message'Shopping cart'.
    public String verifyMessageShoppingCart() {
        return getTextFromElement(shoppingCartTxr);
    }

    //2.16	Change the Qty to "2" and Click on "Update shopping cart"
    public void ChangeQuntity() {
        Actions actions2 = new Actions(driver);
        WebElement quntity = driver.findElement(quntityField);
        quntity.clear();
        sendTextToElement(quntityField, "2");
        clickOnElement(updateCart);
    }

    //2.17	Verify the Total"$2,950.00"
    public String verifyTotalPriceText() {
        return getTextFromElement(totalText);
    }

    // 2.18	click on checkbox “I agree with the terms of service”
    public void clickOnCheckBoxTick() {
        clickOnElement(checkboxButton);
    }

    // 2.19	Click on “CHECKOUT”
    public void clickOnCheckOutButton() {
        clickOnElement(checkOut);
    }

    //2.20	Verify the Text “Welcome, Please Sign In!”
    public String verifyWelcomSignInText() {
        return getTextFromElement(welcomeSignInText);
    }

    // 2.21 Click on “CHECKOUT AS GUEST” Tab
    public void clickOnCheckOutAsGuestButton() {
        clickOnElement(checkoutAsGuest);
    }

    //2.22	Fill the all mandatory field
    public void sendTextTomandatoryfield() {
        sendTextToElement(firstNameField, "pradip");
        sendTextToElement(lastNameField, "kakakdiiaa");
        sendTextToElement(emailIdFiedl, "pradipkaka1882@gmail.com");
        sendTextToElement(counrtyNameField, "India");
        sendTextToElement(cityNameFiled, "Delhi");
        sendTextToElement(addressField, "49,Maninagar");
        sendTextToElement(postcodeField, "395020");
        sendTextToElement(phoneNumber, "077425250145");
    }

    //2.23	Click on “CONTINUE”
    public void clickOnCountinueButton1() {
        clickOnElement(continueButton1);
    }

    //2.24	Click on Radio Button “Next Day Air($0.00)”
    public void clickOnNextDayButton() {
        clickOnElement(nextDayRadioButton);
    }

    // 2.25	Click on “CONTINUE”
    public void clickOnCountinueButton2() {
        clickOnElement(continue2);
    }

    // 2.26	Select Radio Button “Credit Card”
    public void clickOnCreditCardRadioButton() {
        clickOnElement(creditCard);
    }

    public void selectcreditCardRadioButton2() {
        clickOnElement(selectCreditCard1);
    }

    //2.27	Select “Master card” From Select credit card dropdown
    public void clickOnCreditCardfromTheOption() {
        clickOnElement(creditCardType);
    }

    public void selectMasterCardTye() {
        clickOnElement(mastercardTye);
    }

    //2.28 Fill all the details
    public void sendTxtToCrdHolderName() {
        sendTextToElement(cardHolderName, "prime Testing");
    }

    public void sendTxtToCardNumber() {
        sendTextToElement(cardNumber, "6764032004359978");
    }

    public void sendTxtToExpireMonth() {
        sendTextToElement(expireMonth, "11");
    }

    public void sendTxtToExpireYearr() {
        sendTextToElement(expireYear, "2025");
    }

    public void sendTxtToCardCodeCvv() {
        sendTextToElement(cardCode, "9132");
    }

    //2.29Click on “CONTINUE”
    public void clickOnContinue3() {
        clickOnElement(continue3);
    }

    // 2.30Verify “Payment Method” is “Credit Card”
    public String verifyPaymentMethodCreditCar() {
        return getTextFromElement(paymentMethodText);
    }

    //Verify “Shipping Method” is “Next Day Air”
    public String verifyShippingMethodText() {
        return getTextFromElement(shippingMethodText);
    }

    public String verifyPricetext2() {
        return getTextFromElement(totalpriceText2);
    }

    //2.34	Click on “CONFIRM”
    public void clickOnConfirmButton4() {
        clickOnElement(confirmButton);
    }

    //2.35 Verify the Text “Thank You”
    public String verifyThankyouText() {
        return getTextFromElement(thankyouText);
    }

    // 2.36Verify the message “Your order has been successfully processed!”
    public String verifyYourOrderProcced() {
        return getTextFromElement(sucessfullMessage);
    }

    //2.37	Click on “CONTINUE”
    public void clickonFinalContinue() {
        clickOnElement(continue5);
    }

    //2.37 Verify the text “Welcome to our store”
    public String verifyWelcomtoOurStore() {
        return getTextFromElement(wecometoOurSotreTexy);
    }

}
