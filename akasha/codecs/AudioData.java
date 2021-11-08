package akasha.codecs;

import akasha.Transferable;
import akasha.core.BufferSource;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AudioData interface of the WebCodecs API represents an audio sample.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioData">AudioData - MDN</a>
 * @see <a href="https://w3c.github.io/webcodecs/#audiodata-interface"># audiodata-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioData"
)
public class AudioData extends JsObject implements Transferable {
  public AudioData(@Nonnull final AudioDataInit init) {
  }

  @JsProperty(
      name = "duration"
  )
  public native int duration();

  @JsProperty(
      name = "format"
  )
  @Nullable
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
  @JsNonNull
  public native AudioData clone_();

  public native void close();

  public native void copyTo(@Nonnull BufferSource destination,
      @Nonnull AudioDataCopyToOptions options);
}
