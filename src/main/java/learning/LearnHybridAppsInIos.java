package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class LearnHybridAppsInIos extends GenericWrappers {
    @Test
    public void runScript() throws URISyntaxException, MalformedURLException, InterruptedException {
        launchIosApp("iPhone 15 Pro Max","","","","/apks/UiCatalog.zip");
        swipe("up");
        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Web View"));
        printContext();
        sleep(3000);
        printContext();
        sleep(5000);
        switchWebView();
        click(getWebElement(Locators.LINK_TEXT.asString(), "Learn more"));
        click(getWebElement(Locators.ID.asString(), "globalnav-menutrigger-button"));
        sleep(5000);
        closeApp();
    }
}