package akasha;

import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VideoDecoder"
)
public class VideoDecoder extends JsObject {
  public VideoDecoder(@Nonnull final VideoDecoderInit init) {
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
  public static native Promise<VideoDecoderSupport> isConfigSupported(
      @Nonnull VideoDecoderConfig config);

  public native void close();

  public native void configure(@Nonnull VideoDecoderConfig config);

  public native void decode(@Nonnull EncodedVideoChunk chunk);

  @JsNonNull
  public native Promise<Void> flush();

  public native void reset();
}
