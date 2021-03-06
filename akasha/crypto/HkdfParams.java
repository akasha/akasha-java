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
  static Builder create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final BufferSource salt, @Nonnull final BufferSource info) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).salt( salt ).info( info );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final JsObject hash,
      @Nonnull final BufferSource salt, @Nonnull final BufferSource info) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).salt( salt ).info( info );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource salt, @Nonnull final BufferSource info) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).salt( salt ).info( info );
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
  interface Builder extends HkdfParams {
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
    default Builder salt(@Nonnull final BufferSource salt) {
      setSalt( salt );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder info(@Nonnull final BufferSource info) {
      setInfo( info );
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
