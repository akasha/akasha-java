package akasha.crypto;

import akasha.core.BufferSource;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * A DOMString. This should be set to HKDF.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HkdfParams">HkdfParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HkdfParams"
)
public interface HkdfParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final HkdfParams $hkdfParams = Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() );
    $hkdfParams.setName( name );
    return Js.uncheckedCast( $hkdfParams );
  }

  @JsProperty(
      name = "hash"
  )
  @JsNonNull
  AlgorithmIdentifier hash();

  @JsProperty
  void setHash(@JsNonNull AlgorithmIdentifier hash);

  @JsOverlay
  default void setHash(@Nonnull final JsObject hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  default void setHash(@Nonnull final String hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsProperty(
      name = "salt"
  )
  @JsNonNull
  BufferSource salt();

  @JsProperty
  void setSalt(@JsNonNull BufferSource salt);

  @JsProperty(
      name = "info"
  )
  @JsNonNull
  BufferSource info();

  @JsProperty
  void setInfo(@JsNonNull BufferSource info);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "HkdfParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 hash(@Nonnull AlgorithmIdentifier hash) {
      Js.<HkdfParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step2 hash(@Nonnull JsObject hash) {
      Js.<HkdfParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step2 hash(@Nonnull String hash) {
      Js.<HkdfParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "HkdfParams"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 salt(@Nonnull BufferSource salt) {
      Js.<HkdfParams>uncheckedCast( this ).setSalt( salt );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "HkdfParams"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default HkdfParams info(@Nonnull BufferSource info) {
      Js.<HkdfParams>uncheckedCast( this ).setInfo( info );
      return Js.uncheckedCast( this );
    }
  }
}
