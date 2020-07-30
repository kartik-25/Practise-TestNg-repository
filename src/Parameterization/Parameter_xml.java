package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_xml {

	@Parameters({"URL","USERNAME" ,"PASSWOORD","COMPANY"})
	@Test
	public void test1(String url , String uname ,String pname , String cname){
		System.out.println(url);
		System.out.println(uname);
		System.out.println(pname);
		System.out.println(cname);
		
	}
}
