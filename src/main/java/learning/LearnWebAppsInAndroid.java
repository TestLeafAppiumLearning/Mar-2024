package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnWebAppsInAndroid extends GenericWrappers {
    @Test
    public void runCode() {
        launchBrowser("android","chrome","",
                "https://www.google.com","","","",
                "","");
//        launchChromeBrowser("https://www.google.com","");
        enterValue(getWebElement(Locators.NAME.asString(), "q"),"Lokesh Kumar");
        pressEnter();
        click(getWebElement(Locators.XPATH.asString(), "(//div[text()='Images'])[2]"));
        sleep(5000);
        closeApp();
    }
}