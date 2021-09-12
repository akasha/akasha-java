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
  static Builder create(@Nonnull final String name, @Nonnull final BufferSource salt,
      final int iterations, @Nonnull final AlgorithmIdentifier hash) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).salt( salt ).iterations( iterations ).hash( hash );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final BufferSource salt,
      final int iterations, @Nonnull final JsObject hash) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).salt( salt ).iterations( iterations ).hash( hash );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final BufferSource salt,
      final int iterations, @Nonnull final String hash) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).salt( salt ).iterations( iterations ).hash( hash );
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
  interface Builder extends Pbkdf2Params {
    @JsOverlay
    @Nonnull
    default Builder salt(@Nonnull final BufferSource salt) {
      setSalt( salt );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder iterations(final int iterations) {
      setIterations( iterations );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder hash(@Nonnull final AlgorithmIdentifier hash) {
      setHash( hash );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder hash(@Nonnull final JsObject hash) {
      setHash( hash );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder hash(@Nonnull final String hash) {
      setHash( hash );
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
