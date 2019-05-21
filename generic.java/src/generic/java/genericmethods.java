package generic.java;

public class genericmethods {

	public static void main(String[] args) {
		Integer[] intArray= {10,20,30,40,50};
		Double[] doubleArray= {1.4,3.44,3.8,9.1};
		Character[] charArray= {'a','p','p','l','e'};
		
	
	
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
	}
		
		
public static <T> void displayArray(T[] ary) {
	for(int i=0;i<ary.length;i++) {

		System.out.println(ary[i]);
}
System.out.println ();	
}	

}
