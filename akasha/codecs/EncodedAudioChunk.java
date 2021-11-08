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
 * The EncodedAudioChunk interface of the WebCodecs API represents a chunk of encoded audio data.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EncodedAudioChunk">EncodedAudioChunk - MDN</a>
 * @see <a href="https://w3c.github.io/webcodecs/#encodedaudiochunk-interface"># encodedaudiochunk-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EncodedAudioChunk"
)
public class EncodedAudioChunk extends JsObject {
  public EncodedAudioChunk(@Nonnull final EncodedAudioChunkInit init) {
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
  @EncodedAudioChunkType
  public native String type();

  public native void copyTo(@Nonnull BufferSource destination);
}
