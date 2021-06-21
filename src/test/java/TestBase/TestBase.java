package TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-extensions");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 15);

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}