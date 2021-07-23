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
    name = "GPUColorDict"
)
@ApiStatus.Experimental
public interface GPUColorDict {
  @JsOverlay
  @Nonnull
  static Builder create(final double r, final double g, final double b, final double a) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).r( r ).g( g ).b( b ).a( a );
  }

  @JsProperty(
      name = "r"
  )
  double r();

  @JsProperty
  void setR(double r);

  @JsProperty(
      name = "g"
  )
  double g();

  @JsProperty
  void setG(double g);

  @JsProperty(
      name = "b"
  )
  double b();

  @JsProperty
  void setB(double b);

  @JsProperty(
      name = "a"
  )
  double a();

  @JsProperty
  void setA(double a);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUColorDict"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUColorDict {
    @JsOverlay
    @Nonnull
    default Builder r(final double r) {
      setR( r );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder g(final double g) {
      setG( g );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder b(final double b) {
      setB( b );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder a(final double a) {
      setA( a );
      return this;
    }
  }
}
