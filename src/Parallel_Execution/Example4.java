package Parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example4 {
	
	WebDriver driver= null;
	@Test
	public void test1(){
		System.out.println("I am inside test1 |"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkumar97\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("www.google.com");
		String str=driver.getTitle();
		System.out.println(str);
		driver.close();
	}
	
	@Test
	public void test2(){
		System.out.println("I am inside test1 |"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkumar97\\workspace\\inetbanking_Version1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("www.facebook.com");
		String str=driver.getTitle();
		System.out.println(str);
		driver.close();
	}

}
