
public class BST {
	private class TNode {
		public int item;
		TNode left;
		TNode right;
		public TNode (int newItem) {
			this.item = newItem;
			left = null;
			right = null;
		}
	}
	TNode root;
	public BST() {
		root = null;
	}
	
	private TNode insert (TNode currNode, int newItem) {
		if (currNode == null) {
			currNode = new TNode(newItem);
			return currNode;
		}
		else if (newItem < currNode.item) {
			currNode.left = insert(currNode.left, newItem);
		}
		else {
			currNode.right = insert(currNode.right, newItem);
		}
		return currNode;
	}
	
	public void putItem(int newItem) {
		root = insert(root, newItem);
	}
	
	void printNodes(TNode currNode) {
	    if (currNode == null) return;

	    printNodes(currNode.left);
	    System.out.print(currNode.item + " ");
	    printNodes(currNode.right);
	}

	
	boolean isEmpty() {
		return root==null;
	}
	
	void printTree() {
		if (isEmpty()) {
			System.out.println("Empty tree");
		}
		else {
			printNodes(root);
		}
	}
	
	int findItem(TNode currNode, int gItem) {
		if (currNode == null) {
			return -1;
		}
		if (currNode.item == gItem) {
			return currNode.item;
		}
		else if (gItem < currNode.item) {
			return findItem(currNode.left, gItem);
		}
		else { 
			return findItem(currNode.right, gItem);
		}
		
	}
	
	int getItem(int gItem) {
		return findItem(root, gItem);
	}
}
