package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PensionCalcStepTwoPO extends BasePO {


    @FindBy (css = "#initialSalary")
    private WebElement initialSalaryInput;

    @FindBy (css = "#currentSalary")
    private WebElement currentSalaryInput;

    @FindBy (css = "[type='submit']")
    private WebElement showPensionButton;

    public PensionCalcStepTwoPO(WebDriver driver) {
        super(driver);
        ownUrl ="https://kalkulator-emerytalny.aviva.pl/kalkulator/step2";
    }

    public void setInitialSalary(String initialSalary){
        initialSalaryInput.sendKeys(initialSalary);
    }

    public void setCurrentSalaryInput(String currentSalary){
        currentSalaryInput.sendKeys(currentSalary);
    }

    public void goToShowFuturePension(){
        showPensionButton.click();
        wait.until(ExpectedConditions.urlToBe("https://kalkulator-emerytalny.aviva.pl/kalkulator/step3"));
    }
}
