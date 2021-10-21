package Autumn2020;

public class MyStackElement implements IMyStackElement {
	protected int value;
	
	public MyStackElement(int v)
	{
		value = v;
	}
	
	public void print()
	{
		System.out.print(value);
	}
	
	public int getValue()
	{
		return value;
	}
}
