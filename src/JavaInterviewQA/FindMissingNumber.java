package JavaInterviewQA;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int a[] = {-1,0,1,3,4,5,6,7,8,9,10};
		//1+2+4+5 = 12	actual total
		//1+2+3+4+5 = 15 Excepted total
		//15-12 = 3 missing number
		
		int sum = 0;
		for(int i =0; i<a.length; i++) {
			sum = sum + a[i];	//12
		}
		System.out.println(sum);
		
		int sum1 = 0;
		for (int j = -1; j<=10; j++) {
			sum1 = sum1+j;
		}
		System.out.println(sum1);
	
		System.out.println("Missing number is---> "+(sum1 - sum));
	}

}
