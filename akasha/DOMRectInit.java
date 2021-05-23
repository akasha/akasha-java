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
    name = "DOMRectInit"
)
public interface DOMRectInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "height"
  )
  double height();

  @JsProperty
  void setHeight(double height);

  @JsProperty(
      name = "width"
  )
  double width();

  @JsProperty
  void setWidth(double width);

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

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "DOMRectInit"
  )
  interface Builder extends DOMRectInit {
    @JsOverlay
    @Nonnull
    default Builder height(final double height) {
      setHeight( height );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder width(final double width) {
      setWidth( width );
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
  }
}
