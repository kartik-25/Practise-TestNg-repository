package Parallel_Execution;

import org.testng.annotations.Test;

// How to run tests in Parallel.
public class Example1 {



	@Test
	public void test1(){
		System.out.println("***Start Example 1**********");
		System.out.println("I am inside test1 |"+Thread.currentThread().getId());
	}
	
	@Test
	public void test2(){
		System.out.println("I am inside test2 |"+Thread.currentThread().getId());
		System.out.println("***End Example 1**********");
	}
}
