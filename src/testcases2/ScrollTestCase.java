package testcases2;

import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import testCases.testbase;

public class ScrollTestCase extends testbase {
	
	@AfterMethod(alwaysRun=true)
	public void finishTest()
	{
	    driver.resetApp();
	}
	
	@Test (groups = "Smoke", enabled=false)
	public void gesture_scroll()
	{
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Popup Menu\").instance(0))");
	}
	
	@Test (groups = "Smoke")
	public void gesture_dragDrop()
	{
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@index='7']").click();
		TouchAction t = new TouchAction(driver);
		WebElement from = driver.findElementByXPath("//android.view.View[@index='1']"); // Get the path of current postion
		WebElement to = driver.findElementByXPath("//android.view.View[@index='4']"); // Get the path of desired position
		int leftX = to.getLocation().getX();
		int rightX = leftX + to.getSize().getWidth();
		int middleX = (rightX + leftX) / 2;
		
		int upperY = to.getLocation().getY();
		int lowerY = upperY + to.getSize().getHeight();
		int middleY = (upperY + lowerY) / 2;
		t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(from)).withDuration(Duration.ofSeconds(3))).moveTo(PointOption.point(middleX, middleY)).release().perform();
		
	}

}
