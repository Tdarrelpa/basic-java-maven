// package src.test.java;

import static org.junit.Assert.*;
// import src.main.java.*;
import org.junit.Test;

public class CounterTest 
{
	@Test
	public void testReset() 
	{
		Counter testCounter = new Counter();
		
		for(int i = 0; i < 10; i++) {testCounter.increment();}
		
		testCounter.reset();
		
		assertEquals(testCounter.getCount(), 0);
	}

	@Test
	public void testIncrement() 
	{
		Counter testCounter = new Counter();
		
		for(int i = 1; i < 10; i++) 
		{
			testCounter.increment();
			assertEquals(testCounter.getCount(), i);
		}
	}

	@Test
	public void testDecrement() 
	{
		Counter testCounter = new Counter();
		
		for(int i = 1; i < 10; i++) 
		{
			testCounter.decrement();
			assertEquals(testCounter.getCount(), i * -1);
		}
	}

	@Test
	public void testIncreaseBy()
	{
		Counter testCounter = new Counter();
		int sum = 0;
		for (int i = 1; i < 10; i++) 
		{
			testCounter.increaseBy(i);
			sum += i;
			assertEquals(testCounter.getCount(), sum);
		}
	}

	@Test
	public void testDecreaseBy()
	{
		Counter testCounter = new Counter();
		int difference = 0;
		for(int i = 1; i < 10; i++) 
		{
			testCounter.decreaseBy(i);
			difference -= i;
			assertEquals(testCounter.getCount(), difference);
		}
	}

	@Test
	public void testMultiplyBy()
	{
		Counter testCounter = new Counter();
		testCounter.increment();
		int product = 1;
		for (int i = 1; i < 10; i++) 
		{
			testCounter.multiplyBy(i);
			product *= i;
			assertEquals(testCounter.getCount(), product);
		}
	}

	@Test
	public void testDividedBy()
	{
		Counter testCounter = new Counter();
		testCounter.increaseBy(362880);
		for(int i = 1; i < 10; i++) {testCounter.dividedBy(i);}
		assertEquals(testCounter.getCount(), 1);
	}

	@Test
	public void testPowerBy()
	{
		Counter testCounter = new Counter();

		testCounter.increment();
		for (int i = 1; i < 10; i++) 
		{
			testCounter.powerBy(i);
			assertEquals(1, testCounter.getCount());
		}
	}

	@Test
	public void testIsCountEven() 
	{
		Counter testCounter = new Counter();
		
		for(int i = 1; i < 10; i++) 
		{
			testCounter.increment();
			if (i % 2 == 0) {assertTrue(testCounter.isCountEven());} 
			else {assertFalse(testCounter.isCountEven());}
		}
	}
}