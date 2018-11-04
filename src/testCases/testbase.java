package testCases;

import org.testng.annotations.BeforeSuite;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import io.appium.java_client.android.AndroidDriver;

public class testbase {

	public static AndroidDriver driver;

	public testbase() {
		super();	
	}
	
	@BeforeSuite(alwaysRun=true)
	public void testapp() throws Exception
	{
//		AppiumServerStartStop.appiumStart();
		driver = Baseclass.capabilities();
	}
}


