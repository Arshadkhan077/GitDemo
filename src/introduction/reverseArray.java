package introduction;

import java.util.ArrayList;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse a array 
		
		int[] arr = {25,35,45,55,65,75};
		
		int start = arr[0];
		int end = arr.length -1;
		ArrayList<Integer> reverse = new ArrayList();
		for (int i=end ; i >=0 ; i--) {
			System.out.println(arr[i]);
			reverse.add(arr[i]);
		}
		
		System.out.print("reversed are ");
		
		for(int s : reverse) {
			System.out.print(s + " ");
		}
		Integer[] rev=(Integer[]) reverse.toArray();
		int[] array2 = new int[arr.length];
		System.arraycopy(rev,5, array2, 0, 6);
		
		System.out.println("copied to array2 ascending");
		for(int s : array2) {
			System.out.println(s + " ");
		}
	}

}
