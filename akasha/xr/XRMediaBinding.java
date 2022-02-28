package akasha.xr;

import akasha.HTMLVideoElement;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XRMediaBinding interface is used to create layers that display the content of an HTMLVideoElement.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRMediaBinding">XRMediaBinding - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRMediaBinding"
)
public class XRMediaBinding extends JsObject {
  public XRMediaBinding(@Nonnull final XRSession session) {
  }

  @JsNonNull
  public native XRCylinderLayer createCylinderLayer(@Nonnull HTMLVideoElement video,
      @Nonnull XRMediaCylinderLayerInit init);

  @JsNonNull
  public native XRCylinderLayer createCylinderLayer(@Nonnull HTMLVideoElement video);

  @JsNonNull
  public native XREquirectLayer createEquirectLayer(@Nonnull HTMLVideoElement video,
      @Nonnull XRMediaEquirectLayerInit init);

  @JsNonNull
  public native XREquirectLayer createEquirectLayer(@Nonnull HTMLVideoElement video);

  @JsNonNull
  public native XRQuadLayer createQuadLayer(@Nonnull HTMLVideoElement video,
      @Nonnull XRMediaQuadLayerInit init);

  @JsNonNull
  public native XRQuadLayer createQuadLayer(@Nonnull HTMLVideoElement video);
}
