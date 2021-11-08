package akasha.codecs;

import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AudioDecoder interface of the WebCodecs API decodes chunks of audio.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioDecoder">AudioDecoder - MDN</a>
 * @see <a href="https://w3c.github.io/webcodecs/#audiodecoder-interface"># audiodecoder-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioDecoder"
)
public class AudioDecoder extends JsObject {
  public AudioDecoder(@Nonnull final AudioDecoderInit init) {
  }

  @JsProperty(
      name = "decodeQueueSize"
  )
  public native int decodeQueueSize();

  @JsProperty(
      name = "state"
  )
  @Nonnull
  @CodecState
  public native String state();

  @JsNonNull
  public static native Promise<AudioDecoderSupport> isConfigSupported(
      @Nonnull AudioDecoderConfig config);

  public native void close();

  public native void configure(@Nonnull AudioDecoderConfig config);

  public native void decode(@Nonnull EncodedAudioChunk chunk);

  @JsNonNull
  public native Promise<Void> flush();

  public native void reset();
}
