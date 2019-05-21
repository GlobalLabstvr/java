package interfacepackage;

public enum direction {
	North(0),East(90),South(180),West(270);
	
	 private int degree;
	private direction(int d) {
		degree= d;
		
		
	}
	public int getDegree() {
		return degree;
	}
	public void setDegree(int degree) {
		this.degree = degree;
	}

	

}
