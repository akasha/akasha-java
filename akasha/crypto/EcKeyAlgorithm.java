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
public interface EcKeyAlgorithm extends KeyAlgorithm {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final String namedCurve) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).namedCurve( namedCurve );
  }

  @JsProperty(
      name = "namedCurve"
  )
  @Nonnull
  String namedCurve();

  @JsProperty
  void setNamedCurve(@Nonnull String namedCurve);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends EcKeyAlgorithm {
    @JsOverlay
    @Nonnull
    default Builder namedCurve(@Nonnull final String namedCurve) {
      setNamedCurve( namedCurve );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder name(@Nonnull final String name) {
      setName( name );
      return this;
    }
  }
}
