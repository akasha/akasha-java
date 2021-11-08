package akasha.usb;

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
    name = "AllowedUSBDevice"
)
public interface AllowedUSBDevice {
  @JsOverlay
  @Nonnull
  static Step1 vendorId(final short vendorId) {
    final Builder $allowedUSBDevice = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $allowedUSBDevice.setVendorId( vendorId );
    return Js.uncheckedCast( $allowedUSBDevice );
  }

  @JsProperty(
      name = "vendorId"
  )
  short vendorId();

  @JsProperty
  void setVendorId(short vendorId);

  @JsProperty(
      name = "productId"
  )
  short productId();

  @JsProperty
  void setProductId(short productId);

  @JsProperty(
      name = "serialNumber"
  )
  String serialNumber();

  @JsProperty
  void setSerialNumber(@JsNonNull String serialNumber);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AllowedUSBDevice"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder productId(short productId) {
      Js.<AllowedUSBDevice>uncheckedCast( this ).setProductId( productId );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AllowedUSBDevice"
  )
  interface Builder extends AllowedUSBDevice {
    @JsOverlay
    @Nonnull
    default Builder serialNumber(@Nonnull final String serialNumber) {
      setSerialNumber( serialNumber );
      return this;
    }
  }
}
