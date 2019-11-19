package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();	//Virtual/default capacity of ArrayList is 10(0-9).
										//it will keep creating virtual/default capacity by 10 after every 10th slot.
		System.out.println(al.size()); 	//0 .size() will always count the physical capacity thats why it will give you 0.
		al.add(100);	//index.0
		al.add(200);	//index.1
		
		System.out.println(al.size());	//in array we use .length but in ArrayList we use .size()
		System.out.println(al.get(0));
		
		al.add(300);	//index.2
		al.add(400);	//index.3
		System.out.println(al.size());
		
		al.add(500);	//index.4
		al.add(600);	//index.5
		System.out.println(al.size());
		al.remove(3);	//400
		System.out.println(al.get(3));	//500
		System.out.println(al.size());
		//System.out.println(al.get(6));		//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 6, Size: 5		
		al.add("data");		//if you don't restrict data-type you can add any values.
		al.add(10.55);

		ArrayList<String> Students = new ArrayList<String>();	
		Students.add("ale");
		Students.add("kate");
		Students.add("chris");
		//Students.add("ch");
		System.out.println(Students.size());
		
		ArrayList<Integer> studentAge = new ArrayList<Integer>();
		studentAge.add(25);
		studentAge.add(27);
		studentAge.add(29);
		//studentAge.add(20);
		
		System.out.println(Students.get(0)+" "+studentAge.get(0));
		
		for(int i = 0; i<Students.size(); i++) {
			System.out.println(Students.get(i) +" "+ studentAge.get(i));
		}
		
		for(String s : Students) {	//short cut/quick version of for-loop.
			System.out.println(s);
		}
		
		Students.forEach((a)->System.out.println(a));	//Lambda expression
		
		ArrayList<Double> heightList = new ArrayList<Double>();
		heightList.add(5.6);
		heightList.add(25.00);
		//heightList.forEach((h->System.out.println(h)));
		heightList.forEach((m)->System.out.println(m));
		
	}

}
