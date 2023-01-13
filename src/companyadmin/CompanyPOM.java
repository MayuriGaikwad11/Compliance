package companyadmin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompanyPOM {
	

	private static WebElement admin = null;				//WebElement variable created for 'Categories' click
					
	private static List<WebElement> adminList = null;		
	
	public static WebElement clickAdmin(WebDriver driver)		//Method for closing Message Popup
	{
		admin = driver.findElement(By.xpath("//*[@id='leftApprovermenu']"));
		return admin;
	}
	
	public static WebElement clickReport(WebDriver driver)		//Method for closing Message Popup
	{
		admin = driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[2]/a"));
		return admin;
	}

	public static WebElement clickStatutoryAssi(WebDriver driver)		//Method for closing Message Popup
	{
		admin = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[1]/a"));
		return admin;
	}
	
	public static WebElement clickCheckListAssi(WebDriver driver)		//Method for closing Message Popup
	{
		admin = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[2]/a"));
		return admin;
	}
	
	public static WebElement clickEventBasedAssi(WebDriver driver)		//Method for closing Message Popup
	{
		admin = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[3]/a"));
		return admin;
	}
	
	public static WebElement clickInternalAssi(WebDriver driver)		//Method for closing Message Popup
	{
		admin = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[4]/a"));
		return admin;
	}
	
	public static WebElement clickInternalCheckListAssi(WebDriver driver)		//Method for closing Message Popup
	{
		admin = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[5]/a"));
		return admin;
	}
	
	public static WebElement clickStatutoryLabelReport(WebDriver driver)		//Method for closing Message Popup
	{
		admin = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[6]/a"));
		return admin;
	}
	
	public static WebElement clickInternalLabelReport(WebDriver driver)		//Method for closing Message Popup
	{
		admin = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[7]/a"));
		return admin;
	}
	
	public static WebElement clickAllReport(WebDriver driver)		//Method for closing Message Popup
	{
		admin = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[8]/a"));
		return admin;
	}
	
	public static WebElement clickExport(WebDriver driver)		//Method for closing Message Popup
	{
		admin = driver.findElement(By.xpath("//*[@id='BodyContent_lbtnExportExcel']/img"));
		return admin;
	}
	
	

	
}
