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

  @Nonnull
  public static native Promise<AudioEncoderSupport> isConfigSupported(
      @Nonnull AudioEncoderConfig config);

  public native void close();

  public native void configure(@Nonnull AudioEncoderConfig config);

  public native void encode(@Nonnull AudioData data);

  @Nonnull
  public native Promise<Void> flush();

  public native void reset();
}
