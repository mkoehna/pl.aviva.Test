package PensionCalc;

import PO.PensionCalcStepOnePO;
import PO.PensionCalcStepThreePO;
import PO.PensionCalcStepTwoPO;
import TestBase.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class PensionCalcTest extends TestBase {

    @Test
    public void PensionCalcDataChecker(){
        String birthYear = "1986";
        String workStartYear = "2010";
        String initialSalary = "3000";
        String currentSalary = "6000";

        PensionCalcStepOnePO pensionCalcStepOnePO = new PensionCalcStepOnePO(driver);
        pensionCalcStepOnePO.openMe();
        pensionCalcStepOnePO.setSexFemale();
        pensionCalcStepOnePO.setBirthYear(birthYear);
        pensionCalcStepOnePO.setWorkStartYear(workStartYear);
        pensionCalcStepOnePO.goToStepTwo();
        PensionCalcStepTwoPO pensionCalcStepTwoPO = new PensionCalcStepTwoPO(driver);
        pensionCalcStepTwoPO.setInitialSalary(initialSalary);
        pensionCalcStepTwoPO.setCurrentSalaryInput(currentSalary);
        pensionCalcStepTwoPO.goToShowFuturePension();
        PensionCalcStepThreePO pensionCalcStepThreePO = new PensionCalcStepThreePO(driver);
        Assert.assertEquals(pensionCalcStepThreePO.getBirthYearGiven(), birthYear);
        Assert.assertEquals(pensionCalcStepThreePO.getWorkStartYearGiven(), workStartYear);
        Assert.assertEquals(pensionCalcStepThreePO.getInitialSalaryGiven(), initialSalary);
        Assert.assertEquals(pensionCalcStepThreePO.getCurrentSalaryGiven(), currentSalary);


    }

}
