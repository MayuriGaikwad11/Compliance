package companyadmin;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CompanyMethods {
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	

	
	public static void Reports( WebDriver driver,ExtentTest test) throws InterruptedException, IOException
	{		
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		Thread.sleep(3000);
		CompanyPOM.clickAdmin(driver).click();
		Set w = driver.getWindowHandles();    // window handles
		Thread.sleep(3000);
	      Iterator t = w.iterator();  // window handles iterate
	      String pw = (String) t.next();
	      String ch = (String) t.next();
	      
	      driver.switchTo().window(ch);         // switching child window
	  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[2]")));	//Wait until records table get visible.
//-------------------------------Statutory Assignment Report-------------------------------
	      action.moveToElement(CompanyPOM.clickReport(driver)).click().build().perform();
	      Thread.sleep(1000);
	      CompanyPOM.clickStatutoryAssi(driver).click();
	      		  	 Thread.sleep(2000);
	 	  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='BodyContent_grdEventCannedReport']")));	//Wait until records table get visible.

		  	CompanyPOM.clickExport(driver).click();
		  	 Thread.sleep(4000);
		  	test.log(LogStatus.PASS, "Statutory Assignment Report -Export Succefully");
		  	
		  //-------------------------------CheckList  Assignment Report-------------------------------
		  	Thread.sleep(1000);
		  	action.moveToElement(CompanyPOM.clickReport(driver)).click().build().perform();
		      Thread.sleep(1000);
		    CompanyPOM.clickCheckListAssi(driver).click();
		    Thread.sleep(4000);
		 // 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='BodyContent_grdEventCannedReport']")));	//Wait until records table get visible.
			  	 Thread.sleep(1000);
		 	CompanyPOM.clickExport(driver).click();
			  	 Thread.sleep(4000);
		 	test.log(LogStatus.PASS, "CheckList Assignment  Report -Export Succefully");
			  	
		 	 //-------------------------------EventBased  Assignment Report-------------------------------
		     action.moveToElement(CompanyPOM.clickReport(driver)).click().build().perform();
		      Thread.sleep(1000);
		    CompanyPOM.clickEventBasedAssi(driver).click();
		    Thread.sleep(4000);
		//  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='BodyContent_grdEventCannedReport']")));	//Wait until records table get visible.
			  	 Thread.sleep(1000);
		 	CompanyPOM.clickExport(driver).click();
			  	 Thread.sleep(4000);
		 	test.log(LogStatus.PASS, "EventBased Assignment  Report -Export Succefully");
			  	
		 	 //-------------------------------Internal  Assignment Report-------------------------------
		     action.moveToElement(CompanyPOM.clickReport(driver)).click().build().perform();
		      Thread.sleep(1000);
		    CompanyPOM.clickInternalAssi(driver).click();
		      
		//  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='BodyContent_grdEventCannedReport']")));	//Wait until records table get visible.
			  	 Thread.sleep(4000);
		 	CompanyPOM.clickExport(driver).click();
			  	 Thread.sleep(1000);
		 	test.log(LogStatus.PASS, "Internal Assignment  Report -Export Succefully");
			  	
		 	 //-------------------------------Internal CheckList  Assignment Report-------------------------------
		     action.moveToElement(CompanyPOM.clickReport(driver)).click().build().perform();
		      Thread.sleep(1000);
		    CompanyPOM.clickInternalCheckListAssi(driver).click();
		      
		//  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='BodyContent_grdEventCannedReport']")));	//Wait until records table get visible.
			  	 Thread.sleep(4000);
		 	CompanyPOM.clickExport(driver).click();
			  	 Thread.sleep(4000);
		 	test.log(LogStatus.PASS, "Internal CheckList Assignment  Report -Export Succefully");
			  	
		 	//-------------------------------Statutory Label Report-------------------------------
		     action.moveToElement(CompanyPOM.clickReport(driver)).click().build().perform();
		      Thread.sleep(1000);
		    CompanyPOM.clickStatutoryLabelReport(driver).click();
		      
		 // 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='BodyContent_grdEventCannedReport']")));	//Wait until records table get visible.
			  	 Thread.sleep(4000);
		 	CompanyPOM.clickExport(driver).click();
			  	 Thread.sleep(4000);
		 	test.log(LogStatus.PASS, " Statutory Label  Report -Export Succefully");
			  	
		 	//-------------------------------Internal Label Report-------------------------------
		     action.moveToElement(CompanyPOM.clickReport(driver)).click().build().perform();
		      Thread.sleep(1000);
		    CompanyPOM.clickInternalLabelReport(driver).click();
		      
		//  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='BodyContent_grdEventCannedReport']")));	//Wait until records table get visible.
			  	 Thread.sleep(4000);
		 	CompanyPOM.clickExport(driver).click();
			  	 Thread.sleep(4000);
		 	test.log(LogStatus.PASS, " Internal Label  Report -Export Succefully");
			  	
		 	//-------------------------------All Report-------------------------------
		     action.moveToElement(CompanyPOM.clickReport(driver)).click().build().perform();
		      Thread.sleep(1000);
		    CompanyPOM.clickAllReport(driver).click();
		      
		 // 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='BodyContent_grdEventCannedReport']")));	//Wait until records table get visible.
			  	 Thread.sleep(5000);
		 	CompanyPOM.clickExport(driver).click();
			  	 Thread.sleep(4000);
		 	test.log(LogStatus.PASS, " All Report -Export Succefully");
		 	 Thread.sleep(4000);
		  	  driver.close();
		  	 Thread.sleep(1000);
	      test.log(LogStatus.PASS, "Location Internal-Perview");
	      driver.switchTo().window(pw);  
		
	      Thread.sleep(3000);
	}
}
