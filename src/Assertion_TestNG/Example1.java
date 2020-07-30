package Assertion_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example1 {
	
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
	
	@Test(priority= 1 , enabled= true)
	public void testcase1(){
		System.out.println("Testcase 1 is executed");
		Assert.assertEquals(true, true);
	}
	
	@Test(priority= 2 , enabled= true)
	public void testcase2(){
		System.out.println("Testcase 2 is executed");
		Assert.assertEquals(12, 11);
	}
	// testcase3 will not be executed.Since enabled is false.
	 @Test(priority= 3 , enabled= true)
	public void testcase3(){
		System.out.println("Testcase 3 is executed");
		Assert.assertEquals("hello", "hello");
	}

	 @Test(priority= 4 , enabled= true)
		public void testcase4(){
			System.out.println("Testcase 4 is executed");
			Assert.assertEquals(5555555, 6666666);
		}
	 
	 @Test(priority= 5 , enabled= true)
		public void testcase5(){
			System.out.println("Testcase 4 is executed");
			Assert.assertEquals(5, 6666666);
		}
	 
	 @Test(priority= 6 , enabled= true)
		public void testcase6(){
			System.out.println("Testcase 4 is executed");
			Assert.assertEquals(5.5, 5.5);
		}
}
