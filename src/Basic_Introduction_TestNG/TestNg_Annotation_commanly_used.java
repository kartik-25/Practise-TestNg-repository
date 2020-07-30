package Basic_Introduction_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Annotation_commanly_used {
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("@BeforeTest");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("@AfterTest");
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("@AfterMethod");
	}
	
	@Test(priority= 3 , enabled= true)
	public void testcase1(){
		System.out.println("Testcase 1 is executed");
	}
	
	@Test(priority= 2 , enabled= true)
	public void testcase2(){
		System.out.println("Testcase 2 is executed");
	}
	// testcase3 will not be executed.Since enabled is false.
	 @Test(priority= 1 , enabled= false)
	public void testcase3(){
		System.out.println("Testcase 3 is executed");
	}
}
