package akasha.xr;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The WebXR Device API dictionary XRSessionInit specifies required and/or optional features when requesting a new XRSession by calling the navigator.xr.requestSession() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSessionInit">XRSessionInit - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface XRSessionInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "optionalFeatures"
  )
  JsArray<Any> optionalFeatures();

  @JsProperty
  void setOptionalFeatures(@Nonnull JsArray<Any> optionalFeatures);

  @JsOverlay
  default void setOptionalFeatures(@Nonnull final Any... optionalFeatures) {
    setOptionalFeatures( Js.<JsArray<Any>>uncheckedCast( optionalFeatures ) );
  }

  @JsProperty(
      name = "requiredFeatures"
  )
  JsArray<Any> requiredFeatures();

  @JsProperty
  void setRequiredFeatures(@Nonnull JsArray<Any> requiredFeatures);

  @JsOverlay
  default void setRequiredFeatures(@Nonnull final Any... requiredFeatures) {
    setRequiredFeatures( Js.<JsArray<Any>>uncheckedCast( requiredFeatures ) );
  }

  /**
   * The WebXR Device API dictionary XRSessionInit specifies required and/or optional features when requesting a new XRSession by calling the navigator.xr.requestSession() method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSessionInit">XRSessionInit - MDN</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends XRSessionInit {
    @JsOverlay
    @Nonnull
    default Builder optionalFeatures(@Nonnull final JsArray<Any> optionalFeatures) {
      setOptionalFeatures( optionalFeatures );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder optionalFeatures(@Nonnull final Any... optionalFeatures) {
      setOptionalFeatures( optionalFeatures );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder requiredFeatures(@Nonnull final JsArray<Any> requiredFeatures) {
      setRequiredFeatures( requiredFeatures );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder requiredFeatures(@Nonnull final Any... requiredFeatures) {
      setRequiredFeatures( requiredFeatures );
      return this;
    }
  }
}