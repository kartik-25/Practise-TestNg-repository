package Parallel_Execution;

import org.testng.annotations.Test;

// how to configure a single method to run in multiple thread

public class Example2 {
	@Test()
	public void test1(){
		System.out.println("I am inside test1 |"+Thread.currentThread().getId());
	}
	
	@Test
	public void test2(){
		System.out.println("I am inside test2 |"+Thread.currentThread().getId());
	}
	
	@Test
	public void test3(){
		System.out.println("I am inside test3 |"+Thread.currentThread().getId());
	}

}
