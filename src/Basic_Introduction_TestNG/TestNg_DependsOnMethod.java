package Basic_Introduction_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_DependsOnMethod {
	
@BeforeMethod
public void beforeMethod(){
	System.out.println("@BeforeMethod");
}

@AfterMethod
public void afterMethod(){
	System.out.println("@AfterMethod");
}

@BeforeTest
public void beforeTest(){
	System.out.println("@BeforeTest");
}

@AfterTest
public void afterTest(){
	System.out.println("@AfterTest");
}

@Test(priority=1, enabled = false)
public void test1(){
	System.out.println("testcase 1 is executed");
}

@Test (priority=2)
public void test2(){
	System.out.println("testcase 2 is executed");
}
/*
Rule=> test3() is dependent on method test2(). so first test2() will execute after  that test3().

note=> In case test2() is failing then test3() will be ignored or not executed.
*/
@Test( priority=3,dependsOnMethods="test2")
public void test3(){
	System.out.println("testcase 3 is executed");
}

//,dependsOnMethods="test1"
@Test(priority=4)
public void test4(){
	System.out.println("testcase 4 is executed");
}



}
