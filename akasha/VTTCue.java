package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The VTTCue interface&mdash;part of the API for handling WebVTT (text tracks on media presentations)&mdash;describes and controls the text track associated with a particular &lt;track&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VTTCue">VTTCue - MDN</a>
 * @see <a href="https://w3c.github.io/webvtt/#the-vttcue-interface"># the-vttcue-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VTTCue"
)
public class VTTCue extends TextTrackCue {
  @JsNonNull
  @AlignSetting
  public String align;

  @JsNonNull
  public LineAndPositionSetting line;

  @JsNonNull
  @LineAlignSetting
  public String lineAlign;

  @JsNonNull
  public LineAndPositionSetting position;

  @JsNonNull
  @PositionAlignSetting
  public String positionAlign;

  @JsNullable
  public VTTRegion region;

  public double size;

  public boolean snapToLines;

  @JsNonNull
  public String text;

  @JsNonNull
  @DirectionSetting
  public String vertical;

  /**
   * The VTTCue() constructor creates and returns a new VTTCue object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VTTCue/VTTCue">VTTCue.VTTCue - MDN</a>
   * @see <a href="https://w3c.github.io/webvtt/#dom-vttcue-vttcue">VTTCue() - WebVTT: The Web Video Text Tracks Format</a>
   */
  public VTTCue(final double startTime, final double endTime, @Nonnull final String text) {
  }

  @JsNonNull
  public native DocumentFragment getCueAsHTML();
}
