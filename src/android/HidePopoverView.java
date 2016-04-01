package com.bowlingx.cordova.popover;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONException;
import com.bowlingx.cordova.webview.HidePopoverCapableWebView;

public class HidePopoverView extends CordovaPlugin {

    /**
     * Sets the context of the Command. This can then be used to do things like
     * get file paths associated with the Activity.
     *
     * @param cordova The context of the main Activity.
     * @param webView The CordovaWebView Cordova is running in.
     */
    @Override
    public void initialize(final CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    /**
     * Executes the request and returns PluginResult.
     *
     * @param action          The action to execute.
     * @param args            JSONArry of arguments for the plugin.
     * @param callbackContext The callback id used when calling back into JavaScript.
     * @return True if the action was valid, false otherwise.
     */
    @Override
    public boolean execute(final String action, final CordovaArgs args,
                           final CallbackContext callbackContext) throws JSONException {

        if (this.webView instanceof HidePopoverCapableWebView) {
            HidePopoverCapableWebView thisWebView = (HidePopoverCapableWebView) this.webView;
            boolean isEnabled = action.equals("enablePopoverView");
            thisWebView.setPopoverEnabled(isEnabled);
            return true;
        }
        return false;
    }
}