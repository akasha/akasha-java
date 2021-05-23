package akasha.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The DoubleRange dictionary is used to define a range of permitted double-precision floating-point values for a property, with either or both a maximum and minimum value specified. The ConstrainDouble dictionary is based on this, augmenting it to support exact and ideal values as well.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DoubleRange">DoubleRange - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-doublerange">DoubleRange - Media Capture and Streams</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DoubleRange"
)
public interface DoubleRange {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "max"
  )
  double max();

  @JsProperty
  void setMax(double max);

  @JsProperty(
      name = "min"
  )
  double min();

  @JsProperty
  void setMin(double min);

  /**
   * The DoubleRange dictionary is used to define a range of permitted double-precision floating-point values for a property, with either or both a maximum and minimum value specified. The ConstrainDouble dictionary is based on this, augmenting it to support exact and ideal values as well.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DoubleRange">DoubleRange - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-doublerange">DoubleRange - Media Capture and Streams</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "DoubleRange"
  )
  interface Builder extends DoubleRange {
    @JsOverlay
    @Nonnull
    default Builder max(final double max) {
      setMax( max );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder min(final double min) {
      setMin( min );
      return this;
    }
  }
}
