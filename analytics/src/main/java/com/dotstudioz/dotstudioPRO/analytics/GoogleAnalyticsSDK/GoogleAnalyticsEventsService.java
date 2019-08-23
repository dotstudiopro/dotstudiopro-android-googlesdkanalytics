package com.dotstudioz.dotstudioPRO.analytics.GoogleAnalyticsSDK;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import com.facebook.appevents.AppEventsLogger;
/*import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;*/

public class GoogleAnalyticsEventsService {

    //private Tracker mTracker;
    private Context mContext;

    private GoogleAnalyticsEventsService() { }

    private static GoogleAnalyticsEventsService mInstance = new GoogleAnalyticsEventsService();
    public static synchronized GoogleAnalyticsEventsService getInstance() {
        if(mInstance == null)
            mInstance = new GoogleAnalyticsEventsService();
        return mInstance;
    }

    public void initialize(Context context) {
        if(mContext == null)
            mContext = context;
    }


    /**
     * Gets the default {@link Tracker} for this {@link Application}.
     * @return tracker
     */
    /*synchronized public Tracker getDefaultTracker(String GACode) {
        if (mTracker == null) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(mContext);
            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
            //mTracker = analytics.newTracker(R.xml.global_tracker);
            mTracker = analytics.newTracker(GACode);
            //mTracker = analytics.newTracker("UA-106753337-3");
        }
        return mTracker;
    }

    synchronized public void sendGAEvent(String GACode, String eventCategory, String eventType, String videoID) {
        getDefaultTracker(GACode).send(new HitBuilders.EventBuilder()
                .setCategory(eventCategory)
                .setAction(eventType)
                .setLabel(videoID)
                .build());
    }*/
}
