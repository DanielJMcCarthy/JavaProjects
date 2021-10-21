package Autumn2020;



public class MyDoubleLinkedStack implements IMyStack {
	private MyDoubleLinkedNode head;
	private MyDoubleLinkedNode tail;

	private int size;

	public MyDoubleLinkedStack()
	{
		this.head = new MyDoubleLinkedNode(null, null, null);
		this.tail = new MyDoubleLinkedNode(null, null, null);

		this.head.setNext(tail);
		this.tail.setPrevious(tail);

		this.size = 0;
	}
	
	public void pushTop(IMyStackElement element) 
	{
		MyDoubleLinkedNode node = new MyDoubleLinkedNode(element, null, null);
		if (this.size == 0){
			this.head.setNext(node);
			this.tail.setPrevious(node);

			node.setPrevious(this.head);
			node.setNext(this.head);

		} else{
			MyDoubleLinkedNode old_tail_prev = this.tail.getPrevious();
			old_tail_prev.setNext(node);
			node.setPrevious(old_tail_prev);
			node.setNext(this.tail);
			this.tail.setPrevious(node);
		}

		this.size ++;
	}

	public void pushBottom(IMyStackElement element) 
	{

		MyDoubleLinkedNode node = new MyDoubleLinkedNode(element, null, null);
		if (this.size == 0){
			this.head.setNext(node);
			this.tail.setPrevious(node);

			node.setPrevious(this.head);
			node.setNext(this.head);

		} else{
			MyDoubleLinkedNode old_head_next = this.head.getNext();
			old_head_next.setPrevious(node);
			node.setNext(old_head_next);
			node.setPrevious(this.head);
			this.head.setNext(node);
		}

		this.size ++;
	}

	public IMyStackElement popTop() {
		if (this.size == 0) {
			System.out.println("There is no items in the stack");
			return null;
		} else {
			MyDoubleLinkedNode node = this.tail.getPrevious();

			MyDoubleLinkedNode new_end = node.getPrevious();

			new_end.setNext(this.tail);
			this.tail.setPrevious(new_end);

			return (IMyStackElement) node.getValue();
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
		if(this.size - number < 0) {
			System.out.println("There is no items in the stack");
			return null;
		}
		int i = 0;

		MyDoubleLinkedNode node = this.tail.getPrevious();
		while (i < number){
			node = node.getPrevious();
			i ++;
		}

		MyStackElement item = (MyStackElement) node.getValue();
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

		while (node.getNext().getNext() != null){
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
