package JavaSessions;

public class Training {

	String name;
	String course;
	String time;
	
	public Training() {
		
	}

	public Training(String name, String course, String time) {
		this.name = name;
		this.course = course;
		this.time = time;
	}
	
	 @Override	//this method is overriding from object class.
	 //too string means the string representation of object.
	public String toString() {
		return "Training [name=" + name + ", course=" + course + ", time=" + time + "]";
	}

	public static void main(String args[]) {
		 Training tr = new Training("Naveen","Java","7AM IST");
		// System.out.println(tr);	//JavaSessions.Training@15db9742 -- it will print memory allocation address.
		 System.out.println(tr.toString());
		 
	 }
	
	
	
}
