package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class execution1 {

	@Test (groups="Food")
	
	public void Zomato(){
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.zomato.com/");
		
	}

	
	@Test
	
	public void Facebook() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test(groups="Food")
	
	public void Swiggy() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
	}
	
	
}
