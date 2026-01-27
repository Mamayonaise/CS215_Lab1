package slist;

public class Ar_SList {
	public static final int MAXSIZE = 10;
	private int[] ListItems;
	private int length;
	private int currentPos = 0;
	
	public Ar_SList() {
		length = 0; //list is initially empty
		ListItems = new int[MAXSIZE];
	}
	
	public void putItem(int item) {
		int aLoc = 0;
		boolean moreToSearch = aLoc < length;
	    while (moreToSearch) {
	        if (item < ListItems[aLoc]) {
	        	moreToSearch = false;
	        }
	        else {
	        	aLoc++;
	        	moreToSearch = aLoc < length;
	        }
	    }





	    for (int i = length; i > aLoc; i--) {
	    	ListItems[i] = ListItems[i-1];
	    }
    	ListItems[aLoc] = item;
    	length++;
	}
	
	public void deleteItem(int item) {
		int aLoc = 0;
		boolean moreToSearch = true;
		while (moreToSearch && aLoc < length) {
			if (item == ListItems[aLoc]) {
				moreToSearch = false;
				;
			}
			else {
				aLoc++;
			}
		}
		
		for (int i = aLoc; i < length; i++) {
			if (i < MAXSIZE -1) { //if aLoc reached right before the maxsize
				ListItems[i] = ListItems[i+1]; //every item gets replaced from 		}
			}
		length--;
		}
	}
	
	int getItem(int gItem) {
	    int midPoint=0, first=0, last=length-1;
	    boolean moreToSearch = first <= last;
	    while (moreToSearch) {
	        midPoint = (first + last)/2; //midpoint is half of the length
	        if (gItem == ListItems[midPoint]) { //
	        	return midPoint;
	        }
	        else if (gItem < ListItems[midPoint]) { //if the item is below the midpoint
	        	last = midPoint - 1; // the new upper bound is midPoint - 1
	        }
	        else { //else 
	        	first = midPoint + 1; //the lower bound is midPoint + 1
	        }
	        
	        moreToSearch = first <= last; //there's more to search, unless first is greater than last
	    }
	    
	    return -1; //if the item doesn't exist
	}
	
	void makeEmpty() {
		length = 0;
	}
	
	boolean isFull() {
		return length == MAXSIZE;
	}

	void resetList() {
		currentPos = 0;
	}
	
	int getNextItem() {
		currentPos++;
		return ListItems[currentPos-1];
	}
	
	int getLength() {
		return length;
	}
	
	void printList() {
		System.out.print("(");
		for (int loc=0; loc<length; loc++) {
			System.out.print(ListItems[loc]);
			if (loc<length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print(")");
	}
	
}
