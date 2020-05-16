package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    /////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////// Constructor /////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////// Web Elements ////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//a[@data-name='hotels']")
    private WebElement hotelTab;

    @FindBy(xpath = "(//a[@class='select2-choice'])[1]")
    private WebElement destination;

    @FindBy(xpath = "(//div[@class = 'select2-result-label'])[2]")
    private WebElement selectDestination;

    @FindBy(xpath = "(//label[text()='Check in']/following-sibling::div)[2]//i[@class='bx bx-calendar']")
    private WebElement checkinCalender;

    @FindBy(xpath = "(//label[text()='Check out']/following-sibling::div)[2]//i[@class='bx bx-calendar']")
    private WebElement checkoutCalender;

    @FindBy(id = "checkin")
    private WebElement checkin;

    @FindBy(id = "checkout")
    private WebElement checkout;

    @FindBy(xpath = "(//button[@class = 'btn btn-primary btn-block' and contains(text(),'Search')])[1]")
    private WebElement search;

    @FindBy(xpath = "//*[@id = 'dropdownCurrency']/i")
    private WebElement myAccount;

    @FindBy(xpath = "//a[text()='Sign Up']")
    private WebElement signUp;

    /////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////// Getters /////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////
    public WebElement getHotelTab() {return hotelTab;}

    public WebElement getDestination() {return destination;}

    public WebElement getSelectDestination() {return selectDestination;}

    public WebElement getCheckinCalender() {return checkinCalender;}

    public WebElement getCheckoutCalender() {return checkoutCalender;}

    public WebElement getCheckin() {return checkin;}

    public WebElement getCheckout() {return checkout;}

    public WebElement getSearch() {return search;}

    public WebElement getMyAccount() {return myAccount;}

    public WebElement getSignUp() {return signUp;}

}
