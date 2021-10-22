package akasha.crypto;

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
 * The HmacImportParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.importKey() or SubtleCrypto.unwrapKey(), when generating a key for the HMAC algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HmacImportParams">HmacImportParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HmacImportParams"
)
public interface HmacImportParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static Step1 name(@Nonnull final String name) {
    final Builder $hmacImportParams = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $hmacImportParams.setName( name );
    return Js.uncheckedCast( $hmacImportParams );
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
      name = "length"
  )
  int length();

  @JsProperty
  void setLength(int length);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "HmacImportParams"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder hash(@Nonnull AlgorithmIdentifier hash) {
      Js.<HmacImportParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Builder hash(@Nonnull JsObject hash) {
      Js.<HmacImportParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Builder hash(@Nonnull String hash) {
      Js.<HmacImportParams>uncheckedCast( this ).setHash( hash );
      return Js.uncheckedCast( this );
    }
  }

  /**
   * The HmacImportParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.importKey() or SubtleCrypto.unwrapKey(), when generating a key for the HMAC algorithm.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HmacImportParams">HmacImportParams - MDN</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "HmacImportParams"
  )
  interface Builder extends HmacImportParams {
    @JsOverlay
    @Nonnull
    default Builder length(final int length) {
      setLength( length );
      return this;
    }
  }
}
