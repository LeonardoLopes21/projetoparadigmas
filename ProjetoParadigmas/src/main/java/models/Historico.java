package models;

public class Historico {
	
	private double A1;
	
	private double A2;
	
	private double A3;

	

	public Historico(double a1, double a2, double a3) {
		A1 = a1;
		A2 = a2;
		A3 = a3;
	}
	
	

	public Historico(double a1, double a2) {
		A1 = a1;
		A2 = a2;
		this.A3 = 0;
	}



	public double getA1() {
		return A1;
	}

	public void setA1(double a1) {
		A1 = a1;
	}

	public double getA2() {
		return A2;
	}

	public void setA2(double a2) {
		A2 = a2;
	}

	public double getA3() {
		return A3;
	}

	public void setA3(double a3) {
		A3 = a3;
	}

	
	public double media() {
		return ((this.getA1() + this.getA2()) / 2);
	}
	
	public boolean isA3Necessary() {
		
		boolean bothgrades0 = this.getA1() == 0 && this.getA2() == 0;
		boolean atLeast1isLowerThan6ButNotBoth =  this.getA1() < 6 ^ this.getA2() < 6;
		boolean bothLowerThan2 = this.getA1() < 2 && this.getA2() < 2;
		
		if(!bothgrades0 && atLeast1isLowerThan6ButNotBoth && !bothLowerThan2) {
			return true;
		} else {
			return false;
		}
		
		
		
	}
	
	public String findLowest() {
		if(this.getA1() > this.getA2()) {
			return "A2";
		} else if(this.getA1() < this.getA2()) {
			return "A1";
		}
		
		else {
			return "equal";
		}
	}
	
	public boolean mediaWithA3() {
		
		if(this.findLowest().equals("A1") && this.getA3() > this.getA1()) {
			this.setA1(this.getA3());
		} else if (this.findLowest().equals("A2") && this.getA3() > this.getA2()) {
			this.setA2(this.getA3());
		} else if (this.findLowest().equals("equal")) {
			this.setA1(this.getA3());
		}
		
		return this.media() >= 6;
		
	}
	
	public boolean isApproved() {
		if(this.getA3() == 0) {
			
			if(this.media() > 6) {
				
				return true;
				
			} else {
				return false;
			}
		} else {
			if(this.mediaWithA3()) {
				return true;
			} else {
				return false;
			}
		}
		
	}
	
	
	
	
	

}
