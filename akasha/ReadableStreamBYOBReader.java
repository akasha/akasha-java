package akasha;

import akasha.core.ArrayBufferView;
import akasha.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ReadableStreamBYOBReader"
)
public class ReadableStreamBYOBReader {
  public ReadableStreamBYOBReader(@Nonnull final ReadableStream stream) {
  }

  @JsProperty(
      name = "closed"
  )
  @Nonnull
  public native Promise<Void> closed();

  @Nonnull
  public native Promise<ReadableStreamBYOBReadResult> read(@Nonnull ArrayBufferView view);

  public native void releaseLock();

  @Nonnull
  public native Promise<Void> cancel(@DoNotAutobox @Nullable Object reason);

  @Nonnull
  public native Promise<Void> cancel();
}
