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
public interface DOMQuadInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "p1"
  )
  DOMPointInit p1();

  @JsProperty
  void setP1(@Nonnull DOMPointInit p1);

  @JsProperty(
      name = "p2"
  )
  DOMPointInit p2();

  @JsProperty
  void setP2(@Nonnull DOMPointInit p2);

  @JsProperty(
      name = "p3"
  )
  DOMPointInit p3();

  @JsProperty
  void setP3(@Nonnull DOMPointInit p3);

  @JsProperty(
      name = "p4"
  )
  DOMPointInit p4();

  @JsProperty
  void setP4(@Nonnull DOMPointInit p4);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends DOMQuadInit {
    @JsOverlay
    @Nonnull
    default Builder p1(@Nonnull final DOMPointInit p1) {
      setP1( p1 );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder p2(@Nonnull final DOMPointInit p2) {
      setP2( p2 );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder p3(@Nonnull final DOMPointInit p3) {
      setP3( p3 );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder p4(@Nonnull final DOMPointInit p4) {
      setP4( p4 );
      return this;
    }
  }
}