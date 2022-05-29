import java.util.Scanner;

class StackA {
	public int maxSize = 5; // size of stack array
	public String[] stackArray;
	public int top; // top of stack
	// --------------------------------------------------------------

	public StackA(int s) // constructor
	{
		stackArray = new String[s];
		// set array size
		// create array
		// no items yet
	}

	// --------------------------------------------------------------
	public void push(String j) // put item on top of stack
	{
		stackArray[top++] = j;
		// increment top, insert item (push data)

	}

	// --------------------------------------------------------------
	public String pop() // take item from top of stack
	{
		return stackArray[--top];
		// access item, decrement top (pop data)
	}

	// --------------------------------------------------------------
	public boolean isEmpty() // true if stack is empty
	{
		return stackArray.length == 0;
		// check your stack (empty)
	}

	// --------------------------------------------------------------
	public boolean isFull() // true if stack is full
	{
		return stackArray.length != 0;
		// check your stack (full)
	}
	// --------------------------------------------------------------
} // end class StackX

public class Lab3ForStd {
	public static void main(String[] args) {
		// declare variables
		int i;
		// declare StackA variable
		Scanner scanner = new Scanner(System.in);

		StackA stackA = new StackA(5);

		for (i = 0; i < stackA.maxSize; i++) { // for loop = Stack Size
			// push data
			System.out.printf("Push Data %d : ", i + 1);
			stackA.push(scanner.next());
		}
		System.out.print("--------------------------");
		if (stackA.isFull()) { // check if not empty
			for (i = 0; i < stackA.maxSize; i++) { // for loop = Stack Size
				// pop data
				System.out.printf("\nPop Data %d : %s", i+1, stackA.pop());
				// display it
			}
		}
		System.out.println(" ");

	}
}