package Test;

public class ZoomMeeting {

	public static void main(String[] args) {
		 Meeting m = new Meeting(111, "test123");
		 System.out.println(m.id);
		//System.out.println(m.pwd); its a private so can not be accessed outside class.
		 m.start();
		 System.out.println(m.studentCount);
		 System.out.println(m.isRecorded);

	}

}
