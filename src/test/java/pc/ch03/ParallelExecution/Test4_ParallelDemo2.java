package pc.ch03.ParallelExecution;

import org.testng.annotations.Test;

public class Test4_ParallelDemo2 {

	@Test
	public void test5() {
		System.out.println("test5 method in ParallelByMethod class with threadId" + Thread.currentThread().getId());
	}

	@Test
	public void test6() {
		System.out.println("test6 method in ParallelByMethod class with threadId" + Thread.currentThread().getId());
	}

}
