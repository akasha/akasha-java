package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The IdleDeadline interface is used as the data type of the input parameter to idle callbacks established by calling Window.requestIdleCallback(). It offers a method, timeRemaining(), which lets you determine how much longer the user agent estimates it will remain idle and a property, didTimeout, which lets you determine if your callback is executing because its timeout duration expired.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IdleDeadline">IdleDeadline - MDN</a>
 * @see <a href="https://www.w3.org/TR/requestidlecallback/">Cooperative Scheduling of Background Tasks</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IdleDeadline"
)
public class IdleDeadline {
  protected IdleDeadline() {
  }

  @JsProperty(
      name = "didTimeout"
  )
  public native boolean didTimeout();

  public native double timeRemaining();
}
