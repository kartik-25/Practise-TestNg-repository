package OnlineChecking;

public class OnlineChecking_2 {
	package OnlineChecking;

	import org.testng.annotations.Test;

	public class OnlineChecking {
		
		@Test (groups={"regression","smoke","sanity"})
	public void checkInOnline_PNR_Number_Testcase1(){
		System.out.println("checkInOnline_PNR_Number_Testcase1()");
	}

	@Test (groups={"smoke","sanity"})
	public void checkInOnline_PNR_Status_Testcase2(){
		System.out.println("checkInOnline_PNR_Status_Testcase2()");
	}

	@Test (groups={"sanity"})
	public void checkInMannual_PNR_Number_Testcase3(){
		System.out.println("checkInMannual_PNR_Number_Testcase3()");
	}
	@Test
	public void checkInMannual_PNR_Status_Testcase4(){
		System.out.println("checkInMannual_PNR_Status_Testcase4()");
	}

	@Test
	public void checkInPersonal_PNR_Status_Testcase5(){
		System.out.println("checkInPersonal_PNR_Status_Testcase5()");
	}

	@Test
	public void checkInPersonal_PNR_Status_Testcase6(){
		System.out.println("checkInPersonal_PNR_Status_Testcase6()");
	}
	}

}
