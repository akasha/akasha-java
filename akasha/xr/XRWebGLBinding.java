package akasha.xr;

import akasha.core.JsObject;
import akasha.gl.WebGLTexture;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The XRWebGLBinding interface is used to create layers that have a GPU backend.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLBinding">XRWebGLBinding - MDN</a>
 * @see <a href="https://immersive-web.github.io/layers/#XRWebGLBindingtype"># XRWebGLBindingtype</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRWebGLBinding"
)
public class XRWebGLBinding extends JsObject {
  public XRWebGLBinding(@Nonnull final XRSession session,
      @Nonnull final XRWebGLRenderingContext context) {
  }

  @JsProperty(
      name = "nativeProjectionScaleFactor"
  )
  public native double nativeProjectionScaleFactor();

  @JsProperty(
      name = "usesDepthValues"
  )
  public native boolean usesDepthValues();

  @JsNonNull
  public native XRCubeLayer createCubeLayer(@Nonnull XRCubeLayerInit init);

  @JsNonNull
  public native XRCubeLayer createCubeLayer();

  @JsNonNull
  public native XRCylinderLayer createCylinderLayer(@Nonnull XRCylinderLayerInit init);

  @JsNonNull
  public native XRCylinderLayer createCylinderLayer();

  @JsNonNull
  public native XREquirectLayer createEquirectLayer(@Nonnull XREquirectLayerInit init);

  @JsNonNull
  public native XREquirectLayer createEquirectLayer();

  @JsNonNull
  public native XRProjectionLayer createProjectionLayer(@Nonnull XRProjectionLayerInit init);

  @JsNonNull
  public native XRProjectionLayer createProjectionLayer();

  @JsNonNull
  public native XRQuadLayer createQuadLayer(@Nonnull XRQuadLayerInit init);

  @JsNonNull
  public native XRQuadLayer createQuadLayer();

  @JsNonNull
  public native XRWebGLSubImage getSubImage(@Nonnull XRCompositionLayer layer,
      @Nonnull XRFrame frame, @XREye @Nonnull String eye);

  @JsNonNull
  public native XRWebGLSubImage getSubImage(@Nonnull XRCompositionLayer layer,
      @Nonnull XRFrame frame);

  @JsNonNull
  public native XRWebGLSubImage getViewSubImage(@Nonnull XRProjectionLayer layer,
      @Nonnull XRView view);

  @JsOverlay
  public final boolean isGetDepthInformationSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRWebGLBinding_getDepthInformation__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRWebGLBinding_getDepthInformation__supported" ) ) ? false : Js.asPropertyMap( this ).has( "getDepthInformation" );
  }

  @JsNullable
  public native XRWebGLDepthInformation getDepthInformation(@Nonnull XRView view);

  @JsOverlay
  public final boolean isGetReflectionCubeMapSupported() {
    return "true".equals( System.getProperty( "akasha.is__XRWebGLBinding_getReflectionCubeMap__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__XRWebGLBinding_getReflectionCubeMap__supported" ) ) ? false : Js.asPropertyMap( this ).has( "getReflectionCubeMap" );
  }

  @JsNullable
  public native WebGLTexture getReflectionCubeMap(@Nonnull XRLightProbe lightProbe);
}
