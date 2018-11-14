package com.hoverdroids.hoverdroids_android_themes_and_styles;
import android.app.Application;
import com.hoverdroids.logutils.LogUtils;
import timber.log.Timber;

/**
 * @author Chris Sprague
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize logging first to log all operations
        LogUtils.initLoggingUtilities();
        Timber.v(LogUtils.METHOD_ONLY);
    }
}