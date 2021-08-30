package akasha.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The WebXR Device API XRWebGLLayer() constructor creates and returns a new XRWebGLLayer object, providing the linkage between the WebXR device and the WebGL graphics layer used to render the 3D scene.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit">XRWebGLLayerInit - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-xrwebgllayer"># dom-xrwebgllayer-xrwebgllayer</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRWebGLLayerInit"
)
public interface XRWebGLLayerInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The alpha property is a Boolean value which, if present and set to true in the XRWebGLLayerInit dictionary passed into the XRWebGLLayer() constructor, specifies that the new layer's color buffer is to include an alpha channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/alpha">XRWebGLLayerInit.alpha - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-alpha">XRWebGLLayerInit.alpha - WebXR Device API</a>
   */
  @JsProperty(
      name = "alpha"
  )
  boolean alpha();

  /**
   * The alpha property is a Boolean value which, if present and set to true in the XRWebGLLayerInit dictionary passed into the XRWebGLLayer() constructor, specifies that the new layer's color buffer is to include an alpha channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/alpha">XRWebGLLayerInit.alpha - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-alpha">XRWebGLLayerInit.alpha - WebXR Device API</a>
   */
  @JsProperty
  void setAlpha(boolean alpha);

  /**
   * The Boolean antialias property, if present and set to true in the XRWebGLLayerInit object provided as the XRWebGLLayer() constructor's layerInit parameter, requests that the new WebGL rendering layer support anti-aliasing. If this property is missing or is false, anti-aliasing is not desired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/antialias">XRWebGLLayerInit.antialias - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-antialias">XRWebGLLayerInit.antialias - WebXR Device API</a>
   */
  @JsProperty(
      name = "antialias"
  )
  boolean antialias();

  /**
   * The Boolean antialias property, if present and set to true in the XRWebGLLayerInit object provided as the XRWebGLLayer() constructor's layerInit parameter, requests that the new WebGL rendering layer support anti-aliasing. If this property is missing or is false, anti-aliasing is not desired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/antialias">XRWebGLLayerInit.antialias - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-antialias">XRWebGLLayerInit.antialias - WebXR Device API</a>
   */
  @JsProperty
  void setAntialias(boolean antialias);

  /**
   * When using the XRWebGLLayer() constructor to create a new WebGL rendering layer for WebXR, providing as the layerInit parameter an object whose depth property is false will request that the new layer be created without a depth buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/depth">XRWebGLLayerInit.depth - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-depth">XRWebGLLayerInit.depth - WebXR Device API</a>
   */
  @JsProperty(
      name = "depth"
  )
  boolean depth();

  /**
   * When using the XRWebGLLayer() constructor to create a new WebGL rendering layer for WebXR, providing as the layerInit parameter an object whose depth property is false will request that the new layer be created without a depth buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/depth">XRWebGLLayerInit.depth - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-depth">XRWebGLLayerInit.depth - WebXR Device API</a>
   */
  @JsProperty
  void setDepth(boolean depth);

  /**
   * The XRWebGLLayerInit dictionary's framebufferScaleFactor property, when specified upon instantiating a new XRWebGLLayer using its constructor, XRWebGLLayer(), specifies the scaling factor to use when determining the size of the frame buffer to use when rendering the scene, relative to the default XR device display resolution.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/framebufferScaleFactor">XRWebGLLayerInit.framebufferScaleFactor - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-framebufferscalefactor">XRWebGLLayerInit.framebufferScaleFactor - WebXR Device API</a>
   */
  @JsProperty(
      name = "framebufferScaleFactor"
  )
  double framebufferScaleFactor();

  /**
   * The XRWebGLLayerInit dictionary's framebufferScaleFactor property, when specified upon instantiating a new XRWebGLLayer using its constructor, XRWebGLLayer(), specifies the scaling factor to use when determining the size of the frame buffer to use when rendering the scene, relative to the default XR device display resolution.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/framebufferScaleFactor">XRWebGLLayerInit.framebufferScaleFactor - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-framebufferscalefactor">XRWebGLLayerInit.framebufferScaleFactor - WebXR Device API</a>
   */
  @JsProperty
  void setFramebufferScaleFactor(double framebufferScaleFactor);

  /**
   * The XRWebGLLayerInit dictionary's Boolean ignoreDepthValues property can be provided in the options passed into the XRWebGLLayer() constructor to indicate that the depth buffer, if it exists, should be ignored while composing the scene.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/ignoreDepthValues">XRWebGLLayerInit.ignoreDepthValues - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-ignoredepthvalues">XRWebGLLayerInit.ignoreDepthValues - WebXR Device API</a>
   */
  @JsProperty(
      name = "ignoreDepthValues"
  )
  boolean ignoreDepthValues();

  /**
   * The XRWebGLLayerInit dictionary's Boolean ignoreDepthValues property can be provided in the options passed into the XRWebGLLayer() constructor to indicate that the depth buffer, if it exists, should be ignored while composing the scene.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/ignoreDepthValues">XRWebGLLayerInit.ignoreDepthValues - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-ignoredepthvalues">XRWebGLLayerInit.ignoreDepthValues - WebXR Device API</a>
   */
  @JsProperty
  void setIgnoreDepthValues(boolean ignoreDepthValues);

  /**
   * When using the XRWebGLLayer() constructor to create a new WebGL rendering layer for WebXR, providing as the layerInit parameter an object whose stencil property is false requests that the new layer be created without a stencil buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/stencil">XRWebGLLayerInit.stencil - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-stencil">XRWebGLLayerInit.stencil - WebXR Device API</a>
   */
  @JsProperty(
      name = "stencil"
  )
  boolean stencil();

  /**
   * When using the XRWebGLLayer() constructor to create a new WebGL rendering layer for WebXR, providing as the layerInit parameter an object whose stencil property is false requests that the new layer be created without a stencil buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/stencil">XRWebGLLayerInit.stencil - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-stencil">XRWebGLLayerInit.stencil - WebXR Device API</a>
   */
  @JsProperty
  void setStencil(boolean stencil);

  /**
   * The WebXR Device API XRWebGLLayer() constructor creates and returns a new XRWebGLLayer object, providing the linkage between the WebXR device and the WebGL graphics layer used to render the 3D scene.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit">XRWebGLLayerInit - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-xrwebgllayer"># dom-xrwebgllayer-xrwebgllayer</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRWebGLLayerInit"
  )
  interface Builder extends XRWebGLLayerInit {
    /**
     * The alpha property is a Boolean value which, if present and set to true in the XRWebGLLayerInit dictionary passed into the XRWebGLLayer() constructor, specifies that the new layer's color buffer is to include an alpha channel.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/alpha">XRWebGLLayerInit.alpha - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-alpha">XRWebGLLayerInit.alpha - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder alpha(final boolean alpha) {
      setAlpha( alpha );
      return this;
    }

    /**
     * The Boolean antialias property, if present and set to true in the XRWebGLLayerInit object provided as the XRWebGLLayer() constructor's layerInit parameter, requests that the new WebGL rendering layer support anti-aliasing. If this property is missing or is false, anti-aliasing is not desired.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/antialias">XRWebGLLayerInit.antialias - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-antialias">XRWebGLLayerInit.antialias - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder antialias(final boolean antialias) {
      setAntialias( antialias );
      return this;
    }

    /**
     * When using the XRWebGLLayer() constructor to create a new WebGL rendering layer for WebXR, providing as the layerInit parameter an object whose depth property is false will request that the new layer be created without a depth buffer.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/depth">XRWebGLLayerInit.depth - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-depth">XRWebGLLayerInit.depth - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder depth(final boolean depth) {
      setDepth( depth );
      return this;
    }

    /**
     * The XRWebGLLayerInit dictionary's framebufferScaleFactor property, when specified upon instantiating a new XRWebGLLayer using its constructor, XRWebGLLayer(), specifies the scaling factor to use when determining the size of the frame buffer to use when rendering the scene, relative to the default XR device display resolution.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/framebufferScaleFactor">XRWebGLLayerInit.framebufferScaleFactor - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-framebufferscalefactor">XRWebGLLayerInit.framebufferScaleFactor - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder framebufferScaleFactor(final double framebufferScaleFactor) {
      setFramebufferScaleFactor( framebufferScaleFactor );
      return this;
    }

    /**
     * The XRWebGLLayerInit dictionary's Boolean ignoreDepthValues property can be provided in the options passed into the XRWebGLLayer() constructor to indicate that the depth buffer, if it exists, should be ignored while composing the scene.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/ignoreDepthValues">XRWebGLLayerInit.ignoreDepthValues - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-ignoredepthvalues">XRWebGLLayerInit.ignoreDepthValues - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder ignoreDepthValues(final boolean ignoreDepthValues) {
      setIgnoreDepthValues( ignoreDepthValues );
      return this;
    }

    /**
     * When using the XRWebGLLayer() constructor to create a new WebGL rendering layer for WebXR, providing as the layerInit parameter an object whose stencil property is false requests that the new layer be created without a stencil buffer.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/stencil">XRWebGLLayerInit.stencil - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-stencil">XRWebGLLayerInit.stencil - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder stencil(final boolean stencil) {
      setStencil( stencil );
      return this;
    }
  }
}
