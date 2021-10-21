package Autumn2020;


public class MyNode<T> {
	protected T value;
	protected MyNode<T> next;
	
	public MyNode(T v, MyNode<T> n)
	{
		value = v;
		next = n;
	}
		
	public T getValue()
	{
		return value;	
	}
	
	public MyNode<T> getNext()
	{
		return next;
	}
	
	public void setNext(MyNode<T> node)
	{
		next = node;
	}
}

