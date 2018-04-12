import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Write a method called partition that accepts a list of integers and an integer value E as its parameter
//and rearranges(partitions) the list so that all the elements with values less than E occur before all 
//elements greater than E. The exact order of the elements is unimportant, as long as all the elements less 
//than E occur before all of the elements greater than E. 

//For example, the linked list [15,1,6,12,-3,4,8,21,2,30,-1,9], one acceptable ordering of the list after a 
//call partition(list, 5) would be [-1,1,2,4,-3,12,8,21,6,30,15,9]. You may assume the list does not contain 
//any duplicates and does not contain the element value E
public class Partition {
	
	public static void partition(List<Integer> list, int E) {
		Iterator<Integer> i = list.iterator();	//Make an iterable for the list
		List<Integer> l = new ArrayList<Integer>();	//Make another list to store the lower values
		while(i.hasNext()) {	//Iterate through the list, remove numbers less than E, and add them to the new List
			int num = i.next();
			if(num <= E) {
				i.remove();
				l.add(num);
			}
		}
		
		list.addAll(0, l);	//add all the elements from the new list to the front of the old list
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List [15,1,6,12,-3,4,8,21,2,30,-1,9]
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(15);
		list.add(1);
		list.add(6);
		list.add(12);
		list.add(-3);
		list.add(4);
		list.add(8);
		list.add(21);
		list.add(2);
		list.add(30);
		list.add(-1);
		list.add(9);
		
		System.out.println(list);
		
		partition(list,5);
		
		System.out.println(list);

	}

}
