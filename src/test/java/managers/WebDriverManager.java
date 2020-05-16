package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverManager {

    private WebDriver driver;

    public WebDriverManager(String browserType) {

        switch (browserType.toLowerCase()){

            case "chrome":
                chromeDriverSetUp(); break;
            case "firefox":
                firefoxDriverSetUp(); break;
            case "ie":
                ieDriverSetUp(); break;
            case "edge":
                edgeDriverSetUp(); break;
            default:
                System.out.println("Unknown browser " + browserType);
                System.out.println("Tests will be executed in default browser chrome");
                chromeDriverSetUp(); break;
        }

    }

    private void chromeDriverSetUp(){
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    private void firefoxDriverSetUp(){
        io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    private void edgeDriverSetUp(){
        io.github.bonigarcia.wdm.WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    private void ieDriverSetUp(){
        io.github.bonigarcia.wdm.WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public void quitDriver() {
        driver.quit();
    }
}
