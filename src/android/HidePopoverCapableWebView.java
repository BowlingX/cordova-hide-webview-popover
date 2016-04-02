package com.bowlingx.cordova.webview;

import org.apache.cordova.engine.SystemWebView;

import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.MenuInflater;
import android.content.Context;

public class HidePopoverCapableWebView extends SystemWebView {
    private boolean isPopoverEnabled = false;

    public HidePopoverCapableWebView(Context context) {
        super(context);
    }

    public HidePopoverCapableWebView setPopoverEnabled(boolean popoverEnabled) {
        isPopoverEnabled = popoverEnabled;
        return this;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int type) {
        if (!this.isPopoverEnabled) {
            return this.dummyActionMode();
        } else {
            return super.startActionMode(callback, type);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (!this.isPopoverEnabled) {
            return this.dummyActionMode();
        } else {
            return super.startActionMode(callback);
        }
    }

    public ActionMode dummyActionMode() {
        return new ActionMode() {
            @Override
            public void setTitle(CharSequence title) {
            }

            @Override
            public void setTitle(int resId) {
            }

            @Override
            public void setSubtitle(CharSequence subtitle) {
            }

            @Override
            public void setSubtitle(int resId) {
            }

            @Override
            public void setCustomView(View view) {
            }

            @Override
            public void invalidate() {
            }

            @Override
            public void finish() {
            }

            @Override
            public Menu getMenu() {
                return null;
            }

            @Override
            public CharSequence getTitle() {
                return null;
            }

            @Override
            public CharSequence getSubtitle() {
                return null;
            }

            @Override
            public View getCustomView() {
                return null;
            }

            @Override
            public MenuInflater getMenuInflater() {
                return null;
            }
        };
    }
}