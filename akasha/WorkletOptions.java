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
    name = "WorkletOptions"
)
public interface WorkletOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "credentials"
  )
  @RequestCredentials
  String credentials();

  @JsProperty
  void setCredentials(@RequestCredentials @JsNonNull String credentials);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "WorkletOptions"
  )
  interface Builder extends WorkletOptions {
    @JsOverlay
    @Nonnull
    default Builder credentials(@RequestCredentials @Nonnull final String credentials) {
      setCredentials( credentials );
      return this;
    }
  }
}
