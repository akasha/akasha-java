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
  static CredentialData id(@Nonnull final String id) {
    final CredentialData $credentialData = Js.<CredentialData>uncheckedCast( JsPropertyMap.of() );
    $credentialData.setId( id );
    return Js.uncheckedCast( $credentialData );
  }

  @JsProperty(
      name = "id"
  )
  @JsNonNull
  String id();

  @JsProperty
  void setId(@JsNonNull String id);
}
