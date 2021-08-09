package com.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReport(String jsonfile) {
		// loc of jvm report
		File reportDirectory = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports");

		Configuration configuration = new Configuration(reportDirectory, "Facebook-Auomation");
		
		configuration.addClassifications("os", "windows 10");
		configuration.addClassifications("browser", "chrome");
		configuration.addClassifications("browser_version", "91");
		configuration.addClassifications("sprint", "42");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonfile);
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
		 
	}

}
