/*global require, module*/

var exec = require('cordova/exec');

var PopoverView = {
    disable: function () {
        exec(null, null, "HideWebViewPopover", "disablePopoverView", []);
    },
    enable: function () {
        exec(null, null, "HideWebViewPopover", "enablePopoverView", []);
    }
};

module.exports = HidePopoverView;