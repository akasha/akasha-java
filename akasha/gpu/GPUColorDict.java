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
    name = "GPUColorDict"
)
public interface GPUColorDict {
  @JsOverlay
  @Nonnull
  static Builder create(final double a, final double b, final double g, final double r) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).a( a ).b( b ).g( g ).r( r );
  }

  @JsProperty(
      name = "a"
  )
  double a();

  @JsProperty
  void setA(double a);

  @JsProperty(
      name = "b"
  )
  double b();

  @JsProperty
  void setB(double b);

  @JsProperty(
      name = "g"
  )
  double g();

  @JsProperty
  void setG(double g);

  @JsProperty(
      name = "r"
  )
  double r();

  @JsProperty
  void setR(double r);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUColorDict"
  )
  interface Builder extends GPUColorDict {
    @JsOverlay
    @Nonnull
    default Builder a(final double a) {
      setA( a );
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
    default Builder g(final double g) {
      setG( g );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder r(final double r) {
      setR( r );
      return this;
    }
  }
}