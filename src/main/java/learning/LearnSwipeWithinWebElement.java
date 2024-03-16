package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

public class LearnSwipeWithinWebElement {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("platformName", "Android");
//        dc.setCapability("deviceName", "my device");
        dc.setCapability("noReset", true);
        dc.setCapability("appPackage", "com.android.vending");
        dc.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
        AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723/"), dc);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        int maxX = driver.manage().window().getSize().getWidth();
        int maxY = driver.manage().window().getSize().getHeight();
        int startX = 0, startY = 0, endX = 0, endY = 0;
        WebElement element = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"About this ad\"]/following-sibling::android.view.View)[1]"));
        int eleStartX = element.getLocation().getX();
        int eleStartY = element.getLocation().getY();
        int eleWidth = element.getSize().getWidth();
        int eleHeight = element.getSize().getHeight();


//        Swiping towards left
        startX = (int) ((eleWidth * 0.8) + eleStartX);
        startY = (int) ((eleHeight * 0.5) + eleStartY);
        endX = (int) ((eleWidth * 0.2) + eleStartX);
        endY = (int) ((eleHeight * 0.5) + eleStartY);
        PointerInput finger4 = new PointerInput(PointerInput.Kind.TOUCH, "finger 1");
        Sequence swipeLeft = new Sequence(finger4, 1);
        swipeLeft.addAction(finger4.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeLeft.addAction(finger4.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeLeft.addAction(finger4.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endX, endY));
        swipeLeft.addAction(finger4.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeLeft));
        Thread.sleep(5000);
        driver.quit();
    }
}