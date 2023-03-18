package com.codercampus;

public class CarsReport {

	private String month;

	private String sales;

	public CarsReport(String month, String sales) {
		this.month = month;
		this.sales = sales;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "CarsReport [month=" + month + ", sales=" + sales + "]";
	}

	
}
