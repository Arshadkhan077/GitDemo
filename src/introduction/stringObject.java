package introduction;

public class stringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Arshad";
		String s1 = "Arshad";
		String s2 = "Vineeth";
		
		System.out.println(s.hashCode()+ " " + s1.hashCode() + " " + s2.hashCode());
		
		if(s == s1) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		String s3 = new String("Arshad");
		String s4 = new String("Arshad");
		String s5 = new String("Vineeth");
		
		System.out.println(s3.hashCode() + " " + s4.hashCode() + " " + s5.hashCode());
		if(s3 == s4) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		String s6 = "Rahul Shetty Academy";
		String[] splitted =s6.split("Shetty");
		System.out.println(s6.length());
		System.out.println(splitted[1].trim());
		
		splitted[1].trim();
		
		for(int i=0 ; i<s6.length() ; i++) {
			System.out.println(s6.charAt(i));
		}
		
		System.out.println("reversed characters are .............");
		for(int i = s6.length()-1 ; i>=0 ; i--) {
			System.out.println(s6.charAt(i));
		}
		
		System.out.println(s6.charAt(19));
		
	}

}
