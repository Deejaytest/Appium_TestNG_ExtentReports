package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import objectsRepository.ApiDemos_screen_2;
import objectsRepository.App_actionBar_ActionBarMechanics;
import objectsRepository.actionBar_consolidatedObjects;
import objectsRepository.apidemosHome;


public class ActionBarTestCase_02 extends testbase {
	
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
	
	@AfterMethod(alwaysRun=true)
	public void finishTest()
	{
	    driver.resetApp();
	}
	
	@Test (groups = {"Sanity"})
	public void Bar_tabs()
	{
	/*	apidemosHome homeobj = new apidemosHome(driver);
		ApiDemos_screen_2 screen_2 = new ApiDemos_screen_2(driver);
		App_actionBar_ActionBarMechanics actionbar_menu = new App_actionBar_ActionBarMechanics(driver);
		actionBar_consolidatedObjects allobjects = new actionBar_consolidatedObjects(driver);
*/
		
		homeobj.Home_app.click();
		screen_2.apidemos_app_actionbar.click();
		actionbar_menu.actionbar_actionBarTabs.click();
		allobjects.actionbar_actionBarTabs_ToggleTab.click();
		allobjects.actionbar_actionBarTabs_AddNewTab.click();
		allobjects.actionbar_actionBarTabs_AddNewTab.click();
		allobjects.actionbar_actionBarTabs_RemoveLastTab.click();
		allobjects.actionbar_actionBarTabs_RemoveAll.click();
	}
	
	


}
