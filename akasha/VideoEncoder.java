package akasha;

import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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

  @Nonnull
  public static native Promise<Boolean> isConfigSupported(@Nonnull VideoEncoderConfig config);

  public native void close();

  public native void configure(@Nonnull VideoEncoderConfig config);

  public native void encode(@Nonnull VideoFrame frame, @Nonnull VideoEncoderEncodeOptions options);

  public native void encode(@Nonnull VideoFrame frame);

  @Nonnull
  public native Promise<Void> flush();

  public native void reset();
}
