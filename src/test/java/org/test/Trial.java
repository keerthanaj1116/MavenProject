package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		String Url = "https://demoqa.com/alert";
		d.get(Url);
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//button[@id=alertButton']')")).click();
		
		Alert a =d.switchTo().alert();
		a.accept();
		
		d.findElement(By.xpath("//button[@id='confirmButton']'")).click();
		a.dismiss();
		
		d.findElement(By.xpath("//button[@id='promtButton']'")).click();
		
		String text = a.getText();
		System.out.println(text);
		
		a.sendKeys("selenium");
		a.accept();
		
		
		
		
		
	}

}
