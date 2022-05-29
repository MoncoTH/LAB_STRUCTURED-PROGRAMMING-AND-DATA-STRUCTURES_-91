// LabArray.java
// demonstrates array class with low-level interface
// to run this program: C>java LabArray
class SimpleArray {
	private long[] a; // ref to array a

	public SimpleArray(int size) { // constructor
		a = new long[size];
	} // create array

	public void setElem(int index, long value) { // set value
		a[index] = value;
	}

	public long getElem(int index) { // get value
		return a[index];
	}

	// TODO: (1) add a method findMax(int nElems) to return an index of the max
	// element
	public int findMax(int nElems) {
		int maxIndex = -1;
		long max = a[0];
		if (nElems == 0) {
			return -1;
		}
		for (int j = 0; j < nElems; j++) // for each element,
			if (a[j] > max) { // found item?
				max = a[j];
				maxIndex = j;
			}
		return maxIndex;

	}

	// TODO: (2) add a method removeMax() to remove the max element and shift all
	// the elements up
	public long removeMax(int nElems) {
		int maxIndex = findMax(nElems);
		if (maxIndex == -1) {
			System.out.println("Cannot find max. Array is empty.");
			return -1;
		}
		System.out.println(a[maxIndex] + " has been removed.");
		for (int i = maxIndex; i < nElems - 1; i++) {
			a[i] = a[i + 1];

		}
		return a[maxIndex];

	}
} // end class LowArray

public class LabArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleArray arr; // reference
		arr = new SimpleArray(100); // create LowArray object
		int nElems = 0; // number of items in array
		int j; // loop variable

		arr.setElem(0, 77); // insert 10 items
		arr.setElem(1, 99);
		arr.setElem(2, 44);
		arr.setElem(3, 55);
		arr.setElem(4, 22);
		arr.setElem(5, 88);
		arr.setElem(6, 11);
		arr.setElem(7, 00);
		arr.setElem(8, 66);
		arr.setElem(9, 33);
		nElems = 10; // now 10 items in array

		for (j = 0; j < nElems; j++) // display items
			System.out.print(arr.getElem(j) + " ");
		System.out.println("");

		System.out.println("index number: " + arr.findMax(nElems));
		arr.removeMax(nElems);
		nElems--;
		for (j = 0; j < nElems; j++) // display items after remove max
			System.out.print(arr.getElem(j) + " ");
		System.out.println("");
	}

}
