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
    name = "Object"
)
public interface HmacKeyAlgorithm extends KeyAlgorithm {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name, @Nonnull final KeyAlgorithm hash,
      final int length) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).length( length );
  }

  @JsProperty(
      name = "hash"
  )
  @Nonnull
  KeyAlgorithm hash();

  @JsProperty
  void setHash(@Nonnull KeyAlgorithm hash);

  @JsProperty(
      name = "length"
  )
  int length();

  @JsProperty
  void setLength(int length);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends HmacKeyAlgorithm {
    @JsOverlay
    @Nonnull
    default Builder hash(@Nonnull final KeyAlgorithm hash) {
      setHash( hash );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder length(final int length) {
      setLength( length );
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
