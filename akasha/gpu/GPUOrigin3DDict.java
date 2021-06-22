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
    name = "GPUOrigin3DDict"
)
public interface GPUOrigin3DDict {
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

  @JsProperty(
      name = "z"
  )
  int z();

  @JsProperty
  void setZ(int z);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUOrigin3DDict"
  )
  interface Builder extends GPUOrigin3DDict {
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

    @JsOverlay
    @Nonnull
    default Builder z(final int z) {
      setZ( z );
      return this;
    }
  }
}
