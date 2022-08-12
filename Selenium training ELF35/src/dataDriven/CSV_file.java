package dataDriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

public class CSV_file {
	public static void main(String[] args) throws IOException, CsvException {
		
File file=new File("./testData/csvFile.csv");
FileReader fr=new FileReader(file);
CSVReader read=new CSVReader(fr);

//String[] firstLine=read.readNext();
//for(int i=0;i<firstLine.length;i++) {
//	System.out.println(firstLine[i]);
//}
System.out.println();
//String[] secondLine=read.readNext();
//for(int i=0;i<secondLine.length;i++) {
//	System.out.println(secondLine[i]);
//}
List<String[]> list=read.readAll();
for(String[] string:list) {
	for(int i=0;i<string.length;i++) {
		System.out.println(string [i]);
}
	}
	}}
