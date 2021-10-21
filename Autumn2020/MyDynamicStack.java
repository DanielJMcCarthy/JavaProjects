package Autumn2020;


public class MyDynamicStack implements IMyStack {

	//
	private MyNode head;
	private int size;

	public MyDynamicStack()
	{
		this.head = new MyNode(null, null);
		this.size = 0;
	}
	
	public void pushTop(IMyStackElement element) 
	{
		MyNode new_node = new MyNode(element, null);
		MyNode temp = this.head;

		while (temp.getNext() != null){
			temp = temp.getNext();
		}

		temp.setNext(new_node);
		this.size ++;
	}

	public void pushBottom(IMyStackElement element) 
	{
		MyNode new_node = new MyNode(element, null);
		if (this.size == 0){
			// if the stack is empty we would be writing same code as PushTop method, so we can just call the method
			this.pushTop(element);
		} else {
			MyNode old_first = this.head.getNext();
			this.head.setNext(new_node);
			new_node.setNext(old_first);
		}

		this.size ++;
	}

	public IMyStackElement popTop() 
	{
		if(this.size == 0) {
			System.out.println("There is no items in the stack");
			return null;
		} else {
			MyNode new_end = this.head;

			while (new_end.getNext().getNext() != null){
				new_end = new_end.getNext();
			}

			MyNode tail = new_end.getNext();

			new_end.setNext(null);
			this.size --;

			return (IMyStackElement) tail.getValue();

		}
	}

	public IMyStackElement popBottom() 
	{
		if(this.size == 0) {
			System.out.println("There is no items in the stack");
			return null;
		} else {
			MyNode node = this.head.getNext();

			this.head.setNext(node.getNext());

			return (IMyStackElement) node.getValue();
		}
	}

	public IMyStackElement peekTop(int number) {
		// to be completed
		if(this.size - number < 0) {
			System.out.println("There is no items in the stack");
			return null;
		}
		int index = this.size - number;
		MyNode new_end = this.head;

		int i = 0;

		while (i < index){
			new_end = new_end.getNext();
			i ++;
		}

		MyStackElement item = (MyStackElement) new_end.getValue();
		return item;
	}

	public IMyStackElement peekBottom(int number) 
	{
		if(number > size) {
			System.out.println("There is no items in the stack");
			return null;
		}


		MyNode new_end = this.head;

		int i = 0;

		while (i <= number){
			new_end = new_end.getNext();
			i ++;
		}

		MyStackElement item = (MyStackElement) new_end.getValue();
		return item;
	}
	
	public int size() {
		// to be completed
		return this.size;
	}

	public boolean isEmpty() {
		// to be completed
		return this.size == 0;
	}

	public void print() {
		MyNode node = this.head;

		while (node.getNext() != null){
			node = node.getNext();
			MyStackElement element = (MyStackElement) node.getValue();
			element.print();
			System.out.print(", ");

		}

		System.out.println();
	}
	
	public int getValue()
	{
		// to be completed
		return this.size;
	}
}
