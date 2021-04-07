package akasha.crypto;

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
public interface RsaOtherPrimesInfo {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "d"
  )
  String d();

  @JsProperty
  void setD(@Nonnull String d);

  @JsProperty(
      name = "r"
  )
  String r();

  @JsProperty
  void setR(@Nonnull String r);

  @JsProperty(
      name = "t"
  )
  String t();

  @JsProperty
  void setT(@Nonnull String t);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends RsaOtherPrimesInfo {
    @JsOverlay
    @Nonnull
    default Builder d(@Nonnull final String d) {
      setD( d );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder r(@Nonnull final String r) {
      setR( r );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder t(@Nonnull final String t) {
      setT( t );
      return this;
    }
  }
}
