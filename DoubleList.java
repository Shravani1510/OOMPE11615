package exercise_6;

public class DoubleList {
	private ListNode root;
	private int length;
public DoubleList() {
	this.length =0;
//	this.root = null; root node doesn't belong to list
	this.root = new ListNode(Double.NaN);
//	this.root.setPrevious(root); pointing itself
}
	public void add(ListNode newNode) {
//	getting last element
		ListNode end = root.getPrevious(); //end=Listend;
		
		if(end == null) {
			end = this.root;
		}
		
	//	add elements
		end.setNext(newNode);
		newNode.setPrevious(end);
		this.root.setPrevious(newNode);
		this.length++;
	}
	/**
	 * the length of the list
	 * @return
	 */
	public int getLength() {
		return this.length;
	}
	public void removeAt(int idx) {
	
	}
	public double getValueAt(int idx) {//idx = position;
		if(idx < 0) {
			throw new IndexOutOfBoundsException("Index must be greater or equals to 0");
		}
		if(idx > this.length) {
			throw new IndexOutOfBoundsException("Index must be smaller or equals to length");
		}
		
		ListNode  temp = this.root;
		for(int i = 0; i <= idx; i++) {
			temp =temp.getNext();
		}
		return temp.getValue();
}
		public DoubleList getSorted() {
			DoubleList sortedList = new DoubleList();
          //ordering
			return sortedList;
		}
}
