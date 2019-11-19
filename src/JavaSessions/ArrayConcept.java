package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//array: Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        //To declare an array, define the variable type with square brackets[].
		//for any array lowest index is always:0 and highest index is:length of the index -1 
		//limitations of Array: 1.the size is fixed (thats why its called static array)
							//	2. its not dynamic in nature (it's only stores the same type of data)
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30; // if you create memory allocation for 4 but if no assigned value is there then
					// it will print default value 0 for that variable.
		i[3] = 40;
		// System.out.println(i); //[I@15db9742
		System.out.println(i.length);
		System.out.println(i[0]);
		System.out.println(i[2]);
		System.out.println(i[1] + i[3]);
		// important interview question: what will happen if you try to access the values that are not at all available in the memory.
		// System.out.println(i[4]); // java.lang.ArrayIndexOutOfBoundsException:
		// System.out.println(i[-1]);
		
		// if you want to print all the values from an array then use forloop:
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		//double array:
		double d[] = new double[2];
		d[0]=20.5;
		d[1]=100;
		System.out.println(d[0]+"test"+d[1]);	//20.5test100.0
		
		String s[]=new String [4];
		s[0]="Sam";
		s[1]="Nik";
		s[2]="Tom";
		s[3]="Ann";
		
		System.out.println(s[3]);
		System.out.println(s[1]);	//null : here the default value will be null
		for(int n=0; n<s.length;n++) {
			System.out.println(s[n]);
		}
		
		//solution for 2nd limitation: storing different types of data.
		//Object class is already available in java and its a parent(super class) of all the default classes available in java.
		Object emp[] = new Object[5];
		emp[0]="Tom";
		emp[1]=25;
		emp[2]='M';
		emp[3]=5.8;
		emp[4]="Accounts";
		
		for(int e=0; e<emp.length; e++) {
			System.out.println(emp[e]);
		}
		
	}

}
