package model;

import java.io.Serializable;

public class Number implements Serializable {
	
	private String number;
	private int sum;
	

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
}