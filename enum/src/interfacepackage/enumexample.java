package interfacepackage;

public class enumexample {

	public static void main(String[] args) {
	
		 enumexample obj=new enumexample();
		//obj.turn(direction.East);
		//System.out.println(directionconstants.East);
		//System.out.println(direction.East.ordinal);
		
		for (int i=0; i<direction.values().length; i++) {
		System.out.println(direction.values()[i].getDegree());	
		 }
	
	}
	public void turn( direction dir) {
		switch(dir)
		{
		case East:
		
		System.out.println("turn east");
		break;
		case West:
			System.out.println("turn west");
			break;
		case South:
			
			System.out.println("turn south");
			break;	
		case North:
			
			System.out.println("turn north");
			break;
			default:
			System.out.println("don't turn");
			break;
		}
		
	}

}
