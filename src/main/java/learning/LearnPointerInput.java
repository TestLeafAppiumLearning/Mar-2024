package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

public class LearnPointerInput {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("platformName", "Android");
//        dc.setCapability("deviceName", "my device");
        dc.setCapability("noReset", true);
        dc.setCapability("app", System.getProperty("user.dir") + "/apks/MultiTouch Tester_v1.2.apk");
        AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723/"), dc);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        int maxX = driver.manage().window().getSize().getWidth();
        int maxY = driver.manage().window().getSize().getHeight();
        int startX = 0, startY = 0, endX = 0, endY = 0;
//        Swiping towards up
        startX = (int) (maxX * 0.5);
        startY = (int) (maxY * 0.8);
        endX = (int) (maxX * 0.5);
        endY = (int) (maxY * 0.2);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger 1");
        Sequence swipeUp = new Sequence(finger1, 1);
        swipeUp.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeUp.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeUp.addAction(finger1.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endX, endY));
        swipeUp.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeUp));

//        Swiping towards down
        startX = (int) (maxX * 0.5);
        startY = (int) (maxY * 0.2);
        endX = (int) (maxX * 0.5);
        endY = (int) (maxY * 0.8);
        PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger 1");
        Sequence swipeDown = new Sequence(finger2, 1);
        swipeDown.addAction(finger2.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeDown.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeDown.addAction(finger2.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endX, endY));
        swipeDown.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeDown));

//        Swiping towards right
        startX = (int) (maxX * 0.2);
        startY = (int) (maxY * 0.5);
        endX = (int) (maxX * 0.8);
        endY = (int) (maxY * 0.5);
        PointerInput finger3 = new PointerInput(PointerInput.Kind.TOUCH, "finger 1");
        Sequence swipeRight = new Sequence(finger3, 1);
        swipeRight.addAction(finger3.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeRight.addAction(finger3.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeRight.addAction(finger3.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endX, endY));
        swipeRight.addAction(finger3.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeRight));

//        Swiping towards left
        startX = (int) (maxX * 0.8);
        startY = (int) (maxY * 0.5);
        endX = (int) (maxX * 0.2);
        endY = (int) (maxY * 0.5);
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