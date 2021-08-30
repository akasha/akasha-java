package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The VTTRegion interface&mdash;part of the API for handling WebVTT (text tracks on media presentations)&mdash;describes a portion of the video to render a VTTCue onto.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VTTRegion">VTTRegion - MDN</a>
 * @see <a href="https://w3c.github.io/webvtt/#the-vttregion-interface"># the-vttregion-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VTTRegion"
)
public class VTTRegion extends JsObject {
  @JsNonNull
  public String id;

  public int lines;

  public double regionAnchorX;

  public double regionAnchorY;

  @JsNonNull
  @ScrollSetting
  public String scroll;

  public double viewportAnchorX;

  public double viewportAnchorY;

  public double width;

  protected VTTRegion() {
  }
}
