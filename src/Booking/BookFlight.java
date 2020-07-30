package Booking;

import org.testng.annotations.Test;

public class BookFlight {
	
	@Test(groups={"smoke","sanity","regression"})
	public void bookFlight_RoundTrip_TestCase1(){
		System.out.println("bookFlight_RoundTrip_TestCase1()");
	}
	
	@Test(groups={"smoke"})
	public void bookFlight_RoundTrip_TestCase2(){
		System.out.println("bookFlight_RoundTrip_TestCase2()");
	}
	
	@Test(groups={"sanity"})
	public void bookFlight_RoundTrip_TestCase3(){
		System.out.println("bookFlight_RoundTrip_TestCase3()");
	}
	
	@Test(groups="regression")
	public void bookFlight_RoundTrip_TestCase4(){
		System.out.println("bookFlight_RoundTrip_TestCase4()");
	}
	
	@Test
	public void bookFlight_RoundTrip_TestCase5(){
		System.out.println("bookFlight_RoundTrip_TestCase5()");
	}
	
	@Test
	public void bookFlight_RoundTrip_TestCase6(){
		System.out.println("bookFlight_RoundTrip_TestCase6()");
	}


}
