package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Parameter_case2 {
	
	@Test(dataProvider="myParameterized_Data")
	public void testcase1(String Uname , String Pname ,String Employee ,String Company){
		
		System.out.println(Uname);
		System.out.println(Pname);
		System.out.println(Employee);
		System.out.println(Company);
		
		System.out.println("*************");
	}
	
	@DataProvider(name="myParameterized_Data")
	public Object[] [] myDataProvider(){
		
		Object [] [] ob = new Object [6] [4];
		
		ob[0][0] = "Username  1";
		ob[0][1] = "Password 1";
		ob[0][2] = "Employee 1";
		ob[0][3] = "Company 1";
		
		
		ob[1][0] = "Username 2";
		ob[1][1] = "Password 2";
		ob[1][2] = "Employee 2";
		ob[1][3] = "Company 2";
		
		ob[2][0] = "Username 3";
		ob[2][1] = "Password 3";
		ob[2][2] = "Employee 3";
		ob[2][3] = "Company 3";
		
		ob[3][0] = "Username 4";
		ob[3][1] = "Password 4";
		ob[3][2] = "Employee 4";
		ob[3][3] = "Company 4";
		
		ob[4][0] = "Username 5";
		ob[4][1] = "Password 5";
		ob[4][2] = "Employee 5";
		ob[4][3] = "Company 5";
		
		ob[5][0] = "Username 6";
		ob[5][1] = "Password 6";
		ob[5][2] = "Employee 6";
		ob[5][3] = "Company 6";
		
		return ob;
	}

}
