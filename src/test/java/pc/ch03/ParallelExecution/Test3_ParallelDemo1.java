package pc.ch03.ParallelExecution;

import org.testng.annotations.Test;
//refer src/test/resources for xml file
public class Test3_ParallelDemo1 {

	@Test
	public void test1() {
		System.out.println("test1 method in ParallelByMethod class with threadId" + Thread.currentThread().getId());
	}

	@Test
	public void test2() {
		System.out.println("test2 method in ParallelByMethod class with threadId" + Thread.currentThread().getId());
	}

	@Test
	public void test3() {
		System.out.println("test3 method in ParallelByMethod class with threadId" + Thread.currentThread().getId());
	}

	@Test
	public void test4() {
		System.out.println("test4 method in ParallelByMethod class with threadId" + Thread.currentThread().getId());
	}
}
