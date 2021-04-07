package akasha.bluetooth;

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
public interface BluetoothPermissionStorage {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<AllowedBluetoothDevice> allowedDevices) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).allowedDevices( allowedDevices );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final AllowedBluetoothDevice[] allowedDevices) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).allowedDevices( allowedDevices );
  }

  @JsProperty(
      name = "allowedDevices"
  )
  @Nonnull
  JsArray<AllowedBluetoothDevice> allowedDevices();

  @JsProperty
  void setAllowedDevices(@Nonnull JsArray<AllowedBluetoothDevice> allowedDevices);

  @JsOverlay
  default void setAllowedDevices(@Nonnull final AllowedBluetoothDevice... allowedDevices) {
    setAllowedDevices( Js.<JsArray<AllowedBluetoothDevice>>uncheckedCast( allowedDevices ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends BluetoothPermissionStorage {
    @JsOverlay
    @Nonnull
    default Builder allowedDevices(@Nonnull final JsArray<AllowedBluetoothDevice> allowedDevices) {
      setAllowedDevices( allowedDevices );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder allowedDevices(@Nonnull final AllowedBluetoothDevice... allowedDevices) {
      setAllowedDevices( allowedDevices );
      return this;
    }
  }
}
