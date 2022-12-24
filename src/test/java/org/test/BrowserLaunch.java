package org.test;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	public static void main (String[] args) throws Throwable {
		//System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\eclipse-workspace\\MavenPackage\\target\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		String url="https://www.facebook.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
		user.sendKeys("selenium");
		
		//WebElement pass = driver.findElement(By.name("pass"));
		//pass.sendKeys("12345658");
		
		WebElement pass = driver.findElement(By.xpath(""
				+ "pass"));
		pass.sendKeys("12345658");
		
		
		
		String attribute = pass.getAttribute("name");
		System.out.println(attribute);
	
		
		java.util.List<WebElement> itag = driver.findElements(By.tagName("a"));
		
		for(int i=0; i<itag.size(); i++) {
			WebElement x = itag.get(i);
			String text = x.getText();
			System.out.println(text);
		}
		}
		
		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
//		
//		
//		
//		String currenturl= driver.getCurrentUrl();
//		if(currenturl.equals(url)) {
//			System.out.println("correct URL");
//		}
//		else {
//			System.out.println("Incorrect URL");
//		}
//		
//		String title = driver.getTitle();
//		System.out.println(title);
		
		//driver.quit();
		
		}


