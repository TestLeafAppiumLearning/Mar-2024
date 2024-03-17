package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnSwitchBetweenApps extends GenericWrappers {
    @Test
    public void runCode() {
        launchApp("android", "", "", "com.testleaf.leaforg",
                "com.testleaf.leaforg.MainActivity", "UiAutomator2", "", "", "",
                "", "", "/apks/leaforg.apk", "", "");
        enterValue(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.EditText"), "rajkumar@testleaf.com");
        enterValue(getWebElement(Locators.XPATH.asString(), "(//android.widget.EditText)[2]"), "Leaf@123");
        click(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.Button"));
        switchToAnotherApp("com.the511plus.MultiTouchTester");
        pinchInApp();
        //switchToAnotherApp("com.testleaf.leaforg");
        startAnAppUsingActivity("com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity");
    }
}