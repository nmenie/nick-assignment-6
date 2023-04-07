package com.codercampus;

import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TeslaSales {

	public static void main(String[] args) {

		TeslaFileService tesla = new TeslaFileService();

		List<CarsReport> model3 = tesla.fileReader("model3.csv");
		List<CarsReport> modelS = tesla.fileReader("modelS.csv");
		List<CarsReport> modelX = tesla.fileReader("modelX.csv");

		

		System.out.println("Model 3 Yearly Sales Report");

		System.out.println("---------------------");

		Map<Object, Integer> totalSales_3 = model3.stream().collect(
				Collectors.groupingBy(date -> date.getDate().getYear(), Collectors.summingInt(CarsReport::getSales)));

		totalSales_3.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " _> " + entry.getValue() + "\n");

		});

		String bestYear = model3.stream().max(Comparator.comparing(CarsReport::getSales)).map(item -> item.getDate())
				.get().format(DateTimeFormatter.ofPattern("yyyy-MMM"));
		System.out.println("The best month for model 3 was: " + bestYear);

		String worstYear = model3.stream().min(Comparator.comparing(CarsReport::getSales)).map(item -> item.getDate())
				.get().format(DateTimeFormatter.ofPattern("yyyy-MMM"));
		System.out.println("The worst month for model 3 was: " + worstYear + "\n");

		System.out.println("Model S Yearly Sales Report");

		System.out.println("---------------------");

		Map<Object, Integer> totalSales_S = modelS.stream().collect(
				Collectors.groupingBy(date -> date.getDate().getYear(), Collectors.summingInt(CarsReport::getSales)));

		totalSales_S.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "_>" + entry.getValue() + "\n");
		});

		String bestYear2 = modelS.stream().max(Comparator.comparing(CarsReport::getSales)).map(item -> item.getDate())
				.get().format(DateTimeFormatter.ofPattern("yyyy-MMM"));
		System.out.println("The best month for model S was: " + bestYear2);

		String worstYear2 = modelS.stream().min(Comparator.comparing(CarsReport::getSales)).map(item -> item.getDate())
				.get().format(DateTimeFormatter.ofPattern("yyyy-MMM"));
		System.out.println("The worst month for model S was: " + worstYear2 + "\n");

		System.out.println("Model X Yearly Sales Report");

		System.out.println("---------------------");

		Map<Object, Integer> totalSales_X = modelX.stream().collect(
				Collectors.groupingBy(date -> date.getDate().getYear(), Collectors.summingInt(CarsReport::getSales)));
		

		totalSales_X.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "_>" + entry.getValue() + "\n");
		});

		String bestYear3 = modelX.stream().max(Comparator.comparing(CarsReport::getSales)).map(item -> item.getDate())
				.get().format(DateTimeFormatter.ofPattern("yyyy-MMM"));
		System.out.println("The best month for model X was: " + bestYear3);

		String worstYear3 = modelX.stream().min(Comparator.comparing(CarsReport::getSales)).map(item -> item.getDate())
				.get().format(DateTimeFormatter.ofPattern("yyyy-MMM"));
        System.out.println("The worst year for model X was: " + worstYear3);
	}
}
