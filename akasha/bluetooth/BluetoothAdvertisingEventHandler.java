package akasha.bluetooth;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type BluetoothAdvertisingEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface BluetoothAdvertisingEventHandler {
  void onInvoke(@Nonnull BluetoothAdvertisingEvent event);
}
