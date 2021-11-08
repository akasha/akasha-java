package akasha.codecs;

import akasha.core.BufferSource;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The EncodedVideoChunk interface of the WebCodecs API represents a chunk of encoded video data.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EncodedVideoChunk">EncodedVideoChunk - MDN</a>
 * @see <a href="https://w3c.github.io/webcodecs/#encodedvideochunk-interface"># encodedvideochunk-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EncodedVideoChunk"
)
public class EncodedVideoChunk extends JsObject {
  public EncodedVideoChunk(@Nonnull final EncodedVideoChunkInit init) {
  }

  @JsProperty(
      name = "byteLength"
  )
  public native int byteLength();

  @JsProperty(
      name = "duration"
  )
  @Nullable
  public native Double duration();

  @JsProperty(
      name = "timestamp"
  )
  public native int timestamp();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  @EncodedVideoChunkType
  public native String type();

  public native void copyTo(@Nonnull BufferSource destination);
}
