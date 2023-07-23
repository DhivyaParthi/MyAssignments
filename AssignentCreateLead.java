package week1.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignentCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driverc = new ChromeDriver();
		driverc.manage().window().maximize();
		driverc.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverc.get("http://leaftaps.com/opentaps/control/login");
		driverc.findElement(By.id("username")).sendKeys("demoSalesManager");
		driverc.findElement(By.id("password")).sendKeys("crmsfa");
		driverc.findElement(By.id("decorativeSubmit")).click();
		driverc.findElement(By.linkText("CRM/SFA")).click();
		driverc.findElement(By.linkText("Leads")).clear();
		driverc.findElement(By.linkText("Create Lead")).click();
		driverc.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driverc.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivya");
		driverc.findElement(By.id("createLeadForm_lastName")).sendKeys("Parthi");
		driverc.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dhivyaparthi11@gmail.com");
		driverc.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8870031228");
		driverc.findElement(By.id("submitButton")).click();	

	}

}
