package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DecompressionStream"
)
public class DecompressionStream extends JsObject {
  public DecompressionStream(@Nonnull final String format) {
  }

  @JsProperty(
      name = "readable"
  )
  @Nonnull
  public native ReadableStream readable();

  @JsProperty(
      name = "writable"
  )
  @Nonnull
  public native WritableStream writable();
}
