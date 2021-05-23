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
    name = "CameraDevicePermissionDescriptor"
)
public interface CameraDevicePermissionDescriptor extends DevicePermissionDescriptor {
  @JsOverlay
  @Nonnull
  static Builder create(@PermissionName @Nonnull final String name) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "panTiltZoom"
  )
  boolean panTiltZoom();

  @JsProperty
  void setPanTiltZoom(boolean panTiltZoom);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "CameraDevicePermissionDescriptor"
  )
  interface Builder extends CameraDevicePermissionDescriptor {
    @JsOverlay
    @Nonnull
    default Builder panTiltZoom(final boolean panTiltZoom) {
      setPanTiltZoom( panTiltZoom );
      return this;
    }

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
