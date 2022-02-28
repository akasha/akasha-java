package akasha.xr;

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
    name = "XRRayDirectionInit"
)
public interface XRRayDirectionInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "w"
  )
  double w();

  @JsProperty
  void setW(double w);

  @JsProperty(
      name = "x"
  )
  double x();

  @JsProperty
  void setX(double x);

  @JsProperty(
      name = "y"
  )
  double y();

  @JsProperty
  void setY(double y);

  @JsProperty(
      name = "z"
  )
  double z();

  @JsProperty
  void setZ(double z);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRRayDirectionInit"
  )
  interface Builder extends XRRayDirectionInit {
    @JsOverlay
    @Nonnull
    default Builder w(final double w) {
      setW( w );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder x(final double x) {
      setX( x );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder y(final double y) {
      setY( y );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder z(final double z) {
      setZ( z );
      return this;
    }
  }
}
