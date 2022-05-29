class Link
{
  public int value; // integer data
  public Link next; // reference to next link
}

class LinkList
{
  private Link first; // ref to first Link on list
  
  public LinkList() {
	  first = null;
  }
  
  public static Link getnode(int value){
	  Link n = new Link();
	  n.value = value;
	  n.next = null;
	  return n;
  }
  
  public void insertFirst(int value)
  { // make new link
	  Link newLink = getnode(value);
	  newLink.next = first; // it points to old first link
	  first = newLink; // now first points to this
  }
  
  public boolean islempty()
  {
    return (first == null);
  }
  
  public void printlst()
  {
    Link ptr = first;
    while(ptr != null){
      System.out.print(ptr.value + " ");
      ptr =  ptr.next;   // next node
    }
  }
  
  // TODO: (1) add a method findMax() to return an index of the max element
//  public int findMax() {
//
//  }
	  public int findMax() {
		  if (first == null) {
				return -1;
		  }
		  Link ptr = first;
		  int max = ptr.value;
		  while (ptr != null) {
		  	if (ptr.value > max) 
		  		max = ptr.value;
		  		ptr = ptr.next;
		  }
		  	return max;
		  }
	  // TODO: (2) add a method removeMax() to remove the max element and shift all the elements up
	//  public int removeMax(){
	//	  
	//  }
	  public int removeMax(){
		  int key = findMax();
			if (key == -1) {
				System.out.println("Cannot remove max.Array is empty.");
			return -1;
			}
			else {
			System.out.println(key + " has been removed.");
			
			Link current = first;
			Link previous = first;
			while(current.value != key){
				if (current.next == null) 
					return -1;
				
				else{
					previous = current;
					current = current.next;
				}	
			}
			if(current == first) {
					first = first.next;
			}
			else {
				previous.next = current.next;
			}
			return 0;
	  }
	  }
}

public class LabLinkedList {
	public static void main(String[] args) {
		LinkList numlist = new LinkList();
		
		numlist.insertFirst(28);
		numlist.insertFirst(96);
		numlist.insertFirst(75);
		numlist.insertFirst(162);
		
		numlist.printlst();
		System.out.println();
		
//		System.out.println(numlist.findMax());
//		
//		numlist.removeMax();
//		numlist.printlst();
		System.out.println("index number: " + numlist.findMax());
		
		numlist.removeMax();
		numlist.printlst();
	}
}
