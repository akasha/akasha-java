package akasha.bluetooth;

import akasha.EventInit;
import akasha.StringOrUnsignedLongUnion;
import akasha.lang.JsArray;
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
    name = "Object"
)
public interface BluetoothAdvertisingEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final BluetoothDevice device) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).device( device );
  }

  @JsProperty(
      name = "appearance"
  )
  int appearance();

  @JsProperty
  void setAppearance(int appearance);

  @JsProperty(
      name = "device"
  )
  @Nonnull
  BluetoothDevice device();

  @JsProperty
  void setDevice(@Nonnull BluetoothDevice device);

  @JsProperty(
      name = "manufacturerData"
  )
  BluetoothManufacturerDataMap manufacturerData();

  @JsProperty
  void setManufacturerData(@Nonnull BluetoothManufacturerDataMap manufacturerData);

  @JsProperty(
      name = "name"
  )
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @JsProperty(
      name = "rssi"
  )
  byte rssi();

  @JsProperty
  void setRssi(byte rssi);

  @JsProperty(
      name = "serviceData"
  )
  BluetoothServiceDataMap serviceData();

  @JsProperty
  void setServiceData(@Nonnull BluetoothServiceDataMap serviceData);

  @JsProperty(
      name = "txPower"
  )
  byte txPower();

  @JsProperty
  void setTxPower(byte txPower);

  @JsProperty(
      name = "uuids"
  )
  JsArray<StringOrUnsignedLongUnion> uuids();

  @JsProperty
  void setUuids(@Nonnull JsArray<StringOrUnsignedLongUnion> uuids);

  @JsOverlay
  default void setUuids(@Nonnull final StringOrUnsignedLongUnion... uuids) {
    setUuids( Js.<JsArray<StringOrUnsignedLongUnion>>uncheckedCast( uuids ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends BluetoothAdvertisingEventInit {
    @JsOverlay
    @Nonnull
    default Builder appearance(final int appearance) {
      setAppearance( appearance );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder device(@Nonnull final BluetoothDevice device) {
      setDevice( device );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder manufacturerData(@Nonnull final BluetoothManufacturerDataMap manufacturerData) {
      setManufacturerData( manufacturerData );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder name(@Nonnull final String name) {
      setName( name );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rssi(final byte rssi) {
      setRssi( rssi );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder serviceData(@Nonnull final BluetoothServiceDataMap serviceData) {
      setServiceData( serviceData );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder txPower(final byte txPower) {
      setTxPower( txPower );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder uuids(@Nonnull final JsArray<StringOrUnsignedLongUnion> uuids) {
      setUuids( uuids );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder uuids(@Nonnull final StringOrUnsignedLongUnion... uuids) {
      setUuids( uuids );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
