package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class LearnWebAppsInIos extends GenericWrappers {
    @Test
    public void runScript() throws URISyntaxException, MalformedURLException, InterruptedException {
        launchSafariBrowser("iPhone 15 Pro Max","https://www.google.com","");
        enterValue(getWebElement(Locators.NAME.asString(), "q"),"Lokesh Kumar");
//        switchNativeView();
//        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Search"));
//        switchWebView();
        clickGivenKeyboardButtonInIosByAccessibilityId("Search");
        closeApp();
    }
}