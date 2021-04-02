package akasha;

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
    name = "Object"
)
public interface DOMMatrix2DInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
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
      name = "c"
  )
  double c();

  @JsProperty
  void setC(double c);

  @JsProperty(
      name = "d"
  )
  double d();

  @JsProperty
  void setD(double d);

  @JsProperty(
      name = "e"
  )
  double e();

  @JsProperty
  void setE(double e);

  @JsProperty(
      name = "f"
  )
  double f();

  @JsProperty
  void setF(double f);

  @JsProperty(
      name = "m11"
  )
  double m11();

  @JsProperty
  void setM11(double m11);

  @JsProperty(
      name = "m12"
  )
  double m12();

  @JsProperty
  void setM12(double m12);

  @JsProperty(
      name = "m21"
  )
  double m21();

  @JsProperty
  void setM21(double m21);

  @JsProperty(
      name = "m22"
  )
  double m22();

  @JsProperty
  void setM22(double m22);

  @JsProperty(
      name = "m41"
  )
  double m41();

  @JsProperty
  void setM41(double m41);

  @JsProperty(
      name = "m42"
  )
  double m42();

  @JsProperty
  void setM42(double m42);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends DOMMatrix2DInit {
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
    default Builder c(final double c) {
      setC( c );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder d(final double d) {
      setD( d );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder e(final double e) {
      setE( e );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder f(final double f) {
      setF( f );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder m11(final double m11) {
      setM11( m11 );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder m12(final double m12) {
      setM12( m12 );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder m21(final double m21) {
      setM21( m21 );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder m22(final double m22) {
      setM22( m22 );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder m41(final double m41) {
      setM41( m41 );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder m42(final double m42) {
      setM42( m42 );
      return this;
    }
  }
}
