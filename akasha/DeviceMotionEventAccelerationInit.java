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
    name = "Object"
)
public interface DeviceMotionEventAccelerationInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "x"
  )
  @Nullable
  Double x();

  @JsProperty
  void setX(@Nullable Double x);

  @JsProperty(
      name = "y"
  )
  @Nullable
  Double y();

  @JsProperty
  void setY(@Nullable Double y);

  @JsProperty(
      name = "z"
  )
  @Nullable
  Double z();

  @JsProperty
  void setZ(@Nullable Double z);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
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
