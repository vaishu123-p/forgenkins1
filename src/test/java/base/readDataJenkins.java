package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class readDataJenkins {
	
	
	@Test
	
	public void vtigercrm() throws IOException{
		
		final WebDriver driver;
		
		FileInputStream fis=new FileInputStream("src\\test\\resources\\vtigerjenkins.properties");
		Properties p= new Properties();
		p.load(fis);
		
		String BROWSER=p.getProperty("browser");
		String URL =p.getProperty("url");
		String USERNAME=p.getProperty("username");
		String PASSWORD=p.getProperty("password");
		
		 if(BROWSER.equalsIgnoreCase("Chrome"))
         {
        	 driver=new ChromeDriver();
	
         }
         else if(BROWSER.equalsIgnoreCase("Edge")) {
        	 driver=new EdgeDriver();
	
         }
         else {
        	 driver=new FirefoxDriver();
        	  }
		 
		 driver.get(URL);
		 driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		 driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		 driver.findElement(By.id("submitButton")).click();
		 System.out.println("Good Morning");
		 
	}

}
