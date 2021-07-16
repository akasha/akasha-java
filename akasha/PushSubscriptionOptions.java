package akasha;

import akasha.core.ArrayBuffer;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PushSubscriptionOptions interface of the Push API represents the options associated with a push subscription.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushSubscriptionOptions">PushSubscriptionOptions - MDN</a>
 * @see <a href="https://w3c.github.io/push-api/#dom-pushsubscriptionoptions"># dom-pushsubscriptionoptions</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PushSubscriptionOptions"
)
public class PushSubscriptionOptions extends JsObject {
  protected PushSubscriptionOptions() {
  }

  @JsProperty(
      name = "applicationServerKey"
  )
  @Nullable
  public native ArrayBuffer applicationServerKey();

  @JsProperty(
      name = "userVisibleOnly"
  )
  public native boolean userVisibleOnly();
}
