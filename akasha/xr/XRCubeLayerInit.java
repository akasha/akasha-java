package akasha.xr;

import akasha.DOMPointReadOnly;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRCubeLayerInit"
)
public interface XRCubeLayerInit extends XRLayerInit {
  @JsOverlay
  @Nonnull
  static Step1 space(@Nonnull final XRSpace space) {
    final Builder $xrCubeLayerInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $xrCubeLayerInit.setSpace( space );
    return Js.uncheckedCast( $xrCubeLayerInit );
  }

  @JsProperty(
      name = "orientation"
  )
  @JsNullable
  DOMPointReadOnly orientation();

  @JsProperty
  void setOrientation(@JsNullable DOMPointReadOnly orientation);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRCubeLayerInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 viewPixelWidth(int viewPixelWidth) {
      Js.<XRCubeLayerInit>uncheckedCast( this ).setViewPixelWidth( viewPixelWidth );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRCubeLayerInit"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder viewPixelHeight(int viewPixelHeight) {
      Js.<XRCubeLayerInit>uncheckedCast( this ).setViewPixelHeight( viewPixelHeight );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRCubeLayerInit"
  )
  interface Builder extends XRCubeLayerInit {
    @JsOverlay
    @Nonnull
    default Builder orientation(@Nullable final DOMPointReadOnly orientation) {
      setOrientation( orientation );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder colorFormat(final int colorFormat) {
      setColorFormat( colorFormat );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthFormat(final int depthFormat) {
      setDepthFormat( depthFormat );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder isStatic(final boolean isStatic) {
      setIsStatic( isStatic );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder layout(@XRLayerLayout @Nonnull final String layout) {
      setLayout( layout );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mipLevels(final int mipLevels) {
      setMipLevels( mipLevels );
      return this;
    }
  }
}
