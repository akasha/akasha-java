package akasha;

import akasha.core.BufferSource;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioData"
)
public class AudioData extends JsObject {
  public AudioData(@Nonnull final AudioDataInit init) {
  }

  @JsProperty(
      name = "duration"
  )
  public native int duration();

  @JsProperty(
      name = "format"
  )
  @Nonnull
  @AudioSampleFormat
  public native String format();

  @JsProperty(
      name = "numberOfChannels"
  )
  public native int numberOfChannels();

  @JsProperty(
      name = "numberOfFrames"
  )
  public native int numberOfFrames();

  @JsProperty(
      name = "sampleRate"
  )
  public native float sampleRate();

  @JsProperty(
      name = "timestamp"
  )
  public native int timestamp();

  public native int allocationSize(@Nonnull AudioDataCopyToOptions options);

  @JsMethod(
      name = "clone"
  )
  @Nonnull
  public native AudioData clone_();

  public native void close();

  public native void copyTo(@Nonnull BufferSource destination,
      @Nonnull AudioDataCopyToOptions options);
}
