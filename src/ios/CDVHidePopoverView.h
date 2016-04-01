// Header

#ifndef CDVHidePopoverView_h
#define CDVHidePopoverView_h

#import <Cordova/CDV.h>

@interface CDVPreventCalloutView : CDVPlugin

@property (nonatomic) bool shouldHidePopover;

- (void)enablePopoverView:(CDVInvokedUrlCommand*)command;
- (void)disablePopoverView:(CDVInvokedUrlCommand*)command;

@end
#endif
