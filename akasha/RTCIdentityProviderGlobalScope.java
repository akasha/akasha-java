package akasha;

import akasha.rtc.RTCIdentityProviderRegistrar;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCIdentityProviderGlobalScope"
)
public class RTCIdentityProviderGlobalScope extends WorkerGlobalScope {
  protected RTCIdentityProviderGlobalScope() {
  }

  @JsProperty(
      name = "rtcIdentityProvider"
  )
  @Nonnull
  public native RTCIdentityProviderRegistrar rtcIdentityProvider();
}
