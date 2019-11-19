package JavaSessions;

public class ArrayAssignment {

	public static void main(String[] args) {

		// 1.
		for (int j = 0; j <= 9; j++) {
			for(int k=0; k<=9; k++) {
			System.out.print(j+""+k+" ");
		}
		System.out.println();
		}
		
	
		Object cricketersData[][] = new Object[2][6];
		cricketersData[0][0] = "MS DHoni";
		cricketersData[0][1] = 38;
		cricketersData[0][2] = "Team India";
		cricketersData[0][3] = "07-July-1981";
		cricketersData[0][4] = 'M';
		cricketersData[0][5] = 87.69;

		cricketersData[1][0] = "Virat Kohli";
		cricketersData[1][1] = 30;
		cricketersData[1][2] = "Team India";
		cricketersData[1][3] = "05-Nov-1988";
		cricketersData[1][4] = 'M';
		cricketersData[1][5] = 59.51;

		for (int row = 0; row < cricketersData.length; row++) {
			for (int col = 0; col < cricketersData[0].length; col++) {
				System.out.println(cricketersData[row][col]);
			}

		}

	}

}

