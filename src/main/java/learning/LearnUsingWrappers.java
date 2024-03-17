package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnUsingWrappers extends GenericWrappers {
    @Test
    public void runCode() {
        launchApp("android", "", "", "com.testleaf.leaforg",
                "com.testleaf.leaforg.MainActivity", "UiAutomator2", "", "", "",
                "", "", "/apks/leaforg.apk", "", "");
        verifyAndInstallApp("com.the511plus.MultiTouchTester", "/apks/MultiTouch Tester_v1.2.apk");
        setPortraitOrientation();
        setLandscapeOrientation();
        setPortraitOrientation();

    }
}