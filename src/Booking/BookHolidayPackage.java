package Booking;

import org.testng.annotations.Test;

public class BookHolidayPackage {// Rule = In xml config if we specify "smoke" then testcase1() and testcase2() will only be executed
	@Test(groups={"smoke","regresssion"})
	public void bookHolidayPackage_destination_testcase1(){
		System.out.println("bookHolidayPackage_destination_testcase1()");
	}
	
	@Test(groups ={"smoke"})
	public void bookHolidayPackage_departure_testcase2(){
		System.out.println("bookHolidayPackage_departure_testcase2()");	
	}
	
	public void bookHolidayPackage_return_testcase3(){
		System.out.println("bookHolidayPackage_return_testcase3()");
	}
	
	public void bookHolidayPackage_sitesceen_testcase4(){
		System.out.println("bookHolidayPackage_destination_testcase1()");
	}
	

	public void bookHolidayPackage_travel_testcase5(){
		System.out.println("bookHolidayPackage_departure_testcase2()");	
	}
	
	public void bookHolidayPackage_remote_testcase6(){
		System.out.println("bookHolidayPackage_return_testcase3()");
	}
}