package akasha;

import akasha.core.BufferSource;
import akasha.core.JsObject;
import akasha.gl.TexImageSource;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VideoFrame"
)
public class VideoFrame extends JsObject implements TexImageSource {
  public VideoFrame(@Nonnull final CanvasImageSource image, @Nonnull final VideoFrameInit init) {
  }

  public VideoFrame(@Nonnull final CanvasImageSource image) {
  }

  public VideoFrame(@Nonnull final JsArray<PlaneInit> planes,
      @Nonnull final VideoFramePlaneInit init) {
  }

  public VideoFrame(@Nonnull final PlaneInit[] planes, @Nonnull final VideoFramePlaneInit init) {
  }

  @JsProperty(
      name = "codedHeight"
  )
  public native int codedHeight();

  @JsProperty(
      name = "codedRect"
  )
  @Nonnull
  public native VideoFrameRect codedRect();

  @JsProperty(
      name = "codedWidth"
  )
  public native int codedWidth();

  @JsProperty(
      name = "displayHeight"
  )
  public native int displayHeight();

  @JsProperty(
      name = "displayWidth"
  )
  public native int displayWidth();

  @JsProperty(
      name = "duration"
  )
  @Nullable
  public native Double duration();

  @JsProperty(
      name = "format"
  )
  @Nonnull
  @PixelFormat
  public native String format();

  @JsProperty(
      name = "timestamp"
  )
  @Nullable
  public native Double timestamp();

  @JsProperty(
      name = "visibleRect"
  )
  @Nonnull
  public native VideoFrameRect visibleRect();

  public native int allocationSize(@Nonnull VideoFrameCopyToOptions options);

  public native int allocationSize();

  @JsMethod(
      name = "clone"
  )
  @JsNonNull
  public native VideoFrame clone_();

  public native void close();

  @JsNonNull
  public native Promise<JsArray<PlaneLayout>> copyTo(@Nonnull BufferSource destination,
      @Nonnull VideoFrameCopyToOptions options);

  @JsNonNull
  public native Promise<JsArray<PlaneLayout>> copyTo(@Nonnull BufferSource destination);
}
