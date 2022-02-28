package akasha.xr;

import akasha.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRLayerEvent interface of the WebXR Device API is the event type for events related to a change of state of an XRLayer object. These events occur, for example, when the layer needs to be redrawn.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRLayerEvent">XRLayerEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRLayerEvent"
)
public class XRLayerEvent extends Event {
  public XRLayerEvent(@Nonnull final String type, @Nonnull final XRLayerEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "layer"
  )
  @Nonnull
  public native XRLayer layer();
}
