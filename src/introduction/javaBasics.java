package introduction;

public class javaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int[] arr = new int[5];
		 * 
		 * arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[4] = 4;
		 * 
		 * System.out.println(arr[3]);
		 */

//		int[] arra = { 1, 2, 3 };
//
//		System.out.println(arra[2]);
		
		String[] name= new String[5];
		name[0]="arshad";
		name[2]="rahul";
		name[3]="shetty";
		
		for(int i=0 ; i<name.length; i++)
		{
			
			if(name[i] == null) {
				System.out.println(0);
			}
			else {
				System.out.println(name[i]);
			}
		}
	}

}
