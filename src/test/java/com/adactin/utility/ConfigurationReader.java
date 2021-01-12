package com.adactin.utility;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties prop;
	
	public ConfigurationReader() throws IOException {
		File f = new File("C:\\Users\\Lokesh\\eclipse-workspace\\Adactin\\src\\test\\java\\com\\adactin\\property\\Adactin.property");
		FileInputStream fs = new FileInputStream(f);
		prop = new Properties();
		prop.load(fs);
		
	}
	public String browserName() {
		String browsername = prop.getProperty("browser");
		return browsername;
	}
	
	public String urlName() {
		String urlname = prop.getProperty("url");
		return urlname;
	}
	 

}
