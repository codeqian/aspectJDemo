package net.codepig.aspectjdemo;

import android.app.Application;
import android.util.Log;

import net.codepig.trackpoint.TrackPoint;
import net.codepig.trackpoint.TrackPointCallBack;

public class MainApp extends Application {
    private static final String TAG = "LOGCAT";

    @Override
    public void onCreate() {
        super.onCreate();
        TrackPoint.init(new TrackPointCallBack() {
            @Override
            public void onClick(String pageClassName, String viewIdName) {
                Log.d(TAG, "onClick---");
                Log.d(TAG, "onClick: " + pageClassName + "-" + viewIdName);
                //添加你的操作
            }

            @Override
            public void onPageOpen(String pageClassName) {
                Log.d(TAG, "onPageOpen: " + pageClassName);
                //添加你的操作
            }

            @Override
            public void onPageClose(String pageClassName) {
                Log.d(TAG, "onPageClose: " + pageClassName);
                //添加你的操作
            }
        });
    }
}
