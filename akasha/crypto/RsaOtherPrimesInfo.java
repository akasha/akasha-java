package akasha.crypto;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "RsaOtherPrimesInfo"
)
public interface RsaOtherPrimesInfo {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "d"
  )
  String d();

  @JsProperty
  void setD(@JsNonNull String d);

  @JsProperty(
      name = "r"
  )
  String r();

  @JsProperty
  void setR(@JsNonNull String r);

  @JsProperty(
      name = "t"
  )
  String t();

  @JsProperty
  void setT(@JsNonNull String t);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RsaOtherPrimesInfo"
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
