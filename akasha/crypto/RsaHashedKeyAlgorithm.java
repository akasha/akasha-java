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
public interface RsaHashedKeyAlgorithm extends RsaKeyAlgorithm {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, final int modulusLength,
      @Nonnull final Uint8Array publicExponent, @Nonnull final KeyAlgorithm hash) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).modulusLength( modulusLength ).publicExponent( publicExponent ).hash( hash );
  }

  @JsProperty(
      name = "hash"
  )
  @Nonnull
  KeyAlgorithm hash();

  @JsProperty
  void setHash(@Nonnull KeyAlgorithm hash);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends RsaHashedKeyAlgorithm {
    @JsOverlay
    @Nonnull
    default Builder hash(@Nonnull final KeyAlgorithm hash) {
      setHash( hash );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder modulusLength(final int modulusLength) {
      setModulusLength( modulusLength );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder publicExponent(@Nonnull final Uint8Array publicExponent) {
      setPublicExponent( publicExponent );
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
