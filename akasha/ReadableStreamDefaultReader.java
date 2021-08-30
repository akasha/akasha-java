package akasha;

import akasha.core.JsObject;
import akasha.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ReadableStreamDefaultReader"
)
public class ReadableStreamDefaultReader extends JsObject implements ReadableStreamReader {
  public ReadableStreamDefaultReader(@Nonnull final ReadableStream stream) {
  }

  @JsProperty(
      name = "closed"
  )
  @Nonnull
  public native Promise<Void> closed();

  @JsNonNull
  public native Promise<ReadableStreamDefaultReadResult> read();

  public native void releaseLock();

  @JsNonNull
  public native Promise<Void> cancel(@DoNotAutobox @Nullable Object reason);

  @JsNonNull
  public native Promise<Void> cancel();
}
