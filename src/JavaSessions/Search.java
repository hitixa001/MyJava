package JavaSessions;

public class Search {

	public static void main(String[] args) {
		
		Search s = new Search();
		s.search("iphone11");
		int finalPrice = s.search("iphone11", 95000);
		System.out.println("final price is: "+finalPrice);

	}
	
	public void search (String productName) {
		System.out.println("search is done by "+ productName);
	}
	
	//this is also method overloading 
	public int search (String productName, int price) {
		System.out.println("search is done by "+ productName);
		System.out.println("search is done by "+ price);
		
		int totalPrice= price-100;
		return totalPrice;
	}

}
