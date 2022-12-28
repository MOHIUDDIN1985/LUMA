package TestLUMA;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.LUMA.BasePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestPageLuma extends BasePage {
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public void Bc() {
		report = new ExtentReports("Report/"+"ExtentReportResults.html");
		test = report.startTest("TestLUMA");

		setup();
		}
	@Test
	public void test1() {
		openBrowser();
		test.log(LogStatus.PASS,"Test 1 Passed");
}
	@Test
	public void test2() {
		Hm.selectProduct();
		test.log(LogStatus.PASS,"Test 2 Passed");

	}
    @Test
    public void test3() throws InterruptedException {
    	scroll();
    	cl1.echoPant();
		test.log(LogStatus.PASS,"Test 3 Passed");

    }
    @Test
    public void test4() throws InterruptedException {
    	ef.selectSize(29);
    	ef.selectColor("blue");
		test.log(LogStatus.PASS,"Test 4 Passed");

    }
    @Test
    public void test5() throws InterruptedException {
    	ef.selectQuantity();
		test.log(LogStatus.PASS,"Test 5 Passed");

    }
    @Test
    public void test6() throws InterruptedException {
    	ef.addCart();
		test.log(LogStatus.PASS,"Test 6 Passed");

    }
    @Test
    public void test7() throws InterruptedException {
    	ef.clickOnCart();
    	ef.proceedToChkOut();
		test.log(LogStatus.PASS,"Test 7 Passed");

    }
    @Test
    public void test8() throws InterruptedException {
    	cout.CheckOut("kh@gmail.com","Mphi","khan","IT","1123 Bronx","NY","11435","9876578567");
		test.log(LogStatus.PASS,"Test 8 Passed");

    }
    
    
	@AfterClass
	public void CB() throws InterruptedException {
		closeBrowser();
		report.endTest(test);
		report.flush();

	}

}
