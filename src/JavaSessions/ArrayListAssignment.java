package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment {

	public static void main(String[] args) {
		// 1.
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("White");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Red");
		colors.add("Green");
		System.out.println(colors);
		System.out.println("the colors list are: ");
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));

		}
		// 2.
		ArrayList<String> names = new ArrayList<String>();
		names.add("Tom");
		names.add("Sam");
		names.add("Patric");
		System.out.println("the names on the namesList are: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		names.add(0, "Dann");
		names.add(4, "Joe");
		System.out.println("the new names on the namesList are: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		// 3.
		ArrayList<String> people = new ArrayList<String>();
		people.add("Sam");
		people.add("Tom");
		System.out.println("Values at the position 0 is: " + people.get(0));

		// 4.
		ArrayList<String> admin = new ArrayList<String>();
		admin.add("Sam");
		admin.add("Tom");
		System.out.println(admin);
		admin.set(1, "Joe");
		System.out.println(admin);

		// 5.
		ArrayList<String> colors1 = new ArrayList<String>();
		colors1.add("White");
		colors1.add("Blue");
		colors1.add("Yellow");
		colors1.add("Orange");
		System.out.println(colors1);
		colors1.remove(3);
		System.out.println(colors1);

		// 6.
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		boolean b = num.contains(20);
		System.out.println("num arrayList contains 20: " + b);

		// 7.
		ArrayList<Integer> reverse = new ArrayList<Integer>();
		reverse.add(100);
		reverse.add(200);
		reverse.add(300);
		reverse.add(400);
		reverse.add(500);
		System.out.println("before reverse order");
		for (int i = 0; i < reverse.size(); i++) {
			System.out.println(reverse.get(i));
		}
		System.out.println("after reverse order");
		for (int i = reverse.size() - 1; i >= 0; i--) {
			System.out.println(reverse.get(i));
		}

		// 8.
		ArrayList<String> colorCode = new ArrayList<String>();
		colorCode.add("White");
		colorCode.add("Blue");
		colorCode.add("Yellow");
		colorCode.add("Orange");
		colorCode.add("Red");
		colorCode.add("Green");
		System.out.println(colorCode);

		System.out.println(colorCode.subList(1, 4));

		// 9.
		ArrayList<Double> d = new ArrayList<Double>();
		d.add(10.20);
		d.add(20.5);
		d.add(30.15);
		System.out.println("Before Swapping: " + d);
		Collections.swap(d, 2, 1);
		System.out.println("After Swapping: " + d);

		// 10.
		ArrayList<String> colorCode1 = new ArrayList<String>();
		colorCode1.add("White");
		colorCode1.add("Blue");
		colorCode1.add("Yellow");
		colorCode1.add("Orange");
		colorCode1.add("Red");
		colorCode1.add("Green");
		System.out.println("before removing all the values from the arrayList: " + colorCode1);
		colorCode1.removeAll(colorCode1);
		System.out.println("after removing all the values from the arrayList: " + colorCode1);

		// 11.
		ArrayList<String> country = new ArrayList<String>();
		country.add("USA");
		country.add("UK");
		country.add("SWITZERLAND");
		country.add("CANADA");
		System.out.println(country);
		country.trimToSize();

		// 12.
		ArrayList<String> countryNames = new ArrayList<String>();
		countryNames.add("USA");
		countryNames.add("UK");
		countryNames.add("SWITZERLAND");
		countryNames.add("CANADA");
		System.out.println(countryNames.get(2));

	}

}
