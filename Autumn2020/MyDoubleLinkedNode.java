package Autumn2020;


public class MyDoubleLinkedNode<T> extends MyNode<T> {
	MyDoubleLinkedNode<T> previous;
	
	public MyDoubleLinkedNode(T v, MyDoubleLinkedNode<T> p, MyDoubleLinkedNode<T> n) {
		super(v, n);
		previous = p;
	}
	
	public MyDoubleLinkedNode<T> getPrevious()
	{
		return previous;
	}
	
	public void setPrevious(MyDoubleLinkedNode<T> p)
	{
		previous = p;
	}

	
	public MyDoubleLinkedNode<T> getNext()
	{
		return (MyDoubleLinkedNode<T>)super.getNext();
	}	
}
