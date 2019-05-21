package generic.java;

public class genericclass {
	public static void main(String[] args) {
		
		
		Genericclasss<Integer> ic=new Genericclasss<Integer>();
		Genericclasss<Double> dc=new Genericclasss<Double>();
		Genericclasss<String> cc=new Genericclasss<String>();
		

		ic.setvar(10);
		System.out.println(ic.getvar().doubleValue());
		
	dc.setvar(10.1);
		System.out.println(dc.getvar().intValue());
		
		cc.setvar("Apple");
		System.out.println(cc.getvar().charAt(1));
		
		
		
	} 
	

}
