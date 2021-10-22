package akasha;

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
    name = "CredentialPropertiesOutput"
)
public interface CredentialPropertiesOutput {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "rk"
  )
  boolean rk();

  @JsProperty
  void setRk(boolean rk);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "CredentialPropertiesOutput"
  )
  interface Builder extends CredentialPropertiesOutput {
    @JsOverlay
    @Nonnull
    default Builder rk(final boolean rk) {
      setRk( rk );
      return this;
    }
  }
}
