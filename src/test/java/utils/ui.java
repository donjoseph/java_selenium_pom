package utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.*;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

public class ui {

    public static void waitTillVisible(WebDriver driver,WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitFluently(WebDriver driver, WebElement element) {
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(StaleElementReferenceException.class);
    }

    public static void selectDropDown(WebDriver driver, WebElement dropdown, String selection) throws ClassNotFoundException, SQLException {
        Select select = new Select(dropdown);
        select.selectByValue(selection);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000);");

        Class.forName("oracle.jdbc.driver");
        Connection con = DriverManager.getConnection("","","");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("");

        ResultSetMetaData rsmeta = rs.getMetaData();

        while(rs.next()){
            rs.getString("label");
        }





    }

}
