package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends BaseTest {
    ComputerPage computerPage = new ComputerPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        homePage.clickOnComputer();
        computerPage.clickonDesktop();
        computerPage.productname();
        computerPage.sortByPositionZtoA();
        computerPage.productnameZtoA();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputer();
        computerPage.clickonDesktop();
        computerPage.sortByPositionAtoZ();
        computerPage.clickOnAddToCart();
        Assert.assertEquals(computerPage.verifyBuildyourowncomputerText(), "Build your own computer", "text verified");
        computerPage.selectDualCoreE2200();
        computerPage.select8GbFunctionality();
        computerPage.selectHddRadioOption();
        computerPage.selectVistaPremiumOption();
        computerPage.clickonMicrosoftOfficeOption();
        Assert.assertEquals(computerPage.verifyPriceText(), "$1,475.00", "text verified");
        computerPage.clickonAddtoCardButton();
        Assert.assertEquals(computerPage.verifyProcductAddedToCart(), "The product has been added to your shopping cart", "text verified");
        //computerPage.mouseHoverOnShoppingCart();
        computerPage.mouseHoverOnGoToCart();
        Assert.assertEquals(computerPage.verifyMessageShoppingCart(), "Shopping cart", "text verified");
        computerPage.ChangeQuntity();
        Assert.assertEquals(computerPage.verifyTotalPriceText(), "$2,950.00", "text verified");
        computerPage.clickOnCheckBoxTick();
        computerPage.clickOnCheckOutButton();
        // Assert.assertEquals(computerPage.verifyWelcomSignInText(),"Welcome, Please Sign In!","text verified");
        computerPage.clickOnCheckOutAsGuestButton();
        computerPage.sendTextTomandatoryfield();
        computerPage.clickOnCountinueButton1();
        computerPage.clickOnNextDayButton();
        computerPage.clickOnCountinueButton2();
        computerPage.clickOnCreditCardRadioButton();
        computerPage.selectcreditCardRadioButton2();
        computerPage.clickOnCreditCardfromTheOption();
        computerPage.selectMasterCardTye();
        computerPage.sendTxtToCrdHolderName();
        computerPage.sendTxtToCardNumber();
        computerPage.sendTxtToExpireMonth();
        computerPage.sendTxtToExpireYearr();
        computerPage.sendTxtToCardCodeCvv();
        computerPage.clickOnContinue3();
        Assert.assertEquals(computerPage.verifyPaymentMethodCreditCar(), "Payment Method: Credit Card", "text verified");
        Assert.assertEquals(computerPage.verifyShippingMethodText(), "Shipping Method: Next Day Air", "text verified");
        Assert.assertEquals(computerPage.verifyPricetext2(), "$2,950.00", "text verified");
        computerPage.clickOnConfirmButton4();
        Assert.assertEquals(computerPage.verifyThankyouText(), "Thank you", "text verified");
        Assert.assertEquals(computerPage.verifyYourOrderProcced(), "Your order has been successfully processed!", "text verified");
        computerPage.clickonFinalContinue();
        Assert.assertEquals(computerPage.verifyWelcomtoOurStore(), "Welcome to our store", "text verified");

    }


}
