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
    name = "PublicKeyCredentialParameters"
)
public interface PublicKeyCredentialParameters {
  @JsOverlay
  @Nonnull
  static Builder create(final int alg, @Nonnull final String type) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).alg( alg ).type( type );
  }

  @JsProperty(
      name = "alg"
  )
  int alg();

  @JsProperty
  void setAlg(int alg);

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
      name = "PublicKeyCredentialParameters"
  )
  interface Builder extends PublicKeyCredentialParameters {
    @JsOverlay
    @Nonnull
    default Builder alg(final int alg) {
      setAlg( alg );
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
