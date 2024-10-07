package selenium_firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class SeleniumFirefox {
    public static void main(String[] args) {
        //F:\IntellijProject\p2.amazon.WithFirefox\src\main\resources\geckodriver.exe
        String path =System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator
                +"geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",path);
        WebDriver webDriver= new FirefoxDriver();
        webDriver.get("https://www.amazon.com/");
    }
}
