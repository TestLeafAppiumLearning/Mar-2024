package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnAndroidWrappers extends GenericWrappers {
    @Test
    public void runCode() {
        launchAndroidApp("", "com.testleaf.leaforg",
                "com.testleaf.leaforg.MainActivity", "UiAutomator2",
                "/apks/leaforg.apk");
        showNotificationMenu();
        hideNotificationMenu();
        dataOffInAndroid();
        sleep(3000);
        dataOnInAndroid();
        System.out.println(getCurrentAppPackage());
        System.out.println(getCurrentActivity());
    }
}