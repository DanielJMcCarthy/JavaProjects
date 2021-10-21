package Autumn2020;

public interface IMyStack extends IMyStackElement {
	void pushTop(IMyStackElement element);
	void pushBottom(IMyStackElement element);	
	
	IMyStackElement popTop();
	IMyStackElement popBottom();
	
	IMyStackElement peekTop(int number);
	IMyStackElement peekBottom(int number);
	
	boolean isEmpty();
	int size();
}
