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
 * The ImageDecoder interface of the WebCodecs API provides a way to unpack and decode encoded image data.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageDecoder">ImageDecoder - MDN</a>
 * @see <a href="https://w3c.github.io/webcodecs/#imagedecoder-interface"># imagedecoder-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ImageDecoder"
)
public class ImageDecoder extends JsObject {
  public ImageDecoder(@Nonnull final ImageDecoderInit init) {
  }

  @JsProperty(
      name = "complete"
  )
  public native boolean complete();

  @JsProperty(
      name = "completed"
  )
  @Nonnull
  public native Promise<Void> completed();

  @JsProperty(
      name = "tracks"
  )
  @Nonnull
  public native ImageTrackList tracks();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  @JsNonNull
  public static native Promise<Boolean> isTypeSupported(@Nonnull String type);

  public native void close();

  @JsNonNull
  public native Promise<ImageDecodeResult> decode(@Nonnull ImageDecodeOptions options);

  @JsNonNull
  public native Promise<ImageDecodeResult> decode();

  public native void reset();
}
