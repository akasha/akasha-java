package akasha.bluetooth;

import akasha.core.BufferSource;
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
    name = "BluetoothServiceDataFilterInit"
)
public interface BluetoothServiceDataFilterInit extends BluetoothDataFilterInit {
  @JsOverlay
  @Nonnull
  static Builder service(@Nonnull final BluetoothServiceUUID service) {
    final Builder $bluetoothServiceDataFilterInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $bluetoothServiceDataFilterInit.setService( service );
    return Js.uncheckedCast( $bluetoothServiceDataFilterInit );
  }

  @JsOverlay
  @Nonnull
  static Builder service(@Nonnull final String service) {
    final Builder $bluetoothServiceDataFilterInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $bluetoothServiceDataFilterInit.setService( service );
    return Js.uncheckedCast( $bluetoothServiceDataFilterInit );
  }

  @JsOverlay
  @Nonnull
  static Builder service(final int service) {
    final Builder $bluetoothServiceDataFilterInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $bluetoothServiceDataFilterInit.setService( service );
    return Js.uncheckedCast( $bluetoothServiceDataFilterInit );
  }

  @JsProperty(
      name = "service"
  )
  @JsNonNull
  BluetoothServiceUUID service();

  @JsProperty
  void setService(@JsNonNull BluetoothServiceUUID service);

  @JsOverlay
  default void setService(@Nonnull final String service) {
    setService( BluetoothServiceUUID.of( service ) );
  }

  @JsOverlay
  default void setService(final int service) {
    setService( BluetoothServiceUUID.of( service ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "BluetoothServiceDataFilterInit"
  )
  interface Builder extends BluetoothServiceDataFilterInit {
    @JsOverlay
    @Nonnull
    default Builder dataPrefix(@Nonnull final BufferSource dataPrefix) {
      setDataPrefix( dataPrefix );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mask(@Nonnull final BufferSource mask) {
      setMask( mask );
      return this;
    }
  }
}
