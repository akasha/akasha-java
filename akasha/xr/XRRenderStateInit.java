package akasha.xr;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The XRRenderStateInit dictionary is a writeable version of the XRRenderState interface, and is used when calling an XRSession's updateRenderState() method to apply changes to the render state prior to rendering the next frame.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRRenderStateInit">XRRenderStateInit - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#dictdef-xrrenderstateinit">XRRenderStateInit - WebXR Device API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface XRRenderStateInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "baseLayer"
  )
  @Nullable
  XRWebGLLayer baseLayer();

  @JsProperty
  void setBaseLayer(@Nullable XRWebGLLayer baseLayer);

  @JsProperty(
      name = "depthFar"
  )
  double depthFar();

  @JsProperty
  void setDepthFar(double depthFar);

  @JsProperty(
      name = "depthNear"
  )
  double depthNear();

  @JsProperty
  void setDepthNear(double depthNear);

  @JsProperty(
      name = "inlineVerticalFieldOfView"
  )
  double inlineVerticalFieldOfView();

  @JsProperty
  void setInlineVerticalFieldOfView(double inlineVerticalFieldOfView);

  @JsProperty(
      name = "layers"
  )
  @Nullable
  JsArray<XRLayer> layers();

  @JsProperty
  void setLayers(@Nullable JsArray<XRLayer> layers);

  @JsOverlay
  default void setLayers(@Nullable final XRLayer... layers) {
    setLayers( Js.<JsArray<XRLayer>>uncheckedCast( layers ) );
  }

  /**
   * The XRRenderStateInit dictionary is a writeable version of the XRRenderState interface, and is used when calling an XRSession's updateRenderState() method to apply changes to the render state prior to rendering the next frame.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRRenderStateInit">XRRenderStateInit - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dictdef-xrrenderstateinit">XRRenderStateInit - WebXR Device API</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends XRRenderStateInit {
    @JsOverlay
    @Nonnull
    default Builder baseLayer(@Nullable final XRWebGLLayer baseLayer) {
      setBaseLayer( baseLayer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthFar(final double depthFar) {
      setDepthFar( depthFar );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthNear(final double depthNear) {
      setDepthNear( depthNear );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder inlineVerticalFieldOfView(final double inlineVerticalFieldOfView) {
      setInlineVerticalFieldOfView( inlineVerticalFieldOfView );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder layers(@Nullable final JsArray<XRLayer> layers) {
      setLayers( layers );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder layers(@Nullable final XRLayer... layers) {
      setLayers( layers );
      return this;
    }
  }
}
