package akasha.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "XRProjectionLayerInit"
)
public interface XRProjectionLayerInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "colorFormat"
  )
  int colorFormat();

  @JsProperty
  void setColorFormat(int colorFormat);

  @JsProperty(
      name = "depthFormat"
  )
  int depthFormat();

  @JsProperty
  void setDepthFormat(int depthFormat);

  @JsProperty(
      name = "scaleFactor"
  )
  double scaleFactor();

  @JsProperty
  void setScaleFactor(double scaleFactor);

  @JsProperty(
      name = "textureType"
  )
  @XRTextureType
  String textureType();

  @JsProperty
  void setTextureType(@XRTextureType @JsNonNull String textureType);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRProjectionLayerInit"
  )
  interface Builder extends XRProjectionLayerInit {
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
    default Builder scaleFactor(final double scaleFactor) {
      setScaleFactor( scaleFactor );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder textureType(@XRTextureType @Nonnull final String textureType) {
      setTextureType( textureType );
      return this;
    }
  }
}
