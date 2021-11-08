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
    name = "USBDeviceFilter"
)
public interface USBDeviceFilter {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "classCode"
  )
  short classCode();

  @JsProperty
  void setClassCode(short classCode);

  @JsProperty(
      name = "productId"
  )
  int productId();

  @JsProperty
  void setProductId(int productId);

  @JsProperty(
      name = "protocolCode"
  )
  short protocolCode();

  @JsProperty
  void setProtocolCode(short protocolCode);

  @JsProperty(
      name = "serialNumber"
  )
  String serialNumber();

  @JsProperty
  void setSerialNumber(@JsNonNull String serialNumber);

  @JsProperty(
      name = "subclassCode"
  )
  short subclassCode();

  @JsProperty
  void setSubclassCode(short subclassCode);

  @JsProperty(
      name = "vendorId"
  )
  int vendorId();

  @JsProperty
  void setVendorId(int vendorId);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "USBDeviceFilter"
  )
  interface Builder extends USBDeviceFilter {
    @JsOverlay
    @Nonnull
    default Builder classCode(final short classCode) {
      setClassCode( classCode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder productId(final int productId) {
      setProductId( productId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder protocolCode(final short protocolCode) {
      setProtocolCode( protocolCode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder serialNumber(@Nonnull final String serialNumber) {
      setSerialNumber( serialNumber );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder subclassCode(final short subclassCode) {
      setSubclassCode( subclassCode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder vendorId(final int vendorId) {
      setVendorId( vendorId );
      return this;
    }
  }
}
