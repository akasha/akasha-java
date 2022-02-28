package akasha.xr;

import akasha.PermissionStatus;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The XRPermissionStatus interface defines the object returned by calling navigator.permissions.query() for the xr permission name; it indicates whether or not the app or site has permission to use WebXR, and may be monitored over time for changes to that permissions tate.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionStatus">XRPermissionStatus - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrpermissionstatus"># xrpermissionstatus</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRPermissionStatus"
)
public class XRPermissionStatus extends PermissionStatus {
  /**
   * The WebXR Device API's XRPermissionStatus interface's granted property is an array of strings, each identifying one of the WebXR features for which permission has been granted as of the time at which the Permission API's navigator.permissions.query() method was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionStatus/granted">XRPermissionStatus.granted - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissionstatus-granted">XRPermissionStatus.granted - WebXR Device API</a>
   */
  @JsNonNull
  public JsArray<Any> granted;

  protected XRPermissionStatus() {
  }
}
