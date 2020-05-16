package tests;

import Config.appConfig;
import common.TestContext;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class HotelSearchSteps {

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;

    public HotelSearchSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getWebDriverManager().getDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

    }

    @Given("^Home Page is loaded$")
    public void homePageLoaded() {
        driver.get(appConfig.url);
        Assert.assertEquals(homePage.getHotelTab().isDisplayed(), true, "Validation of homepage");
    }

    @Given("^Search for a hotel$")
    public void searchHotel() throws InterruptedException {
        homePage.getHotelTab().click();
        homePage.getDestination().click();
        homePage.getDestination().sendKeys("San Francisco");
        Thread.sleep(5000);
        homePage.getSelectDestination().click();
        homePage.getCheckin().clear();
        homePage.getCheckin().sendKeys("");
        homePage.getCheckinCalender().click();
        homePage.getCheckout().clear();
        homePage.getCheckout().sendKeys("");
        homePage.getCheckoutCalender().click();
        homePage.getSearch().click();
    }
}
