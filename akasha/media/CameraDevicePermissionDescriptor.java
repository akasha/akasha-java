package akasha.media;

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
  static Builder name(@Nonnull final String name) {
    final Builder $cameraDevicePermissionDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $cameraDevicePermissionDescriptor.setName( name );
    return Js.uncheckedCast( $cameraDevicePermissionDescriptor );
  }

  @JsProperty(
      name = "panTiltZoom"
  )
  boolean panTiltZoom();

  @JsProperty
  void setPanTiltZoom(boolean panTiltZoom);

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
  }
}
