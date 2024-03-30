package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import wrappers.GenericWrappers;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class LearnPickerWheel extends GenericWrappers {
    @Test
    public void runScript() throws URISyntaxException, MalformedURLException, InterruptedException {
        launchIosApp("iPhone 15 Pro Max","","","","/apks/UiCatalog.zip");
        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Picker View"));
        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"),"20",false);
        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Green color component value"),"200",false);
        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Blue color component value"),"100",false);
        chooseNextOptionInPickerWheel(Locators.ACCESSIBILITY_ID.asString(), "Red color component value");
        chooseNextOptionInPickerWheel(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"));
        choosePreviousOptionInPickerWheel(Locators.ACCESSIBILITY_ID.asString(), "Green color component value");
        choosePreviousOptionInPickerWheel(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Blue color component value"));
        sleep(5000);
        closeApp();
    }
}