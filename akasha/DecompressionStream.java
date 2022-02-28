package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DecompressionStream interface of the Compression Streams API is an API for decompressing a stream of data.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DecompressionStream">DecompressionStream - MDN</a>
 * @see <a href="https://wicg.github.io/compression/#decompression-stream"># decompression-stream</a>
 */
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
