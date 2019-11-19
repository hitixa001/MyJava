package JavaSessions;

public class TwoDimArray {

	public static void main(String[] args) {

		//
//		
//		int data[][]=new int[3][3];
//		data[0][0]=10;
//		

		int data[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		
		for(int row=0; row<data.length; row++) {
			for(int col=0; col<data.length;col++) {
				System.out.print(data[row][col]+" ");
			}
			System.out.println();
			}

	}

}
