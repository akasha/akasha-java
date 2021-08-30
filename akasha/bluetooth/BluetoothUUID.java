package akasha.bluetooth;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothUUID"
)
public class BluetoothUUID extends JsObject {
  protected BluetoothUUID() {
  }

  @JsNonNull
  public static native String canonicalUUID(int alias);

  @JsNonNull
  public static native String getCharacteristic(@Nonnull String name);

  @JsNonNull
  public static native String getCharacteristic(int name);

  @JsNonNull
  public static native String getDescriptor(@Nonnull String name);

  @JsNonNull
  public static native String getDescriptor(int name);

  @JsNonNull
  public static native String getService(@Nonnull String name);

  @JsNonNull
  public static native String getService(int name);
}
