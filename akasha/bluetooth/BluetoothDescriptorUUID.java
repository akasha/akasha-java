package akasha.bluetooth;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothDescriptorUUID"
)
public interface BluetoothDescriptorUUID {
  @JsOverlay
  @Nonnull
  static BluetoothDescriptorUUID of(@Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BluetoothDescriptorUUID of(final int value) {
    return Js.cast( value );
  }
}
