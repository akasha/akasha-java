package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CompressionStream interface of the Compression Streams API is an API for compressing a stream of data.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CompressionStream">CompressionStream - MDN</a>
 * @see <a href="https://wicg.github.io/compression/#compression-stream"># compression-stream</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CompressionStream"
)
public class CompressionStream extends JsObject {
  public CompressionStream(@Nonnull final String format) {
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
