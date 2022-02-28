package akasha.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "XRLayerInit"
)
public interface XRLayerInit {
  @JsOverlay
  @Nonnull
  static Step1 space(@Nonnull final XRSpace space) {
    final Builder $xrLayerInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $xrLayerInit.setSpace( space );
    return Js.uncheckedCast( $xrLayerInit );
  }

  @JsProperty(
      name = "space"
  )
  @JsNonNull
  XRSpace space();

  @JsProperty
  void setSpace(@JsNonNull XRSpace space);

  @JsProperty(
      name = "viewPixelWidth"
  )
  int viewPixelWidth();

  @JsProperty
  void setViewPixelWidth(int viewPixelWidth);

  @JsProperty(
      name = "viewPixelHeight"
  )
  int viewPixelHeight();

  @JsProperty
  void setViewPixelHeight(int viewPixelHeight);

  @JsProperty(
      name = "colorFormat"
  )
  int colorFormat();

  @JsProperty
  void setColorFormat(int colorFormat);

  @JsProperty(
      name = "depthFormat"
  )
  @JsNullable
  int depthFormat();

  @JsProperty
  void setDepthFormat(@JsNullable int depthFormat);

  @JsProperty(
      name = "isStatic"
  )
  boolean isStatic();

  @JsProperty
  void setIsStatic(boolean isStatic);

  @JsProperty(
      name = "layout"
  )
  @XRLayerLayout
  String layout();

  @JsProperty
  void setLayout(@XRLayerLayout @JsNonNull String layout);

  @JsProperty(
      name = "mipLevels"
  )
  int mipLevels();

  @JsProperty
  void setMipLevels(int mipLevels);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRLayerInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 viewPixelWidth(int viewPixelWidth) {
      Js.<XRLayerInit>uncheckedCast( this ).setViewPixelWidth( viewPixelWidth );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRLayerInit"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder viewPixelHeight(int viewPixelHeight) {
      Js.<XRLayerInit>uncheckedCast( this ).setViewPixelHeight( viewPixelHeight );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRLayerInit"
  )
  interface Builder extends XRLayerInit {
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
