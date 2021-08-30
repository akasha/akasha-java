package akasha;

import akasha.core.ArrayBufferView;
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
    name = "ReadableStreamBYOBReader"
)
public class ReadableStreamBYOBReader extends JsObject implements ReadableStreamReader {
  public ReadableStreamBYOBReader(@Nonnull final ReadableStream stream) {
  }

  @JsProperty(
      name = "closed"
  )
  @Nonnull
  public native Promise<Void> closed();

  @JsNonNull
  public native Promise<ReadableStreamBYOBReadResult> read(@Nonnull ArrayBufferView view);

  public native void releaseLock();

  @JsNonNull
  public native Promise<Void> cancel(@DoNotAutobox @Nullable Object reason);

  @JsNonNull
  public native Promise<Void> cancel();
}
