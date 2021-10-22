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
    name = "KeyAlgorithm"
)
public interface KeyAlgorithm {
  @JsOverlay
  @Nonnull
  static KeyAlgorithm name(@Nonnull final String name) {
    final KeyAlgorithm $keyAlgorithm = Js.<KeyAlgorithm>uncheckedCast( JsPropertyMap.of() );
    $keyAlgorithm.setName( name );
    return Js.uncheckedCast( $keyAlgorithm );
  }

  @JsProperty(
      name = "name"
  )
  @JsNonNull
  String name();

  @JsProperty
  void setName(@JsNonNull String name);
}
