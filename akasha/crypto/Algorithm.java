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
    name = "Algorithm"
)
public interface Algorithm {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "name"
  )
  @Nonnull
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Algorithm"
  )
  interface Builder extends Algorithm {
    @JsOverlay
    @Nonnull
    default Builder name(@Nonnull final String name) {
      setName( name );
      return this;
    }
  }
}
