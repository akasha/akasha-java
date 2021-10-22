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
  static Step1 challenge(@Nonnull final String challenge) {
    final Builder $collectedClientData = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $collectedClientData.setChallenge( challenge );
    return Js.uncheckedCast( $collectedClientData );
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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "CollectedClientData"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 origin(@Nonnull String origin) {
      Js.<CollectedClientData>uncheckedCast( this ).setOrigin( origin );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "CollectedClientData"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder type(@Nonnull String type) {
      Js.<CollectedClientData>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "CollectedClientData"
  )
  interface Builder extends CollectedClientData {
    @JsOverlay
    @Nonnull
    default Builder crossOrigin(final boolean crossOrigin) {
      setCrossOrigin( crossOrigin );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder tokenBinding(@Nonnull final TokenBinding tokenBinding) {
      setTokenBinding( tokenBinding );
      return this;
    }
  }
}
