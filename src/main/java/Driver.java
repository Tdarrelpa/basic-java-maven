// package src.main.java;

public class Driver 
{
	public static void main(String[] args) 
	{
		Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Count:" + counter.getCount());

		counter.increaseBy(2);

		System.out.println("Count:" + counter.getCount());

		counter.powerBy(2);

		System.out.println("Count:" + counter.getCount());

		counter.triple();

		System.out.println("Count:" + counter.getCount());

		counter.decreaseBy(12);

		System.out.println("Count:" + counter.getCount());

		counter.increment();
		
		System.out.println("Count:" + counter.getCount());

		counter.multiplyBy(2);

		System.out.println("Count:" + counter.getCount());

		counter.dividedBy(2);

		System.out.println("Count:" + counter.getCount());

		counter.decrement();

		System.out.println("Count:" + counter.getCount());
	}
}