package com.codercampus;

public class CarsReport {

	private String date;

	private Integer sales;

	public CarsReport(String date, Integer sales) {
		this.date = date;
		this.sales = sales;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "CarsReport [month=" + date + ", sales=" + sales + "]";
	}

	
}
