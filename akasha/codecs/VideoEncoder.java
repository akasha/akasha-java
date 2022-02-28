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
 * The VideoEncoder interface of the WebCodecs API encodes VideoFrame objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoEncoder">VideoEncoder - MDN</a>
 * @see <a href="https://w3c.github.io/webcodecs/#videoencoder-interface"># videoencoder-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VideoEncoder"
)
public class VideoEncoder extends JsObject {
  public VideoEncoder(@Nonnull final VideoEncoderInit init) {
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
  public static native Promise<VideoEncoderSupport> isConfigSupported(
      @Nonnull VideoEncoderConfig config);

  public native void close();

  public native void configure(@Nonnull VideoEncoderConfig config);

  public native void encode(@Nonnull VideoFrame frame, @Nonnull VideoEncoderEncodeOptions options);

  public native void encode(@Nonnull VideoFrame frame);

  @JsNonNull
  public native Promise<Void> flush();

  public native void reset();
}
