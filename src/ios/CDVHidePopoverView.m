// Implementation

#import <Foundation/Foundation.h>
#import "CDVHidePopoverView.h"

@implementation CDVHidePopoverView

- (void)pluginInitialize
{
  [[NSNotificationCenter defaultCenter] addObserver:self selector:@selector(menuWillShow:)
    name:UIMenuControllerWillShowMenuNotification object:[UIMenuController sharedMenuController]];
}

- (void)enablePopoverView:(CDVInvokedUrlCommand*)command
{
    self.shouldHidePopover = NO;
}

- (void)disablePopoverView:(CDVInvokedUrlCommand*)command
{
    self.shouldHidePopover = YES;
}

-(void)menuWillShow:(NSNotification *)notification
{
    if(self.shouldHidePopover) {
        dispatch_async(dispatch_get_main_queue(), ^{
            [[UIMenuController sharedMenuController] setMenuVisible:NO animated:NO];
        });
    }
}

@end