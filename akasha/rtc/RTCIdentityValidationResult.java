package akasha.rtc;

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
    name = "RTCIdentityValidationResult"
)
public interface RTCIdentityValidationResult {
  @JsOverlay
  @Nonnull
  static Step1 contents(@Nonnull final String contents) {
    final RTCIdentityValidationResult $rtcIdentityValidationResult = Js.<RTCIdentityValidationResult>uncheckedCast( JsPropertyMap.of() );
    $rtcIdentityValidationResult.setContents( contents );
    return Js.uncheckedCast( $rtcIdentityValidationResult );
  }

  @JsProperty(
      name = "contents"
  )
  @JsNonNull
  String contents();

  @JsProperty
  void setContents(@JsNonNull String contents);

  @JsProperty(
      name = "identity"
  )
  @JsNonNull
  String identity();

  @JsProperty
  void setIdentity(@JsNonNull String identity);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCIdentityValidationResult"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default RTCIdentityValidationResult identity(@Nonnull String identity) {
      Js.<RTCIdentityValidationResult>uncheckedCast( this ).setIdentity( identity );
      return Js.uncheckedCast( this );
    }
  }
}
