package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUExtent3DDict"
)
@ApiStatus.Experimental
public interface GPUExtent3DDict {
  @JsOverlay
  @Nonnull
  static Builder width(final int width) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).width( width );
  }

  @JsProperty(
      name = "width"
  )
  int width();

  @JsProperty
  void setWidth(int width);

  @JsProperty(
      name = "depthOrArrayLayers"
  )
  int depthOrArrayLayers();

  @JsProperty
  void setDepthOrArrayLayers(int depthOrArrayLayers);

  @JsProperty(
      name = "height"
  )
  int height();

  @JsProperty
  void setHeight(int height);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUExtent3DDict"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUExtent3DDict {
    @JsOverlay
    @Nonnull
    default Builder width(final int width) {
      setWidth( width );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthOrArrayLayers(final int depthOrArrayLayers) {
      setDepthOrArrayLayers( depthOrArrayLayers );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder height(final int height) {
      setHeight( height );
      return this;
    }
  }
}
