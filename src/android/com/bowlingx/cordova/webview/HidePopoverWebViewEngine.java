package com.bowlingx.cordova.webview;

import android.content.Context;

import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.engine.SystemWebViewEngine;

public class HidePopoverWebViewEngine extends SystemWebViewEngine {
    public HidePopoverWebViewEngine(Context context, CordovaPreferences preferences) {
        super(new HidePopoverCapableWebView(context), preferences);
    }

    public void setPopoverEnabled(boolean popoverEnabled) {
        ((HidePopoverCapableWebView)webView).setPopoverEnabled(popoverEnabled);
    }
}
