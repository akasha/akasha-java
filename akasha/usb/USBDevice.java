package akasha.usb;

import akasha.core.BufferSource;
import akasha.core.JsObject;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The USBDevice interface of the WebUSB API provides access to metadata about a paired USB device and methods for controlling it.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/USBDevice">USBDevice - MDN</a>
 * @see <a href="https://wicg.github.io/webusb/#device-usage"># device-usage</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "USBDevice"
)
public class USBDevice extends JsObject {
  protected USBDevice() {
  }

  @JsProperty(
      name = "configuration"
  )
  @Nullable
  public native USBConfiguration configuration();

  @JsProperty(
      name = "configurations"
  )
  @Nonnull
  public native JsArray<USBConfiguration> configurations();

  @JsProperty(
      name = "deviceClass"
  )
  public native short deviceClass();

  @JsProperty(
      name = "deviceProtocol"
  )
  public native short deviceProtocol();

  @JsProperty(
      name = "deviceSubclass"
  )
  public native short deviceSubclass();

  @JsProperty(
      name = "deviceVersionMajor"
  )
  public native short deviceVersionMajor();

  @JsProperty(
      name = "deviceVersionMinor"
  )
  public native short deviceVersionMinor();

  @JsProperty(
      name = "deviceVersionSubminor"
  )
  public native short deviceVersionSubminor();

  @JsProperty(
      name = "manufacturerName"
  )
  @Nullable
  public native String manufacturerName();

  @JsProperty(
      name = "opened"
  )
  public native boolean opened();

  @JsProperty(
      name = "productId"
  )
  public native int productId();

  @JsProperty(
      name = "productName"
  )
  @Nullable
  public native String productName();

  @JsProperty(
      name = "serialNumber"
  )
  @Nullable
  public native String serialNumber();

  @JsProperty(
      name = "usbVersionMajor"
  )
  public native short usbVersionMajor();

  @JsProperty(
      name = "usbVersionMinor"
  )
  public native short usbVersionMinor();

  @JsProperty(
      name = "usbVersionSubminor"
  )
  public native short usbVersionSubminor();

  @JsProperty(
      name = "vendorId"
  )
  public native int vendorId();

  @JsNonNull
  public native Promise<Void> claimInterface(short interfaceNumber);

  @JsNonNull
  public native Promise<Void> clearHalt(@USBDirection @Nonnull String direction,
      short endpointNumber);

  @JsNonNull
  public native Promise<Void> close();

  @JsNonNull
  public native Promise<USBInTransferResult> controlTransferIn(
      @Nonnull USBControlTransferParameters setup, int length);

  @JsNonNull
  public native Promise<USBOutTransferResult> controlTransferOut(
      @Nonnull USBControlTransferParameters setup, @Nonnull BufferSource data);

  @JsNonNull
  public native Promise<USBOutTransferResult> controlTransferOut(
      @Nonnull USBControlTransferParameters setup);

  @JsNonNull
  public native Promise<USBIsochronousInTransferResult> isochronousTransferIn(short endpointNumber,
      @Nonnull JsArray<Double> packetLengths);

  @JsOverlay
  @JsNonNull
  public final Promise<USBIsochronousInTransferResult> isochronousTransferIn(
      final short endpointNumber, @Nonnull final double... packetLengths) {
    return _isochronousTransferIn( endpointNumber, packetLengths );
  }

  @JsMethod(
      name = "isochronousTransferIn"
  )
  @JsNonNull
  private native Promise<USBIsochronousInTransferResult> _isochronousTransferIn(
      short endpointNumber, @Nonnull double[] packetLengths);

  @JsNonNull
  public native Promise<USBIsochronousOutTransferResult> isochronousTransferOut(
      short endpointNumber, @Nonnull BufferSource data, @Nonnull JsArray<Double> packetLengths);

  @JsOverlay
  @JsNonNull
  public final Promise<USBIsochronousOutTransferResult> isochronousTransferOut(
      final short endpointNumber, @Nonnull final BufferSource data,
      @Nonnull final double... packetLengths) {
    return _isochronousTransferOut( endpointNumber, data, packetLengths );
  }

  @JsMethod(
      name = "isochronousTransferOut"
  )
  @JsNonNull
  private native Promise<USBIsochronousOutTransferResult> _isochronousTransferOut(
      short endpointNumber, @Nonnull BufferSource data, @Nonnull double[] packetLengths);

  @JsNonNull
  public native Promise<Void> open();

  @JsNonNull
  public native Promise<Void> releaseInterface(short interfaceNumber);

  @JsNonNull
  public native Promise<Void> reset();

  @JsNonNull
  public native Promise<Void> selectAlternateInterface(short interfaceNumber,
      short alternateSetting);

  @JsNonNull
  public native Promise<Void> selectConfiguration(short configurationValue);

  @JsNonNull
  public native Promise<USBInTransferResult> transferIn(short endpointNumber, int length);

  @JsNonNull
  public native Promise<USBOutTransferResult> transferOut(short endpointNumber,
      @Nonnull BufferSource data);
}
