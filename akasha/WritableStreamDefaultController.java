package akasha;

import akasha.core.JsObject;
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
    name = "WritableStreamDefaultController"
)
public class WritableStreamDefaultController extends JsObject {
  protected WritableStreamDefaultController() {
  }

  @JsProperty(
      name = "signal"
  )
  @Nonnull
  public native AbortSignal signal();

  public native void error(@DoNotAutobox @Nullable Object e);

  public native void error();
}
