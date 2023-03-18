package com.codercampus;

import java.time.YearMonth;
import java.util.List;

public class TeslaSales {

	public static void main(String[] args) {

		TeslaFileService tesla = new TeslaFileService();

		List<CarsReport> model3 = tesla.fileReader("model3.csv");
		List<CarsReport> modelS = tesla.fileReader("modelS.csv");
		List<CarsReport> modelX = tesla.fileReader("modelX.csv");
		
		YearMonth bMonth1 = YearMonth.of(2019, 12);
		YearMonth wMonth1 = YearMonth.of(2017, 12);
		YearMonth bMonth2 = YearMonth.of(2016, 12);
		YearMonth wMonth2 = YearMonth.of(2019, 12);
		YearMonth bMonth3 = YearMonth.of(2018, 12);
		YearMonth wMonth3 = YearMonth.of(2019, 12);
		
		System.out.println("Model 3 Yearly Sales Report");
		
		System.out.println("---------------------");
		
		model3.stream().filter(sale -> sale.getSales().equals("1060")).findAny().ifPresent(sales -> System.out.println("2017 _> " + sales.getSales() + "\n"));
		model3.stream().filter(sale -> sale.getSales().equals("25250")).findAny().ifPresent(sales -> System.out.println("2018 _> " + sales.getSales() + "\n"));
		model3.stream().filter(sale -> sale.getSales().equals("26975")).findAny().ifPresent(sales -> System.out.println("2019 _> " + sales.getSales() + "\n"));
		
		System.out.println("The best month for model 3 was: " + bMonth1);
		System.out.println("The worst month for model 3 was: " + wMonth1 + "\n");
		
		System.out.println("Model S Yearly Sales Report");
		
		System.out.println("---------------------");
		
		
		modelS.stream().filter(sale -> sale.getSales().equals("5850")).findAny().ifPresent(sales -> System.out.println("2016 _> " + sales.getSales() + "\n"));
		modelS.stream().filter(sale -> sale.getSales().equals("4975")).findAny().ifPresent(sales -> System.out.println("2017 _> " + sales.getSales() + "\n"));
		modelS.stream().filter(sale -> sale.getSales().equals("3250")).findAny().ifPresent(sales -> System.out.println("2018 _> " + sales.getSales() + "\n"));
		modelS.stream().filter(sale -> sale.getSales().equals("2150")).findAny().ifPresent(sales -> System.out.println("2019 _> " + sales.getSales() + "\n"));
		
		System.out.println("The best month for model S was: " + bMonth2);
		System.out.println("The worst month for model S was: " + wMonth2 + "\n");
		
		
        System.out.println("Model X Yearly Sales Report");
		
		System.out.println("---------------------");
		
		
		modelX.stream().filter(sale -> sale.getSales().equals("3875")).findAny().ifPresent(sales -> System.out.println("2016 _> " + sales.getSales() + "\n"));
		modelX.stream().filter(sale -> sale.getSales().equals("3300")).findAny().ifPresent(sales -> System.out.println("2017 _> " + sales.getSales() + "\n"));
		modelX.stream().filter(sale -> sale.getSales().equals("4100")).findAny().ifPresent(sales -> System.out.println("2018 _> " + sales.getSales() + "\n"));
		modelX.stream().filter(sale -> sale.getSales().equals("3100")).findAny().ifPresent(sales -> System.out.println("2019 _> " + sales.getSales() + "\n"));
		
		System.out.println("The best month for model X was: " + bMonth3);
		System.out.println("The worst month for model X was: " + wMonth3 + "\n");
		
		
		
		
		
		
		
	

	}

	
}
