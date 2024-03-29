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
    name = "DeviceMotionEventInit"
)
public interface DeviceMotionEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "acceleration"
  )
  DeviceMotionEventAccelerationInit acceleration();

  @JsProperty
  void setAcceleration(@JsNonNull DeviceMotionEventAccelerationInit acceleration);

  @JsProperty(
      name = "accelerationIncludingGravity"
  )
  DeviceMotionEventAccelerationInit accelerationIncludingGravity();

  @JsProperty
  void setAccelerationIncludingGravity(
      @JsNonNull DeviceMotionEventAccelerationInit accelerationIncludingGravity);

  @JsProperty(
      name = "interval"
  )
  double interval();

  @JsProperty
  void setInterval(double interval);

  @JsProperty(
      name = "rotationRate"
  )
  DeviceMotionEventRotationRateInit rotationRate();

  @JsProperty
  void setRotationRate(@JsNonNull DeviceMotionEventRotationRateInit rotationRate);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "DeviceMotionEventInit"
  )
  interface Builder extends DeviceMotionEventInit {
    @JsOverlay
    @Nonnull
    default Builder acceleration(@Nonnull final DeviceMotionEventAccelerationInit acceleration) {
      setAcceleration( acceleration );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder accelerationIncludingGravity(
        @Nonnull final DeviceMotionEventAccelerationInit accelerationIncludingGravity) {
      setAccelerationIncludingGravity( accelerationIncludingGravity );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder interval(final double interval) {
      setInterval( interval );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rotationRate(@Nonnull final DeviceMotionEventRotationRateInit rotationRate) {
      setRotationRate( rotationRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
