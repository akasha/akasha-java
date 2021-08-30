package akasha;

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
    name = "CollectedClientData"
)
public interface CollectedClientData {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String challenge, @Nonnull final String origin,
      @Nonnull final String type) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).origin( origin ).type( type );
  }

  @JsProperty(
      name = "challenge"
  )
  @JsNonNull
  String challenge();

  @JsProperty
  void setChallenge(@JsNonNull String challenge);

  @JsProperty(
      name = "crossOrigin"
  )
  boolean crossOrigin();

  @JsProperty
  void setCrossOrigin(boolean crossOrigin);

  @JsProperty(
      name = "origin"
  )
  @JsNonNull
  String origin();

  @JsProperty
  void setOrigin(@JsNonNull String origin);

  @JsProperty(
      name = "tokenBinding"
  )
  TokenBinding tokenBinding();

  @JsProperty
  void setTokenBinding(@JsNonNull TokenBinding tokenBinding);

  @JsProperty(
      name = "type"
  )
  @JsNonNull
  String type();

  @JsProperty
  void setType(@JsNonNull String type);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "CollectedClientData"
  )
  interface Builder extends CollectedClientData {
    @JsOverlay
    @Nonnull
    default Builder challenge(@Nonnull final String challenge) {
      setChallenge( challenge );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder crossOrigin(final boolean crossOrigin) {
      setCrossOrigin( crossOrigin );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder origin(@Nonnull final String origin) {
      setOrigin( origin );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder tokenBinding(@Nonnull final TokenBinding tokenBinding) {
      setTokenBinding( tokenBinding );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
