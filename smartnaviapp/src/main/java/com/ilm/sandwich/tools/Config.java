package com.ilm.sandwich.tools;

/**
 * @author Christian Henke
 *         www.smartnavi-app.com
 */
public class Config {
    //app-Rate Dialog
    public final static String APP_PNAME = "com.ilm.sandwich";
    public final static int DAYS_UNTIL_PROMPT = 2;
    public final static int LAUNCHES_UNTIL_PROMPT = 3;
    // places api
    public static final String DIRECTIONS_API_KEY = "YOUR_KEY_HERE";
    public static final String PLACES_SDK_API_KEY = "YOUR_KEY_HERE";
    //permission integers
    public static final int PERMISSION_REQUEST_FINE_LOCATION = 0;
    public static final int PERMISSION_WRITE_EXTERNAL_STORAGE = 1;
    //other
    public static boolean backgroundServiceActive = false;
}
