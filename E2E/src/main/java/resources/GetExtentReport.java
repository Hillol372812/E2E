package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public  class GetExtentReport {
	static ExtentReports extent;
	public static ExtentReports Reportobject()
	{
		String path=System.getProperty("user.dir")+"//Report//Extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Extent Report");
		reporter.config().setReportName("WebAutomation Report");
		
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Reporter", "Hillol Mahata");
		
		return extent;
	}
	
}
