package akasha.usb;

import akasha.PermissionDescriptor;
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
    name = "USBPermissionDescriptor"
)
public interface USBPermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static Builder name(@Nonnull final String name) {
    final Builder $usbPermissionDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $usbPermissionDescriptor.setName( name );
    return Js.uncheckedCast( $usbPermissionDescriptor );
  }

  @JsProperty(
      name = "filters"
  )
  JsArray<USBDeviceFilter> filters();

  @JsProperty
  void setFilters(@JsNonNull JsArray<USBDeviceFilter> filters);

  @JsOverlay
  default void setFilters(@Nonnull final USBDeviceFilter... filters) {
    setFilters( Js.<JsArray<USBDeviceFilter>>uncheckedCast( filters ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "USBPermissionDescriptor"
  )
  interface Builder extends USBPermissionDescriptor {
    @JsOverlay
    @Nonnull
    default Builder filters(@Nonnull final JsArray<USBDeviceFilter> filters) {
      setFilters( filters );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder filters(@Nonnull final USBDeviceFilter... filters) {
      setFilters( filters );
      return this;
    }
  }
}
