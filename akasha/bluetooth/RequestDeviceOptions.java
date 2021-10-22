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
    name = "RequestDeviceOptions"
)
public interface RequestDeviceOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "acceptAllDevices"
  )
  boolean acceptAllDevices();

  @JsProperty
  void setAcceptAllDevices(boolean acceptAllDevices);

  @JsProperty(
      name = "filters"
  )
  JsArray<BluetoothLEScanFilterInit> filters();

  @JsProperty
  void setFilters(@JsNonNull JsArray<BluetoothLEScanFilterInit> filters);

  @JsOverlay
  default void setFilters(@Nonnull final BluetoothLEScanFilterInit... filters) {
    setFilters( Js.<JsArray<BluetoothLEScanFilterInit>>uncheckedCast( filters ) );
  }

  @JsProperty(
      name = "optionalManufacturerData"
  )
  JsArray<Double> optionalManufacturerData();

  @JsProperty
  void setOptionalManufacturerData(@JsNonNull JsArray<Double> optionalManufacturerData);

  @JsOverlay
  default void setOptionalManufacturerData(@Nonnull final double... optionalManufacturerData) {
    setOptionalManufacturerData( Js.<JsArray<Double>>uncheckedCast( optionalManufacturerData ) );
  }

  @JsProperty(
      name = "optionalServices"
  )
  JsArray<BluetoothServiceUUID> optionalServices();

  @JsProperty
  void setOptionalServices(@JsNonNull JsArray<BluetoothServiceUUID> optionalServices);

  @JsOverlay
  default void setOptionalServices(@Nonnull final BluetoothServiceUUID... optionalServices) {
    setOptionalServices( Js.<JsArray<BluetoothServiceUUID>>uncheckedCast( optionalServices ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RequestDeviceOptions"
  )
  interface Builder extends RequestDeviceOptions {
    @JsOverlay
    @Nonnull
    default Builder acceptAllDevices(final boolean acceptAllDevices) {
      setAcceptAllDevices( acceptAllDevices );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder filters(@Nonnull final JsArray<BluetoothLEScanFilterInit> filters) {
      setFilters( filters );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder filters(@Nonnull final BluetoothLEScanFilterInit... filters) {
      setFilters( filters );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder optionalManufacturerData(
        @Nonnull final JsArray<Double> optionalManufacturerData) {
      setOptionalManufacturerData( optionalManufacturerData );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder optionalManufacturerData(@Nonnull final double... optionalManufacturerData) {
      setOptionalManufacturerData( optionalManufacturerData );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder optionalServices(
        @Nonnull final JsArray<BluetoothServiceUUID> optionalServices) {
      setOptionalServices( optionalServices );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder optionalServices(@Nonnull final BluetoothServiceUUID... optionalServices) {
      setOptionalServices( optionalServices );
      return this;
    }
  }
}
