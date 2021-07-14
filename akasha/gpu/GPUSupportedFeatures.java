package akasha.gpu;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import akasha.lang.JsIterator;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUSupportedFeatures"
)
public class GPUSupportedFeatures extends JsObject {
  protected GPUSupportedFeatures() {
  }

  @JsProperty(
      name = "size"
  )
  public native int size();

  @HasNoSideEffects
  public native boolean has(@Nonnull String value);

  @HasNoSideEffects
  @Nonnull
  public native JsIterator<String> keys();

  @HasNoSideEffects
  @Nonnull
  public native JsIterator<String> values();

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
    @Nonnull
    public String key() {
      return getAtAsAny( 0 ).asString();
    }

    @JsOverlay
    @Nonnull
    public String value() {
      return getAtAsAny( 1 ).asString();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@Nonnull String value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@Nonnull String value, @Nonnull String value2);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@Nonnull String value, @Nonnull String value2, @Nonnull GPUSupportedFeatures set);
  }
}
