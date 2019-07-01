package learn_automation_excel;

import libraryPackage.ExcelDataConfig;

public class Read_Excel3_Config {  //HERE WE HAVE READ DATA FROM EXCEL SHEET USING CODE FROM ExcelDataConfig.java
									//from another package

	public static void main(String[] args) {
		
		ExcelDataConfig excel= new ExcelDataConfig(".//Excel data//Testsheet.xlsx");
		
		System.out.println(excel.getData(2, 0, 0)+" "+excel.getData(2, 0, 1)+" "+excel.getData(2, 0, 2));
		
	}

}
