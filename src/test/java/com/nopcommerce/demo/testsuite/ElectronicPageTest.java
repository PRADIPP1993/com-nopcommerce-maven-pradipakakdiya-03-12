package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicPageTest extends BaseTest {
    ElectronicsPage electronicsPage = new ElectronicsPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        homePage.clickOnElectronic();
        electronicsPage.mouseHoverOnCellPhone();
        electronicsPage.verifytextCellPhones();

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.clickOnElectronic();
        electronicsPage.clickonCellPhonesoptestin();
        electronicsPage.verifytextCellPhones();
        electronicsPage.clickOnlistView();
        electronicsPage.clickOnNokia();
        electronicsPage.verifytextofPrice();
        electronicsPage.SendTexttochangeQuntity();
        electronicsPage.clickOnAddtoCart();
        Assert.assertEquals(electronicsPage.verifytextProdutAddedToCart(), "The product has been added to your shopping cart", "text verified");
        electronicsPage.clickOnCloseTheBar();
        electronicsPage.mousehpveronShopingCart();
        electronicsPage.mouseHvoerOngoToCart();
        Assert.assertEquals(electronicsPage.verifyShoppingcartText(), "Shopping cart", "text verified");
        Assert.assertEquals(electronicsPage.verifyPriceText(), "$698.00", "text verified");
        electronicsPage.clickOnAgreeTermsandServicesr();
        electronicsPage.clickOnChekout();
        Assert.assertEquals(electronicsPage.verifyWelcomeSignIn(), "Welcome, Please Sign In!", "text verified");
        electronicsPage.clickOnRegister();
        Assert.assertEquals(electronicsPage.verifyRegisterText(), "Register", "text verified");
        electronicsPage.mandatoryfields();
        electronicsPage.clickonRegisterButton1();
        electronicsPage.verifytextyourRegistrationcompleted();
        electronicsPage.clickonContinueButton1();
        electronicsPage.clickonCheckBoxIagree();
        electronicsPage.clickonChekoutButton2();
        electronicsPage.enterCountryName();
        electronicsPage.enterCityName();
        electronicsPage.enterResidanceAddress();
        electronicsPage.enterZipcodeofArea();
        electronicsPage.enterPhoneNumber();
        electronicsPage.clickONContinue3();
        electronicsPage.clickOn2ndDayButton();
        electronicsPage.clickONContinue4();
        electronicsPage.clickOnPaymentMethodField();
        electronicsPage.clickOnMethodCreditCard();
        electronicsPage.selectVisa();
        Thread.sleep(1000);
        //2.33 Fill all the details
        electronicsPage.enterCardHolderNameNokia();
        electronicsPage.enterCardNumberNokia();
        electronicsPage.enterExpiryMonthNokia();
        electronicsPage.enterExpiryMonthNokia();
        electronicsPage.enterExpiryYearNokia();
        electronicsPage.enterCardCodeNokia();
        Thread.sleep(1000);
        electronicsPage.clickOnContinueCheckoutNokia();
        Assert.assertEquals(electronicsPage.verif2ndDayAirMethod(), "Shipping Method:", "text verified");
        electronicsPage.clickOnConfirmButton2();
        Assert.assertEquals(electronicsPage.verifThankYouText(), "Thank you", "text verified");
        Thread.sleep(1000);
        Assert.assertEquals(electronicsPage.verifYourOrderSucessfullyPlaced(), "Your order has been successfully processed!", "text verified");
        electronicsPage.clickOnContinueButton5();
        Thread.sleep(1000);
        Assert.assertEquals(electronicsPage.verifWelcomeToOurStorePage(), "Welcome to our store", "text verified");
        electronicsPage.clickOnLogOutLink2();
        Assert.assertEquals(electronicsPage.getUrl(), "https://demo.nopcommerce.com/");


    }
}
