package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PensionCalcStepOnePO extends BasePO {

    @FindBy (css = "#sexFemale + .a-radio__label")
    private WebElement sexFemale;

    @FindBy (css = "#sexMale .a-radio__label")
    private WebElement sexMale;

    @FindBy (css = "#birthYear")
    private WebElement birthYearInput;

    @FindBy (css = "#workStartYear")
    private WebElement workStartYearInput;

    @FindBy (css = "[type='submit']")
    private WebElement submitButton;

    public PensionCalcStepOnePO(WebDriver driver) {
        super(driver);
        ownUrl ="https://kalkulator-emerytalny.aviva.pl/kalkulator/step1";
    }

    public void setSexFemale(){
        wait.until(ExpectedConditions.visibilityOf(sexFemale));
        sexFemale.click();
    }

    public void setSexMale(){
        wait.until(ExpectedConditions.visibilityOf(sexMale));
        sexMale.click();
    }

    public void setBirthYear(String birthYear){
        wait.until(ExpectedConditions.visibilityOf(birthYearInput));
        birthYearInput.sendKeys(birthYear);
    }

    public void setWorkStartYear(String workStartYear){
        workStartYearInput.sendKeys(workStartYear);
    }

    public void goToStepTwo(){
        submitButton.click();
        wait.until(ExpectedConditions.urlToBe("https://kalkulator-emerytalny.aviva.pl/kalkulator/step2"));
    }
}
