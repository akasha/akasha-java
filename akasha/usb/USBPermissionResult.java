package akasha.usb;

import akasha.PermissionStatus;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USBPermissionResult"
)
public class USBPermissionResult extends PermissionStatus {
  @JsNonNull
  public JsArray<USBDevice> devices;

  protected USBPermissionResult() {
  }
}
