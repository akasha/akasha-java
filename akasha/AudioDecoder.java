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

  @Nonnull
  public static native Promise<AudioDecoderSupport> isConfigSupported(
      @Nonnull AudioDecoderConfig config);

  public native void close();

  public native void configure(@Nonnull AudioDecoderConfig config);

  public native void decode(@Nonnull EncodedAudioChunk chunk);

  @Nonnull
  public native Promise<Void> flush();

  public native void reset();
}
