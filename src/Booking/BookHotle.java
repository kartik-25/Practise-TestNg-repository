package Booking;

import org.testng.annotations.Test;

public class BookHotle {
	@Test(groups={"smoke" ,"regression"})
	public void bookHotle_DestinationCity_Testcase1(){
	System.out.println("bookHotle_DestinationCity_Testcase1()");
	}

	@Test(groups={"smoke"})
	public void bookHotle_checkIn_Testcase2(){
	System.out.println("bookHotle_checkIn_Testcase2()");
	}

	@Test(groups={"sanity" , "smoke"})
	public void bookHotle_checkOut_Testcase3(){
	System.out.println("bookHotle_checkOut_Testcase3()");
	}
	}
