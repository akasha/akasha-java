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
    name = "CredentialData"
)
public interface CredentialData {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String id) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).id( id );
  }

  @JsProperty(
      name = "id"
  )
  @JsNonNull
  String id();

  @JsProperty
  void setId(@JsNonNull String id);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "CredentialData"
  )
  interface Builder extends CredentialData {
    @JsOverlay
    @Nonnull
    default Builder id(@Nonnull final String id) {
      setId( id );
      return this;
    }
  }
}
