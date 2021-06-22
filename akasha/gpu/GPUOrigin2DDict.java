package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
    name = "GPUOrigin2DDict"
)
public interface GPUOrigin2DDict {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "x"
  )
  int x();

  @JsProperty
  void setX(int x);

  @JsProperty(
      name = "y"
  )
  int y();

  @JsProperty
  void setY(int y);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUOrigin2DDict"
  )
  interface Builder extends GPUOrigin2DDict {
    @JsOverlay
    @Nonnull
    default Builder x(final int x) {
      setX( x );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder y(final int y) {
      setY( y );
      return this;
    }
  }
}
