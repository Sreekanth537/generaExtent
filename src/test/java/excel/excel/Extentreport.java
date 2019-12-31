package excel.excel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class Extentreport {
	@Test
	public void ExtentReportdemo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		System.out.println("NAvigating to redbus application");
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/learnautomation.html");
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Ligin to the application");
		logger.log(Status.INFO, "login to amazon");
		logger.log(Status.PASS, "title verified");
		extent.flush();
	}

}
