package Autumn2020;

import java.util.ArrayList;

public class MyStaticStack implements IMyStack {
	
	protected static final int INITIAL_CAPACITY = 4;

	private ArrayList<MyStackElement> stack = new ArrayList<>();
	private int pointer;
	private int current_capacity;

	public MyStaticStack()
	{
		this.pointer = 0;
		this.current_capacity = INITIAL_CAPACITY;

		for (int i = 0; i < INITIAL_CAPACITY; i++){
			this.stack.add(new MyStackElement(-1));
		}
	}
	
	public void pushTop(IMyStackElement element) 
	{
		// Check if stack is full. If it is double the size
		if (this.pointer == this.current_capacity){
			this.current_capacity = this.current_capacity * 2;
			for (int i = 0; i < this.current_capacity - this.pointer; i ++){
				this.stack.add(new MyStackElement(0));
			}
		}

		this.stack.set(this.pointer, new MyStackElement(element.getValue()));
		this.pointer ++;
	}

	public void pushBottom(IMyStackElement element) 
	{
		// Check if stack is full. If it is double the size
		if (this.pointer == this.current_capacity){
			this.current_capacity = this.current_capacity * 2;
			for (int i = 0; i < this.current_capacity - this.pointer; i ++){
				this.stack.add(new MyStackElement(0));
			}
		}

		MyStackElement to_insert = new MyStackElement(element.getValue());

		for (int i = 0; i <= this.pointer; i ++){
			MyStackElement current = this.stack.get(i);

			this.stack.set(i, to_insert);

			to_insert = current;


		}

		this.pointer ++;
	}

	public IMyStackElement popTop() 
	{
		if (this.pointer == 0){
			System.out.println("No items left in the stack");
			return null;
		}

		this.pointer --;
		MyStackElement top = this.stack.get(this.pointer);
		this.stack.set(this.pointer, new MyStackElement(0));

		int check_size = this.current_capacity / 4;
		if(check_size == this.pointer){
			if (check_size >= INITIAL_CAPACITY){
				for(int i = this.pointer; i < this.current_capacity; i++) {
					//System.out.println(i + " " + this.current_capacity);
					this.stack.remove(this.pointer);
				}

				this.current_capacity = check_size;

			}
		}

		return top;

	}

	public IMyStackElement popBottom() 
	{
		if (this.pointer == 0){
			System.out.println("No items left in the stack");
			return null;
		}

		this.pointer --;
		MyStackElement bottom = this.stack.get(0);
		this.stack.set(0, new MyStackElement(0));

		MyStackElement to_insert = this.stack.get(this.pointer);
		stack.set(this.pointer, new MyStackElement(0));
		for (int i = this.pointer; i > 0; i --){
			MyStackElement current = this.stack.get(i - 1);

			this.stack.set(i - 1, to_insert);

			to_insert = current;


		}

		int check_size = this.current_capacity / 4;
		if(check_size == this.pointer){
			if (check_size >= INITIAL_CAPACITY){
				for(int i = this.pointer; i < this.current_capacity; i++) {
					this.stack.remove(this.pointer);
				}

				this.current_capacity = check_size;

			}
		}

		return bottom;

	}

	public IMyStackElement peekTop(int number) {
		if (this.pointer -1 - number < 0){
			System.out.println("Index out of range");
			return null;
		}

		return this.stack.get(this.pointer -1 - number);
	}

	public IMyStackElement peekBottom(int number) 
	{
		if (number >= pointer){
			System.out.println("Index out of range");
			return null;
		}

		return this.stack.get(number);
	}
	
	public int size() {
		// to be completed
		return this.current_capacity;
	}

	public boolean isEmpty() {
		return this.pointer == 0;
	}

	public void print() {
		// to be completed
		for (int i = 0; i < this.pointer; i++){
			this.stack.get(i).print();
			System.out.print(", ");
		}
		System.out.println();
	}
	
	public int getValue()
	{
		return this.pointer;
	}
}
