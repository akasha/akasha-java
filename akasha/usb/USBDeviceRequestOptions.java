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
    name = "USBDeviceRequestOptions"
)
public interface USBDeviceRequestOptions {
  @JsOverlay
  @Nonnull
  static USBDeviceRequestOptions filters(@Nonnull final JsArray<USBDeviceFilter> filters) {
    final USBDeviceRequestOptions $usbDeviceRequestOptions = Js.<USBDeviceRequestOptions>uncheckedCast( JsPropertyMap.of() );
    $usbDeviceRequestOptions.setFilters( filters );
    return Js.uncheckedCast( $usbDeviceRequestOptions );
  }

  @JsOverlay
  @Nonnull
  static USBDeviceRequestOptions filters(@Nonnull final USBDeviceFilter... filters) {
    final USBDeviceRequestOptions $usbDeviceRequestOptions = Js.<USBDeviceRequestOptions>uncheckedCast( JsPropertyMap.of() );
    $usbDeviceRequestOptions.setFilters( filters );
    return Js.uncheckedCast( $usbDeviceRequestOptions );
  }

  @JsProperty(
      name = "filters"
  )
  @JsNonNull
  JsArray<USBDeviceFilter> filters();

  @JsProperty
  void setFilters(@JsNonNull JsArray<USBDeviceFilter> filters);

  @JsOverlay
  default void setFilters(@Nonnull final USBDeviceFilter... filters) {
    setFilters( Js.<JsArray<USBDeviceFilter>>uncheckedCast( filters ) );
  }
}
