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
    name = "RsaKeyGenParams"
)
public interface RsaKeyGenParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, final int modulusLength,
      @Nonnull final Uint8Array publicExponent) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).modulusLength( modulusLength ).publicExponent( publicExponent );
  }

  @JsProperty(
      name = "modulusLength"
  )
  int modulusLength();

  @JsProperty
  void setModulusLength(int modulusLength);

  @JsProperty(
      name = "publicExponent"
  )
  @Nonnull
  Uint8Array publicExponent();

  @JsProperty
  void setPublicExponent(@Nonnull Uint8Array publicExponent);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RsaKeyGenParams"
  )
  interface Builder extends RsaKeyGenParams {
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
