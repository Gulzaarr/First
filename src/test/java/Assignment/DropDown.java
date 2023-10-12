package Assignment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

 

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

 

		WebDriverManager.edgedriver().setup();

 

		WebDriver driver=new EdgeDriver();

 

		driver.manage().window().maximize();

 

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

 

		driver.get("https://www.amazon.in/");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")).sendKeys("Beauty");

		Thread.sleep(5000);

		driver.close();

	}

}

 