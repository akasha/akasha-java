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
 * The AudioEncoder interface of the WebCodecs API encodes AudioData objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioEncoder">AudioEncoder - MDN</a>
 * @see <a href="https://w3c.github.io/webcodecs/#audioencoder-interface"># audioencoder-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioEncoder"
)
public class AudioEncoder extends JsObject {
  public AudioEncoder(@Nonnull final AudioEncoderInit init) {
  }

  @JsProperty(
      name = "encodeQueueSize"
  )
  public native int encodeQueueSize();

  @JsProperty(
      name = "state"
  )
  @Nonnull
  @CodecState
  public native String state();

  @JsNonNull
  public static native Promise<AudioEncoderSupport> isConfigSupported(
      @Nonnull AudioEncoderConfig config);

  public native void close();

  public native void configure(@Nonnull AudioEncoderConfig config);

  public native void encode(@Nonnull AudioData data);

  @JsNonNull
  public native Promise<Void> flush();

  public native void reset();
}
