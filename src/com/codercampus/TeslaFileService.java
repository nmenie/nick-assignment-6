package com.codercampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class TeslaFileService {
	
	public static List<CarsReport> fileReader(String fileName) {
		List<CarsReport> cars = new ArrayList<>();

		BufferedReader fileReader = null;
		try {
			fileReader=new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] car = null;

		String line;try {
			fileReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while((line=fileReader.readLine())!=null)
			{

				car = line.split(",");
				CarsReport report = new CarsReport(car[0], car[1]);
				cars.add(report);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			try {
				fileReader.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return cars;
	}
	
	public static YearMonth date(Integer year, Integer month) {
		YearMonth bMonth = YearMonth.of(year, month);
		return bMonth;
	}

	
}
