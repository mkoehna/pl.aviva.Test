package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PensionCalcStepThreePO extends BasePO {

    @FindBy (css = ".basic-data__header:first-of-type strong:first-of-type")
    private WebElement retirementYear;

    @FindBy (css = ".basic-data__header:first-of-type strong:last-of-type")
    private WebElement retirementAge;

    @FindBy (css = ".l-columns__column:first-of-type .personal-data__item:first-of-type")
    private WebElement sexGiven;

    @FindBy (css = ".l-columns__column:first-of-type .personal-data__item:nth-of-type(2)")
    private WebElement birthYearGiven;

    @FindBy (css = ".l-columns__column:first-of-type .personal-data__item:nth-of-type(3)")
    private WebElement workStartYearGiven;

    @FindBy (css = ".l-columns__column:last-of-type .personal-data__item:first-of-type")
    private WebElement initialSalaryGiven;

    @FindBy (css = ".l-columns__column:last-of-type .personal-data__item:last-of-type")
    private WebElement currentSalaryGiven;


    public PensionCalcStepThreePO(WebDriver driver) {
        super(driver);
    }

    public String getRetirementYear(){
        return retirementYear.getText().substring(0,4);
    }

    public String getRetirementAge(){
        return retirementAge.getText().substring(0,2);
    }

    public String getSexGiven(){
        return sexGiven.getText().substring(6);
    }

    public String getBirthYearGiven(){
        return birthYearGiven.getText().substring(15);
    }

    public String getWorkStartYearGiven(){
        return workStartYearGiven.getText().substring(23);
    }

    public String getInitialSalaryGiven(){
        return initialSalaryGiven.getText().substring(61,65);
    }

    public String getCurrentSalaryGiven(){
        return currentSalaryGiven.getText().substring(47,51);
    }


}
