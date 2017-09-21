package myIntegerTest;

import static org.junit.Assert.*;

import org.junit.Test;

import myInteger.MyInteger;

public class MyIntegerTest {

	MyInteger m;
	@Test
	public void test1() {
		assertTrue(MyInteger.isPrime(m = new MyInteger(19)));
	}
	@Test
	public void test2() {
		assertTrue(MyInteger.isOdd(m = new MyInteger(45)));
	}
	@Test
	public void test3() {
		assertTrue(MyInteger.isEven(m = new MyInteger(10)));
	}

	@Test
	public void test4() {
		m = new MyInteger(14);
		assertTrue(m.equals(m = new MyInteger(14)));
	}
	@Test
	public void test5() {
		m = new MyInteger(1);
		assertEquals(1,m.getiValue());
	}
	@Test
	public void test6() {
		assertFalse(MyInteger.isPrime(25));
	}
	@Test
	public void test7() {
		assertFalse(MyInteger.isOdd(8));
	}
	@Test
	public void test8() {
		assertFalse(MyInteger.isEven(9));
	}
	@Test
	public void test9() {
		m = new MyInteger(7);
		assertFalse(m.equals(9));
	}
}
