package Autumn2020;


public class MyAlgorithms {
	
	public static void sortStacksInStack(IMyStack stackOfStacks)
	{
		for (int i=0; i<stackOfStacks.size(); i++)
		{
			IMyStack stack = (IMyStack)stackOfStacks.peekTop(i);			
			quickSort(stack);
		}
	}
		
	public static void quickSort(IMyStack stack)
	{
		// to be completed
	}
	
	public static void bubbleSort(IMyStack stack)
	{
		// to be completed
	}
		
	public static IMyStack getStacksWithSumOfMaxBelow(IMyStack stackOfStacks, int totalSumofMax)
	{
		// to be completed
		return null;
	}
	
}
