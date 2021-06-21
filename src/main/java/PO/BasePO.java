package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePO {

    protected WebDriver driver;
    protected String ownUrl;
    protected WebDriverWait wait;

    public void openMe(){
        driver.get(ownUrl);
    }

    public BasePO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

}