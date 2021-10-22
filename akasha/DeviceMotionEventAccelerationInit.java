package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNullable;
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
    name = "DeviceMotionEventAccelerationInit"
)
public interface DeviceMotionEventAccelerationInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "x"
  )
  @JsNullable
  Double x();

  @JsProperty
  void setX(@JsNullable Double x);

  @JsProperty(
      name = "y"
  )
  @JsNullable
  Double y();

  @JsProperty
  void setY(@JsNullable Double y);

  @JsProperty(
      name = "z"
  )
  @JsNullable
  Double z();

  @JsProperty
  void setZ(@JsNullable Double z);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "DeviceMotionEventAccelerationInit"
  )
  interface Builder extends DeviceMotionEventAccelerationInit {
    @JsOverlay
    @Nonnull
    default Builder x(@Nullable final Double x) {
      setX( x );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder y(@Nullable final Double y) {
      setY( y );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder z(@Nullable final Double z) {
      setZ( z );
      return this;
    }
  }
}
