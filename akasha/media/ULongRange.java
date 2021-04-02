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
 * The ULongRange dictionary is used to define a range of permitted integer values for a property, with either or both a maximum and minimum value specified. The ConstrainULongRange dictionary is based on this, augmenting it to support exact and ideal values as well.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ULongRange">ULongRange - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-ulongrange">ULongRange - Media Capture and Streams</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface ULongRange {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "max"
  )
  int max();

  @JsProperty
  void setMax(int max);

  @JsProperty(
      name = "min"
  )
  int min();

  @JsProperty
  void setMin(int min);

  /**
   * The ULongRange dictionary is used to define a range of permitted integer values for a property, with either or both a maximum and minimum value specified. The ConstrainULongRange dictionary is based on this, augmenting it to support exact and ideal values as well.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ULongRange">ULongRange - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-ulongrange">ULongRange - Media Capture and Streams</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends ULongRange {
    @JsOverlay
    @Nonnull
    default Builder max(final int max) {
      setMax( max );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder min(final int min) {
      setMin( min );
      return this;
    }
  }
}
