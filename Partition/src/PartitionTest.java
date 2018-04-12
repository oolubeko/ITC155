import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

public class PartitionTest {

	@Test
	public void testPartition() {
		ArrayList<Integer> a_list = new ArrayList<Integer>();
		LinkedList<Integer> l_list = new LinkedList<Integer>();
		
		//Test that partition works for an ArrayList
		a_list.add(4);
		a_list.add(7);
		a_list.add(9);
		a_list.add(2);
		a_list.add(8);
		a_list.add(3);
		a_list.add(1);
		
		
		Partition.partition(a_list,5);
		ArrayList<Integer> final_list = new ArrayList<Integer>();
		final_list.add(4);
		final_list.add(2);
		final_list.add(3);
		final_list.add(1);
		final_list.add(7);
		final_list.add(9);
		final_list.add(8);
		
		assertEquals(final_list,a_list);
		for(int i = 0; i < 4; i++) {
			assertTrue(a_list.get(i) < 5);
		}
		
		//Test that partition works for a LinkedList
		l_list.add(4);
		l_list.add(7);
		l_list.add(9);
		l_list.add(2);
		l_list.add(8);
		l_list.add(3);
		l_list.add(1);
		
		Partition.partition(l_list, 5);
		LinkedList<Integer> final_l_list = new LinkedList<Integer>();
		final_l_list.add(4);
		final_l_list.add(2);
		final_l_list.add(3);
		final_l_list.add(1);
		final_l_list.add(7);
		final_l_list.add(9);
		final_l_list.add(8);
		
		assertEquals(final_l_list,l_list);
		for(int i = 0; i < 4; i++) {
			assertTrue(l_list.get(i) < 5);
		}
		
		
	}

}
