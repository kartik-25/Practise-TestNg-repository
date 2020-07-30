package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Parameter_case1 {
	
	@Test(dataProvider="myData_Parameterized")
	public void testcase1(String Username , String Password){
		System.out.println(Username);
		System.out.println(Password);
		System.out.println("*****************");
	}
	
	
	@DataProvider(name= "myData_Parameterized")
	public Object[][] myDataProvider(){
		Object[] [] ob= new Object[6] [2];
		
		ob[0][0]="Uname1";
		ob[0][1]="Pname1";
		
		ob[1][0]="Uname2";
		ob[1][1]="Pname2";
		
		ob[2][0]="Uname3";
		ob[2][1]="Pname3";
		
		ob[3][0]="Uname4";
		ob[3][1]="Pname4";
		
		ob[4][0]="Uname5";
		ob[4][1]="Pname5";
		
		ob[5][0]="Uname6";
		ob[5][1]="Pname6";
		
		return ob;
	}

}
