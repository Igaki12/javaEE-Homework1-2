package model;

public class CaliculateSum {
	
	public int CaliculateSum(String strnumber) {
		
		strnumber.trim();
		try {
			int intnumber = Integer.parseInt(strnumber);
			int sum = 0;
			for (int i = 0; i <= intnumber; i++) {
				sum += i;
			}
			return sum;
			
		}catch (Exception e) {
			System.out.println("Enter the Natural number only.");
			return 0;
		}
	}
}