package Academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,4,6,7,2,3,5,4,3,8,2,8};
		HashSet<Integer> linkedHashSet = new HashSet<Integer>(arr);
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,4,6,7,2,3,5,4,3,8,2,8));
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		ArrayList<Integer> numbersListWithoutDuplicate = new ArrayList<Integer>(linkedHashSet);
		System.out.println(numbersListWithoutDuplicate);
		System.out.println(linkedHashSet);
	}

}
