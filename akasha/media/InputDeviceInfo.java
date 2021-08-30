package akasha.media;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The InputDeviceInfo interface of the Media Streams API gives access to the capabilities of the input device that it represents.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/InputDeviceInfo">InputDeviceInfo - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-inputdeviceinfo"># dom-inputdeviceinfo</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "InputDeviceInfo"
)
public class InputDeviceInfo extends MediaDeviceInfo {
  protected InputDeviceInfo() {
  }

  @JsNonNull
  public native MediaTrackCapabilities getCapabilities();
}
