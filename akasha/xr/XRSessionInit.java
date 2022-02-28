package akasha.xr;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The XRSystem interface's requestSession() method returns a promise which resolves to an XRSession object through which you can manage the requested type of WebXR session.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSessionInit">XRSessionInit - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsystem-requestsession"># dom-xrsystem-requestsession</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRSessionInit"
)
public interface XRSessionInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "optionalFeatures"
  )
  JsArray<Any> optionalFeatures();

  @JsProperty
  void setOptionalFeatures(@JsNonNull JsArray<Any> optionalFeatures);

  @JsOverlay
  default void setOptionalFeatures(@Nonnull final Any... optionalFeatures) {
    setOptionalFeatures( Js.<JsArray<Any>>uncheckedCast( optionalFeatures ) );
  }

  @JsProperty(
      name = "requiredFeatures"
  )
  JsArray<Any> requiredFeatures();

  @JsProperty
  void setRequiredFeatures(@JsNonNull JsArray<Any> requiredFeatures);

  @JsOverlay
  default void setRequiredFeatures(@Nonnull final Any... requiredFeatures) {
    setRequiredFeatures( Js.<JsArray<Any>>uncheckedCast( requiredFeatures ) );
  }

  @JsProperty(
      name = "depthSensing"
  )
  XRDepthStateInit depthSensing();

  @JsProperty
  void setDepthSensing(@JsNonNull XRDepthStateInit depthSensing);

  @JsProperty(
      name = "domOverlay"
  )
  @JsNullable
  XRDOMOverlayInit domOverlay();

  @JsProperty
  void setDomOverlay(@JsNullable XRDOMOverlayInit domOverlay);

  /**
   * The XRSystem interface's requestSession() method returns a promise which resolves to an XRSession object through which you can manage the requested type of WebXR session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSessionInit">XRSessionInit - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsystem-requestsession"># dom-xrsystem-requestsession</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRSessionInit"
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

    @JsOverlay
    @Nonnull
    default Builder depthSensing(@Nonnull final XRDepthStateInit depthSensing) {
      setDepthSensing( depthSensing );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder domOverlay(@Nullable final XRDOMOverlayInit domOverlay) {
      setDomOverlay( domOverlay );
      return this;
    }
  }
}
