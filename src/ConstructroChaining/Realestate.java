package ConstructroChaining;

public class Realestate extends Business{

	public Realestate(String type, int revenue, String branches) {
		super(type, revenue, branches);
		
	}

	public Realestate() {
		System.out.println("default Realestate constructor");
	}

	public static void main(String[] args) {

		Realestate rs = new Realestate("Realestate", 1000, "Bangalore");
		System.out.println(rs.type);
		
		Realestate rs1 = new Realestate();
		
		

	}

}
