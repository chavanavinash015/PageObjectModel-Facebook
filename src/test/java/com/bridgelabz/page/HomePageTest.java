package com.bridgelabz.page;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;
import page.ProfilePage;

public class HomePageTest extends BaseClass {

    LoginPage loginPage;
    HomePage homePage;
    ProfilePage profilePage;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        loginPage = new LoginPage();
        homePage = loginPage.login("8459827577", "Avinash@015");
    }

    @Test
    public void verifyHomePageTitleTest() {
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Facebook");
    }

    @Test
    public void gotoProfileTest() {
        profilePage = homePage.gotoProfile();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
