package testCases;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objectsRepository.ApiDemos_screen_2;
import objectsRepository.App_actionBar_ActionBarMechanics;
import objectsRepository.actionBar_consolidatedObjects;
import objectsRepository.apidemosHome;

public class ActionBarTestCase_01 extends testbase {
	
	static apidemosHome homeobj;
	static ApiDemos_screen_2 screen_2;
	static App_actionBar_ActionBarMechanics actionbar_menu;
	static actionBar_consolidatedObjects allobjects ;

	@BeforeMethod(alwaysRun=true)
	public void initTest()
	{
		 homeobj = new apidemosHome(driver);
		 screen_2 = new ApiDemos_screen_2(driver);
		 actionbar_menu = new App_actionBar_ActionBarMechanics(driver);
		 allobjects = new actionBar_consolidatedObjects(driver);

	}

	@Test(groups = "Smoke")
	public void actionbarmechanics_share() throws Exception
	{
		/*homeobj = new apidemosHome(driver);
		screen_2 = new ApiDemos_screen_2(driver);
		actionbar_menu = new App_actionBar_ActionBarMechanics(driver);
		allobjects = new actionBar_consolidatedObjects(driver);
		*/
		homeobj.Home_app.click();
		screen_2.apidemos_app_actionbar.click();
		actionbar_menu.actionbar_ActionBarMechanics.click();
		allobjects.actionbar_ActionBarMechanics_Share.click();
	}
	
	@Test(groups = "Smoke" ) 
	public void actionbarmechanics_More() throws Exception
	{
		homeobj.Home_app.click();
		screen_2.apidemos_app_actionbar.click();
		actionbar_menu.actionbar_ActionBarMechanics.click();
		allobjects.actionbar_ActionBarMechanics_MoreButton.click();
		allobjects.actionbar_ActionBarMechanics_MoreButton_Items.click();
	}

	@AfterMethod(alwaysRun=true)
	public void finishTest()
	{
	    driver.resetApp();
	}
}
