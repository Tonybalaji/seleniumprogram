package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args)
	{
		
		ChromeDriver name =new ChromeDriver();
//		EdgeDriver name = new EdgeDriver();
		
		name.get("http://leaftaps.com/opentaps/control/main");
		
//     	name.manage().window().maximize();
		
		name.findElement(By.id("username")).sendKeys("DemoCsr");
		
		name.findElement(By.id("password")).sendKeys("crmsfa");
		
		name.findElement(By.className("decorativeSubmit")).click();
		
		name.findElement(By.linkText("CRM/SFA")).click();
		
		name.findElement(By.linkText("Leads")).click();
		
		name.findElement(By.partialLinkText("Create")).click();
		
		name.findElement(By.id("createLeadForm_companyName")).sendKeys("leetzytony");

		name.findElement(By.id("createLeadForm_firstName")).sendKeys("im tony");
	
	    name.findElement(By.id("createLeadForm_lastName")).sendKeys("balaji");
	
	    name.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("lee tzu");
	    
	    name.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("tony balaji");
	    
	   // name.findElement(By.id("createLeadForm_personalTitle")).sendKeys("teni");
	    
	    name.findElement(By.id("createLeadForm_personalTitle")).sendKeys("theni");
	    
	    name.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("life is goes on");
	    
	    
	    name.findElement(By.id("createLeadForm_departmentName")).sendKeys("life 2");
	    
	    name.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5 L");
	    
	    name.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("6");
	    
	    name.findElement(By.id("createLeadForm_sicCode")).sendKeys("lttb1003");
	    
	    name.findElement(By.name("numberEmployees")).sendKeys("3");
	    
	    name.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("#");
	    
	    name.findElement(By.id("createLeadForm_description")).sendKeys("I am a  junior Software Tester.");
	    
	    name.findElement(By.id("createLeadForm_importantNote")).sendKeys("I am awesome Automation testing");
	    
	    name.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
	    
	    name.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("5/137");
	    
	    name.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6382909157");
	    
	    name.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("63");
	    
	    name.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pbalaji240422@gmail.com");
	    
	    name.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Tester");
	    
	    name.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https.leaftaps.com");
	    
	    name.findElement(By.id("createLeadForm_generalToName")).sendKeys("sabari");
	    
	    name.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("vasan");
	    
	    name.findElement(By.name("generalAddress1")).sendKeys("Chennai");
	    
	    name.findElement(By.name("generalAddress2")).sendKeys("Teni");
	    
	    name.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
	    
	    name.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("517501");
	    
	    
	    name.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("+91");
	    
	    name.findElement(By.className("smallSubmit")).click();
	    
	    
	}

}
