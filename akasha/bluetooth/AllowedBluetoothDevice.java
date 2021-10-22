package akasha.bluetooth;

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
    name = "AllowedBluetoothDevice"
)
public interface AllowedBluetoothDevice {
  @JsOverlay
  @Nonnull
  static Step1 deviceId(@Nonnull final String deviceId) {
    final AllowedBluetoothDevice $allowedBluetoothDevice = Js.<AllowedBluetoothDevice>uncheckedCast( JsPropertyMap.of() );
    $allowedBluetoothDevice.setDeviceId( deviceId );
    return Js.uncheckedCast( $allowedBluetoothDevice );
  }

  @JsProperty(
      name = "deviceId"
  )
  @JsNonNull
  String deviceId();

  @JsProperty
  void setDeviceId(@JsNonNull String deviceId);

  @JsProperty(
      name = "mayUseGATT"
  )
  boolean mayUseGATT();

  @JsProperty
  void setMayUseGATT(boolean mayUseGATT);

  @JsProperty(
      name = "allowedServices"
  )
  @JsNonNull
  StringOrUUIDArrayUnion allowedServices();

  @JsProperty
  void setAllowedServices(@JsNonNull StringOrUUIDArrayUnion allowedServices);

  @JsOverlay
  default void setAllowedServices(@Nonnull final String allowedServices) {
    setAllowedServices( StringOrUUIDArrayUnion.of( allowedServices ) );
  }

  @JsOverlay
  default void setAllowedServices(@Nonnull final JsArray<String> allowedServices) {
    setAllowedServices( StringOrUUIDArrayUnion.of( allowedServices ) );
  }

  @JsOverlay
  default void setAllowedServices(@Nonnull final String... allowedServices) {
    setAllowedServices( StringOrUUIDArrayUnion.of( allowedServices ) );
  }

  @JsProperty(
      name = "allowedManufacturerData"
  )
  @JsNonNull
  JsArray<Double> allowedManufacturerData();

  @JsProperty
  void setAllowedManufacturerData(@JsNonNull JsArray<Double> allowedManufacturerData);

  @JsOverlay
  default void setAllowedManufacturerData(@Nonnull final double... allowedManufacturerData) {
    setAllowedManufacturerData( Js.<JsArray<Double>>uncheckedCast( allowedManufacturerData ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AllowedBluetoothDevice"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 mayUseGATT(boolean mayUseGATT) {
      Js.<AllowedBluetoothDevice>uncheckedCast( this ).setMayUseGATT( mayUseGATT );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AllowedBluetoothDevice"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 allowedServices(@Nonnull StringOrUUIDArrayUnion allowedServices) {
      Js.<AllowedBluetoothDevice>uncheckedCast( this ).setAllowedServices( allowedServices );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step3 allowedServices(@Nonnull String allowedServices) {
      Js.<AllowedBluetoothDevice>uncheckedCast( this ).setAllowedServices( allowedServices );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step3 allowedServices(@Nonnull JsArray<String> allowedServices) {
      Js.<AllowedBluetoothDevice>uncheckedCast( this ).setAllowedServices( allowedServices );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Step3 allowedServices(@Nonnull String... allowedServices) {
      Js.<AllowedBluetoothDevice>uncheckedCast( this ).setAllowedServices( allowedServices );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AllowedBluetoothDevice"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default AllowedBluetoothDevice allowedManufacturerData(
        @Nonnull JsArray<Double> allowedManufacturerData) {
      Js.<AllowedBluetoothDevice>uncheckedCast( this ).setAllowedManufacturerData( allowedManufacturerData );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default AllowedBluetoothDevice allowedManufacturerData(
        @Nonnull double... allowedManufacturerData) {
      Js.<AllowedBluetoothDevice>uncheckedCast( this ).setAllowedManufacturerData( allowedManufacturerData );
      return Js.uncheckedCast( this );
    }
  }
}
