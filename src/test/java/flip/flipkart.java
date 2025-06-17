package flip;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class flipkart {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
DesiredCapabilities dc= new DesiredCapabilities();
   dc.setCapability("devicename","moto g(40) fusion" );
   dc.setCapability("platformname","Android" );
   dc.setCapability("automationName","uiautomator2" );
   dc.setCapability("plateformversion","12" );
   dc.setCapability("appactivity","com.flipkart.android.activity.HomeFragmentHolderActivity");
   dc.setCapability("appinfo", "74b448e u0 com.flipkart.android" );
     URL url=URI.create("http://127.0.0.1:4723/").toURL();
	AndroidDriver driver= new AndroidDriver(url,dc);
	Thread.sleep(5000);
	System.out.println("Application Startted");
	driver.quit();
	
				
	 
	}
}
