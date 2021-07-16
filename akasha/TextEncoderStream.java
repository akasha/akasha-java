package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TextEncoderStream interface of the Encoding API converts a stream of strings into bytes in the UTF-8 encoding. It is the streaming equivalent of TextEncoder.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextEncoderStream">TextEncoderStream - MDN</a>
 * @see <a href="https://encoding.spec.whatwg.org/#interface-textencoderstream"># interface-textencoderstream</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextEncoderStream"
)
public class TextEncoderStream extends JsObject {
  public TextEncoderStream() {
  }

  @JsProperty(
      name = "encoding"
  )
  @Nonnull
  public native String encoding();

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
