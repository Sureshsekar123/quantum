package main.java.BDD.quantum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ApplicationPropertiesReader {
	
	public Properties AppProperties;
	public final String Apppropertyfilepath="resources//application,properties";
	
	BufferedReader AppReader;
	
	public ApplicationPropertiesReader() {
		try {
			AppReader= new BufferedReader(new FileReader(Apppropertyfilepath));
			AppProperties= new Properties();
			try {
				AppProperties.load(AppReader);
				AppReader.close();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("configuration properties not found at"+Apppropertyfilepath);
		}
	}
	

}
