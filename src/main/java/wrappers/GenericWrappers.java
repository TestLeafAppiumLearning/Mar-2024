package wrappers;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;

public class GenericWrappers extends IosWebWrappers {
    public AppiumServiceBuilder builder;
    public AppiumDriverLocalService service;

    public void startAppiumServer() {
        builder = new AppiumServiceBuilder();
        builder.usingAnyFreePort();
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
//      TODO: update with correct path of your machine
        builder.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"));
        String name = System.getProperty("user.name");
        builder.withAppiumJS(new File("C:\\Users\\" + name + "\\AppData\\Roaming\\npm\\node_modules\\appium"));
//      TODO: uncomment the below lines for MAC nachine
//      HashMap<String, String> environment = new HashMap();
//      environment.put("PATH", "/usr/local/bin:" + System.getenv("PATH"));
//      builder.withEnvironment(environment);
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        serverURL = String.valueOf(service.getUrl());
    }

    public void stopAppiumServer() {
        service.stop();
    }
}