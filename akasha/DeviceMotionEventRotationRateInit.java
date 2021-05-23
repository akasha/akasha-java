package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
    name = "DeviceMotionEventRotationRateInit"
)
public interface DeviceMotionEventRotationRateInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "alpha"
  )
  @Nullable
  Double alpha();

  @JsProperty
  void setAlpha(@Nullable Double alpha);

  @JsProperty(
      name = "beta"
  )
  @Nullable
  Double beta();

  @JsProperty
  void setBeta(@Nullable Double beta);

  @JsProperty(
      name = "gamma"
  )
  @Nullable
  Double gamma();

  @JsProperty
  void setGamma(@Nullable Double gamma);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "DeviceMotionEventRotationRateInit"
  )
  interface Builder extends DeviceMotionEventRotationRateInit {
    @JsOverlay
    @Nonnull
    default Builder alpha(@Nullable final Double alpha) {
      setAlpha( alpha );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder beta(@Nullable final Double beta) {
      setBeta( beta );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder gamma(@Nullable final Double gamma) {
      setGamma( gamma );
      return this;
    }
  }
}
