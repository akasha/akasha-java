package akasha;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ImageTrack"
)
public class ImageTrack extends EventTarget {
  @Nullable
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
