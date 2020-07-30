package Parallel_Execution;
//What happen when thread count is less than method count

import org.testng.annotations.Test;

public class Example3 {

		@Test(threadPoolSize=5 ,invocationCount=5,timeOut=1000)
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
