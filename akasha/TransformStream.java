package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TransformStream interface of the Streams API represents a set of transformable data.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TransformStream">TransformStream - MDN</a>
 * @see <a href="https://streams.spec.whatwg.org/#ts-class">(Streams) # ts-class</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TransformStream"
)
public class TransformStream extends JsObject implements Transferable {
  public TransformStream(@Nonnull final JsObject transformer,
      @Nonnull final QueuingStrategy writableStrategy,
      @Nonnull final QueuingStrategy readableStrategy) {
  }

  public TransformStream(@Nonnull final JsObject transformer,
      @Nonnull final QueuingStrategy writableStrategy) {
  }

  public TransformStream(@Nonnull final JsObject transformer) {
  }

  public TransformStream() {
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
