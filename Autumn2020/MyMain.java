package Autumn2020;

import java.util.Random;

public class MyMain {

	public static void main(String[] args) {
		Random r = new Random();
		
		IMyStack stack = new MyDoubleLinkedStack();
		for (int i=0; i<10; i++)
		{
			IMyStack stackelement;
			if (i % 3 == 0)
			{
				stackelement = new MyDynamicStack();
			}
			else if (i % 3 == 1)
			{
				stackelement = new MyStaticStack();				
			}
			else
			{
				stackelement = new MyDoubleLinkedStack();								
			}
			for (int j=0; j<5+r.nextInt(10); j++)
			{
				if (j % 2 == 0)
				{
					stackelement.pushTop(new MyStackElement(r.nextInt(100)));
				}
				else
				{
					stackelement.pushBottom(new MyStackElement(r.nextInt(100)));					
				}
			}
			if (i % 2 == 0)
			{
				stack.pushTop(stackelement);
			}
			else
			{
				stack.pushBottom(stackelement);				
			}
		}
		
		stack.print();
		
		MyAlgorithms.bubbleSort(stack);
		
		System.out.println();
		stack.print();

		MyAlgorithms.sortStacksInStack(stack);
		
		System.out.println();
		IMyStack sumofMaxBelow = MyAlgorithms.getStacksWithSumOfMaxBelow(stack, 300);
		if (sumofMaxBelow!=null)
		{
			sumofMaxBelow.print();
		}
		else
		{
			System.out.println("Stack is null.");
		}
		System.out.println();
		
		for (int i=0; i<stack.size()/2; i++)
		{
			stack.popTop().print();
			System.out.println();
		}
		
		while (!stack.isEmpty())
		{
			stack.popBottom().print();
			System.out.println();
		}

		stack.print();
	}

}
