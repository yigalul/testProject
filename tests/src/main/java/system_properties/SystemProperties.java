package system_properties;

public class SystemProperties {
    public static String key = System.getProperty("key", "default property");
    public static String systemKey = System.getProperty("system.key", "system.key");

}
