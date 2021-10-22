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
 * The Pbkdf2Params dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.deriveKey(), when using the PBKDF2 algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Pbkdf2Params">Pbkdf2Params - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Pbkdf2Params"
)
public interface Pbkdf2Params extends Algorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final Pbkdf2Params $pbkdf2Params = Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() );
    $pbkdf2Params.setName( name );
    return Js.uncheckedCast( $pbkdf2Params );
  }

  @JsProperty(
      name = "salt"
  )
  @JsNonNull
  BufferSource salt();

  @JsProperty
  void setSalt(@JsNonNull BufferSource salt);

  @JsProperty(
      name = "iterations"
  )
  int iterations();

  @JsProperty
  void setIterations(int iterations);

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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Pbkdf2Params"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 salt(@Nonnull BufferSource salt) {
      Js.<Pbkdf2Params>uncheckedCast( this ).setSalt( salt );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Pbkdf2Params"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 iterations(int iterations) {
      Js.<Pbkdf2Params>uncheckedCast( this ).setIterations( iterations );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Pbkdf2Params"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Pbkdf2Params hash(@Nonnull AlgorithmIdentifier hash) {
      Js.<Pbkdf2Params>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Pbkdf2Params hash(@Nonnull JsObject hash) {
      Js.<Pbkdf2Params>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Pbkdf2Params hash(@Nonnull String hash) {
      Js.<Pbkdf2Params>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }
  }
}
