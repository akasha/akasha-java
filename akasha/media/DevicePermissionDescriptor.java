package akasha.media;

import akasha.PermissionDescriptor;
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
    name = "DevicePermissionDescriptor"
)
public interface DevicePermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static Builder name(@Nonnull final String name) {
    final Builder $devicePermissionDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $devicePermissionDescriptor.setName( name );
    return Js.uncheckedCast( $devicePermissionDescriptor );
  }

  @JsProperty(
      name = "deviceId"
  )
  String deviceId();

  @JsProperty
  void setDeviceId(@JsNonNull String deviceId);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "DevicePermissionDescriptor"
  )
  interface Builder extends DevicePermissionDescriptor {
    @JsOverlay
    @Nonnull
    default Builder deviceId(@Nonnull final String deviceId) {
      setDeviceId( deviceId );
      return this;
    }
  }
}
