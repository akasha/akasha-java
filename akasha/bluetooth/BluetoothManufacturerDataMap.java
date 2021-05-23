package akasha.bluetooth;

import akasha.core.DataView;
import akasha.core.JsObject;
import akasha.lang.JsArray;
import akasha.lang.JsIterable;
import akasha.lang.JsIterator;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothManufacturerDataMap"
)
public class BluetoothManufacturerDataMap extends JsObject implements JsIterable<BluetoothManufacturerDataMap.Entry> {
  protected BluetoothManufacturerDataMap() {
  }

  @JsProperty(
      name = "size"
  )
  public native int size();

  @HasNoSideEffects
  public native boolean has(int key);

  @HasNoSideEffects
  @Nullable
  public native DataView get(int key);

  @HasNoSideEffects
  @Nonnull
  public native JsIterator<Double> keys();

  @HasNoSideEffects
  @Nonnull
  public native JsIterator<DataView> values();

  @HasNoSideEffects
  @Nonnull
  public native JsIterator<Entry> entries();

  public native void forEach(@Nonnull ForEachCallback callback);

  public native void forEach(@Nonnull ForEachCallback2 callback);

  public native void forEach(@Nonnull ForEachCallback3 callback);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Array"
  )
  public static final class Entry extends JsArray<Object> {
    @JsOverlay
    public int key() {
      return getAtAsAny( 0 ).asInt();
    }

    @JsOverlay
    @Nonnull
    public DataView value() {
      return getAtAsAny( 1 ).cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@Nonnull DataView value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@Nonnull DataView value, int key);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@Nonnull DataView value, int key, @Nonnull BluetoothManufacturerDataMap map);
  }
}
