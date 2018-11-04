package testcases2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;




import testCases.testbase;

public class PreferencesTestCase_01 extends testbase {
	
	@AfterMethod(alwaysRun=true)
	public void finishTest()
	{
	    driver.resetApp();
	}
	
	@Parameters("TextInput")
	@Test (groups = "Sanity")
	public void preferences_normalclick( String Text)
	{
	
	driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	driver.findElementById("android:id/checkbox").click();
	driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	driver.findElementByClassName("android.widget.EditText").sendKeys(Text);
	driver.findElementById("android:id/button1").click();
	}
	
	@Parameters("TextInput")
	@Test (groups = "Sanity", dependsOnMethods="preferences_normalclick")
	public void preferences_endToend(@Optional("I am optional")String Text2)
	{
	
	driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	driver.findElementById("android:id/checkbox").click();
	driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	driver.findElementByClassName("android.widget.EditText").sendKeys(Text2);
	driver.findElementById("android:id/button1").click();
	}

}
