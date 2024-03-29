package akasha;

import akasha.lang.JsArray;
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
    name = "FederatedCredentialRequestOptions"
)
public interface FederatedCredentialRequestOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "protocols"
  )
  JsArray<String> protocols();

  @JsProperty
  void setProtocols(@JsNonNull JsArray<String> protocols);

  @JsOverlay
  default void setProtocols(@Nonnull final String... protocols) {
    setProtocols( Js.<JsArray<String>>uncheckedCast( protocols ) );
  }

  @JsProperty(
      name = "providers"
  )
  JsArray<String> providers();

  @JsProperty
  void setProviders(@JsNonNull JsArray<String> providers);

  @JsOverlay
  default void setProviders(@Nonnull final String... providers) {
    setProviders( Js.<JsArray<String>>uncheckedCast( providers ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "FederatedCredentialRequestOptions"
  )
  interface Builder extends FederatedCredentialRequestOptions {
    @JsOverlay
    @Nonnull
    default Builder protocols(@Nonnull final JsArray<String> protocols) {
      setProtocols( protocols );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder protocols(@Nonnull final String... protocols) {
      setProtocols( protocols );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder providers(@Nonnull final JsArray<String> providers) {
      setProviders( providers );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder providers(@Nonnull final String... providers) {
      setProviders( providers );
      return this;
    }
  }
}
