package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.MutableCapabilities;
import wrappers.CommonNativeWrappers;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LearnSauceLabsForAndroid {
    public static void main(String[] args) throws MalformedURLException {
        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:app", "storage:filename=leaforg.apk");  // The filename of the mobile app
        caps.setCapability("appium:deviceName", "Google Pixel 3 XL GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "9.0");
        caps.setCapability("appium:automationName", "UiAutomator2");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("appiumVersion", "2.0.0");
        sauceOptions.setCapability("username", "oauth-lk4354654-b4441");
        sauceOptions.setCapability("accessKey", "72bc57fe-7353-49c2-af9f-c3fa506c64f2");
        sauceOptions.setCapability("build", "<your build id>");
        sauceOptions.setCapability("name", "<your test name>");
        sauceOptions.setCapability("deviceOrientation", "PORTRAIT");
        caps.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("rajkumar@testleaf.com");
        driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]")).sendKeys("Leaf@123");
        driver.findElement(AppiumBy.className("android.widget.Button")).click();
        driver.quit();
    }

}
