package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.utilities.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.*;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"} , glue= {"com.stepdefinition"}
,dryRun=false ,monochrome=true,plugin= {"json:src\\test\\resources\\Reports\\facebook.json","rerun:src\\test\\resources\\FailedScenarios\\failed.txt"})

public class TestRunner {

	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\facebook.json");

	}

}
