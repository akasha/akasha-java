package akasha.crypto;

import akasha.core.Uint8Array;
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
public interface RsaKeyAlgorithm extends KeyAlgorithm {
  @JsOverlay
  @Nonnull
  static RsaKeyAlgorithm create(@Nonnull final String name, final int modulusLength,
      @Nonnull final Uint8Array publicExponent) {
    return Js.<RsaKeyAlgorithm>uncheckedCast( JsPropertyMap.of() ).name( name ).modulusLength( modulusLength ).publicExponent( publicExponent );
  }

  @JsProperty(
      name = "modulusLength"
  )
  int modulusLength();

  @JsProperty
  void setModulusLength(int modulusLength);

  @JsOverlay
  @Nonnull
  default RsaKeyAlgorithm modulusLength(final int modulusLength) {
    setModulusLength( modulusLength );
    return this;
  }

  @JsProperty(
      name = "publicExponent"
  )
  @Nonnull
  Uint8Array publicExponent();

  @JsProperty
  void setPublicExponent(@Nonnull Uint8Array publicExponent);

  @JsOverlay
  @Nonnull
  default RsaKeyAlgorithm publicExponent(@Nonnull final Uint8Array publicExponent) {
    setPublicExponent( publicExponent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RsaKeyAlgorithm name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
