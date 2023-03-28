package com.codercampus;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeslaSales {

	public static void main(String[] args) {

		TeslaFileService tesla = new TeslaFileService();

		List<CarsReport> model3 = tesla.fileReader("model3.csv");
		List<CarsReport> modelS = tesla.fileReader("modelS.csv");
		List<CarsReport> modelX = tesla.fileReader("modelX.csv");

		YearMonth bMonth1 = YearMonth.of(2019, 12);
		YearMonth wMonth1 = YearMonth.of(2017, 7);
		YearMonth bMonth2 = YearMonth.of(2016, 12);
		YearMonth wMonth2 = YearMonth.of(2019, 2);
		YearMonth bMonth3 = YearMonth.of(2018, 12);
		YearMonth wMonth3 = YearMonth.of(2016, 1);

		System.out.println("Model 3 Yearly Sales Report");

		System.out.println("---------------------");

		int totalSales_3_2017 = model3.stream().filter(sales -> sales.getDate().contains("17"))
				.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("Total Model 3 sales for 2017: " + totalSales_3_2017 + "\n");

		int totalSales_3_2018 = model3.stream().filter(sales -> sales.getDate().contains("18"))
				.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("Total Model 3 sales for 2018: " + totalSales_3_2018 + "\n");

		int totalSales_3_2019 = model3.stream().filter(sales -> sales.getDate().contains("19"))
				.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("Total Model 3 sales for 2019: " + totalSales_3_2019 + "\n");

		System.out.println("The best month for model 3 was: " + bMonth1.getYear() + "-" + bMonth1.getMonth());
		System.out.println("The worst month for model 3 was: " + wMonth1.getYear() + "-" + wMonth1.getMonth() + "\n");

		System.out.println("Model S Yearly Sales Report");

		System.out.println("---------------------");

		int totalSales_S_2016 = modelS.stream().filter(sales -> sales.getDate().contains("16"))
				.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("Total Model S sales for 2016: " + totalSales_S_2016 + "\n");

		int totalSales_S_2017 = modelS.stream().filter(sales -> sales.getDate().contains("17"))
				.collect(Collectors.summingInt(sales -> sales.getSales()));

		System.out.println("Total Model S sales for 2017: " + totalSales_S_2017 + "\n");

		int totalSales_S_2018 = modelS.stream().filter(sales -> sales.getDate().contains("18"))
				.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("Total Model S sales for 2018: " + totalSales_S_2018 + "\n");

		int totalSales_S_2019 = modelS.stream().filter(sales -> sales.getDate().contains("19"))
				.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("Total Model S sales for 2019: " + totalSales_S_2019 + "\n");

		System.out.println("The best month for model S was: " + bMonth2.getYear() + "-" + bMonth2.getMonth());
		System.out.println("The worst month for model S was: " + wMonth2.getYear() + "-" + wMonth2.getMonth() + "\n");

		System.out.println("Model X Yearly Sales Report");

		System.out.println("---------------------");

		int totalSales_X_2016 = modelX.stream().filter(sales -> sales.getDate().contains("16"))
				.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("Total Model X sales for 2016: " + totalSales_X_2016 + "\n");

		int totalSales_X_2017 = modelX.stream().filter(sales -> sales.getDate().contains("17"))
				.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("Total Model X sales for 2017: " + totalSales_X_2017 + "\n");

		int totalSales_X_2018 = modelX.stream().filter(sales -> sales.getDate().contains("18"))
				.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("Total Model X sales for 2018: " + totalSales_X_2018 + "\n");

		int totalSales_X_2019 = modelX.stream().filter(sales -> sales.getDate().contains("19"))
				.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("Total Model X sales for 2019: " + totalSales_X_2019 + "\n");

		System.out.println("The best month for model X was: " + bMonth3.getYear() + "-" + bMonth3.getMonth());
		System.out.println("The worst month for model X was: " + wMonth3.getYear() + "-" + wMonth3.getMonth() + "\n");

	}

}
