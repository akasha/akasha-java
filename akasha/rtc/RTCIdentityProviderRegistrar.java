package akasha.rtc;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCIdentityProviderRegistrar"
)
public class RTCIdentityProviderRegistrar extends JsObject {
  protected RTCIdentityProviderRegistrar() {
  }

  public native void register(@Nonnull RTCIdentityProvider idp);
}
