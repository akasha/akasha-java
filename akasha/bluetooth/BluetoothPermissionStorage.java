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
    name = "BluetoothPermissionStorage"
)
public interface BluetoothPermissionStorage {
  @JsOverlay
  @Nonnull
  static BluetoothPermissionStorage allowedDevices(
      @Nonnull final JsArray<AllowedBluetoothDevice> allowedDevices) {
    final BluetoothPermissionStorage $bluetoothPermissionStorage = Js.<BluetoothPermissionStorage>uncheckedCast( JsPropertyMap.of() );
    $bluetoothPermissionStorage.setAllowedDevices( allowedDevices );
    return Js.uncheckedCast( $bluetoothPermissionStorage );
  }

  @JsOverlay
  @Nonnull
  static BluetoothPermissionStorage allowedDevices(
      @Nonnull final AllowedBluetoothDevice... allowedDevices) {
    final BluetoothPermissionStorage $bluetoothPermissionStorage = Js.<BluetoothPermissionStorage>uncheckedCast( JsPropertyMap.of() );
    $bluetoothPermissionStorage.setAllowedDevices( allowedDevices );
    return Js.uncheckedCast( $bluetoothPermissionStorage );
  }

  @JsProperty(
      name = "allowedDevices"
  )
  @JsNonNull
  JsArray<AllowedBluetoothDevice> allowedDevices();

  @JsProperty
  void setAllowedDevices(@JsNonNull JsArray<AllowedBluetoothDevice> allowedDevices);

  @JsOverlay
  default void setAllowedDevices(@Nonnull final AllowedBluetoothDevice... allowedDevices) {
    setAllowedDevices( Js.<JsArray<AllowedBluetoothDevice>>uncheckedCast( allowedDevices ) );
  }
}
