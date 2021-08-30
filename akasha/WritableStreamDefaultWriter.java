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
    name = "WritableStreamDefaultWriter"
)
public class WritableStreamDefaultWriter extends JsObject {
  public WritableStreamDefaultWriter(@Nonnull final WritableStream stream) {
  }

  @JsProperty(
      name = "closed"
  )
  @Nonnull
  public native Promise<Void> closed();

  @JsProperty(
      name = "desiredSize"
  )
  @Nullable
  public native Double desiredSize();

  @JsProperty(
      name = "ready"
  )
  @Nonnull
  public native Promise<Void> ready();

  @JsNonNull
  public native Promise<Void> abort(@DoNotAutobox @Nullable Object reason);

  @JsNonNull
  public native Promise<Void> abort();

  @JsNonNull
  public native Promise<Void> close();

  public native void releaseLock();

  @JsNonNull
  public native Promise<Void> write(@DoNotAutobox @Nullable Object chunk);

  @JsNonNull
  public native Promise<Void> write();
}
