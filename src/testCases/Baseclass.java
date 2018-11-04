package testCases;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Baseclass extends AppiumServerStartStop {
	public static AndroidDriver driver ;
	public static AndroidDriver capabilities()  throws Exception  {

		File f= new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");

		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.ANDROID);
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G4");
		Cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		Cap.setCapability("fullReset", false);
		Cap.setCapability(MobileCapabilityType.NO_RESET, true);		
//		 driver= new AndroidDriver(new URL(service_url),Cap);

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),Cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}
}
