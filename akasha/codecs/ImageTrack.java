package akasha.codecs;

import akasha.EventHandler;
import akasha.EventTarget;
import javax.annotation.Generated;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ImageTrack interface of the WebCodecs API represents an individual image track.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageTrack">ImageTrack - MDN</a>
 * @see <a href="https://w3c.github.io/webcodecs/#imagetrack-interface"># imagetrack-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ImageTrack"
)
public class ImageTrack extends EventTarget {
  @JsNullable
  public EventHandler onchange;

  public boolean selected;

  protected ImageTrack() {
  }

  @JsProperty(
      name = "animated"
  )
  public native boolean animated();

  @JsProperty(
      name = "frameCount"
  )
  public native int frameCount();

  @JsProperty(
      name = "repetitionCount"
  )
  public native float repetitionCount();
}
