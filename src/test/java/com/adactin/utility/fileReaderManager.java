package com.adactin.utility;

import java.io.IOException;

public class fileReaderManager {
	
	private fileReaderManager() {
		System.out.println("singleton");
	}
	public static fileReaderManager getInstance() {
		fileReaderManager frm = new fileReaderManager();
		return frm;

	}
	public ConfigurationReader getCrInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
	
}
