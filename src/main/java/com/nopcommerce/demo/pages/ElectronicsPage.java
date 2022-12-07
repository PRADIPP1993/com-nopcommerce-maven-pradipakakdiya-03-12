package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElectronicsPage extends Utility {
    By cellPhones = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]");

    By cellphonesText = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listViewclick = By.xpath("//a[contains(text(),'List')]");
    By nonokiaProduct = By.xpath("//a[text()='Nokia Lumia 1020']");
    By priceText = By.xpath("//span[@id='price-value-20']");
    By changQnty = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addtoCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By addtoCartText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By ShoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By priceText1 = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    By agreeButton = By.xpath("//input[@id='termsofservice']");
    By chekoutButton = By.xpath("//button[@id='checkout']");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By registerButton = By.xpath("//button[contains(text(),'Register')]");
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By firstName = By.name("FirstName");
    By lastNmae = By.name("LastName");
    By emailId = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton1 = By.xpath("//button[@id='register-button']");
    By registerText1 = By.xpath("//div[contains(text(),'Your registration completed')]");
    By onContinueTab = By.xpath("//a[contains(text(),'Continue')]");
    By iagreebutton = By.xpath("//input[@id='termsofservice']");
    By checkOut2 = By.xpath("//button[@id='checkout']");
    By countryNmae = By.name("BillingNewAddress.CountryId");
    By city = By.name("BillingNewAddress.City");
    By address = By.name("BillingNewAddress.Address1");
    By postOcde = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By continue3 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");

    By radiosecondDay = By.xpath("//input[@id='shippingoption_2']");
    By continue4 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    By paymentMethod = By.xpath("//input[@id='paymentmethod_1']");
    By creditCardMethod = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    By visa = By.xpath("(//select[@id='CreditCardType'])[1]");
    By cardHolderNameNokia = By.xpath("//input[@id='CardholderName']");
    By cardNumberNokia = By.xpath("//input[@id='CardNumber']");
    By expiryMonthNokia = By.xpath("//select[@id='ExpireMonth']");
    By expiryYearNokia = By.xpath("//select[@id='ExpireYear']");
    By cardCodeNokia = By.xpath("//input[@id='CardCode']");
    By continueCheckoutNokia = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    By creditCaedText = By.xpath("//span[contains(text(),'Credit Card')]");
    By ShippingMethodText = By.xpath("//span[contains(text(),'Shipping Method:')]");
    By confrimClick = By.xpath("//button[contains(text(),'Confirm')]");
    By thankyouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By yourOrderSucessfullText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continue5 = By.xpath("//button[contains(text(),'Continue')]");
    By welcometoOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logoutLink2 = By.xpath("//a[@class='ico-logout']");

    //1.1//2.1 Mouse Hover on “Cell phones” and click
    public void mouseHoverOnCellPhone() {
        mouseHoverToElementAndClick(cellPhones);
    }

    public void clickonCellPhonesoptestin() {
        clickOnElement(cellPhones);
    }

    //2.3	Verify the text “Cell phones”
    public String verifytextCellPhones() {
        return getTextFromElement(cellphonesText);
    }

    //2.4	Click on List View Tab
    public void clickOnlistView() {
        clickOnElement(listViewclick);
    }

    //2.5	Click on product name “Nokia Lumia 1020” link
    public void clickOnNokia() {
        try {
            clickOnElement(nonokiaProduct);

        } catch (StaleElementReferenceException ignored) {

        }
        clickOnElement(nonokiaProduct);
    }

    //2.7 Verify the price “$349.00”
    public String verifytextofPrice() {
        return getTextFromElement(priceText);
    }

    //2.8 Change quantity to 2
    public void SendTexttochangeQuntity() {
        Actions actions1 = new Actions(driver);
        WebElement quntity = driver.findElement(changQnty);
        quntity.clear();
        sendTextToElement(changQnty, "2");
    }

    //2.9Click on “ADD TO CART” tab
    public void clickOnAddtoCart() {
        clickOnElement(addtoCart);
    }

    //2.10	Verify the Message "The product has been added to your shopping cart" on Top green Bar
    public String verifytextProdutAddedToCart() {
        return getTextFromElement(addtoCartText);
    }

    public void clickOnCloseTheBar() {
        clickOnElement(closeBar);
    }

    //2.11	Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void mousehpveronShopingCart() {
        mouseHoverToElementAndClick(shoppingCart);
    }

    public void mouseHvoerOngoToCart() {
        clickOnElement(goToCart);
    }

    //2.12 Verify the message "Shopping cart"
    public String verifyShoppingcartText() {
        return getTextFromElement(ShoppingCartText);
    }

    //2.14 Verify the Total $698.00
    public String verifyPriceText() {
        return getTextFromElement(priceText1);
    }

    //2.15	click on checkbox “I agree with the terms of service”
    public void clickOnAgreeTermsandServicesr() {
        clickOnElement(agreeButton);
    }

    //2.16 Click on “CHECKOUT”
    public void clickOnChekout() {//2.16
        clickOnElement(chekoutButton);
    }

    //2.17	Verify the Text “Welcome, Please Sign In!”
    public String verifyWelcomeSignIn() {
        return getTextFromElement(welcomeText);
    }

    //2.18	Click on “REGISTER” tab
    public void clickOnRegister() {
        clickOnElement(registerButton);
    }

    //2.19	Verify the text “Register”
    public String verifyRegisterText() {
        return getTextFromElement(registerText);
    }

    //2.20	Fill the mandatory fields
    public void mandatoryfields() {
        sendTextToElement(firstName, "pradip");
        sendTextToElement(lastNmae, "kakadiya");
        sendTextToElement(emailId, "pradipkaka118522@gmail.com");
        sendTextToElement(password, "Pradip123");
        sendTextToElement(confirmPassword, "Pradip123");
    }

    //2.21 Click on “REGISTER” Button
    public void clickonRegisterButton1() {
        clickOnElement(registerButton1);
    }

    //2.22	Verify the message “Your registration completed”
    public String verifytextyourRegistrationcompleted() {
        return getTextFromElement(registerText1);
    }
    //2.23	Click on “CONTINUE” tab

    //2.24 Verify the text “Shopping card”
    public void clickonContinueButton1() {
        clickOnElement(onContinueTab);
    }

    //2.25 click on checkbox “I agree with the terms of service”
    public void clickonCheckBoxIagree() {
        clickOnElement(iagreebutton);
    }

    // /2.26Click on “CHECKOUT”
    public void clickonChekoutButton2() {
        clickOnElement(checkOut2);
    }

    //2.27	Fill the Mandatory fields
    public void enterCountryName() {
        sendTextToElement(countryNmae, "India");
    }

    public void enterCityName() {
        sendTextToElement(city, "surat");
    }

    public void enterResidanceAddress() {
        sendTextToElement(address, "111,xyz soc");
    }

    public void enterZipcodeofArea() {
        sendTextToElement(postOcde, "395010");
    }

    public void enterPhoneNumber() {
        sendTextToElement(phoneNumber, "07452541254");
    }

    // 2.28	Click on “CONTINUE”
    public void clickONContinue3() {
        clickOnElement(continue3);
    }

    //2.29	Click on Radio Button “2nd Day Air ($0.00)”
    public void clickOn2ndDayButton() {
        clickOnElement(radiosecondDay);
    }

    //2.30	Click on “CONTINUE”
    public void clickONContinue4() {
        clickOnElement(continue4);
    }

    //2.31	Select Radio Button “Credit Card
    public void clickOnPaymentMethodField() {
        clickOnElement(paymentMethod);
    }

    public void clickOnMethodCreditCard() {
        clickOnElement(creditCardMethod);
    }

    //2.33
    public void selectVisa() {
        selectByVisibleTextFromDropDown(visa, "Visa");
    }

    public void enterCardHolderNameNokia() {
        sendTextToElement(cardHolderNameNokia, "prime Testing");
    }

    public void enterCardNumberNokia() {
        sendTextToElement(cardNumberNokia, "4111111111111111");
    }

    public void enterExpiryMonthNokia() {
        sendTextToElement(expiryMonthNokia, "11");
    }

    public void enterExpiryYearNokia() {
        sendTextToElement(expiryYearNokia, "2025");
    }

    public void enterCardCodeNokia() {
        sendTextToElement(cardCodeNokia, "9132");
    }

    public void clickOnContinueCheckoutNokia() {
        clickOnElement(continueCheckoutNokia);
    }


    public String verifycreditCardMethod() {
        return getTextFromElement(creditCaedText);
    }

    //Verify “Shipping Method” is “2nd Day Air”
    public String verif2ndDayAirMethod() {
        return getTextFromElement(ShippingMethodText);
    }

    public void clickOnConfirmButton2() {
        clickOnElement(confrimClick);
    }

    //2.39	Verify the Text “Thank You”
    public String verifThankYouText() {
        return getTextFromElement(thankyouText);
    }

    //2.40	Verify the message “Your order has been successfully processed!”
    public String verifYourOrderSucessfullyPlaced() {
        return getTextFromElement(yourOrderSucessfullText);
    }

    //2.41	Click on “CONTINUE”
    public void clickOnContinueButton5() {
        clickOnElement(continue5);
    }

    //2.42	Verify the text “Welcome to our store”
    public String verifWelcomeToOurStorePage() {
        return getTextFromElement(welcometoOurStore);
    }

    //Click on “Logout” link
    public void clickOnLogOutLink2() {
        clickOnElement(logoutLink2);
    }
    //verify url:

    public String getUrl() {
        return driver.getCurrentUrl();
    }

}
