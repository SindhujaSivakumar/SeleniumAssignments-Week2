package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		
	//Open Browser And Launch the application
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	//Login to the application
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		WebElement loginElement = driver.findElement(By.className("decorativeSubmit"));
		loginElement.click();
	//select CRMSFA link
		WebElement crmLink = driver.findElement(By.linkText("CRM/SFA"));
		crmLink.click();
	//Click Leads
		WebElement leadsLink = driver.findElement(By.linkText("Leads"));
		leadsLink.click();
		
	//Click Create Lead
		WebElement createLeadLink = driver.findElement(By.linkText("Create Lead"));
		createLeadLink.click();
	//Enter CompanyName, FirstName, LastName and FirstName(Local) using ID locator
		WebElement enterCmpyNameElement = driver.findElement(By.id("createLeadForm_companyName"));
		enterCmpyNameElement.sendKeys("Wipro");
		WebElement enterFirstNameElement = driver.findElement(By.id("createLeadForm_firstName"));
		enterFirstNameElement.sendKeys("Sindhuja");
		WebElement enterLastNameElement = driver.findElement(By.id("createLeadForm_lastName"));
		enterLastNameElement.sendKeys("Sivakumar");
		WebElement firstNameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocalElement.sendKeys("Sindhu");
	//Enter Department Field Using any Locator
		WebElement deptElement = driver.findElement(By.name("departmentName"));
		deptElement.sendKeys("IT");
	//Enter Description Field Using any Locator
		WebElement descElement = driver.findElement(By.name("description"));
		descElement.sendKeys("Creating lead");
	//To scroll
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].scrollIntoView(true);", descElement);
	//Enter your email in the E-mail address Field using the locator of your choice
		WebElement emailElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailElement.sendKeys("abc123@nn.com");
	//Select State/Province as NewYork Using Visible Text
		WebElement stateElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateElement);
		state.selectByVisibleText("NY");
	//Click on Create Button
		WebElement createLeadElement = driver.findElement(By.className("smallSubmit"));
		createLeadElement.click();
	//Get the Title of Resulting Page
		driver.getTitle();
		System.out.println(driver.getTitle());
	
	}

}
