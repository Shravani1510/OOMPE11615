package exercise_6;

public class ListNode {
	private ListNode previous;
	private ListNode next;
    private	double value;
public ListNode(double value) {
	this.value = value;
}
public ListNode getNext() {
	return this.next;
}
public ListNode getPrevious() {
	return this.previous;
}
public void setNext(ListNode next) {
	this.next = next;
}
public void setPrevious(ListNode previous) {
	this.previous = previous;
}
public double getValue() {
	return this.value;
}
}
