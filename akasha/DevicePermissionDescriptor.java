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
    name = "DevicePermissionDescriptor"
)
public interface DevicePermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static Builder name(@PermissionName @Nonnull final String name) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "deviceId"
  )
  String deviceId();

  @JsProperty
  void setDeviceId(@JsNonNull String deviceId);

  @Generated("org.realityforge.webtack")
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

    @JsOverlay
    @Nonnull
    default Builder name(@PermissionName @Nonnull final String name) {
      setName( name );
      return this;
    }
  }
}
