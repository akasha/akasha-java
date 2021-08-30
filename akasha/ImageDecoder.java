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

  @JsNonNull
  public static native Promise<Boolean> isTypeSupported(@Nonnull String type);

  public native void close();

  @JsNonNull
  public native Promise<ImageDecodeResult> decode(@Nonnull ImageDecodeOptions options);

  @JsNonNull
  public native Promise<ImageDecodeResult> decode();

  public native void reset();
}
