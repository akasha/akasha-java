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
    name = "Object"
)
public interface AuthenticatorBiometricPerfBounds {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "FAR"
  )
  float FAR();

  @JsProperty
  void setFAR(float FAR);

  @JsProperty(
      name = "FRR"
  )
  float FRR();

  @JsProperty
  void setFRR(float FRR);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends AuthenticatorBiometricPerfBounds {
    @JsOverlay
    @Nonnull
    default Builder FAR(final float FAR) {
      setFAR( FAR );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder FRR(final float FRR) {
      setFRR( FRR );
      return this;
    }
  }
}
