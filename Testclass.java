package exercise_6;

public class Testclass {

	public static void main(String[] args) {
		DoubleList myList = new DoubleList();
		System.out.println("before adding node "+myList.getLength());
		ListNode node =new ListNode(16);
		myList.add(node);
		node =new ListNode(15);
		myList.add(node);
		node =new ListNode(9);
		myList.add(node);
		System.out.println("element 1 = "+ myList.getValueAt(0));
		System.out.println("element 2 = "+ myList.getValueAt(1));
		System.out.println("element 3 = "+ myList.getValueAt(2));
		
		System.out.println("after adding node "+ myList.getLength());
	}
}
