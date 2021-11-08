package akasha.usb;

import akasha.lang.JsArray;
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
    name = "USBPermissionStorage"
)
public interface USBPermissionStorage {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "allowedDevices"
  )
  JsArray<AllowedUSBDevice> allowedDevices();

  @JsProperty
  void setAllowedDevices(@JsNonNull JsArray<AllowedUSBDevice> allowedDevices);

  @JsOverlay
  default void setAllowedDevices(@Nonnull final AllowedUSBDevice... allowedDevices) {
    setAllowedDevices( Js.<JsArray<AllowedUSBDevice>>uncheckedCast( allowedDevices ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "USBPermissionStorage"
  )
  interface Builder extends USBPermissionStorage {
    @JsOverlay
    @Nonnull
    default Builder allowedDevices(@Nonnull final JsArray<AllowedUSBDevice> allowedDevices) {
      setAllowedDevices( allowedDevices );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder allowedDevices(@Nonnull final AllowedUSBDevice... allowedDevices) {
      setAllowedDevices( allowedDevices );
      return this;
    }
  }
}
